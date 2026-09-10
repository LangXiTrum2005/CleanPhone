package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mq1 f17521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mq1 f17522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mq1 f17523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mq1[] f17524d;

    static {
        mq1 mq1Var = new mq1("NIST_P256", 0);
        f17521a = mq1Var;
        mq1 mq1Var2 = new mq1("NIST_P384", 1);
        f17522b = mq1Var2;
        mq1 mq1Var3 = new mq1("NIST_P521", 2);
        f17523c = mq1Var3;
        f17524d = new mq1[]{mq1Var, mq1Var2, mq1Var3};
    }

    public static mq1[] values() {
        return (mq1[]) f17524d.clone();
    }
}
