package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzez extends a {
    public static final Parcelable.Creator<zzez> CREATOR = new zzfa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10865c;

    public zzez(int i10, int i11, String str) {
        this.f10863a = i10;
        this.f10864b = i11;
        this.f10865c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(this.f10863a);
        b.Q(parcel, 2, 4);
        parcel.writeInt(this.f10864b);
        b.J(parcel, 3, this.f10865c);
        b.S(parcel, iR);
    }

    public final int zza() {
        return this.f10864b;
    }

    public final String zzb() {
        return this.f10865c;
    }

    public zzez() {
        this(ModuleDescriptor.MODULE_VERSION, 261710000, "25.3.0");
    }
}
