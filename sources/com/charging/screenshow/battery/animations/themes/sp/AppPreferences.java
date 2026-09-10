package com.charging.screenshow.battery.animations.themes.sp;

import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/sp/AppPreferences;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppPreferences {
    public static int a() {
        return AppPreferencesUtil.a(AppPreferencesUtil.f13313a, AppExt.a()).getInt("charging_close_type", 2);
    }

    public static BaseMedia b() {
        String str = "";
        try {
            AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
            String string = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getString("current_charging_video_json", "");
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                return null;
            }
            if (AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getInt("charging_type", 2) == 0) {
                Gson gson = new Gson();
                String string2 = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getString("current_charging_video_json", "");
                if (string2 != null) {
                    str = string2;
                }
                return (BaseMedia) gson.c(str, ChargingVideo.class);
            }
            Gson gson2 = new Gson();
            String string3 = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getString("current_charging_video_json", "");
            if (string3 != null) {
                str = string3;
            }
            return (BaseMedia) gson2.c(str, Charging3D.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(int i2) {
        AppPreferencesUtil.f13313a.c("charging_show_duration", i2);
    }

    public static void d(BaseMedia baseMedia) {
        AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
        if (baseMedia == null) {
            appPreferencesUtil.c("charging_type", 0);
            AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putString("current_charging_video_name", "").apply();
            AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putString("current_charging_video_json", "").apply();
            return;
        }
        try {
            appPreferencesUtil.c("charging_type", !(baseMedia instanceof ChargingVideo) ? 1 : 0);
            String value = baseMedia.getName();
            Intrinsics.f(value, "value");
            AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putString("current_charging_video_name", value).apply();
            String value2 = new Gson().g(baseMedia);
            Intrinsics.f(value2, "value");
            AppPreferencesUtil.d(appPreferencesUtil, AppExt.a()).putString("current_charging_video_json", value2).apply();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
