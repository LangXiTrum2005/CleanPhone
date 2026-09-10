package com.bytedance.adsdk.ugeno.jbs.di;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.lr.ik;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik<ri> {

    @Deprecated
    private TextUtils.TruncateAt adz;
    protected int akr;
    private float amj;
    private float bfa;
    private boolean bzf;
    private float de;
    private float eqw;
    private int eu;
    private float evm;
    private TextUtils.TruncateAt ezp;
    private int fb;
    private float fn;
    private int jm;

    @Deprecated
    private float rbz;
    protected String ri;

    @Deprecated
    private float smj;
    private float sz;
    private int tpb;
    private int xlq;
    private float zv;
    private int zxp;

    public lr(Context context) {
        super(context);
        this.akr = -16777216;
        this.de = 12.0f;
        this.zv = -1.0f;
        this.zxp = Integer.MAX_VALUE;
        this.tpb = 8388611;
        this.ezp = TextUtils.TruncateAt.END;
        this.evm = -1.0f;
        this.sz = 400.0f;
    }

    private TextUtils.TruncateAt bgr(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.adz = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.adz = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.adz = TextUtils.TruncateAt.START;
                break;
            default:
                this.adz = null;
                break;
        }
        return this.adz;
    }

    private int bu(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private void jbs() {
        float f = this.evm;
        if (f <= 3.0f) {
            ((ri) this.fi).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(mj.ri(this.lr, (f - (this.de * 1.2f)) / 2.0f));
            int paddingTop = ((ri) this.fi).getPaddingTop() + iRound;
            int paddingBottom = ((ri) this.fi).getPaddingBottom() + iRound;
            T t = this.fi;
            ((ri) t).setPadding(((ri) t).getPaddingLeft(), paddingTop, ((ri) this.fi).getPaddingRight(), paddingBottom);
            ((ri) this.fi).setLineHeight(Math.round(mj.ri(this.lr, this.evm)));
        }
    }

    private void ka() {
        ((ri) this.fi).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.evm);
    }

    private int nr(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int slm(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1178781136) {
            return str.equals(TtmlNode.ITALIC) ? 2 : 0;
        }
        if (iHashCode != -1039745817) {
            return (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) ? 1 : 0;
        }
        str.equals("normal");
        return 0;
    }

    private TextUtils.TruncateAt vr(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void aw(String str) {
        this.ri = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.ri = "";
        }
        ((ri) this.fi).setText(this.ri);
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
        if (TextUtils.equals("null", this.ri)) {
            this.ri = "";
        }
        aw(this.ri);
        ((ri) this.fi).setTextSize(1, this.de);
        ((ri) this.fi).setTextColor(this.akr);
        ((ri) this.fi).setLines(this.eu);
        ((ri) this.fi).setMaxLines(this.zxp);
        ((ri) this.fi).setGravity(this.tpb);
        ((ri) this.fi).setIncludeFontPadding(false);
        ((ri) this.fi).setMinTextSize(mj.ri(this.lr, this.zv));
        ri(this.jm);
        if (hcw()) {
            ri(this.ezp);
        } else {
            ri(this.adz);
        }
        if (this.evm > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (hcw()) {
                jbs();
            } else {
                ka();
            }
        }
        int i = Build.VERSION.SDK_INT;
        ((ri) this.fi).setBreakStrategy(0);
        if (!hcw()) {
            ((ri) this.fi).setShadowLayer(this.bfa, this.smj, this.rbz, this.fb);
        } else if (this.bzf) {
            if (this.bfa <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.bfa = 1.0E-5f;
            }
            ((ri) this.fi).setShadowLayer(this.bfa, this.eqw, this.amj, this.fb);
        }
        int i2 = this.xlq;
        if (i2 == 1) {
            ((ri) this.fi).setTypeface(Typeface.DEFAULT, i2);
        } else if (i >= 28) {
            ((ri) this.fi).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.sz, i2 == 2));
        } else if (this.sz >= 500.0f) {
            ((ri) this.fi).setTypeface(Typeface.DEFAULT, 1);
        }
        if (mj.ri(this.lr, this.de) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((ri) this.fi).setLetterSpacing(this.fn / mj.ri(this.lr, this.de));
        }
    }

    public void ri(int i) {
        this.jm = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((ri) this.fi).setPaintFlags(i);
    }

    public void ri(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((ri) this.fi).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.ri(str, str2);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    b = 0;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 1;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 2;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 3;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    b = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 5;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 6;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 7;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 8;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    b = 9;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b = 10;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
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
            case 351195968:
                if (str.equals("minTextSize")) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = 18;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b = 19;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = 20;
                }
                break;
        }
        switch (b) {
            case 0:
            case 7:
                this.bfa = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 1:
                this.fb = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                this.bzf = true;
                break;
            case 2:
                this.eqw = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 3:
                this.amj = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 4:
                this.tpb = bu(str2);
                break;
            case 5:
                this.akr = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case 6:
                this.xlq = slm(str2);
                break;
            case 8:
                this.de = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 9:
                this.jm = nr(str2);
                break;
            case 10:
                this.smj = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 11:
                this.rbz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 12:
                float fRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                this.sz = fRi;
                if (fRi < 1.0f || fRi > 1000.0f) {
                    this.sz = 400.0f;
                }
                break;
            case 13:
                this.evm = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case 14:
                this.ri = str2;
                break;
            case 15:
                this.eu = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
            case 16:
                this.ezp = vr(str2);
                break;
            case 17:
                this.zv = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                break;
            case 18:
                int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, Integer.MAX_VALUE);
                this.zxp = iRi > 0 ? iRi : Integer.MAX_VALUE;
                break;
            case 19:
                this.adz = bgr(str2);
                break;
            case 20:
                this.fn = mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }
}
