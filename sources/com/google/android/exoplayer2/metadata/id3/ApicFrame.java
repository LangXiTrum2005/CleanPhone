package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18210Y;
    public final String Z;
    public final int e0;
    public final byte[] f0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$1, reason: invalid class name */
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
        this.f18210Y = str;
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
            if (this.e0 == apicFrame.e0 && Util.a(this.f18210Y, apicFrame.f18210Y) && Util.a(this.Z, apicFrame.Z) && Arrays.equals(this.f0, apicFrame.f0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.e0) * 31;
        String str = this.f18210Y;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        return Arrays.hashCode(this.f0) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void l(MediaMetadata.Builder builder) {
        builder.a(this.e0, this.f0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": mimeType=" + this.f18210Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f18210Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.e0);
        parcel.writeByteArray(this.f0);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.f18210Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readInt();
        this.f0 = parcel.createByteArray();
    }
}
