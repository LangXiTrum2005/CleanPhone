package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static h1 f14061a = new h1();

    public static h1 b() {
        return f14061a;
    }

    public Task a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e2) {
            za.b("Cannot retrieve appSetId client", e2);
            return null;
        }
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }
}
