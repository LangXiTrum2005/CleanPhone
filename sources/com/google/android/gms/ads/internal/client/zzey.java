package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.ry;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzey extends com.google.android.gms.ads.preload.zzb {
    public zzey(Context context) {
        super(context, AdFormat.REWARDED);
    }

    @Nullable
    public final RewardedAd zza(String str) {
        iy iyVarZzq;
        try {
            iyVarZzq = this.f11556a.zzq(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            iyVarZzq = null;
        }
        if (iyVarZzq == null) {
            return null;
        }
        return new ry(this.f11558c, iyVarZzq);
    }
}
