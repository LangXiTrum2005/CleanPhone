package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f18297Y;
    public final int Z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.StreamKey$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i2) {
            return new StreamKey[i2];
        }
    }

    public StreamKey(int i2, int i3, int i4) {
        this.X = i2;
        this.f18297Y = i3;
        this.Z = i4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i2 = this.X - streamKey2.X;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f18297Y - streamKey2.f18297Y;
        return i3 == 0 ? this.Z - streamKey2.Z : i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.X == streamKey.X && this.f18297Y == streamKey.f18297Y && this.Z == streamKey.Z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.X * 31) + this.f18297Y) * 31) + this.Z;
    }

    public final String toString() {
        return this.X + mo.ono + this.f18297Y + mo.ono + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.f18297Y);
        parcel.writeInt(this.Z);
    }

    public StreamKey(Parcel parcel) {
        this.X = parcel.readInt();
        this.f18297Y = parcel.readInt();
        this.Z = parcel.readInt();
    }
}
