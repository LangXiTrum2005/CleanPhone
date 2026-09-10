package com.bytedance.sdk.component.adexpress.dynamic.qdl;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aaj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bch;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bjy;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bqt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ekw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jl;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jtx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jyq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kdv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.koa;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ljh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lnr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oth;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rdp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.to;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tvp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xmv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yt;
import com.bytedance.sdk.component.adexpress.dynamic.mml.jpc;
import com.bytedance.sdk.component.adexpress.mml;
import com.bytedance.sdk.component.adexpress.ud.exu;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    public static mzz qdl(Context context, DynamicRootView dynamicRootView, jpc jpcVar) {
        exu renderRequest;
        if (context == null || dynamicRootView == null || jpcVar == null || jpcVar.to() == null) {
            return null;
        }
        switch (jpcVar.to().qdl()) {
            case -1:
                return new rc(context, dynamicRootView, jpcVar);
            case 0:
                return new uw(context, dynamicRootView, jpcVar);
            case 1:
                return new rq(context, dynamicRootView, jpcVar);
            case 2:
                return new wd(context, dynamicRootView, jpcVar);
            case 3:
                return new tvp(context, dynamicRootView, jpcVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.exu(context, dynamicRootView, jpcVar);
            case 5:
                return new rdp(context, dynamicRootView, jpcVar);
            case 6:
            case 9:
            case 17:
                return new mo(context, dynamicRootView, jpcVar);
            case 7:
                return new ekw(context, dynamicRootView, jpcVar);
            case 8:
                return new jl(context, dynamicRootView, jpcVar);
            case 10:
                return new jtx(context, dynamicRootView, jpcVar);
            case 11:
                return new bch(context, dynamicRootView, jpcVar);
            case 12:
                return new to(context, dynamicRootView, jpcVar);
            case 13:
                return new xmv(context, dynamicRootView, jpcVar);
            case 14:
                return new bqt(context, dynamicRootView, jpcVar);
            case 15:
                return mml.ud() ? new koa(context, dynamicRootView, jpcVar) : new vu(context, dynamicRootView, jpcVar);
            case 16:
                return new rq(context, dynamicRootView, jpcVar);
            case 18:
                return new ljh(context, dynamicRootView, jpcVar);
            case 19:
                return new oth(context, dynamicRootView, jpcVar);
            case 20:
                return new aaj(context, dynamicRootView, jpcVar);
            case 21:
                return new jyq(context, dynamicRootView, jpcVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jpc(context, dynamicRootView, jpcVar);
            case 23:
                return new yt(context, dynamicRootView, jpcVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mml(context, dynamicRootView, jpcVar);
            case 25:
                return new fs(context, dynamicRootView, jpcVar);
            case 26:
                return "vertical".equals(jpcVar.to().mzz().ji()) ? new kdv(context, dynamicRootView, jpcVar) : new lnr(context, dynamicRootView, jpcVar);
            case 27:
                return new vu(context, dynamicRootView, jpcVar);
            case 28:
                if (!mml.ud() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new bjy(context, dynamicRootView, jpcVar, renderRequest.bch());
            default:
                return null;
        }
    }
}
