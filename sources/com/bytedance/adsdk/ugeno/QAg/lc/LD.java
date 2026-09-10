package com.bytedance.adsdk.ugeno.QAg.lc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;

/* JADX INFO: loaded from: classes.dex */
public class LD extends lk<Lxb> {
    private float Bj;
    private float FtP;
    private TextUtils.TruncateAt Iyd;
    protected int LD;
    protected String Lxb;
    private int Rt;

    @Deprecated
    private TextUtils.TruncateAt SlV;
    private float TA;
    private int ZU;
    private int chu;
    private int ek;
    private float goy;
    private float lk;
    private int mb;
    private float owi;
    private int pyu;

    public LD(Context context) {
        super(context);
        this.LD = ViewCompat.MEASURED_STATE_MASK;
        this.lk = 12.0f;
        this.Rt = Integer.MAX_VALUE;
        this.mb = 2;
        this.owi = -1.0f;
        this.TA = 400.0f;
    }

    private int JVA(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }

    private TextUtils.TruncateAt OY(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.SlV = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.SlV = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.SlV = TextUtils.TruncateAt.START;
                break;
            default:
                this.SlV = null;
                break;
        }
        return this.SlV;
    }

    private TextUtils.TruncateAt QAg(String str) {
        if (TextUtils.equals(str, Constants.CP_NONE)) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int nBu(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("normal")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals(TtmlNode.ITALIC)) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            return b != 1 ? 0 : 2;
        }
        return 1;
    }

    private int sLN(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        if (TextUtils.equals("null", this.Lxb)) {
            this.Lxb = "";
        }
        ebl(this.Lxb);
        ((Lxb) this.OY).setTextSize(1, this.lk);
        ((Lxb) this.OY).setTextColor(this.LD);
        ((Lxb) this.OY).setLines(this.pyu);
        ((Lxb) this.OY).setMaxLines(this.Rt);
        ((Lxb) this.OY).setGravity(this.mb);
        ((Lxb) this.OY).setIncludeFontPadding(false);
        Lxb(this.chu);
        if (KPU()) {
            Lxb(this.Iyd);
        } else {
            Lxb(this.SlV);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            float f = this.owi;
            if (f >= 0.0f) {
                ((Lxb) this.OY).setLineSpacing(0.0f, f);
            }
        }
        ((Lxb) this.OY).setShadowLayer(this.goy, this.Bj, this.FtP, this.ek);
        int i2 = this.ZU;
        if (i2 == 1) {
            ((Lxb) this.OY).setTypeface(Typeface.DEFAULT, i2);
        } else if (i >= 28) {
            ((Lxb) this.OY).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.TA, i2 == 2));
        } else if (this.TA >= 500.0f) {
            ((Lxb) this.OY).setTypeface(Typeface.DEFAULT, 1);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Lxb ZU() {
        Lxb lxb = new Lxb(this.JXs);
        lxb.Lxb(this);
        return lxb;
    }

    public void ebl(String str) {
        this.Lxb = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.Lxb = "";
        }
        ((Lxb) this.OY).setText(this.Lxb);
    }

    public void Lxb(int i) {
        this.chu = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((Lxb) this.OY).setPaintFlags(i);
    }

    public void Lxb(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((Lxb) this.OY).setEllipsize(truncateAt);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.Lxb(str, str2);
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
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    b = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 3;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 4;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 5;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 6;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    b = 7;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b = 8;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    b = 9;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    b = 10;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = 11;
                }
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    b = 12;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = cw.k;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = cw.l;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = cw.m;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b = cw.n;
                }
                break;
        }
        switch (b) {
            case 0:
            case 5:
                this.goy = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 1:
                this.ek = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case 2:
                this.mb = JVA(str2);
                break;
            case 3:
                this.LD = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case 4:
                this.ZU = nBu(str2);
                break;
            case 6:
                this.lk = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 7:
                this.chu = sLN(str2);
                break;
            case 8:
                this.Bj = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 9:
                this.FtP = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 10:
                this.TA = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, -1.0f);
                break;
            case 11:
                this.owi = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 1.0f);
                break;
            case 12:
                this.Lxb = str2;
                break;
            case 13:
                this.pyu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0);
                break;
            case 14:
                this.Iyd = QAg(str2);
                break;
            case 15:
                this.Rt = Integer.parseInt(str2);
                break;
            case 16:
                this.SlV = OY(str2);
                break;
        }
    }
}
