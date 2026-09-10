package com.smartdigimkt.w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.p4.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements Parcelable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f39329B = -1;
    public static final long C = Long.MAX_VALUE;
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f39330A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39333c;
    public final com.smartdigimkt.e4.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39334e;
    public final String f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<byte[]> f39335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.smartdigimkt.a4.e f39336i;
    public final long j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f39337l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f39338n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f39339p;
    public final byte[] q;
    public final com.smartdigimkt.q4.b r;
    public final int s;
    public final int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f39340u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f39341w;
    public final int x;
    public final String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f39342z;

    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public m(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f, int i6, float f2, byte[] bArr, int i7, com.smartdigimkt.q4.b bVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j, List<byte[]> list, com.smartdigimkt.a4.e eVar, com.smartdigimkt.e4.a aVar) {
        this.f39331a = str;
        this.f39334e = str2;
        this.f = str3;
        this.f39333c = str4;
        this.f39332b = i2;
        this.g = i3;
        this.k = i4;
        this.f39337l = i5;
        this.m = f;
        this.f39338n = i6 == -1 ? 0 : i6;
        this.o = f2 == -1.0f ? 1.0f : f2;
        this.q = bArr;
        this.f39339p = i7;
        this.r = bVar;
        this.s = i8;
        this.t = i9;
        this.f39340u = i10;
        int i15 = i11;
        this.v = i15 == -1 ? 0 : i15;
        this.f39341w = i12 != -1 ? i12 : 0;
        this.x = i13;
        this.y = str5;
        this.f39342z = i14;
        this.j = j;
        this.f39335h = list == null ? Collections.EMPTY_LIST : list;
        this.f39336i = eVar;
        this.d = aVar;
    }

    public static m a(String str, String str2, String str3, String str4, int i2, int i3, int i4, float f, List<byte[]> list, int i5) {
        return new m(str, str2, str3, str4, i2, -1, i3, i4, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static m b(String str, String str2, String str3, String str4, int i2, int i3, String str5) {
        return a(str, str2, str3, str4, i2, i3, str5, -1);
    }

    public static String c(m mVar) {
        if (mVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder("id=");
        sb.append(mVar.f39331a);
        sb.append(", mimeType=");
        sb.append(mVar.f);
        if (mVar.f39332b != -1) {
            sb.append(", bitrate=");
            sb.append(mVar.f39332b);
        }
        if (mVar.k != -1 && mVar.f39337l != -1) {
            sb.append(", res=");
            sb.append(mVar.k);
            sb.append("x");
            sb.append(mVar.f39337l);
        }
        if (mVar.m != -1.0f) {
            sb.append(", fps=");
            sb.append(mVar.m);
        }
        if (mVar.s != -1) {
            sb.append(", channels=");
            sb.append(mVar.s);
        }
        if (mVar.t != -1) {
            sb.append(", sample_rate=");
            sb.append(mVar.t);
        }
        if (mVar.y != null) {
            sb.append(", language=");
            sb.append(mVar.y);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f39332b == mVar.f39332b && this.g == mVar.g && this.k == mVar.k && this.f39337l == mVar.f39337l && this.m == mVar.m && this.f39338n == mVar.f39338n && this.o == mVar.o && this.f39339p == mVar.f39339p && this.s == mVar.s && this.t == mVar.t && this.f39340u == mVar.f39340u && this.v == mVar.v && this.f39341w == mVar.f39341w && this.j == mVar.j && this.x == mVar.x && f0.a((Object) this.f39331a, (Object) mVar.f39331a) && f0.a((Object) this.y, (Object) mVar.y) && this.f39342z == mVar.f39342z && f0.a((Object) this.f39334e, (Object) mVar.f39334e) && f0.a((Object) this.f, (Object) mVar.f) && f0.a((Object) this.f39333c, (Object) mVar.f39333c) && f0.a(this.f39336i, mVar.f39336i) && f0.a(this.d, mVar.d) && f0.a(this.r, mVar.r) && Arrays.equals(this.q, mVar.q) && b(mVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f39330A == 0) {
            String str = this.f39331a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f39334e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f39333c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f39332b) * 31) + this.k) * 31) + this.f39337l) * 31) + this.s) * 31) + this.t) * 31;
            String str5 = this.y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f39342z) * 31;
            com.smartdigimkt.a4.e eVar = this.f39336i;
            int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            com.smartdigimkt.e4.a aVar = this.d;
            this.f39330A = iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }
        return this.f39330A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f39331a);
        sb.append(", ");
        sb.append(this.f39334e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.f39332b);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", [");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.f39337l);
        sb.append(", ");
        sb.append(this.m);
        sb.append("], [");
        sb.append(this.s);
        sb.append(", ");
        return android.support.v4.media.a.i(this.t, "])", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f39331a);
        parcel.writeString(this.f39334e);
        parcel.writeString(this.f);
        parcel.writeString(this.f39333c);
        parcel.writeInt(this.f39332b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f39337l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.f39338n);
        parcel.writeFloat(this.o);
        f0.a(parcel, this.q != null);
        byte[] bArr = this.q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f39339p);
        parcel.writeParcelable(this.r, i2);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.f39340u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.f39341w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.f39342z);
        parcel.writeLong(this.j);
        int size = this.f39335h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f39335h.get(i3));
        }
        parcel.writeParcelable(this.f39336i, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f, List<byte[]> list, com.smartdigimkt.a4.e eVar) {
        return a(str, str2, str3, i2, i3, i4, i5, f, list, -1, -1.0f, eVar);
    }

    public m b(int i2) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, this.g, this.k, this.f39337l, this.m, i2, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, this.x, this.y, this.f39342z, this.j, this.f39335h, this.f39336i, this.d);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f, List<byte[]> list, int i6, float f2, com.smartdigimkt.a4.e eVar) {
        return a(str, str2, str3, i2, i3, i4, i5, f, list, i6, f2, (byte[]) null, -1, (com.smartdigimkt.q4.b) null, eVar);
    }

    public boolean b(m mVar) {
        if (this.f39335h.size() != mVar.f39335h.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f39335h.size(); i2++) {
            if (!Arrays.equals(this.f39335h.get(i2), mVar.f39335h.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f, List<byte[]> list, int i6, float f2, byte[] bArr, int i7, com.smartdigimkt.q4.b bVar, com.smartdigimkt.a4.e eVar) {
        return new m(str, null, str2, str3, i2, i3, i4, i5, f, i6, f2, bArr, i7, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, eVar, null);
    }

    public static m a(String str, String str2, String str3, String str4, int i2, int i3, int i4, List<byte[]> list, int i5, String str5) {
        return new m(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, i5, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, com.smartdigimkt.a4.e eVar, int i6, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, -1, list, eVar, i6, str4);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, com.smartdigimkt.a4.e eVar, int i7, String str4) {
        return a(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, eVar, i7, str4, (com.smartdigimkt.e4.a) null);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, com.smartdigimkt.a4.e eVar, int i9, String str4, com.smartdigimkt.e4.a aVar) {
        return new m(str, null, str2, str3, i2, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, i9, str4, -1, Long.MAX_VALUE, list, eVar, aVar);
    }

    public static m a(String str, String str2, String str3, String str4, int i2, int i3, String str5, int i4) {
        return new m(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str5, i4, Long.MAX_VALUE, null, null, null);
    }

    public static m a(String str, String str2, int i2, String str3) {
        return a(str, str2, i2, str3, (com.smartdigimkt.a4.e) null);
    }

    public static m a(String str, String str2, int i2, String str3, com.smartdigimkt.a4.e eVar) {
        return a(str, str2, (String) null, -1, i2, str3, -1, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, String str4, int i4, com.smartdigimkt.a4.e eVar) {
        return a(str, str2, str3, i2, i3, str4, i4, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, String str4, com.smartdigimkt.a4.e eVar, long j) {
        return a(str, str2, str3, i2, i3, str4, -1, eVar, j, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, String str4, int i4, com.smartdigimkt.a4.e eVar, long j, List<byte[]> list) {
        return new m(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, i4, j, list, eVar, null);
    }

    public static m a(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, com.smartdigimkt.a4.e eVar) {
        return new m(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, Long.MAX_VALUE, list, eVar, null);
    }

    public static m a(String str, String str2, String str3, String str4, int i2, int i3, String str5) {
        return new m(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static m a(String str, String str2, long j) {
        return new m(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static m a(String str, String str2, String str3, int i2, com.smartdigimkt.a4.e eVar) {
        return new m(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, eVar, null);
    }

    public m a(int i2) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, i2, this.k, this.f39337l, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, this.x, this.y, this.f39342z, this.j, this.f39335h, this.f39336i, this.d);
    }

    public m a(long j) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, this.g, this.k, this.f39337l, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, this.x, this.y, this.f39342z, j, this.f39335h, this.f39336i, this.d);
    }

    public m a(String str, String str2, String str3, int i2, int i3, int i4, int i5, String str4) {
        return new m(str, this.f39334e, str2, str3, i2, this.g, i3, i4, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, i5, str4, this.f39342z, this.j, this.f39335h, this.f39336i, this.d);
    }

    public m a(m mVar) {
        if (this == mVar) {
            return this;
        }
        String str = mVar.f39331a;
        String str2 = this.f39333c;
        if (str2 == null) {
            str2 = mVar.f39333c;
        }
        String str3 = str2;
        int i2 = this.f39332b;
        if (i2 == -1) {
            i2 = mVar.f39332b;
        }
        int i3 = i2;
        float f = this.m;
        if (f == -1.0f) {
            f = mVar.m;
        }
        float f2 = f;
        int i4 = this.x | mVar.x;
        String str4 = this.y;
        if (str4 == null) {
            str4 = mVar.y;
        }
        return new m(str, this.f39334e, this.f, str3, i3, this.g, this.k, this.f39337l, f2, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, i4, str4, this.f39342z, this.j, this.f39335h, com.smartdigimkt.a4.e.a(mVar.f39336i, this.f39336i), this.d);
    }

    public m(Parcel parcel) {
        this.f39331a = parcel.readString();
        this.f39334e = parcel.readString();
        this.f = parcel.readString();
        this.f39333c = parcel.readString();
        this.f39332b = parcel.readInt();
        this.g = parcel.readInt();
        this.k = parcel.readInt();
        this.f39337l = parcel.readInt();
        this.m = parcel.readFloat();
        this.f39338n = parcel.readInt();
        this.o = parcel.readFloat();
        this.q = f0.a(parcel) ? parcel.createByteArray() : null;
        this.f39339p = parcel.readInt();
        this.r = (com.smartdigimkt.q4.b) parcel.readParcelable(com.smartdigimkt.q4.b.class.getClassLoader());
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.f39340u = parcel.readInt();
        this.v = parcel.readInt();
        this.f39341w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.f39342z = parcel.readInt();
        this.j = parcel.readLong();
        int i2 = parcel.readInt();
        this.f39335h = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f39335h.add(parcel.createByteArray());
        }
        this.f39336i = (com.smartdigimkt.a4.e) parcel.readParcelable(com.smartdigimkt.a4.e.class.getClassLoader());
        this.d = (com.smartdigimkt.e4.a) parcel.readParcelable(com.smartdigimkt.e4.a.class.getClassLoader());
    }

    public m a(int i2, int i3) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, this.g, this.k, this.f39337l, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, i2, i3, this.x, this.y, this.f39342z, this.j, this.f39335h, this.f39336i, this.d);
    }

    public m a(com.smartdigimkt.a4.e eVar) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, this.g, this.k, this.f39337l, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, this.x, this.y, this.f39342z, this.j, this.f39335h, eVar, this.d);
    }

    public m a(com.smartdigimkt.e4.a aVar) {
        return new m(this.f39331a, this.f39334e, this.f, this.f39333c, this.f39332b, this.g, this.k, this.f39337l, this.m, this.f39338n, this.o, this.q, this.f39339p, this.r, this.s, this.t, this.f39340u, this.v, this.f39341w, this.x, this.y, this.f39342z, this.j, this.f39335h, this.f39336i, aVar);
    }

    public int a() {
        int i2;
        int i3 = this.k;
        if (i3 == -1 || (i2 = this.f39337l) == -1) {
            return -1;
        }
        return i3 * i2;
    }
}
