package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f610a;

    static {
        int[] iArr = new int[bi.b.values().length];
        f610a = iArr;
        iArr[bi.b.UNKNOWN.ordinal()] = 1;
        iArr[bi.b.NOT_LEAKING.ordinal()] = 2;
        iArr[bi.b.LEAKING.ordinal()] = 3;
    }
}
