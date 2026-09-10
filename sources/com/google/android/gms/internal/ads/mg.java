package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f17426e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17430d;

    public static mg a(Context context, Executor executor) {
        String[] strArr = f17426e;
        mg mgVar = new mg();
        mgVar.f17427a = 0L;
        mgVar.f17428b = 0L;
        mgVar.f17429c = -1L;
        mgVar.f17430d = false;
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new lg(mgVar, 0));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
        return mgVar;
    }
}
