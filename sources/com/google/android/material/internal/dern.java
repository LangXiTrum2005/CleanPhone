package com.google.android.material.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: ContextUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {
    public static Activity attabal(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
