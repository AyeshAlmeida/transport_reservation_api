package reservation.io.reservation.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reservation.io.reservation.service.domain.PackageDetail;
import reservation.io.reservation.service.service.PackageDetailService;

import java.util.List;

@RestController
@RequestMapping(path = "/packages")
public class PackageDetailController {
    @Autowired
    private PackageDetailService packageDetailService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<PackageDetail> findAll() {
        return packageDetailService.findAll();
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public PackageDetail save(@RequestBody PackageDetail packageDetail) {
        return packageDetailService.save(packageDetail);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public PackageDetail findById(@PathVariable(name = "id") long id) {
        return packageDetailService.findById(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public PackageDetail updateById(@PathVariable(name = "id") long id, @RequestBody PackageDetail packageDetail) {
        return packageDetailService.update(packageDetail);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public PackageDetail delete(@PathVariable(name = "id") long id) {
        PackageDetail packageDetail = packageDetailService.findById(id);
        packageDetailService.deleteById(id);
        return packageDetail;
    }
}
