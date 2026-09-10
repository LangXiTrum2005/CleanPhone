package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tD {
    public static final String JXs;
    protected static int QAg;
    public static final String ZU;
    public static final String lk;
    protected boolean Lxb;
    private long nBu = 0;
    protected boolean LD = false;
    protected boolean lc = com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb;
    protected int ebl = com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD;
    protected String OY = com.bytedance.sdk.openadsdk.eK.Lxb.lk.lk;

    public static class Lxb {
        private String JVA;
        private String JXs;
        private String LD;
        private String Lxb;
        private String NXR;
        private List<Integer> OY;
        private String QAg;
        private String STP;
        private String ZU;
        private String ebl;
        private String lc;
        private String lk;
        private String nBu;
        private String sLN;

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb LD(Lxb lxb, String str) {
            return new com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb().Lxb(lxb.lc()).LD(lxb.VVE()).lk(lxb.IeN()).ZU(lxb.kqm()).JXs(str);
        }

        @NonNull
        public static com.bytedance.sdk.component.adexpress.Lxb.lk.ZU Lxb(Lxb lxb, String str) {
            return com.bytedance.sdk.component.adexpress.Lxb.lk.ZU.Lxb().Lxb(lxb.lc()).LD(lxb.ebl()).lk(lxb.OY()).ZU(lxb.QAg()).JXs(lxb.JXs()).lc(str);
        }

        public String IeN() {
            return this.sLN;
        }

        public String JVA() {
            return this.ebl;
        }

        public String JXs() {
            return this.lc;
        }

        public String NXR() {
            return this.nBu;
        }

        public String OY() {
            return this.lk;
        }

        public String QAg() {
            return this.ZU;
        }

        public boolean STP() {
            return !TextUtils.isEmpty(this.nBu) && this.nBu.equals("v3");
        }

        public String VVE() {
            return this.NXR;
        }

        public String ZU() {
            return this.QAg;
        }

        public String ebl() {
            return this.LD;
        }

        public String kqm() {
            return this.STP;
        }

        public String lc() {
            return this.Lxb;
        }

        public List<Integer> lk() {
            return this.OY;
        }

        public String nBu() {
            return this.JXs;
        }

        public String sLN() {
            return this.JVA;
        }

        public void JVA(String str) {
            this.sLN = str;
        }

        public void JXs(String str) {
            this.lk = str;
        }

        public void NXR(String str) {
            this.STP = str;
        }

        public void OY(String str) {
            this.ebl = str;
        }

        public void QAg(String str) {
            this.JVA = str;
        }

        public void ZU(String str) {
            this.LD = str;
        }

        public void ebl(String str) {
            this.JXs = str;
        }

        public void lc(String str) {
            this.ZU = str;
        }

        public void lk(String str) {
            this.Lxb = str;
        }

        public void nBu(String str) {
            this.nBu = str;
        }

        public void sLN(String str) {
            this.NXR = str;
        }

        public void LD(String str) {
            this.lc = str;
        }

        public void Lxb(List<Integer> list) {
            this.OY = list;
        }

        public void Lxb(String str) {
            this.QAg = str;
        }
    }

    static {
        CharSequence[] charSequenceArr = {bc.ae, nJ.Sfi()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        lk = sb.toString();
        CharSequence[] charSequenceArr2 = {bc.ae, nJ.Sfi(), "sample"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i = 1; i < 3; i++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i]);
        }
        ZU = sb2.toString();
        CharSequence[] charSequenceArr3 = {nJ.Sfi(), "strategy"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        sb3.append((CharSequence) "_");
        sb3.append(charSequenceArr3[1]);
        JXs = sb3.toString();
        QAg = 330;
    }

    public tD() {
        this.Lxb = false;
        this.Lxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("is_new_playable", false);
    }

    public static boolean JXs(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        int iFGm = tDVar.FGm();
        return tDVar.chu() || iFGm == 5 || iFGm == 15 || iFGm == 50;
    }

    public static boolean ZU(tD tDVar) {
        return (tDVar == null || tDVar.JJ() == null || tDVar.JJ().k != 1) ? false : true;
    }

    private static double ebl(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    private static long lc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static boolean lk(tD tDVar) {
        return (tDVar == null || tDVar.JJ() == null || tDVar.JJ().l != 7 || eK.ebl(tDVar)) ? false : true;
    }

    public abstract JSONObject AcC();

    public abstract String Ax();

    public abstract void BK();

    public abstract int BcA();

    public abstract void BcA(int i);

    public abstract com.bytedance.sdk.component.QAg.LD.Lxb Bg();

    public abstract boolean Bj();

    public abstract int CG();

    public abstract void CG(int i);

    public abstract int CSn();

    public abstract String CSn(String str);

    public abstract void CSn(int i);

    public abstract int DY();

    public abstract void DY(int i);

    public abstract void DY(String str);

    public abstract boolean FA();

    public abstract String FD();

    public abstract int FGm();

    public abstract boolean FV();

    public abstract void FtP();

    public abstract String GX();

    public abstract int HD();

    public abstract void HD(int i);

    public abstract void HD(String str);

    public abstract KG HN();

    public abstract Map<String, Object> Hu();

    public abstract boolean IG();

    public abstract boolean II();

    public abstract long IeN();

    public abstract void IeN(int i);

    public abstract void IeN(String str);

    public abstract int Ivz();

    public abstract void Ivz(int i);

    public abstract void Ivz(String str);

    public abstract boolean Iyd();

    public abstract JSONObject JD();

    public abstract KG JJ();

    public abstract void JJ(int i);

    public abstract boolean JP();

    public abstract JXs JVA();

    public abstract void JVA(int i);

    public abstract void JVA(String str);

    public abstract void JVA(boolean z);

    public abstract void JXs(int i);

    public abstract void JXs(String str);

    public abstract void JXs(JSONObject jSONObject);

    public abstract void JXs(boolean z);

    public abstract boolean JXs();

    public abstract int JZE();

    public abstract NXR KOQ();

    public abstract String KPU();

    public abstract void KPU(int i);

    public abstract void KPU(String str);

    public abstract CG Kue();

    public long LD() {
        return this.nBu;
    }

    public abstract void LD(double d);

    public abstract void LD(int i);

    public abstract void LD(long j);

    public abstract void LD(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb);

    public abstract void LD(IeN ieN);

    public abstract void LD(KG kg);

    public abstract void LD(JSONObject jSONObject);

    public abstract void LD(boolean z);

    public abstract int LRt();

    public abstract List<String> LXE();

    public abstract boolean LYC();

    public abstract boolean Ld();

    public abstract IeN Lpq();

    public abstract String Lv();

    public abstract void Lxb(double d);

    public abstract void Lxb(float f);

    public abstract void Lxb(int i);

    public abstract void Lxb(int i, int i2);

    public abstract void Lxb(AdSlot adSlot);

    public abstract void Lxb(FilterWord filterWord);

    public abstract void Lxb(com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb);

    public abstract void Lxb(HD hd);

    public abstract void Lxb(IeN ieN);

    public abstract void Lxb(JVA jva);

    public abstract void Lxb(JXs jXs);

    public abstract void Lxb(NXR nxr);

    public abstract void Lxb(QAg qAg);

    public abstract void Lxb(VVE vve);

    public abstract void Lxb(ZU zu);

    public abstract void Lxb(brP brp);

    public abstract void Lxb(eK eKVar);

    public abstract void Lxb(id idVar);

    public abstract void Lxb(lk lkVar);

    public abstract void Lxb(sLN sln);

    public abstract void Lxb(Lxb lxb);

    public abstract void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb);

    public abstract void Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.LD ld);

    public abstract void Lxb(KG kg);

    public abstract void Lxb(Map<String, Object> map);

    public abstract void Lxb(boolean z);

    public boolean Lxb() {
        int iKqm = kqm();
        return (eK() != 2 || iKqm == 5 || iKqm == 6 || iKqm == 19 || iKqm == 12) ? false : true;
    }

    public abstract lk MGT();

    public abstract boolean MH();

    public abstract JSONObject Mvg();

    public abstract String Mx();

    public abstract int NDz();

    public abstract void NDz(int i);

    public abstract int NXR();

    public abstract void NXR(int i);

    public abstract void NXR(String str);

    public abstract boolean Njp();

    public abstract IeN Ns();

    public abstract String Nu();

    public abstract void OY(int i);

    public abstract void OY(String str);

    public abstract void OY(boolean z);

    public boolean OY() {
        return (TextUtils.isEmpty(lc()) || TextUtils.isEmpty(ebl())) ? false : true;
    }

    public abstract boolean Of();

    public abstract long Pd();

    public abstract void Pw(int i);

    public abstract boolean Pw();

    public abstract brP QAg();

    public abstract void QAg(int i);

    public abstract void QAg(String str);

    public abstract void QAg(boolean z);

    public abstract void RC();

    public abstract com.bytedance.sdk.openadsdk.eK.Lxb.LD Rp();

    public abstract int Rt();

    public abstract List<String> SS();

    public abstract int STP();

    public abstract void STP(int i);

    public abstract void STP(String str);

    public abstract String Sfi();

    public abstract void Sfi(int i);

    public abstract void Sfi(String str);

    public abstract com.bytedance.sdk.openadsdk.core.sLN.Lxb SlV();

    public abstract String Sv();

    public abstract int TA();

    public abstract int Td();

    public abstract int VB();

    public abstract String VU();

    public abstract void VU(int i);

    public abstract eK VVE();

    public abstract void VVE(int i);

    public abstract void VVE(String str);

    public abstract boolean Vs();

    public abstract List<FilterWord> Wi();

    public abstract int XM();

    public abstract void Xp();

    public abstract int YUS();

    public abstract boolean YZq();

    public abstract boolean Yc();

    public abstract com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb Yw();

    public abstract boolean ZE();

    public abstract void ZU(int i);

    public abstract void ZU(JSONObject jSONObject);

    public abstract void ZU(boolean z);

    public abstract boolean ZU();

    public abstract float Za();

    public abstract int Zg();

    public abstract int aBz();

    public abstract boolean aE();

    public abstract void aH(int i);

    public abstract void aH(String str);

    public abstract boolean aH();

    public abstract void aHr();

    public abstract String ae();

    public abstract String bG();

    public abstract int bm();

    public abstract int brP();

    public abstract void brP(int i);

    public abstract void brP(String str);

    public abstract boolean cFD();

    public abstract boolean cR();

    @Nullable
    public abstract String cf();

    public abstract boolean chu();

    public abstract id dR();

    public abstract void dR(int i);

    public abstract int eK();

    public abstract void eK(int i);

    public abstract void eK(String str);

    public abstract boolean eXY();

    public abstract String ebl();

    public abstract void ebl(int i);

    public abstract void ebl(String str);

    public abstract void ebl(boolean z);

    public abstract JSONObject ek();

    public abstract int eof();

    public abstract boolean eq();

    public abstract int fG();

    public abstract int foI();

    public abstract void foI(int i);

    public abstract void foI(String str);

    public abstract boolean gS();

    public abstract boolean goy();

    public abstract AdSlot hg();

    public abstract void hg(int i);

    public abstract JSONObject iC();

    public abstract String iQi();

    public abstract int id();

    public abstract void id(int i);

    public abstract void id(String str);

    public abstract String jeq();

    public abstract double kRz();

    public abstract boolean kVf();

    public abstract int kqm();

    public abstract void kqm(int i);

    public abstract void kqm(String str);

    public abstract int lJ();

    public abstract String lc();

    public abstract void lc(int i);

    public abstract void lc(String str);

    public abstract void lc(boolean z);

    public abstract void le(int i);

    public abstract boolean le();

    public abstract void lk(int i);

    public abstract void lk(long j);

    public abstract void lk(IeN ieN);

    public abstract void lk(KG kg);

    public abstract void lk(JSONObject jSONObject);

    public abstract void lk(boolean z);

    public abstract boolean mOF();

    public abstract boolean mW();

    public abstract int mb();

    public abstract long mhk();

    public abstract int mu();

    public abstract VVE nBu();

    public abstract void nBu(int i);

    public abstract void nBu(String str);

    public abstract void nBu(boolean z);

    public abstract int nE();

    public abstract void nE(int i);

    public abstract int nH();

    public abstract String nJ();

    public abstract void nJ(int i);

    public abstract int nP();

    public abstract JVA nTb();

    public abstract boolean nYy();

    public abstract com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb nrJ();

    public abstract String oc();

    public abstract boolean oo();

    public abstract int op();

    public abstract String owi();

    public abstract int pyu();

    public abstract boolean qEi();

    public abstract int qK();

    public abstract KG rK();

    public abstract String rO();

    public abstract Lxb rW();

    public abstract void rW(int i);

    public abstract long ro();

    public abstract ZU sLN();

    public abstract void sLN(int i);

    public abstract void sLN(String str);

    public abstract int sRq();

    public abstract int tD();

    public abstract void tD(int i);

    public abstract void tD(String str);

    public abstract int tv();

    public abstract String uTT();

    public abstract boolean uao();

    public abstract List<IeN> uxf();

    public abstract String vSG();

    public abstract int wCT();

    public abstract boolean wPa();

    public abstract boolean wVL();

    public abstract HD wVT();

    public abstract List<String> wbY();

    public abstract String xNP();

    public abstract QAg xan();

    public abstract void xan(int i);

    public abstract String xr();

    public abstract boolean zqY();

    public static boolean LD(tD tDVar) {
        return (Lxb(tDVar) || lk(tDVar)) ? false : true;
    }

    public static boolean lc(tD tDVar) {
        Object obj;
        if (tDVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapHu = tDVar.Hu();
            return (mapHu == null || (obj = mapHu.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", th.getMessage());
            return false;
        }
    }

    public static double LD(String str) {
        return ebl(lk(str));
    }

    public void Lxb(long j) {
        this.nBu = j;
    }

    public static boolean Lxb(tD tDVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (Lxb(tDVar) || z4 || tDVar == null || tDVar.JJ() == null || TextUtils.isEmpty(tDVar.JJ().h)) {
            return false;
        }
        if (lk(tDVar)) {
            return z3;
        }
        return (tDVar.JJ() == null || tDVar.JJ().k != 1) ? z : z2;
    }

    public static int ZU(String str) {
        return Lxb(lk(str));
    }

    public static JSONObject lk(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", e.getMessage());
            }
        }
        return null;
    }

    public static String LD(Context context, tD tDVar) {
        if (context != null && tDVar != null) {
            try {
                if (tDVar.sRq() != 8) {
                    if (tDVar.JVA().Lxb()) {
                    }
                }
                String strLxb = com.bytedance.sdk.openadsdk.core.act.Lxb.Lxb(context);
                if (TextUtils.isEmpty(strLxb)) {
                    return null;
                }
                return strLxb;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static tD lk() {
        return new aH();
    }

    public static boolean Lxb(tD tDVar) {
        return (tDVar == null || tDVar.JJ() == null || tDVar.JJ().l != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD Lxb(String str, tD tDVar) {
        int i;
        tDVar.nJ(0);
        int iLJ = tDVar.lJ();
        if (iLJ == 3) {
            i = 4;
        } else if (iLJ != 7) {
            i = iLJ != 8 ? 3 : 2;
        } else {
            i = 1;
        }
        return new com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD(str, tDVar.HN(), tDVar.rK(), tDVar.tv(), tDVar.Zg(), i);
    }

    public static long Lxb(String str) {
        return lc(lk(str));
    }

    public static int Lxb(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String Lxb(Context context, tD tDVar) {
        if (context == null || tDVar == null || !((tDVar.lJ() == 8 || tDVar.lJ() == 7) && tDVar.le())) {
            return null;
        }
        String strLD = LD(context, tDVar);
        if (TextUtils.isEmpty(strLD) || com.bytedance.sdk.openadsdk.core.act.Lxb.Lxb() != 1) {
            return null;
        }
        return strLD;
    }
}
