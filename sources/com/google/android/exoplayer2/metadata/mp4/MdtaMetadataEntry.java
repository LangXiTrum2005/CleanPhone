package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final byte[] f18226Y;
    public final int Z;
    public final int e0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$1, reason: invalid class name */
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
        this.f18226Y = bArr;
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
            if (this.X.equals(mdtaMetadataEntry.X) && Arrays.equals(this.f18226Y, mdtaMetadataEntry.f18226Y) && this.Z == mdtaMetadataEntry.Z && this.e0 == mdtaMetadataEntry.e0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f18226Y) + a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.Z) * 31) + this.e0;
    }

    public final String toString() {
        return "mdta: key=" + this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeByteArray(this.f18226Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.e0);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i2 = Util.f18979a;
        this.X = string;
        this.f18226Y = parcel.createByteArray();
        this.Z = parcel.readInt();
        this.e0 = parcel.readInt();
    }
}
