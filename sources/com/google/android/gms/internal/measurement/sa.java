package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sa extends l9.a {
    public static final Parcelable.Creator<sa> CREATOR = new j7(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ra[] f23962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f23963e = new TreeMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23965g;

    public sa(String str, String str2, ra[] raVarArr, boolean z10, byte[] bArr, long j10) {
        this.f23959a = str;
        this.f23961c = str2;
        this.f23962d = raVarArr;
        this.f23964f = z10;
        this.f23960b = bArr;
        this.f23965g = j10;
        for (ra raVar : raVarArr) {
            this.f23963e.put(Integer.valueOf(raVar.f23925a), raVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return e1.b(this.f23959a, saVar.f23959a) && e1.b(this.f23961c, saVar.f23961c) && this.f23963e.equals(saVar.f23963e) && this.f23964f == saVar.f23964f && Arrays.equals(this.f23960b, saVar.f23960b) && this.f23965g == saVar.f23965g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23959a, this.f23961c, this.f23963e, Boolean.valueOf(this.f23964f), this.f23960b, Long.valueOf(this.f23965g)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.f23959a);
        sb2.append("', '");
        sb2.append(this.f23961c);
        sb2.append("', (");
        Iterator it = this.f23963e.values().iterator();
        while (it.hasNext()) {
            sb2.append((ra) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.f23964f);
        sb2.append(", ");
        byte[] bArr = this.f23960b;
        sb2.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.f23965g);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f23959a);
        r9.b.J(parcel, 3, this.f23961c);
        r9.b.N(parcel, 4, this.f23962d, i10);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f23964f ? 1 : 0);
        r9.b.D(parcel, 6, this.f23960b);
        r9.b.Q(parcel, 7, 8);
        parcel.writeLong(this.f23965g);
        r9.b.S(parcel, iR);
    }
}
