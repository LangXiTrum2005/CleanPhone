package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class to {
    public static wd qdl(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar, com.bytedance.sdk.component.adexpress.ud.exu exuVar) {
        if (context == null || mzzVar == null || wdVar == null) {
            return null;
        }
        String strWc = wdVar.wc();
        String strBch = exuVar.bch();
        strWc.getClass();
        switch (strWc) {
            case "0":
                return new mzz(context, mzzVar, wdVar);
            case "1":
                return new lnr(context, mzzVar, wdVar);
            case "2":
                return new ud(context, mzzVar, wdVar);
            case "5":
                return wdVar.cx() == 1 ? new yt(context, mzzVar, wdVar, wdVar.mlb()) : new jtx(context, mzzVar, wdVar);
            case "6":
            case "11":
                return new rdp(context, mzzVar, wdVar);
            case "7":
            case "14":
                return new fs(context, mzzVar, wdVar);
            case "8":
                return new exu(context, mzzVar, wdVar);
            case "9":
            case "16":
                return new bjy(context, mzzVar, wdVar, strWc, toVar.qdl(), toVar.ud(), toVar.mml(), toVar.wd());
            case "10":
                return new mml(context, mzzVar, wdVar);
            case "12":
                return new jtx(context, mzzVar, wdVar);
            case "13":
                return new yt(context, mzzVar, wdVar);
            case "17":
            case "18":
                return new exc(context, mzzVar, wdVar, strWc, toVar);
            case "20":
                String strM = null;
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    return new rq(context, mzzVar, wdVar, a.m(strBch, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                if (!TextUtils.isEmpty(strBch)) {
                    strM = a.m(strBch, "brush_mask.json");
                }
                return new rq(context, mzzVar, wdVar, strM, "20");
            case "22":
                return com.bytedance.sdk.component.adexpress.mml.ud() ? new rq(context, mzzVar, wdVar, a.m(strBch, "static/lotties/202327swiper-up-star/index.json"), "22") : new jl(context, mzzVar, wdVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    return new rq(context, mzzVar, wdVar, a.m(strBch, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case "24":
                String strM2 = null;
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    return new qdl(context, mzzVar, wdVar);
                }
                if (!TextUtils.isEmpty(strBch)) {
                    strM2 = a.m(strBch, "swiper_up_star.json");
                }
                return new rq(context, mzzVar, wdVar, strM2, "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.mml.ud()) {
                    return new rq(context, mzzVar, wdVar, a.m(strBch, "static/lotties/gesture-slide.json"), "25");
                }
                break;
            case "29":
                return new mo(context, mzzVar, wdVar, toVar.qdl(), toVar.ud(), toVar.mml(), toVar.wd());
        }
        return null;
    }
}
