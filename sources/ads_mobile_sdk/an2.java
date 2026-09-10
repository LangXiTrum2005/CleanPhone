package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.phonoscope;

/* JADX INFO: loaded from: classes.dex */
public final class an2 implements phonoscope {
    public final iv a;

    public an2(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.phonoscope
    public final Object a(JsonObject jsonObject, wretchedly.dern dernVar) {
        if (cb1.a(jsonObject, "clear", "").length() > 0) {
            Object objJ = this.a.j(dernVar);
            return objJ == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objJ : Unit.f29295attabal;
        }
        String strA = cb1.a(jsonObject, "cookie", "");
        if (strA.length() <= 0) {
            return Unit.f29295attabal;
        }
        Object objA = this.a.a(strA, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
