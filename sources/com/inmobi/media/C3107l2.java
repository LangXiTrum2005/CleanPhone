package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3107l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23760c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23761e;
    public int f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23763i;

    public C3107l2(int i2, String url, Map map, boolean z2, boolean z3, int i3, long j, long j2) {
        Intrinsics.f(url, "url");
        this.f23758a = i2;
        this.f23759b = url;
        this.f23760c = map;
        this.d = z2;
        this.f23761e = z3;
        this.f = i3;
        this.g = j;
        this.f23762h = j2;
        this.f23763i = new AtomicBoolean(false);
    }

    public /* synthetic */ C3107l2(String str, Map map, boolean z2, boolean z3, int i2, int i3) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, (i3 & 4) != 0 ? null : map, z2, z3, i2, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
