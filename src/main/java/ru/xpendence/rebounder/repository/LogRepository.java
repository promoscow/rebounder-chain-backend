package ru.xpendence.rebounder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.xpendence.rebounder.entity.Log;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 14.04.19
 * Time: 22:25
 * e-mail: 2262288@gmail.com
 */
@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
