package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r41 extends u41 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Long f19370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f19371h = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19372f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r41(String str, String str2, xd xdVar, h41 h41Var, y61 y61Var, int i10) {
        super(str, str2, xdVar, h41Var, y61Var);
        this.f19372f = i10;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final void a(Method method, xd xdVar) {
        switch (this.f19372f) {
            case 0:
                if (f19370g == null) {
                    synchronized (f19371h) {
                        try {
                            if (f19370g == null) {
                                Long l = (Long) method.invoke("", null);
                                if (l == null) {
                                    throw null;
                                }
                                f19370g = l;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (xdVar) {
                    try {
                        if (f19370g != null) {
                            long jLongValue = f19370g.longValue();
                            xdVar.b();
                            ((je) xdVar.f19193b).O0(jLongValue);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                synchronized (xdVar) {
                    xdVar.b();
                    ((je) xdVar.f19193b).C0("E");
                    xdVar.b();
                    ((je) xdVar.f19193b).L(0L);
                    xdVar.b();
                    ((je) xdVar.f19193b).f0("D");
                    break;
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (xdVar) {
                    String str = (String) objArr[0];
                    xdVar.b();
                    ((je) xdVar.f19193b).C0(str);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    xdVar.b();
                    ((je) xdVar.f19193b).L(jLongValue2);
                    String str2 = (String) objArr[2];
                    xdVar.b();
                    ((je) xdVar.f19193b).f0(str2);
                    break;
                }
                return;
        }
    }
}
