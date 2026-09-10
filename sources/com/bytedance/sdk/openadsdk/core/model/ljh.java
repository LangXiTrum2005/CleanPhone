package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.p004ironsource.x4;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.w5.g;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ljh {
    public static final String lnr;
    public static final String mml;
    protected static int rq;
    public static final String ud;
    private bch aaj;
    private com.bytedance.sdk.openadsdk.core.rq.jpc.qdl ab;
    private String ag;
    private int auu;
    private String ax;
    private com.bytedance.sdk.openadsdk.core.fs.qdl az;
    private String bch;
    private int blf;
    private JSONObject bo;
    private String bow;
    private boolean bqt;
    private qdl bx;
    private String car;
    private String cuk;
    private String cx;
    private koa ddg;
    private String djz;
    private int dsy;
    private boolean ew;
    private String exc;
    public long exu;
    private volatile boolean fc;
    private int fco;
    private String fge;
    private int fh;
    private String fhs;
    private boolean fk;
    private int fpw;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud fzn;
    private boolean gg;
    private String gt;
    private JSONObject guw;
    private jl gy;
    private rdp hcs;
    private int hkc;
    private JSONObject hr;
    private int hzv;
    private com.bytedance.sdk.openadsdk.core.rq.jpc.qdl icv;
    private ekw ign;
    private jpc il;
    private yt ir;
    private String irn;
    private xmv iu;
    private wd jb;
    private String jee;
    private int ji;
    private mzz jl;
    private JSONObject jnw;
    protected int jpc;
    private String jut;
    private int kab;
    private int koa;
    private int kr;
    private boolean kxe;
    private PAGBannerSize lhl;
    private com.bytedance.sdk.openadsdk.core.model.qdl ljh;
    private AdSlot lme;
    private boolean lq;
    private String mlb;
    private jl mrf;
    private String mwc;
    private int nts;
    private boolean nv;
    private long nz;
    private boolean os;
    private String oth;
    private int oz;
    private int pw;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud qk;
    private int ra;
    private String rdz;
    private int rfx;
    private boolean rzg;
    private int se;
    private vu skm;
    private String sy;
    private String syy;
    private exu taz;
    private int tid;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud tqd;
    protected long tvp;
    private boolean ujt;
    private String uw;
    private String uzn;
    private String vc;
    private exc vdl;
    private String vm;
    private int vr;
    private int vxg;
    private boolean vxm;
    private String wak;
    private bjy xh;
    private int xi;
    private rc xil;
    private int xmv;
    private int yfh;
    private JSONObject ygv;
    private String yh;
    private String yk;
    private jyq yre;
    private boolean yt;
    private String yv;
    private mo zlt;
    private Map<String, Object> zvv;
    private long jtx = 0;
    protected boolean qdl = false;
    protected boolean mzz = com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl;
    protected int mo = com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud;
    protected String wd = com.bytedance.sdk.openadsdk.bch.qdl.lnr.lnr;
    private int jyq = -1;
    protected int to = 0;
    private final List<jl> vu = new ArrayList();
    private final List<String> rc = new ArrayList();
    private final List<FilterWord> kdv = new ArrayList();
    private final mrf ekw = mrf.lnr();
    public boolean fs = false;
    private List<String> wc = new ArrayList();
    private List<String> om = new ArrayList();
    private String jjk = "0";
    private String lte = "";
    private int dk = 0;
    private int ijp = 2;
    private int zy = -1;
    private int en = 0;
    private int zpu = 0;
    private int jle = 1;
    private rq xdk = new rq();
    private int dps = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int iw = 0;
    private int xx = 1;
    private int tdy = 0;
    private int ca = 0;
    private int gsp = 0;
    private int hd = 1;
    private int kj = 1;
    private float od = 100.0f;
    private int eta = -1;
    private int gsv = 2;
    private int hvi = 1;
    private int uvi = 0;
    private int xmr = -1;
    private long ugg = -1;
    private int tvf = 0;
    private int uj = Integer.MIN_VALUE;
    private boolean qh = false;
    private int aoy = 0;
    private int xv = 50;
    private int kt = -1;
    private final ud op = new ud();
    private boolean rj = false;
    private com.bytedance.sdk.openadsdk.bch.qdl.ud vz = null;
    protected int rdp = -1;
    protected int bjy = -1;
    private float ok = -1.0f;

    public static class qdl {
        private String exu;
        private String fs;
        private List<Integer> jpc;
        private String lnr;
        private String mml;
        private String mo;
        private String mzz;
        private String qdl;
        private String rdp;
        private String rq;
        private String to;
        private String tvp;
        private String ud;
        private String wd;

        public static com.bytedance.sdk.component.adexpress.qdl.lnr.mml qdl(qdl qdlVar, String str) {
            return com.bytedance.sdk.component.adexpress.qdl.lnr.mml.qdl().qdl(qdlVar.mml()).ud(qdlVar.mzz()).lnr(qdlVar.mo()).mml(qdlVar.wd()).mzz(qdlVar.lnr()).mo(str);
        }

        public static com.bytedance.sdk.openadsdk.core.rq.jpc.qdl ud(qdl qdlVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.rq.jpc.qdl().qdl(qdlVar.mml()).ud(qdlVar.rdp()).lnr(qdlVar.exu()).mml(qdlVar.bjy()).mzz(str);
        }

        public String bjy() {
            return this.rdp;
        }

        public String exu() {
            return this.fs;
        }

        public boolean fs() {
            return !TextUtils.isEmpty(this.to) && this.to.equals(a.k);
        }

        public String jpc() {
            return this.mzz;
        }

        public String lnr() {
            return this.mo;
        }

        public String mml() {
            return this.qdl;
        }

        public String mo() {
            return this.lnr;
        }

        public String mzz() {
            return this.ud;
        }

        public String rdp() {
            return this.exu;
        }

        public String rq() {
            return this.to;
        }

        public String to() {
            return this.rq;
        }

        public String tvp() {
            return this.wd;
        }

        public String wd() {
            return this.mml;
        }

        public void exu(String str) {
            this.rdp = str;
        }

        public void fs(String str) {
            this.exu = str;
        }

        public void jpc(String str) {
            this.wd = str;
        }

        public void lnr(String str) {
            this.qdl = str;
        }

        public void mml(String str) {
            this.ud = str;
        }

        public void mo(String str) {
            this.mml = str;
        }

        public void mzz(String str) {
            this.lnr = str;
        }

        public void rq(String str) {
            this.fs = str;
        }

        public void to(String str) {
            this.to = str;
        }

        public void tvp(String str) {
            this.rq = str;
        }

        public void wd(String str) {
            this.mzz = str;
        }

        public String ud() {
            return this.tvp;
        }

        public List<Integer> qdl() {
            return this.jpc;
        }

        public void ud(String str) {
            this.mo = str;
        }

        public void qdl(List<Integer> list) {
            this.jpc = list;
        }

        public void qdl(String str) {
            this.tvp = str;
        }
    }

    static {
        CharSequence[] charSequenceArr = {"is", gy.vu()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        ud = sb.toString();
        CharSequence[] charSequenceArr2 = {"is", gy.vu(), "sample"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i2 = 1; i2 < 3; i2++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i2]);
        }
        lnr = sb2.toString();
        CharSequence[] charSequenceArr3 = {gy.vu(), com.smartdigimkt.m6.a.r.f36787A};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        sb3.append((CharSequence) "_");
        sb3.append(charSequenceArr3[1]);
        mml = sb3.toString();
        rq = 330;
    }

    public ljh() {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.model.qdl();
        this.ljh = qdlVar;
        qdlVar.qdl(this);
    }

    private com.bytedance.sdk.openadsdk.core.rq.jpc.qdl ku() {
        qdl qdlVarXdk = xdk();
        if (qdlVarXdk == null) {
            return null;
        }
        return qdl.ud(qdlVarXdk, String.valueOf(fz()));
    }

    private com.bytedance.sdk.openadsdk.core.rq.jpc.qdl noo() {
        ekw ekwVarKr = kr();
        if (ekwVarKr == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.rq.jpc.qdl().qdl(ekwVarKr.qdl()).ud(ekwVarKr.ud()).lnr(ekwVarKr.lnr()).mml(ekwVarKr.mml()).mzz(fz() + "_v3");
    }

    public static boolean taz(int i2) {
        return i2 == 44 || i2 == 43 || i2 == 30 || i2 == 40 || i2 == 41 || i2 == 39;
    }

    private static double tvp(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public jyq aaj() {
        return this.yre;
    }

    public int ab() {
        return this.nts;
    }

    public mzz af() {
        return this.jl;
    }

    public int ag() {
        return this.xv;
    }

    public com.bytedance.sdk.openadsdk.core.fs.qdl aoy() {
        return this.az;
    }

    public boolean au() {
        return ji() != null && ji().getDurationSlotType() == 8 && vxm();
    }

    public List<String> auu() {
        return this.rc;
    }

    public boolean ax() {
        return this.os;
    }

    public String az() {
        return this.exc;
    }

    public String bch() {
        return this.jee;
    }

    public boolean bjy() {
        return this.lq;
    }

    public int blf() {
        return this.dps;
    }

    public exu bo() {
        return this.taz;
    }

    public JSONObject bow() {
        return this.hr;
    }

    public String bqt() {
        return this.rdz;
    }

    public int bx() {
        return this.se;
    }

    public String ca() {
        return this.sy;
    }

    public int car() {
        return this.gsv;
    }

    public String cev() {
        JSONObject jSONObjectUzn;
        String strOptString = this.mwc;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectUzn = uzn()) != null) {
            strOptString = jSONObjectUzn.optString("req_id", "");
            ekw(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public void cor() {
        this.ekw.mzz();
        mo(false);
    }

    public void cuk() {
        this.fc = true;
    }

    public boolean cwa() {
        return this.fs;
    }

    public int cx() {
        if (this.kt < 0) {
            try {
                JSONObject jSONObjectUzn = uzn();
                if (jSONObjectUzn != null) {
                    this.kt = jSONObjectUzn.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.kt = 0;
                }
            } catch (Throwable unused) {
                this.kt = 0;
            }
        }
        return this.kt;
    }

    public int ddg() {
        return this.oz;
    }

    public int djz() {
        return this.en;
    }

    public int dk() {
        int i2 = this.hzv;
        if (i2 == 5 || i2 == 6 || i2 == 33) {
            return 1;
        }
        if (au()) {
            return 2;
        }
        return this.ijp;
    }

    public boolean dps() {
        qdl qdlVar = this.bx;
        if (qdlVar != null) {
            return !TextUtils.isEmpty(qdlVar.rq());
        }
        int i2 = this.zpu;
        return i2 == 9 || i2 == 10;
    }

    public Map<String, Object> dsy() {
        return this.zvv;
    }

    public void ekw() {
        this.vxm = true;
    }

    public String en() {
        return this.vm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ljh.class == obj.getClass()) {
            ljh ljhVar = (ljh) obj;
            if (this.jjk.equals(ljhVar.yre()) && this.mlb.equals(ljhVar.ir())) {
                return true;
            }
        }
        return false;
    }

    public List<String> eta() {
        return this.wc;
    }

    public rc eu() {
        return this.xil;
    }

    public String ev() {
        return this.wd;
    }

    public int ew() {
        return this.kr;
    }

    public float ex() {
        float f = this.ok;
        if (f > 0.0f) {
            return f;
        }
        ekw ekwVar = this.ign;
        if (ekwVar != null) {
            String strMml = ekwVar.mml();
            if (TextUtils.isEmpty(strMml)) {
                strMml = com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl("adv3", this.ign.qdl(), this.ign.ud());
            }
            if (strMml != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strMml).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.ok = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.ok = 0.0f;
        return 0.0f;
    }

    public boolean exc() {
        return (TextUtils.isEmpty(yt()) || TextUtils.isEmpty(jl())) ? false : true;
    }

    public boolean exu() {
        return this.bqt;
    }

    public List<FilterWord> fc() {
        return this.kdv;
    }

    public boolean fco() {
        return this.fk;
    }

    public int fge() {
        return this.pw;
    }

    public int fh() {
        return this.rfx;
    }

    public mo fhs() {
        return this.zlt;
    }

    public String fk() {
        return this.fhs;
    }

    public PAGBannerSize fl() {
        return this.lhl;
    }

    public mrf fo() {
        return this.ekw;
    }

    public int fpw() {
        return this.dsy;
    }

    public boolean fs() {
        return this.yt;
    }

    public int fz() {
        JSONObject jSONObjectUzn = uzn();
        if (jSONObjectUzn != null) {
            return jSONObjectUzn.optInt("rit", 0);
        }
        return 0;
    }

    public int fzn() {
        return this.ca;
    }

    public int gg() {
        if (uj()) {
            return 5;
        }
        if (nv() != 100.0f || dk() == 2) {
            return 0;
        }
        return this.iw;
    }

    public koa gjm() {
        return this.ddg;
    }

    public String gsp() {
        return this.irn;
    }

    public String gsv() {
        return this.cx;
    }

    public wd gt() {
        return this.jb;
    }

    public int guw() {
        return this.auu;
    }

    public List<ljh> gxp() {
        return this.ljh.mml();
    }

    public boolean gy() {
        return this.kxe;
    }

    public jl hcs() {
        return this.mrf;
    }

    public int hd() {
        return this.fpw;
    }

    public boolean hkc() {
        return this.vxm;
    }

    public int hoh() {
        return this.jpc;
    }

    public boolean hr() {
        return this.fpw == 1;
    }

    public boolean hrh() {
        bjy bjyVar;
        return uj() && !jwd() && (bjyVar = this.xh) != null && bjyVar.qdl() == 1;
    }

    public String htl() {
        mo moVarFhs = fhs();
        if (moVarFhs == null || TextUtils.isEmpty(moVarFhs.qdl())) {
            return null;
        }
        return moVarFhs.qdl();
    }

    public String hvi() {
        return this.yh;
    }

    public boolean hz() {
        int i2 = this.hzv;
        return (i2 == 2 || i2 == 1) && 3 == this.hkc;
    }

    public void hzv() {
        this.fk = true;
    }

    public int icv() {
        int i2 = this.eta;
        if (i2 >= 0) {
            return i2;
        }
        return 30;
    }

    public int ign() {
        return this.vr;
    }

    public int ijp() {
        return this.zy;
    }

    public int ikv() {
        return this.tvf;
    }

    public com.bytedance.sdk.component.tvp.ud.qdl il() {
        com.bytedance.sdk.component.tvp.ud.qdl qdlVar = new com.bytedance.sdk.component.tvp.ud.qdl();
        qdlVar.qdl(this.blf);
        qdlVar.ud(this.jjk);
        qdlVar.qdl(ir());
        return qdlVar;
    }

    public boolean ilu() {
        return this.rj;
    }

    public boolean ip() {
        return true;
    }

    public String ir() {
        return this.mlb;
    }

    public int irn() {
        wd wdVar = this.jb;
        if (wdVar == null) {
            return 2;
        }
        return wdVar.ud();
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud iu() {
        return this.fzn;
    }

    public int iw() {
        JSONObject jSONObject;
        int i2 = this.uj;
        return (Integer.MIN_VALUE != i2 || (jSONObject = this.guw) == null) ? i2 : jSONObject.optInt("click_trigger_type", 0);
    }

    public int jb() {
        if (this.kj != 2) {
            this.kj = 1;
        }
        return this.kj;
    }

    public String jbc() {
        return this.uzn;
    }

    public boolean jc() {
        xmv xmvVar = this.iu;
        if (xmvVar == null || xmvVar.ud() != 1) {
            return false;
        }
        bch bchVar = this.aaj;
        return bchVar == null || bchVar.qdl() <= 0;
    }

    public boolean jee() {
        if (this.vu.isEmpty()) {
            return false;
        }
        if (this.tid == 4 && this.vu.size() < 3) {
            return false;
        }
        Iterator<jl> it = this.vu.iterator();
        while (it.hasNext()) {
            if (!it.next().mzz()) {
                return false;
            }
        }
        return true;
    }

    public AdSlot ji() {
        return this.lme;
    }

    public long jjk() {
        wd wdVar = this.jb;
        if (wdVar == null) {
            return 0L;
        }
        return wdVar.lnr();
    }

    public String jl() {
        return this.yv;
    }

    public int jle() {
        return this.blf;
    }

    public String jnw() {
        return this.jut;
    }

    public long jpc() {
        return this.jtx;
    }

    public boolean jtx() {
        return this.gg;
    }

    public int jut() {
        return this.ra;
    }

    public boolean jwd() {
        return this.ekw.qdl > 0;
    }

    public jpc jyq() {
        return this.il;
    }

    public boolean jzw() {
        return this.mzz;
    }

    public int ka() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml = mml();
        if (qdlVarMml != null && qdlVarMml.fs() != null) {
            return qdlVarMml.fs().tvp();
        }
        if (ji() != null) {
            strValueOf = ji().getCodeId();
        } else {
            int iFz = fz();
            strValueOf = iFz != 0 ? String.valueOf(iFz) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.yt.mml().rq(strValueOf);
        }
        return 30;
    }

    public int kab() {
        return this.gsp;
    }

    public int kdv() {
        return this.aoy;
    }

    public jl kj() {
        return this.gy;
    }

    public boolean koa() {
        return this.ujt;
    }

    public ekw kr() {
        return this.ign;
    }

    public boolean ks() {
        return vz() == 3 || vz() == 4;
    }

    public boolean kt() {
        return this.fc;
    }

    public int kxe() {
        JSONObject jSONObject = this.bo;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public boolean kz() {
        return this.qdl;
    }

    public int lhl() {
        return this.uvi;
    }

    public boolean ljh() {
        return this.nv;
    }

    public JSONObject lme() {
        return this.guw;
    }

    public int lnr() {
        return this.koa;
    }

    public int lq() {
        return this.xx;
    }

    public int lte() {
        return this.dk;
    }

    public int ly() {
        Map<String, Object> map = this.zvv;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public String mlb() {
        return this.lte;
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl mml() {
        return this.ljh;
    }

    public boolean mo() {
        xmv xmvVar;
        int iTaz = taz();
        if (ax() && vu.lnr(this) && iTaz != 43 && iTaz != 44) {
            return false;
        }
        if (!ax() && taz(iTaz) && (xmvVar = this.iu) != null && xmvVar.qdl() == 1) {
            return false;
        }
        boolean z2 = (iTaz == 33 || iTaz == 5 || iTaz == 6 || iTaz == 19 || iTaz == 12) ? false : true;
        if (uj() || dk() == 2 || !z2 || !com.bytedance.sdk.openadsdk.core.rq.mo.qdl.mml.qdl(gy.lnr(this.xmr))) {
            return dk() == 2 && z2;
        }
        return true;
    }

    public boolean mq() {
        return vz() == 7;
    }

    public int mrf() {
        try {
            JSONObject jSONObjectUzn = uzn();
            if (jSONObjectUzn != null) {
                return jSONObjectUzn.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int mwc() {
        return this.kab;
    }

    public String mzz() {
        int iOk = ok();
        if (iOk == 1) {
            return "banner_ad";
        }
        if (iOk == 3) {
            return "open_ad";
        }
        if (iOk == 5) {
            return "embeded_ad";
        }
        if (iOk != 7) {
            return iOk != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public boolean nln() {
        return this.qh;
    }

    public boolean nni() {
        return vz() == 8;
    }

    public String nts() {
        return this.ag;
    }

    public float nv() {
        if (this.od <= 0.0f) {
            this.od = 100.0f;
        }
        return (this.od * 1000.0f) / 1000.0f;
    }

    public boolean nz() {
        return this.tdy == 1;
    }

    public int oa() {
        return this.mo;
    }

    public String od() {
        return this.ax;
    }

    public int ok() {
        return this.xmr;
    }

    public String om() {
        return this.cuk;
    }

    public String op() {
        return this.gt;
    }

    public JSONObject os() {
        return this.bo;
    }

    public exc oth() {
        return this.vdl;
    }

    public boolean oy() {
        return vz() == 1;
    }

    public String oz() {
        return this.wak;
    }

    public int pw() {
        return this.ji;
    }

    public bch qdl() {
        return this.aaj;
    }

    public int qg() {
        int i2 = this.bjy;
        return i2 >= 0 ? i2 : com.bytedance.sdk.openadsdk.core.yt.mml().to(String.valueOf(fz()));
    }

    public int qgg() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml = mml();
        if (qdlVarMml != null && qdlVarMml.fs() != null) {
            return qdlVarMml.fs().tvp();
        }
        if (ji() != null) {
            strValueOf = ji().getCodeId();
        } else {
            int iFz = fz();
            strValueOf = iFz != 0 ? String.valueOf(iFz) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.yt.mml().exc(strValueOf);
        }
        return 5;
    }

    public boolean qh() {
        return uj() || this.jl != null;
    }

    public int qk() {
        return this.jle;
    }

    public com.bytedance.sdk.openadsdk.bch.qdl.ud qo() {
        return this.vz;
    }

    public boolean qur() {
        int i2 = this.fco;
        return i2 == 44 || i2 == 43;
    }

    public int ra() {
        return this.zpu;
    }

    public xmv raf() {
        return this.iu;
    }

    public com.bytedance.sdk.openadsdk.core.rq.jpc.qdl rc() {
        return this.icv;
    }

    public int rdp() {
        return this.to;
    }

    public JSONObject rdz() {
        return to(true);
    }

    public boolean rfx() {
        return this.ew;
    }

    public int rj() {
        return this.xi;
    }

    public ud rjh() {
        return this.op;
    }

    public int rq() {
        return this.xmv;
    }

    public rq rzg() {
        return this.xdk;
    }

    public boolean se() {
        return this.yfh == 1;
    }

    public String skm() {
        return this.car;
    }

    public int sxp() {
        int i2 = this.jyq;
        if (i2 >= 0) {
            return i2;
        }
        return mq() ? 30 : 5;
    }

    public int sy() {
        return this.hvi;
    }

    public int syy() {
        rdp rdpVar = this.hcs;
        if (rdpVar == null) {
            return 0;
        }
        return rdpVar.qdl();
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud tdy() {
        return this.qk;
    }

    public int tid() {
        return this.fco;
    }

    public String to() {
        return this.uw;
    }

    public String tqd() {
        return this.vc;
    }

    public boolean tu() {
        exc excVar;
        AdSlot adSlot = this.lme;
        if (adSlot == null || (excVar = this.vdl) == null) {
            return false;
        }
        return excVar.qdl(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public boolean tvf() {
        return !uj() && djz() == 1;
    }

    public int ud() {
        wd wdVarGt = gt();
        if (wdVarGt != null) {
            return wdVarGt.qdl();
        }
        return -1;
    }

    public long ugg() {
        return this.nz;
    }

    public long uhv() {
        if (this.ugg < 0) {
            JSONObject jSONObjectUzn = uzn();
            if (jSONObjectUzn != null) {
                this.ugg = jSONObjectUzn.optLong("ad_id", 0L);
            } else {
                this.ugg = 0L;
            }
        }
        return this.ugg;
    }

    public boolean uj() {
        int i2 = this.tvf;
        return (i2 == 1 || i2 == 3) && aoy() != null;
    }

    public JSONObject ujt() {
        JSONObject jSONObject = to(false);
        JSONObject jSONObjectJl = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().jl(String.valueOf(fz()));
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put("creatives", jSONArray);
            jSONObject2.put("did", 1);
            jSONObject2.put("processing_time_ms", 100);
            jSONObject2.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject2.put("s_receive_ts", 1);
            jSONObject2.put("s_send_ts", 1);
            jSONObject2.put("status_code", 20000);
            jSONObject2.put("core_settings", jSONObjectJl);
            return jSONObject2;
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("MaterialMeta", "toJsonObjPlus", e2.getMessage());
            return jSONObject2;
        }
    }

    public int up() {
        return this.bjy;
    }

    public long uv() {
        return this.tvp;
    }

    public String uvi() {
        if (!TextUtils.isEmpty(this.wak)) {
            return this.wak;
        }
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        int iYgv = ygv();
        if (iYgv != 2 && iYgv != 3) {
            if (iYgv == 4) {
                return contextQdl != null ? com.bytedance.sdk.component.utils.ljh.qdl(contextQdl, "tt_video_download_apk") : this.wak;
            }
            if (iYgv != 8) {
                return this.wak;
            }
        }
        return contextQdl != null ? com.bytedance.sdk.component.utils.ljh.qdl(contextQdl, "tt_video_mobile_go_detail") : this.wak;
    }

    public String uw() {
        return this.djz;
    }

    public JSONObject uzn() {
        if (this.jnw == null) {
            try {
                if (!TextUtils.isEmpty(this.mlb)) {
                    this.jnw = new JSONObject(this.mlb);
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.aaj.lnr("MaterialMeta", e2.getMessage());
            }
        }
        return this.jnw;
    }

    public int vc() {
        return this.yfh;
    }

    public boolean vdl() {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar = this.qk;
        return udVar == null || udVar.exc() != 1;
    }

    public boolean vg() {
        bch bchVar = this.aaj;
        return bchVar != null && bchVar.qdl() > 0;
    }

    public List<jl> vm() {
        return this.vu;
    }

    public List<String> vr() {
        return this.om;
    }

    public com.bytedance.sdk.openadsdk.core.rq.jpc.qdl vu() {
        return this.ab;
    }

    public int vxg() {
        return this.tid;
    }

    public boolean vxm() {
        return this.tvf == 2;
    }

    public int vz() {
        if (this.xmr < 0) {
            JSONObject jSONObjectUzn = uzn();
            if (jSONObjectUzn != null) {
                this.xmr = jSONObjectUzn.optInt("ad_slot_type", 0);
            } else {
                this.xmr = 0;
            }
        }
        return this.xmr;
    }

    public void wak() {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar = this.qk;
        if (udVar == null || TextUtils.isEmpty(udVar.fs())) {
            return;
        }
        try {
            if (!this.qk.fs().contains("style_id")) {
                this.ujt = false;
            } else {
                this.ujt = true;
                this.rdz = Uri.parse(this.qk.fs()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
        }
    }

    public long wb() {
        return this.exu;
    }

    public String wc() {
        JSONObject jSONObjectUzn;
        if (this.yk == null && (jSONObjectUzn = uzn()) != null) {
            this.yk = jSONObjectUzn.optString("cid", "");
        }
        return this.yk;
    }

    public String wd() {
        uw uwVarFs;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml = mml();
        if (qdlVarMml == null || (uwVarFs = qdlVarMml.fs()) == null) {
            return null;
        }
        return uwVarFs.wd();
    }

    public int ws() {
        int i2 = this.rdp;
        return i2 >= 0 ? i2 : com.bytedance.sdk.openadsdk.core.yt.mml().exc(String.valueOf(fz()));
    }

    public double wsn() {
        return tvp(uzn());
    }

    public void wxg() {
        if (!TextUtils.isEmpty(tqd())) {
            rdp("0");
        }
        Map<String, Object> mapDsy = dsy();
        if (mapDsy == null || !mapDsy.containsKey("price")) {
            return;
        }
        mapDsy.put("price", "0");
    }

    public boolean xa() {
        return vz() == 5;
    }

    public qdl xdk() {
        return this.bx;
    }

    public JSONObject xh() {
        return this.ygv;
    }

    public int xi() {
        if (xmv()) {
            return 5;
        }
        return vxm() ? 4 : 1;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud xil() {
        return this.tqd;
    }

    public String xmr() {
        return this.fge;
    }

    public boolean xmv() {
        List<Integer> listQdl;
        return (xdk() == null || (listQdl = xdk().qdl()) == null || !listQdl.contains(57)) ? false : true;
    }

    public yt xv() {
        return this.ir;
    }

    public com.bytedance.sdk.component.adexpress.qdl.lnr.mml xx() {
        qdl qdlVarXdk = xdk();
        if (qdlVarXdk == null) {
            return null;
        }
        return qdl.qdl(qdlVarXdk, String.valueOf(fz()));
    }

    public bjy yfh() {
        return this.xh;
    }

    public int ygv() {
        return this.hkc;
    }

    public boolean yh() {
        if (this.xmr <= 0) {
            this.xmr = vz();
        }
        int i2 = this.xmr;
        return (i2 == 7 || i2 == 8) && !mzz(this) && tid() != 21 && this.fh == 1;
    }

    public boolean yk() {
        return this.vxg == 1;
    }

    public String yot() {
        return this.oth;
    }

    public String yre() {
        return this.jjk;
    }

    public String yt() {
        return this.bow;
    }

    public String yv() {
        return this.syy;
    }

    public vu zlt() {
        return this.skm;
    }

    public mml zm() {
        mml mmlVarRdp;
        mzz mzzVar = this.jl;
        if (mzzVar != null) {
            mmlVarRdp = mzzVar.lnr();
        } else {
            com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar = this.az;
            mmlVarRdp = qdlVar != null ? qdlVar.rdp() : null;
        }
        if (mmlVarRdp != null) {
            mmlVarRdp.qdl(this);
        }
        return mmlVarRdp;
    }

    public boolean zpu() {
        return jut() == 100 || this.hzv == 20;
    }

    public int zvv() {
        return this.hd;
    }

    public int zy() {
        return this.tdy;
    }

    private static long jpc(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static boolean lnr(ljh ljhVar) {
        return (ljhVar == null || ljhVar.tdy() == null || ljhVar.tdy().mml() != 7 || vu.ud(ljhVar)) ? false : true;
    }

    public static boolean mml(ljh ljhVar) {
        return (ljhVar == null || ljhVar.tdy() == null || ljhVar.tdy().qdl() != 1) ? false : true;
    }

    public void aaj(int i2) {
        this.dps = i2;
    }

    public void ag(int i2) {
        this.rfx = Math.max(0, i2);
    }

    public void ax(int i2) {
        this.vxg = i2;
    }

    public void bch(int i2) {
        this.blf = i2;
    }

    public void bjy(int i2) {
        this.jle = i2;
    }

    public void bqt(int i2) {
        this.yfh = i2;
    }

    public void ekw(int i2) {
        this.en = i2;
    }

    public void exc(int i2) {
        this.kr = i2;
    }

    public void exu(String str) {
        this.vm = str;
    }

    public void fco(int i2) {
        this.jyq = i2;
    }

    public void fs(String str) {
        this.lte = str;
    }

    public void gt(int i2) {
        this.tvf = i2;
    }

    public void gy(int i2) {
        this.auu = i2;
    }

    public void hkc(int i2) {
        this.nts = i2;
    }

    public void hzv(int i2) {
        this.eta = i2;
    }

    public void irn(int i2) {
        this.jpc = i2;
    }

    public void jjk(int i2) {
        this.rdp = i2;
    }

    public void jl(int i2) {
        this.iw = i2;
    }

    public void jtx(int i2) {
        this.ca = i2;
    }

    public void jyq(int i2) {
        this.hd = i2;
    }

    public void kdv(int i2) {
        this.kj = i2;
    }

    public void koa(int i2) {
        this.pw = i2;
    }

    public void ljh(int i2) {
        this.ra = i2;
    }

    public void om(int i2) {
        this.ji = i2;
    }

    public void oth(int i2) {
        this.se = i2;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        if (qdlVar != null) {
            this.ljh = qdlVar;
        }
    }

    public void rc(int i2) {
        this.kab = i2;
    }

    public void rdp(int i2) {
        this.zpu = i2;
    }

    public void rq(String str) {
        this.cuk = str;
    }

    public int taz() {
        return this.hzv;
    }

    public void to(String str) {
        this.djz = str;
    }

    public String tvp() {
        return this.bch;
    }

    public void uw(int i2) {
        this.fpw = i2;
    }

    public void vu(int i2) {
        this.tid = i2;
    }

    public void yt(int i2) {
        this.xx = i2;
    }

    public void zlt(int i2) {
        this.bjy = i2;
    }

    public static JSONObject lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("MaterialMeta", e2.getMessage());
            return null;
        }
    }

    private String mrf(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.jtx.qdl(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    public static boolean ud(ljh ljhVar) {
        return (qdl(ljhVar) || lnr(ljhVar)) ? false : true;
    }

    public void aaj(String str) {
        this.cx = str;
    }

    public void bch(String str) {
        this.car = str;
    }

    public void bjy(String str) {
        this.jut = str;
    }

    public void bqt(String str) {
        this.fge = str;
    }

    public void ekw(String str) {
        this.mwc = str;
    }

    public void exc(String str) {
        this.ag = str;
    }

    public void exu(int i2) {
        this.gsp = i2;
    }

    public void fco(String str) {
        this.oth = str;
    }

    public void fs(int i2) {
        this.tdy = i2;
    }

    public void hkc(String str) {
        this.uzn = str;
    }

    public void hzv(String str) {
        if (TextUtils.isEmpty(str)) {
            this.wd = com.bytedance.sdk.openadsdk.bch.qdl.lnr.lnr;
        } else {
            this.wd = str;
        }
    }

    public void jl(String str) {
        this.ax = str;
    }

    public void jpc(String str) {
        this.yv = str;
    }

    public void jtx(String str) {
        this.sy = str;
    }

    public void jyq(String str) {
        this.yh = str;
    }

    public String kdv(String str) {
        JSONObject jSONObjectUzn = uzn();
        return jSONObjectUzn != null ? jSONObjectUzn.optString("rit", str) : str;
    }

    public void koa(String str) {
        this.syy = str;
    }

    public void ljh(String str) {
        this.jjk = str;
    }

    public void oth(String str) {
        this.wak = str;
    }

    public void qdl(int i2) {
        this.koa = i2;
    }

    public void rc(String str) {
        this.gt = str;
    }

    public void rdp(String str) {
        this.vc = str;
    }

    public void rq(int i2) {
        this.ijp = i2;
    }

    public void to(int i2) {
        this.zy = i2;
    }

    public void tvp(String str) {
        this.jee = str;
    }

    public void uw(String str) {
        this.exc = str;
    }

    public void vu(String str) {
        this.fhs = str;
    }

    public void xi(int i2) {
        if (i2 < 0 || i2 > 30) {
            i2 = 6;
        }
        this.mo = i2;
    }

    public void yt(String str) {
        this.irn = str;
    }

    public static int mml(String str) {
        return qdl(lnr(str));
    }

    public static double ud(String str) {
        return tvp(lnr(str));
    }

    public static boolean wd(ljh ljhVar) {
        Object obj;
        if (ljhVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapDsy = ljhVar.dsy();
            return (mapDsy == null || (obj = mapDsy.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void bjy(boolean z2) {
        this.mzz = z2;
    }

    public void exu(boolean z2) {
        this.qdl = z2;
    }

    public void fs(boolean z2) {
        this.qh = z2;
    }

    public void jpc(boolean z2) {
        this.os = z2;
    }

    public void qdl(long j) {
        this.jtx = j;
    }

    public void rdp(boolean z2) {
        this.rj = z2;
    }

    public void rq(boolean z2) {
        this.fs = z2;
    }

    public JSONObject to(boolean z2) {
        JSONObject jSONObjectMzz;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (z2) {
            try {
                jSONObject2.put("raw_response_info", jbc());
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("interaction_type", ygv());
        jSONObject2.put("iv_skip_time", this.rdp);
        jSONObject2.put("rv_skip_time", this.bjy);
        jSONObject2.put(lnr, hd());
        jSONObject2.put("interaction_method", tid());
        jSONObject2.put("lp_click_type", hoh());
        jSONObject2.put("lp_click_interval", uv());
        jSONObject2.put("proportion_watching", ijp());
        jSONObject2.put(ud, vc());
        jSONObject2.put(mml, fge());
        jSONObject2.put("target_url", od());
        jSONObject2.put("app_log_url", skm());
        jSONObject2.put("settings_url", this.exc);
        jSONObject2.put("gecko_id", xmr());
        jSONObject2.put("extension", os());
        jSONObject2.put("ad_id", yre());
        jSONObject2.put("source", ca());
        jSONObject2.put("app_name", gsp());
        jSONObject2.put("screenshot", rfx());
        jSONObject2.put("dislike_control", djz());
        jSONObject2.put("play_bar_show_time", blf());
        jSONObject2.put("play_bar_style", gg());
        jSONObject2.put("if_block_lp", zy());
        jSONObject2.put("cache_sort", zvv());
        jSONObject2.put("if_sp_cache", bx());
        jSONObject2.put("render_control", dk());
        jSONObject2.put("mrc_report", this.vxg);
        jSONObject2.put("isMrcReportFinish", this.fc);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("cta", car());
        jSONObject3.put(x4.DEFAULT_AUCTION_FALLBACK_VALUE, sy());
        jSONObject2.put("set_click_type", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("reward_name", mlb());
        jSONObject4.put("reward_amount", lte());
        jSONObject2.put("reward_data", jSONObject4);
        if (!TextUtils.isEmpty(yt()) && !TextUtils.isEmpty(jl())) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("adchoices_icon", yt());
            jSONObject5.put("adchoices_url", jl());
            jSONObject2.put("dsp_adchoices", jSONObject5);
        }
        jl jlVarHcs = hcs();
        if (jlVarHcs != null && !TextUtils.isEmpty(jlVarHcs.qdl())) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("url", jlVarHcs.qdl());
            jSONObject6.put("height", jlVarHcs.lnr());
            jSONObject6.put("width", jlVarHcs.ud());
            jSONObject2.put("icon", jSONObject6);
        }
        jl jlVarKj = kj();
        if (jlVarKj != null && !TextUtils.isEmpty(jlVarKj.qdl())) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("url", jlVarKj.qdl());
            jSONObject7.put("height", jlVarKj.lnr());
            jSONObject7.put("width", jlVarKj.ud());
            jSONObject2.put("cover_image", jSONObject7);
        }
        JSONObject jSONObjectXh = xh();
        if (jSONObjectXh != null) {
            jSONObject2.put("session_params", jSONObjectXh);
        }
        JSONObject jSONObjectBow = bow();
        if (jSONObjectBow != null) {
            jSONObject2.put("dynamic_configs", jSONObjectBow);
        }
        rq rqVarRzg = rzg();
        if (rqVarRzg != null) {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("click_upper_content_area", rqVarRzg.qdl);
            jSONObject8.put("click_upper_non_content_area", rqVarRzg.ud);
            jSONObject8.put("click_lower_content_area", rqVarRzg.lnr);
            jSONObject8.put("click_lower_non_content_area", rqVarRzg.mml);
            jSONObject8.put("click_button_area", rqVarRzg.mzz);
            jSONObject8.put("click_video_area", rqVarRzg.mo);
            jSONObject2.put(g.a.g, jSONObject8);
        }
        jpc jpcVarJyq = jyq();
        if (jpcVarJyq != null) {
            jSONObject2.put("arbitrage_interceptor_params", jpcVarJyq.jpc());
        }
        AdSlot adSlotJi = ji();
        if (adSlotJi != null) {
            jSONObject2.put("adslot", adSlotJi.toJsonObj());
        }
        qdl(this, jSONObject2);
        List<String> listEta = eta();
        if (listEta != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = listEta.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject2.put("show_url", jSONArray);
        }
        List<String> listVr = vr();
        if (listVr != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = listVr.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject2.put("click_url", jSONArray2);
        }
        List<String> listAuu = auu();
        if (listAuu != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it3 = listAuu.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject2.put(com.smartdigimkt.m6.a.r.f, jSONArray3);
        }
        jSONObject2.put("phone_num", nts());
        jSONObject2.put("title", gsv());
        jSONObject2.put("description", hvi());
        jSONObject2.put("ext", ir());
        jSONObject2.put("image_mode", vxg());
        jSONObject2.put("cover_click_area", jut());
        jSONObject2.put("intercept_flag", ew());
        jSONObject2.put("button_text", uvi());
        jSONObject2.put("ad_logo", lq());
        jSONObject2.put("video_adaptation", fzn());
        jSONObject2.put("feed_video_opentype", kab());
        jSONObject2.put("orientation", jb());
        jSONObject2.put("aspect_ratio", nv());
        ud(this, jSONObject2);
        exu exuVarBo = bo();
        if (exuVarBo != null) {
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("deeplink_url", exuVarBo.qdl());
            jSONObject9.put("fallback_url", exuVarBo.ud());
            jSONObject9.put("fallback_type", exuVarBo.lnr());
            jSONObject2.put("deep_link", jSONObject9);
        }
        jSONObject2.put("is_web_jump_ip", this.to);
        koa koaVarGjm = gjm();
        if (koaVarGjm != null && (jSONObject = koaVarGjm.to()) != null) {
            jSONObject2.put("oem", jSONObject);
        }
        xmv xmvVarRaf = raf();
        if (xmvVarRaf != null && (jSONObjectMzz = xmvVarRaf.mzz()) != null) {
            jSONObject2.put("multi_ad_scene", jSONObjectMzz);
        }
        List<FilterWord> listFc = fc();
        if (listFc != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<FilterWord> it4 = listFc.iterator();
            while (it4.hasNext()) {
                JSONObject jSONObjectUd = ud(it4.next());
                if (jSONObjectUd != null) {
                    jSONArray4.put(jSONObjectUd);
                }
            }
            jSONObject2.put("filter_words", jSONArray4);
        }
        zlt().qdl(jSONObject2);
        jSONObject2.put("count_down", mwc());
        jSONObject2.put("expiration_time", ugg());
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarIu = iu();
        if (udVarIu != null) {
            jSONObject2.put("video", udVarIu.jl());
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarXil = xil();
        if (udVarXil != null) {
            jSONObject2.put("h265_video", udVarXil.jl());
        }
        jSONObject2.put("video_encode_type", ddg());
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put("if_send_click", syy());
        jSONObject2.put("download_conf", jSONObject10);
        if (dsy() != null) {
            JSONObject jSONObject11 = new JSONObject();
            Set<Map.Entry<String, Object>> setEntrySet = dsy().entrySet();
            if (!setEntrySet.isEmpty()) {
                for (Map.Entry<String, Object> entry : setEntrySet) {
                    jSONObject11.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put("media_ext", jSONObject11);
        }
        qdl qdlVarXdk = xdk();
        if (qdlVarXdk != null) {
            JSONObject jSONObject12 = new JSONObject();
            jSONObject12.put("id", qdlVarXdk.mml());
            jSONObject12.put("md5", qdlVarXdk.mzz());
            jSONObject12.put("url", qdlVarXdk.mo());
            jSONObject12.put("data", qdlVarXdk.wd());
            jSONObject12.put("diff_data", qdlVarXdk.jpc());
            jSONObject12.put("version", qdlVarXdk.lnr());
            jSONObject12.put("dynamic_creative", qdlVarXdk.tvp());
            jSONObject12.put("engine_version", qdlVarXdk.rq());
            jSONObject12.put("ugen_data", qdlVarXdk.bjy());
            jSONObject12.put("ugen_md5", qdlVarXdk.rdp());
            jSONObject12.put("ugen_url", qdlVarXdk.exu());
            jSONObject2.put("tpl_info", jSONObject12);
        }
        ekw ekwVar = this.ign;
        if (ekwVar != null) {
            jSONObject2.put("tpl_info_v3", ekwVar.wd());
        }
        jSONObject2.put("dynamic_creative", lme());
        jSONObject2.put("creative_extra", jnw());
        jSONObject2.put("market_url", yv());
        jSONObject2.put("auction_price", tqd());
        jSONObject2.put("ad_info", en());
        jSONObject2.put("is_package_open", ab());
        jSONObject2.put("playable_duration_time", icv());
        jSONObject2.put("playable_endcard_close_time", ign());
        jSONObject2.put("endcard_close_time", guw());
        JSONObject jSONObject13 = new JSONObject();
        jSONObject13.put("render_sequence", ra());
        jSONObject13.put("backup_render_control", qk());
        jSONObject13.put("reserve_time", fh());
        jSONObject13.put("render_thread", fpw());
        jSONObject2.put("render", jSONObject13);
        if (this.yre == null) {
            jyq jyqVar = new jyq();
            this.yre = jyqVar;
            jyqVar.qdl("");
            this.yre.qdl(10L);
            this.yre.ud(20L);
            this.yre.lnr(10L);
            this.yre.mml(20L);
        }
        JSONObject jSONObject14 = new JSONObject();
        jSONObject14.put("onlylp_loading_maxtime", this.yre.qdl());
        jSONObject14.put("straight_lp_showtime", this.yre.ud());
        jSONObject14.put("onlyagg_loading_maxtime", this.yre.lnr());
        jSONObject14.put("straight_agg_showtime", this.yre.mml());
        jSONObject14.put("loading_text", this.yre.mzz());
        exc excVar = this.vdl;
        if (excVar != null) {
            jSONObject14 = excVar.qdl(jSONObject14);
        }
        jSONObject2.put("interaction_method_params", jSONObject14);
        JSONObject jSONObject15 = new JSONObject();
        jSONObject15.put("splash_clickarea", irn());
        jSONObject15.put("splash_layout_id", xi());
        jSONObject15.put("load_wait_time", jjk());
        wd wdVar = this.jb;
        jSONObject15.put("skip_time", wdVar != null ? wdVar.qdl() : 0);
        jSONObject2.put("splash_control", jSONObject15);
        if (vxm()) {
            jSONObject2.put("dsp_html", this.fhs);
        }
        if (uj()) {
            jSONObject2.put("vast_json", this.az.to());
        }
        jSONObject2.put("dsp_material_type", ikv());
        jSONObject2.put("deep_link_appname", this.gt);
        jSONObject2.put("landing_page_download_clicktype", this.xi);
        bjy bjyVar = this.xh;
        if (bjyVar != null) {
            jSONObject2.put("dsp_style", bjyVar.lnr());
        }
        jSONObject2.put("identificationOverlayContent", this.djz);
        if (this.ab != null) {
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put("endcard", this.ab.qdl(this.icv));
            jSONObject2.put("ugen", jSONObject16);
        }
        jSONObject2.put("preload_h5_type", kdv());
        jSONObject2.put("hasReportShow", this.kxe);
        jSONObject2.put("endcard_creative", this.cuk);
        jSONObject2.put("image_stay", this.fh);
        jSONObject2.put("ad_label", this.op.mo());
        JSONObject jSONObject17 = new JSONObject();
        jSONObject17.put(com.p004ironsource.mediationsdk.metadata.a.j, this.mzz);
        jSONObject17.put("wait_time", this.mo);
        jSONObject17.put("label", this.wd);
        jSONObject2.put("ev", jSONObject17);
        jSONObject2.put("ad_label", this.op.mo());
        if (this.lhl != null) {
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put("width", this.lhl.getWidth());
            jSONObject18.put("height", this.lhl.getHeight());
            jSONObject2.put("banner", jSONObject18);
        }
        if (!TextUtils.isEmpty(this.jee)) {
            jSONObject2.put("gdid_encrypted", this.jee);
        }
        mzz mzzVar = this.jl;
        if (mzzVar != null) {
            jSONObject2.put("ad_tracks", mzzVar.ud());
        }
        bch bchVar = this.aaj;
        if (bchVar != null) {
            jSONObject2.put("popup", bchVar.mml());
        }
        jSONObject2.put("playable_close_time", this.jyq);
        return jSONObject2;
    }

    public void tvp(int i2) {
        this.dk = i2;
    }

    public void xmv(int i2) {
        this.hkc = i2;
    }

    public static boolean qdl(ljh ljhVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (qdl(ljhVar) || z5 || ljhVar == null || ljhVar.tdy() == null || TextUtils.isEmpty(ljhVar.tdy().fs())) {
            return false;
        }
        if (lnr(ljhVar)) {
            return z4;
        }
        return (ljhVar.tdy() == null || ljhVar.tdy().qdl() != 1) ? z2 : z3;
    }

    public void jpc(int i2) {
        this.hzv = i2;
    }

    public void mml(boolean z2) {
        this.gg = z2;
    }

    public void tvp(boolean z2) {
        this.ew = z2;
    }

    public void wc(int i2) {
        this.dsy = i2;
    }

    public void xmv(String str) {
        this.mlb = str;
    }

    public static String ud(Context context, ljh ljhVar) {
        if (context != null && ljhVar != null) {
            try {
                if (ljhVar.ygv() != 8) {
                    if (ljhVar.jyq().qdl()) {
                    }
                }
                String strQdl = com.bytedance.sdk.openadsdk.core.qdl.qdl.qdl(context);
                if (TextUtils.isEmpty(strQdl)) {
                    return null;
                }
                return strQdl;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public void lnr(int i2) {
        this.to = i2;
    }

    public void mml(int i2) {
        this.aoy = i2;
    }

    public void mrf(int i2) {
        this.vr = i2;
    }

    public void yh(int i2) {
        this.oz = i2;
    }

    public static boolean mo(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        int iVxg = ljhVar.vxg();
        return iVxg == 5 || iVxg == 15 || iVxg == 50;
    }

    public void cx(int i2) {
        this.uvi = i2;
    }

    public void lnr(boolean z2) {
        this.lq = z2;
    }

    public void mml(JSONObject jSONObject) {
        this.hr = jSONObject;
    }

    public static boolean mzz(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        int iVxg = ljhVar.vxg();
        return ljhVar.uj() || iVxg == 5 || iVxg == 15 || iVxg == 50;
    }

    public void lnr(jl jlVar) {
        this.vu.add(jlVar);
    }

    public void mml(long j) {
        this.tvp = j;
    }

    public void mo(String str) {
        this.uw = str;
    }

    public void wak(int i2) {
        this.xi = i2;
    }

    public void wd(String str) {
        this.bow = str;
    }

    public static boolean qdl(ljh ljhVar) {
        return (ljhVar == null || ljhVar.tdy() == null || ljhVar.tdy().mml() != 1) ? false : true;
    }

    public void lnr(JSONObject jSONObject) {
        this.ygv = jSONObject;
    }

    public void mo(boolean z2) {
        this.nv = z2;
    }

    public void wd(boolean z2) {
        this.kxe = z2;
    }

    public static com.bytedance.sdk.openadsdk.core.exu.qdl.ud qdl(String str, ljh ljhVar) {
        ljhVar.cx(0);
        int iVz = ljhVar.vz();
        int i2 = 3;
        if (iVz == 3) {
            i2 = 4;
        } else if (iVz == 7) {
            i2 = 1;
        } else if (iVz == 8) {
            i2 = 2;
        }
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVar = new com.bytedance.sdk.openadsdk.core.exu.qdl.ud(str, ljhVar.iu(), ljhVar.xil(), ljhVar.lhl(), ljhVar.ddg(), i2);
        udVar.qdl(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("video_error_conf", 0));
        return udVar;
    }

    public void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar) {
        this.tqd = udVar;
    }

    public void mo(int i2) {
        this.fh = i2;
    }

    public void mzz(String str) {
        this.bch = str;
    }

    public void ud(int i2) {
        this.xmv = i2;
    }

    public void wd(int i2) {
        qdl(i2, -1);
    }

    public void lnr(long j) {
        this.exu = j;
    }

    public void mo(JSONObject jSONObject) {
        this.bo = jSONObject;
    }

    public void mzz(boolean z2) {
        this.rzg = z2;
    }

    public void ud(boolean z2) {
        this.bqt = z2;
    }

    public void wd(JSONObject jSONObject) {
        this.op.qdl(jSONObject);
    }

    public void mzz(int i2) {
        this.xv = i2;
    }

    public void ud(com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVar) {
        this.icv = qdlVar;
        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(qdlVar, "endcard");
    }

    public void mzz(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.hkc = 4;
        this.jjk = jSONObject.optString("id");
        this.sy = jSONObject.optString("source");
        mo moVar = new mo();
        this.zlt = moVar;
        moVar.lnr(jSONObject.optString("pkg_name"));
        this.zlt.ud(jSONObject.optString("name"));
        this.zlt.qdl(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public static long qdl(String str) {
        return jpc(lnr(str));
    }

    public void ud(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.gsv = 2;
        } else {
            this.gsv = (int) d;
        }
    }

    public static int qdl(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void ud(JSONObject jSONObject) {
        this.guw = jSONObject;
    }

    public static String qdl(Context context, ljh ljhVar) {
        if (context == null || ljhVar == null || !((ljhVar.vz() == 8 || ljhVar.vz() == 7) && ljhVar.zpu())) {
            return null;
        }
        String strUd = ud(context, ljhVar);
        if (TextUtils.isEmpty(strUd) || com.bytedance.sdk.openadsdk.core.qdl.qdl.qdl() != 1) {
            return null;
        }
        return strUd;
    }

    public void ud(jl jlVar) {
        this.gy = jlVar;
    }

    public void ud(long j) {
        this.nz = j;
    }

    private JSONObject ud(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(ud(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void qdl(boolean z2) {
        this.yt = z2;
    }

    public void qdl(jpc jpcVar) {
        this.il = jpcVar;
    }

    public void qdl(jyq jyqVar) {
        this.yre = jyqVar;
    }

    public void qdl(exc excVar) {
        this.vdl = excVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVar) {
        this.ab = qdlVar;
        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(qdlVar, "endcard");
    }

    public void qdl(wd wdVar) {
        this.jb = wdVar;
    }

    public void qdl(vu vuVar) {
        this.skm = vuVar;
    }

    public void qdl(int i2, int i3) {
        this.fco = i2;
        this.hzv = i2;
        if (this.lme == null) {
            this.hzv = 0;
            return;
        }
        if (i3 <= 0) {
            i3 = vz();
        }
        if (this.lme.getDurationSlotType() != 3 && i3 != 3) {
            if (this.lme.getDurationSlotType() != 7 && this.lme.getDurationSlotType() != 8 && i3 != 7 && i3 != 8) {
                if (!this.os && vu.ud(this)) {
                    this.hzv = 4;
                    return;
                }
                if (this.fco == 4 && !vu.ud(this)) {
                    this.hzv = 0;
                }
                int i4 = this.fco;
                if (i4 == 41) {
                    this.hzv = 41;
                    return;
                }
                if (i2 >= 5) {
                    this.hzv = 0;
                    return;
                }
                if (i4 == 2 && ygv() != 3) {
                    this.hzv = 0;
                    return;
                } else {
                    if (i2 == 0 || (i2 == 1 && ygv() != 3)) {
                        this.hzv = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.os) {
                if (vu.lnr(this)) {
                    this.hzv = 12;
                    return;
                } else if (vu.ud(this)) {
                    this.hzv = 9;
                    return;
                }
            }
            if (this.fco == 5 && !aaj.mml(this)) {
                this.hzv = 7;
            }
            if (this.fco == 6 && !aaj.ud(this)) {
                this.hzv = 7;
            }
            if (this.fco == 8 && jut() != 100) {
                this.hzv = 7;
            }
            if (this.fco == 19 && TextUtils.isEmpty(this.ax)) {
                this.hzv = 7;
            }
            if (this.fco == 20 && TextUtils.isEmpty(this.ax)) {
                this.hzv = 7;
            }
            if (this.fco == 38 && !aaj.lnr(this)) {
                this.hzv = 7;
            }
            if (i2 < 5) {
                this.hzv = 7;
                return;
            }
            return;
        }
        this.hzv = 14;
    }

    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar) {
        this.fzn = udVar;
    }

    public static void ud(ljh ljhVar, JSONObject jSONObject) throws JSONException {
        mo moVarFhs = ljhVar.fhs();
        if (moVarFhs != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", moVarFhs.ud());
            jSONObject2.put("package_name", moVarFhs.lnr());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, moVarFhs.qdl());
            jSONObject2.put("score", moVarFhs.mml());
            jSONObject2.put("comment_num", moVarFhs.mzz());
            jSONObject2.put("app_size", moVarFhs.mo());
            jSONObject2.put("app_category", moVarFhs.wd());
            jSONObject.put("app", jSONObject2);
        }
    }

    public void qdl(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.hvi = 1;
        } else {
            this.hvi = (int) d;
        }
    }

    public void qdl(rq rqVar) {
        this.xdk = rqVar;
    }

    public void qdl(AdSlot adSlot) {
        this.lme = adSlot;
    }

    public void qdl(qdl qdlVar) {
        this.bx = qdlVar;
        com.bytedance.sdk.component.adexpress.qdl.lnr.mml mmlVarXx = xx();
        if (mmlVarXx != null && !dps()) {
            com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(mmlVarXx);
        }
        if (qdlVar == null || TextUtils.isEmpty(qdlVar.exu())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(ku(), "ad");
    }

    public void qdl(ekw ekwVar) {
        this.ign = ekwVar;
        if (ekwVar == null || TextUtils.isEmpty(ekwVar.lnr())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(noo(), "adv3");
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar) {
        this.qk = udVar;
    }

    public void qdl(rdp rdpVar) {
        this.hcs = rdpVar;
    }

    public void qdl(jl jlVar) {
        qdl(jlVar, rq);
        String strMrf = mrf(jlVar.qdl());
        if (!TextUtils.isEmpty(strMrf)) {
            jlVar.ud(strMrf);
        }
        this.mrf = jlVar;
    }

    private void qdl(jl jlVar, int i2) {
        if (jlVar != null) {
            try {
                if (TextUtils.isEmpty(jlVar.qdl())) {
                    return;
                }
                if (jlVar.ud() == 0 && jlVar.lnr() == 0) {
                    jlVar.qdl(i2);
                    jlVar.ud(i2);
                    return;
                }
                if (jlVar.ud() == 0) {
                    if (jlVar.lnr() > i2) {
                        jlVar.ud(i2);
                        jlVar.qdl(i2);
                        return;
                    } else {
                        jlVar.qdl(jlVar.lnr());
                        return;
                    }
                }
                if (jlVar.lnr() == 0) {
                    if (jlVar.ud() > i2) {
                        jlVar.ud(i2);
                        jlVar.qdl(i2);
                        return;
                    } else {
                        jlVar.ud(jlVar.ud());
                        return;
                    }
                }
                if (jlVar.ud() > jlVar.lnr()) {
                    if (jlVar.ud() > i2) {
                        jlVar.ud((int) (i2 / (jlVar.ud() / jlVar.lnr())));
                        jlVar.qdl(i2);
                        return;
                    }
                    return;
                }
                if (jlVar.lnr() > i2) {
                    jlVar.qdl((int) (i2 * (jlVar.ud() / jlVar.lnr())));
                    jlVar.ud(i2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void qdl(mo moVar) {
        this.zlt = moVar;
    }

    public void qdl(exu exuVar) {
        this.taz = exuVar;
    }

    public void qdl(FilterWord filterWord) {
        this.kdv.add(filterWord);
    }

    public void qdl(Map<String, Object> map) {
        this.zvv = map;
    }

    public void qdl(float f) {
        this.od = f;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) {
        this.az = qdlVar;
    }

    public void qdl(yt ytVar) {
        this.ir = ytVar;
    }

    public void qdl(bjy bjyVar) {
        this.xh = bjyVar;
    }

    public void qdl(koa koaVar) {
        this.ddg = koaVar;
    }

    public void qdl(PAGBannerSize pAGBannerSize) {
        this.lhl = pAGBannerSize;
    }

    public void qdl(xmv xmvVar) {
        this.iu = xmvVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.bch.qdl.ud udVar) {
        this.vz = udVar;
    }

    public void qdl(rc rcVar) {
        this.xil = rcVar;
    }

    public void qdl(mzz mzzVar) {
        this.jl = mzzVar;
    }

    public void qdl(bch bchVar) {
        this.aaj = bchVar;
    }

    public static void qdl(ljh ljhVar, JSONObject jSONObject) throws JSONException {
        List<jl> listVm = ljhVar.vm();
        if (listVm != null) {
            JSONArray jSONArray = new JSONArray();
            for (jl jlVar : listVm) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", jlVar.qdl());
                jSONObject2.put("height", jlVar.lnr());
                jSONObject2.put("width", jlVar.ud());
                jSONObject2.put("image_preview", jlVar.mo());
                jSONObject2.put("image_key", jlVar.wd());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(d.c.k, jSONArray);
        }
    }
}
