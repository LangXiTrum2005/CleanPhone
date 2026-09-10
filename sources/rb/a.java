package rb;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import ea.z1;
import oa.e0;
import oa.f0;
import oa.j0;
import oa.n1;
import oa.q;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f49520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f49521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f49522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1 f49523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f49524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1 f49525f;

    static {
        int i10 = u0.f47325c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f49520a = u0.u(15, objArr);
        f0 f0Var = j0.f47265b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        q.b(7, objArr2);
        f49521b = j0.t(7, objArr2);
        Object[] objArr3 = {"auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am"};
        q.b(3, objArr3);
        f49522c = j0.t(3, objArr3);
        f49523d = j0.C("_r", "_dbg");
        e0 e0Var = new e0(4);
        e0Var.c(z1.l);
        e0Var.c(z1.f39947m);
        f49524e = e0Var.g();
        f49525f = j0.C("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f49522c.contains(str);
    }

    public static boolean b(Bundle bundle, String str) {
        if (!f49521b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            n1 n1Var = f49523d;
            int i10 = n1Var.f47283d;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) n1Var.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f49524e.contains(str2)) {
            n1 n1Var = f49525f;
            int i10 = n1Var.f47283d;
            int i11 = 0;
            while (i11 < i10) {
                boolean zMatches = str2.matches((String) n1Var.get(i11));
                i11++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str, Bundle bundle, String str2) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (a(str) && bundle != null) {
            n1 n1Var = f49523d;
            int i10 = n1Var.f47283d;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) n1Var.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
