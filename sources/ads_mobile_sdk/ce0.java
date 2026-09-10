package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.gerenuk;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 implements carport {
    public final e51 a;

    public ce0(e51 internalJavascriptEngine) {
        Intrinsics.checkNotNullParameter(internalJavascriptEngine, "internalJavascriptEngine");
        this.a = internalJavascriptEngine;
    }

    @Override // saneness.hydrofracturing
    public final Object a(String str, String str2, wretchedly.dern dernVar) {
        return this.a.a(str, str2, dernVar);
    }

    @Override // saneness.hydrofracturing
    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        Object objA = this.a.a(jsonObject, "sendMessageToNativeJs", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.carport
    public final gerenuk a() {
        return this.a.a.c();
    }

    @Override // saneness.carport
    public final Object a(wretchedly.dern dernVar) {
        Object objC = this.a.c(dernVar);
        return objC == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objC : Unit.f29295attabal;
    }
}
