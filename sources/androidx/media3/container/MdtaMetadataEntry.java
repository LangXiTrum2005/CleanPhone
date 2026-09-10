package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final byte[] f5692Y;
    public final int Z;
    public final int e0;

    /* JADX INFO: renamed from: androidx.media3.container.MdtaMetadataEntry$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i2) {
            return new MdtaMetadataEntry[i2];
        }
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i2, int i3) {
        this.X = str;
        this.f5692Y = bArr;
        this.Z = i2;
        this.e0 = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.X.equals(mdtaMetadataEntry.X) && Arrays.equals(this.f5692Y, mdtaMetadataEntry.f5692Y) && this.Z == mdtaMetadataEntry.Z && this.e0 == mdtaMetadataEntry.e0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5692Y) + a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.Z) * 31) + this.e0;
    }

    public final String toString() {
        String strN;
        byte[] bArr = this.f5692Y;
        int i2 = this.e0;
        if (i2 == 1) {
            strN = Util.n(bArr);
        } else if (i2 == 23) {
            Preconditions.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            strN = String.valueOf(Float.intBitsToFloat(Ints.d(bArr[0], bArr[1], bArr[2], bArr[3])));
        } else if (i2 != 67) {
            strN = Util.S(bArr);
        } else {
            Preconditions.b(bArr.length, 4, "array too small: %s < %s", bArr.length >= 4);
            strN = String.valueOf(Ints.d(bArr[0], bArr[1], bArr[2], bArr[3]));
        }
        return android.support.v4.media.a.s(new StringBuilder("mdta: key="), this.X, ", value=", strN);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeByteArray(this.f5692Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.e0);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f5683a;
        this.X = string;
        this.f5692Y = parcel.createByteArray();
        this.Z = parcel.readInt();
        this.e0 = parcel.readInt();
    }
}
