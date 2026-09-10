package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new AnonymousClass1();
    public final ArrayList X;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i2) {
            return new SlowMotionData[i2];
        }
    }

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new AnonymousClass1();
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f18228Y;
        public final int Z;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i2) {
                return new Segment[i2];
            }
        }

        public Segment(long j, long j2, int i2) {
            Assertions.b(j < j2);
            this.X = j;
            this.f18228Y = j2;
            this.Z = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Segment.class == obj.getClass()) {
                Segment segment = (Segment) obj;
                if (this.X == segment.X && this.f18228Y == segment.f18228Y && this.Z == segment.Z) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.X), Long.valueOf(this.f18228Y), Integer.valueOf(this.Z)});
        }

        public final String toString() {
            int i2 = Util.f18979a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.X + ", endTimeMs=" + this.f18228Y + ", speedDivisor=" + this.Z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.X);
            parcel.writeLong(this.f18228Y);
            parcel.writeInt(this.Z);
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.X = arrayList;
        boolean z2 = false;
        if (!arrayList.isEmpty()) {
            long j = ((Segment) arrayList.get(0)).f18228Y;
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                if (((Segment) arrayList.get(i2)).X < j) {
                    z2 = true;
                    break;
                }
                j = ((Segment) arrayList.get(i2)).f18228Y;
            }
        }
        Assertions.b(!z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.X.equals(((SlowMotionData) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.X);
    }
}
