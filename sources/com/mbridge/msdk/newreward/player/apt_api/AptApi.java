package com.mbridge.msdk.newreward.player.apt_api;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public class AptApi {
    public static void bind(Activity activity) {
        try {
            Class.forName(activity.getClass().getCanonicalName() + "BindingGroup").getDeclaredConstructor(activity.getClass()).newInstance(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
