package com.smartdigimkt.q4;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37890c;
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37891e;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[0];
        }
    }

    public b(int i2, int i3, int i4, byte[] bArr) {
        this.f37888a = i2;
        this.f37889b = i3;
        this.f37890c = i4;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f37888a == bVar.f37888a && this.f37889b == bVar.f37889b && this.f37890c == bVar.f37890c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f37891e == 0) {
            this.f37891e = Arrays.hashCode(this.d) + ((((((this.f37888a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37889b) * 31) + this.f37890c) * 31);
        }
        return this.f37891e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f37888a);
        sb.append(", ");
        sb.append(this.f37889b);
        sb.append(", ");
        sb.append(this.f37890c);
        sb.append(", ");
        return android.support.v4.media.a.t(sb, this.d != null, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f37888a);
        parcel.writeInt(this.f37889b);
        parcel.writeInt(this.f37890c);
        f0.a(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f37888a = parcel.readInt();
        this.f37889b = parcel.readInt();
        this.f37890c = parcel.readInt();
        this.d = f0.a(parcel) ? parcel.createByteArray() : null;
    }
}
