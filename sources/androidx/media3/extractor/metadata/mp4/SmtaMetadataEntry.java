package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new AnonymousClass1();
    public final float X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f6945Y;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry$1, reason: invalid class name */
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
        this.f6945Y = i2;
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
            if (this.X == smtaMetadataEntry.X && this.f6945Y == smtaMetadataEntry.f6945Y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.X).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f6945Y;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.X + ", svcTemporalLayerCount=" + this.f6945Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.X);
        parcel.writeInt(this.f6945Y);
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.X = parcel.readFloat();
        this.f6945Y = parcel.readInt();
    }
}
