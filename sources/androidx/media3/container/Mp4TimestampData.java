package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.google.common.primitives.Longs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4TimestampData> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f5694Y;
    public final long Z;

    /* JADX INFO: renamed from: androidx.media3.container.Mp4TimestampData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Mp4TimestampData> {
        @Override // android.os.Parcelable.Creator
        public final Mp4TimestampData createFromParcel(Parcel parcel) {
            return new Mp4TimestampData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Mp4TimestampData[] newArray(int i2) {
            return new Mp4TimestampData[i2];
        }
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.X = j;
        this.f5694Y = j2;
        this.Z = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.X == mp4TimestampData.X && this.f5694Y == mp4TimestampData.f5694Y && this.Z == mp4TimestampData.Z;
    }

    public final int hashCode() {
        return Longs.a(this.Z) + ((Longs.a(this.f5694Y) + ((Longs.a(this.X) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.X + ", modification time=" + this.f5694Y + ", timescale=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.f5694Y);
        parcel.writeLong(this.Z);
    }

    public Mp4TimestampData(Parcel parcel) {
        this.X = parcel.readLong();
        this.f5694Y = parcel.readLong();
        this.Z = parcel.readLong();
    }
}
