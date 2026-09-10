package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 {
    public static final a d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile x5 f15611e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6 f15613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5 f15614c;

    public static final class a {
        public a() {
        }

        public final x5 a() {
            return y5.f15611e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y5(Context context, f6 displayMeasurement, z5 deviceFieldsWrapper) {
        Intrinsics.f(context, "context");
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        Intrinsics.f(deviceFieldsWrapper, "deviceFieldsWrapper");
        this.f15612a = context;
        this.f15613b = displayMeasurement;
        this.f15614c = deviceFieldsWrapper;
    }

    public final x5 b() {
        try {
            g6 g6VarA = this.f15613b.a();
            g6 g6VarD = this.f15613b.d();
            String packageName = this.f15612a.getPackageName();
            int iB = g6VarA.b();
            int iA = g6VarA.a();
            int iB2 = g6VarD.b();
            int iA2 = g6VarD.a();
            float fB = this.f15613b.b();
            String strValueOf = String.valueOf(this.f15613b.c());
            int iA3 = this.f15614c.a();
            String strB = this.f15614c.b();
            PackageManager packageManager = this.f15612a.getPackageManager();
            Intrinsics.e(packageManager, "getPackageManager(...)");
            Intrinsics.c(packageName);
            x5 x5Var = new x5(iB, iA, iB2, iA2, fB, strValueOf, iA3, strB, packageName, w7.getPackageVersionName(packageManager, packageName), this.f15614c.c());
            f15611e = x5Var;
            return x5Var;
        } catch (Exception e2) {
            za.b("Cannot create device body", e2);
            return new x5(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
        }
    }
}
