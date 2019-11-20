package com.utbm.lo54.adminwebapp.repository;

import com.utbm.lo54.adminwebapp.repository.http.HttpRepository;
import com.utbm.lo54.core.courses.domain.CourseSession;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseSessionRepository extends HttpRepository<CourseSession> {

}
