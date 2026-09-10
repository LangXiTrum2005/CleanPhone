package com.bytedance.sdk.component.adexpress.dynamic.ri;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ac;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ay;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bgr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.co;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hcw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.igq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ihz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ik;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jbs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ory;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.slm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.su;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wjv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zf;
import com.bytedance.sdk.component.adexpress.dynamic.ka.mj;
import com.bytedance.sdk.component.adexpress.ka;
import com.bytedance.sdk.component.adexpress.lr.aw;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static fi ri(Context context, DynamicRootView dynamicRootView, mj mjVar) {
        aw renderRequest;
        if (context == null || dynamicRootView == null || mjVar == null || mjVar.qt() == null) {
            return null;
        }
        switch (mjVar.qt().ri()) {
            case -1:
                return new ory(context, dynamicRootView, mjVar);
            case 0:
                return new fr(context, dynamicRootView, mjVar);
            case 1:
                return new sf(context, dynamicRootView, mjVar);
            case 2:
                return new xha(context, dynamicRootView, mjVar);
            case 3:
                return new jbs(context, dynamicRootView, mjVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aw(context, dynamicRootView, mjVar);
            case 5:
                return new bgr(context, dynamicRootView, mjVar);
            case 6:
            case 9:
            case 17:
                return new di(context, dynamicRootView, mjVar);
            case 7:
                return new oh(context, dynamicRootView, mjVar);
            case 8:
                return new nr(context, dynamicRootView, mjVar);
            case 10:
                return new slm(context, dynamicRootView, mjVar);
            case 11:
                return new ay(context, dynamicRootView, mjVar);
            case 12:
                return new qt(context, dynamicRootView, mjVar);
            case 13:
                return new su(context, dynamicRootView, mjVar);
            case 14:
                return new igq(context, dynamicRootView, mjVar);
            case 15:
                return ka.lr() ? new zf(context, dynamicRootView, mjVar) : new dw(context, dynamicRootView, mjVar);
            case 16:
                return new sf(context, dynamicRootView, mjVar);
            case 18:
                return new wjv(context, dynamicRootView, mjVar);
            case 19:
                return new uq(context, dynamicRootView, mjVar);
            case 20:
                return new ac(context, dynamicRootView, mjVar);
            case 21:
                return new ihz(context, dynamicRootView, mjVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mj(context, dynamicRootView, mjVar);
            case 23:
                return new bu(context, dynamicRootView, mjVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ka(context, dynamicRootView, mjVar);
            case 25:
                return new co(context, dynamicRootView, mjVar);
            case 26:
                return "vertical".equals(mjVar.qt().fi().jxw()) ? new hcw(context, dynamicRootView, mjVar) : new ik(context, dynamicRootView, mjVar);
            case 27:
                return new dw(context, dynamicRootView, mjVar);
            case 28:
                if (!ka.lr() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new vr(context, dynamicRootView, mjVar, renderRequest.ay());
            default:
                return null;
        }
    }
}
