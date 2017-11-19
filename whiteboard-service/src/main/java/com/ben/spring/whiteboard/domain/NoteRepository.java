package com.ben.spring.whiteboard.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chuanben on 2017/11/18.
 */
public interface NoteRepository extends JpaRepository<Note, Long>{
}
