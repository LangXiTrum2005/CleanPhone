package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbou {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzboq zzc;

    public zzbou(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbgk.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzln)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlp)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzbb.zzb().zzl(this.zza, new zzbsv(), this.zzb);
    }

    public final boolean zza(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzboq zzboqVar = this.zzc;
        if (zzboqVar == null) {
            return false;
        }
        try {
            zzboqVar.zze(str);
            return true;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return true;
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzln)).booleanValue()) {
            zzd();
            zzboq zzboqVar = this.zzc;
            if (zzboqVar != null) {
                try {
                    zzboqVar.zzf();
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }
}
