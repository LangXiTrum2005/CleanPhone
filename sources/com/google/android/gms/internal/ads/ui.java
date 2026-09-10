package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ui extends qh implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FullScreenContentCallback f20796a;

    public ui() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzc();
        } else if (i10 == 2) {
            zzd();
        } else if (i10 == 3) {
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            zze(zzeVar);
        } else if (i10 == 4) {
            zzf();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f20796a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzd() {
        FullScreenContentCallback fullScreenContentCallback = this.f20796a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zze(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f20796a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f20796a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f20796a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }
}
