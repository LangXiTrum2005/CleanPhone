package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0434l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0434l0 f29079a = new C0434l0();

    private C0434l0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public static final MeasurementManager a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        if (a() < 4) {
            return null;
        }
        try {
            return com.unity3d.ads.adplayer.b.c(context.getSystemService(com.unity3d.ads.adplayer.b.g()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void b() {
    }
}
