package y7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.storage.androidcleaner.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import oa.k0;
import org.json.JSONObject;
import q7.e0;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new l7.h(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t[] f54294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f54296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f54297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f54298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f54300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f54301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashMap f54302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f54303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54304k;
    public int l;

    public final void a(String str, String str2, boolean z10) {
        Map map = this.f54301h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f54301h == null) {
            this.f54301h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f54299f) {
            return true;
        }
        FragmentActivity fragmentActivityE = e();
        if ((fragmentActivityE != null ? fragmentActivityE.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f54299f = true;
            return true;
        }
        FragmentActivity fragmentActivityE2 = e();
        String string = fragmentActivityE2 != null ? fragmentActivityE2.getString(R.string.com_facebook_internet_permission_error_title) : null;
        String string2 = fragmentActivityE2 != null ? fragmentActivityE2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        n nVar = this.f54300g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new o(nVar, 3, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void c(o outcome) {
        p pVar;
        String str;
        kotlin.jvm.internal.n.f(outcome, "outcome");
        int i10 = outcome.f54286a;
        t tVarF = f();
        if (tVarF != null) {
            String strE = tVarF.e();
            HashMap map = tVarF.f54314a;
            if (i10 == 1) {
                str = "success";
            } else if (i10 == 2) {
                str = "cancel";
            } else {
                if (i10 != 3) {
                    throw null;
                }
                str = "error";
            }
            pVar = this;
            pVar.h(strE, str, outcome.f54289d, outcome.f54290e, map);
        } else {
            pVar = this;
        }
        Map map2 = pVar.f54301h;
        if (map2 != null) {
            outcome.f54292g = map2;
        }
        LinkedHashMap linkedHashMap = pVar.f54302i;
        if (linkedHashMap != null) {
            outcome.f54293h = linkedHashMap;
        }
        pVar.f54294a = null;
        pVar.f54295b = -1;
        pVar.f54300g = null;
        pVar.f54301h = null;
        pVar.f54304k = 0;
        pVar.l = 0;
        i0 i0Var = pVar.f54297d;
        if (i0Var != null) {
            q qVar = (q) i0Var.f50841b;
            qVar.f54306b = null;
            int i11 = i10 == 2 ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = qVar.getActivity();
            if (!qVar.isAdded() || activity == null) {
                return;
            }
            activity.setResult(i11, intent);
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:8:0x001e, B:10:0x0028, B:14:0x0053, B:13:0x003b), top: B:23:0x001e }] */
    public final void d(o outcome) {
        o oVar;
        kotlin.jvm.internal.n.f(outcome, "outcome");
        l7.a aVar = outcome.f54287b;
        if (aVar != null) {
            Date date = l7.a.l;
            if (go.k.P()) {
                l7.a aVarD = go.k.D();
                if (aVarD != null) {
                    try {
                        if (kotlin.jvm.internal.n.a(aVarD.f45079i, aVar.f45079i)) {
                            oVar = new o(this.f54300g, 1, outcome.f54287b, outcome.f54288c, null, null);
                        } else {
                            n nVar = this.f54300g;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            oVar = new o(nVar, 3, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e10) {
                        n nVar2 = this.f54300g;
                        String message = e10.getMessage();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Caught exception");
                        if (message != null) {
                            arrayList2.add(message);
                        }
                        c(new o(nVar2, 3, null, TextUtils.join(": ", arrayList2), null));
                        return;
                    }
                } else {
                    n nVar3 = this.f54300g;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("User logged in as different Facebook user.");
                    oVar = new o(nVar3, 3, null, TextUtils.join(": ", arrayList3), null);
                }
                c(oVar);
                return;
            }
        }
        c(outcome);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FragmentActivity e() {
        q qVar = this.f54296c;
        if (qVar != null) {
            return qVar.getActivity();
        }
        return null;
    }

    public final t f() {
        t[] tVarArr;
        int i10 = this.f54295b;
        if (i10 < 0 || (tVarArr = this.f54294a) == null) {
            return null;
        }
        return tVarArr[i10];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    public final r g() {
        Context contextE;
        n nVar;
        String strC;
        String str;
        r rVar = this.f54303j;
        if (rVar != null) {
            if (v7.a.b(rVar)) {
                str = null;
            } else {
                try {
                    str = rVar.f54311a;
                } catch (Throwable th2) {
                    v7.a.a(rVar, th2);
                    str = null;
                }
            }
            n nVar2 = this.f54300g;
            if (!kotlin.jvm.internal.n.a(str, nVar2 != null ? nVar2.f54268d : null)) {
                contextE = e();
                if (contextE == null) {
                    contextE = l7.s.b();
                }
                nVar = this.f54300g;
                if (nVar != null || (strC = nVar.f54268d) == null) {
                    strC = l7.s.c();
                }
                rVar = new r(contextE, strC);
                this.f54303j = rVar;
            }
        } else {
            contextE = e();
            if (contextE == null) {
                contextE = l7.s.b();
            }
            nVar = this.f54300g;
            if (nVar != null) {
                strC = l7.s.c();
            } else {
                strC = l7.s.c();
            }
            rVar = new r(contextE, strC);
            this.f54303j = rVar;
        }
        return rVar;
    }

    public final void h(String str, String str2, String str3, String str4, Map map) {
        n nVar = this.f54300g;
        if (nVar == null) {
            r rVarG = g();
            if (v7.a.b(rVarG)) {
                return;
            }
            try {
                ScheduledExecutorService scheduledExecutorService = r.f54310c;
                Bundle bundleG = un.a.g("");
                bundleG.putString("2_result", "error");
                bundleG.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                bundleG.putString("3_method", str);
                rVarG.a(bundleG, "fb_mobile_login_method_complete");
                return;
            } catch (Throwable th2) {
                v7.a.a(rVarG, th2);
                return;
            }
        }
        r rVarG2 = g();
        String str5 = nVar.f54271g;
        String str6 = nVar.f54278o ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (v7.a.b(rVarG2)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService2 = r.f54310c;
            Bundle bundleG2 = un.a.g(str5);
            bundleG2.putString("2_result", str2);
            if (str3 != null) {
                bundleG2.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleG2.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleG2.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleG2.putString("3_method", str);
            rVarG2.a(bundleG2, str6);
        } catch (Throwable th3) {
            v7.a.a(rVarG2, th3);
        }
    }

    public final void i(int i10, int i11, Intent intent) {
        this.f54304k++;
        if (this.f54300g != null) {
            if (intent != null) {
                int i12 = CustomTabMainActivity.f10565c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    j();
                    return;
                }
            }
            t tVarF = f();
            if (tVarF != null) {
                if ((tVarF instanceof m) && intent == null && this.f54304k < this.l) {
                    return;
                }
                tVarF.h(i10, i11, intent);
            }
        }
    }

    public final void j() {
        p pVar;
        t tVarF = f();
        if (tVarF != null) {
            pVar = this;
            pVar.h(tVarF.e(), "skipped", null, null, tVarF.f54314a);
        } else {
            pVar = this;
        }
        t[] tVarArr = pVar.f54294a;
        while (tVarArr != null) {
            int i10 = pVar.f54295b;
            if (i10 >= tVarArr.length - 1) {
                break;
            }
            pVar.f54295b = i10 + 1;
            t tVarF2 = pVar.f();
            if (tVarF2 != null) {
                if (!(tVarF2 instanceof x) || pVar.b()) {
                    n nVar = pVar.f54300g;
                    if (nVar == null) {
                        continue;
                    } else {
                        boolean z10 = nVar.f54278o;
                        String str = nVar.f54271g;
                        int iK = tVarF2.k(nVar);
                        pVar.f54304k = 0;
                        if (iK > 0) {
                            r rVarG = pVar.g();
                            String strE = tVarF2.e();
                            String str2 = z10 ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!v7.a.b(rVarG)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = r.f54310c;
                                    Bundle bundleG = un.a.g(str);
                                    bundleG.putString("3_method", strE);
                                    rVarG.a(bundleG, str2);
                                } catch (Throwable th2) {
                                    v7.a.a(rVarG, th2);
                                }
                            }
                            pVar.l = iK;
                        } else {
                            r rVarG2 = pVar.g();
                            String strE2 = tVarF2.e();
                            String str3 = z10 ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!v7.a.b(rVarG2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = r.f54310c;
                                    Bundle bundleG2 = un.a.g(str);
                                    bundleG2.putString("3_method", strE2);
                                    rVarG2.a(bundleG2, str3);
                                } catch (Throwable th3) {
                                    v7.a.a(rVarG2, th3);
                                }
                            }
                            pVar.a("not_tried", tVarF2.e(), true);
                        }
                        if (iK > 0) {
                            return;
                        }
                    }
                } else {
                    pVar.a("no_internet_permission", "1", false);
                }
            }
        }
        n nVar2 = pVar.f54300g;
        if (nVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            pVar.c(new o(nVar2, 3, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        dest.writeParcelableArray(this.f54294a, i10);
        dest.writeInt(this.f54295b);
        dest.writeParcelable(this.f54300g, i10);
        e0.K(dest, this.f54301h);
        e0.K(dest, this.f54302i);
    }
}
