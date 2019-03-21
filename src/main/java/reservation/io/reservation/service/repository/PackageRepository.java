package reservation.io.reservation.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reservation.io.reservation.service.domain.PackageDetail;

@Repository
public interface PackageRepository extends CrudRepository<PackageDetail, Long> {
}
