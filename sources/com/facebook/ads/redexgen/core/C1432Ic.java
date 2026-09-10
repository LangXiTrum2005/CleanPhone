package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1432Ic implements Parcelable.Creator<TimeSignalCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final TimeSignalCommand[] newArray(int i2) {
        return new TimeSignalCommand[i2];
    }
}
