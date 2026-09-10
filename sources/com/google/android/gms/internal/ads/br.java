package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class br extends qh implements dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnH5AdsEventListener f12857a;

    public br(OnH5AdsEventListener onH5AdsEventListener) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        this.f12857a = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void b(String str) {
        this.f12857a.onH5AdsEvent(str);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        rh.f(parcel);
        b(string);
        parcel2.writeNoException();
        return true;
    }
}
