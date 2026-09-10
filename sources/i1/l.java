package i1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f42570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f42573e;

    public l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f42570b = uuid;
        this.f42571c = str;
        str2.getClass();
        this.f42572d = d0.n(str2);
        this.f42573e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f42571c, lVar.f42571c) && Objects.equals(this.f42572d, lVar.f42572d) && Objects.equals(this.f42570b, lVar.f42570b) && Arrays.equals(this.f42573e, lVar.f42573e);
    }

    public final int hashCode() {
        if (this.f42569a == 0) {
            int iHashCode = this.f42570b.hashCode() * 31;
            String str = this.f42571c;
            this.f42569a = Arrays.hashCode(this.f42573e) + d5.u.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f42572d);
        }
        return this.f42569a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f42570b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f42571c);
        parcel.writeString(this.f42572d);
        parcel.writeByteArray(this.f42573e);
    }

    public l(Parcel parcel) {
        this.f42570b = new UUID(parcel.readLong(), parcel.readLong());
        this.f42571c = parcel.readString();
        String string = parcel.readString();
        String str = l1.y.f44830a;
        this.f42572d = string;
        this.f42573e = parcel.createByteArray();
    }
}
