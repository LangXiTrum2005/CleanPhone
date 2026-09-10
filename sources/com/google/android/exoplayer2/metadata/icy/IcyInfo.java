package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new AnonymousClass1();
    public final byte[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f18209Y;
    public final String Z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.icy.IcyInfo$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i2) {
            return new IcyInfo[i2];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.X = bArr;
        this.f18209Y = str;
        this.Z = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.X, ((IcyInfo) obj).X);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void l(MediaMetadata.Builder builder) {
        String str = this.f18209Y;
        if (str != null) {
            builder.f17125a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.f18209Y + "\", url=\"" + this.Z + "\", rawMetadata.length=\"" + this.X.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.X);
        parcel.writeString(this.f18209Y);
        parcel.writeString(this.Z);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.X = bArrCreateByteArray;
        this.f18209Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
