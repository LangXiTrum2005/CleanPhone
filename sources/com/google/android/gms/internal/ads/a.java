package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri[] f11785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5[] f11786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f11788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f11789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hf[] f11790g;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public a(int i10, int[] iArr, f5[] f5VarArr, long[] jArr, String[] strArr, hf[] hfVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = f5VarArr.length;
        int i11 = 0;
        ps1.v(length == length2);
        ps1.v(length == hfVarArr.length);
        this.f11784a = i10;
        this.f11787d = iArr;
        this.f11786c = f5VarArr;
        this.f11788e = jArr;
        this.f11785b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f11785b;
            if (i11 >= uriArr.length) {
                this.f11789f = strArr;
                this.f11790g = hfVarArr;
                return;
            }
            f5 f5Var = f5VarArr[i11];
            if (f5Var == null) {
                uri = null;
            } else {
                l2 l2Var = f5Var.f14214b;
                l2Var.getClass();
                uri = l2Var.f16671a;
            }
            uriArr[i11] = uri;
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f11784a == aVar.f11784a && Arrays.equals(this.f11786c, aVar.f11786c) && Arrays.equals(this.f11787d, aVar.f11787d) && Arrays.equals(this.f11788e, aVar.f11788e) && Arrays.equals(this.f11789f, aVar.f11789f) && Arrays.equals(this.f11790g, aVar.f11790g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11790g) + ((((Arrays.hashCode(this.f11788e) + ((Arrays.hashCode(this.f11787d) + ((Arrays.hashCode(this.f11786c) + (((this.f11784a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f11789f)) * 31)) * 31;
    }
}
