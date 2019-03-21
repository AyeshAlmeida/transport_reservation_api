package reservation.io.reservation.service.service;

import reservation.io.reservation.service.domain.PackageDetail;

import java.util.List;

public interface PackageDetailService {
    List<PackageDetail> findAll();
    PackageDetail save(PackageDetail packageDetail);
    PackageDetail update(long id, PackageDetail packageDetail);
    PackageDetail findById(long id);
    void deleteById(long id);
}
