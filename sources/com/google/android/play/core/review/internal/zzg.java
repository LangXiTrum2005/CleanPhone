package com.google.android.play.core.review.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzg extends zzb implements zzh {
    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean b0(int i2, Parcel parcel) {
        if (i2 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i3 = zzc.f19650a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(a.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        zzb(bundle);
        return true;
    }
}
