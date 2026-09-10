package defpackage;

import ab.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.j5;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void A(String str, String str2, p pVar, String str3) {
        pVar.a(str3, str + str2);
    }

    public static void B(StringBuilder sb2, MaxAdListener maxAdListener, p pVar, String str) {
        sb2.append(maxAdListener);
        pVar.a(str, sb2.toString());
    }

    public static void C(StringBuilder sb2, String str, p pVar, String str2) {
        sb2.append(str);
        pVar.a(str2, sb2.toString());
    }

    public static int D(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String F(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static final void a(int i10, View view, ViewGroup container) {
        n.f(view, "view");
        n.f(container, "container");
        if (g1.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iC = i.c(i10);
        if (iC == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iC == 1) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (g1.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iC == 2) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iC != 3) {
            return;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ boolean b(int i10) {
        return i10 != 1 ? d(i10) : c(i10);
    }

    public static final boolean c(int i10) {
        return !a.a();
    }

    public static final boolean d(int i10) {
        Boolean bool;
        if (a.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                a.f3449a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 / i11) * i12) + i13;
    }

    public static String f(char c4, String str, String str2) {
        return str + str2 + c4;
    }

    public static String g(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String h(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String i(long j10, String str) {
        return str + j10;
    }

    public static String j(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String l(Class cls, String str) {
        return str + cls;
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, Throwable th2) {
        return str + th2 + str2 + str3;
    }

    public static String q(String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String s(StringBuilder sb2, String str, long j10) {
        sb2.append(str);
        sb2.append(j10);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, boolean z10, char c4) {
        sb2.append(z10);
        sb2.append(c4);
        return sb2.toString();
    }

    public static StringBuilder u(int i10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static Map w() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static JSONArray x(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static JSONObject y(j5 j5Var, String str) {
        return j5Var.a(str, new JSONObject());
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }
}
