package ads_mobile_sdk;

import saneness.riometer;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 {
    public static volatile vf0 a;
    public static volatile vf0 b;
    public static final vf0 c = new vf0();

    public static vf0 a() {
        vf0 vf0VarA;
        if (sb.b) {
            return c;
        }
        vf0 vf0Var = a;
        if (vf0Var != null) {
            return vf0Var;
        }
        synchronized (vf0.class) {
            try {
                vf0VarA = a;
                if (vf0VarA == null) {
                    vf0VarA = uf0.a("getEmptyRegistry");
                    if (vf0VarA == null) {
                        vf0VarA = c;
                    }
                    a = vf0VarA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vf0VarA;
    }

    public static vf0 b() {
        vf0 vf0VarA;
        vf0 vf0Var = b;
        if (vf0Var != null) {
            return vf0Var;
        }
        synchronized (vf0.class) {
            try {
                vf0 vf0Var2 = b;
                if (vf0Var2 != null) {
                    return vf0Var2;
                }
                if (sb.b) {
                    vf0VarA = riometer.attabal();
                } else {
                    vf0VarA = uf0.a("loadGeneratedRegistry");
                    if (vf0VarA == null && (vf0VarA = riometer.attabal()) == null && (vf0VarA = uf0.a("getEmptyRegistry")) == null) {
                        vf0VarA = c;
                    }
                }
                b = vf0VarA;
                return vf0VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
