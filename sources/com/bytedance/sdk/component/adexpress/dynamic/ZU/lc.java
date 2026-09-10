package com.bytedance.sdk.component.adexpress.dynamic.ZU;

import com.badlogic.gdx.Input;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.cw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private int AcC;
    private int BcA;
    private boolean Bg;
    private int Bj;
    private String CG;
    private boolean CSn;
    private String DY;
    private boolean FD;
    private String FGm;
    private boolean FV;
    private int FtP;
    private String HD;
    private int HN;
    private List<Lxb> Hu;
    private String IeN;
    private double Ivz;
    private boolean Iyd;
    private boolean JD;
    private double JJ;
    private double JVA;
    private boolean JXs;
    private int JZE;
    private boolean KOQ;
    private double KPU;
    private float LD;
    private String LRt;
    private JSONObject LXE;
    private boolean Ld;
    private String Lpq;
    private String Lv;
    private float Lxb;
    private int MGT;
    private String Mvg;
    private String Mx;
    private int NDz;
    private String NXR;
    private boolean Ns;
    private boolean Nu;
    private float OY;
    private int Of;
    private int Pw;
    private float QAg;
    private double Rt;
    private String SS;
    private String STP;
    private String Sfi;
    private String SlV;
    private boolean Sv;
    private int TA;
    private int VB;
    private int VU;
    private String VVE;
    private boolean Wi;
    private float ZU;
    private int Za;
    private int Zg;
    private String aH;
    private int ae;
    private int bG;
    private int bm;
    private String brP;
    private int chu;
    private int dR;
    private String eK;
    private boolean eXY;
    private float ebl;
    private int ek;
    private long fG = -1;
    private int foI;
    private int gS;
    private int goy;
    private String hg;
    private boolean iC;
    private int id;
    private int jeq;
    private String kqm;
    private float lc;
    private boolean le;
    private float lk;
    private String mOF;
    private JSONObject mb;
    private float nBu;
    private String nE;
    private String nH;
    private String nJ;
    private int nTb;
    private int oc;
    private JSONObject owi;
    private JSONObject pyu;
    private String rK;
    private int rW;
    private int ro;
    private double sLN;
    private boolean sRq;
    private String tD;
    private int tv;
    private boolean uxf;
    private int wCT;
    private int wPa;
    private int wbY;
    private String xan;
    private int xr;

    public static lc Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        lc lcVar = new lc();
        lcVar.LD(jSONObject.optString("adType", "embeded"));
        lcVar.IeN(jSONObject.optString("clickArea", "creative"));
        lcVar.VVE(jSONObject.optString("clickTigger", CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        lcVar.lk(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        lcVar.ZU(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        lcVar.JXs(jSONObject.optString("color", "#999999"));
        lcVar.lc(jSONObject.optString("bgColor", "transparent"));
        lcVar.ebl(jSONObject.optString("bgImgUrl", ""));
        lcVar.foI(jSONObject.optString("bgImgData", ""));
        lcVar.OY(jSONObject.optString("borderColor", "#000000"));
        lcVar.QAg(jSONObject.optString("borderStyle", "solid"));
        lcVar.nBu(jSONObject.optString("heightMode", "auto"));
        lcVar.JVA(jSONObject.optString("widthMode", "fixed"));
        lcVar.sLN(jSONObject.optString("interactText", ""));
        lcVar.lk(jSONObject.optBoolean("isShowBgControl", false));
        lcVar.NXR(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            lcVar.ebl(jSONObjectOptJSONObject.optInt("translateY", 0));
            lcVar.OY(jSONObjectOptJSONObject.optInt("translateX", 0));
            lcVar.ZU(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            lcVar.JXs(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        lcVar.STP(jSONObject.optString("interactType", ""));
        lcVar.JXs(jSONObject.optInt("interactSlideDirection", -1));
        lcVar.kqm(jSONObject.optString("justifyHorizontal", "space-around"));
        lcVar.brP(jSONObject.optString("justifyVertical", "flex-start"));
        lcVar.LD(jSONObject.optDouble("timingStart"));
        lcVar.lk(jSONObject.optDouble("timingEnd"));
        lcVar.ZU((float) jSONObject.optDouble("width", 0.0d));
        lcVar.lk((float) jSONObject.optDouble("height", 0.0d));
        lcVar.Lxb((float) jSONObject.optDouble("borderRadius", 0.0d));
        lcVar.LD((float) jSONObject.optDouble("borderSize", 0.0d));
        lcVar.LD(jSONObject.optBoolean("interactValidate", false));
        lcVar.QAg((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        lcVar.JXs((float) jSONObject.optDouble("paddingBottom", 0.0d));
        lcVar.lc((float) jSONObject.optDouble("paddingLeft", 0.0d));
        lcVar.ebl((float) jSONObject.optDouble("paddingRight", 0.0d));
        lcVar.OY((float) jSONObject.optDouble("paddingTop", 0.0d));
        lcVar.ZU(jSONObject.optBoolean("lineFeed", false));
        lcVar.QAg(jSONObject.optInt("lineCount", 0));
        lcVar.lc(jSONObject.optDouble("lineHeight", 1.2d));
        lcVar.STP(jSONObject.optInt("letterSpacing", 0));
        lcVar.JXs(jSONObject.optBoolean("isDataFixed", false));
        lcVar.IeN(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        lcVar.lc(jSONObject.optBoolean("lineLimit"));
        lcVar.VVE(jSONObject.optInt("position"));
        lcVar.tD(jSONObject.optString("align"));
        lcVar.ebl(jSONObject.optBoolean("useLeft"));
        lcVar.OY(jSONObject.optBoolean("useRight"));
        lcVar.QAg(jSONObject.optBoolean("useTop"));
        lcVar.nBu(jSONObject.optBoolean("useBottom"));
        lcVar.DY(jSONObject.optString("data"));
        lcVar.LD(jSONObject.optJSONObject("i18n"));
        lcVar.sLN(jSONObject.optInt("marginLeft"));
        lcVar.NXR(jSONObject.optInt("marginRight"));
        lcVar.nBu(jSONObject.optInt("marginTop"));
        lcVar.JVA(jSONObject.optInt("marginBottom"));
        lcVar.kqm(jSONObject.optInt("tagMaxCount"));
        lcVar.JVA(jSONObject.optBoolean("allowTextFlow"));
        lcVar.brP(jSONObject.optInt("textFlowType"));
        lcVar.tD(jSONObject.optInt("textFlowDuration"));
        lcVar.DY(jSONObject.optInt(TtmlNode.LEFT));
        lcVar.Sfi(jSONObject.optInt(TtmlNode.RIGHT));
        lcVar.HD(jSONObject.optInt("top"));
        lcVar.eK(jSONObject.optInt("bottom"));
        lcVar.Sfi(jSONObject.optString("alignItems", "flex-start"));
        lcVar.HD(jSONObject.optString("direction", ""));
        lcVar.Lxb(jSONObject.optBoolean("loop", false));
        lcVar.aH(jSONObject.optInt("zIndex"));
        lcVar.Ivz(jSONObject.optInt("interactVisibleTime"));
        lcVar.CSn(jSONObject.optInt("interactHiddenTime"));
        lcVar.NXR(jSONObject.optBoolean("interactEnableMask"));
        lcVar.STP(jSONObject.optBoolean("interactWontHide"));
        lcVar.Lxb(jSONObject.optString("bgGradient"));
        lcVar.xan(jSONObject.optInt("areaType"));
        lcVar.hg(jSONObject.optInt("interactSlideThreshold", 0));
        lcVar.le(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.ZU.LD() ? 0 : 120));
        lcVar.brP(jSONObject.optBoolean("openPlayableLandingPage", false));
        lcVar.lk(jSONObject.optJSONObject("video"));
        lcVar.ZU(jSONObject.optJSONObject("image"));
        lcVar.CG(jSONObject.optInt("borderShadowExtent"));
        lcVar.IeN(jSONObject.optBoolean("bgGauseBlur"));
        lcVar.nJ(jSONObject.optInt("bgGauseBlurRadius"));
        lcVar.VVE(jSONObject.optBoolean("showTimeProgress", false));
        lcVar.kqm(jSONObject.optBoolean("showPlayButton", false));
        lcVar.Lxb(jSONObject.optDouble("bgColorCg", 0.0d));
        lcVar.lc(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        lcVar.LD(jSONObject.optInt("borderTopLeftRadius", 0));
        lcVar.Lxb(jSONObject.optInt("borderTopRightRadius", 0));
        lcVar.ZU(jSONObject.optInt("borderBottomLeftRadius", 0));
        lcVar.lk(jSONObject.optInt("borderBottomRightRadius", 0));
        lcVar.JXs(jSONObject.optJSONObject("interactI18n"));
        lcVar.aH(jSONObject.optString("imageObjectFit"));
        lcVar.CSn(jSONObject.optString("interactTitle"));
        lcVar.nE(jSONObject.optInt("interactTextPositionTop"));
        lcVar.eK(jSONObject.optString("imageLottieTosPath"));
        lcVar.sLN(jSONObject.optBoolean("animationsLoop"));
        lcVar.id(jSONObject.optInt("lottieAppNameMaxLength"));
        lcVar.KPU(jSONObject.optInt("lottieAdDescMaxLength"));
        lcVar.foI(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    Lxb lxb = new Lxb();
                    lxb.lk(jSONObject2.optString("animationType"));
                    lxb.Lxb(jSONObject2.optDouble("animationDuration"));
                    lxb.LD(jSONObject2.optDouble("animationScaleX"));
                    lxb.lk(jSONObject2.optDouble("animationScaleY"));
                    lxb.ZU(jSONObject2.optString("animationTimeFunction"));
                    lxb.ZU(jSONObject2.optDouble("animationDelay"));
                    lxb.lc(jSONObject2.optInt("animationIterationCount"));
                    lxb.JXs(jSONObject2.optString("animationDirection"));
                    lxb.JXs(jSONObject2.optDouble("animationInterval"));
                    lxb.Lxb(jSONObject2.optInt("animationBorderWidth"));
                    lxb.Lxb(jSONObject2.optLong("key"));
                    lxb.LD(jSONObject2.optInt("animationEffectWidth"));
                    lxb.lk(jSONObject2.optInt("animationSwing", 1));
                    lxb.ZU(jSONObject2.optInt("animationTranslateX"));
                    lxb.JXs(jSONObject2.optInt("animationTranslateY"));
                    lxb.LD(jSONObject2.optString("animationRippleBackgroundColor"));
                    lxb.Lxb(jSONObject2.optString("animationScaleDirection"));
                    lxb.ebl(jSONObject2.optInt("animationFadeStart"));
                    lxb.OY(jSONObject2.optInt("animationFadeEnd"));
                    lxb.lc(jSONObject2.optString("animationFillMode"));
                    lxb.QAg(jSONObject2.optInt("animationBounceHeight"));
                    if (lcVar.tD() > 0.0d) {
                        lxb.ZU(lxb.STP() + lcVar.tD());
                    }
                    arrayList.add(lxb);
                }
                lcVar.Lxb(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                lcVar.id(jSONObject.optString("triggerSlideDirection", "0"));
                lcVar.Lxb(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return lcVar;
    }

    private void foI(String str) {
        this.mOF = str;
    }

    public String AcC() {
        return this.FGm;
    }

    public String BcA() {
        return this.nE;
    }

    public JSONObject Bg() {
        return this.mb;
    }

    public boolean Bj() {
        return this.FV;
    }

    public int CG() {
        return this.foI;
    }

    public String CSn() {
        return this.mOF;
    }

    public double DY() {
        return this.sLN;
    }

    public boolean FD() {
        return this.Sv;
    }

    public int FGm() {
        return this.xr;
    }

    public boolean FV() {
        return this.Bg;
    }

    public int FtP() {
        return this.wPa;
    }

    public String HD() {
        return this.VVE;
    }

    public void HN() {
        Lxb(this, this.mb);
    }

    public String Hu() {
        return this.Lv;
    }

    public float IeN() {
        return this.ebl;
    }

    public String Ivz() {
        return this.eK;
    }

    public int Iyd() {
        List<Lxb> list = this.Hu;
        if (list == null) {
            return 0;
        }
        for (Lxb lxb : list) {
            if ("translate".equals(lxb.QAg()) && lxb.ebl() < 0) {
                return -lxb.ebl();
            }
        }
        return 0;
    }

    public int JD() {
        return this.tv;
    }

    public boolean JJ() {
        return this.le;
    }

    public float JVA() {
        return this.Lxb;
    }

    public int JXs() {
        return this.goy;
    }

    public int JZE() {
        return this.NDz;
    }

    public String KOQ() {
        return this.SlV;
    }

    public String KPU() {
        return this.HD;
    }

    public int LD() {
        return this.ek;
    }

    public boolean LRt() {
        return this.eXY;
    }

    public String LXE() {
        return this.Lpq;
    }

    public int Ld() {
        return this.dR;
    }

    public double Lpq() {
        return this.JJ;
    }

    public int Lv() {
        return this.ae;
    }

    public int MGT() {
        return this.wbY;
    }

    public long Mx() {
        return this.fG;
    }

    public String NDz() {
        return this.nJ;
    }

    public boolean NXR() {
        return this.JXs;
    }

    public int Ns() {
        return this.VU;
    }

    public boolean Nu() {
        return this.Ld;
    }

    public double OY() {
        return this.Rt;
    }

    public int Of() {
        return this.Pw;
    }

    public String Pw() {
        return this.hg;
    }

    public int QAg() {
        return this.TA;
    }

    public int Rt() {
        return this.gS;
    }

    public int SS() {
        return this.JZE;
    }

    public float STP() {
        return this.lc;
    }

    public String Sfi() {
        return this.IeN;
    }

    public List<Lxb> SlV() {
        return this.Hu;
    }

    public boolean Sv() {
        return this.sRq;
    }

    public int TA() {
        return this.wCT;
    }

    public int VB() {
        return this.bm;
    }

    public int VU() {
        return this.BcA;
    }

    public float VVE() {
        return this.OY;
    }

    public int Wi() {
        return this.bG;
    }

    public int ZU() {
        return this.FtP;
    }

    public int Za() {
        return this.ro;
    }

    public void Zg() {
        Lxb(this, this.pyu);
    }

    public String aH() {
        return this.brP;
    }

    public boolean ae() {
        return this.uxf;
    }

    public String bG() {
        return this.SS;
    }

    public int bm() {
        return this.HN;
    }

    public float brP() {
        return this.nBu;
    }

    public int chu() {
        return this.VB;
    }

    public String dR() {
        return this.CG;
    }

    public String eK() {
        return this.kqm;
    }

    public boolean eXY() {
        return this.KOQ;
    }

    public int ebl() {
        return this.chu;
    }

    public int ek() {
        return this.Za;
    }

    public int gS() {
        return this.nTb;
    }

    public boolean goy() {
        return this.JD;
    }

    public int hg() {
        return this.id;
    }

    public int iC() {
        return this.Zg;
    }

    public String id() {
        return this.tD;
    }

    public JSONObject jeq() {
        return this.LXE;
    }

    public float kqm() {
        return this.QAg;
    }

    public JSONObject lc() {
        return this.owi;
    }

    public double le() {
        return this.Ivz;
    }

    public int lk() {
        return this.Bj;
    }

    public String mb() {
        return this.nH;
    }

    public String nBu() {
        return this.Mvg;
    }

    public String nE() {
        return this.aH;
    }

    public boolean nH() {
        return this.iC;
    }

    public double nJ() {
        return this.KPU;
    }

    public boolean nTb() {
        return this.FD;
    }

    public int oc() {
        return this.jeq;
    }

    public int owi() {
        return this.AcC;
    }

    public boolean pyu() {
        return this.Iyd;
    }

    public String rK() {
        return this.Mx;
    }

    public String rW() {
        return this.xan;
    }

    public int ro() {
        return this.MGT;
    }

    public float sLN() {
        return this.LD;
    }

    public int sRq() {
        return this.rW;
    }

    public double tD() {
        return this.JVA;
    }

    public String tv() {
        return this.rK;
    }

    public int uxf() {
        return this.Of;
    }

    public int wCT() {
        return this.oc;
    }

    public String wPa() {
        return this.LRt;
    }

    public boolean wbY() {
        return this.Ns;
    }

    public boolean xan() {
        return this.CSn;
    }

    public boolean xr() {
        return this.Nu;
    }

    public void CG(int i) {
        this.Za = i;
    }

    public void CSn(int i) {
        this.ro = i;
    }

    public void DY(String str) {
        this.SS = str;
    }

    public void HD(int i) {
        this.MGT = i;
    }

    public void IeN(String str) {
        this.xan = str;
    }

    public void Ivz(int i) {
        this.gS = i;
    }

    public void JVA(String str) {
        this.HD = str;
    }

    public void JXs(int i) {
        this.chu = i;
    }

    public void KPU(int i) {
        this.HN = i;
    }

    public void LD(int i) {
        this.Bj = i;
    }

    public void NXR(String str) {
        this.aH = str;
    }

    public void OY(float f) {
        this.QAg = f;
    }

    public void QAg(float f) {
        this.nBu = f;
    }

    public void STP(String str) {
        this.nE = str;
    }

    public void Sfi(int i) {
        this.jeq = i;
    }

    public void VVE(String str) {
        this.hg = str;
    }

    public void ZU(int i) {
        this.goy = i;
    }

    public void aH(int i) {
        this.oc = i;
    }

    public void brP(String str) {
        this.nJ = str;
    }

    public void eK(int i) {
        this.nTb = i;
    }

    public void ebl(float f) {
        this.OY = f;
    }

    public String foI() {
        return this.Sfi;
    }

    public void hg(int i) {
        this.wCT = i;
    }

    public void id(int i) {
        this.tv = i;
    }

    public void kqm(String str) {
        this.CG = str;
    }

    public void lc(int i) {
        this.TA = i;
    }

    public void le(int i) {
        this.bm = i;
    }

    public void lk(int i) {
        this.FtP = i;
    }

    public void nBu(String str) {
        this.Sfi = str;
    }

    public void nE(int i) {
        this.VB = i;
    }

    public void nJ(int i) {
        this.wPa = i;
    }

    public void sLN(String str) {
        this.eK = str;
    }

    public void tD(String str) {
        this.Lpq = str;
    }

    public void xan(int i) {
        this.AcC = i;
    }

    public void CSn(String str) {
        this.rK = str;
    }

    public void DY(int i) {
        this.bG = i;
    }

    public void HD(String str) {
        this.FGm = str;
    }

    public void IeN(int i) {
        this.Of = i;
    }

    public void JVA(int i) {
        this.Pw = i;
    }

    public void JXs(float f) {
        this.lc = f;
    }

    public void LD(float f) {
        this.LD = f;
    }

    public void NXR(int i) {
        this.NDz = i;
    }

    public void OY(String str) {
        this.tD = str;
    }

    public void QAg(String str) {
        this.DY = str;
    }

    public void STP(int i) {
        this.VU = i;
    }

    public void Sfi(String str) {
        this.Lv = str;
    }

    public void VVE(int i) {
        this.JZE = i;
    }

    public void ZU(float f) {
        this.ZU = f;
    }

    public void aH(String str) {
        this.nH = str;
    }

    public void brP(int i) {
        this.ae = i;
    }

    public void eK(String str) {
        this.LRt = str;
    }

    public void ebl(String str) {
        this.brP = str;
    }

    public void foI(int i) {
        this.Zg = i;
    }

    public void id(String str) {
        this.Mx = str;
    }

    public void kqm(int i) {
        this.wbY = i;
    }

    public void lc(float f) {
        this.ebl = f;
    }

    public void lk(float f) {
        this.lk = f;
    }

    public void nBu(int i) {
        this.rW = i;
    }

    public void sLN(int i) {
        this.dR = i;
    }

    public void tD(int i) {
        this.xr = i;
    }

    public void IeN(boolean z) {
        this.FV = z;
    }

    public void JVA(boolean z) {
        this.FD = z;
    }

    public void JXs(String str) {
        this.VVE = str;
    }

    public void LD(boolean z) {
        this.JXs = z;
    }

    public void NXR(boolean z) {
        this.KOQ = z;
    }

    public void OY(int i) {
        this.foI = i;
    }

    public void QAg(int i) {
        this.BcA = i;
    }

    public void STP(boolean z) {
        this.Iyd = z;
    }

    public void VVE(boolean z) {
        this.JD = z;
    }

    public void ZU(String str) {
        this.IeN = str;
    }

    public void brP(boolean z) {
        this.eXY = z;
    }

    public void ebl(int i) {
        this.id = i;
    }

    public void kqm(boolean z) {
        this.iC = z;
    }

    public void lc(String str) {
        this.kqm = str;
    }

    public void lk(double d) {
        this.sLN = d;
    }

    public void nBu(boolean z) {
        this.Nu = z;
    }

    public void sLN(boolean z) {
        this.Bg = z;
    }

    public void JXs(double d) {
        this.Ivz = d;
    }

    public void LD(double d) {
        this.JVA = d;
    }

    public void OY(boolean z) {
        this.Sv = z;
    }

    public void QAg(boolean z) {
        this.uxf = z;
    }

    public void ZU(double d) {
        this.KPU = d;
    }

    public void ebl(boolean z) {
        this.Ns = z;
    }

    public void lc(double d) {
        this.JJ = d;
    }

    public void lk(String str) {
        this.STP = str;
    }

    public void JXs(boolean z) {
        this.sRq = z;
    }

    public void LD(String str) {
        this.NXR = str;
    }

    public void ZU(boolean z) {
        this.le = z;
    }

    public void lc(boolean z) {
        this.Ld = z;
    }

    public void lk(boolean z) {
        this.CSn = z;
    }

    public void JXs(JSONObject jSONObject) {
        this.owi = jSONObject;
    }

    public void LD(JSONObject jSONObject) {
        this.LXE = jSONObject;
    }

    public void ZU(JSONObject jSONObject) {
        this.mb = jSONObject;
    }

    public void lk(JSONObject jSONObject) {
        this.pyu = jSONObject;
    }

    public boolean Lxb() {
        return this.Wi;
    }

    public void Lxb(boolean z) {
        this.Wi = z;
    }

    public void Lxb(int i) {
        this.ek = i;
    }

    public void Lxb(double d) {
        this.Rt = d;
    }

    public void Lxb(String str) {
        this.Mvg = str;
    }

    public void Lxb(float f) {
        this.Lxb = f;
    }

    public void Lxb(List<Lxb> list) {
        this.Hu = list;
    }

    public void Lxb(long j) {
        this.fG = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void Lxb(lc lcVar, JSONObject jSONObject) {
        if (lcVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            byte b = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        b = 11;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        b = 12;
                    }
                    break;
                case -1065511464:
                    if (next.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        b = cw.k;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b = cw.l;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b = cw.m;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b = cw.n;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b = 18;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b = 20;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b = 21;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b = 22;
                    }
                    break;
                case -734428249:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        b = 23;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b = 24;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b = 25;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b = 26;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b = 27;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b = 28;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b = 29;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b = 30;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b = 31;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b = 32;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        b = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals(TtmlNode.LEFT)) {
                        b = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals(TtmlNode.RIGHT)) {
                        b = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        b = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b = 42;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        b = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b = 47;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals("position")) {
                        b = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b = 61;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b = 63;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b = 64;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b = 66;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    lcVar.lk(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    lcVar.IeN(jSONObject.optString(next));
                    break;
                case 2:
                    lcVar.id(jSONObject.optString(next));
                    break;
                case 3:
                    lcVar.ebl(jSONObject.optString(next));
                    break;
                case 4:
                    lcVar.QAg(jSONObject.optInt(next));
                    break;
                case 5:
                    lcVar.brP(jSONObject.optBoolean(next));
                    break;
                case 6:
                    lcVar.lc(jSONObject.optBoolean(next));
                    break;
                case 7:
                    lcVar.NXR(jSONObject.optString(next));
                    break;
                case 8:
                    lcVar.lc((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    lcVar.LD(jSONObject.optString(next));
                    break;
                case 10:
                    lcVar.eK(jSONObject.optInt(next));
                    break;
                case 11:
                    lcVar.lk(jSONObject.optString(next));
                    break;
                case 12:
                    lcVar.lk((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    lcVar.ZU(jSONObject.optString(next));
                    break;
                case 14:
                    lcVar.Sfi(jSONObject.optString(next));
                    break;
                case 15:
                    lcVar.LD(jSONObject.optBoolean(next));
                    break;
                case 16:
                    lcVar.nBu(jSONObject.optInt(next));
                    break;
                case 17:
                    lcVar.nBu(jSONObject.optBoolean(next));
                    break;
                case 18:
                    lcVar.Lxb(jSONObject.optLong(next));
                    break;
                case 19:
                    lcVar.HD(jSONObject.optString(next));
                    break;
                case 20:
                    lcVar.kqm(jSONObject.optInt(next));
                    break;
                case 21:
                    lcVar.CSn(jSONObject.optInt(next));
                    break;
                case 22:
                    lcVar.QAg(jSONObject.optBoolean(next));
                    break;
                case 23:
                    lcVar.IeN(jSONObject.optInt(next));
                    break;
                case 24:
                    lcVar.aH(jSONObject.optInt(next));
                    break;
                case 25:
                    lcVar.LD(jSONObject.optDouble(next));
                    break;
                case 26:
                    lcVar.lc(jSONObject.optDouble(next));
                    break;
                case 27:
                    lcVar.tD(jSONObject.optInt(next));
                    break;
                case 28:
                    lcVar.OY(jSONObject.optBoolean(next));
                    break;
                case 29:
                    lcVar.JVA(jSONObject.optInt(next));
                    break;
                case 30:
                    lcVar.lc(jSONObject.optString(next));
                    break;
                case 31:
                    lcVar.ebl(jSONObject.optBoolean(next));
                    break;
                case 32:
                    lcVar.JVA(jSONObject.optString(next));
                    break;
                case 33:
                    lcVar.HD(jSONObject.optInt(next));
                    break;
                case 34:
                    lcVar.DY(jSONObject.optString(next));
                    break;
                case 35:
                    lcVar.DY(jSONObject.optInt(next));
                    break;
                case 36:
                    lcVar.Lxb(jSONObject.optBoolean(next));
                    break;
                case 37:
                    lcVar.OY((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    lcVar.tD(jSONObject.optString(next));
                    break;
                case 39:
                    lcVar.JXs(jSONObject.optString(next));
                    break;
                case 40:
                    lcVar.Sfi(jSONObject.optInt(next));
                    break;
                case 41:
                    lcVar.ZU((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    lcVar.lk(jSONObject.optDouble(next));
                    break;
                case 43:
                    lcVar.JXs((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    lcVar.JVA(jSONObject.optBoolean(next));
                    break;
                case 45:
                    lcVar.STP(jSONObject.optBoolean(next));
                    break;
                case 46:
                    lcVar.QAg((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    lcVar.brP(jSONObject.optString(next));
                    break;
                case 48:
                    lcVar.Ivz(jSONObject.optInt(next));
                    break;
                case 49:
                    lcVar.ebl((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    lcVar.OY(jSONObject.optString(next));
                    break;
                case 51:
                    lcVar.QAg(jSONObject.optString(next));
                    break;
                case 52:
                    lcVar.VVE(jSONObject.optInt(next));
                    break;
                case 53:
                    lcVar.JXs(jSONObject.optBoolean(next));
                    break;
                case 54:
                    lcVar.NXR(jSONObject.optInt(next));
                    break;
                case 55:
                    lcVar.kqm(jSONObject.optString(next));
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        lcVar.ebl(jSONObjectOptJSONObject.optInt("translateY", 0));
                        lcVar.OY(jSONObjectOptJSONObject.optInt("translateX", 0));
                        lcVar.ZU(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        lcVar.JXs(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    lcVar.ZU(jSONObject.optBoolean(next));
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    lcVar.sLN(jSONObject.optString(next));
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    lcVar.STP(jSONObject.optString(next));
                    break;
                case 60:
                    lcVar.Lxb((float) jSONObject.optDouble(next));
                    break;
                case Input.Keys.TAB /* 61 */:
                    lcVar.VVE(jSONObject.optString(next));
                    break;
                case Input.Keys.SPACE /* 62 */:
                    lcVar.nBu(jSONObject.optString(next));
                    break;
                case 63:
                    lcVar.brP(jSONObject.optInt(next));
                    break;
                case 64:
                    lcVar.LD((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    lcVar.sLN(jSONObject.optInt(next));
                    break;
                case 66:
                    lcVar.STP(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
