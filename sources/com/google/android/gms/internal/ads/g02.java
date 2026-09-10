package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g02 implements Comparator, Parcelable {
    public static final Parcelable.Creator<g02> CREATOR = new gj(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c02[] f14645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14648d;

    public g02(Parcel parcel) {
        this.f14647c = parcel.readString();
        c02[] c02VarArr = (c02[]) parcel.createTypedArray(c02.CREATOR);
        String str = uu0.f20901a;
        this.f14645a = c02VarArr;
        this.f14648d = c02VarArr.length;
    }

    public final g02 a(String str) {
        return Objects.equals(this.f14647c, str) ? this : new g02(str, false, this.f14645a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        c02 c02Var = (c02) obj2;
        UUID uuid = v01.f20988a;
        UUID uuid2 = ((c02) obj).f12968b;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(c02Var.f12968b) ? 1 : 0;
        }
        return uuid2.compareTo(c02Var.f12968b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g02.class == obj.getClass()) {
            g02 g02Var = (g02) obj;
            if (Objects.equals(this.f14647c, g02Var.f14647c) && Arrays.equals(this.f14645a, g02Var.f14645a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f14646b;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f14647c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f14645a);
        this.f14646b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14647c);
        parcel.writeTypedArray(this.f14645a, 0);
    }

    public g02(String str, boolean z10, c02... c02VarArr) {
        this.f14647c = str;
        c02VarArr = z10 ? (c02[]) c02VarArr.clone() : c02VarArr;
        this.f14645a = c02VarArr;
        this.f14648d = c02VarArr.length;
        Arrays.sort(c02VarArr, this);
    }
}
