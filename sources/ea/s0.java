package ea;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.ca;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f39750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bo.b f39753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bo.b f39754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bo.b f39755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bo.b f39756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bo.b f39757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bo.b f39758k;
    public final bo.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bo.b f39759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bo.b f39760n;

    public s0(m1 m1Var) {
        super(m1Var);
        this.f39750c = (char) 0;
        this.f39751d = -1L;
        this.f39753f = new bo.b(this, 6, false, false);
        this.f39754g = new bo.b(this, 6, true, false);
        this.f39755h = new bo.b(this, 6, false, true);
        this.f39756i = new bo.b(this, 5, false, false);
        this.f39757j = new bo.b(this, 5, true, false);
        this.f39758k = new bo.b(this, 5, false, true);
        this.l = new bo.b(this, 4, false, false);
        this.f39759m = new bo.b(this, 3, false, false);
        this.f39760n = new bo.b(this, 2, false, false);
    }

    public static r0 O0(String str) {
        if (str == null) {
            return null;
        }
        return new r0(str);
    }

    public static String R0(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strS0 = S0(obj, z10);
        String strS1 = S0(obj2, z10);
        String strS2 = S0(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strS0)) {
            sb2.append(str2);
            sb2.append(strS0);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strS1)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strS1);
        }
        if (!TextUtils.isEmpty(strS2)) {
            sb2.append(str3);
            sb2.append(strS2);
        }
        return sb2.toString();
    }

    public static String S0(Object obj, boolean z10) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(ca.i(str.length() + length + 3, String.valueOf(jRound2).length(), str));
            q4.a.r(sb2, str, jRound, "...");
            return defpackage.e.s(sb2, str, jRound2);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof r0) {
                return ((r0) obj).f39740a;
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String canonicalName = m1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb3.toString();
    }

    @Override // ea.t1
    public final boolean H0() {
        return false;
    }

    public final bo.b K0() {
        return this.f39753f;
    }

    public final bo.b L0() {
        return this.f39756i;
    }

    public final bo.b M0() {
        return this.f39759m;
    }

    public final bo.b N0() {
        return this.f39760n;
    }

    public final void P0(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(Q0(), i10)) {
            Log.println(i10, Q0(), R0(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        k9.c0.h(str);
        j1 j1Var = ((m1) this.f3623a).f39588g;
        if (j1Var == null) {
            Log.println(6, Q0(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!j1Var.f39766b) {
                Log.println(6, Q0(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            j1Var.P0(new q0(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String Q0() {
        String str;
        synchronized (this) {
            try {
                if (this.f39752e == null) {
                    ((m1) ((m1) this.f3623a).f39585d.f3623a).getClass();
                    this.f39752e = "FA";
                }
                k9.c0.h(this.f39752e);
                str = this.f39752e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
