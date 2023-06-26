package peaksoft.service;

import peaksoft.dto.request.UserRequest;
import peaksoft.dto.response.SimpleResponse;

public interface CommentService {
    SimpleResponse saveUser(UserRequest userRequest);

}
