package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd extends zza implements zzf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.review.internal.zzf
    public final void a0(String str, Bundle bundle, zzh zzhVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i2 = zzc.f19650a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(zzhVar);
        try {
            this.X.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
