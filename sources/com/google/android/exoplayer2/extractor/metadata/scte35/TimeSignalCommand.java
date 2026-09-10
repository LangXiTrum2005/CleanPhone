package com.google.android.exoplayer2.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C1109Vn;
import com.facebook.ads.redexgen.core.C1576fq;
import com.facebook.ads.redexgen.core.C1590g4;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C1109Vn();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C1109Vn c1109Vn) {
        this(j, j2);
    }

    public static long A00(C1576fq c1576fq, long j) {
        long jA0I = c1576fq.A0I();
        if ((128 & jA0I) == 0) {
            return C.TIME_UNSET;
        }
        long ptsTime = 1 & jA0I;
        long firstByte = c1576fq.A0Q();
        return (((ptsTime << 32) | firstByte) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C1576fq c1576fq, long j, C1590g4 c1590g4) {
        long jA00 = A00(c1576fq, j);
        return new TimeSignalCommand(jA00, c1590g4.A06(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
