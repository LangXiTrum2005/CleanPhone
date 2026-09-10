package com.bytedance.sdk.openadsdk.core.co.lr.ri;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik<ri> {
    private int akr;
    private int de;
    private com.bytedance.sdk.openadsdk.core.co.lr eu;
    private int ri;
    private int xlq;
    private int zv;
    private float zxp;

    public lr(Context context) {
        super(context);
        this.akr = -1;
        this.de = -1;
        ri(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public ri ri() {
        ri riVar = new ri(this.lr);
        riVar.ri(this);
        return riVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        com.bytedance.adsdk.ugeno.jbs.di.ri riVarRi = ((ri) this.fi).ri();
        if (riVarRi != null) {
            this.eu.ri(riVarRi);
            ((ri) this.fi).ri(riVarRi);
        }
        ((ri) this.fi).ri(this.ri, this.akr, this.de, this.zv, this.xlq, this.zxp);
    }

    private void ri(Context context) {
        this.eu = new com.bytedance.sdk.openadsdk.core.co.lr(context, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1762437773:
                if (str.equals("barWidth")) {
                    b = 0;
                }
                break;
            case -1693050582:
                if (str.equals("bottomBackgroundColor")) {
                    b = 1;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 2;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 3;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 4;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    b = 5;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 6;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 7;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 8;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 9;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    b = 10;
                }
                break;
            case -857900864:
                if (str.equals("topBackgroundColor")) {
                    b = 11;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    b = 12;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = 13;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b = 14;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = 15;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                }
                break;
            case 766009114:
                if (str.equals("barHeight")) {
                    b = 18;
                }
                break;
            case 1048459909:
                if (str.equals("barRadius")) {
                    b = 19;
                }
                break;
            case 1428051567:
                if (str.equals("downtime")) {
                    b = 20;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = 21;
                }
                break;
        }
        switch (b) {
            case 0:
                this.zv = qd.lr(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 1:
                if (!TextUtils.isEmpty(str2)) {
                    this.de = Color.parseColor(str2);
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
                this.eu.ri(str, str2);
                break;
            case 11:
                if (!TextUtils.isEmpty(str2)) {
                    this.akr = Color.parseColor(str2);
                }
                break;
            case 18:
                this.xlq = qd.lr(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 19:
                this.zxp = qd.lr(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 20:
                this.ri = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik, com.bytedance.adsdk.ugeno.ka
    public void ri(Canvas canvas) {
        super.ri(canvas);
    }
}
