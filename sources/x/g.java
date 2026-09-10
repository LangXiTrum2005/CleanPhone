package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.B5;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f53498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f53499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f53500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f53501d;

    public g() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f53499b = new long[i13];
        this.f53500c = new Object[i13];
    }

    public final void a() {
        int i10 = this.f53501d;
        Object[] objArr = this.f53500c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f53501d = 0;
        this.f53498a = false;
    }

    public final Object b(long j10) {
        Object obj;
        int iB = y.a.b(this.f53499b, this.f53501d, j10);
        if (iB < 0 || (obj = this.f53500c[iB]) == h.f53502a) {
            return null;
        }
        return obj;
    }

    public final long c(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f53501d)) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f53498a) {
            long[] jArr = this.f53499b;
            Object[] objArr = this.f53500c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != h.f53502a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f53498a = false;
            this.f53501d = i12;
        }
        return this.f53499b[i10];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        n.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) objClone;
        gVar.f53499b = (long[]) this.f53499b.clone();
        gVar.f53500c = (Object[]) this.f53500c.clone();
        return gVar;
    }

    public final void d(long j10, Object obj) {
        Object obj2 = h.f53502a;
        int iB = y.a.b(this.f53499b, this.f53501d, j10);
        if (iB >= 0) {
            this.f53500c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f53501d;
        if (i10 < i11) {
            Object[] objArr = this.f53500c;
            if (objArr[i10] == obj2) {
                this.f53499b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f53498a) {
            long[] jArr = this.f53499b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f53500c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f53498a = false;
                this.f53501d = i12;
                i10 = ~y.a.b(this.f53499b, i12, j10);
            }
        }
        int i14 = this.f53501d;
        if (i14 >= this.f53499b.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f53499b, i18);
            n.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f53499b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53500c, i18);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53500c = objArrCopyOf;
        }
        int i19 = this.f53501d - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f53499b;
            int i20 = i10 + 1;
            n.f(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f53500c;
            k.e0(i20, i10, this.f53501d, objArr3, objArr3);
        }
        this.f53499b[i10] = j10;
        this.f53500c[i10] = obj;
        this.f53501d++;
    }

    public final int e() {
        if (this.f53498a) {
            int i10 = this.f53501d;
            long[] jArr = this.f53499b;
            Object[] objArr = this.f53500c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f53502a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f53498a = false;
            this.f53501d = i11;
        }
        return this.f53501d;
    }

    public final Object f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f53501d)) {
            throw new IllegalArgumentException(l1.d.e(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f53498a) {
            long[] jArr = this.f53499b;
            Object[] objArr = this.f53500c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != h.f53502a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f53498a = false;
            this.f53501d = i12;
        }
        return this.f53500c[i10];
    }

    public final String toString() {
        if (e() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f53501d * 28);
        sb2.append('{');
        int i10 = this.f53501d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i11));
            sb2.append(B5.U);
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        n.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
