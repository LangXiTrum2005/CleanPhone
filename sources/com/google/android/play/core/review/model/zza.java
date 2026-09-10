package com.google.android.play.core.review.model;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f19666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f19667b;

    static {
        HashMap map = new HashMap();
        f19666a = map;
        HashMap map2 = new HashMap();
        f19667b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
