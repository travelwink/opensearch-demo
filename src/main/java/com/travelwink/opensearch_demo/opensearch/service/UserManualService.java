package com.travelwink.opensearch_demo.opensearch.service;

import com.travelwink.opensearch_demo.opensearch.entity.UserManual;

import java.util.List;

public interface UserManualService {
    UserManual addEntity(UserManual userManual);
    List<UserManual> findByText(String keyword);
}
