package com.bytedance.sdk.component.adexpress.dynamic.Lxb;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.adexpress.ZU;
import com.bytedance.sdk.component.adexpress.dynamic.ZU.OY;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.CSn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DY;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.HD;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.IeN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ivz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JVA;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.KPU;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.QAg;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.STP;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sfi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VVE;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aH;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.brP;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eK;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ebl;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.foI;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hg;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.id;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kqm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nBu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nE;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sLN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xan;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static JXs Lxb(Context context, DynamicRootView dynamicRootView, OY oy) {
        NXR renderRequest;
        if (context == null || dynamicRootView == null || oy == null || oy.nBu() == null) {
            return null;
        }
        switch (oy.nBu().Lxb()) {
            case -1:
                return new nE(context, dynamicRootView, oy);
            case 0:
                return new CSn(context, dynamicRootView, oy);
            case 1:
                return new JVA(context, dynamicRootView, oy);
            case 2:
                return new ebl(context, dynamicRootView, oy);
            case 3:
                return new QAg(context, dynamicRootView, oy);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NXR(context, dynamicRootView, oy);
            case 5:
                return new STP(context, dynamicRootView, oy);
            case 6:
            case 9:
            case 17:
                return new lc(context, dynamicRootView, oy);
            case 7:
                return new hg(context, dynamicRootView, oy);
            case 8:
                return new brP(context, dynamicRootView, oy);
            case 10:
                return new VVE(context, dynamicRootView, oy);
            case 11:
                return new aH(context, dynamicRootView, oy);
            case 12:
                return new nBu(context, dynamicRootView, oy);
            case 13:
                return new id(context, dynamicRootView, oy);
            case 14:
                return new foI(context, dynamicRootView, oy);
            case 15:
                return ZU.LD() ? new KPU(context, dynamicRootView, oy) : new Ivz(context, dynamicRootView, oy);
            case 16:
                return new JVA(context, dynamicRootView, oy);
            case 18:
                return new eK(context, dynamicRootView, oy);
            case 19:
                return new HD(context, dynamicRootView, oy);
            case 20:
                return new DY(context, dynamicRootView, oy);
            case 21:
                return new Sfi(context, dynamicRootView, oy);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.OY(context, dynamicRootView, oy);
            case 23:
                return new kqm(context, dynamicRootView, oy);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZU(context, dynamicRootView, oy);
            case 25:
                return new sLN(context, dynamicRootView, oy);
            case 26:
                return "vertical".equals(oy.nBu().JXs().AcC()) ? new xan(context, dynamicRootView, oy) : new lk(context, dynamicRootView, oy);
            case 27:
                return new Ivz(context, dynamicRootView, oy);
            case 28:
                if (!ZU.LD() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new IeN(context, dynamicRootView, oy, renderRequest.aH());
            default:
                return null;
        }
    }
}
