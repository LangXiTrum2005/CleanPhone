package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40867c;
    public AdUnitConfig d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40868e;
    public Point f;
    public Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f40869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40870i;

    public ca(Context context, AdPreferences preferences, AdPreferences.Placement placement, lb httpClient, lb networkApiExecutor, lb eventTracer, lb motionProcessor) {
        Intrinsics.f(context, "context");
        Intrinsics.f(preferences, "preferences");
        Intrinsics.f(placement, "placement");
        Intrinsics.f(httpClient, "httpClient");
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(eventTracer, "eventTracer");
        Intrinsics.f(motionProcessor, "motionProcessor");
        this.f40869h = 1;
    }
}
