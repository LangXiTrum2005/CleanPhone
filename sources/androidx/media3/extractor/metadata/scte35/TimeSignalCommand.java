package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f6962Y;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.scte35.TimeSignalCommand$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i2) {
            return new TimeSignalCommand[i2];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.X = j;
        this.f6962Y = j2;
    }

    public static long a(long j, ParsableByteArray parsableByteArray) {
        long jU = parsableByteArray.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | parsableByteArray.w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.X);
        sb.append(", playbackPositionUs= ");
        return a.j(this.f6962Y, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.f6962Y);
    }
}
