package com.inmobi.media;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3072j {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23704c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23705e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23707i;
    public String j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f23708l;

    public C3072j(int i2, String url, String str, int i3, long j, long j2, long j3, long j4) {
        Intrinsics.f(url, "url");
        this.f23702a = i2;
        this.f23703b = url;
        this.f23704c = str;
        this.d = i3;
        this.f23705e = j;
        this.f = j2;
        this.g = j3;
        this.f23706h = j4;
    }

    public final void a(byte b2) {
        this.f23708l = b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3072j) {
            return Intrinsics.a(this.f23703b, ((C3072j) obj).f23703b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23703b.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("AdAsset{url='"), this.f23703b, "'}");
    }

    public final boolean a() {
        return B2.a(this.f23704c) && new File(this.f23704c).exists();
    }
}
