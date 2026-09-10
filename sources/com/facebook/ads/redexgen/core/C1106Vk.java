package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.extractor.metadata.scte35.SpliceScheduleCommand;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1106Vk implements Parcelable.Creator<SpliceScheduleCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SpliceScheduleCommand[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
