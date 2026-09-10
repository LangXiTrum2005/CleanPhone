package l7;

import cc.a2;
import com.google.android.gms.internal.ads.aj0;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45084b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f45083a = i10;
        this.f45084b = obj;
    }

    @Override // l7.w
    public final void a(e0 e0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i10 = this.f45083a;
        Object obj = this.f45084b;
        switch (i10) {
            case 0:
                aj0 aj0Var = (aj0) obj;
                JSONObject jSONObject3 = e0Var.f45112d;
                if (jSONObject3 != null) {
                    aj0Var.f12046e = jSONObject3.optString("access_token");
                    aj0Var.f12042a = jSONObject3.optInt("expires_at");
                    aj0Var.f12043b = jSONObject3.optInt("expires_in");
                    aj0Var.f12044c = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    aj0Var.f12045d = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 1:
                w wVar = (w) obj;
                JSONObject jSONObject4 = e0Var.f45110b;
                JSONObject jSONObjectOptJSONObject = jSONObject4 != null ? jSONObject4.optJSONObject("__debug__") : null;
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i11);
                        String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                        String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                        String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                        if (strOptString != null && strOptString2 != null) {
                            g0 g0Var = strOptString2.equals("warning") ? g0.f45138f : g0.f45139g;
                            if (!q7.e0.w(strOptString3)) {
                                strOptString = wi.d.i(strOptString, " Link: ", strOptString3);
                            }
                            q7.x.f48792c.s(g0Var, "b0", strOptString);
                        }
                    }
                }
                if (wVar != null) {
                    wVar.a(e0Var);
                }
                break;
            case 2:
                s7.c cVar = (s7.c) obj;
                try {
                    if (e0Var.f45111c == null && (jSONObject = e0Var.f45112d) != null && jSONObject.getBoolean("success")) {
                        a2.j(cVar.f50203a);
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (e0Var.f45111c == null && (jSONObject2 = e0Var.f45112d) != null && jSONObject2.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a2.j(((w7.a) it.next()).f52991a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
