package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.B5;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f53507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f53508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f53509c;

    public j() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f53507a = new int[i13];
        this.f53508b = new Object[i13];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f53509c;
        if (i11 != 0 && i10 <= this.f53507a[i11 - 1]) {
            c(i10, obj);
            return;
        }
        if (i11 >= this.f53507a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f53507a, i15);
            n.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53507a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53508b, i15);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53508b = objArrCopyOf;
        }
        this.f53507a[i11] = i10;
        this.f53508b[i11] = obj;
        this.f53509c = i11 + 1;
    }

    public final Object b(int i10) {
        Object obj;
        int iA = y.a.a(this.f53509c, i10, this.f53507a);
        if (iA < 0 || (obj = this.f53508b[iA]) == h.f53503b) {
            return null;
        }
        return obj;
    }

    public final void c(int i10, Object obj) {
        int iA = y.a.a(this.f53509c, i10, this.f53507a);
        if (iA >= 0) {
            this.f53508b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f53509c;
        if (i11 < i12) {
            Object[] objArr = this.f53508b;
            if (objArr[i11] == h.f53503b) {
                this.f53507a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f53507a.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f53507a, i16);
            n.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53507a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f53508b, i16);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53508b = objArrCopyOf;
        }
        int i17 = this.f53509c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f53507a;
            int i18 = i11 + 1;
            k.f0(i18, i11, iArr, iArr, i17);
            Object[] objArr2 = this.f53508b;
            k.e0(i18, i11, this.f53509c, objArr2, objArr2);
        }
        this.f53507a[i11] = i10;
        this.f53508b[i11] = obj;
        this.f53509c++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        n.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) objClone;
        jVar.f53507a = (int[]) this.f53507a.clone();
        jVar.f53508b = (Object[]) this.f53508b.clone();
        return jVar;
    }

    public final String toString() {
        int i10 = this.f53509c;
        if (i10 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f53509c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f53507a[i12]);
            sb2.append(B5.U);
            Object obj = this.f53508b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        n.e(string, "buffer.toString()");
        return string;
    }
}
