package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzd implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzm f10912a;

    public zzd(zzm zzmVar) {
        this.f10912a = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.f10912a;
        zzmVar.f10943w = 2;
        zzmVar.f10922a.finish();
    }
}
