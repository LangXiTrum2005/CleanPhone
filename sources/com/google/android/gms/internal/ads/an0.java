package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 extends qh implements qu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm0 f12469a;

    public an0(qm0 qm0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
        this.f12469a = qm0Var;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final void a(zze zzeVar) {
        ((jn0) this.f12469a.f19128c).v(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            zze();
        } else if (i10 == 3) {
            String string = parcel.readString();
            rh.f(parcel);
            zzf(string);
        } else {
            if (i10 != 4) {
                return false;
            }
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final void zze() {
        ((jn0) this.f12469a.f19128c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.qu
    public final void zzf(String str) {
        ((jn0) this.f12469a.f19128c).t1(0, str);
    }
}
