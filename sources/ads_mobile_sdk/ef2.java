package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 extends Lambda implements Function0 {
    public final /* synthetic */ jf2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef2(jf2 jf2Var) {
        super(0);
        this.a = jf2Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        JsonObject jsonObject = this.a.t;
        if (jsonObject == null) {
            Intrinsics.preprohormone("signalJson");
            jsonObject = null;
        }
        return "Ad Request Signals: " + jsonObject;
    }
}
