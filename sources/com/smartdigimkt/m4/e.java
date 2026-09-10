package com.smartdigimkt.m4;

import android.util.Pair;
import com.smartdigimkt.j4.e0;
import com.smartdigimkt.j4.f0;
import com.smartdigimkt.w3.a0;
import com.smartdigimkt.w3.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f36679b;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f36680h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f36681i = 1;
        public static final int j = 2;
        public static final int k = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public final int f36682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f36684c;
        private final f0[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f36685e;
        private final int[][][] f;
        private final f0 g;

        /* JADX INFO: renamed from: com.smartdigimkt.m4.e$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0542a {
        }

        public a(int[] iArr, f0[] f0VarArr, int[] iArr2, int[][][] iArr3, f0 f0Var) {
            this.f36684c = iArr;
            this.d = f0VarArr;
            this.f = iArr3;
            this.f36685e = iArr2;
            this.g = f0Var;
            int length = iArr.length;
            this.f36683b = length;
            this.f36682a = length;
        }

        public int a() {
            return this.f36683b;
        }

        public int b(int i2) {
            return this.f36684c[i2];
        }

        public f0 c(int i2) {
            return this.d[i2];
        }

        @Deprecated
        public int d(int i2) {
            return e(i2);
        }

        public int e(int i2) {
            int iMax = 0;
            for (int i3 = 0; i3 < this.f36683b; i3++) {
                if (this.f36684c[i3] == i2) {
                    iMax = Math.max(iMax, a(i3));
                }
            }
            return iMax;
        }

        public int a(int i2) {
            int i3;
            int iMax = 0;
            for (int[] iArr : this.f[i2]) {
                int i4 = 0;
                while (true) {
                    if (i4 < iArr.length) {
                        int i5 = iArr[i4] & 7;
                        if (i5 == 3) {
                            i3 = 2;
                        } else {
                            if (i5 == 4) {
                                return 3;
                            }
                            i3 = 1;
                        }
                        iMax = Math.max(iMax, i3);
                        i4++;
                    }
                }
            }
            return iMax;
        }

        public int b(int i2, int i3, int i4) {
            return this.f[i2][i3][i4] & 7;
        }

        public f0 c() {
            return this.g;
        }

        @Deprecated
        public f0 b() {
            return c();
        }

        @Deprecated
        public int a(int i2, int i3, int i4) {
            return b(i2, i3, i4);
        }

        public int a(int i2, int i3, boolean z2) {
            int i4 = this.d[i2].a(i3).f35964a;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int iB = b(i2, i3, i6);
                if (iB == 4 || (z2 && iB == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return a(i2, i3, Arrays.copyOf(iArr, i5));
        }

        public int a(int i2, int i3, int[] iArr) {
            int i4 = 0;
            int iMin = 16;
            String str = null;
            boolean z2 = false;
            int i5 = 0;
            while (i4 < iArr.length) {
                String str2 = this.d[i2].a(i3).a(iArr[i4]).f;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z2 |= !com.smartdigimkt.p4.f0.a((Object) str, (Object) str2);
                }
                iMin = Math.min(iMin, this.f[i2][i3][i4] & 24);
                i4++;
                i5 = i6;
            }
            return z2 ? Math.min(iMin, this.f36685e[i2]) : iMin;
        }
    }

    public abstract Pair<a0[], f[]> a(a aVar, int[][][] iArr, int[] iArr2) throws com.smartdigimkt.w3.g;

    @Override // com.smartdigimkt.m4.h
    public final void a(Object obj) {
        this.f36679b = (a) obj;
    }

    public final a b() {
        return this.f36679b;
    }

    @Override // com.smartdigimkt.m4.h
    public final i a(z[] zVarArr, f0 f0Var) throws com.smartdigimkt.w3.g {
        int[] iArr = new int[zVarArr.length + 1];
        int length = zVarArr.length + 1;
        e0[][] e0VarArr = new e0[length][];
        int[][][] iArr2 = new int[zVarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = f0Var.f35974a;
            e0VarArr[i2] = new e0[i3];
            iArr2[i2] = new int[i3][];
        }
        int[] iArrA = a(zVarArr);
        for (int i4 = 0; i4 < f0Var.f35974a; i4++) {
            e0 e0VarA = f0Var.a(i4);
            int iA = a(zVarArr, e0VarA);
            int[] iArrA2 = iA == zVarArr.length ? new int[e0VarA.f35964a] : a(zVarArr[iA], e0VarA);
            int i5 = iArr[iA];
            e0VarArr[iA][i5] = e0VarA;
            iArr2[iA][i5] = iArrA2;
            iArr[iA] = i5 + 1;
        }
        f0[] f0VarArr = new f0[zVarArr.length];
        int[] iArr3 = new int[zVarArr.length];
        for (int i6 = 0; i6 < zVarArr.length; i6++) {
            int i7 = iArr[i6];
            f0VarArr[i6] = new f0((e0[]) com.smartdigimkt.p4.f0.a(e0VarArr[i6], i7));
            iArr2[i6] = (int[][]) com.smartdigimkt.p4.f0.a(iArr2[i6], i7);
            iArr3[i6] = zVarArr[i6].e();
        }
        a aVar = new a(iArr3, f0VarArr, iArrA, iArr2, new f0((e0[]) com.smartdigimkt.p4.f0.a(e0VarArr[zVarArr.length], iArr[zVarArr.length])));
        Pair<a0[], f[]> pairA = a(aVar, iArr2, iArrA);
        return new i((a0[]) pairA.first, (f[]) pairA.second, aVar);
    }

    private static int a(z[] zVarArr, e0 e0Var) throws com.smartdigimkt.w3.g {
        int length = zVarArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < zVarArr.length; i3++) {
            z zVar = zVarArr[i3];
            for (int i4 = 0; i4 < e0Var.f35964a; i4++) {
                int iA = zVar.a(e0Var.a(i4)) & 7;
                if (iA > i2) {
                    if (iA == 4) {
                        return i3;
                    }
                    length = i3;
                    i2 = iA;
                }
            }
        }
        return length;
    }

    private static int[] a(z zVar, e0 e0Var) throws com.smartdigimkt.w3.g {
        int[] iArr = new int[e0Var.f35964a];
        for (int i2 = 0; i2 < e0Var.f35964a; i2++) {
            iArr[i2] = zVar.a(e0Var.a(i2));
        }
        return iArr;
    }

    private static int[] a(z[] zVarArr) throws com.smartdigimkt.w3.g {
        int length = zVarArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = zVarArr[i2].g();
        }
        return iArr;
    }
}
