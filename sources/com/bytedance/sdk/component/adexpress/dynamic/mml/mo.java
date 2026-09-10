package com.bytedance.sdk.component.adexpress.dynamic.mml;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.smartdigimkt.x.d;
import com.smartdigimkt.x.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo {
    private String aaj;
    private int ag;
    private String auu;
    private int ax;
    private String bch;
    private String bjy;
    private int blf;
    private int bqt;
    private boolean bx;
    private int ca;
    private JSONObject car;
    private int cx;
    private int dk;
    private JSONObject dps;
    private String ekw;
    private int en;
    private String eta;
    private int ew;
    private String exc;
    private String exu;
    private boolean fco;
    private String fge;
    private double fs;
    private int fzn;
    private int gg;
    private int gsp;
    private String gsv;
    private boolean gt;
    private int gy;
    private boolean hcs;
    private String hd;
    private String hkc;
    private int hr;
    private String hzv;
    private int ijp;
    private int irn;
    private JSONObject iw;
    private int ji;
    private boolean jjk;
    private String jl;
    private boolean jle;
    private boolean jnw;
    private float jpc;
    private String jtx;
    private boolean jut;
    private String jyq;
    private int kab;
    private String kdv;
    private int kj;
    private double koa;
    private String kr;
    private String ljh;
    private int lme;
    private float lnr;
    private int lq;
    private boolean lte;
    private int mlb;
    private float mml;
    private float mo;
    private int mrf;
    private boolean mzz;
    private String nts;
    private int nz;
    private int od;
    private double om;
    private String oth;
    private float qdl;
    private String qk;
    private String ra;
    private String rc;
    private String rdp;
    private double rq;
    private List<qdl> rzg;
    private int se;
    private String sy;
    private JSONObject syy;
    private boolean taz;
    private int tdy;
    private boolean tid;
    private float to;
    private boolean tqd;
    private float tvp;
    private float ud;
    private boolean uw;
    private boolean vc;
    private int vm;
    private long vr = -1;
    private double vu;
    private int wak;
    private int wc;
    private float wd;
    private double xdk;
    private String xi;
    private int xmv;
    private boolean xx;
    private int ygv;
    private boolean yh;
    private String yt;
    private boolean zlt;
    private int zpu;
    private int zvv;
    private int zy;

    private void bqt(String str) {
        this.auu = str;
    }

    public static mo qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mo moVar = new mo();
        moVar.ud(jSONObject.optString("adType", "embeded"));
        moVar.bjy(jSONObject.optString("clickArea", t.o1));
        moVar.jtx(jSONObject.optString("clickTigger", "click"));
        moVar.lnr(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        moVar.mml(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        moVar.mzz(jSONObject.optString("color", "#999999"));
        moVar.mo(jSONObject.optString("bgColor", d9.h.T));
        moVar.wd(jSONObject.optString("bgImgUrl", ""));
        moVar.bqt(jSONObject.optString("bgImgData", ""));
        moVar.jpc(jSONObject.optString("borderColor", "#000000"));
        moVar.tvp(jSONObject.optString("borderStyle", "solid"));
        moVar.to(jSONObject.optString("heightMode", "auto"));
        moVar.rq(jSONObject.optString("widthMode", "fixed"));
        moVar.fs(jSONObject.optString("interactText", ""));
        moVar.lnr(jSONObject.optBoolean("isShowBgControl", false));
        moVar.exu(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            moVar.wd(jSONObjectOptJSONObject.optInt("translateY", 0));
            moVar.jpc(jSONObjectOptJSONObject.optInt("translateX", 0));
            moVar.mml(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            moVar.mzz(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        moVar.rdp(jSONObject.optString("interactType", ""));
        moVar.mzz(jSONObject.optInt("interactSlideDirection", -1));
        moVar.yt(jSONObject.optString("justifyHorizontal", "space-around"));
        moVar.jl(jSONObject.optString("justifyVertical", "flex-start"));
        moVar.ud(jSONObject.optDouble("timingStart"));
        moVar.lnr(jSONObject.optDouble("timingEnd"));
        moVar.mml((float) jSONObject.optDouble("width", 0.0d));
        moVar.lnr((float) jSONObject.optDouble("height", 0.0d));
        moVar.qdl((float) jSONObject.optDouble("borderRadius", 0.0d));
        moVar.ud((float) jSONObject.optDouble("borderSize", 0.0d));
        moVar.ud(jSONObject.optBoolean("interactValidate", false));
        moVar.tvp((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        moVar.mzz((float) jSONObject.optDouble("paddingBottom", 0.0d));
        moVar.mo((float) jSONObject.optDouble("paddingLeft", 0.0d));
        moVar.wd((float) jSONObject.optDouble("paddingRight", 0.0d));
        moVar.jpc((float) jSONObject.optDouble("paddingTop", 0.0d));
        moVar.mml(jSONObject.optBoolean("lineFeed", false));
        moVar.tvp(jSONObject.optInt("lineCount", 0));
        moVar.mo(jSONObject.optDouble("lineHeight", 1.2d));
        moVar.rdp(jSONObject.optInt("letterSpacing", 0));
        moVar.mzz(jSONObject.optBoolean("isDataFixed", false));
        moVar.bjy(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        moVar.mo(jSONObject.optBoolean("lineLimit"));
        moVar.jtx(jSONObject.optInt("position"));
        moVar.exc(jSONObject.optString("align"));
        moVar.wd(jSONObject.optBoolean("useLeft"));
        moVar.jpc(jSONObject.optBoolean("useRight"));
        moVar.tvp(jSONObject.optBoolean("useTop"));
        moVar.to(jSONObject.optBoolean("useBottom"));
        moVar.aaj(jSONObject.optString("data"));
        moVar.ud(jSONObject.optJSONObject("i18n"));
        moVar.fs(jSONObject.optInt("marginLeft"));
        moVar.exu(jSONObject.optInt("marginRight"));
        moVar.to(jSONObject.optInt("marginTop"));
        moVar.rq(jSONObject.optInt("marginBottom"));
        moVar.yt(jSONObject.optInt("tagMaxCount"));
        moVar.rq(jSONObject.optBoolean("allowTextFlow"));
        moVar.jl(jSONObject.optInt("textFlowType"));
        moVar.exc(jSONObject.optInt("textFlowDuration"));
        moVar.aaj(jSONObject.optInt(TtmlNode.LEFT));
        moVar.jyq(jSONObject.optInt(TtmlNode.RIGHT));
        moVar.oth(jSONObject.optInt("top"));
        moVar.ljh(jSONObject.optInt("bottom"));
        moVar.jyq(jSONObject.optString("alignItems", "flex-start"));
        moVar.oth(jSONObject.optString("direction", ""));
        moVar.qdl(jSONObject.optBoolean("loop", false));
        moVar.bch(jSONObject.optInt("zIndex"));
        moVar.vu(jSONObject.optInt("interactVisibleTime"));
        moVar.uw(jSONObject.optInt("interactHiddenTime"));
        moVar.exu(jSONObject.optBoolean("interactEnableMask"));
        moVar.rdp(jSONObject.optBoolean("interactWontHide"));
        moVar.qdl(jSONObject.optString("bgGradient"));
        moVar.kdv(jSONObject.optInt("areaType"));
        moVar.ekw(jSONObject.optInt("interactSlideThreshold", 0));
        moVar.fco(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.mml.ud() ? 0 : 120));
        moVar.jl(jSONObject.optBoolean("openPlayableLandingPage", false));
        moVar.lnr(jSONObject.optJSONObject("video"));
        moVar.mml(jSONObject.optJSONObject(d.c.k));
        moVar.hkc(jSONObject.optInt("borderShadowExtent"));
        moVar.bjy(jSONObject.optBoolean("bgGauseBlur"));
        moVar.hzv(jSONObject.optInt("bgGauseBlurRadius"));
        moVar.jtx(jSONObject.optBoolean("showTimeProgress", false));
        moVar.yt(jSONObject.optBoolean("showPlayButton", false));
        moVar.qdl(jSONObject.optDouble("bgColorCg", 0.0d));
        moVar.mo(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        moVar.ud(jSONObject.optInt("borderTopLeftRadius", 0));
        moVar.qdl(jSONObject.optInt("borderTopRightRadius", 0));
        moVar.mml(jSONObject.optInt("borderBottomLeftRadius", 0));
        moVar.lnr(jSONObject.optInt("borderBottomRightRadius", 0));
        moVar.mzz(jSONObject.optJSONObject("interactI18n"));
        moVar.bch(jSONObject.optString("imageObjectFit"));
        moVar.uw(jSONObject.optString("interactTitle"));
        moVar.rc(jSONObject.optInt("interactTextPositionTop"));
        moVar.ljh(jSONObject.optString("imageLottieTosPath"));
        moVar.fs(jSONObject.optBoolean("animationsLoop"));
        moVar.xmv(jSONObject.optInt("lottieAppNameMaxLength"));
        moVar.koa(jSONObject.optInt("lottieAdDescMaxLength"));
        moVar.bqt(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    qdl qdlVar = new qdl();
                    qdlVar.lnr(jSONObject2.optString("animationType"));
                    qdlVar.qdl(jSONObject2.optDouble("animationDuration"));
                    qdlVar.ud(jSONObject2.optDouble("animationScaleX"));
                    qdlVar.lnr(jSONObject2.optDouble("animationScaleY"));
                    qdlVar.mml(jSONObject2.optString("animationTimeFunction"));
                    qdlVar.mml(jSONObject2.optDouble("animationDelay"));
                    qdlVar.mo(jSONObject2.optInt("animationIterationCount"));
                    qdlVar.mzz(jSONObject2.optString("animationDirection"));
                    qdlVar.mzz(jSONObject2.optDouble("animationInterval"));
                    qdlVar.qdl(jSONObject2.optInt("animationBorderWidth"));
                    qdlVar.qdl(jSONObject2.optLong("key"));
                    qdlVar.ud(jSONObject2.optInt("animationEffectWidth"));
                    qdlVar.lnr(jSONObject2.optInt("animationSwing", 1));
                    qdlVar.mml(jSONObject2.optInt("animationTranslateX"));
                    qdlVar.mzz(jSONObject2.optInt("animationTranslateY"));
                    qdlVar.ud(jSONObject2.optString("animationRippleBackgroundColor"));
                    qdlVar.qdl(jSONObject2.optString("animationScaleDirection"));
                    qdlVar.wd(jSONObject2.optInt("animationFadeStart"));
                    qdlVar.jpc(jSONObject2.optInt("animationFadeEnd"));
                    qdlVar.mo(jSONObject2.optString("animationFillMode"));
                    qdlVar.tvp(jSONObject2.optInt("animationBounceHeight"));
                    if (moVar.exc() > 0.0d) {
                        qdlVar.mml(qdlVar.rdp() + moVar.exc());
                    }
                    arrayList.add(qdlVar);
                }
                moVar.qdl(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                moVar.xmv(jSONObject.optString("triggerSlideDirection", "0"));
                moVar.qdl(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return moVar;
    }

    public double aaj() {
        return this.fs;
    }

    public String ag() {
        return this.hkc;
    }

    public String ax() {
        return this.ekw;
    }

    public String bch() {
        return this.jl;
    }

    public float bjy() {
        return this.wd;
    }

    public int blf() {
        return this.lq;
    }

    public boolean bx() {
        return this.hcs;
    }

    public int ca() {
        return this.blf;
    }

    public String car() {
        return this.xi;
    }

    public int cx() {
        return this.mrf;
    }

    public boolean dk() {
        return this.taz;
    }

    public boolean dps() {
        return this.xx;
    }

    public int ekw() {
        return this.xmv;
    }

    public JSONObject en() {
        return this.car;
    }

    public long eta() {
        return this.vr;
    }

    public int ew() {
        return this.fzn;
    }

    public double exc() {
        return this.rq;
    }

    public boolean exu() {
        return this.mzz;
    }

    public double fco() {
        return this.vu;
    }

    public boolean fge() {
        return this.jle;
    }

    public float fs() {
        return this.ud;
    }

    public int fzn() {
        return this.en;
    }

    public int gg() {
        return this.kab;
    }

    public boolean gsp() {
        return this.bx;
    }

    public int gt() {
        return this.ag;
    }

    public String gy() {
        return this.kdv;
    }

    public JSONObject hcs() {
        return this.iw;
    }

    public boolean hd() {
        return this.jnw;
    }

    public int hkc() {
        return this.bqt;
    }

    public boolean hr() {
        return this.jut;
    }

    public double hzv() {
        return this.koa;
    }

    public boolean ijp() {
        return this.tid;
    }

    public int irn() {
        return this.wc;
    }

    public String iw() {
        return this.hd;
    }

    public String ji() {
        return this.qk;
    }

    public int jjk() {
        return this.cx;
    }

    public float jl() {
        return this.to;
    }

    public boolean jle() {
        return this.vc;
    }

    public int jnw() {
        return this.od;
    }

    public double jpc() {
        return this.xdk;
    }

    public float jtx() {
        return this.jpc;
    }

    public int jut() {
        return this.kj;
    }

    public String jyq() {
        return this.bjy;
    }

    public boolean kab() {
        return this.lte;
    }

    public boolean kdv() {
        return this.uw;
    }

    public String kj() {
        return this.nts;
    }

    public String koa() {
        return this.oth;
    }

    public List<qdl> kr() {
        return this.rzg;
    }

    public String ljh() {
        return this.yt;
    }

    public int lme() {
        return this.se;
    }

    public int lnr() {
        return this.gsp;
    }

    public int lq() {
        return this.nz;
    }

    public boolean lte() {
        return this.zlt;
    }

    public boolean mlb() {
        return this.jjk;
    }

    public int mml() {
        return this.ygv;
    }

    public JSONObject mo() {
        return this.syy;
    }

    public String mrf() {
        return this.rc;
    }

    public int mzz() {
        return this.hr;
    }

    public String nts() {
        return this.eta;
    }

    public int nz() {
        return this.mlb;
    }

    public void od() {
        qdl(this, this.dps);
    }

    public boolean om() {
        return this.fco;
    }

    public String oth() {
        return this.jtx;
    }

    public int qk() {
        return this.ijp;
    }

    public int ra() {
        return this.dk;
    }

    public String rc() {
        return this.bch;
    }

    public float rdp() {
        return this.mo;
    }

    public float rq() {
        return this.qdl;
    }

    public String rzg() {
        return this.ra;
    }

    public int se() {
        return this.zpu;
    }

    public int sy() {
        return this.irn;
    }

    public int syy() {
        return this.ji;
    }

    public int taz() {
        return this.wak;
    }

    public int tdy() {
        return this.ew;
    }

    public boolean tid() {
        return this.gt;
    }

    public String to() {
        return this.gsv;
    }

    public int tqd() {
        return this.zy;
    }

    public int tvp() {
        return this.tdy;
    }

    public int ud() {
        return this.ca;
    }

    public String uw() {
        return this.auu;
    }

    public String vc() {
        return this.kr;
    }

    public void vm() {
        qdl(this, this.iw);
    }

    public String vu() {
        return this.ljh;
    }

    public int wak() {
        return this.ax;
    }

    public String wc() {
        return this.hzv;
    }

    public int wd() {
        return this.lme;
    }

    public int xdk() {
        return this.gg;
    }

    public double xi() {
        return this.om;
    }

    public String xmv() {
        return this.exc;
    }

    public int xx() {
        List<qdl> list = this.rzg;
        if (list == null) {
            return 0;
        }
        for (qdl qdlVar : list) {
            if ("translate".equals(qdlVar.tvp()) && qdlVar.wd() < 0) {
                return -qdlVar.wd();
            }
        }
        return 0;
    }

    public int ygv() {
        return this.zvv;
    }

    public int yh() {
        return this.gy;
    }

    public float yt() {
        return this.tvp;
    }

    public boolean zlt() {
        return this.yh;
    }

    public int zpu() {
        return this.vm;
    }

    public String zvv() {
        return this.fge;
    }

    public String zy() {
        return this.sy;
    }

    public void aaj(String str) {
        this.sy = str;
    }

    public void bch(int i2) {
        this.fzn = i2;
    }

    public void bjy(String str) {
        this.kdv = str;
    }

    public String bqt() {
        return this.jyq;
    }

    public void ekw(int i2) {
        this.ew = i2;
    }

    public void exc(String str) {
        this.xi = str;
    }

    public void exu(String str) {
        this.bch = str;
    }

    public void fco(int i2) {
        this.zpu = i2;
    }

    public void fs(String str) {
        this.ljh = str;
    }

    public void hkc(int i2) {
        this.blf = i2;
    }

    public void hzv(int i2) {
        this.zvv = i2;
    }

    public void jl(String str) {
        this.hzv = str;
    }

    public void jpc(float f) {
        this.tvp = f;
    }

    public void jtx(String str) {
        this.ekw = str;
    }

    public void jyq(int i2) {
        this.en = i2;
    }

    public void kdv(int i2) {
        this.ji = i2;
    }

    public void koa(int i2) {
        this.vm = i2;
    }

    public void ljh(int i2) {
        this.kab = i2;
    }

    public void lnr(int i2) {
        this.ygv = i2;
    }

    public void mml(int i2) {
        this.hr = i2;
    }

    public void mo(int i2) {
        this.tdy = i2;
    }

    public void mzz(int i2) {
        this.lme = i2;
    }

    public void oth(int i2) {
        this.nz = i2;
    }

    public void rc(int i2) {
        this.se = i2;
    }

    public void rdp(String str) {
        this.rc = str;
    }

    public void rq(String str) {
        this.oth = str;
    }

    public void to(String str) {
        this.jyq = str;
    }

    public void tvp(float f) {
        this.to = f;
    }

    public void ud(int i2) {
        this.gsp = i2;
    }

    public void uw(int i2) {
        this.lq = i2;
    }

    public void vu(int i2) {
        this.gg = i2;
    }

    public void wd(float f) {
        this.jpc = f;
    }

    public void xmv(int i2) {
        this.kj = i2;
    }

    public void yt(String str) {
        this.hkc = str;
    }

    public void aaj(int i2) {
        this.zy = i2;
    }

    public void bch(String str) {
        this.hd = str;
    }

    public void bjy(int i2) {
        this.wak = i2;
    }

    public void bqt(int i2) {
        this.od = i2;
    }

    public void exc(int i2) {
        this.ijp = i2;
    }

    public void exu(int i2) {
        this.wc = i2;
    }

    public void fs(int i2) {
        this.ag = i2;
    }

    public void jl(int i2) {
        this.dk = i2;
    }

    public void jpc(String str) {
        this.exc = str;
    }

    public void jtx(int i2) {
        this.irn = i2;
    }

    public void jyq(String str) {
        this.ra = str;
    }

    public void ljh(String str) {
        this.fge = str;
    }

    public void lnr(float f) {
        this.lnr = f;
    }

    public void mml(float f) {
        this.mml = f;
    }

    public void mo(float f) {
        this.wd = f;
    }

    public void mzz(float f) {
        this.mo = f;
    }

    public void oth(String str) {
        this.qk = str;
    }

    public void rdp(int i2) {
        this.cx = i2;
    }

    public void rq(int i2) {
        this.ax = i2;
    }

    public void to(int i2) {
        this.gy = i2;
    }

    public void tvp(String str) {
        this.aaj = str;
    }

    public void ud(float f) {
        this.ud = f;
    }

    public void uw(String str) {
        this.nts = str;
    }

    public void wd(String str) {
        this.jl = str;
    }

    public void xmv(String str) {
        this.eta = str;
    }

    public void yt(int i2) {
        this.mlb = i2;
    }

    public void bjy(boolean z2) {
        this.bx = z2;
    }

    public void exu(boolean z2) {
        this.vc = z2;
    }

    public void fs(boolean z2) {
        this.hcs = z2;
    }

    public void jl(boolean z2) {
        this.jle = z2;
    }

    public void jpc(int i2) {
        this.bqt = i2;
    }

    public void jtx(boolean z2) {
        this.jut = z2;
    }

    public void lnr(double d) {
        this.fs = d;
    }

    public void mml(String str) {
        this.bjy = str;
    }

    public void mo(String str) {
        this.yt = str;
    }

    public void mzz(String str) {
        this.jtx = str;
    }

    public void rdp(boolean z2) {
        this.xx = z2;
    }

    public void rq(boolean z2) {
        this.lte = z2;
    }

    public void to(boolean z2) {
        this.tid = z2;
    }

    public void tvp(int i2) {
        this.mrf = i2;
    }

    public void ud(boolean z2) {
        this.mzz = z2;
    }

    public void wd(int i2) {
        this.xmv = i2;
    }

    public void yt(boolean z2) {
        this.jnw = z2;
    }

    public void jpc(boolean z2) {
        this.zlt = z2;
    }

    public void lnr(String str) {
        this.rdp = str;
    }

    public void mml(double d) {
        this.koa = d;
    }

    public void mo(double d) {
        this.om = d;
    }

    public void mzz(double d) {
        this.vu = d;
    }

    public void tvp(boolean z2) {
        this.taz = z2;
    }

    public void ud(double d) {
        this.rq = d;
    }

    public void wd(boolean z2) {
        this.jjk = z2;
    }

    public void lnr(boolean z2) {
        this.uw = z2;
    }

    public void mml(boolean z2) {
        this.fco = z2;
    }

    public void mo(boolean z2) {
        this.gt = z2;
    }

    public void mzz(boolean z2) {
        this.yh = z2;
    }

    public void ud(String str) {
        this.exu = str;
    }

    public void lnr(JSONObject jSONObject) {
        this.dps = jSONObject;
    }

    public void mml(JSONObject jSONObject) {
        this.iw = jSONObject;
    }

    public void mzz(JSONObject jSONObject) {
        this.syy = jSONObject;
    }

    public void ud(JSONObject jSONObject) {
        this.car = jSONObject;
    }

    public boolean qdl() {
        return this.tqd;
    }

    public void qdl(boolean z2) {
        this.tqd = z2;
    }

    public void qdl(int i2) {
        this.ca = i2;
    }

    public void qdl(double d) {
        this.xdk = d;
    }

    public void qdl(String str) {
        this.gsv = str;
    }

    public void qdl(float f) {
        this.qdl = f;
    }

    public void qdl(List<qdl> list) {
        this.rzg = list;
    }

    public void qdl(long j) {
        this.vr = j;
    }

    private void qdl(mo moVar, JSONObject jSONObject) {
        if (moVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    moVar.lnr(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    moVar.bjy(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    moVar.xmv(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    moVar.wd(jSONObject.optString(next));
                    break;
                case "lineCount":
                    moVar.tvp(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    moVar.jl(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    moVar.mo(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    moVar.exu(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    moVar.mo((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    moVar.ud(jSONObject.optString(next));
                    break;
                case "bottom":
                    moVar.ljh(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    moVar.lnr(jSONObject.optString(next));
                    break;
                case "height":
                    moVar.lnr((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    moVar.mml(jSONObject.optString(next));
                    break;
                case "alignItems":
                    moVar.jyq(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    moVar.ud(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    moVar.to(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    moVar.to(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    moVar.qdl(jSONObject.optLong(next));
                    break;
                case "direction":
                    moVar.oth(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    moVar.yt(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    moVar.uw(jSONObject.optInt(next));
                    break;
                case "useTop":
                    moVar.tvp(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    moVar.bjy(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    moVar.bch(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    moVar.ud(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    moVar.mo(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    moVar.exc(jSONObject.optInt(next));
                    break;
                case "useRight":
                    moVar.jpc(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    moVar.rq(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    moVar.mo(jSONObject.optString(next));
                    break;
                case "useLeft":
                    moVar.wd(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    moVar.rq(jSONObject.optString(next));
                    break;
                case "top":
                    moVar.oth(jSONObject.optInt(next));
                    break;
                case "data":
                    moVar.aaj(jSONObject.optString(next));
                    break;
                case "left":
                    moVar.aaj(jSONObject.optInt(next));
                    break;
                case "loop":
                    moVar.qdl(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    moVar.jpc((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    moVar.exc(jSONObject.optString(next));
                    break;
                case "color":
                    moVar.mzz(jSONObject.optString(next));
                    break;
                case "right":
                    moVar.jyq(jSONObject.optInt(next));
                    break;
                case "width":
                    moVar.mml((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    moVar.lnr(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    moVar.mzz((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    moVar.rq(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    moVar.rdp(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    moVar.tvp((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    moVar.jl(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    moVar.vu(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    moVar.wd((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    moVar.jpc(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    moVar.tvp(jSONObject.optString(next));
                    break;
                case "position":
                    moVar.jtx(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    moVar.mzz(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    moVar.exu(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    moVar.yt(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        moVar.wd(jSONObjectOptJSONObject.optInt("translateY", 0));
                        moVar.jpc(jSONObjectOptJSONObject.optInt("translateX", 0));
                        moVar.mml(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        moVar.mzz(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                    break;
                case "lineFeed":
                    moVar.mml(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    moVar.fs(jSONObject.optString(next));
                    break;
                case "interactType":
                    moVar.rdp(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    moVar.qdl((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    moVar.jtx(jSONObject.optString(next));
                    break;
                case "heightMode":
                    moVar.to(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    moVar.jl(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    moVar.ud((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    moVar.fs(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    moVar.rdp(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
