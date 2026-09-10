package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.zzg;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hm extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f15328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15330c;

    public hm(zzg zzgVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f15328a = zzgVar;
        this.f15329b = str;
        this.f15330c = str2;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f15329b);
            return true;
        }
        if (i10 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f15330c);
            return true;
        }
        zzg zzgVar = this.f15328a;
        if (i10 == 3) {
            s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            if (aVarX1 != null) {
                zzgVar.zza((View) s9.b.y1(aVarX1));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            zzgVar.zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        zzgVar.mo169zzc();
        parcel2.writeNoException();
        return true;
    }
}
