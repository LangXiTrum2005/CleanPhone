package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sx extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20060b;

    public sx(String str, int i10) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f20059a = str;
        this.f20060b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        if (k9.c0.l(this.f20059a, sxVar.f20059a)) {
            if (k9.c0.l(Integer.valueOf(this.f20060b), Integer.valueOf(sxVar.f20060b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f20059a);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f20060b);
        return true;
    }
}
