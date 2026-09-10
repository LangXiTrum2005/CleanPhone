package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Download f14152a;

    public i6(Download download) {
        Intrinsics.f(download, "download");
        this.f14152a = download;
    }

    public final Download a() {
        return this.f14152a;
    }

    public final String b() {
        String id = this.f14152a.f18255a.X;
        Intrinsics.e(id, "id");
        return id;
    }

    public final float c() {
        return this.f14152a.f18259h.f18281b;
    }

    public final int d() {
        return this.f14152a.f18256b;
    }

    public final long e() {
        return this.f14152a.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && Intrinsics.a(this.f14152a, ((i6) obj).f14152a);
    }

    public final String f() {
        String string = this.f14152a.f18255a.f18282Y.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        return this.f14152a.hashCode();
    }

    public String toString() {
        return "DownloadWrapper(download=" + this.f14152a + ")";
    }
}
