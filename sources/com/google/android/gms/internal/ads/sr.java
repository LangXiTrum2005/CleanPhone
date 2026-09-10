package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sr implements k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m00 f20036a;

    public /* synthetic */ sr(m00 m00Var) {
        this.f20036a = m00Var;
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
        this.f20036a.zzd(new RuntimeException("Connection failed."));
    }

    public sr(i9.i iVar, m00 m00Var) {
        this.f20036a = m00Var;
    }
}
