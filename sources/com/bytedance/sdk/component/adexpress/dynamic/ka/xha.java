package com.bytedance.sdk.component.adexpress.dynamic.ka;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.fi.sf;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private String di;
    private fi fi;
    public JSONObject ik;
    private di ka;
    public String lr;
    public int ri;

    public xha(fi fiVar) {
        this.fi = fiVar;
        this.ri = fiVar.ri();
        this.lr = fiVar.ik();
        this.ik = fiVar.fi().saa();
        this.di = fiVar.ka();
        if (com.bytedance.sdk.component.adexpress.ka.ik() == 1) {
            this.ka = fiVar.xha();
        } else {
            this.ka = fiVar.fi();
        }
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            this.ka = fiVar.fi();
        }
    }

    private boolean hws() {
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.lr) && this.lr.contains("adx:")) || sf.lr();
    }

    private boolean id() {
        return (com.bytedance.sdk.component.adexpress.ka.lr() && (this.fi.lr().contains("logo-union") || this.fi.lr().contains("logounion") || this.fi.lr().contains("logoad"))) || "logo-union".equals(this.fi.lr()) || "logounion".equals(this.fi.lr()) || "logoad".equals(this.fi.lr());
    }

    public double aac() {
        return this.ka.dzy();
    }

    public boolean ac() {
        return this.ka.adz();
    }

    public boolean ajz() {
        return this.ka.iph();
    }

    public double aw() {
        if (this.ri == 11) {
            try {
                double d = Double.parseDouble(this.lr);
                return !com.bytedance.sdk.component.adexpress.ka.lr() ? (int) d : d;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String ay() {
        return this.ka.qd();
    }

    public double bgr() {
        return this.ka.tan();
    }

    public int bnj() {
        return this.ka.eb();
    }

    public float bu() {
        return this.ka.co();
    }

    public String co() {
        return this.di;
    }

    public String di() {
        if (this.ri == 0) {
            return !TextUtils.isEmpty(this.lr) ? this.lr : this.ik.optString(com.bytedance.sdk.component.adexpress.ka.xha.ik(com.bytedance.sdk.component.adexpress.ka.ri()));
        }
        return "";
    }

    public double dw() {
        return this.ka.mj();
    }

    public int dzy() {
        return this.ka.jbs();
    }

    public int fe() {
        return this.ka.fb();
    }

    public boolean feb() {
        return this.ka.sez();
    }

    public float fi() {
        return this.ka.nr();
    }

    public String fr() {
        return this.ka.fn();
    }

    public boolean gcp() {
        return this.ka.hcw();
    }

    public int hcw() {
        return this.ka.lr();
    }

    public boolean hpn() {
        return this.ka.akr();
    }

    public String ig() {
        return this.ka.srn();
    }

    public int igq() {
        String strQd = this.ka.qd();
        if ("skip-with-time-skip-btn".equals(this.fi.lr()) || "skip".equals(this.fi.lr()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.fi.lr())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.fi.lr()) && !"skip-with-time".equals(this.fi.lr())) {
            if (this.ri == 10 && TextUtils.equals(this.ka.srn(), "click")) {
                return 5;
            }
            if (id() && hws()) {
                return 0;
            }
            if (id()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.fi.lr())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strQd) && !strQd.equals("none")) {
                if (strQd.equals("video") || (this.fi.ri() == 7 && TextUtils.equals(strQd, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.ka.lr() && this.fi.fi() != null && this.fi.fi().sz()) ? 11 : 4;
                }
                if (strQd.equals("normal")) {
                    return 1;
                }
                return (strQd.equals("creative") || "slide".equals(this.ka.srn())) ? 2 : 0;
            }
        }
        return 0;
    }

    public String ihz() {
        return this.ka.ay();
    }

    public int ik() {
        return (int) this.ka.vr();
    }

    public int jbs() {
        int iMj = mj();
        if (iMj == 4) {
            return 17;
        }
        return iMj == 3 ? 8388613 : 8388611;
    }

    public int jc() {
        return this.ka.zk();
    }

    public int ka() {
        return (int) this.ka.slm();
    }

    public String kt() {
        return this.ka.ig();
    }

    public int lr() {
        return (int) this.ka.bu();
    }

    public int luy() {
        return this.ka.che();
    }

    public int mj() {
        String strIhz = this.ka.ihz();
        if (TtmlNode.LEFT.equals(strIhz)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(strIhz)) {
            return 4;
        }
        return TtmlNode.RIGHT.equals(strIhz) ? 3 : 2;
    }

    public int nd() {
        return this.ka.oh();
    }

    public int nr() {
        return this.ka.jm();
    }

    public int oh() {
        return this.ka.fi();
    }

    public int ory() {
        return this.ka.ik();
    }

    public String pc() {
        return this.ka.vt();
    }

    public String pv() {
        return this.ka.qt();
    }

    public boolean qd() {
        return this.ka.ajz();
    }

    public boolean qh() {
        return this.ka.aw();
    }

    public String qmx() {
        return this.ka.fr();
    }

    public String qt() {
        int i = this.ri;
        return (i == 2 || i == 13) ? this.lr : "";
    }

    public int ri() {
        return (int) this.ka.bgr();
    }

    public String rzk() {
        return this.ka.bzf();
    }

    public String saa() {
        return this.ka.eqw();
    }

    public String sf() {
        return this.ri == 1 ? this.lr : "";
    }

    public boolean siy() {
        return this.ka.akr();
    }

    public int slm() {
        return ri(this.ka.su());
    }

    public int srn() {
        return this.ka.luy();
    }

    public long su() {
        return this.ka.xh();
    }

    public int ta() {
        return this.ka.nbc();
    }

    public int tan() {
        return this.ka.ezp();
    }

    public int tnn() {
        return this.ka.tpb();
    }

    public String tw() {
        return this.ka.ory();
    }

    public int ud() {
        return this.ka.pu();
    }

    public boolean uq() {
        return this.ka.feb();
    }

    public float vr() {
        return this.ka.sf();
    }

    public String whw() {
        return this.ka.dw();
    }

    public int wjv() {
        return this.ka.zyn();
    }

    public int xd() {
        return this.ka.ka();
    }

    public double xe() {
        return this.ka.pv();
    }

    public int xha() {
        return ri(this.ka.uq());
    }

    public String xm() {
        return this.ka.de();
    }

    public int yjm() {
        return this.ka.zv();
    }

    public int zb() {
        return this.ka.xd();
    }

    public int zf() {
        return ri(this.ka.wjv());
    }

    public int zk() {
        return this.ka.hd();
    }

    public int zyn() {
        return this.ka.xha();
    }

    public static float[] lr(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void ri(float f) {
        this.ka.ri(f);
    }

    public static int ri(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(X3.i.T)) {
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
        return -16777216;
    }

    public boolean ri(int i) {
        fi fiVar = this.fi;
        if (fiVar == null) {
            return false;
        }
        if (i == 1) {
            this.ka = fiVar.xha();
        } else {
            this.ka = fiVar.fi();
        }
        return this.ka != null;
    }
}
