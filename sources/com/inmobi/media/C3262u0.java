package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3262u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C3287v0(source);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C3287v0[i];
    }
}
