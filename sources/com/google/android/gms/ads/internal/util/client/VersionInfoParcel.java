package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.e;
import l1.d;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class VersionInfoParcel extends a {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    @NonNull
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(String str, int i10, int i11, boolean z10, boolean z11) {
        this.afmaVersion = str;
        this.buddyApkVersion = i10;
        this.clientJarVersion = i11;
        this.isClientJar = z10;
        this.isLiteSdk = z11;
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 2, this.afmaVersion);
        int i11 = this.buddyApkVersion;
        b.Q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.clientJarVersion;
        b.Q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.isClientJar;
        b.Q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.isLiteSdk;
        b.Q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        b.S(parcel, iR);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, z10, false, z11);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str;
        if (z10) {
            str = "0";
        } else {
            str = z11 ? "2" : "1";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + String.valueOf(i10).length() + 13 + 2);
        d.p(sb2, "afma-sdk-a-v", i10, ".", i11);
        this(e.q(".", str, sb2), i10, i11, z10, z12);
    }
}
