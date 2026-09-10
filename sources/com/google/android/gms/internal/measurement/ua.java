package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends l9.a {
    public static final Parcelable.Creator<ua> CREATOR = new j7(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f24027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[][] f24028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[][] f24029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f24030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f24031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[][] f24032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f24033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[][] f24034j;

    public ua(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f24025a = str;
        this.f24026b = bArr;
        this.f24027c = bArr2;
        this.f24028d = bArr3;
        this.f24029e = bArr4;
        this.f24030f = bArr5;
        this.f24031g = iArr;
        this.f24032h = bArr6;
        this.f24033i = iArr2;
        this.f24034j = bArr7;
    }

    public static void b(StringBuilder sb2, String str, byte[][] bArr) {
        sb2.append(str);
        sb2.append(X3.j.f27830b);
        if (bArr == null) {
            sb2.append("null");
            return;
        }
        sb2.append("(");
        boolean z10 = true;
        int i10 = 0;
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append("'");
            k9.c0.h(bArr2);
            sb2.append(Base64.encodeToString(bArr2, 3));
            sb2.append("'");
            i10++;
            z10 = false;
        }
        sb2.append(")");
    }

    public static Set m(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(oa.q.a(length));
        for (byte[] bArr2 : bArr) {
            k9.c0.h(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List n(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i10 = 0; i10 < iArr.length; i10 += 2) {
            arrayList.add(new ya(iArr[i10], iArr[i10 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object hashSet;
        Object hashSet2;
        int length;
        int length2;
        if (obj instanceof ua) {
            ua uaVar = (ua) obj;
            if (e1.b(this.f24025a, uaVar.f24025a) && e1.b(h(), uaVar.h()) && e1.b(m(this.f24027c), m(uaVar.f24027c)) && e1.b(m(this.f24028d), m(uaVar.f24028d)) && e1.b(m(this.f24029e), m(uaVar.f24029e)) && e1.b(m(this.f24030f), m(uaVar.f24030f))) {
                int[] iArr = this.f24031g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    hashSet = new HashSet(oa.q.a(length2));
                    for (int i10 : iArr) {
                        hashSet.add(Integer.valueOf(i10));
                    }
                }
                int[] iArr2 = uaVar.f24031g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    hashSet2 = new HashSet(oa.q.a(length));
                    for (int i11 : iArr2) {
                        hashSet2.add(Integer.valueOf(i11));
                    }
                }
                if (e1.b(hashSet, hashSet2) && e1.b(n(this.f24033i), n(uaVar.f24033i)) && e1.b(m(this.f24034j), m(uaVar.f24034j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set h() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f24032h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f24026b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f24025a;
        sb2.append(str == null ? "null" : q4.a.j(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb2.append(", direct==");
        byte[] bArr = this.f24026b;
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        b(sb2, "GAIA=", this.f24027c);
        sb2.append(", ");
        b(sb2, "PSEUDO=", this.f24028d);
        sb2.append(", ");
        b(sb2, "ALWAYS=", this.f24029e);
        sb2.append(", ");
        b(sb2, "OTHER=", this.f24030f);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.f24031g));
        sb2.append(", ");
        b(sb2, "directs=", this.f24032h);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(n(this.f24033i).toArray()));
        sb2.append(", ");
        b(sb2, "external=", this.f24034j);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f24025a);
        r9.b.D(parcel, 3, this.f24026b);
        r9.b.E(parcel, 4, this.f24027c);
        r9.b.E(parcel, 5, this.f24028d);
        r9.b.E(parcel, 6, this.f24029e);
        r9.b.E(parcel, 7, this.f24030f);
        r9.b.G(parcel, 8, this.f24031g);
        r9.b.E(parcel, 9, this.f24032h);
        r9.b.G(parcel, 10, this.f24033i);
        r9.b.E(parcel, 11, this.f24034j);
        r9.b.S(parcel, iR);
    }
}
