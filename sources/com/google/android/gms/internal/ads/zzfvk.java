package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfvk> CREATOR = new zzfvl();
    public final int zza;
    private zzawp zzb = null;
    private byte[] zzc;

    public zzfvk(int i2, byte[] bArr) {
        this.zza = i2;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzawp zzawpVar = this.zzb;
        if (zzawpVar != null || this.zzc == null) {
            if (zzawpVar == null || this.zzc != null) {
                if (zzawpVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzawpVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        byte[] bArrZzaN = this.zzc;
        if (bArrZzaN == null) {
            bArrZzaN = this.zzb.zzaN();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrZzaN, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzawp zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzawp.zzi(this.zzc, zziab.zza());
                this.zzc = null;
            } catch (zzibg | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }
}
