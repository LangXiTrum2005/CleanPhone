package com.google.android.gms.ads.preload;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.HashMap;
import java.util.Map;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzch f11556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdFormat f11557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11558c;

    public zzb(Context context, AdFormat adFormat) {
        this.f11556a = com.google.android.gms.ads.zzb.zza(context);
        this.f11558c = context.getApplicationContext();
        this.f11557b = adFormat;
    }

    public final boolean zzb(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        if (str == null) {
            return false;
        }
        try {
            return this.f11556a.zzm(str, zzf.zzu(this.f11558c, preloadConfiguration, this.f11557b), preloadCallbackV2 == null ? null : new zza(this, preloadCallbackV2));
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e10);
            return false;
        }
    }

    public final boolean zzc(String str, PreloadConfiguration preloadConfiguration) {
        if (str == null) {
            return false;
        }
        try {
            return this.f11556a.zzm(str, zzf.zzu(this.f11558c, preloadConfiguration, this.f11557b), null);
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 37);
            sb2.append("Failed to preload ad for preload ID ");
            sb2.append(str);
            sb2.append(".");
            zzo.zzj(sb2.toString(), e10);
            return false;
        }
    }

    public final boolean zzd(String str) {
        try {
            return this.f11556a.zzn(this.f11557b.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final int zze(String str) {
        try {
            return this.f11556a.zzt(this.f11557b.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return 0;
        }
    }

    public final boolean zzf(String str) {
        try {
            return this.f11556a.zzu(this.f11557b.getValue(), str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public final void zzg() {
        try {
            this.f11556a.zzv(this.f11557b.getValue());
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final Map zzh() {
        try {
            Bundle bundleZzs = this.f11556a.zzs(this.f11557b.getValue());
            HashMap map = new HashMap();
            for (String str : bundleZzs.keySet()) {
                byte[] byteArray = bundleZzs.getByteArray(str);
                if (byteArray != null) {
                    Parcelable.Creator<zzfp> creator = zzfp.CREATOR;
                    c0.h(creator);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                    parcelObtain.setDataPosition(0);
                    zzfp zzfpVarCreateFromParcel = creator.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    PreloadConfiguration preloadConfigurationZzs = zzf.zzs(zzfpVarCreateFromParcel);
                    if (preloadConfigurationZzs != null) {
                        map.put(str, preloadConfigurationZzs);
                    } else {
                        continue;
                    }
                }
            }
            return map;
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return new HashMap();
        }
    }

    @Nullable
    public final PreloadConfiguration zzi(String str) {
        try {
            zzfp zzfpVarZzr = this.f11556a.zzr(this.f11557b.getValue(), str);
            if (zzfpVarZzr == null) {
                return null;
            }
            return zzf.zzs(zzfpVarZzr);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
