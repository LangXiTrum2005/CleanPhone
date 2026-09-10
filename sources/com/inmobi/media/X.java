package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f23331c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23332e;
    private final String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f23334i;
    private String j;

    public X(String mAdType) {
        Intrinsics.f(mAdType, "mAdType");
        this.f23329a = mAdType;
        this.f23330b = Long.MIN_VALUE;
        this.f = androidx.media3.extractor.text.ttml.a.m("toString(...)");
        this.g = "";
        this.f23334i = "activity";
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    public final X a(long j) {
        this.f23330b = j;
        return this;
    }

    public final X d(String m10Context) {
        Intrinsics.f(m10Context, "m10Context");
        this.f23334i = m10Context;
        return this;
    }

    public final X e(String str) {
        this.f23332e = str;
        return this;
    }

    public final X a(Z placement) {
        Intrinsics.f(placement, "placement");
        this.f23330b = placement.g();
        this.f23334i = placement.j();
        this.f23331c = placement.f();
        this.g = placement.a();
        return this;
    }

    public final X b(String str) {
        this.j = str;
        return this;
    }

    public final X c(String str) {
        this.d = str;
        return this;
    }

    public final X a(String adSize) {
        Intrinsics.f(adSize, "adSize");
        this.g = adSize;
        return this;
    }

    public final X a(Map<String, String> map) {
        this.f23331c = map;
        return this;
    }

    public final X a(boolean z2) {
        this.f23333h = z2;
        return this;
    }

    public final Z a() throws IllegalStateException {
        String str;
        long j = this.f23330b;
        if (j != Long.MIN_VALUE) {
            Map<String, String> map = this.f23331c;
            if (map == null || (str = map.get("tp")) == null) {
                str = "";
            }
            Z z2 = new Z(j, str, this.f23329a, this.f23332e, null);
            z2.d = this.d;
            z2.a(this.f23331c);
            z2.a(this.g);
            z2.b(this.f23334i);
            z2.g = this.f;
            z2.j = this.f23333h;
            z2.k = this.j;
            return z2;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }
}
