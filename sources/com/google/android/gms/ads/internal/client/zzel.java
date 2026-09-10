package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.wi;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    public zzel(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final AppOpenAd zza(String str) {
        wi wiVarZzp;
        try {
            wiVarZzp = this.f11556a.zzp(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            wiVarZzp = null;
        }
        if (wiVarZzp == null) {
            return null;
        }
        return new ti(wiVarZzp);
    }
}
