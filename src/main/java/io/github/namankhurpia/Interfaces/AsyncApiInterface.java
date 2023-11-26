package io.github.namankhurpia.Interfaces;

import io.github.namankhurpia.Pojo.Moderations.ModerationAPIRequest;
import io.github.namankhurpia.Pojo.Moderations.ModerationAPIResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public interface AsyncApiInterface {

    //Moderation API to classify the input text
    ModerationAPIResponse getASyncmoderation(@Header("Authorization")String accessToken, @Body ModerationAPIRequest request) throws IOException, ExecutionException, InterruptedException;


}
