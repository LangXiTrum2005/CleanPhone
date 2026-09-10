package ea;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f39659b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f39660c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f39661d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f39662a;

    public o0(c1 c1Var) {
        this.f39662a = c1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        k9.c0.h(atomicReference);
        k9.c0.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f39662a.a() ? str : g(str, z1.f39941f, z1.f39936a, f39659b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f39662a.a() ? str : g(str, z1.f39944i, z1.f39943h, f39660c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f39662a.a()) {
            return str.startsWith("_exp_") ? defpackage.e.o("experiment_id(", str, ")") : g(str, z1.f39947m, z1.l, f39661d);
        }
        return str;
    }

    public final String d(u uVar) {
        String string;
        c1 c1Var = this.f39662a;
        if (!c1Var.a()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(uVar.f39773c);
        sb2.append(",name=");
        sb2.append(a(uVar.f39771a));
        sb2.append(",params=");
        t tVar = uVar.f39772b;
        if (tVar == null) {
            string = null;
        } else {
            string = !c1Var.a() ? tVar.f39765a.toString() : e(tVar.n());
        }
        sb2.append(string);
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f39662a.a()) {
            return bundle.toString();
        }
        StringBuilder sbI = d5.u.i("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbI.length() != 8) {
                sbI.append(", ");
            }
            sbI.append(b(str));
            sbI.append(X3.j.f27830b);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbI.append(strF);
        }
        sbI.append("}]");
        return sbI.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbI = d5.u.i(X3.j.f27834d);
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbI.length() != 1) {
                    sbI.append(", ");
                }
                sbI.append(strE);
            }
        }
        sbI.append(X3.j.f27836e);
        return sbI.toString();
    }
}
