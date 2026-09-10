package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends qh implements op {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnAdManagerAdViewLoadedListener f13228a;

    public cq(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        this.f13228a = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.op
    public final void c0(zzbu zzbuVar, s9.a aVar) {
        if (zzbuVar == null || aVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) s9.b.y1(aVar));
        try {
            if (zzbuVar.zzw() instanceof zzg) {
                zzg zzgVar = (zzg) zzbuVar.zzw();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzk() : null);
            }
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
        try {
            if (zzbuVar.zzv() instanceof fi) {
                fi fiVar = (fi) zzbuVar.zzv();
                adManagerAdView.setAppEventListener(fiVar != null ? fiVar.f14435a : null);
            }
        } catch (RemoteException e11) {
            zzo.zzg("", e11);
        }
        zzf.zza.post(new o1(this, adManagerAdView, zzbuVar, false, 3));
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        zzbu zzbuVarZzZ = zzbt.zzZ(parcel.readStrongBinder());
        s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
        rh.f(parcel);
        c0(zzbuVarZzZ, aVarX1);
        parcel2.writeNoException();
        return true;
    }
}
