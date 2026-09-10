package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.phonoscope;

/* JADX INFO: loaded from: classes.dex */
public final class w01 implements phonoscope {
    public final wz0 a;

    public w01(wz0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.a = inspectorManager;
    }

    @Override // saneness.phonoscope
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        wz0 wz0Var = this.a;
        wz0Var.getClass();
        Object objA = wz0.a(wz0Var, jsonObject, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
