package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new AnonymousClass1();
    public final float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f18229Y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i2) {
            return new SmtaMetadataEntry[i2];
        }
    }

    public SmtaMetadataEntry(float f, int i2) {
        this.X = f;
        this.f18229Y = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.X == smtaMetadataEntry.X && this.f18229Y == smtaMetadataEntry.f18229Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.X).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f18229Y;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.X + ", svcTemporalLayerCount=" + this.f18229Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.X);
        parcel.writeInt(this.f18229Y);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.X = parcel.readFloat();
        this.f18229Y = parcel.readInt();
    }
}
