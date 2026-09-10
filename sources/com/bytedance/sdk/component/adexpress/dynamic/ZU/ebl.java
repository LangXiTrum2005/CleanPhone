package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.dynamic.JXs.JVA;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private JXs JXs;
    public String LD;
    public int Lxb;
    private lc ZU;
    private String lc;
    public JSONObject lk;

    public ebl(JXs jXs) {
        this.JXs = jXs;
        this.Lxb = jXs.Lxb();
        this.LD = jXs.lk();
        this.lk = jXs.JXs().jeq();
        this.lc = jXs.ZU();
        if (com.bytedance.sdk.component.adexpress.ZU.lk() == 1) {
            this.ZU = jXs.ebl();
        } else {
            this.ZU = jXs.JXs();
        }
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            this.ZU = jXs.JXs();
        }
    }

    private boolean Hu() {
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.LD) && this.LD.contains("adx:")) || JVA.LD();
    }

    private boolean gS() {
        return (com.bytedance.sdk.component.adexpress.ZU.LD() && (this.JXs.LD().contains("logo-union") || this.JXs.LD().contains("logounion") || this.JXs.LD().contains("logoad"))) || "logo-union".equals(this.JXs.LD()) || "logounion".equals(this.JXs.LD()) || "logoad".equals(this.JXs.LD());
    }

    public String BcA() {
        return this.ZU.Pw();
    }

    public int CG() {
        return this.ZU.ZU();
    }

    public String CSn() {
        return this.ZU.rK();
    }

    public boolean DY() {
        return this.ZU.Bj();
    }

    public int FD() {
        return this.ZU.CG();
    }

    public int FGm() {
        return this.ZU.iC();
    }

    public boolean HD() {
        return this.ZU.JJ();
    }

    public float IeN() {
        return this.ZU.JVA();
    }

    public double Ivz() {
        return this.ZU.OY();
    }

    public boolean JJ() {
        return this.ZU.eXY();
    }

    public String JVA() {
        return this.Lxb == 1 ? this.LD : "";
    }

    public float JXs() {
        return this.ZU.brP();
    }

    public int JZE() {
        return this.ZU.Za();
    }

    public int KPU() {
        return Lxb(this.ZU.eK());
    }

    public int LD() {
        return (int) this.ZU.kqm();
    }

    public String LXE() {
        return this.ZU.nE();
    }

    public int Ld() {
        return this.ZU.Rt();
    }

    public boolean Lpq() {
        return this.ZU.pyu();
    }

    public int Lv() {
        return this.ZU.bm();
    }

    public int Lxb() {
        return (int) this.ZU.STP();
    }

    public String MGT() {
        return this.ZU.wPa();
    }

    public String NDz() {
        return this.ZU.BcA();
    }

    public double NXR() {
        if (this.Lxb == 11) {
            try {
                double d = Double.parseDouble(this.LD);
                return !com.bytedance.sdk.component.adexpress.ZU.LD() ? (int) d : d;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String Ns() {
        return this.ZU.Ivz();
    }

    public boolean Nu() {
        return this.ZU.NXR();
    }

    public int OY() {
        String strSfi = this.ZU.Sfi();
        if (TtmlNode.LEFT.equals(strSfi)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(strSfi)) {
            return 4;
        }
        return TtmlNode.RIGHT.equals(strSfi) ? 3 : 2;
    }

    public int Of() {
        return this.ZU.VB();
    }

    public int Pw() {
        return this.ZU.FGm();
    }

    public int QAg() {
        int iOY = OY();
        if (iOY == 4) {
            return 17;
        }
        return iOY == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public boolean SS() {
        return this.ZU.xan();
    }

    public double STP() {
        return this.ZU.tD();
    }

    public String Sfi() {
        return this.ZU.aH();
    }

    public String Sv() {
        return this.ZU.mb();
    }

    public int VU() {
        return this.ZU.ebl();
    }

    public int VVE() {
        return Lxb(this.ZU.id());
    }

    public int Wi() {
        return this.ZU.JD();
    }

    public int ZU() {
        return (int) this.ZU.VVE();
    }

    public String aH() {
        return this.ZU.rW();
    }

    public double ae() {
        return this.ZU.nJ();
    }

    public int bG() {
        return this.ZU.chu();
    }

    public int brP() {
        return this.ZU.ek();
    }

    public int dR() {
        return this.ZU.Lv();
    }

    public int eK() {
        return this.ZU.VU();
    }

    public int ebl() {
        return Lxb(this.ZU.HD());
    }

    public int foI() {
        String strRW = this.ZU.rW();
        if ("skip-with-time-skip-btn".equals(this.JXs.LD()) || "skip".equals(this.JXs.LD()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.JXs.LD())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.JXs.LD()) && !"skip-with-time".equals(this.JXs.LD())) {
            if (this.Lxb == 10 && TextUtils.equals(this.ZU.Pw(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                return 5;
            }
            if (gS() && Hu()) {
                return 0;
            }
            if (gS()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.JXs.LD())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strRW) && !strRW.equals(Constants.CP_NONE)) {
                if (strRW.equals("video") || (this.JXs.Lxb() == 7 && TextUtils.equals(strRW, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.ZU.LD() && this.JXs.JXs() != null && this.JXs.JXs().nH()) ? 11 : 4;
                }
                if (strRW.equals("normal")) {
                    return 1;
                }
                return (strRW.equals("creative") || "slide".equals(this.ZU.Pw())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int hg() {
        return this.ZU.JXs();
    }

    public long id() {
        return this.ZU.Mx();
    }

    public String jeq() {
        return this.ZU.tv();
    }

    public float kqm() {
        return this.ZU.sLN();
    }

    public String lc() {
        if (this.Lxb == 0) {
            return !TextUtils.isEmpty(this.LD) ? this.LD : this.lk.optString(com.bytedance.sdk.component.adexpress.ZU.OY.lk(com.bytedance.sdk.component.adexpress.ZU.Lxb()));
        }
        return "";
    }

    public String le() {
        return this.ZU.nBu();
    }

    public int lk() {
        return (int) this.ZU.IeN();
    }

    public String nBu() {
        int i = this.Lxb;
        return (i == 2 || i == 13) ? this.LD : "";
    }

    public int nE() {
        return this.ZU.lk();
    }

    public int nJ() {
        return this.ZU.QAg();
    }

    public boolean nTb() {
        return this.ZU.FV();
    }

    public boolean oc() {
        return this.ZU.pyu();
    }

    public boolean rW() {
        return this.ZU.nTb();
    }

    public String ro() {
        return this.ZU.CSn();
    }

    public String sLN() {
        return this.lc;
    }

    public int sRq() {
        return this.ZU.TA();
    }

    public int tD() {
        return this.ZU.FtP();
    }

    public String uxf() {
        return this.ZU.KOQ();
    }

    public int wbY() {
        return this.ZU.hg();
    }

    public int xan() {
        return this.ZU.LD();
    }

    public double xr() {
        return this.ZU.le();
    }

    public static float[] LD(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void Lxb(float f) {
        this.ZU.Lxb(f);
    }

    public static int Lxb(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public boolean Lxb(int i) {
        JXs jXs = this.JXs;
        if (jXs == null) {
            return false;
        }
        if (i == 1) {
            this.ZU = jXs.ebl();
        } else {
            this.ZU = jXs.JXs();
        }
        return this.ZU != null;
    }
}
