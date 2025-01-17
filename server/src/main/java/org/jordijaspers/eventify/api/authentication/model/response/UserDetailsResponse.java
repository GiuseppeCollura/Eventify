package org.jordijaspers.eventify.api.authentication.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.jordijaspers.eventify.api.team.model.response.TeamResponse;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * A response model for user details.
 */
@Data
@NoArgsConstructor
public class UserDetailsResponse {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private ZonedDateTime lastLogin;

    private ZonedDateTime created;

    private String authority;

    private List<TeamResponse> teams;

    private boolean enabled;

    private boolean validated;

}
