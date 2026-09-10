package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class km extends u.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm f16479c;

    public km(lm lmVar) {
        this.f16479c = lmVar;
    }

    @Override // u.a
    public final void onNavigationEvent(int i10, Bundle bundle) {
        lm lmVar = this.f16479c;
        lmVar.getClass();
        if (!((Boolean) zzba.zzc().a(am.H5)).booleanValue() || lmVar.f17057d == null) {
            return;
        }
        l00.f16608a.execute(new com.google.android.gms.common.api.internal.q(i10, 2, lmVar));
    }
}
