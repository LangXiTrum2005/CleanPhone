package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wt extends qh implements xt {
    public wt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static xt x1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof xt ? (xt) iInterfaceQueryLocalInterface : new vt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        fy eyVar;
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i11 = parcel.readInt();
                rh.f(parcel);
                g(i11);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                rh.f(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                rh.f(parcel);
                k0(string, string2);
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                }
                parcel.readString();
                rh.f(parcel);
                break;
            case 11:
                p();
                break;
            case 12:
                parcel.readString();
                rh.f(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                dy dyVar = (dy) rh.b(parcel, dy.CREATOR);
                rh.f(parcel);
                w(dyVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    eyVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    eyVar = iInterfaceQueryLocalInterface instanceof fy ? (fy) iInterfaceQueryLocalInterface : new ey(strongBinder3);
                }
                rh.f(parcel);
                L0(eyVar);
                break;
            case 17:
                int i12 = parcel.readInt();
                rh.f(parcel);
                zzs(i12);
                break;
            case 18:
                zzt();
                break;
            case 19:
                rh.f(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                rh.f(parcel);
                zzv(string3);
                break;
            case 22:
                int i13 = parcel.readInt();
                String string4 = parcel.readString();
                rh.f(parcel);
                t1(i13, string4);
                break;
            case 23:
                zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
                rh.f(parcel);
                v(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) rh.b(parcel, zze.CREATOR);
                rh.f(parcel);
                B(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
