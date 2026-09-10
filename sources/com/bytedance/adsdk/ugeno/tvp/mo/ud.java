package com.bytedance.adsdk.ugeno.tvp.mo;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ud.lnr;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class ud extends lnr<qdl> {
    private int ca;
    protected int dps;

    @Deprecated
    private float fge;

    @Deprecated
    private TextUtils.TruncateAt gsp;

    @Deprecated
    private float hcs;
    private float hd;
    private float hr;
    private float iw;
    private float kj;
    private int kr;
    private float lme;
    private float nts;
    private float od;
    protected String qdl;
    private int se;
    private int syy;
    private int tdy;
    private boolean vc;
    private float vm;
    private int xx;
    private TextUtils.TruncateAt ygv;

    public ud(Context context) {
        super(context);
        this.dps = -16777216;
        this.iw = 12.0f;
        this.lme = -1.0f;
        this.xx = Integer.MAX_VALUE;
        this.tdy = 8388611;
        this.ygv = TextUtils.TruncateAt.END;
        this.hr = -1.0f;
        this.hd = 400.0f;
    }

    private TextUtils.TruncateAt bjy(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.gsp = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.gsp = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.gsp = TextUtils.TruncateAt.START;
                break;
            default:
                this.gsp = null;
                break;
        }
        return this.gsp;
    }

    private int exc(String str) {
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

    private int jl(String str) {
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

    private TextUtils.TruncateAt jtx(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private void mml() {
        ((qdl) this.mzz).setLineSpacing(0.0f, this.hr);
    }

    private void tvp() {
        float f = this.hr;
        if (f <= 3.0f) {
            ((qdl) this.mzz).setLineSpacing(0.0f, f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(jpc.qdl(this.ud, (f - (this.iw * 1.2f)) / 2.0f));
            int paddingTop = ((qdl) this.mzz).getPaddingTop() + iRound;
            int paddingBottom = ((qdl) this.mzz).getPaddingBottom() + iRound;
            qdl qdlVar = (qdl) this.mzz;
            qdlVar.setPadding(qdlVar.getPaddingLeft(), paddingTop, ((qdl) this.mzz).getPaddingRight(), paddingBottom);
            ((qdl) this.mzz).setLineHeight(Math.round(jpc.qdl(this.ud, this.hr)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int yt(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("normal")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals(TtmlNode.ITALIC)) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            return b2 != 1 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
    public qdl qdl() {
        qdl qdlVar = new qdl(this.ud);
        qdlVar.qdl(this);
        return qdlVar;
    }

    public void rdp(String str) {
        this.qdl = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.qdl = "";
        }
        ((qdl) this.mzz).setText(this.qdl);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.qdl)) {
            this.qdl = "";
        }
        rdp(this.qdl);
        ((qdl) this.mzz).setTextSize(1, this.iw);
        ((qdl) this.mzz).setTextColor(this.dps);
        ((qdl) this.mzz).setLines(this.syy);
        ((qdl) this.mzz).setMaxLines(this.xx);
        ((qdl) this.mzz).setGravity(this.tdy);
        ((qdl) this.mzz).setIncludeFontPadding(false);
        ((qdl) this.mzz).setMinTextSize(jpc.qdl(this.ud, this.lme));
        qdl(this.ca);
        if (kdv()) {
            qdl(this.ygv);
        } else {
            qdl(this.gsp);
        }
        if (this.hr > 0.0f) {
            if (kdv()) {
                tvp();
            } else {
                mml();
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        ((qdl) this.mzz).setBreakStrategy(0);
        if (!kdv()) {
            ((qdl) this.mzz).setShadowLayer(this.vm, this.fge, this.hcs, this.se);
        } else if (this.vc) {
            if (this.vm <= 0.0f) {
                this.vm = 1.0E-5f;
            }
            ((qdl) this.mzz).setShadowLayer(this.vm, this.kj, this.od, this.se);
        }
        int i3 = this.kr;
        if (i3 == 1) {
            ((qdl) this.mzz).setTypeface(Typeface.DEFAULT, i3);
        } else if (i2 >= 28) {
            Typeface typeface = Typeface.DEFAULT;
            ((qdl) this.mzz).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.hd, i3 == 2));
        } else if (this.hd >= 500.0f) {
            ((qdl) this.mzz).setTypeface(Typeface.DEFAULT, 1);
        }
        if (jpc.qdl(this.ud, this.iw) > 0.0f) {
            ((qdl) this.mzz).setLetterSpacing(this.nts / jpc.qdl(this.ud, this.iw));
        }
    }

    public void qdl(int i2) {
        this.ca = i2;
        if (i2 == Integer.MAX_VALUE) {
            return;
        }
        ((qdl) this.mzz).setPaintFlags(i2);
    }

    public void qdl(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((qdl) this.mzz).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.vm = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "shadowColor":
                this.se = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                this.vc = true;
                break;
            case "shadowOffsetX":
                this.kj = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.od = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "textAlign":
                this.tdy = jl(str2);
                break;
            case "textColor":
                this.dps = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "textStyle":
                this.kr = yt(str2);
                break;
            case "textSize":
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "textDecoration":
                this.ca = exc(str2);
                break;
            case "shadowDx":
                this.fge = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "shadowDy":
                this.hcs = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "fontWeight":
                float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, -1.0f);
                this.hd = fQdl;
                if (fQdl < 1.0f || fQdl > 1000.0f) {
                    this.hd = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.hr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case "text":
                this.qdl = str2;
                break;
            case "lines":
                this.syy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case "ellipsis":
                this.ygv = jtx(str2);
                break;
            case "minTextSize":
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, -1.0f);
                break;
            case "maxLines":
                int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, Integer.MAX_VALUE);
                this.xx = iQdl > 0 ? iQdl : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.gsp = bjy(str2);
                break;
            case "letterSpacing":
                this.nts = jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
        }
    }
}
