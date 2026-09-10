package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static xha ri(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, com.bytedance.sdk.component.adexpress.dynamic.ka.qt qtVar, com.bytedance.sdk.component.adexpress.lr.aw awVar) {
        if (context == null || fiVar == null || xhaVar == null) {
            return null;
        }
        String strKt = xhaVar.kt();
        String strAy = awVar.ay();
        strKt.getClass();
        byte b = -1;
        switch (strKt.hashCode()) {
            case 48:
                if (strKt.equals("0")) {
                    b = 0;
                }
                break;
            case 49:
                if (strKt.equals("1")) {
                    b = 1;
                }
                break;
            case 50:
                if (strKt.equals("2")) {
                    b = 2;
                }
                break;
            case 53:
                if (strKt.equals(CampaignEx.CLICKMODE_ON)) {
                    b = 3;
                }
                break;
            case 54:
                if (strKt.equals("6")) {
                    b = 4;
                }
                break;
            case 55:
                if (strKt.equals(Bc.e)) {
                    b = 5;
                }
                break;
            case 56:
                if (strKt.equals("8")) {
                    b = 6;
                }
                break;
            case 57:
                if (strKt.equals("9")) {
                    b = 7;
                }
                break;
            case 1567:
                if (strKt.equals("10")) {
                    b = 8;
                }
                break;
            case 1568:
                if (strKt.equals("11")) {
                    b = 9;
                }
                break;
            case 1569:
                if (strKt.equals("12")) {
                    b = 10;
                }
                break;
            case 1570:
                if (strKt.equals("13")) {
                    b = 11;
                }
                break;
            case 1571:
                if (strKt.equals("14")) {
                    b = 12;
                }
                break;
            case 1573:
                if (strKt.equals("16")) {
                    b = 13;
                }
                break;
            case 1574:
                if (strKt.equals("17")) {
                    b = 14;
                }
                break;
            case 1575:
                if (strKt.equals("18")) {
                    b = 15;
                }
                break;
            case 1598:
                if (strKt.equals("20")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
            case 1600:
                if (strKt.equals("22")) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                }
                break;
            case 1601:
                if (strKt.equals("23")) {
                    b = 18;
                }
                break;
            case 1602:
                if (strKt.equals("24")) {
                    b = 19;
                }
                break;
            case 1603:
                if (strKt.equals("25")) {
                    b = 20;
                }
                break;
            case 1607:
                if (strKt.equals("29")) {
                    b = 21;
                }
                break;
        }
        switch (b) {
            case 0:
                return new fi(context, fiVar, xhaVar);
            case 1:
                return new ik(context, fiVar, xhaVar);
            case 2:
                return new lr(context, fiVar, xhaVar);
            case 3:
                return xhaVar.zyn() == 1 ? new bu(context, fiVar, xhaVar, xhaVar.nd()) : new slm(context, fiVar, xhaVar);
            case 4:
            case 9:
                return new bgr(context, fiVar, xhaVar);
            case 5:
            case 12:
                return new co(context, fiVar, xhaVar);
            case 6:
                return new aw(context, fiVar, xhaVar);
            case 7:
            case 13:
                return new vr(context, fiVar, xhaVar, strKt, qtVar.ri(), qtVar.lr(), qtVar.ka(), qtVar.xha());
            case 8:
                return new ka(context, fiVar, xhaVar);
            case 10:
                return new slm(context, fiVar, xhaVar);
            case 11:
                return new bu(context, fiVar, xhaVar);
            case 14:
            case 15:
                return new tan(context, fiVar, xhaVar, strKt, qtVar);
            case 16:
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    return new sf(context, fiVar, xhaVar, strAy + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                return new sf(context, fiVar, xhaVar, TextUtils.isEmpty(strAy) ? null : strAy + "brush_mask.json", "20");
            case 17:
                if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
                    return new nr(context, fiVar, xhaVar);
                }
                return new sf(context, fiVar, xhaVar, strAy + "static/lotties/202327swiper-up-star/index.json", "22");
            case 18:
                if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
                    return null;
                }
                return new sf(context, fiVar, xhaVar, strAy + "static/lotties/202327swiper-up-star/click.json", "23");
            case 19:
                if (com.bytedance.sdk.component.adexpress.ka.lr()) {
                    return new ri(context, fiVar, xhaVar);
                }
                return new sf(context, fiVar, xhaVar, TextUtils.isEmpty(strAy) ? null : strAy + "swiper_up_star.json", "24");
            case 20:
                if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
                    return null;
                }
                return new sf(context, fiVar, xhaVar, strAy + "static/lotties/gesture-slide.json", "25");
            case 21:
                return new di(context, fiVar, xhaVar, qtVar.ri(), qtVar.lr(), qtVar.ka(), qtVar.xha());
            default:
                return null;
        }
    }
}
