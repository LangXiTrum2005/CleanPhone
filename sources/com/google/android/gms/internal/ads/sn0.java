package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends qh implements wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm0 f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gn0 f20008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(gn0 gn0Var, qm0 qm0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f20008b = gn0Var;
        this.f20007a = qm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void a(zze zzeVar) {
        ((jn0) this.f20007a.f19128c).v(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        eu cuVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                cuVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                cuVar = iInterfaceQueryLocalInterface instanceof eu ? (eu) iInterfaceQueryLocalInterface : new cu(strongBinder);
            }
            rh.f(parcel);
            w0(cuVar);
        } else if (i10 == 2) {
            String string = parcel.readString();
            rh.f(parcel);
            zzf(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void w0(eu euVar) {
        this.f20008b.f14908d = euVar;
        ((jn0) this.f20007a.f19128c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.wu
    public final void zzf(String str) {
        ((jn0) this.f20007a.f19128c).t1(0, str);
    }
}
