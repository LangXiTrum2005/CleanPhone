package y7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import l7.m0;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f54317d;

    public /* synthetic */ u() {
        this.f54316c = 1;
    }

    @Override // y7.t
    public boolean h(int i10, int i11, Intent intent) {
        String str;
        String string;
        Object obj;
        switch (this.f54316c) {
            case 0:
                n nVar = d().f54300g;
                if (intent == null) {
                    m(new o(nVar, 2, null, "Operation canceled", null));
                    return true;
                }
                String string2 = null;
                if (i11 == 0) {
                    Bundle extras = intent.getExtras();
                    if (extras != null && (string = extras.getString("error")) != null) {
                        str = string;
                    } else if (extras != null) {
                        String string3 = extras.getString("error_type");
                        str = string3;
                    } else {
                        str = null;
                    }
                    String string4 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
                    if (!"CONNECTION_FAILURE".equals(string4)) {
                        m(new o(nVar, 2, null, str, null));
                        return true;
                    }
                    if (extras != null && (string = extras.getString("error_message")) != null) {
                        string2 = string;
                    } else if (extras != null) {
                        string2 = extras.getString("error_description");
                    }
                    ArrayList arrayList = new ArrayList();
                    if (str != null) {
                        arrayList.add(str);
                    }
                    if (string2 != null) {
                        arrayList.add(string2);
                    }
                    m(new o(nVar, 3, null, TextUtils.join(": ", arrayList), string4));
                    return true;
                }
                if (i11 != -1) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("Unexpected resultCode from authorization.");
                    m(new o(nVar, 3, null, TextUtils.join(": ", arrayList2), null));
                    return true;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    m(new o(nVar, 3, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string5 = extras2.getString("error");
                if (string5 == null) {
                    string5 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                string2 = obj2 != null ? obj2.toString() : null;
                String string6 = extras2.getString("error_message");
                if (string6 == null) {
                    string6 = extras2.getString("error_description");
                }
                String string7 = extras2.getString("e2e");
                if (!e0.w(string7)) {
                    g(string7);
                }
                if (string5 != null || string2 != null || string6 != null || nVar == null) {
                    q(nVar, string5, string6, string2);
                    return true;
                }
                if (!extras2.containsKey("code") || e0.w(extras2.getString("code"))) {
                    r(extras2, nVar);
                    return true;
                }
                l7.s.d().execute(new ld.f(this, nVar, extras2, 12));
                return true;
            default:
                return super.h(i10, i11, intent);
        }
    }

    public void l(Bundle bundle, n request) {
        kotlin.jvm.internal.n.f(request, "request");
        int i10 = request.f54277n;
        String str = request.f54281r;
        String str2 = request.f54268d;
        String strF = request.f54269e;
        if (strF == null || strF.length() == 0) {
            strF = f();
        }
        bundle.putString("redirect_uri", strF);
        if (i10 == 2) {
            bundle.putString(MBridgeConstans.APP_ID, str2);
        } else {
            bundle.putString("client_id", str2);
        }
        bundle.putString("e2e", go.k.E());
        if (i10 == 2) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f54266b.contains("openid")) {
                bundle.putString("nonce", request.f54282s);
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.f54284u);
        int i11 = request.f54285v;
        bundle.putString("code_challenge_method", i11 != 0 ? wi.d.n(i11) : null);
        bundle.putString("return_scopes", com.ironsource.mediationsdk.metadata.a.f29610g);
        bundle.putString("auth_type", request.f54274j);
        bundle.putString("login_behavior", wi.d.o(request.f54265a));
        l7.s sVar = l7.s.f45212a;
        bundle.putString("sdk", "android-18.3.0");
        if (o() != null) {
            bundle.putString("sso", o());
        }
        bundle.putString("cct_prefetching", l7.s.f45223m ? "1" : "0");
        if (request.f54278o) {
            bundle.putString("fx_app", wi.d.e(i10));
        }
        if (request.f54279p) {
            bundle.putString("skip_dedupe", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (request.f54280q) {
            bundle.putString("force_confirmation", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (str != null && str.length() != 0) {
            bundle.putString("android_sso_context", str);
        }
        String str3 = request.l;
        if (str3 != null) {
            bundle.putString("messenger_page_id", str3);
            bundle.putString("reset_messenger_state", request.f54276m ? "1" : "0");
        }
    }

    public void m(o oVar) {
        if (oVar != null) {
            d().d(oVar);
        } else {
            d().j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    public Bundle n(n request) {
        FragmentActivity fragmentActivityE;
        kotlin.jvm.internal.n.f(request, "request");
        Bundle bundle = new Bundle();
        HashSet hashSet = request.f54266b;
        if (hashSet != null && !hashSet.isEmpty()) {
            String strJoin = TextUtils.join(",", request.f54266b);
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        int i10 = request.f54267c;
        if (i10 == 0) {
            i10 = 1;
        }
        bundle.putString("default_audience", wi.d.d(i10));
        bundle.putString("state", c(request.f54271g));
        Date date = l7.a.l;
        l7.a aVarD = go.k.D();
        String str = aVarD != null ? aVarD.f45075e : null;
        if (str == null) {
            fragmentActivityE = d().e();
            if (fragmentActivityE != null) {
                e0.c(fragmentActivityE);
            }
            a("access_token", "0");
        } else {
            Context contextE = d().e();
            if (contextE == null) {
                contextE = l7.s.b();
            }
            if (str.equals(contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                a("access_token", "1");
            } else {
                fragmentActivityE = d().e();
                if (fragmentActivityE != null) {
                    e0.c(fragmentActivityE);
                }
                a("access_token", "0");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        l7.s sVar = l7.s.f45212a;
        bundle.putString("ies", m0.c() ? "1" : "0");
        return bundle;
    }

    public String o() {
        return null;
    }

    public l7.g p() {
        return (l7.g) this.f54317d;
    }

    public void q(n nVar, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            a.f54213j = true;
            m(null);
            return;
        }
        if (xj.n.i0(xj.o.Q("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
            return;
        }
        if (xj.n.i0(xj.o.Q("access_denied", "OAuthAccessDeniedException"), str)) {
            m(new o(nVar, 2, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m(new o(nVar, 3, null, TextUtils.join(": ", arrayList), str3));
    }

    public void r(Bundle bundle, n nVar) {
        try {
            m(new o(nVar, 1, j1.f.k(nVar.f54266b, bundle, p(), nVar.f54268d), j1.f.l(bundle, nVar.f54282s), null, null));
        } catch (l7.n e10) {
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m(new o(nVar, 3, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public void s(n request, Bundle bundle, l7.n nVar) {
        o oVar;
        o oVar2;
        kotlin.jvm.internal.n.f(request, "request");
        p pVarD = d();
        String strValueOf = null;
        this.f54317d = null;
        String str = request.f54269e;
        if (str != null && str.length() != 0 && !str.equals(f())) {
            if (nVar instanceof l7.p) {
                pVarD.d(new o(pVarD.f54300g, 2, null, "User canceled log in.", null));
                return;
            }
            if (nVar != null) {
                this.f54317d = null;
                String message = nVar.getMessage();
                if (nVar instanceof l7.u) {
                    l7.q qVar = ((l7.u) nVar).f45231b;
                    strValueOf = String.valueOf(qVar.f45203b);
                    message = qVar.toString();
                }
                String str2 = strValueOf;
                n nVar2 = pVarD.f54300g;
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                pVarD.d(new o(nVar2, 3, null, TextUtils.join(": ", arrayList), str2));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f54317d = bundle.getString("e2e");
            }
            try {
                l7.a aVarK = j1.f.k(request.f54266b, bundle, p(), request.f54268d);
                oVar2 = new o(pVarD.f54300g, 1, aVarK, j1.f.l(bundle, request.f54282s), null, null);
                if (pVarD.e() != null) {
                    try {
                        CookieSyncManager.createInstance(pVarD.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (aVarK != null) {
                        String str3 = aVarK.f45075e;
                        Context contextE = d().e();
                        if (contextE == null) {
                            contextE = l7.s.b();
                        }
                        contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str3).apply();
                    }
                }
            } catch (l7.n e10) {
                n nVar3 = pVarD.f54300g;
                String message2 = e10.getMessage();
                ArrayList arrayList2 = new ArrayList();
                if (message2 != null) {
                    arrayList2.add(message2);
                }
                oVar = new o(nVar3, 3, null, TextUtils.join(": ", arrayList2), null);
                oVar2 = oVar;
            }
        } else if (nVar instanceof l7.p) {
            oVar2 = new o(pVarD.f54300g, 2, null, "User canceled log in.", null);
        } else {
            this.f54317d = null;
            String message3 = nVar != null ? nVar.getMessage() : null;
            if (nVar instanceof l7.u) {
                l7.q qVar2 = ((l7.u) nVar).f45231b;
                strValueOf = String.valueOf(qVar2.f45203b);
                message3 = qVar2.toString();
            }
            String str4 = strValueOf;
            n nVar4 = pVarD.f54300g;
            ArrayList arrayList3 = new ArrayList();
            if (message3 != null) {
                arrayList3.add(message3);
            }
            oVar = new o(nVar4, 3, null, TextUtils.join(": ", arrayList3), str4);
            oVar2 = oVar;
        }
        if (!e0.w((String) this.f54317d)) {
            g((String) this.f54317d);
        }
        pVarD.d(oVar2);
    }

    public boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = l7.s.b().getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        kotlin.jvm.internal.n.e(listQueryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        if (listQueryIntentActivities.isEmpty()) {
            return false;
        }
        q qVar = d().f54296c;
        wj.r rVar = null;
        if (qVar == null) {
            qVar = null;
        }
        if (qVar != null) {
            h.c cVar = qVar.f54308d;
            if (cVar == null) {
                kotlin.jvm.internal.n.l("launcher");
                throw null;
            }
            cVar.a(intent);
            rVar = wj.r.f53297a;
        }
        return rVar != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Parcel parcel, int i10) {
        super(parcel);
        this.f54316c = i10;
        switch (i10) {
            case 1:
                super(parcel);
                break;
            default:
                this.f54317d = l7.g.f45123b;
                break;
        }
    }

    public u(p pVar) {
        this.f54316c = 0;
        this.f54315b = pVar;
        this.f54317d = l7.g.f45123b;
    }
}
