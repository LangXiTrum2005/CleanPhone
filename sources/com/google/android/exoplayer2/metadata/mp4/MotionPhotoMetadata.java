package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new AnonymousClass1();
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18227Y;
    public final long Z;
    public final long e0;
    public final long f0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i2) {
            return new MotionPhotoMetadata[i2];
        }
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.X = j;
        this.f18227Y = j2;
        this.Z = j3;
        this.e0 = j4;
        this.f0 = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.X == motionPhotoMetadata.X && this.f18227Y == motionPhotoMetadata.f18227Y && this.Z == motionPhotoMetadata.Z && this.e0 == motionPhotoMetadata.e0 && this.f0 == motionPhotoMetadata.f0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.a(this.f0) + ((Longs.a(this.e0) + ((Longs.a(this.Z) + ((Longs.a(this.f18227Y) + ((Longs.a(this.X) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.X + ", photoSize=" + this.f18227Y + ", photoPresentationTimestampUs=" + this.Z + ", videoStartPosition=" + this.e0 + ", videoSize=" + this.f0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.X);
        parcel.writeLong(this.f18227Y);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.e0);
        parcel.writeLong(this.f0);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.X = parcel.readLong();
        this.f18227Y = parcel.readLong();
        this.Z = parcel.readLong();
        this.e0 = parcel.readLong();
        this.f0 = parcel.readLong();
    }
}
