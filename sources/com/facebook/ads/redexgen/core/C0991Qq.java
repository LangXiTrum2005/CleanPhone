package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.StreamKey;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0991Qq implements Parcelable.Creator<StreamKey> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final StreamKey createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final StreamKey[] newArray(int i) {
        return new StreamKey[i];
    }
}
