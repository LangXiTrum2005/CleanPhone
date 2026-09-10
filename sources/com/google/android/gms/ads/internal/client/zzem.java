package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.hs;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzem extends com.google.android.gms.ads.preload.zzb {
    public zzem(Context context) {
        super(context, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final InterstitialAd zza(String str) {
        zzbu zzbuVarZzo;
        try {
            zzbuVarZzo = this.f11556a.zzo(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzbuVarZzo = null;
        }
        if (zzbuVarZzo == null) {
            return null;
        }
        return new hs(this.f11558c, zzbuVarZzo);
    }
}
