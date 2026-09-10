package ads_mobile_sdk;

import saneness.attraction;
import saneness.dehydration;
import saneness.gutturalization;
import saneness.needler;
import saneness.prescient;
import saneness.twybill;

/* JADX INFO: loaded from: classes.dex */
public final class ir implements gutturalization {
    public final hr a;
    public int b;
    public int c;
    public int d = 0;

    public ir(hr hrVar) {
        hr hrVar2 = (hr) r21.a(hrVar, "input");
        this.a = hrVar2;
        hrVar2.c = this;
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.r();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, attraction attractionVar, vf0 vf0Var) throws x81 {
        int iS = this.a.s();
        hr hrVar = this.a;
        if (hrVar.a + hrVar.b >= 100) {
            throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iD = hrVar.d(iS);
        this.a.a++;
        attractionVar.a(obj, this, vf0Var);
        this.a.a(0);
        hr hrVar2 = this.a;
        hrVar2.a--;
        hrVar2.c(iD);
    }

    public final void c(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof dehydration)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    prescientVar.add(Double.valueOf(this.a.e()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iS = this.a.s();
            d(iS);
            int iA = this.a.a() + iS;
            do {
                prescientVar.add(Double.valueOf(this.a.e()));
            } while (this.a.a() < iA);
            return;
        }
        dehydration dehydrationVar = (dehydration) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                dehydrationVar.saneness(this.a.e());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iS2 = this.a.s();
        d(iS2);
        int iA2 = this.a.a() + iS2;
        do {
            dehydrationVar.saneness(this.a.e());
        } while (this.a.a() < iA2);
    }

    public final void d(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Integer.valueOf(this.a.f()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Integer.valueOf(this.a.f()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                j21Var.b(this.a.f());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            j21Var.b(this.a.f());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void e(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 2) {
                int iS = this.a.s();
                c(iS);
                int iA = this.a.a() + iS;
                do {
                    prescientVar.add(Integer.valueOf(this.a.g()));
                } while (this.a.a() < iA);
                return;
            }
            if (i != 5) {
                int i2 = x81.b;
                throw new w81();
            }
            do {
                prescientVar.add(Integer.valueOf(this.a.g()));
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int iS2 = this.a.s();
            c(iS2);
            int iA2 = this.a.a() + iS2;
            do {
                j21Var.b(this.a.g());
            } while (this.a.a() < iA2);
            return;
        }
        if (i3 != 5) {
            int i4 = x81.b;
            throw new w81();
        }
        do {
            j21Var.b(this.a.g());
            if (this.a.b()) {
                return;
            } else {
                iR2 = this.a.r();
            }
        } while (iR2 == this.b);
        this.d = iR2;
    }

    public final void f(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof qc1)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    prescientVar.add(Long.valueOf(this.a.h()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iS = this.a.s();
            d(iS);
            int iA = this.a.a() + iS;
            do {
                prescientVar.add(Long.valueOf(this.a.h()));
            } while (this.a.a() < iA);
            return;
        }
        qc1 qc1Var = (qc1) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                qc1Var.a(this.a.h());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iS2 = this.a.s();
        d(iS2);
        int iA2 = this.a.a() + iS2;
        do {
            qc1Var.a(this.a.h());
        } while (this.a.a() < iA2);
    }

    public final void g(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof needler)) {
            int i = this.b & 7;
            if (i == 2) {
                int iS = this.a.s();
                c(iS);
                int iA = this.a.a() + iS;
                do {
                    prescientVar.add(Float.valueOf(this.a.i()));
                } while (this.a.a() < iA);
                return;
            }
            if (i != 5) {
                int i2 = x81.b;
                throw new w81();
            }
            do {
                prescientVar.add(Float.valueOf(this.a.i()));
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        needler needlerVar = (needler) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int iS2 = this.a.s();
            c(iS2);
            int iA2 = this.a.a() + iS2;
            do {
                needlerVar.saneness(this.a.i());
            } while (this.a.a() < iA2);
            return;
        }
        if (i3 != 5) {
            int i4 = x81.b;
            throw new w81();
        }
        do {
            needlerVar.saneness(this.a.i());
            if (this.a.b()) {
                return;
            } else {
                iR2 = this.a.r();
            }
        } while (iR2 == this.b);
        this.d = iR2;
    }

    public final void h(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Integer.valueOf(this.a.j()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Integer.valueOf(this.a.j()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                j21Var.b(this.a.j());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            j21Var.b(this.a.j());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void i(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof qc1)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Long.valueOf(this.a.k()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Long.valueOf(this.a.k()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        qc1 qc1Var = (qc1) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                qc1Var.a(this.a.k());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            qc1Var.a(this.a.k());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void j(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 2) {
                int iS = this.a.s();
                c(iS);
                int iA = this.a.a() + iS;
                do {
                    prescientVar.add(Integer.valueOf(this.a.l()));
                } while (this.a.a() < iA);
                return;
            }
            if (i != 5) {
                int i2 = x81.b;
                throw new w81();
            }
            do {
                prescientVar.add(Integer.valueOf(this.a.l()));
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int iS2 = this.a.s();
            c(iS2);
            int iA2 = this.a.a() + iS2;
            do {
                j21Var.b(this.a.l());
            } while (this.a.a() < iA2);
            return;
        }
        if (i3 != 5) {
            int i4 = x81.b;
            throw new w81();
        }
        do {
            j21Var.b(this.a.l());
            if (this.a.b()) {
                return;
            } else {
                iR2 = this.a.r();
            }
        } while (iR2 == this.b);
        this.d = iR2;
    }

    public final void k(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof qc1)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    prescientVar.add(Long.valueOf(this.a.m()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iS = this.a.s();
            d(iS);
            int iA = this.a.a() + iS;
            do {
                prescientVar.add(Long.valueOf(this.a.m()));
            } while (this.a.a() < iA);
            return;
        }
        qc1 qc1Var = (qc1) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                qc1Var.a(this.a.m());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iS2 = this.a.s();
        d(iS2);
        int iA2 = this.a.a() + iS2;
        do {
            qc1Var.a(this.a.m());
        } while (this.a.a() < iA2);
    }

    public final void l(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Integer.valueOf(this.a.n()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Integer.valueOf(this.a.n()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                j21Var.b(this.a.n());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            j21Var.b(this.a.n());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void m(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof qc1)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Long.valueOf(this.a.o()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Long.valueOf(this.a.o()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        qc1 qc1Var = (qc1) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                qc1Var.a(this.a.o());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            qc1Var.a(this.a.o());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void n(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof j21)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Integer.valueOf(this.a.s()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Integer.valueOf(this.a.s()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        j21 j21Var = (j21) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                j21Var.b(this.a.s());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            j21Var.b(this.a.s());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void o(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (!(prescientVar instanceof qc1)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    prescientVar.add(Long.valueOf(this.a.t()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iR = this.a.r();
                    }
                } while (iR == this.b);
                this.d = iR;
                return;
            }
            if (i != 2) {
                int i2 = x81.b;
                throw new w81();
            }
            int iA = this.a.a() + this.a.s();
            do {
                prescientVar.add(Long.valueOf(this.a.t()));
            } while (this.a.a() < iA);
            a(iA);
            return;
        }
        qc1 qc1Var = (qc1) prescientVar;
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                qc1Var.a(this.a.t());
                if (this.a.b()) {
                    return;
                } else {
                    iR2 = this.a.r();
                }
            } while (iR2 == this.b);
            this.d = iR2;
            return;
        }
        if (i3 != 2) {
            int i4 = x81.b;
            throw new w81();
        }
        int iA2 = this.a.a() + this.a.s();
        do {
            qc1Var.a(this.a.t());
        } while (this.a.a() < iA2);
        a(iA2);
    }

    public final void a(Object obj, attraction attractionVar, vf0 vf0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            attractionVar.a(obj, this, vf0Var);
            if (this.b == this.c) {
                this.c = i;
                return;
            }
            throw new x81("Failed to parse the message.");
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final void b(prescient prescientVar) throws w81 {
        int iR;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                prescientVar.add(this.a.d());
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        int i = x81.b;
        throw new w81();
    }

    public final void a(prescient prescientVar) throws x81 {
        int iR;
        int iR2;
        if (prescientVar instanceof twybill) {
            twybill twybillVar = (twybill) prescientVar;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    twybillVar.saneness(this.a.c());
                    if (this.a.b()) {
                        return;
                    } else {
                        iR2 = this.a.r();
                    }
                } while (iR2 == this.b);
                this.d = iR2;
                return;
            }
            if (i == 2) {
                int iA = this.a.a() + this.a.s();
                do {
                    twybillVar.saneness(this.a.c());
                } while (this.a.a() < iA);
                a(iA);
                return;
            }
            int i2 = x81.b;
            throw new w81();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                prescientVar.add(Boolean.valueOf(this.a.c()));
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        if (i3 == 2) {
            int iA2 = this.a.a() + this.a.s();
            do {
                prescientVar.add(Boolean.valueOf(this.a.c()));
            } while (this.a.a() < iA2);
            a(iA2);
            return;
        }
        int i4 = x81.b;
        throw new w81();
    }

    public final void b(int i) throws w81 {
        if ((this.b & 7) == i) {
            return;
        }
        int i2 = x81.b;
        throw new w81();
    }

    public final boolean b() {
        int i;
        if (this.a.b() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.e(i);
    }

    public static void c(int i) throws x81 {
        if ((i & 3) != 0) {
            throw new x81("Failed to parse the message.");
        }
    }

    public static void d(int i) throws x81 {
        if ((i & 7) != 0) {
            throw new x81("Failed to parse the message.");
        }
    }

    public final Object a(ib3 ib3Var, Class cls, vf0 vf0Var) throws x81 {
        switch (ib3Var.ordinal()) {
            case 0:
                b(1);
                return Double.valueOf(this.a.e());
            case 1:
                b(5);
                return Float.valueOf(this.a.i());
            case 2:
                b(0);
                return Long.valueOf(this.a.k());
            case 3:
                b(0);
                return Long.valueOf(this.a.t());
            case 4:
                b(0);
                return Integer.valueOf(this.a.j());
            case 5:
                b(1);
                return Long.valueOf(this.a.h());
            case 6:
                b(5);
                return Integer.valueOf(this.a.g());
            case 7:
                b(0);
                return Boolean.valueOf(this.a.c());
            case 8:
                b(2);
                return this.a.q();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                b(2);
                attraction attractionVarA = y72.c.a(cls);
                xm0 xm0VarA = attractionVarA.a();
                b(xm0VarA, attractionVarA, vf0Var);
                attractionVarA.c(xm0VarA);
                return xm0VarA;
            case 11:
                b(2);
                return this.a.d();
            case 12:
                b(0);
                return Integer.valueOf(this.a.s());
            case 13:
                b(0);
                return Integer.valueOf(this.a.f());
            case 14:
                b(5);
                return Integer.valueOf(this.a.l());
            case 15:
                b(1);
                return Long.valueOf(this.a.m());
            case 16:
                b(0);
                return Integer.valueOf(this.a.n());
            case 17:
                b(0);
                return Long.valueOf(this.a.o());
        }
    }

    public final void a(prescient prescientVar, boolean z) throws w81 {
        String strP;
        int iR;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    b(2);
                    strP = this.a.q();
                } else {
                    b(2);
                    strP = this.a.p();
                }
                prescientVar.add(strP);
                if (this.a.b()) {
                    return;
                } else {
                    iR = this.a.r();
                }
            } while (iR == this.b);
            this.d = iR;
            return;
        }
        int i = x81.b;
        throw new w81();
    }

    public final void a(int i) throws x81 {
        if (this.a.a() != i) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
