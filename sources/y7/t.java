package y7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.appevents.InternalAppEventsLogger;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import l7.f0;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f54314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f54315b;

    public t(Parcel parcel) {
        HashMap map;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i11 = 0; i11 < i10; i11++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.f54314a = map != null ? b0.Y(map) : null;
    }

    public final void a(String str, String str2) {
        if (this.f54314a == null) {
            this.f54314a = new HashMap();
        }
        HashMap map = this.f54314a;
        if (map != null) {
        }
    }

    public final String c(String authId) {
        kotlin.jvm.internal.n.f(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", e());
            j(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.n.e(string, "param.toString()");
        return string;
    }

    public final p d() {
        p pVar = this.f54315b;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.n.l("loginClient");
        throw null;
    }

    public abstract String e();

    public String f() {
        return "fb" + l7.s.c() + "://authorize/";
    }

    public final void g(String str) {
        String strC;
        n nVar = d().f54300g;
        if (nVar == null || (strC = nVar.f54268d) == null) {
            strC = l7.s.c();
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(d().e(), strC);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(MBridgeConstans.APP_ID, strC);
        internalAppEventsLogger.logEventImplicitly("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean h(int i10, int i11, Intent intent) {
        return false;
    }

    public final void i(Bundle bundle, n nVar) {
        String string = bundle.getString("code");
        if (e0.w(string)) {
            throw new l7.n("No code param found from the request");
        }
        if (string == null) {
            throw new l7.n("Failed to create code exchange request");
        }
        String redirectUri = f();
        String str = nVar.f54283t;
        if (str == null) {
            str = "";
        }
        kotlin.jvm.internal.n.f(redirectUri, "redirectUri");
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", string);
        bundle2.putString("client_id", l7.s.c());
        bundle2.putString("redirect_uri", redirectUri);
        bundle2.putString("code_verifier", str);
        String str2 = l7.b0.f45085j;
        l7.b0 b0VarZ = j2.n.z(null, "oauth/access_token", null);
        b0VarZ.f45094h = f0.f45120a;
        b0VarZ.f45090d = bundle2;
        l7.e0 e0VarC = b0VarZ.c();
        l7.q qVar = e0VarC.f45111c;
        if (qVar != null) {
            throw new l7.u(qVar, qVar.a());
        }
        try {
            JSONObject jSONObject = e0VarC.f45110b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || e0.w(string2)) {
                throw new l7.n("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e10) {
            throw new l7.n("Fail to process code exchange response: " + e10.getMessage());
        }
    }

    public abstract int k(n nVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        HashMap map = this.f54314a;
        if (map == null) {
            dest.writeInt(-1);
            return;
        }
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            dest.writeString(str);
            dest.writeString(str2);
        }
    }

    public void b() {
    }

    public void j(JSONObject jSONObject) {
    }
}
