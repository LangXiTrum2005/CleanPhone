package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zv extends qh implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22723a = 0;

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) rh.b(parcel, Intent.CREATOR);
                rh.f(parcel);
                ((zl0) this).s(intent);
                break;
            case 2:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                rh.f(parcel);
                ((zl0) this).u(aVarX1, new zza(string, string2, ""));
                break;
            case 3:
                ((zl0) this).zzg();
                break;
            case 4:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                ((zl0) this).i(aVarX2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                ((zl0) this).Y(strArrCreateStringArray, iArrCreateIntArray, aVarX3);
                break;
            case 6:
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                zza zzaVar = (zza) rh.b(parcel, zza.CREATOR);
                rh.f(parcel);
                ((zl0) this).u(aVarX4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
