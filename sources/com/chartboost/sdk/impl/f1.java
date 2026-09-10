package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f13848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.f(context, "context");
        Intrinsics.f(contentResolver, "contentResolver");
        this.f13848b = contentResolver;
    }

    public d1 b() {
        kh khVar = kh.TRACKING_UNKNOWN;
        String str = null;
        try {
            boolean z2 = Settings.Secure.getInt(this.f13848b, "limit_ad_tracking") != 0;
            String string = Settings.Secure.getString(this.f13848b, "advertising_id");
            if (z2 || Intrinsics.a(string, "00000000-0000-0000-0000-000000000000") || a()) {
                khVar = kh.TRACKING_LIMITED;
            } else {
                khVar = kh.TRACKING_ENABLED;
                str = string;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return new d1(khVar, str);
    }
}
