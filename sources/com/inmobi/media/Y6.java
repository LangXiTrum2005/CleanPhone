package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23369c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23370e;
    public final int f;

    public Y6(String fileName, long j, int i2, long j2, boolean z2, int i3) {
        Intrinsics.f(fileName, "fileName");
        this.f23367a = fileName;
        this.f23368b = j;
        this.f23369c = i2;
        this.d = j2;
        this.f23370e = z2;
        this.f = i3;
    }

    public /* synthetic */ Y6(String str, long j, int i2, long j2, boolean z2, int i3, int i4) {
        this(str, j, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? 0 : i3);
    }
}
