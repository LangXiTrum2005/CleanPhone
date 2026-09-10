package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18215Y;
    public final String Z;
    public final String e0;
    public final byte[] f0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i2) {
            return new GeobFrame[i2];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f18215Y = str;
        this.Z = str2;
        this.e0 = str3;
        this.f0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeobFrame.class == obj.getClass()) {
            GeobFrame geobFrame = (GeobFrame) obj;
            if (Util.a(this.f18215Y, geobFrame.f18215Y) && Util.a(this.Z, geobFrame.Z) && Util.a(this.e0, geobFrame.e0) && Arrays.equals(this.f0, geobFrame.f0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18215Y;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Z;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e0;
        return Arrays.hashCode(this.f0) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": mimeType=" + this.f18215Y + ", filename=" + this.Z + ", description=" + this.e0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f18215Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.e0);
        parcel.writeByteArray(this.f0);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.f18215Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.createByteArray();
    }
}
