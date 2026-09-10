package saneness;

import ads_mobile_sdk.fj1;
import ads_mobile_sdk.g61;
import ads_mobile_sdk.hj1;
import ads_mobile_sdk.hz2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class beccafico {
    public static hj1 attabal(weimar nativeAdMapper, AdChoicesPlacement adChoicePlacement) {
        g61 g61Var;
        g61 g61Var2;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        Intrinsics.checkNotNullParameter(adChoicePlacement, "adChoicePlacement");
        hj1 hj1Var = new hj1();
        hj1Var.b = fj1.NATIVE;
        hj1Var.a = 6;
        ArrayList arrayListF = nativeAdMapper.f();
        bohunk bohunkVar = arrayListF != null ? (bohunk) CollectionsKt.firstOrNull(arrayListF) : null;
        if (bohunkVar != null) {
            Drawable drawableE = bohunkVar.e();
            Uri uriD = bohunkVar.d();
            if (uriD == null) {
                uriD = Uri.EMPTY;
            }
            Intrinsics.beachfront(uriD);
            g61Var = new g61(drawableE, uriD, bohunkVar.a(), bohunkVar.c(), bohunkVar.b());
        } else {
            g61Var = null;
        }
        hj1Var.f = g61Var;
        bohunk icon = nativeAdMapper.getIcon();
        if (icon != null) {
            Drawable drawableE2 = icon.e();
            Uri uriD2 = icon.d();
            if (uriD2 == null) {
                uriD2 = Uri.EMPTY;
            }
            Intrinsics.beachfront(uriD2);
            g61Var2 = new g61(drawableE2, uriD2, icon.a(), icon.c(), icon.b());
        } else {
            g61Var2 = null;
        }
        hj1Var.g = g61Var2;
        for (Map.Entry entry : p002kotlin.collections.seminary.impassible(patroclinal.formularize.attabal("headline", nativeAdMapper.getHeadline()), patroclinal.formularize.attabal("body", nativeAdMapper.getBody()), patroclinal.formularize.attabal(X3.i.F0, nativeAdMapper.getAdvertiser()), patroclinal.formularize.attabal("call_to_action", nativeAdMapper.getCallToAction()), patroclinal.formularize.attabal(X3.i.U, nativeAdMapper.getStore()), patroclinal.formularize.attabal("price", nativeAdMapper.getPrice())).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                hj1Var.d.put(str, str2);
            }
        }
        hj1Var.k = nativeAdMapper.a();
        hj1Var.m = nativeAdMapper.getHasVideoContent() ? new hz2() : null;
        hj1Var.r = nativeAdMapper.getExtras();
        hj1Var.s = nativeAdMapper.e();
        hj1Var.t = nativeAdMapper.c();
        hj1Var.u = adChoicePlacement;
        return hj1Var;
    }
}
