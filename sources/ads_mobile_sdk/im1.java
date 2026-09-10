package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class im1 implements hemolysin {
    public final yj1 a;

    public im1(yj1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.a = nativeAdCore;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        JsonObject jsonObject;
        yj1 f19434dern;
        technofreak technofreakVar = (technofreak) this.a.c.get();
        if (technofreakVar != null) {
            cm1 cm1Var = (cm1) technofreakVar;
            synchronized (cm1Var) {
                if (cm1Var.d.get()) {
                    jsonObject = new JsonObject();
                } else {
                    InternalNativeAd internalNativeAd = cm1Var.i;
                    if (internalNativeAd == null || (f19434dern = internalNativeAd.getF19434dern()) == null) {
                        jsonObject = new JsonObject();
                    } else {
                        FrameLayout frameLayout = cm1Var.b;
                        LinkedHashMap linkedHashMap = cm1Var.h;
                        ImageView.ScaleType scaleType = cm1Var.f;
                        if (scaleType == null) {
                            scaleType = gm1.i;
                        }
                        jsonObject = f19434dern.a(frameLayout, scaleType, linkedHashMap);
                    }
                }
            }
        } else {
            jsonObject = new JsonObject();
        }
        Object objA = gq0Var.a(jsonObject, "nativeAdViewSignalsReady", dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NATIVE_AD_VIEW_SIGNALS;
    }
}
