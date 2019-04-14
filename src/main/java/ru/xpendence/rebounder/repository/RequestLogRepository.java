package ru.xpendence.rebounder.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.xpendence.rebounder.entity.RequestLog;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 14.04.19
 * Time: 22:12
 * e-mail: 2262288@gmail.com
 */
@RepositoryRestResource(collectionResourceRel = "request", path = "request")
public interface RequestLogRepository extends PagingAndSortingRepository<RequestLog, Long> {
}
