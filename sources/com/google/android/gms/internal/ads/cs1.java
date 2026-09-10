package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cs1 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final as1 f13248b = new as1(bt1.f12888a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13249a = 0;

    static {
        int i10 = tr1.f20473a;
    }

    public static as1 D(byte[] bArr, int i10, int i11) {
        try {
            return E(bArr, i10, i11);
        } catch (et1 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static as1 E(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return f13248b;
        }
        m(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new as1(bArr2);
    }

    public static cs1 F(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f13248b : x(arrayList.iterator(), size);
    }

    public static int m(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 21), "Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length()), i10, "Beginning index larger than ending index: ", i11, ", "));
        }
        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length()), i11, "End index: ", i12, " >= "));
    }

    public static /* synthetic */ boolean n(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10 + i12;
        m(i10, i13, bArr.length);
        m(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static cs1 x(Iterator it, int i10) {
        if (i10 <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(defpackage.e.h(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (cs1) it.next();
        }
        int i11 = i10 >>> 1;
        cs1 cs1VarX = x(it, i11);
        cs1 cs1VarX2 = x(it, i10 - i11);
        if (Integer.MAX_VALUE - cs1VarX.q() < cs1VarX2.q()) {
            int iQ = cs1VarX.q();
            int iQ2 = cs1VarX2.q();
            throw new IllegalArgumentException(l1.d.j(new StringBuilder(String.valueOf(iQ).length() + 31 + String.valueOf(iQ2).length()), iQ, "ByteString would be too long: ", iQ2, "+"));
        }
        if (cs1VarX2.q() == 0) {
            return cs1VarX;
        }
        if (cs1VarX.q() == 0) {
            return cs1VarX2;
        }
        int iQ3 = cs1VarX2.q() + cs1VarX.q();
        as1 as1Var = f13248b;
        if (iQ3 < 128) {
            int iQ4 = cs1VarX.q();
            int iQ5 = cs1VarX2.q();
            int i12 = iQ4 + iQ5;
            byte[] bArr = new byte[i12];
            m(0, iQ4, cs1VarX.q());
            m(0, iQ4, i12);
            if (iQ4 > 0) {
                cs1VarX.t(0, 0, iQ4, bArr);
            }
            m(0, iQ5, cs1VarX2.q());
            m(iQ4, i12, i12);
            if (iQ5 > 0) {
                cs1VarX2.t(0, iQ4, iQ5, bArr);
            }
            if (i12 == 0) {
                return as1Var;
            }
            try {
                return new as1(bArr);
            } catch (et1 e10) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
            }
        }
        if (cs1VarX instanceof au1) {
            au1 au1Var = (au1) cs1VarX;
            cs1 cs1Var = au1Var.f12523d;
            cs1 cs1Var2 = au1Var.f12524e;
            if (cs1VarX2.q() + cs1Var2.q() < 128) {
                int iQ6 = cs1Var2.q();
                int iQ7 = cs1VarX2.q();
                int i13 = iQ6 + iQ7;
                byte[] bArr2 = new byte[i13];
                m(0, iQ6, cs1Var2.q());
                m(0, iQ6, i13);
                if (iQ6 > 0) {
                    cs1Var2.t(0, 0, iQ6, bArr2);
                }
                m(0, iQ7, cs1VarX2.q());
                m(iQ6, i13, i13);
                if (iQ7 > 0) {
                    cs1VarX2.t(0, iQ6, iQ7, bArr2);
                }
                if (i13 != 0) {
                    try {
                        as1Var = new as1(bArr2);
                    } catch (et1 e11) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e11);
                    }
                }
                return new au1(cs1Var, as1Var);
            }
            if (cs1Var.A() > cs1Var2.A() && au1Var.f12526g > cs1VarX2.A()) {
                return new au1(cs1Var, new au1(cs1Var2, cs1VarX2));
            }
        }
        if (iQ3 >= au1.G(Math.max(cs1VarX.A(), cs1VarX2.A()) + 1)) {
            return new au1(cs1VarX, cs1VarX2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ic1.g(cs1VarX, arrayDeque);
        ic1.g(cs1VarX2, arrayDeque);
        cs1 au1Var2 = (cs1) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            au1Var2 = new au1((cs1) arrayDeque.pop(), au1Var2);
        }
        return au1Var2;
    }

    public abstract int A();

    public abstract boolean B();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public mb1 iterator() {
        return new xr1(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        int iQ = q();
        if (iQ != cs1Var.q()) {
            return false;
        }
        if (iQ == 0) {
            return true;
        }
        int i10 = this.f13249a;
        int i11 = cs1Var.f13249a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return w(cs1Var);
        }
        return false;
    }

    public final byte[] h() {
        int iQ = q();
        if (iQ == 0) {
            return bt1.f12888a;
        }
        byte[] bArr = new byte[iQ];
        t(0, 0, iQ, bArr);
        return bArr;
    }

    public final int hashCode() {
        int iY = this.f13249a;
        if (iY == 0) {
            int iQ = q();
            iY = y(iQ, 0, iQ);
            if (iY == 0) {
                iY = 1;
            }
            this.f13249a = iY;
        }
        return iY;
    }

    public abstract byte p(int i10);

    public abstract int q();

    public abstract cs1 r(int i10, int i11);

    public abstract cs1 s(int i10, int i11);

    public abstract void t(int i10, int i11, int i12, byte[] bArr);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iQ = q();
        String strD = q() <= 50 ? jc1.d(h()) : jc1.d(s(0, 47).h()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iQ);
        sb2.append(" contents=\"");
        return defpackage.e.q(strD, "\">", sb2);
    }

    public abstract ByteBuffer u();

    public abstract void v(is1 is1Var);

    public abstract boolean w(cs1 cs1Var);

    public abstract int y(int i10, int i11, int i12);

    public abstract fs1 z();
}
