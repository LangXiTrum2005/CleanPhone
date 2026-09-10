package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jg extends bg {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final jg f23629g;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f23629g = new jg("<skip trace>", uuidRandomUUID, yf.a(uuidRandomUUID), mg.f23751e, dg.c());
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final sg f(String str, ng ngVar, rg rgVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final ng zzl() {
        return mg.f23751e;
    }
}
