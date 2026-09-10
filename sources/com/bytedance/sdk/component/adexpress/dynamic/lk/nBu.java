package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.text.TextUtils;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ebl Lxb(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, com.bytedance.sdk.component.adexpress.dynamic.ZU.nBu nbu, com.bytedance.sdk.component.adexpress.LD.NXR nxr) {
        if (context == null || jXs == null || eblVar == null) {
            return null;
        }
        String strNDz = eblVar.NDz();
        String strAH = nxr.aH();
        strNDz.getClass();
        strNDz.hashCode();
        byte b = -1;
        switch (strNDz.hashCode()) {
            case 48:
                if (strNDz.equals("0")) {
                    b = 0;
                }
                break;
            case 49:
                if (strNDz.equals("1")) {
                    b = 1;
                }
                break;
            case 50:
                if (strNDz.equals("2")) {
                    b = 2;
                }
                break;
            case 53:
                if (strNDz.equals(CampaignEx.CLICKMODE_ON)) {
                    b = 3;
                }
                break;
            case 54:
                if (strNDz.equals("6")) {
                    b = 4;
                }
                break;
            case 55:
                if (strNDz.equals("7")) {
                    b = 5;
                }
                break;
            case Input.Keys.PERIOD /* 56 */:
                if (strNDz.equals("8")) {
                    b = 6;
                }
                break;
            case Input.Keys.ALT_LEFT /* 57 */:
                if (strNDz.equals("9")) {
                    b = 7;
                }
                break;
            case 1567:
                if (strNDz.equals("10")) {
                    b = 8;
                }
                break;
            case 1568:
                if (strNDz.equals("11")) {
                    b = 9;
                }
                break;
            case 1569:
                if (strNDz.equals("12")) {
                    b = 10;
                }
                break;
            case 1570:
                if (strNDz.equals("13")) {
                    b = 11;
                }
                break;
            case 1571:
                if (strNDz.equals("14")) {
                    b = 12;
                }
                break;
            case 1573:
                if (strNDz.equals("16")) {
                    b = cw.k;
                }
                break;
            case 1574:
                if (strNDz.equals("17")) {
                    b = cw.l;
                }
                break;
            case 1575:
                if (strNDz.equals("18")) {
                    b = cw.m;
                }
                break;
            case 1598:
                if (strNDz.equals("20")) {
                    b = cw.n;
                }
                break;
            case 1600:
                if (strNDz.equals("22")) {
                    b = 17;
                }
                break;
            case 1601:
                if (strNDz.equals("23")) {
                    b = 18;
                }
                break;
            case 1602:
                if (strNDz.equals("24")) {
                    b = 19;
                }
                break;
            case 1603:
                if (strNDz.equals("25")) {
                    b = 20;
                }
                break;
            case 1607:
                if (strNDz.equals("29")) {
                    b = 21;
                }
                break;
        }
        switch (b) {
            case 0:
                return new JXs(context, jXs, eblVar);
            case 1:
                return new lk(context, jXs, eblVar);
            case 2:
                return new LD(context, jXs, eblVar);
            case 3:
                return eblVar.VU() == 1 ? new kqm(context, jXs, eblVar, eblVar.wbY()) : new VVE(context, jXs, eblVar);
            case 4:
            case 9:
                return new STP(context, jXs, eblVar);
            case 5:
            case 12:
                return new sLN(context, jXs, eblVar);
            case 6:
                return new NXR(context, jXs, eblVar);
            case 7:
            case 13:
                return new IeN(context, jXs, eblVar, strNDz, nbu.Lxb(), nbu.LD(), nbu.ZU(), nbu.ebl());
            case 8:
                return new ZU(context, jXs, eblVar);
            case 10:
                return new VVE(context, jXs, eblVar);
            case 11:
                return new kqm(context, jXs, eblVar);
            case 14:
            case 15:
                return new tD(context, jXs, eblVar, strNDz, nbu);
            case 16:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    return new JVA(context, jXs, eblVar, DM.h(strAH, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                return new JVA(context, jXs, eblVar, TextUtils.isEmpty(strAH) ? null : DM.h(strAH, "brush_mask.json"), "20");
            case 17:
                return com.bytedance.sdk.component.adexpress.ZU.LD() ? new JVA(context, jXs, eblVar, DM.h(strAH, "static/lotties/202327swiper-up-star/index.json"), "22") : new brP(context, jXs, eblVar);
            case 18:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    return new JVA(context, jXs, eblVar, DM.h(strAH, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case 19:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    return new Lxb(context, jXs, eblVar);
                }
                return new JVA(context, jXs, eblVar, TextUtils.isEmpty(strAH) ? null : DM.h(strAH, "swiper_up_star.json"), "24");
            case 20:
                if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
                    return new JVA(context, jXs, eblVar, DM.h(strAH, "static/lotties/gesture-slide.json"), "25");
                }
                return null;
            case 21:
                return new lc(context, jXs, eblVar, nbu.Lxb(), nbu.LD(), nbu.ZU(), nbu.ebl());
            default:
                return null;
        }
    }
}
