package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2 f25039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x2 f25040b;

    static {
        x2 x2Var = null;
        try {
            x2Var = (x2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f25039a = x2Var;
        f25040b = new x2();
    }
}
