package com.bytedance.sdk.openadsdk.core.co;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private boolean ac;
    private int aw;
    private boolean bgr;
    private float bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18111co;
    private int fi;
    private int jbs;
    private float nr;
    private TextUtils.TruncateAt qt;
    protected String ri;
    private float sf;
    private float slm;
    private Context tan;
    private float vr;
    private int xha;
    protected int lr = -16777216;
    private float ik = 12.0f;
    private float ka = -1.0f;
    private int di = Integer.MAX_VALUE;
    private int mj = 8388611;

    public lr(Context context, boolean z) {
        this.tan = context;
        this.ac = z;
    }

    private TextUtils.TruncateAt ik(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int ka(String str) {
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

    private int lr(String str) {
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

    public void ri(com.bytedance.adsdk.ugeno.jbs.di.ri riVar) {
        if (riVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.ri)) {
            riVar.setText(TextUtils.equals("null", this.ri) ? "" : this.ri);
        }
        riVar.setTextSize(1, this.ik);
        riVar.setMinTextSize(mj.ri(this.tan, this.ka));
        riVar.setTextColor(this.lr);
        riVar.setGravity(this.mj);
        riVar.setLines(this.xha);
        riVar.setMaxLines(this.di);
        int i = this.jbs;
        if (i != Integer.MAX_VALUE) {
            riVar.setPaintFlags(i);
        }
        riVar.setEllipsize(this.qt);
        if (this.sf > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.ac) {
                ik(riVar);
            } else {
                lr(riVar);
            }
        }
        riVar.setTypeface(ri((int) this.f18111co));
        ka(riVar);
        float fRi = mj.ri(this.tan, this.ik);
        if (fRi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            riVar.setLetterSpacing(this.nr / fRi);
        }
        riVar.setIncludeFontPadding(false);
    }

    private void ik(com.bytedance.adsdk.ugeno.jbs.di.ri riVar) {
        float f = this.sf;
        if (f <= 3.0f) {
            riVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(mj.ri(this.tan, (f - (this.ik * 1.2f)) / 2.0f));
            riVar.setPadding(riVar.getPaddingLeft(), riVar.getPaddingTop() + iRound, riVar.getPaddingRight(), riVar.getPaddingBottom() + iRound);
            riVar.setLineHeight(Math.round(mj.ri(this.tan, this.sf)));
        }
    }

    private void ka(com.bytedance.adsdk.ugeno.jbs.di.ri riVar) {
        if (!this.ac) {
            riVar.setShadowLayer(this.bu, this.vr, this.slm, this.aw);
        } else if (this.bgr) {
            float f = this.bu;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = 1.0E-5f;
            }
            riVar.setShadowLayer(f, this.vr, this.slm, this.aw);
        }
    }

    private void lr(com.bytedance.adsdk.ugeno.jbs.di.ri riVar) {
        riVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.sf);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 0;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 1;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 2;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    b = 3;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 4;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 5;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 6;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 7;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    b = 8;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    b = 9;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = 10;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b = 11;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = 12;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = 13;
                }
                break;
            case 351195968:
                if (str.equals("minTextSize")) {
                    b = 14;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = 15;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
        }
        switch (b) {
            case 0:
                this.aw = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                this.bgr = true;
                break;
            case 1:
                this.vr = mj.ri(this.tan, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 2:
                this.slm = mj.ri(this.tan, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 3:
                this.mj = ri(str2);
                break;
            case 4:
                this.lr = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case 5:
                this.fi = lr(str2);
                break;
            case 6:
                this.bu = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 7:
                this.ik = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 8:
                this.jbs = ka(str2);
                break;
            case 9:
                float fRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                this.f18111co = fRi;
                if (fRi < 1.0f || fRi > 1000.0f) {
                    this.f18111co = 400.0f;
                }
                break;
            case 10:
                this.sf = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case 11:
                this.ri = str2;
                break;
            case 12:
                this.xha = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0);
                break;
            case 13:
                this.qt = ik(str2);
                break;
            case 14:
                this.ka = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                break;
            case 15:
                int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, Integer.MAX_VALUE);
                this.di = iRi > 0 ? iRi : Integer.MAX_VALUE;
                break;
            case 16:
                this.nr = mj.ri(this.tan, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }

    private int ri(String str) {
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

    private Typeface ri(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
        return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
