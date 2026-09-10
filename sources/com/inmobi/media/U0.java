package com.inmobi.media;

import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f23241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zd f23242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23243c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23244e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23246i;
    public final T0 j;

    public U0(S0 adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.f23241a = adUnit;
        this.f23242b = new Zd();
        this.j = new T0(this);
    }

    public final String a() {
        C3312y0 c3312y0Y;
        LinkedList<C3040h> linkedListF;
        C3040h c3040h;
        String strW;
        S0 s0 = this.f23241a;
        return (s0 == null || (c3312y0Y = s0.y()) == null || (linkedListF = c3312y0Y.f()) == null || (c3040h = (C3040h) CollectionsKt.y(linkedListF)) == null || (strW = c3040h.w()) == null) ? "" : strW;
    }
}
