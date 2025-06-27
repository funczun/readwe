package com.tact.readwe.announcement.repository;

import com.tact.readwe.announcement.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
