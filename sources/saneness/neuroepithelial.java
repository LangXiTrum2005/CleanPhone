package saneness;

import ads_mobile_sdk.nw1;
import android.os.Build;
import com.ironsource.L6;
import com.ironsource.X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class neuroepithelial {
    public static JSONObject attabal() {
        JSONObject jSONObject = new JSONObject();
        nw1.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        nw1.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        nw1.a(jSONObject, L6.F, X3.d);
        return jSONObject;
    }
}
