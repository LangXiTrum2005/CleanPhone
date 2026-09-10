package saneness;

import ads_mobile_sdk.bx2;
import ads_mobile_sdk.gq0;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.kh0;
import ads_mobile_sdk.oa0;
import ads_mobile_sdk.wf;
import ads_mobile_sdk.xq0;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface blindfish {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object attabal(blindfish blindfishVar, xq0 xq0Var, h1 h1Var, oa0 oa0Var, wretchedly.dern dernVar) {
        kh0 kh0Var;
        if (dernVar instanceof kh0) {
            kh0Var = (kh0) dernVar;
            int i = kh0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kh0Var.f = i - Integer.MIN_VALUE;
            } else {
                kh0Var = new kh0(blindfishVar, dernVar);
            }
        } else {
            kh0Var = new kh0(blindfishVar, dernVar);
        }
        Object obj = kh0Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kh0Var.f;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            gq0 gq0Var = xq0Var.a;
            kh0Var.a = xq0Var;
            kh0Var.b = h1Var;
            kh0Var.c = oa0Var;
            kh0Var.f = 1;
            blindfishVar.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("app_muted", String.valueOf(blindfishVar.a().d));
            jsonObject.addProperty("app_volume", String.valueOf(blindfishVar.a().c));
            Object objA = gq0Var.a(jsonObject, "volume", kh0Var);
            if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oa0Var = kh0Var.c;
            h1Var = kh0Var.b;
            xq0Var = kh0Var.a;
            p002kotlin.dern.saneness(obj);
        }
        xq0Var.b = oa0Var;
        if (h1Var.a0) {
            Context context = xq0Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bx2 bx2Var = new bx2(context);
            xq0Var.addView(bx2Var, new FrameLayout.LayoutParams(-2, -2, 49));
            xq0Var.bringChildToFront(bx2Var);
        }
        return Unit.f29295attabal;
    }

    wf a();
}
