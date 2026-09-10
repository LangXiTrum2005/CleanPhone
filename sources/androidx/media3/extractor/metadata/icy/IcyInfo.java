package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new AnonymousClass1();
    public final byte[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6925Y;
    public final String Z;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.icy.IcyInfo$1, reason: invalid class name */
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
        this.f6925Y = str;
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

    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        String str = this.f6925Y;
        if (str != null) {
            builder.f5476a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.f6925Y + "\", url=\"" + this.Z + "\", rawMetadata.length=\"" + this.X.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.X);
        parcel.writeString(this.f6925Y);
        parcel.writeString(this.Z);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.X = bArrCreateByteArray;
        this.f6925Y = parcel.readString();
        this.Z = parcel.readString();
    }
}
