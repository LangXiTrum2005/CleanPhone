package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ai1 extends jc1 {
    public static final dr1 j(pr1 pr1Var) throws IOException {
        String strP;
        int iN = pr1Var.n();
        dr1 dr1VarM = m(pr1Var, iN);
        if (dr1VarM == null) {
            return l(pr1Var, iN);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iD = pr1Var.f18782g;
            if (iD == 0) {
                iD = pr1Var.d();
            }
            String str = null;
            if (iD == 2 || iD == 4 || iD == 17) {
                if (dr1VarM instanceof cr1) {
                    int iD2 = pr1Var.f18782g;
                    if (iD2 == 0) {
                        iD2 = pr1Var.d();
                    }
                    if (iD2 != 4) {
                        throw pr1Var.w("END_ARRAY");
                    }
                    int i10 = pr1Var.f18786k;
                    pr1Var.f18786k = i10 - 1;
                    int[] iArr = pr1Var.f18787m;
                    int i11 = i10 - 2;
                    iArr[i11] = iArr[i11] + 1;
                    pr1Var.f18782g = 0;
                } else {
                    int iD3 = pr1Var.f18782g;
                    if (iD3 == 0) {
                        iD3 = pr1Var.d();
                    }
                    if (iD3 != 2) {
                        throw pr1Var.w("END_OBJECT");
                    }
                    int i12 = pr1Var.f18786k;
                    int i13 = i12 - 1;
                    pr1Var.f18786k = i13;
                    pr1Var.l[i13] = null;
                    int[] iArr2 = pr1Var.f18787m;
                    int i14 = i12 - 2;
                    iArr2[i14] = iArr2[i14] + 1;
                    pr1Var.f18782g = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return dr1VarM;
                }
                dr1VarM = (dr1) arrayDeque.removeLast();
            } else {
                if (dr1VarM instanceof fr1) {
                    int iD4 = pr1Var.f18782g;
                    if (iD4 == 0) {
                        iD4 = pr1Var.d();
                    }
                    if (iD4 == 14) {
                        strP = pr1Var.q();
                    } else if (iD4 == 12) {
                        strP = pr1Var.p('\'');
                    } else {
                        if (iD4 != 13) {
                            throw pr1Var.w("a name");
                        }
                        strP = pr1Var.p('\"');
                    }
                    str = strP;
                    pr1Var.f18782g = 0;
                    pr1Var.l[pr1Var.f18786k - 1] = str;
                    if (!gc1.c(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iN2 = pr1Var.n();
                dr1 dr1VarM2 = m(pr1Var, iN2);
                dr1 dr1VarL = dr1VarM2 == null ? l(pr1Var, iN2) : dr1VarM2;
                if (dr1VarM instanceof cr1) {
                    ((cr1) dr1VarM).f13245a.add(dr1VarL);
                } else {
                    fr1 fr1Var = (fr1) dr1VarM;
                    if (fr1Var.f14521a.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    fr1Var.f14521a.put(str, dr1VarL);
                }
                if (dr1VarM2 != null) {
                    arrayDeque.addLast(dr1VarM);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    dr1VarM = dr1VarL;
                } else {
                    continue;
                }
            }
        }
    }

    public static void k(qr1 qr1Var, dr1 dr1Var) throws IOException {
        ae.t tVar = qr1Var.f19176a;
        if (dr1Var == null || (dr1Var instanceof er1)) {
            if (qr1Var.f19184i != null) {
                qr1Var.h();
            }
            qr1Var.n();
            tVar.write("null");
            return;
        }
        if (dr1Var instanceof hr1) {
            hr1 hr1VarM = dr1Var.m();
            Serializable serializable = hr1VarM.f15368a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    qr1Var.h();
                    qr1Var.n();
                    tVar.write(true != zBooleanValue ? "false" : com.ironsource.mediationsdk.metadata.a.f29610g);
                    return;
                }
                String strB = hr1VarM.b();
                if (strB != null) {
                    qr1Var.h();
                    qr1Var.n();
                    qr1Var.j(strB);
                    return;
                } else {
                    if (qr1Var.f19184i != null) {
                        qr1Var.h();
                    }
                    qr1Var.n();
                    tVar.write("null");
                    return;
                }
            }
            Number numberN = hr1VarM.n();
            qr1Var.h();
            String string = numberN.toString();
            Class<?> cls = numberN.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (qr1Var.f19183h != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !qr1.f19174j.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(d5.u.h(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            qr1Var.n();
            tVar.append((CharSequence) string);
            return;
        }
        boolean z10 = dr1Var instanceof cr1;
        if (z10) {
            qr1Var.h();
            qr1Var.n();
            int i10 = qr1Var.f19178c;
            int[] iArr = qr1Var.f19177b;
            if (i10 == iArr.length) {
                qr1Var.f19177b = Arrays.copyOf(iArr, i10 + i10);
            }
            int[] iArr2 = qr1Var.f19177b;
            int i11 = qr1Var.f19178c;
            qr1Var.f19178c = i11 + 1;
            iArr2[i11] = 1;
            tVar.write(91);
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: ".concat(dr1Var.toString()));
            }
            Iterator it = ((cr1) dr1Var).f13245a.iterator();
            while (it.hasNext()) {
                k(qr1Var, (dr1) it.next());
            }
            qr1Var.a(1, 2, ']');
            return;
        }
        if (!(dr1Var instanceof fr1)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(dr1Var.getClass())));
        }
        qr1Var.h();
        qr1Var.n();
        int i12 = qr1Var.f19178c;
        int[] iArr3 = qr1Var.f19177b;
        if (i12 == iArr3.length) {
            qr1Var.f19177b = Arrays.copyOf(iArr3, i12 + i12);
        }
        int[] iArr4 = qr1Var.f19177b;
        int i13 = qr1Var.f19178c;
        qr1Var.f19178c = i13 + 1;
        iArr4[i13] = 3;
        tVar.write(123);
        Iterator it2 = ((lr1) dr1Var.h().f14521a.entrySet()).iterator();
        while (((ae.o) it2).hasNext()) {
            mr1 mr1VarB = ((kr1) it2).b();
            String str = (String) mr1VarB.getKey();
            Objects.requireNonNull(str, "name == null");
            if (qr1Var.f19184i != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iD = qr1Var.d();
            if (iD != 3 && iD != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            qr1Var.f19184i = str;
            k(qr1Var, (dr1) mr1VarB.getValue());
        }
        qr1Var.a(3, 5, '}');
    }

    public static final dr1 l(pr1 pr1Var, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            String strH = pr1Var.h();
            if (gc1.c(strH)) {
                return new hr1(strH);
            }
            throw new IOException("illegal characters in string");
        }
        if (i11 == 6) {
            return new hr1(new bi1(pr1Var.h()));
        }
        boolean z10 = true;
        if (i11 != 7) {
            if (i11 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(jd1.a(i10)));
            }
            int iD = pr1Var.f18782g;
            if (iD == 0) {
                iD = pr1Var.d();
            }
            if (iD != 7) {
                throw pr1Var.w("null");
            }
            pr1Var.f18782g = 0;
            int[] iArr = pr1Var.f18787m;
            int i12 = pr1Var.f18786k - 1;
            iArr[i12] = iArr[i12] + 1;
            return er1.f14060a;
        }
        int iD2 = pr1Var.f18782g;
        if (iD2 == 0) {
            iD2 = pr1Var.d();
        }
        if (iD2 == 5) {
            pr1Var.f18782g = 0;
            int[] iArr2 = pr1Var.f18787m;
            int i13 = pr1Var.f18786k - 1;
            iArr2[i13] = iArr2[i13] + 1;
        } else {
            if (iD2 != 6) {
                throw pr1Var.w("a boolean");
            }
            pr1Var.f18782g = 0;
            int[] iArr3 = pr1Var.f18787m;
            int i14 = pr1Var.f18786k - 1;
            iArr3[i14] = iArr3[i14] + 1;
            z10 = false;
        }
        return new hr1(Boolean.valueOf(z10));
    }

    public static final dr1 m(pr1 pr1Var, int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            int iD = pr1Var.f18782g;
            if (iD == 0) {
                iD = pr1Var.d();
            }
            if (iD != 3) {
                throw pr1Var.w("BEGIN_ARRAY");
            }
            pr1Var.r(1);
            pr1Var.f18787m[pr1Var.f18786k - 1] = 0;
            pr1Var.f18782g = 0;
            return new cr1();
        }
        if (i11 != 2) {
            return null;
        }
        int iD2 = pr1Var.f18782g;
        if (iD2 == 0) {
            iD2 = pr1Var.d();
        }
        if (iD2 != 1) {
            throw pr1Var.w("BEGIN_OBJECT");
        }
        pr1Var.r(3);
        pr1Var.f18782g = 0;
        return new fr1();
    }
}
