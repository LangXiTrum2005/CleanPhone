package be;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends ge.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f5657t = new n();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f5658u = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f5659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f5661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f5662s;

    @Override // ge.a
    public final long A() {
        int iH = H();
        if (iH != 7 && iH != 6) {
            throw new IllegalStateException("Expected " + d5.u.z(7) + " but was " + d5.u.z(iH) + S());
        }
        com.google.gson.l lVar = (com.google.gson.l) U();
        long jLongValue = lVar.f24755a instanceof Number ? lVar.q().longValue() : Long.parseLong(lVar.m());
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jLongValue;
    }

    @Override // ge.a
    public final String B() {
        return T(false);
    }

    @Override // ge.a
    public final void D() {
        Q(9);
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ge.a
    public final String F() {
        int iH = H();
        if (iH != 6 && iH != 7) {
            throw new IllegalStateException("Expected " + d5.u.z(6) + " but was " + d5.u.z(iH) + S());
        }
        String strM = ((com.google.gson.l) V()).m();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strM;
    }

    @Override // ge.a
    public final int H() {
        if (this.f5660q == 0) {
            return 10;
        }
        Object objU = U();
        if (objU instanceof Iterator) {
            boolean z10 = this.f5659p[this.f5660q - 2] instanceof com.google.gson.j;
            Iterator it = (Iterator) objU;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            W(it.next());
            return H();
        }
        if (objU instanceof com.google.gson.j) {
            return 3;
        }
        if (objU instanceof com.google.gson.e) {
            return 1;
        }
        if (objU instanceof com.google.gson.l) {
            Serializable serializable = ((com.google.gson.l) objU).f24755a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objU instanceof com.google.gson.i) {
            return 9;
        }
        if (objU == f5658u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new ge.c("Custom JsonElement subclass " + objU.getClass().getName() + " is not supported");
    }

    @Override // ge.a
    public final void N() {
        int iC = v0.i.c(H());
        if (iC == 1) {
            o();
            return;
        }
        if (iC != 9) {
            if (iC == 3) {
                p();
                return;
            }
            if (iC == 4) {
                T(true);
                return;
            }
            V();
            int i10 = this.f5660q;
            if (i10 > 0) {
                int[] iArr = this.f5662s;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
        }
    }

    public final void Q(int i10) {
        if (H() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + d5.u.z(i10) + " but was " + d5.u.z(H()) + S());
    }

    public final String R(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f5660q;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f5659p;
            Object obj = objArr[i10];
            if (obj instanceof com.google.gson.e) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f5662s[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof com.google.gson.j) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f5661r[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final String S() {
        return " at path " + R(false);
    }

    public final String T(boolean z10) {
        Q(5);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        String str = (String) entry.getKey();
        this.f5661r[this.f5660q - 1] = z10 ? "<skipped>" : str;
        W(entry.getValue());
        return str;
    }

    public final Object U() {
        return this.f5659p[this.f5660q - 1];
    }

    public final Object V() {
        Object[] objArr = this.f5659p;
        int i10 = this.f5660q - 1;
        this.f5660q = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void W(Object obj) {
        int i10 = this.f5660q;
        Object[] objArr = this.f5659p;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f5659p = Arrays.copyOf(objArr, i11);
            this.f5662s = Arrays.copyOf(this.f5662s, i11);
            this.f5661r = (String[]) Arrays.copyOf(this.f5661r, i11);
        }
        Object[] objArr2 = this.f5659p;
        int i12 = this.f5660q;
        this.f5660q = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // ge.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5659p = new Object[]{f5658u};
        this.f5660q = 1;
    }

    @Override // ge.a
    public final void d() {
        Q(1);
        W(((com.google.gson.e) U()).f24752a.iterator());
        this.f5662s[this.f5660q - 1] = 0;
    }

    @Override // ge.a
    public final void h() {
        Q(3);
        W(((ae.n) ((com.google.gson.j) U()).f24754a.entrySet()).iterator());
    }

    @Override // ge.a
    public final void o() {
        Q(2);
        V();
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ge.a
    public final void p() {
        Q(4);
        this.f5661r[this.f5660q - 1] = null;
        V();
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ge.a
    public final String r() {
        return R(false);
    }

    @Override // ge.a
    public final String t() {
        return R(true);
    }

    @Override // ge.a
    public final String toString() {
        return o.class.getSimpleName() + S();
    }

    @Override // ge.a
    public final boolean u() {
        int iH = H();
        return (iH == 4 || iH == 2 || iH == 10) ? false : true;
    }

    @Override // ge.a
    public final boolean x() {
        Q(8);
        boolean zB = ((com.google.gson.l) V()).b();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zB;
    }

    @Override // ge.a
    public final double y() throws ge.c {
        int iH = H();
        if (iH != 7 && iH != 6) {
            throw new IllegalStateException("Expected " + d5.u.z(7) + " but was " + d5.u.z(iH) + S());
        }
        double dP = ((com.google.gson.l) U()).p();
        if (this.f41876o != 1 && (Double.isNaN(dP) || Double.isInfinite(dP))) {
            throw new ge.c("JSON forbids NaN and infinities: " + dP);
        }
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dP;
    }

    @Override // ge.a
    public final int z() {
        int iH = H();
        if (iH != 7 && iH != 6) {
            throw new IllegalStateException("Expected " + d5.u.z(7) + " but was " + d5.u.z(iH) + S());
        }
        com.google.gson.l lVar = (com.google.gson.l) U();
        int iIntValue = lVar.f24755a instanceof Number ? lVar.q().intValue() : Integer.parseInt(lVar.m());
        V();
        int i10 = this.f5660q;
        if (i10 > 0) {
            int[] iArr = this.f5662s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iIntValue;
    }
}
