package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends l9.a implements Comparable {
    public static final Parcelable.Creator<ya> CREATOR = new j7(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24176b;

    public ya(int i10, int i11) {
        this.f24175a = i10;
        this.f24176b = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ya yaVar = (ya) obj;
        int i10 = yaVar.f24175a;
        int i11 = this.f24175a;
        if (i11 < i10) {
            return -1;
        }
        if (i11 > i10) {
            return 1;
        }
        int i12 = yaVar.f24176b;
        int i13 = this.f24176b;
        if (i13 < i12) {
            return -1;
        }
        return i13 > i12 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.ya) r3).f24175a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f24176b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.ya
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.ya r3 = (com.google.android.gms.internal.measurement.ya) r3
            int r0 = r3.f24175a
            int r1 = r2.f24175a
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f24176b
            int r2 = r2.f24176b
            if (r2 >= r3) goto L17
            goto L1c
        L17:
            if (r2 <= r3) goto L1a
            goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ya.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f24175a * 31) + this.f24176b;
    }

    public final String toString() {
        int i10 = this.f24175a;
        int length = String.valueOf(i10).length();
        int i11 = this.f24176b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 1);
        l1.d.p(sb2, "GenericDimension(", i10, ", ", i11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f24175a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f24176b);
        r9.b.S(parcel, iR);
    }
}
