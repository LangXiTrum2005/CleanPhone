package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzem implements zzax {
    public static final Parcelable.Creator<zzem> CREATOR = new zzek();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzem(Parcel parcel, zzel zzelVar) {
        String string = parcel.readString();
        int i = zzei.zza;
        this.zza = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.zzb = bArrCreateByteArray;
        this.zzc = parcel.readInt();
        int i2 = parcel.readInt();
        this.zzd = i2;
        zzb(string, bArrCreateByteArray, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private static void zzb(String str, byte[] bArr, int i) {
        byte b;
        byte b2;
        boolean z = true;
        switch (str) {
            case "com.android.capture.fps":
                b = 0;
                break;
            case "editable.tracks.samples.location":
                b = 4;
                break;
            case "editable.tracks.length":
                b = 2;
                break;
            case "editable.tracks.offset":
                b = 1;
                break;
            case "editable.tracks.map":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            zzcw.zzd(i == 23 && bArr.length == 4);
            return;
        }
        if (b == 1 || b == 2) {
            zzcw.zzd(i == 78 && bArr.length == 8);
            return;
        }
        if (b == 3) {
            zzcw.zzd(i == 0);
            return;
        }
        if (b != 4) {
            return;
        }
        if (i != 75 || bArr.length != 1 || ((b2 = bArr[0]) != 0 && b2 != 1)) {
            z = false;
        }
        zzcw.zzd(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzem.class == obj.getClass()) {
            zzem zzemVar = (zzem) obj;
            if (this.zza.equals(zzemVar.zza) && Arrays.equals(this.zzb, zzemVar.zzb) && this.zzc == zzemVar.zzc && this.zzd == zzemVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[LOOP:0: B:26:0x00a7->B:28:0x00aa, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb;
        int i = this.zzd;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                string = zzei.zzB(this.zzb);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgaq.zzd(this.zzb)));
            } else if (i == 67) {
                string = String.valueOf(zzgaq.zzd(this.zzb));
            } else if (i == 75) {
                string = String.valueOf(this.zzb[0] & 255);
            } else if (i != 78) {
                bArr = this.zzb;
                int length = bArr.length;
                sb = new StringBuilder(length + length);
                while (i2 < bArr.length) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & cw.m, 16));
                    i2++;
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new zzdy(this.zzb).zzw());
            }
        } else if (this.zza.equals("editable.tracks.map")) {
            zzcw.zzg(this.zza.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
            byte b = this.zzb[1];
            ArrayList arrayList = new ArrayList();
            while (i2 < b) {
                arrayList.add(Integer.valueOf(this.zzb[i2 + 2]));
                i2++;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzfuf.zzb(sb2, arrayList, ",");
            string = sb2.toString();
        } else {
            bArr = this.zzb;
            int length2 = bArr.length;
            sb = new StringBuilder(length2 + length2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & cw.m, 16));
                i2++;
            }
            string = sb.toString();
        }
        return AbstractC5044xl.m("mdta: key=", this.zza, ", value=", string);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }

    public zzem(String str, byte[] bArr, int i, int i2) {
        zzb(str, bArr, i2);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }
}
