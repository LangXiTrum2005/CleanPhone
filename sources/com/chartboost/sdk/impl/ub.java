package com.chartboost.sdk.impl;

import com.chartboost.sdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15262c = new a(null);
    public static boolean d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f15263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf f15264b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ub(wf sharedPrefsHelper, hf resourcesLoader) {
        Intrinsics.f(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.f(resourcesLoader, "resourcesLoader");
        this.f15263a = sharedPrefsHelper;
        this.f15264b = resourcesLoader;
    }

    public final String a() {
        String strA = a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
        return strA == null ? "" : strA;
    }

    public final String a(String str, int i2) {
        try {
            String strA = this.f15264b.a(i2);
            if (strA == null) {
                return null;
            }
            this.f15263a.a(str, strA);
            return strA;
        } catch (Exception e2) {
            za.b("OmidJS resource file exception", e2);
            return null;
        }
    }

    public final String a(int i2, String str) {
        try {
            if (d) {
                d = false;
                return a(str, i2);
            }
            String strA = this.f15263a.a(str);
            return strA == null ? a(str, i2) : strA;
        } catch (Exception e2) {
            za.b("OmidJS exception", e2);
            return null;
        }
    }
}
