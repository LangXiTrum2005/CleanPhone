package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3 implements na.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e3 f23407b = new e3(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e3 f23408c = new e3(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e3 f23409d = new e3(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e3 f23410e = new e3(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23411a;

    public /* synthetic */ e3(int i10) {
        this.f23411a = i10;
    }

    @Override // na.e
    public final Object apply(Object obj) {
        switch (this.f23411a) {
            case 0:
                Context context = (Context) obj;
                String strB = f3.f23452b;
                if (strB == null) {
                    synchronized (f3.class) {
                        try {
                            strB = f3.f23452b;
                            if (strB == null) {
                                strB = nb.b(context, "com.google.android.gms.measurement");
                                f3.f23452b = strB;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return strB;
            case 1:
                q6 q6Var = ud.f24037i;
                return "";
            case 2:
                dc dcVar = (dc) obj;
                ke keVarA = le.A();
                if (dcVar == null) {
                    return (le) keVarA.f();
                }
                for (fc fcVar : dcVar.y()) {
                    me meVarA = ne.A();
                    String strU = fcVar.u();
                    meVarA.b();
                    ((ne) meVarA.f23489b).B(strU);
                    int I = fcVar.I();
                    int i10 = I - 1;
                    if (I == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        long jV = fcVar.v();
                        meVarA.b();
                        ((ne) meVarA.f23489b).C(jV);
                    } else if (i10 == 1) {
                        boolean zW = fcVar.w();
                        meVarA.b();
                        ((ne) meVarA.f23489b).D(zW);
                    } else if (i10 == 2) {
                        double dX = fcVar.x();
                        meVarA.b();
                        ((ne) meVarA.f23489b).E(dX);
                    } else if (i10 == 3) {
                        String strY = fcVar.y();
                        meVarA.b();
                        ((ne) meVarA.f23489b).F(strY);
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        s0 s0VarZ = fcVar.z();
                        meVarA.b();
                        ((ne) meVarA.f23489b).G(s0VarZ);
                    }
                    ne neVar = (ne) meVarA.f();
                    keVarA.b();
                    ((le) keVarA.f23489b).G(neVar);
                }
                String strX = dcVar.x();
                keVarA.b();
                ((le) keVarA.f23489b).E(strX);
                String strU2 = dcVar.u();
                keVarA.b();
                ((le) keVarA.f23489b).C(strU2);
                long jZ = dcVar.z();
                keVarA.b();
                ((le) keVarA.f23489b).F(jZ);
                if (dcVar.v()) {
                    s0 s0VarW = dcVar.w();
                    keVarA.b();
                    ((le) keVarA.f23489b).D(s0VarW);
                }
                return (le) keVarA.f();
            default:
                gc gcVar = (gc) obj;
                if (gcVar.f23512a != 29514) {
                    throw gcVar;
                }
                xc xcVarX = yc.x();
                tc tcVarH = uc.H();
                long jCurrentTimeMillis = System.currentTimeMillis();
                tcVarH.b();
                ((uc) tcVarH.f23489b).J(jCurrentTimeMillis);
                xcVarX.b();
                ((yc) xcVarX.f23489b).y((uc) tcVarH.f());
                return (yc) xcVarX.f();
        }
    }
}
