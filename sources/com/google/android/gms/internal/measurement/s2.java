package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends RuntimeException {
    public s2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final u1 d() {
        return new u1(getMessage());
    }
}
