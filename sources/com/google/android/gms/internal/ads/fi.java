package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzck;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fi extends zzck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppEventListener f14435a;

    public fi(AppEventListener appEventListener) {
        this.f14435a = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zzb(String str, String str2) {
        this.f14435a.onAppEvent(str, str2);
    }
}
