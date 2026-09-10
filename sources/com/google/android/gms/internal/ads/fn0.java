package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 extends qh implements su {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm0 f14478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gn0 f14479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(gn0 gn0Var, qm0 qm0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f14479b = gn0Var;
        this.f14478a = qm0Var;
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void a(zze zzeVar) {
        ((jn0) this.f14478a.f19128c).v(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void l(s9.a aVar) {
        this.f14479b.f14908d = (View) s9.b.y1(aVar);
        ((jn0) this.f14478a.f19128c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        zt ytVar;
        if (i10 == 1) {
            s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            l(aVarX1);
        } else if (i10 == 2) {
            String string = parcel.readString();
            rh.f(parcel);
            zzf(string);
        } else if (i10 == 3) {
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            a(zzeVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ytVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                ytVar = iInterfaceQueryLocalInterface instanceof zt ? (zt) iInterfaceQueryLocalInterface : new yt(strongBinder);
            }
            rh.f(parcel);
            this.f14479b.f14909e = ytVar;
            ((jn0) this.f14478a.f19128c).zzj();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void zzf(String str) {
        ((jn0) this.f14478a.f19128c).t1(0, str);
    }
}
