package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class zl2 implements hemolysin {
    public final carport a;

    public zl2(carport nativeJavascriptEngine) {
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        this.a = nativeJavascriptEngine;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.addProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Object objA = this.a.a(jsonObject, "sendMessageToNativeJs", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_SEND_MESSAGE_TO_NATIVE_JS;
    }
}
