package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay extends qh implements cy {
    public ay() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                l(aVarX1);
                break;
            case 2:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                rh.f(parcel);
                zzf(aVarX2, i11);
                break;
            case 3:
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzg(aVarX3);
                break;
            case 4:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                i(aVarX4);
                break;
            case 5:
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                M(aVarX5);
                break;
            case 6:
                s9.a aVarX6 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzj(aVarX6);
                break;
            case 7:
                s9.a aVarX7 = s9.b.x1(parcel.readStrongBinder());
                dy dyVar = (dy) rh.b(parcel, dy.CREATOR);
                rh.f(parcel);
                q1(aVarX7, dyVar);
                break;
            case 8:
                s9.a aVarX8 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                E(aVarX8);
                break;
            case 9:
                s9.a aVarX9 = s9.b.x1(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                rh.f(parcel);
                H(aVarX9, i12);
                break;
            case 10:
                s9.a aVarX10 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzn(aVarX10);
                break;
            case 11:
                s9.a aVarX11 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                o1(aVarX11);
                break;
            case 12:
                rh.f(parcel);
                break;
            case 13:
                s9.a aVarX12 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                i1(aVarX12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
