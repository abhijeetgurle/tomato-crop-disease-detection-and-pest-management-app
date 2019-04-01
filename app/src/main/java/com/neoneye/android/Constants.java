package com.neoneye.android;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory.*;

/**
 * Created by samarjeet on 2/1/18.
 */

public class Constants {

    public static String BaseURL = "https://tomato-disease-analysis.herokuapp.com/";
    public static String serverloc = BaseURL + "upload_image_and_get_results/";
    public static String save_entry_loc = BaseURL + "save_entry";
    public static String update_crops = BaseURL + "update_crops";
    public static String get_entry = BaseURL + "get_crops";


    public static Float colors[] = {
            BitmapDescriptorFactory.HUE_ROSE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_MAGENTA, BitmapDescriptorFactory.HUE_ORANGE,
            BitmapDescriptorFactory.HUE_AZURE, BitmapDescriptorFactory.HUE_BLUE, BitmapDescriptorFactory.HUE_CYAN,
            BitmapDescriptorFactory.HUE_YELLOW, BitmapDescriptorFactory.HUE_VIOLET,
    };


}
