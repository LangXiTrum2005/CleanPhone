package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public enum AFh1vSDK {
    application,
    activity,
    other;

    public static AFh1vSDK getMediationNetwork(Context context) {
        if (context instanceof Activity) {
            return activity;
        }
        return context instanceof Application ? application : other;
    }
}
