package ads_mobile_sdk;

import android.os.Build;
import com.google.gson.JsonObject;
import com.ironsource.Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes.dex */
public final class bk0 {
    public static final /* synthetic */ bk0 a;
    public static final JsonObject b;

    static {
        Double dValueOf = Double.valueOf(0.5d);
        a = new bk0();
        JsonObject jsonObject = new JsonObject();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            jsonObject.addProperty("4", (Number) 1);
            jsonObject.addProperty(CampaignEx.CLICKMODE_ON, (Number) 1);
            jsonObject.addProperty("6", dValueOf);
            jsonObject.addProperty("9", dValueOf);
            jsonObject.addProperty("0", (Number) 0);
            jsonObject.addProperty("2", (Number) 0);
            jsonObject.addProperty("3", (Number) 0);
            jsonObject.addProperty(Bc.e, (Number) 0);
            jsonObject.addProperty("12", (Number) (-1));
            jsonObject.addProperty("1", (Number) (-1));
            if (i >= 33) {
                jsonObject.addProperty("14", (Number) (-1));
            }
            jsonObject.addProperty("13", (Number) (-1));
            if (i >= 35) {
                jsonObject.addProperty("15", (Number) (-1));
                jsonObject.addProperty("16", (Number) (-1));
            }
            jsonObject.addProperty("8", (Number) (-1));
            jsonObject.addProperty("10", (Number) (-1));
            jsonObject.addProperty("11", (Number) (-1));
        }
        b = jsonObject;
    }
}
