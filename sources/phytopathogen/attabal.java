package phytopathogen;

import android.text.TextUtils;
import com.ironsource.C3414a2;
import com.ironsource.C3764u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static int f35317attabal = 10;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static boolean f35318beachfront = false;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static int f35319competently = 1;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static int f35320dern = 10;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static int f35321impromptu = 8192;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static bohunk.attabal f35322marial = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static int f35323saneness = 10;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static int f35324wireman = 10;

    public static int apical() {
        return f35321impromptu;
    }

    public static int attabal() {
        return f35319competently;
    }

    public static boolean beachfront(String str) {
        return f35318beachfront && str != null && str.endsWith(".mp4");
    }

    public static void competently() {
        bohunk.attabal attabalVar = f35322marial;
        if (attabalVar != null) {
            attabalVar.ka();
        }
    }

    public static void cutely(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f35317attabal = jSONObject.optInt("splash", 10);
            f35323saneness = jSONObject.optInt(C3764u.j, 10);
            f35320dern = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt(C3414a2.d, 10);
            f35324wireman = iOptInt;
            if (f35317attabal < 0) {
                f35317attabal = 10;
            }
            if (f35323saneness < 0) {
                f35323saneness = 10;
            }
            if (f35320dern < 0) {
                f35320dern = 10;
            }
            if (iOptInt < 0) {
                f35324wireman = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int dern() {
        return f35323saneness;
    }

    public static void impromptu(bohunk.attabal attabalVar) {
        f35322marial = attabalVar;
    }

    public static int marial() {
        return f35317attabal;
    }

    public static int saneness() {
        return f35324wireman;
    }

    public static void taiyuan(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f35318beachfront = jSONObject.optInt("check_moov", 0) == 1;
            f35319competently = jSONObject.optInt("new_media_source", 1);
            f35321impromptu = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static int wireman() {
        return f35320dern;
    }
}
