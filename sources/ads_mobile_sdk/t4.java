package ads_mobile_sdk;

import android.webkit.WebView;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import saneness.lerp;
import saneness.neuroepithelial;
import saneness.pact;

/* JADX INFO: loaded from: classes.dex */
public abstract class t4 {
    public final String a;
    public lerp b;
    public int c;
    public long d;

    public t4(String str) {
        a();
        this.a = str;
        this.b = new lerp(null);
    }

    public final void a() {
        this.d = System.nanoTime();
        this.c = 1;
    }

    public void b() {
        this.b.clear();
    }

    public void a(r4 r4Var, p4 p4Var) {
        a(r4Var, p4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(r4 r4Var, p4 p4Var, JSONObject jSONObject) {
        String str = r4Var.g;
        JSONObject jSONObject2 = new JSONObject();
        nw1.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        nw1.a(jSONObject2, "adSessionType", p4Var.h);
        nw1.a(jSONObject2, "deviceInfo", neuroepithelial.attabal());
        nw1.a(jSONObject2, "deviceCategory", pact.attabal(tv1.a()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        nw1.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        nw1.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, p4Var.a.a);
        nw1.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, p4Var.a.b);
        nw1.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        nw1.a(jSONObject4, "libraryVersion", "1.5.2-google_20241009");
        nw1.a(jSONObject4, "appId", i21.b.a.getApplicationContext().getPackageName());
        nw1.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        String str2 = p4Var.g;
        if (str2 != null) {
            nw1.a(jSONObject2, "contentUrl", str2);
        }
        String str3 = p4Var.f;
        if (str3 != null) {
            nw1.a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject5 = new JSONObject();
        Iterator it = Collections.unmodifiableList(p4Var.c).iterator();
        if (!it.hasNext()) {
            rv1.a.a((WebView) this.b.get(), "startSession", str, jSONObject2, jSONObject5, jSONObject);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void c() {
    }

    public final void a(WebView webView) {
        this.b = new lerp(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(o4 o4Var) {
        rv1 rv1Var = rv1.a;
        WebView webView = (WebView) this.b.get();
        String str = this.a;
        JSONObject jSONObject = new JSONObject();
        nw1.a(jSONObject, "impressionOwner", o4Var.a);
        nw1.a(jSONObject, "mediaEventsOwner", o4Var.b);
        nw1.a(jSONObject, "creativeType", o4Var.d);
        nw1.a(jSONObject, "impressionType", o4Var.e);
        nw1.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(o4Var.c));
        rv1Var.a(webView, X3.a.f, jSONObject, str);
    }
}
