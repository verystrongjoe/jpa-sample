package org.test.skeleton.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.test.skeleton.entity.Message;


//@Service
@PreAuthorize("denyAll")
//@Transactional
//@NoRepositoryBean
public interface MessageDao extends CrudRepository<Message, Long> {

    @PreAuthorize("authenticated")
    @Query("select m from Message m where m.toId.id = ?#{principal.id}")
    Iterable<Message> inbox();

    @PreAuthorize("authenticated")
    @Query("select m from Message m where m.fromId.id = ?#{principal.id}")
    Iterable<Message> sent();

    @PreAuthorize("authenticated")
    @PostAuthorize("hasPermission(returnObject,'read')")
    Message findOne(Long id);

    @PreAuthorize("authenticated")
    @PostAuthorize("#message?.fromId?.id == principal?.id && (!#oauth2.oAuth || #oauth2.hasScope('write'))")
    <S extends Message> S save(@P("message") S message);

    @PreAuthorize("authenticated")
    void delete(Long id);
}
