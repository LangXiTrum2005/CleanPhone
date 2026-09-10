package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import l9.a;
import org.json.JSONException;
import org.json.JSONObject;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends a {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzt(int i10, int i11, String str, long j10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = j10;
    }

    public static zzt zza(JSONObject jSONObject) throws JSONException {
        return new zzt(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong(X3.i.X));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzb;
        b.Q(parcel, 2, 4);
        parcel.writeInt(i12);
        b.J(parcel, 3, this.zzc);
        long j10 = this.zzd;
        b.Q(parcel, 4, 8);
        parcel.writeLong(j10);
        b.S(parcel, iR);
    }
}
