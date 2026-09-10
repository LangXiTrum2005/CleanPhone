package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class P6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.f(parcel, "parcel");
        long j = parcel.readLong();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        boolean z2 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        S6 s6 = new S6(j, str, str2, str3, str4, str5, str6, z2, string7 == null ? "" : string7);
        String string8 = parcel.readString();
        R6 r6 = new R6(s6, string8 == null ? "" : string8, parcel.readInt(), parcel.readLong());
        r6.f = parcel.readInt();
        r6.g = parcel.readString();
        return r6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new R6[i2];
    }
}
