package ea;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f39925c = new y1(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f39926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39927b;

    public y1(int i10) {
        EnumMap enumMap = new EnumMap(x1.class);
        this.f39926a = enumMap;
        x1 x1Var = x1.AD_STORAGE;
        v1 v1Var = v1.UNINITIALIZED;
        enumMap.put(x1Var, v1Var);
        enumMap.put(x1.ANALYTICS_STORAGE, v1Var);
        this.f39927b = i10;
    }

    public static String a(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static y1 b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new y1(i10);
        }
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.STORAGE.f39861a) {
            enumMap.put(x1Var, d(bundle.getString(x1Var.f39910a)));
        }
        return new y1(enumMap, i10);
    }

    public static y1 c(int i10, String str) {
        EnumMap enumMap = new EnumMap(x1.class);
        x1[] x1VarArr = w1.STORAGE.f39861a;
        for (int i11 = 0; i11 < x1VarArr.length; i11++) {
            String str2 = str == null ? "" : str;
            x1 x1Var = x1VarArr[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(x1Var, e(str2.charAt(i12)));
            } else {
                enumMap.put(x1Var, v1.UNINITIALIZED);
            }
        }
        return new y1(enumMap, i10);
    }

    public static v1 d(String str) {
        v1 v1Var = v1.UNINITIALIZED;
        if (str == null) {
            return v1Var;
        }
        if (str.equals("granted")) {
            return v1.GRANTED;
        }
        return str.equals("denied") ? v1.DENIED : v1Var;
    }

    public static v1 e(char c4) {
        if (c4 == '+') {
            return v1.POLICY;
        }
        if (c4 != '0') {
            return c4 != '1' ? v1.UNINITIALIZED : v1.GRANTED;
        }
        return v1.DENIED;
    }

    public static char h(v1 v1Var) {
        if (v1Var == null) {
            return '-';
        }
        int iOrdinal = v1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        for (x1 x1Var : w1.STORAGE.f39861a) {
            if (this.f39926a.get(x1Var) != y1Var.f39926a.get(x1Var)) {
                return false;
            }
        }
        return this.f39927b == y1Var.f39927b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (x1 x1Var : w1.STORAGE.f39861a) {
            v1 v1Var = (v1) this.f39926a.get(x1Var);
            char c4 = '-';
            if (v1Var != null && (iOrdinal = v1Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c4 = '1';
                } else if (iOrdinal == 2) {
                    c4 = '0';
                } else if (iOrdinal == 3) {
                    c4 = '1';
                }
            }
            sb2.append(c4);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (x1 x1Var : w1.STORAGE.f39861a) {
            sb2.append(h((v1) this.f39926a.get(x1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f39926a.values().iterator();
        int iHashCode = this.f39927b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((v1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(x1 x1Var) {
        return ((v1) this.f39926a.get(x1Var)) != v1.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final y1 j(y1 y1Var) {
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.STORAGE.f39861a) {
            v1 v1Var = (v1) this.f39926a.get(x1Var);
            v1 v1Var2 = (v1) y1Var.f39926a.get(x1Var);
            if (v1Var == null) {
                v1Var = v1Var2;
            } else if (v1Var2 != null) {
                v1 v1Var3 = v1.UNINITIALIZED;
                if (v1Var == v1Var3) {
                    v1Var = v1Var2;
                } else if (v1Var2 != v1Var3) {
                    v1 v1Var4 = v1.POLICY;
                    if (v1Var == v1Var4) {
                        v1Var = v1Var2;
                    } else if (v1Var2 != v1Var4) {
                        v1 v1Var5 = v1.DENIED;
                        v1Var = (v1Var == v1Var5 || v1Var2 == v1Var5) ? v1Var5 : v1.GRANTED;
                    }
                }
            }
            if (v1Var != null) {
                enumMap.put(x1Var, v1Var);
            }
        }
        return new y1(enumMap, 100);
    }

    public final y1 k(y1 y1Var) {
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.STORAGE.f39861a) {
            v1 v1Var = (v1) this.f39926a.get(x1Var);
            if (v1Var == v1.UNINITIALIZED) {
                v1Var = (v1) y1Var.f39926a.get(x1Var);
            }
            if (v1Var != null) {
                enumMap.put(x1Var, v1Var);
            }
        }
        return new y1(enumMap, this.f39927b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f39927b));
        for (x1 x1Var : w1.STORAGE.f39861a) {
            sb2.append(",");
            sb2.append(x1Var.f39910a);
            sb2.append(X3.j.f27830b);
            v1 v1Var = (v1) this.f39926a.get(x1Var);
            if (v1Var == null) {
                v1Var = v1.UNINITIALIZED;
            }
            sb2.append(v1Var);
        }
        return sb2.toString();
    }

    public y1(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f39926a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f39927b = i10;
    }
}
