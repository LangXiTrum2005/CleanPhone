package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ku extends qh implements zt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterscrollerAd f16523a;

    public ku(MediationInterscrollerAd mediationInterscrollerAd) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        this.f16523a = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            s9.a aVarZze = zze();
            parcel2.writeNoException();
            rh.e(parcel2, aVarZze);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        boolean zShouldDelegateInterscrollerEffect = this.f16523a.shouldDelegateInterscrollerEffect();
        parcel2.writeNoException();
        ClassLoader classLoader = rh.f19590a;
        parcel2.writeInt(zShouldDelegateInterscrollerEffect ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final s9.a zze() {
        return new s9.b(this.f16523a.getView());
    }

    @Override // com.google.android.gms.internal.ads.zt
    public final boolean zzf() {
        return this.f16523a.shouldDelegateInterscrollerEffect();
    }
}
