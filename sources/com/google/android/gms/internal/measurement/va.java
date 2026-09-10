package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class va extends l9.a implements Comparable {
    public static final Parcelable.Creator<va> CREATOR = new j7(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f24085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f24087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24090i;

    public va(String str, long j10, boolean z10, double d10, String str2, byte[] bArr, int i10, int i11, int i12) {
        this.f24082a = str;
        this.f24083b = j10;
        this.f24084c = z10;
        this.f24085d = d10;
        this.f24086e = str2;
        this.f24087f = bArr;
        this.f24088g = i10;
        this.f24089h = i11;
        this.f24090i = i12;
    }

    public final void b(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.f24082a;
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f24088g;
        if (i10 == 1) {
            sb2.append(this.f24083b);
        } else if (i10 == 2) {
            sb2.append(this.f24084c);
        } else if (i10 == 3) {
            sb2.append(this.f24085d);
        } else if (i10 == 4) {
            sb2.append("'");
            String str2 = this.f24086e;
            k9.c0.h(str2);
            sb2.append(str2);
            sb2.append("'");
        } else {
            if (i10 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i10).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i10);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            byte[] bArr = this.f24087f;
            k9.c0.h(bArr);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(this.f24089h);
        sb2.append(", ");
        sb2.append(this.f24090i);
        sb2.append(")");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i10;
        va vaVar = (va) obj;
        int iCompareTo = this.f24082a.compareTo(vaVar.f24082a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i11 = vaVar.f24088g;
        int i12 = this.f24088g;
        if (i12 < i11) {
            i10 = -1;
        } else {
            i10 = i12 != i11 ? 1 : 0;
        }
        if (i10 != 0) {
            return i10;
        }
        if (i12 == 1) {
            long j10 = this.f24083b;
            long j11 = vaVar.f24083b;
            if (j10 >= j11) {
                if (j10 == j11) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i12 == 2) {
            boolean z10 = vaVar.f24084c;
            boolean z11 = this.f24084c;
            if (z11 != z10) {
                if (z11) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i12 == 3) {
            return Double.compare(this.f24085d, vaVar.f24085d);
        }
        if (i12 == 4) {
            String str = vaVar.f24086e;
            String str2 = this.f24086e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i12 != 5) {
            throw new AssertionError(l1.d.k(new StringBuilder(String.valueOf(i12).length() + 20), "Invalid enum value: ", i12));
        }
        byte[] bArr = vaVar.f24087f;
        byte[] bArr2 = this.f24087f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i13 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i13 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i14 = bArr2[i13] - bArr[i13];
                        if (i14 != 0) {
                            return i14;
                        }
                        i13++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof va) {
            va vaVar = (va) obj;
            if (e1.b(this.f24082a, vaVar.f24082a)) {
                int i10 = vaVar.f24088g;
                int i11 = this.f24088g;
                if (i11 == i10 && this.f24089h == vaVar.f24089h && this.f24090i == vaVar.f24090i) {
                    if (i11 == 1) {
                        return this.f24083b == vaVar.f24083b;
                    }
                    if (i11 == 2) {
                        return this.f24084c == vaVar.f24084c;
                    }
                    if (i11 == 3) {
                        return this.f24085d == vaVar.f24085d;
                    }
                    if (i11 == 4) {
                        return e1.b(this.f24086e, vaVar.f24086e);
                    }
                    if (i11 == 5) {
                        return Arrays.equals(this.f24087f, vaVar.f24087f);
                    }
                    throw new AssertionError(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 20), "Invalid enum value: ", i11));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f24082a;
        boolean z10 = str == null;
        int iR = r9.b.R(parcel, 20293);
        if (!z10) {
            r9.b.J(parcel, 2, str);
        }
        long j10 = this.f24083b;
        if (j10 != 0) {
            r9.b.Q(parcel, 3, 8);
            parcel.writeLong(j10);
        }
        if (this.f24084c) {
            r9.b.Q(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d10 = this.f24085d;
        if (d10 != 0.0d) {
            r9.b.Q(parcel, 5, 8);
            parcel.writeDouble(d10);
        }
        String str2 = this.f24086e;
        if (str2 != null) {
            r9.b.J(parcel, 6, str2);
        }
        byte[] bArr = this.f24087f;
        if (bArr != null) {
            r9.b.D(parcel, 7, bArr);
        }
        int i11 = this.f24088g;
        if (i11 != 0) {
            r9.b.Q(parcel, 8, 4);
            parcel.writeInt(i11);
        }
        int i12 = this.f24089h;
        if (i12 != 0) {
            r9.b.Q(parcel, 9, 4);
            parcel.writeInt(i12);
        }
        int i13 = this.f24090i;
        if (i13 != 0) {
            r9.b.Q(parcel, 10, 4);
            parcel.writeInt(i13);
        }
        r9.b.S(parcel, iR);
    }
}
