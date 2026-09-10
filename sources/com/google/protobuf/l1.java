package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f24894a = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f24895b;

    static {
        i1 i1Var = null;
        try {
            i1Var = (i1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f24895b = i1Var;
    }
}
