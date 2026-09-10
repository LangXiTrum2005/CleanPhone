package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6926Y;
    public final String Z;
    public final int e0;
    public final byte[] f0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.ApicFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i2) {
            return new ApicFrame[i2];
        }
    }

    public ApicFrame(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f6926Y = str;
        this.Z = str2;
        this.e0 = i2;
        this.f0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.e0 == apicFrame.e0 && Util.a(this.f6926Y, apicFrame.f6926Y) && Util.a(this.Z, apicFrame.Z) && Arrays.equals(this.f0, apicFrame.f0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.e0) * 31;
        String str = this.f6926Y;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        return Arrays.hashCode(this.f0) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        builder.a(this.e0, this.f0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": mimeType=" + this.f6926Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6926Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.e0);
        parcel.writeByteArray(this.f0);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.f6926Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readInt();
        this.f0 = parcel.createByteArray();
    }
}
