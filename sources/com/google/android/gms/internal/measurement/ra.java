package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ra extends l9.a implements Comparable {
    public static final Parcelable.Creator<ra> CREATOR = new j7(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final va[] f23926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f23927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeMap f23928d = new TreeMap();

    public ra(int i10, va[] vaVarArr, String[] strArr) {
        this.f23925a = i10;
        this.f23926b = vaVarArr;
        for (va vaVar : vaVarArr) {
            this.f23928d.put(vaVar.f24082a, vaVar);
        }
        this.f23927c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f23925a - ((ra) obj).f23925a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return this.f23925a == raVar.f23925a && e1.b(this.f23928d, raVar.f23928d) && Arrays.equals(this.f23927c, raVar.f23927c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(");
        sb2.append(this.f23925a);
        sb2.append(", (");
        Iterator it = this.f23928d.values().iterator();
        while (it.hasNext()) {
            sb2.append((va) it.next());
            sb2.append(", ");
        }
        sb2.append("), (");
        String[] strArr = this.f23927c;
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(", ");
            }
        } else {
            sb2.append("null");
        }
        sb2.append("))");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f23925a);
        r9.b.N(parcel, 3, this.f23926b, i10);
        r9.b.K(parcel, 4, this.f23927c);
        r9.b.S(parcel, iR);
    }
}
