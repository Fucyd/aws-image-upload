package com.j2l.awsimageupload.datastore;

import com.j2l.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d41420dd-c1a5-4419-a324-3299cbfd7495"), "piotr", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("992f9bb9-6dcf-4c69-98a6-7f92284e7221"), "michalski", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
