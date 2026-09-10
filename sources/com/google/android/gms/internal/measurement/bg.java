package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bg extends yf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ng f23323f;

    public bg(String str, yf yfVar, ng ngVar, rg rgVar) {
        super(str, yfVar, rgVar);
        go.k.i(ngVar.f23790c);
        this.f23323f = ngVar;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final ng zzh() {
        return ng.a(this.f23323f, zzl());
    }

    public bg(String str, UUID uuid, String str2, ng ngVar, rg rgVar) {
        super(str, uuid, str2, rgVar);
        go.k.i(ngVar.f23790c);
        this.f23323f = ngVar;
    }
}
