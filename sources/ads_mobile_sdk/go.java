package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.fathom;
import saneness.hemolysin;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class go implements hemolysin {
    public final Context a;
    public final loun b;

    public go(Context context, loun traceLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = context;
        this.b = traceLogger;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        Object objResolveActivity;
        String str = (String) map.get("data");
        if (str == null) {
            y13.a("Missing data argument for canOpenIntents gmsg", null, 6);
            Object objA = gq0Var.a(new JsonObject(), "openableIntents", dernVar);
            return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        try {
            JsonArray jsonArrayD = cb1.d((JsonObject) new Gson().fromJson(str, JsonObject.class), "intents");
            if (jsonArrayD == null) {
                y13.a("Missing intents parameter for canOpenIntents gmsg", null, 6);
                Object objA2 = gq0Var.a(new JsonObject(), "openableIntents", dernVar);
                return objA2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA2 : Unit.f29295attabal;
            }
            JsonObject jsonObject = new JsonObject();
            int size = jsonArrayD.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObjectA = cb1.a(jsonArrayD, i);
                if (jsonObjectA != null) {
                    String strA = cb1.a(jsonObjectA, "id", "");
                    Intent intent = (Intent) fathom.attabal(cb1.a(jsonObjectA, "intent_url", ""), new fo(this));
                    if (intent == null) {
                        intent = new Intent();
                        fathom.attabal(cb1.a(jsonObjectA, "u", ""), new ao(intent));
                        fathom.attabal(cb1.a(jsonObjectA, "i", ""), new bo(intent));
                        fathom.attabal(cb1.a(jsonObjectA, "m", ""), new co(intent));
                        fathom.attabal(cb1.a(jsonObjectA, TtmlNode.TAG_P, ""), new Cdo(intent));
                        fathom.attabal(cb1.a(jsonObjectA, "c", ""), new eo(intent));
                    }
                    try {
                        objResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
                    } catch (Exception e) {
                        ((d13) this.b).a("Failed resolving intent: " + intent, e);
                        objResolveActivity = Unit.f29295attabal;
                    }
                    jsonObject.addProperty(strA, igo.attabal.attabal(objResolveActivity != null));
                }
            }
            String str2 = (String) map.get("ad_mid");
            if (str2 != null && !StringsKt.empress(str2)) {
                jsonObject.addProperty("ad_mid", str2);
            }
            Object objA3 = gq0Var.a(jsonObject, "openableIntents", dernVar);
            return objA3 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA3 : Unit.f29295attabal;
        } catch (Exception e2) {
            y13.a("Invalid JSON data for canOpenIntents gmsg", e2, 4);
            ((d13) this.b).a("Invalid JSON data for canOpenIntents gmsg", e2);
            Object objA4 = gq0Var.a(new JsonObject(), "openableIntents", dernVar);
            return objA4 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA4 : Unit.f29295attabal;
        }
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CAN_OPEN_INTENTS;
    }
}
