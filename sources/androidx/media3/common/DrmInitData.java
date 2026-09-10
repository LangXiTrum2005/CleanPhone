package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new AnonymousClass1();
    public final SchemeData[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f5395Y;
    public final String Z;
    public final int e0;

    /* JADX INFO: renamed from: androidx.media3.common.DrmInitData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i2) {
            return new DrmInitData[i2];
        }
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    public final DrmInitData a(String str) {
        return Util.a(this.Z, str) ? this : new DrmInitData(str, false, this.X);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C.f5378a;
        if (uuid.equals(schemeData3.f5396Y)) {
            return uuid.equals(schemeData4.f5396Y) ? 0 : 1;
        }
        return schemeData3.f5396Y.compareTo(schemeData4.f5396Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Util.a(this.Z, drmInitData.Z) && Arrays.equals(this.X, drmInitData.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5395Y == 0) {
            String str = this.Z;
            this.f5395Y = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.X);
        }
        return this.f5395Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.Z);
        parcel.writeTypedArray(this.X, 0);
    }

    public DrmInitData(String str, boolean z2, SchemeData... schemeDataArr) {
        this.Z = str;
        schemeDataArr = z2 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.X = schemeDataArr;
        this.e0 = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final UUID f5396Y;
        public final String Z;
        public final String e0;
        public final byte[] f0;

        /* JADX INFO: renamed from: androidx.media3.common.DrmInitData$SchemeData$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i2) {
                return new SchemeData[i2];
            }
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f5396Y = uuid;
            this.Z = str;
            str2.getClass();
            this.e0 = MimeTypes.l(str2);
            this.f0 = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = C.f5378a;
            UUID uuid3 = this.f5396Y;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Util.a(this.Z, schemeData.Z) && Util.a(this.e0, schemeData.e0) && Util.a(this.f5396Y, schemeData.f5396Y) && Arrays.equals(this.f0, schemeData.f0);
        }

        public final int hashCode() {
            if (this.X == 0) {
                int iHashCode = this.f5396Y.hashCode() * 31;
                String str = this.Z;
                this.X = Arrays.hashCode(this.f0) + a.b(this.e0, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.X;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            UUID uuid = this.f5396Y;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.Z);
            parcel.writeString(this.e0);
            parcel.writeByteArray(this.f0);
        }

        public SchemeData(Parcel parcel) {
            this.f5396Y = new UUID(parcel.readLong(), parcel.readLong());
            this.Z = parcel.readString();
            String string = parcel.readString();
            int i2 = Util.f5683a;
            this.e0 = string;
            this.f0 = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.Z = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i2 = Util.f5683a;
        this.X = schemeDataArr;
        this.e0 = schemeDataArr.length;
    }
}
