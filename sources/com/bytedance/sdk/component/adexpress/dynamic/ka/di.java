package com.bytedance.sdk.component.adexpress.dynamic.ka;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private int aac;
    private String ac;
    private int adz;
    private int ajz;
    private JSONObject akr;
    private int amj;
    private String aw;
    private String ay;
    private int bfa;
    private String bgr;
    private int bnj;
    private String bu;
    private boolean bzf;
    private boolean che;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private double f18037co;
    private JSONObject de;
    private float di;
    private double dw;
    private String dzy;
    private int eb;
    private int eqw;
    private JSONObject eu;
    private int evm;
    private int ezp;
    private int fb;
    private int fe;
    private double feb;
    private boolean fi;
    private String fn;
    private boolean fr;
    private String gcp;
    private String hcw;
    private int hd;
    private int hpn;
    private List<ri> hws;
    private int id;
    private int ig;
    private int igq;
    private String ihz;
    private float ik;
    private boolean iph;
    private float jbs;
    private int jc;
    private String jg;
    private int jm;
    private int jxw;
    private float ka;
    private int kt;
    private float lr;
    private String luy;
    private float mj;
    private double nbc;
    private int nd;
    private int nh;
    private String nr;
    private String oh;
    private String ory;
    private int pc;
    private boolean pu;
    private boolean pv;
    private int qd;
    private boolean qh;
    private int qmx;
    private float qt;
    private boolean rbz;
    private float ri;
    private boolean rzk;
    private int saa;
    private boolean sez;
    private double sf;
    private String siy;
    private String skk;
    private String slm;
    private String smj;
    private int srn;
    private int su;
    private String sz;
    private boolean ta;
    private String tan;
    private boolean tnn;
    private int tpb;
    private long tq = -1;
    private JSONObject tw;
    private boolean ud;
    private String uq;
    private String vr;
    private int vt;
    private boolean whw;
    private String wjv;
    private String xd;
    private int xe;
    private String xh;
    private float xha;
    private String xlq;
    private boolean xm;
    private int yjm;
    private boolean zb;
    private double zf;
    private String zk;
    private int zv;
    private boolean zxp;
    private int zyn;

    private void igq(String str) {
        this.skk = str;
    }

    public static di ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        di diVar = new di();
        diVar.lr(jSONObject.optString("adType", "embeded"));
        diVar.vr(jSONObject.optString("clickArea", "creative"));
        diVar.slm(jSONObject.optString("clickTigger", "click"));
        diVar.ik(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        diVar.ka(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        diVar.fi(jSONObject.optString("color", "#999999"));
        diVar.di(jSONObject.optString("bgColor", X3.i.T));
        diVar.xha(jSONObject.optString("bgImgUrl", ""));
        diVar.igq(jSONObject.optString("bgImgData", ""));
        diVar.mj(jSONObject.optString("borderColor", "#000000"));
        diVar.jbs(jSONObject.optString("borderStyle", "solid"));
        diVar.qt(jSONObject.optString("heightMode", "auto"));
        diVar.sf(jSONObject.optString("widthMode", "fixed"));
        diVar.co(jSONObject.optString("interactText", ""));
        diVar.ik(jSONObject.optBoolean("isShowBgControl", false));
        diVar.aw(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            diVar.xha(jSONObjectOptJSONObject.optInt("translateY", 0));
            diVar.mj(jSONObjectOptJSONObject.optInt("translateX", 0));
            diVar.ka(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            diVar.fi(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        diVar.bgr(jSONObject.optString("interactType", ""));
        diVar.fi(jSONObject.optInt("interactSlideDirection", -1));
        diVar.bu(jSONObject.optString("justifyHorizontal", "space-around"));
        diVar.nr(jSONObject.optString("justifyVertical", "flex-start"));
        diVar.lr(jSONObject.optDouble("timingStart"));
        diVar.ik(jSONObject.optDouble("timingEnd"));
        diVar.ka((float) jSONObject.optDouble("width", 0.0d));
        diVar.ik((float) jSONObject.optDouble("height", 0.0d));
        diVar.ri((float) jSONObject.optDouble("borderRadius", 0.0d));
        diVar.lr((float) jSONObject.optDouble("borderSize", 0.0d));
        diVar.lr(jSONObject.optBoolean("interactValidate", false));
        diVar.jbs((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        diVar.fi((float) jSONObject.optDouble("paddingBottom", 0.0d));
        diVar.di((float) jSONObject.optDouble("paddingLeft", 0.0d));
        diVar.xha((float) jSONObject.optDouble("paddingRight", 0.0d));
        diVar.mj((float) jSONObject.optDouble("paddingTop", 0.0d));
        diVar.ka(jSONObject.optBoolean("lineFeed", false));
        diVar.jbs(jSONObject.optInt("lineCount", 0));
        diVar.di(jSONObject.optDouble("lineHeight", 1.2d));
        diVar.bgr(jSONObject.optInt("letterSpacing", 0));
        diVar.fi(jSONObject.optBoolean("isDataFixed", false));
        diVar.vr(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        diVar.di(jSONObject.optBoolean("lineLimit"));
        diVar.slm(jSONObject.optInt(X3.i.L));
        diVar.tan(jSONObject.optString("align"));
        diVar.xha(jSONObject.optBoolean("useLeft"));
        diVar.mj(jSONObject.optBoolean("useRight"));
        diVar.jbs(jSONObject.optBoolean("useTop"));
        diVar.qt(jSONObject.optBoolean("useBottom"));
        diVar.ac(jSONObject.optString("data"));
        diVar.lr(jSONObject.optJSONObject("i18n"));
        diVar.co(jSONObject.optInt("marginLeft"));
        diVar.aw(jSONObject.optInt("marginRight"));
        diVar.qt(jSONObject.optInt("marginTop"));
        diVar.sf(jSONObject.optInt("marginBottom"));
        diVar.bu(jSONObject.optInt("tagMaxCount"));
        diVar.sf(jSONObject.optBoolean("allowTextFlow"));
        diVar.nr(jSONObject.optInt("textFlowType"));
        diVar.tan(jSONObject.optInt("textFlowDuration"));
        diVar.ac(jSONObject.optInt(TtmlNode.LEFT));
        diVar.ihz(jSONObject.optInt(TtmlNode.RIGHT));
        diVar.uq(jSONObject.optInt("top"));
        diVar.wjv(jSONObject.optInt("bottom"));
        diVar.ihz(jSONObject.optString("alignItems", "flex-start"));
        diVar.uq(jSONObject.optString("direction", ""));
        diVar.ri(jSONObject.optBoolean("loop", false));
        diVar.ay(jSONObject.optInt("zIndex"));
        diVar.dw(jSONObject.optInt("interactVisibleTime"));
        diVar.fr(jSONObject.optInt("interactHiddenTime"));
        diVar.aw(jSONObject.optBoolean("interactEnableMask"));
        diVar.bgr(jSONObject.optBoolean("interactWontHide"));
        diVar.ri(jSONObject.optString("bgGradient"));
        diVar.hcw(jSONObject.optInt("areaType"));
        diVar.oh(jSONObject.optInt("interactSlideThreshold", 0));
        diVar.pv(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.ka.lr() ? 0 : 120));
        diVar.nr(jSONObject.optBoolean("openPlayableLandingPage", false));
        diVar.ik(jSONObject.optJSONObject("video"));
        diVar.ka(jSONObject.optJSONObject("image"));
        diVar.xd(jSONObject.optInt("borderShadowExtent"));
        diVar.vr(jSONObject.optBoolean("bgGauseBlur"));
        diVar.dzy(jSONObject.optInt("bgGauseBlurRadius"));
        diVar.slm(jSONObject.optBoolean("showTimeProgress", false));
        diVar.bu(jSONObject.optBoolean("showPlayButton", false));
        diVar.ri(jSONObject.optDouble("bgColorCg", 0.0d));
        diVar.di(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        diVar.lr(jSONObject.optInt("borderTopLeftRadius", 0));
        diVar.ri(jSONObject.optInt("borderTopRightRadius", 0));
        diVar.ka(jSONObject.optInt("borderBottomLeftRadius", 0));
        diVar.ik(jSONObject.optInt("borderBottomRightRadius", 0));
        diVar.fi(jSONObject.optJSONObject("interactI18n"));
        diVar.ay(jSONObject.optString("imageObjectFit"));
        diVar.fr(jSONObject.optString("interactTitle"));
        diVar.ory(jSONObject.optInt("interactTextPositionTop"));
        diVar.wjv(jSONObject.optString("imageLottieTosPath"));
        diVar.co(jSONObject.optBoolean("animationsLoop"));
        diVar.su(jSONObject.optInt("lottieAppNameMaxLength"));
        diVar.zf(jSONObject.optInt("lottieAdDescMaxLength"));
        diVar.igq(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    ri riVar = new ri();
                    riVar.ik(jSONObject2.optString("animationType"));
                    riVar.ri(jSONObject2.optDouble("animationDuration"));
                    riVar.lr(jSONObject2.optDouble("animationScaleX"));
                    riVar.ik(jSONObject2.optDouble("animationScaleY"));
                    riVar.ka(jSONObject2.optString("animationTimeFunction"));
                    riVar.ka(jSONObject2.optDouble("animationDelay"));
                    riVar.di(jSONObject2.optInt("animationIterationCount"));
                    riVar.fi(jSONObject2.optString("animationDirection"));
                    riVar.fi(jSONObject2.optDouble("animationInterval"));
                    riVar.ri(jSONObject2.optInt("animationBorderWidth"));
                    riVar.ri(jSONObject2.optLong(X3.i.W));
                    riVar.lr(jSONObject2.optInt("animationEffectWidth"));
                    riVar.ik(jSONObject2.optInt("animationSwing", 1));
                    riVar.ka(jSONObject2.optInt("animationTranslateX"));
                    riVar.fi(jSONObject2.optInt("animationTranslateY"));
                    riVar.lr(jSONObject2.optString("animationRippleBackgroundColor"));
                    riVar.ri(jSONObject2.optString("animationScaleDirection"));
                    riVar.xha(jSONObject2.optInt("animationFadeStart"));
                    riVar.mj(jSONObject2.optInt("animationFadeEnd"));
                    riVar.di(jSONObject2.optString("animationFillMode"));
                    riVar.jbs(jSONObject2.optInt("animationBounceHeight"));
                    if (diVar.tan() > 0.0d) {
                        riVar.ka(riVar.bgr() + diVar.tan());
                    }
                    arrayList.add(riVar);
                }
                diVar.ri(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                diVar.su(jSONObject.optString("triggerSlideDirection", "0"));
                diVar.ri(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return diVar;
    }

    public boolean aac() {
        return this.rzk;
    }

    public double ac() {
        return this.f18037co;
    }

    public boolean adz() {
        return this.iph;
    }

    public boolean ajz() {
        return this.zb;
    }

    public boolean akr() {
        return this.zxp;
    }

    public void amj() {
        ri(this, this.akr);
    }

    public boolean aw() {
        return this.fi;
    }

    public String ay() {
        return this.nr;
    }

    public void bfa() {
        ri(this, this.de);
    }

    public float bgr() {
        return this.di;
    }

    public int bnj() {
        return this.kt;
    }

    public float bu() {
        return this.jbs;
    }

    public String bzf() {
        return this.xlq;
    }

    public int che() {
        return this.amj;
    }

    public float co() {
        return this.lr;
    }

    public String de() {
        return this.sz;
    }

    public JSONObject di() {
        return this.eu;
    }

    public String dw() {
        return this.wjv;
    }

    public double dzy() {
        return this.zf;
    }

    public int eb() {
        return this.qmx;
    }

    public String eqw() {
        return this.fn;
    }

    public int eu() {
        return this.jxw;
    }

    public boolean evm() {
        return this.pu;
    }

    public int ezp() {
        return this.vt;
    }

    public int fb() {
        return this.hd;
    }

    public int fe() {
        return this.srn;
    }

    public boolean feb() {
        return this.pv;
    }

    public int fi() {
        return this.evm;
    }

    public String fn() {
        return this.xh;
    }

    public String fr() {
        return this.skk;
    }

    public int gcp() {
        return this.bnj;
    }

    public boolean hcw() {
        return this.fr;
    }

    public int hd() {
        return this.bfa;
    }

    public int hpn() {
        return this.saa;
    }

    public String hws() {
        return this.zk;
    }

    public int id() {
        return this.ajz;
    }

    public String ig() {
        return this.ory;
    }

    public String ihz() {
        return this.vr;
    }

    public int ik() {
        return this.adz;
    }

    public boolean iph() {
        return this.rbz;
    }

    public int jbs() {
        return this.tpb;
    }

    public String jc() {
        return this.xd;
    }

    public int jm() {
        return this.eb;
    }

    public String jxw() {
        return this.luy;
    }

    public int ka() {
        return this.ezp;
    }

    public String kt() {
        return this.dzy;
    }

    public int lr() {
        return this.jm;
    }

    public int luy() {
        return this.xe;
    }

    public double mj() {
        return this.nbc;
    }

    public int nbc() {
        return this.id;
    }

    public boolean nd() {
        return this.whw;
    }

    public int nh() {
        return this.hpn;
    }

    public float nr() {
        return this.qt;
    }

    public int oh() {
        return this.su;
    }

    public String ory() {
        return this.ay;
    }

    public int pc() {
        return this.nd;
    }

    public int pu() {
        return this.eqw;
    }

    public double pv() {
        return this.dw;
    }

    public String qd() {
        return this.hcw;
    }

    public boolean qh() {
        return this.ta;
    }

    public int qmx() {
        return this.pc;
    }

    public String qt() {
        return this.jg;
    }

    public JSONObject rbz() {
        return this.de;
    }

    public int rzk() {
        return this.fe;
    }

    public JSONObject saa() {
        return this.tw;
    }

    public boolean sez() {
        return this.bzf;
    }

    public float sf() {
        return this.ri;
    }

    public double siy() {
        return this.feb;
    }

    public float slm() {
        return this.mj;
    }

    public boolean smj() {
        return this.sez;
    }

    public String srn() {
        return this.oh;
    }

    public String su() {
        return this.tan;
    }

    public boolean sz() {
        return this.che;
    }

    public int ta() {
        return this.jc;
    }

    public double tan() {
        return this.sf;
    }

    public int tnn() {
        return this.qd;
    }

    public int tpb() {
        return this.nh;
    }

    public String tw() {
        return this.siy;
    }

    public int ud() {
        return this.yjm;
    }

    public String uq() {
        return this.slm;
    }

    public float vr() {
        return this.xha;
    }

    public String vt() {
        return this.smj;
    }

    public int whw() {
        return this.zyn;
    }

    public String wjv() {
        return this.bu;
    }

    public int xd() {
        return this.igq;
    }

    public boolean xe() {
        return this.qh;
    }

    public long xh() {
        return this.tq;
    }

    public int xha() {
        return this.zv;
    }

    public List<ri> xlq() {
        return this.hws;
    }

    public boolean xm() {
        return this.tnn;
    }

    public String yjm() {
        return this.gcp;
    }

    public boolean zb() {
        return this.xm;
    }

    public String zf() {
        return this.uq;
    }

    public int zk() {
        return this.aac;
    }

    public int zv() {
        return this.fb;
    }

    public int zxp() {
        List<ri> list = this.hws;
        if (list == null) {
            return 0;
        }
        for (ri riVar : list) {
            if ("translate".equals(riVar.jbs()) && riVar.xha() < 0) {
                return -riVar.xha();
            }
        }
        return 0;
    }

    public int zyn() {
        return this.ig;
    }

    public void ac(String str) {
        this.gcp = str;
    }

    public void aw(String str) {
        this.ay = str;
    }

    public void ay(int i) {
        this.hpn = i;
    }

    public void bgr(String str) {
        this.ory = str;
    }

    public void bu(String str) {
        this.xd = str;
    }

    public void co(String str) {
        this.wjv = str;
    }

    public void di(int i) {
        this.tpb = i;
    }

    public void dw(int i) {
        this.id = i;
    }

    public void dzy(int i) {
        this.vt = i;
    }

    public void fi(int i) {
        this.zv = i;
    }

    public void fr(int i) {
        this.qmx = i;
    }

    public void hcw(int i) {
        this.jxw = i;
    }

    public String igq() {
        return this.ihz;
    }

    public void ihz(int i) {
        this.saa = i;
    }

    public void ik(int i) {
        this.ezp = i;
    }

    public void jbs(float f) {
        this.qt = f;
    }

    public void ka(int i) {
        this.evm = i;
    }

    public void lr(int i) {
        this.adz = i;
    }

    public void mj(float f) {
        this.jbs = f;
    }

    public void nr(String str) {
        this.dzy = str;
    }

    public void oh(int i) {
        this.nh = i;
    }

    public void ory(int i) {
        this.fb = i;
    }

    public void pv(int i) {
        this.hd = i;
    }

    public void qt(String str) {
        this.ihz = str;
    }

    public void sf(String str) {
        this.uq = str;
    }

    public void slm(String str) {
        this.oh = str;
    }

    public void su(int i) {
        this.eqw = i;
    }

    public void tan(String str) {
        this.siy = str;
    }

    public void uq(int i) {
        this.pc = i;
    }

    public void vr(String str) {
        this.hcw = str;
    }

    public void wjv(int i) {
        this.ajz = i;
    }

    public void xd(int i) {
        this.eb = i;
    }

    public void xha(float f) {
        this.mj = f;
    }

    public void zf(int i) {
        this.bfa = i;
    }

    public void ac(int i) {
        this.yjm = i;
    }

    public void aw(int i) {
        this.kt = i;
    }

    public void ay(String str) {
        this.sz = str;
    }

    public void bgr(int i) {
        this.zyn = i;
    }

    public void bu(int i) {
        this.nd = i;
    }

    public void co(int i) {
        this.jc = i;
    }

    public void di(float f) {
        this.xha = f;
    }

    public void fi(float f) {
        this.di = f;
    }

    public void fr(String str) {
        this.fn = str;
    }

    public void igq(int i) {
        this.amj = i;
    }

    public void ihz(String str) {
        this.zk = str;
    }

    public void ik(float f) {
        this.ik = f;
    }

    public void jbs(String str) {
        this.ac = str;
    }

    public void ka(float f) {
        this.ka = f;
    }

    public void lr(float f) {
        this.lr = f;
    }

    public void mj(String str) {
        this.tan = str;
    }

    public void nr(int i) {
        this.aac = i;
    }

    public void qt(int i) {
        this.qd = i;
    }

    public void sf(int i) {
        this.srn = i;
    }

    public void slm(int i) {
        this.bnj = i;
    }

    public void su(String str) {
        this.xh = str;
    }

    public void tan(int i) {
        this.xe = i;
    }

    public void uq(String str) {
        this.luy = str;
    }

    public void vr(int i) {
        this.fe = i;
    }

    public void wjv(String str) {
        this.smj = str;
    }

    public void xha(String str) {
        this.nr = str;
    }

    public void aw(boolean z) {
        this.bzf = z;
    }

    public void bgr(boolean z) {
        this.zxp = z;
    }

    public void bu(boolean z) {
        this.che = z;
    }

    public void co(boolean z) {
        this.rbz = z;
    }

    public void di(String str) {
        this.bu = str;
    }

    public void fi(String str) {
        this.slm = str;
    }

    public void ik(double d) {
        this.f18037co = d;
    }

    public void jbs(int i) {
        this.ig = i;
    }

    public void ka(String str) {
        this.vr = str;
    }

    public void lr(boolean z) {
        this.fi = z;
    }

    public void mj(int i) {
        this.igq = i;
    }

    public void nr(boolean z) {
        this.sez = z;
    }

    public void qt(boolean z) {
        this.qh = z;
    }

    public void sf(boolean z) {
        this.zb = z;
    }

    public void slm(boolean z) {
        this.pu = z;
    }

    public void vr(boolean z) {
        this.iph = z;
    }

    public void xha(int i) {
        this.su = i;
    }

    public void di(double d) {
        this.feb = d;
    }

    public void fi(double d) {
        this.dw = d;
    }

    public void ik(String str) {
        this.bgr = str;
    }

    public void jbs(boolean z) {
        this.rzk = z;
    }

    public void ka(double d) {
        this.zf = d;
    }

    public void lr(double d) {
        this.sf = d;
    }

    public void mj(boolean z) {
        this.xm = z;
    }

    public void xha(boolean z) {
        this.whw = z;
    }

    public void di(boolean z) {
        this.ta = z;
    }

    public void fi(boolean z) {
        this.tnn = z;
    }

    public void ik(boolean z) {
        this.fr = z;
    }

    public void ka(boolean z) {
        this.pv = z;
    }

    public void lr(String str) {
        this.aw = str;
    }

    public void fi(JSONObject jSONObject) {
        this.eu = jSONObject;
    }

    public void ik(JSONObject jSONObject) {
        this.akr = jSONObject;
    }

    public void ka(JSONObject jSONObject) {
        this.de = jSONObject;
    }

    public void lr(JSONObject jSONObject) {
        this.tw = jSONObject;
    }

    public boolean ri() {
        return this.ud;
    }

    public void ri(boolean z) {
        this.ud = z;
    }

    public void ri(int i) {
        this.jm = i;
    }

    public void ri(double d) {
        this.nbc = d;
    }

    public void ri(String str) {
        this.jg = str;
    }

    public void ri(float f) {
        this.ri = f;
    }

    public void ri(List<ri> list) {
        this.hws = list;
    }

    public void ri(long j) {
        this.tq = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void ri(di diVar, JSONObject jSONObject) {
        if (diVar == null || jSONObject == null) {
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
                        b = 13;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b = 14;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b = 15;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
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
                        b = RemoteControlWriter.BLOCK_CMDOK;
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
                    if (next.equals(X3.i.L)) {
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
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b = RemoteControlWriter.BLOCK_CMDDUMP;
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
                    diVar.ik(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    diVar.vr(jSONObject.optString(next));
                    break;
                case 2:
                    diVar.su(jSONObject.optString(next));
                    break;
                case 3:
                    diVar.xha(jSONObject.optString(next));
                    break;
                case 4:
                    diVar.jbs(jSONObject.optInt(next));
                    break;
                case 5:
                    diVar.nr(jSONObject.optBoolean(next));
                    break;
                case 6:
                    diVar.di(jSONObject.optBoolean(next));
                    break;
                case 7:
                    diVar.aw(jSONObject.optString(next));
                    break;
                case 8:
                    diVar.di((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    diVar.lr(jSONObject.optString(next));
                    break;
                case 10:
                    diVar.wjv(jSONObject.optInt(next));
                    break;
                case 11:
                    diVar.ik(jSONObject.optString(next));
                    break;
                case 12:
                    diVar.ik((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    diVar.ka(jSONObject.optString(next));
                    break;
                case 14:
                    diVar.ihz(jSONObject.optString(next));
                    break;
                case 15:
                    diVar.lr(jSONObject.optBoolean(next));
                    break;
                case 16:
                    diVar.qt(jSONObject.optInt(next));
                    break;
                case 17:
                    diVar.qt(jSONObject.optBoolean(next));
                    break;
                case 18:
                    diVar.ri(jSONObject.optLong(next));
                    break;
                case 19:
                    diVar.uq(jSONObject.optString(next));
                    break;
                case 20:
                    diVar.bu(jSONObject.optInt(next));
                    break;
                case 21:
                    diVar.fr(jSONObject.optInt(next));
                    break;
                case 22:
                    diVar.jbs(jSONObject.optBoolean(next));
                    break;
                case 23:
                    diVar.vr(jSONObject.optInt(next));
                    break;
                case 24:
                    diVar.ay(jSONObject.optInt(next));
                    break;
                case 25:
                    diVar.lr(jSONObject.optDouble(next));
                    break;
                case 26:
                    diVar.di(jSONObject.optDouble(next));
                    break;
                case 27:
                    diVar.tan(jSONObject.optInt(next));
                    break;
                case 28:
                    diVar.mj(jSONObject.optBoolean(next));
                    break;
                case 29:
                    diVar.sf(jSONObject.optInt(next));
                    break;
                case 30:
                    diVar.di(jSONObject.optString(next));
                    break;
                case 31:
                    diVar.xha(jSONObject.optBoolean(next));
                    break;
                case 32:
                    diVar.sf(jSONObject.optString(next));
                    break;
                case 33:
                    diVar.uq(jSONObject.optInt(next));
                    break;
                case 34:
                    diVar.ac(jSONObject.optString(next));
                    break;
                case 35:
                    diVar.ac(jSONObject.optInt(next));
                    break;
                case 36:
                    diVar.ri(jSONObject.optBoolean(next));
                    break;
                case 37:
                    diVar.mj((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    diVar.tan(jSONObject.optString(next));
                    break;
                case 39:
                    diVar.fi(jSONObject.optString(next));
                    break;
                case 40:
                    diVar.ihz(jSONObject.optInt(next));
                    break;
                case 41:
                    diVar.ka((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    diVar.ik(jSONObject.optDouble(next));
                    break;
                case 43:
                    diVar.fi((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    diVar.sf(jSONObject.optBoolean(next));
                    break;
                case 45:
                    diVar.bgr(jSONObject.optBoolean(next));
                    break;
                case 46:
                    diVar.jbs((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    diVar.nr(jSONObject.optString(next));
                    break;
                case 48:
                    diVar.dw(jSONObject.optInt(next));
                    break;
                case 49:
                    diVar.xha((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    diVar.mj(jSONObject.optString(next));
                    break;
                case 51:
                    diVar.jbs(jSONObject.optString(next));
                    break;
                case 52:
                    diVar.slm(jSONObject.optInt(next));
                    break;
                case 53:
                    diVar.fi(jSONObject.optBoolean(next));
                    break;
                case 54:
                    diVar.aw(jSONObject.optInt(next));
                    break;
                case 55:
                    diVar.bu(jSONObject.optString(next));
                    break;
                case 56:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        diVar.xha(jSONObjectOptJSONObject.optInt("translateY", 0));
                        diVar.mj(jSONObjectOptJSONObject.optInt("translateX", 0));
                        diVar.ka(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        diVar.fi(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                    }
                    break;
                case 57:
                    diVar.ka(jSONObject.optBoolean(next));
                    break;
                case 58:
                    diVar.co(jSONObject.optString(next));
                    break;
                case 59:
                    diVar.bgr(jSONObject.optString(next));
                    break;
                case 60:
                    diVar.ri((float) jSONObject.optDouble(next));
                    break;
                case 61:
                    diVar.slm(jSONObject.optString(next));
                    break;
                case 62:
                    diVar.qt(jSONObject.optString(next));
                    break;
                case 63:
                    diVar.nr(jSONObject.optInt(next));
                    break;
                case 64:
                    diVar.lr((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    diVar.co(jSONObject.optInt(next));
                    break;
                case 66:
                    diVar.bgr(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
