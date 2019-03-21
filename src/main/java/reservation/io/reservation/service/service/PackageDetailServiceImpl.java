package reservation.io.reservation.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reservation.io.reservation.service.domain.PackageDetail;
import reservation.io.reservation.service.repository.PackageRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageDetailServiceImpl implements PackageDetailService {
    @Autowired
    private PackageRepository repository;

    @Override
    public List<PackageDetail> findAll() {
        List<PackageDetail> packages = new ArrayList<>();
        repository.findAll().forEach(packages::add);
        return packages;
    }

    @Override
    public PackageDetail save(PackageDetail packageDetail) {
        return repository.save(packageDetail);
    }

    @Override
    public PackageDetail update(long id, PackageDetail packageDetail) {
        packageDetail.setId(id);
        return repository.save(packageDetail);
    }

    @Override
    public PackageDetail findById(long id) {
        return repository.findById(id).orElse(PackageDetail.emptyPackage());
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
