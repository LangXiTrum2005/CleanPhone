package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vv implements NativeCustomFormatAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ap f21277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pv f21278b;

    public vv(ap apVar) {
        this.f21277a = apVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.f21277a.zzl();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.f21277a.zzg();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.f21277a.zzh();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f21278b == null) {
                ap apVar = this.f21277a;
                if (apVar.z()) {
                    this.f21278b = new pv(apVar);
                }
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        return this.f21278b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            mo moVarZzf = this.f21277a.zzf(str);
            if (moVarZzf != null) {
                return new qv(moVarZzf);
            }
            return null;
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        try {
            ap apVar = this.f21277a;
            if (apVar.zzs() != null) {
                return new zzfb(apVar.zzs(), apVar);
            }
            return null;
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.f21277a.zze(str);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.f21277a.zzi(str);
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.f21277a.zzj();
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }
}
