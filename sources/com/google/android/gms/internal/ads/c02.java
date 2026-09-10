package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c02 implements Parcelable {
    public static final Parcelable.Creator<c02> CREATOR = new gj(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f12971e;

    public c02(Parcel parcel) {
        this.f12968b = new UUID(parcel.readLong(), parcel.readLong());
        this.f12969c = parcel.readString();
        String string = parcel.readString();
        String str = uu0.f20901a;
        this.f12970d = string;
        this.f12971e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c02)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c02 c02Var = (c02) obj;
        return Objects.equals(this.f12969c, c02Var.f12969c) && Objects.equals(this.f12970d, c02Var.f12970d) && Objects.equals(this.f12968b, c02Var.f12968b) && Arrays.equals(this.f12971e, c02Var.f12971e);
    }

    public final int hashCode() {
        int i10 = this.f12967a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f12968b.hashCode() * 31;
        String str = this.f12969c;
        int iHashCode2 = Arrays.hashCode(this.f12971e) + d5.u.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f12970d);
        this.f12967a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f12968b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f12969c);
        parcel.writeString(this.f12970d);
        parcel.writeByteArray(this.f12971e);
    }

    public c02(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f12968b = uuid;
        this.f12969c = null;
        this.f12970d = na.g(str);
        this.f12971e = bArr;
    }
}
