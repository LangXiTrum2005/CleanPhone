package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: classes.dex */
class VersionedParcelParcel extends VersionedParcel {
    public final SparseIntArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f8514e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8516i;
    public int j;
    public int k;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(0), new ArrayMap(0), new ArrayMap(0));
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() {
        int i2 = this.f8516i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            Parcel parcel = this.f8514e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        Parcel parcel = this.f8514e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i2, a.r(new StringBuilder(), this.f8515h, "  "), this.f8511a, this.f8512b, this.f8513c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        return this.f8514e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() {
        Parcel parcel = this.f8514e;
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f8514e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i2) {
        while (this.j < this.g) {
            int i3 = this.k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.f8514e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
        return this.k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        return this.f8514e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return this.f8514e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() {
        return this.f8514e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i2) {
        a();
        this.f8516i = i2;
        this.d.put(i2, this.f8514e.dataPosition());
        u(0);
        u(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z2) {
        this.f8514e.writeInt(z2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) {
        Parcel parcel = this.f8514e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f8514e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i2) {
        this.f8514e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        this.f8514e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) {
        this.f8514e.writeString(str);
    }

    public VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.d = new SparseIntArray();
        this.f8516i = -1;
        this.k = -1;
        this.f8514e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.f8515h = str;
    }
}
