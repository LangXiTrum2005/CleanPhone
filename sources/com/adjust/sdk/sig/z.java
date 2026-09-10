package com.adjust.sdk.sig;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f7030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f7031b;

    static {
        z zVar = new z();
        f7030a = zVar;
        d2 d2Var = new d2(zVar);
        String[] strArr = d2Var.f6934c;
        int i10 = d2Var.f6933b + 1;
        d2Var.f6933b = i10;
        strArr[i10] = "os_name";
        d2Var.f6936e[i10] = true;
        d2Var.f6935d[i10] = null;
        if (i10 == 0) {
            HashMap map = new HashMap();
            int length = d2Var.f6934c.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(d2Var.f6934c[i11], Integer.valueOf(i11));
            }
            d2Var.f6937f = map;
        }
        f7031b = d2Var;
    }

    @Override // com.adjust.sdk.sig.r1
    public final l2 a() {
        return f7031b;
    }

    @Override // com.adjust.sdk.sig.r1
    public final void a(v2 v2Var, Object obj) {
        p3 p3Var;
        d2 d2Var = f7031b;
        e3 e3Var = e3.f6950a;
        if (e3Var == f3.f6958a) {
            p3Var = p3.LIST;
        } else if (e3Var != g3.f6960a) {
            p3Var = p3.OBJ;
        } else {
            l2 l2VarA = q3.a(d2Var.b(0));
            p2 p2VarD = l2VarA.d();
            if (!(p2VarD instanceof f2) && !g1.a(p2VarD, o2.f6995a)) {
                throw new m1("Value of type '" + l2VarA.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + l2VarA.d() + '\'', "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            p3Var = p3.MAP;
        }
        v2Var.f7015a.a(p3Var.f7002a);
        x xVar = v2Var.f7015a;
        xVar.f7025b = true;
        String str = v2Var.f7020f;
        if (str != null) {
            String str2 = v2Var.f7021g;
            if (str2 == null) {
                str2 = "com.adjust.sdk.sig.755f89ae93acbe52c30f8a09";
            }
            xVar.a();
            v2Var.a(str);
            v2Var.f7015a.a(':');
            v2Var.a(str2);
            v2Var.f7020f = null;
            v2Var.f7021g = null;
        }
        if (v2Var.f7017c != p3Var) {
            v2 v2Var2 = v2Var.f7018d[p3Var.ordinal()];
            if (v2Var2 == null) {
                v2Var2 = new v2(v2Var.f7015a, v2Var.f7016b, p3Var, v2Var.f7018d);
            }
            v2Var = v2Var2;
        }
        if (v2Var.f7019e.f6979a) {
            x2 x2Var = x2.f7028a;
            int iOrdinal = v2Var.f7017c.ordinal();
            if (iOrdinal == 1) {
                x xVar2 = v2Var.f7015a;
                if (!xVar2.f7025b) {
                    xVar2.a(',');
                }
                v2Var.f7015a.a();
            } else if (iOrdinal == 2) {
                x xVar3 = v2Var.f7015a;
                if (xVar3.f7025b) {
                    xVar3.a();
                } else {
                    xVar3.a(',');
                    v2Var.f7015a.a();
                }
            } else if (iOrdinal != 3) {
                x xVar4 = v2Var.f7015a;
                if (!xVar4.f7025b) {
                    xVar4.a(',');
                }
                v2Var.f7015a.a();
                g1.a(e3Var, e3Var);
                v2Var.a(d2Var.f6934c[0]);
                v2Var.f7015a.a(':');
            }
            v2Var.a(x2Var, "android");
        }
        x xVar5 = v2Var.f7015a;
        xVar5.f7025b = false;
        xVar5.a(v2Var.f7017c.f7003b);
    }
}
