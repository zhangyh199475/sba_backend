package com.ibm.apt.sba_back.Repository;

import com.ibm.apt.sba_back.domain.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Integer> {
}
