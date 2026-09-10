package com.google.android.gms.internal.auth;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o1 f22883e = new o1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f22885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f22886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22887d;

    public o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f22884a = i10;
        this.f22885b = iArr;
        this.f22886c = objArr;
        this.f22887d = z10;
    }

    public static o1 a() {
        return new o1(0, new int[8], new Object[8], true);
    }

    public final void b(int i10, Object obj) {
        if (!this.f22887d) {
            throw new UnsupportedOperationException();
        }
        c(this.f22884a + 1);
        int[] iArr = this.f22885b;
        int i11 = this.f22884a;
        iArr[i11] = i10;
        this.f22886c[i11] = obj;
        this.f22884a = i11 + 1;
    }

    public final void c(int i10) {
        int[] iArr = this.f22885b;
        if (i10 > iArr.length) {
            int i11 = this.f22884a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f22885b = Arrays.copyOf(iArr, i10);
            this.f22886c = Arrays.copyOf(this.f22886c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f22884a;
        if (i10 == o1Var.f22884a) {
            int[] iArr = this.f22885b;
            int[] iArr2 = o1Var.f22885b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f22886c;
            Object[] objArr2 = o1Var.f22886c;
            int i12 = this.f22884a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f22884a;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f22885b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f22886c;
        int i15 = this.f22884a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }
}
