package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f563a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[bi.b.values().length];
        f563a = iArr;
        bi.b bVar = bi.b.LEAKING;
        iArr[bVar.ordinal()] = 1;
        bi.b bVar2 = bi.b.UNKNOWN;
        iArr[bVar2.ordinal()] = 2;
        bi.b bVar3 = bi.b.NOT_LEAKING;
        iArr[bVar3.ordinal()] = 3;
        int[] iArr2 = new int[bi.b.values().length];
        b = iArr2;
        iArr2[bVar.ordinal()] = 1;
        iArr2[bVar2.ordinal()] = 2;
        iArr2[bVar3.ordinal()] = 3;
        int[] iArr3 = new int[bi.b.values().length];
        c = iArr3;
        iArr3[bVar2.ordinal()] = 1;
        iArr3[bVar3.ordinal()] = 2;
        iArr3[bVar.ordinal()] = 3;
        int[] iArr4 = new int[bi.b.values().length];
        d = iArr4;
        iArr4[bVar2.ordinal()] = 1;
        iArr4[bVar.ordinal()] = 2;
        iArr4[bVar3.ordinal()] = 3;
    }
}
