package e.brice.aswitch.Fragments;

import e.brice.aswitch.Notification.MyResponse;
import e.brice.aswitch.Notification.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content.Type:application/json",
            "Authorization:key=AAAAi3kaw34:APA91bHtPJPlEg-R9Hcmbm3zHbxpuwBDs1IKIvT1YAdsqLUNHtYLAamOl_RRzVdYlrmQbZwEleGo7Q9sWiFcJj7WWVWbVGMQabXPb-4pv2YdeXCZY8j9OuwoEgmx2loA9NKq1FGe4pmk"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
