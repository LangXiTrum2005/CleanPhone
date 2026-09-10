package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhg extends CustomTabsCallback {
    final /* synthetic */ zzbhj zza;

    public zzbhg(zzbhj zzbhjVar) {
        Objects.requireNonNull(zzbhjVar);
        this.zza = zzbhjVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i2, Bundle bundle) {
        this.zza.zzc(i2);
    }
}
