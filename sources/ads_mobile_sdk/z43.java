package ads_mobile_sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import saneness.vavasour;

/* JADX INFO: loaded from: classes.dex */
public final class z43 {
    public static final z43 f = new z43(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public z43(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static z43 b() {
        return new z43(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z43)) {
            return false;
        }
        z43 z43Var = (z43) obj;
        int i = this.a;
        if (i == z43Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = z43Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = z43Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int a() {
        int iH;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iH = mr.h(i4) + mr.a(((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iH = mr.h(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iA = ((z43) this.c[i2]).a() + (mr.h(i4) * 2) + iA;
                } else if (i5 == 5) {
                    ((Integer) this.c[i2]).getClass();
                    iH = mr.h(i4) + 4;
                } else {
                    int i6 = x81.b;
                    throw new IllegalStateException(new w81());
                }
            } else {
                iH = mr.a((kn) this.c[i2]) + mr.h(i4);
            }
            iA = iH + iA;
        }
        this.d = iA;
        return iA;
    }

    public static z43 a(z43 z43Var, z43 z43Var2) {
        int i = z43Var.a + z43Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(z43Var.b, i);
        System.arraycopy(z43Var2.b, 0, iArrCopyOf, z43Var.a, z43Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(z43Var.c, i);
        System.arraycopy(z43Var2.c, 0, objArrCopyOf, z43Var.a, z43Var2.a);
        return new z43(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < this.a; i2++) {
            if1.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void a(int i, Object obj) {
        if (this.e) {
            a(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(vavasour vavasourVar) {
        if (this.a == 0) {
            return;
        }
        vavasourVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((nr) vavasourVar).a.e(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((nr) vavasourVar).a.d(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((nr) vavasourVar).a.b(i3, (kn) obj);
            } else if (i4 == 3) {
                nr nrVar = (nr) vavasourVar;
                nrVar.a.g(i3, 3);
                ((z43) obj).a(vavasourVar);
                nrVar.a.g(i3, 4);
            } else if (i4 == 5) {
                ((nr) vavasourVar).a.e(i3, ((Integer) obj).intValue());
            } else {
                int i5 = x81.b;
                throw new RuntimeException(new w81());
            }
        }
    }
}
