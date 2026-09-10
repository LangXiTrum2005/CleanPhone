package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.common.base.Charsets;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6919Y;
    public final String Z;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final byte[] i0;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.flac.PictureFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    }

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.X = i2;
        this.f6919Y = str;
        this.Z = str2;
        this.e0 = i3;
        this.f0 = i4;
        this.g0 = i5;
        this.h0 = i6;
        this.i0 = bArr;
    }

    public static PictureFrame a(ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        String strL = MimeTypes.l(parsableByteArray.s(parsableByteArray.g(), Charsets.f19703a));
        String strS = parsableByteArray.s(parsableByteArray.g(), Charsets.f19705c);
        int iG2 = parsableByteArray.g();
        int iG3 = parsableByteArray.g();
        int iG4 = parsableByteArray.g();
        int iG5 = parsableByteArray.g();
        int iG6 = parsableByteArray.g();
        byte[] bArr = new byte[iG6];
        parsableByteArray.e(bArr, 0, iG6);
        return new PictureFrame(iG, strL, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.X == pictureFrame.X && this.f6919Y.equals(pictureFrame.f6919Y) && this.Z.equals(pictureFrame.Z) && this.e0 == pictureFrame.e0 && this.f0 == pictureFrame.f0 && this.g0 == pictureFrame.g0 && this.h0 == pictureFrame.h0 && Arrays.equals(this.i0, pictureFrame.i0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.i0) + ((((((((a.b(this.Z, a.b(this.f6919Y, (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.X) * 31, 31), 31) + this.e0) * 31) + this.f0) * 31) + this.g0) * 31) + this.h0) * 31);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        builder.a(this.X, this.i0);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f6919Y + ", description=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
        parcel.writeString(this.f6919Y);
        parcel.writeString(this.Z);
        parcel.writeInt(this.e0);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeByteArray(this.i0);
    }

    public PictureFrame(Parcel parcel) {
        this.X = parcel.readInt();
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.f6919Y = string;
        this.Z = parcel.readString();
        this.e0 = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readInt();
        this.h0 = parcel.readInt();
        this.i0 = parcel.createByteArray();
    }
}
