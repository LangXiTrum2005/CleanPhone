package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sultanate;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.pv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class wjv {
    private int ac;
    private String ajz;
    private int akr;
    private JSONObject amj;
    private boolean ar;
    public long aw;
    private String bbu;
    private JSONObject bfa;
    private String bnj;
    private boolean bu;
    private String bzf;
    private com.bytedance.sdk.openadsdk.core.co.mj.ri cgm;
    private boolean che;
    private Map<String, Object> de;
    private int du;
    private com.bytedance.sdk.openadsdk.core.model.ri dw;
    private int dzy;
    private attabal eb;
    private AdSlot evm;
    private nr fe;
    private int feb;
    private ay fr;
    private String gcp;
    private String go;
    private String gy;
    private JSONObject gz;
    private String hcw;
    private boolean hd;
    private com.bytedance.sdk.openadsdk.core.aw.ri hqg;
    private long hws;
    private attabal iph;
    private ihz iyl;
    protected long jbs;
    private su jf;
    private PAGBannerSize jfv;
    private bgr jg;
    private int jxw;
    private String klz;
    private int kt;
    private boolean kvj;
    private boolean ljo;
    private com.bytedance.sdk.openadsdk.core.co.mj.ri mf;
    protected int mj;
    private boolean nbc;
    private String nd;
    private int nh;

    /* JADX INFO: renamed from: nhl, reason: collision with root package name */
    private String f18144nhl;
    private int nlk;
    private String nq;
    private fi nr;
    private int ny;
    private int oh;
    private String ory;
    private tan ovz;
    private String pc;
    private int pg;
    private int psd;
    private boolean pu;
    private int pv;
    private bu pye;
    private int qa;
    private String qh;
    private String quz;
    private boolean rko;
    private oh rmw;
    private String rzk;
    private int saa;
    private int sez;
    private boolean sh;
    private String siy;
    private String skk;
    private String sr;
    private int svc;
    private int sz;
    private nr ta;
    private String tan;
    private String tq;
    private String tw;
    private boolean tx;
    private int tyz;
    private volatile boolean tzs;
    private String udw;
    private dw ugd;
    private zf uo;
    private long uq;
    private mj ur;
    private ory vgs;
    private String vk;
    private attabal vt;
    private int vtj;
    private int vz;
    private boolean wd;
    private long wjv;
    private boolean xd;
    private di xe;
    private int xh;
    private String xlq;
    private String yj;
    private int yjg;
    private aw yjm;
    private JSONObject yw;
    private int zb;
    private String zf;
    private String zk;
    private ri zv;
    private JSONObject zxp;
    private int zyn;
    private xha zyu;
    private vr zz;
    public static final String lr = sultanate.attabal("_", new CharSequence[]{"is", ig.dw()});
    public static final String ik = sultanate.attabal("_", new CharSequence[]{"is", ig.dw(), "sample"});
    public static final String ka = sultanate.attabal("_", new CharSequence[]{ig.dw(), X3.f.e});
    protected static int sf = 330;
    private long slm = 0;
    protected boolean ri = false;
    protected boolean fi = com.bytedance.sdk.openadsdk.ay.ri.ik.ri;
    protected int di = com.bytedance.sdk.openadsdk.ay.ri.ik.lr;
    protected String xha = com.bytedance.sdk.openadsdk.ay.ri.ik.ik;
    private int ihz = 0;
    private boolean ay = false;
    private List<String> su = new ArrayList();
    private int igq = -1;
    protected int qt = 0;
    private final List<nr> ig = new ArrayList();
    private final List<String> qd = new ArrayList();
    private final List<FilterWord> srn = new ArrayList();
    private final pv jc = pv.ik();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f18143co = false;
    private int tnn = 0;
    private List<String> whw = new ArrayList();
    private List<String> xm = new ArrayList();
    private String aac = "0";
    private String luy = "";
    private int ud = 0;
    private int hpn = 2;
    private int qmx = -1;
    private int id = 0;
    private int eu = 0;
    private int tpb = 1;
    private sf jm = new sf();
    private int adz = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int ezp = 0;
    private int fb = 1;
    private int smj = 0;
    private int rbz = 0;
    private int eqw = 0;
    private int fn = 1;
    private int tn = 1;
    private float tyc = 100.0f;
    private int lau = -1;
    private int ib = 2;
    private int mvf = 1;
    private int cem = 0;
    private int iq = -1;
    private long gqj = -1;
    private int cm = 0;
    private int ju = Integer.MIN_VALUE;
    private boolean nb = false;
    private int qf = 0;
    private int ecl = -1;
    private long dvr = -1;
    private int lji = 50;
    private int wzs = -1;
    private final lr yv = new lr();
    private boolean rja = false;
    private com.bytedance.sdk.openadsdk.ay.ri.lr wzv = null;
    protected int bgr = -1;
    protected int vr = -1;
    private float qx = -1.0f;

    public static class ri {
        private String aw;
        private String bgr;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private String f18145co;
        private String di;
        private String fi;
        private String ik;
        private String jbs;
        private String ka;
        private String lr;
        private List<Integer> mj;
        private String qt;
        private String ri;
        private String sf;
        private String xha;

        public static com.bytedance.sdk.openadsdk.core.co.mj.ri lr(ri riVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.co.mj.ri().ri(riVar.ka()).lr(riVar.bgr()).ik(riVar.aw()).ka(riVar.vr()).fi(str);
        }

        public static com.bytedance.sdk.component.adexpress.ri.ik.ka ri(ri riVar, String str) {
            return com.bytedance.sdk.component.adexpress.ri.ik.ka.ri().ri(riVar.ka()).lr(riVar.fi()).ik(riVar.di()).ka(riVar.xha()).fi(riVar.ik()).di(str);
        }

        public String aw() {
            return this.f18145co;
        }

        public String bgr() {
            return this.aw;
        }

        public boolean co() {
            return !TextUtils.isEmpty(this.qt) && this.qt.equals("v3");
        }

        public String di() {
            return this.ik;
        }

        public String fi() {
            return this.lr;
        }

        public String ik() {
            return this.di;
        }

        public String jbs() {
            return this.xha;
        }

        public String ka() {
            return this.ri;
        }

        public String mj() {
            return this.fi;
        }

        public String qt() {
            return this.sf;
        }

        public String sf() {
            return this.qt;
        }

        public String vr() {
            return this.bgr;
        }

        public String xha() {
            return this.ka;
        }

        public void aw(String str) {
            this.bgr = str;
        }

        public void co(String str) {
            this.aw = str;
        }

        public void di(String str) {
            this.ka = str;
        }

        public void fi(String str) {
            this.ik = str;
        }

        public void ik(String str) {
            this.ri = str;
        }

        public void jbs(String str) {
            this.sf = str;
        }

        public void ka(String str) {
            this.lr = str;
        }

        public void mj(String str) {
            this.xha = str;
        }

        public void qt(String str) {
            this.qt = str;
        }

        public void sf(String str) {
            this.f18145co = str;
        }

        public void xha(String str) {
            this.fi = str;
        }

        public String lr() {
            return this.jbs;
        }

        public void lr(String str) {
            this.di = str;
        }

        public List<Integer> ri() {
            return this.mj;
        }

        public void ri(List<Integer> list) {
            this.mj = list;
        }

        public void ri(String str) {
            this.jbs = str;
        }
    }

    public wjv() {
        com.bytedance.sdk.openadsdk.core.model.ri riVar = new com.bytedance.sdk.openadsdk.core.model.ri();
        this.dw = riVar;
        riVar.ri(this);
    }

    private com.bytedance.sdk.openadsdk.core.co.mj.ri tg() {
        oh ohVarZv = zv();
        if (ohVarZv == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.co.mj.ri().ri(ohVarZv.ri()).lr(ohVarZv.lr()).ik(ohVarZv.ik()).ka(ohVarZv.ka()).fi(ur() + "_v3");
    }

    private com.bytedance.sdk.openadsdk.core.co.mj.ri wbc() {
        ri riVarSez = sez();
        if (riVarSez == null) {
            return null;
        }
        return ri.lr(riVarSez, String.valueOf(ur()));
    }

    public static boolean zb(int i) {
        return i == 44 || i == 43 || i == 30 || i == 40 || i == 41 || i == 39;
    }

    public int aac() {
        return this.tnn;
    }

    public boolean ac() {
        return this.che;
    }

    public int adz() {
        return this.kt;
    }

    public boolean ae() {
        return this.f18143co;
    }

    public int ajz() {
        int i = this.feb;
        if (i == 5 || i == 6 || i == 33) {
            return 1;
        }
        if (vgs()) {
            return 2;
        }
        return this.hpn;
    }

    public int akr() {
        JSONObject jSONObject;
        int i = this.ju;
        return (Integer.MIN_VALUE != i || (jSONObject = this.yw) == null) ? i : jSONObject.optInt("click_trigger_type", 0);
    }

    public List<String> am() {
        return this.su;
    }

    public List<String> amj() {
        return this.whw;
    }

    public void ar() {
        this.tzs = true;
    }

    public int aw() {
        return this.oh;
    }

    public ihz ay() {
        return this.iyl;
    }

    public int bbu() {
        if (this.tn != 2) {
            this.tn = 1;
        }
        return this.tn;
    }

    public List<String> bfa() {
        return this.xm;
    }

    public boolean bgr() {
        return this.bu;
    }

    public boolean biu() {
        int i = this.zyn;
        return i == 44 || i == 43;
    }

    public boolean bl() {
        return this.rja;
    }

    public int bnj() {
        if (this.wzs < 0) {
            try {
                JSONObject jSONObjectLjo = ljo();
                if (jSONObjectLjo != null) {
                    this.wzs = jSONObjectLjo.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.wzs = 0;
                }
            } catch (Throwable unused) {
                this.wzs = 0;
            }
        }
        return this.wzs;
    }

    public long bu() {
        return this.dvr;
    }

    public nr bzf() {
        return this.ta;
    }

    public long cem() {
        return this.hws;
    }

    public boolean cgm() {
        return this.tzs;
    }

    public boolean che() {
        return iph() == 100 || this.feb == 20;
    }

    public com.bytedance.sdk.openadsdk.ay.ri.lr cie() {
        return this.wzv;
    }

    public lr ckl() {
        return this.yv;
    }

    public JSONObject cm() {
        return this.gz;
    }

    public ory cmy() {
        return this.vgs;
    }

    public String co() {
        return this.hcw;
    }

    public JSONObject de() {
        return this.yw;
    }

    public boolean di() {
        su suVar;
        int iNd = nd();
        if (zyn() && dw.ik(this) && iNd != 43 && iNd != 44) {
            return false;
        }
        if (!zyn() && zb(iNd) && (suVar = this.jf) != null && suVar.ri() == 1) {
            return false;
        }
        boolean z = (iNd == 33 || iNd == 5 || iNd == 6 || iNd == 19 || iNd == 12) ? false : true;
        if (zz() || ajz() == 2 || !z || !com.bytedance.sdk.openadsdk.core.co.di.ri.di.ri(ig.ik(this.iq))) {
            return ajz() == 2 && z;
        }
        return true;
    }

    public su dob() {
        return this.jf;
    }

    public boolean du() {
        return this.nbc;
    }

    public boolean dvr() {
        attabal attabalVar = this.eb;
        return attabalVar == null || attabalVar.merc() != 1;
    }

    public String dw() {
        return this.vk;
    }

    public boolean dzy() {
        return this.ar;
    }

    public AdSlot eb() {
        return this.evm;
    }

    public int ecl() {
        return this.zb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wjv.class == obj.getClass()) {
            wjv wjvVar = (wjv) obj;
            if (this.aac.equals(wjvVar.tn()) && this.zk.equals(wjvVar.yjg())) {
                return true;
            }
        }
        return false;
    }

    public String eqw() {
        return this.siy;
    }

    public attabal eu() {
        return this.eb;
    }

    public boolean evm() {
        return this.svc == 1;
    }

    public boolean ex() {
        return this.fi;
    }

    public boolean ezp() {
        return this.pg == 1;
    }

    public nr fb() {
        return this.fe;
    }

    public String fe() {
        JSONObject jSONObjectLjo;
        if (this.go == null && (jSONObjectLjo = ljo()) != null) {
            this.go = jSONObjectLjo.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.go;
    }

    public boolean feb() {
        return this.wd;
    }

    public String fi() {
        int iGo = go();
        if (iGo == 1) {
            return "banner_ad";
        }
        if (iGo == 3) {
            return "open_ad";
        }
        if (iGo == 5) {
            return "embeded_ad";
        }
        if (iGo != 7) {
            return iGo != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public List<String> fn() {
        return this.qd;
    }

    public mj fr() {
        return this.ur;
    }

    public long gcp() {
        xha xhaVar = this.zyu;
        if (xhaVar == null) {
            return 0L;
        }
        return xhaVar.ik();
    }

    public int go() {
        return this.iq;
    }

    public int gqj() {
        return this.tyz;
    }

    public int gy() {
        int i = this.lau;
        if (i >= 0) {
            return i;
        }
        return 30;
    }

    public float gz() {
        if (this.tyc <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.tyc = 100.0f;
        }
        return (this.tyc * 1000.0f) / 1000.0f;
    }

    public boolean hcw() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectDe = de();
        if (jSONObjectDe != null && (jSONArrayOptJSONArray = jSONObjectDe.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (jSONArrayOptJSONArray.optInt(i) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hd() {
        return this.akr;
    }

    public long hp() {
        return this.aw;
    }

    public int hpn() {
        return this.eu;
    }

    public JSONObject hqg() {
        return this.bfa;
    }

    public int hws() {
        return this.rbz;
    }

    public List<FilterWord> ib() {
        return this.srn;
    }

    public String id() {
        return this.tq;
    }

    public com.bytedance.sdk.openadsdk.core.co.mj.ri ig() {
        return this.mf;
    }

    public boolean igq() {
        return this.rko;
    }

    public String ihz() {
        return this.yj;
    }

    public int ik() {
        return this.dzy;
    }

    public boolean inh() {
        return this.ay;
    }

    public int iph() {
        return this.nh;
    }

    public JSONObject iq() {
        JSONObject jSONObjectAw = aw(false);
        JSONObject jSONObjectNr = com.bytedance.sdk.openadsdk.core.settings.sf.lr().nr(String.valueOf(ur()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectAw);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectNr);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("MaterialMeta", "toJsonObjPlus", e.getMessage());
            return jSONObject;
        }
    }

    public Map<String, Object> iyl() {
        return this.de;
    }

    public long jbs() {
        return this.slm;
    }

    public boolean jc() {
        return this.tx;
    }

    public String jf() {
        JSONObject jSONObjectLjo;
        String strOptString = this.gy;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectLjo = ljo()) != null) {
            strOptString = jSONObjectLjo.optString("req_id", "");
            oh(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public double jfv() {
        return jbs(ljo());
    }

    public String jg() {
        return this.gcp;
    }

    public String jm() {
        return this.nd;
    }

    public int ju() {
        return this.sez;
    }

    public int jva() {
        return this.vr;
    }

    public int jxw() {
        if (zz()) {
            return 5;
        }
        if (gz() != 100.0f || ajz() == 2) {
            return 0;
        }
        return this.ezp;
    }

    public com.bytedance.sdk.openadsdk.core.model.ri ka() {
        return this.dw;
    }

    public long kcf() {
        return this.wjv;
    }

    public float kl() {
        float f = this.qx;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        oh ohVar = this.rmw;
        if (ohVar != null) {
            String strKa = ohVar.ka();
            if (TextUtils.isEmpty(strKa)) {
                strKa = com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri("adv3", this.rmw.ri(), this.rmw.lr());
            }
            if (strKa != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strKa).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.qx = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.qx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public String klz() {
        return this.tan;
    }

    public int kt() {
        try {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                return jSONObjectLjo.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public attabal kvj() {
        return this.vt;
    }

    public aw lau() {
        return this.yjm;
    }

    public int lji() {
        if (this.iq < 0) {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                this.iq = jSONObjectLjo.optInt("ad_slot_type", 0);
            } else {
                this.iq = 0;
            }
        }
        return this.iq;
    }

    public JSONObject ljo() {
        if (this.zxp == null) {
            try {
                if (!TextUtils.isEmpty(this.zk)) {
                    this.zxp = new JSONObject(this.zk);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.ac.ik("MaterialMeta", e.getMessage());
            }
        }
        return this.zxp;
    }

    public int lr() {
        xha xhaVarXm = xm();
        if (xhaVarXm != null) {
            return xhaVarXm.ri();
        }
        return -1;
    }

    public List<wjv> lsq() {
        return this.dw.ka();
    }

    public boolean luy() {
        return this.smj == 1;
    }

    public int mf() {
        return this.psd;
    }

    public int mhp() {
        int i = this.bgr;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.nr.ka().tan(String.valueOf(ur()));
    }

    public String mj() {
        fr frVarQt;
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa = ka();
        if (riVarKa == null || (frVarQt = riVarKa.qt()) == null) {
            return null;
        }
        return frVarQt.xha();
    }

    public boolean mm() {
        return this.ri;
    }

    public long mn() {
        return this.uq;
    }

    public String mvf() {
        return this.skk;
    }

    public com.bytedance.sdk.component.jbs.lr.ri nb() {
        com.bytedance.sdk.component.jbs.lr.ri riVar = new com.bytedance.sdk.component.jbs.lr.ri();
        riVar.ri(this.akr);
        riVar.lr(this.aac);
        riVar.ik(this.ajz);
        riVar.ri(yjg());
        return riVar;
    }

    public boolean nbc() {
        ri riVar = this.zv;
        if (riVar != null) {
            return !TextUtils.isEmpty(riVar.sf());
        }
        int i = this.eu;
        return i == 9 || i == 10;
    }

    public int nd() {
        return this.feb;
    }

    public sf nh() {
        return this.jm;
    }

    public boolean nhl() {
        return this.jc.ri > 0;
    }

    public boolean nlk() {
        return !zz() && tzs() == 1;
    }

    public long nm() {
        Map<String, Object> mapIyl = iyl();
        if (mapIyl == null) {
            return 0L;
        }
        try {
            Object obj = mapIyl.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public long nq() {
        if (this.gqj < 0) {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                this.gqj = jSONObjectLjo.optLong("ad_id", 0L);
            } else {
                this.gqj = 0L;
            }
        }
        return this.gqj;
    }

    public int nr() {
        return this.qt;
    }

    public boolean ny() {
        return lji() == 5;
    }

    public int ogw() {
        return this.mj;
    }

    public boolean oh() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectDe = de();
        if (jSONObjectDe == null || (jSONArrayOptJSONArray = jSONObjectDe.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (jSONArrayOptJSONArray.optInt(i) == 186) {
                return true;
            }
        }
        return false;
    }

    public boolean ojh() {
        return this.nb;
    }

    public boolean ory() {
        List<Integer> listRi;
        return (sez() == null || (listRi = sez().ri()) == null || !listRi.contains(57)) ? false : true;
    }

    public boolean ovz() {
        vr vrVar;
        return zz() && !nhl() && (vrVar = this.zz) != null && vrVar.ri() == 1;
    }

    public int pc() {
        return this.ud;
    }

    public boolean pg() {
        return lji() == 8;
    }

    public int plm() {
        int i = this.vr;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.nr.ka().qt(String.valueOf(ur()));
    }

    public String pnk() {
        return this.zf;
    }

    public int psd() {
        return this.yjg;
    }

    public String pu() {
        return this.xlq;
    }

    public com.bytedance.sdk.openadsdk.core.co.mj.ri pv() {
        return this.cgm;
    }

    public String pwf() {
        return this.xha;
    }

    public boolean pye() {
        if (this.ig.isEmpty()) {
            return false;
        }
        if (this.saa == 4 && this.ig.size() < 3) {
            return false;
        }
        Iterator<nr> it = this.ig.iterator();
        while (it.hasNext()) {
            if (!it.next().fi()) {
                return false;
            }
        }
        return true;
    }

    public boolean qa() {
        return lji() == 7;
    }

    public ka qc() {
        ka kaVarAw;
        fi fiVar = this.nr;
        if (fiVar != null) {
            kaVarAw = fiVar.lr();
        } else {
            com.bytedance.sdk.openadsdk.core.aw.ri riVar = this.hqg;
            kaVarAw = riVar != null ? riVar.aw() : null;
        }
        if (kaVarAw != null) {
            kaVarAw.ri(this);
        }
        return kaVarAw;
    }

    public int qd() {
        return this.qf;
    }

    public int qf() {
        return this.cem;
    }

    public int qh() {
        if (ory()) {
            return 5;
        }
        return zyu() ? 4 : 1;
    }

    public int qhn() {
        return this.ihz;
    }

    public int qmx() {
        return this.tpb;
    }

    public int qt() {
        return this.ac;
    }

    public int quz() {
        JSONObject jSONObject = this.gz;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public void qx() {
        this.jc.fi();
        xha(false);
    }

    public boolean rbh() {
        su suVar = this.jf;
        if (suVar == null || suVar.lr() != 1) {
            return false;
        }
        ay ayVar = this.fr;
        return ayVar == null || ayVar.ri() <= 0;
    }

    public List<nr> rbz() {
        return this.ig;
    }

    public ay ri() {
        return this.fr;
    }

    public boolean rja() {
        int i = this.feb;
        return (i == 2 || i == 1) && 3 == this.kt;
    }

    public String rko() {
        return this.bbu;
    }

    public int rmw() {
        return this.vtj;
    }

    public int rzk() {
        xha xhaVar = this.zyu;
        if (xhaVar == null) {
            return 2;
        }
        return xhaVar.lr();
    }

    public String saa() {
        return this.luy;
    }

    public ri sez() {
        return this.zv;
    }

    public String sf() {
        return this.ory;
    }

    public int sh() {
        return this.du;
    }

    public boolean siy() {
        if (this.iq <= 0) {
            this.iq = lji();
        }
        int i = this.iq;
        return (i == 7 || i == 8) && !fi(this) && zb() != 21 && this.qa == 1;
    }

    public String skk() {
        if (!TextUtils.isEmpty(this.gcp)) {
            return this.gcp;
        }
        Context contextRi = com.bytedance.sdk.openadsdk.core.nr.ri();
        int iAdz = adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                return contextRi != null ? com.bytedance.sdk.component.utils.uq.ri(contextRi, "tt_video_download_apk") : this.gcp;
            }
            if (iAdz != 8) {
                return this.gcp;
            }
        }
        return contextRi != null ? com.bytedance.sdk.component.utils.uq.ri(contextRi, "tt_video_mobile_go_detail") : this.gcp;
    }

    public boolean slm() {
        return this.kvj;
    }

    public String smj() {
        return this.bnj;
    }

    public int sp() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa = ka();
        if (riVarKa != null && riVarKa.qt() != null) {
            return riVarKa.qt().jbs();
        }
        if (eb() != null) {
            strValueOf = eb().getCodeId();
        } else {
            int iUr = ur();
            strValueOf = iUr != 0 ? String.valueOf(iUr) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.nr.ka().tan(strValueOf);
        }
        return 5;
    }

    public com.bytedance.sdk.openadsdk.core.aw.ri sr() {
        return this.hqg;
    }

    public boolean srn() {
        return this.sh;
    }

    public tan su() {
        return this.ovz;
    }

    public boolean svc() {
        return lji() == 1;
    }

    public int sz() {
        return this.ny;
    }

    public String ta() {
        return this.nq;
    }

    public boolean tan() {
        return this.pu;
    }

    public boolean tl() {
        ay ayVar = this.fr;
        return ayVar != null && ayVar.ri() > 0;
    }

    public String tn() {
        return this.aac;
    }

    public int tnn() {
        return this.lji;
    }

    public boolean tp() {
        return true;
    }

    public String tpb() {
        return this.pc;
    }

    public String tq() {
        return this.qh;
    }

    public String tt() {
        return this.f18144nhl;
    }

    public dw tw() {
        return this.ugd;
    }

    public attabal tx() {
        return this.iph;
    }

    public String tyc() {
        return this.ajz;
    }

    public di tyz() {
        return this.xe;
    }

    public int tzs() {
        return this.id;
    }

    public int ud() {
        return this.eqw;
    }

    public boolean udw() {
        return this.nlk == 1;
    }

    public JSONObject ugd() {
        return this.amj;
    }

    public String uo() {
        di diVarTyz = tyz();
        if (diVarTyz == null || TextUtils.isEmpty(diVarTyz.ri())) {
            return null;
        }
        return diVarTyz.ri();
    }

    public String uq() {
        return this.sr;
    }

    public int ur() {
        JSONObject jSONObjectLjo = ljo();
        if (jSONObjectLjo != null) {
            return jSONObjectLjo.optInt("rit", 0);
        }
        return 0;
    }

    public boolean vgs() {
        return eb() != null && eb().getDurationSlotType() == 8 && zyu();
    }

    public bu vk() {
        return this.pye;
    }

    public PAGBannerSize vkd() {
        return this.jfv;
    }

    public int vnt() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa = ka();
        if (riVarKa != null && riVarKa.qt() != null) {
            return riVarKa.qt().jbs();
        }
        if (eb() != null) {
            strValueOf = eb().getCodeId();
        } else {
            int iUr = ur();
            strValueOf = iUr != 0 ? String.valueOf(iUr) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.nr.ka().sf(strValueOf);
        }
        return 30;
    }

    public boolean vr() {
        return this.xd;
    }

    public int vt() {
        return this.adz;
    }

    public int vtj() {
        return this.vz;
    }

    public int vz() {
        return this.saa;
    }

    public String wd() {
        return this.tw;
    }

    public void whw() {
        attabal attabalVar = this.eb;
        if (attabalVar == null || TextUtils.isEmpty(attabalVar.marial())) {
            return;
        }
        try {
            if (!this.eb.marial().contains("style_id")) {
                this.ar = false;
            } else {
                this.ar = true;
                this.udw = Uri.parse(this.eb.marial()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
        }
    }

    public boolean wjv() {
        return (TextUtils.isEmpty(ihz()) || TextUtils.isEmpty(uq())) ? false : true;
    }

    public boolean wm() {
        tan tanVar;
        AdSlot adSlot = this.evm;
        if (adSlot == null || (tanVar = this.ovz) == null) {
            return false;
        }
        return tanVar.ri(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public boolean wzs() {
        return lji() == 3 || lji() == 4;
    }

    public pv wzv() {
        return this.jc;
    }

    public String xd() {
        return this.udw;
    }

    public int xe() {
        return this.mvf;
    }

    public String xh() {
        return this.rzk;
    }

    public int xha() {
        return this.pv;
    }

    public com.bytedance.sdk.component.adexpress.ri.ik.ka xlq() {
        ri riVarSez = sez();
        if (riVarSez == null) {
            return null;
        }
        return ri.ri(riVarSez, String.valueOf(ur()));
    }

    public xha xm() {
        return this.zyu;
    }

    public zf xz() {
        return this.uo;
    }

    public int ye() {
        int i = this.igq;
        if (i >= 0) {
            return i;
        }
        return qa() ? 30 : 5;
    }

    public boolean yj() {
        return zz() || this.nr != null;
    }

    public String yjg() {
        return this.zk;
    }

    public int yjm() {
        return this.ib;
    }

    public fi yub() {
        return this.nr;
    }

    public int yv() {
        return this.cm;
    }

    public vr yw() {
        return this.zz;
    }

    public String zf() {
        return this.quz;
    }

    public long zh() {
        return this.jbs;
    }

    public int zk() {
        return this.qmx;
    }

    public int zm() {
        Map<String, Object> map = this.de;
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

    public void zp() {
        if (!TextUtils.isEmpty(id())) {
            bgr("0");
        }
        Map<String, Object> mapIyl = iyl();
        if (mapIyl == null || !mapIyl.containsKey("price")) {
            return;
        }
        mapIyl.put("price", "0");
    }

    public oh zv() {
        return this.rmw;
    }

    public int zxp() {
        bgr bgrVar = this.jg;
        if (bgrVar == null) {
            return 0;
        }
        return bgrVar.ri();
    }

    public int zyl() {
        return this.di;
    }

    public boolean zyn() {
        return this.ljo;
    }

    public boolean zyu() {
        return this.cm == 2;
    }

    public boolean zz() {
        int i = this.cm;
        return (i == 1 || i == 3) && sr() != null;
    }

    private static double jbs(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean ka(wjv wjvVar) {
        return (wjvVar == null || wjvVar.eu() == null || wjvVar.eu().trm() != 1) ? false : true;
    }

    private String qd(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.slm.ri(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    public void ac(int i) {
        this.rbz = i;
    }

    public void aw(int i) {
        this.ud = i;
    }

    public void ay(int i) {
        this.adz = i;
    }

    public void bgr(int i) {
        this.qmx = i;
    }

    public void bu(int i) {
        this.eqw = i;
    }

    public void co(int i) {
        this.feb = i;
    }

    public void dw(int i) {
        this.pg = i;
    }

    public void dzy(int i) {
        this.jxw = i;
    }

    public void feb(int i) {
        this.vz = i;
    }

    public void fr(int i) {
        this.fn = i;
    }

    public void gcp(int i) {
        this.bgr = i;
    }

    public void ig(int i) {
        this.id = i;
    }

    public void igq(int i) {
        this.nh = i;
    }

    public void ihz(int i) {
        this.fb = i;
    }

    public void ik(int i) {
        this.ac = i;
    }

    public void jc(int i) {
        this.igq = i;
    }

    public void nd(int i) {
        this.ihz = i;
    }

    public void nr(int i) {
        this.eu = i;
    }

    public void pv(int i) {
        this.tn = i;
    }

    public void qt(String str) {
        this.vk = str;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        if (riVar != null) {
            this.dw = riVar;
        }
    }

    public void rzk(int i) {
        this.mj = i;
    }

    public void sf(boolean z) {
        this.ljo = z;
    }

    public void slm(int i) {
        this.smj = i;
    }

    public void srn(int i) {
        this.lau = i;
    }

    public void su(int i) {
        this.xh = i;
    }

    public void ta(int i) {
        this.sez = i;
    }

    public void tan(int i) {
        this.tpb = i;
    }

    public void tnn(int i) {
        this.psd = Math.max(0, i);
    }

    public void tw(int i) {
        this.vr = i;
    }

    public void uq(int i) {
        this.ezp = i;
    }

    public void vr(int i) {
        this.hpn = i;
    }

    public void wjv(int i) {
        this.sz = i;
    }

    public void xd(int i) {
        this.saa = i;
    }

    public void xha(String str) {
        this.yj = str;
    }

    public void xm(int i) {
        this.cm = i;
    }

    public int zb() {
        return this.zyn;
    }

    public void zf(int i) {
        this.akr = i;
    }

    public void zyn(int i) {
        this.nlk = i;
    }

    public static boolean ik(wjv wjvVar) {
        return (wjvVar == null || wjvVar.eu() == null || wjvVar.eu().polloi() != 7 || dw.lr(wjvVar)) ? false : true;
    }

    public void ac(String str) {
        this.rzk = str;
    }

    public void aw(String str) {
        this.klz = str;
    }

    public void ay(String str) {
        this.ajz = str;
    }

    public void bgr(String str) {
        this.tq = str;
    }

    public void bu(String str) {
        this.nd = str;
    }

    public void co(String str) {
        this.luy = str;
    }

    public void dw(String str) {
        this.bbu = str;
    }

    public void dzy(String str) {
        if (TextUtils.isEmpty(str)) {
            this.xha = com.bytedance.sdk.openadsdk.ay.ri.ik.ik;
        } else {
            this.xha = str;
        }
    }

    public void fr(String str) {
        this.tan = str;
    }

    public void ig(String str) {
        this.zf = str;
    }

    public void igq(String str) {
        this.skk = str;
    }

    public void ihz(String str) {
        this.qh = str;
    }

    public void jbs(String str) {
        this.quz = str;
    }

    public void kt(int i) {
        this.yjg = i;
    }

    public void lr(int i) {
        this.pv = i;
    }

    public void nr(String str) {
        this.bnj = str;
    }

    public void pv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.su.add(str);
    }

    public void qh(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.di = i;
    }

    public void qt(boolean z) {
        this.wd = z;
    }

    public void ri(int i) {
        this.dzy = i;
    }

    public void sf(String str) {
        this.nq = str;
    }

    public void slm(String str) {
        this.pc = str;
    }

    public void su(String str) {
        this.zk = str;
    }

    public void tan(String str) {
        this.siy = str;
    }

    public void uq(String str) {
        this.gcp = str;
    }

    public void vr(String str) {
        this.xlq = str;
    }

    public void wjv(String str) {
        this.aac = str;
    }

    public void xd(String str) {
        this.f18144nhl = str;
    }

    public void xha(boolean z) {
        this.rko = z;
    }

    public void zf(String str) {
        this.bzf = str;
    }

    public static JSONObject ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("MaterialMeta", e.getMessage());
            return null;
        }
    }

    public static int ka(String str) {
        return ri(ik(str));
    }

    public static boolean lr(wjv wjvVar) {
        return (ri(wjvVar) || ik(wjvVar)) ? false : true;
    }

    private static long mj(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public JSONObject aw(boolean z) {
        try {
            String strTt = tt();
            if (TextUtils.isEmpty(strTt)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("raw_response_info", strTt);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strTt).optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && ik() >= 0 && ik() < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(ik());
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
                AdSlot adSlotEb = eb();
                if (adSlotEb != null) {
                    jSONObject.put("adslot", adSlotEb.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.quz)) {
                    jSONObject.put("gdid_encrypted", this.quz);
                }
                jSONObject.put("hasReportShow", this.wd);
                jSONObject.put("isMrcReportFinish", this.tzs);
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("MaterialMeta", "toJsonObj error", e);
            return null;
        }
    }

    public void bgr(boolean z) {
        this.f18143co = z;
    }

    public void bu(boolean z) {
        this.rja = z;
    }

    public void co(boolean z) {
        this.nbc = z;
    }

    public void jbs(boolean z) {
        this.tx = z;
    }

    public void nr(boolean z) {
        this.fi = z;
    }

    public void ory(int i) {
        this.kt = i;
    }

    public void qt(int i) {
        ri(i, -1);
    }

    public void ri(long j) {
        this.slm = j;
    }

    public void sf(int i) {
        this.tnn = i;
    }

    public void slm(boolean z) {
        this.ri = z;
    }

    public void tan(boolean z) {
        this.ay = z;
    }

    public void vr(boolean z) {
        this.nb = z;
    }

    public void xha(int i) {
        this.qf = i;
    }

    public static double lr(String str) {
        return jbs(ik(str));
    }

    public static boolean ri(wjv wjvVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (ri(wjvVar) || z4 || wjvVar == null || wjvVar.eu() == null || TextUtils.isEmpty(wjvVar.eu().marial())) {
            return false;
        }
        if (ik(wjvVar)) {
            return z3;
        }
        return (wjvVar.eu() == null || wjvVar.eu().trm() != 1) ? z : z2;
    }

    public void fe(int i) {
        this.vtj = i;
    }

    public void hcw(int i) {
        this.svc = i;
    }

    public void jbs(int i) {
        this.qa = i;
    }

    public void ka(int i) {
        this.oh = i;
    }

    public void mj(String str) {
        this.sr = str;
    }

    public void oh(int i) {
        this.ny = i;
    }

    public void ory(String str) {
        this.tw = str;
    }

    public void qd(int i) {
        this.tyz = i;
    }

    public void xha(JSONObject jSONObject) {
        this.yv.ri(jSONObject);
    }

    public String hcw(String str) {
        JSONObject jSONObjectLjo = ljo();
        return jSONObjectLjo != null ? jSONObjectLjo.optString("rit", str) : str;
    }

    public void ka(boolean z) {
        this.pu = z;
    }

    public void mj(boolean z) {
        this.sh = z;
    }

    public void oh(String str) {
        this.gy = str;
    }

    public void siy(int i) {
        this.du = i;
    }

    public void xha(long j) {
        this.wjv = j;
    }

    public static boolean di(wjv wjvVar) {
        Object obj;
        if (wjvVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapIyl = wjvVar.iyl();
            return (mapIyl == null || (obj = mapIyl.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public static String lr(Context context, wjv wjvVar) {
        if (context != null && wjvVar != null) {
            try {
                if (wjvVar.adz() != 8) {
                    if (wjvVar.fr().ri()) {
                    }
                }
                String strRi = com.bytedance.sdk.openadsdk.core.ri.ri.ri(context);
                if (TextUtils.isEmpty(strRi)) {
                    return null;
                }
                return strRi;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public void bnj(int i) {
        this.cem = i;
    }

    public void ik(boolean z) {
        this.kvj = z;
    }

    public void ka(JSONObject jSONObject) {
        this.bfa = jSONObject;
    }

    public void mj(int i) {
        this.lji = i;
    }

    public static boolean fi(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        int iVz = wjvVar.vz();
        return wjvVar.zz() || iVz == 5 || iVz == 15 || iVz == 50;
    }

    public void ik(nr nrVar) {
        PAGBannerSize pAGBannerSizeVkd = vkd();
        if (pAGBannerSizeVkd != null && pAGBannerSizeVkd.getWidth() > 0 && pAGBannerSizeVkd.getHeight() > 0) {
            ri(nrVar, qd.lr(com.bytedance.sdk.openadsdk.core.nr.ri(), pAGBannerSizeVkd.getWidth()), qd.lr(com.bytedance.sdk.openadsdk.core.nr.ri(), pAGBannerSizeVkd.getHeight()));
        }
        this.ig.add(nrVar);
    }

    public void ka(long j) {
        this.aw = j;
    }

    public void whw(int i) {
        this.zb = i;
    }

    public static boolean ri(wjv wjvVar) {
        return (wjvVar == null || wjvVar.eu() == null || wjvVar.eu().polloi() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.bgr.ri.lr ri(String str, wjv wjvVar) {
        wjvVar.bnj(0);
        int iLji = wjvVar.lji();
        int i = 3;
        if (iLji == 3) {
            i = 4;
        } else if (iLji == 7) {
            i = 1;
        } else if (iLji == 8) {
            i = 2;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVar = new com.bytedance.sdk.openadsdk.core.bgr.ri.lr(str, wjvVar.tx(), wjvVar.kvj(), wjvVar.qf(), wjvVar.sh(), i);
        lrVar.ri(com.bytedance.sdk.openadsdk.wjv.fi.ri("video_error_conf", 0));
        lrVar.ik(phytopathogen.attabal.beachfront(lrVar.slm()));
        return lrVar;
    }

    public void fi(String str) {
        this.ory = str;
    }

    public void di(String str) {
        this.hcw = str;
    }

    public void fi(int i) {
        this.ecl = i;
    }

    public void lr(boolean z) {
        this.xd = z;
    }

    public void di(int i) {
        this.qt = i;
    }

    public void fi(boolean z) {
        this.che = z;
    }

    public void lr(long j) {
        this.dvr = j;
    }

    public void di(boolean z) {
        this.hd = z;
    }

    public void fi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.kt = 4;
        this.aac = jSONObject.optString("id");
        this.pc = jSONObject.optString("source");
        di diVar = new di();
        this.xe = diVar;
        diVar.ik(jSONObject.optString("pkg_name"));
        this.xe.lr(jSONObject.optString("name"));
        this.xe.ri(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public void lr(com.bytedance.sdk.openadsdk.core.co.mj.ri riVar) {
        this.mf = riVar;
        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(riVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void di(JSONObject jSONObject) {
        this.gz = jSONObject;
    }

    public void ik(long j) {
        this.hws = j;
    }

    public static long ri(String str) {
        return mj(ik(str));
    }

    public void di(long j) {
        this.uq = j;
    }

    public void ik(JSONObject jSONObject) {
        this.amj = jSONObject;
    }

    public void lr(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.ib = 2;
        } else {
            this.ib = (int) d;
        }
    }

    public void ik(attabal attabalVar) {
        this.vt = attabalVar;
    }

    public static int ri(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void lr(JSONObject jSONObject) {
        this.yw = jSONObject;
    }

    public static String ri(Context context, wjv wjvVar) {
        if (context == null || wjvVar == null || !((wjvVar.lji() == 8 || wjvVar.lji() == 7) && wjvVar.che())) {
            return null;
        }
        String strLr = lr(context, wjvVar);
        if (TextUtils.isEmpty(strLr) || com.bytedance.sdk.openadsdk.core.ri.ri.ri() != 1) {
            return null;
        }
        return strLr;
    }

    public void lr(nr nrVar) {
        this.ta = nrVar;
    }

    public void lr(attabal attabalVar) {
        this.iph = attabalVar;
    }

    public static void lr(wjv wjvVar, JSONObject jSONObject) throws JSONException {
        di diVarTyz = wjvVar.tyz();
        if (diVarTyz != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", diVarTyz.lr());
            jSONObject2.put("package_name", diVarTyz.ik());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, diVarTyz.ri());
            jSONObject2.put("score", diVarTyz.ka());
            jSONObject2.put("comment_num", diVarTyz.fi());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, diVarTyz.di());
            jSONObject2.put("app_category", diVarTyz.xha());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public void fi(long j) {
        this.jbs = j;
    }

    public void ri(boolean z) {
        this.bu = z;
    }

    public void ri(mj mjVar) {
        this.ur = mjVar;
    }

    public void ri(ihz ihzVar) {
        this.iyl = ihzVar;
    }

    public void ri(tan tanVar) {
        this.ovz = tanVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.co.mj.ri riVar) {
        this.cgm = riVar;
        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(riVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void ri(xha xhaVar) {
        this.zyu = xhaVar;
    }

    public void ri(dw dwVar) {
        this.ugd = dwVar;
    }

    public void ri(int i, int i2) {
        this.zyn = i;
        this.feb = i;
        if (this.evm == null) {
            this.feb = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = lji();
        }
        if (this.evm.getDurationSlotType() != 3 && i2 != 3) {
            if (this.evm.getDurationSlotType() != 7 && this.evm.getDurationSlotType() != 8 && i2 != 7 && i2 != 8) {
                if (!this.ljo && dw.lr(this)) {
                    this.feb = 4;
                    return;
                }
                if (this.zyn == 4 && !dw.lr(this)) {
                    this.feb = 0;
                }
                int i3 = this.zyn;
                if (i3 == 41) {
                    this.feb = 41;
                    return;
                }
                if (i >= 5) {
                    this.feb = 0;
                    return;
                }
                if (i3 == 2 && adz() != 3) {
                    this.feb = 0;
                    return;
                } else {
                    if (i == 0 || (i == 1 && adz() != 3)) {
                        this.feb = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.ljo) {
                if (dw.ik(this)) {
                    this.feb = 12;
                    return;
                } else if (dw.lr(this)) {
                    this.feb = 9;
                    return;
                }
            }
            if (this.zyn == 5 && !ac.ka(this)) {
                this.feb = 7;
            }
            if (this.zyn == 6 && !ac.lr(this)) {
                this.feb = 7;
            }
            if (this.zyn == 8 && iph() != 100) {
                this.feb = 7;
            }
            if (this.zyn == 19 && TextUtils.isEmpty(this.bnj)) {
                this.feb = 7;
            }
            if (this.zyn == 20 && TextUtils.isEmpty(this.bnj)) {
                this.feb = 7;
            }
            if (this.zyn == 38 && !ac.ik(this)) {
                this.feb = 7;
            }
            if (i < 5) {
                this.feb = 7;
                return;
            }
            return;
        }
        this.feb = 14;
    }

    public void ri(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.mvf = 1;
        } else {
            this.mvf = (int) d;
        }
    }

    public void ri(sf sfVar) {
        this.jm = sfVar;
    }

    public void ri(AdSlot adSlot) {
        this.evm = adSlot;
    }

    public void ri(ri riVar) {
        this.zv = riVar;
        com.bytedance.sdk.component.adexpress.ri.ik.ka kaVarXlq = xlq();
        if (kaVarXlq != null && !nbc()) {
            com.bytedance.sdk.component.adexpress.ri.lr.lr.ri(kaVarXlq);
        }
        if (riVar == null || TextUtils.isEmpty(riVar.aw())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(wbc(), "ad");
    }

    public void ri(oh ohVar) {
        this.rmw = ohVar;
        if (ohVar == null || TextUtils.isEmpty(ohVar.ik())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(tg(), "adv3");
    }

    public void ri(attabal attabalVar) {
        this.eb = attabalVar;
    }

    public void ri(bgr bgrVar) {
        this.jg = bgrVar;
    }

    public void ri(nr nrVar) {
        ri(nrVar, sf);
        String strQd = qd(nrVar.ri());
        if (!TextUtils.isEmpty(strQd)) {
            nrVar.lr(strQd);
        }
        this.fe = nrVar;
    }

    private void ri(nr nrVar, int i) {
        if (nrVar != null) {
            try {
                if (TextUtils.isEmpty(nrVar.ri())) {
                    return;
                }
                if (nrVar.lr() == 0 && nrVar.ik() == 0) {
                    nrVar.ri(i);
                    nrVar.lr(i);
                    return;
                }
                if (nrVar.lr() == 0) {
                    if (nrVar.ik() > i) {
                        nrVar.lr(i);
                        nrVar.ri(i);
                        return;
                    } else {
                        nrVar.ri(nrVar.ik());
                        return;
                    }
                }
                if (nrVar.ik() == 0) {
                    if (nrVar.lr() > i) {
                        nrVar.lr(i);
                        nrVar.ri(i);
                        return;
                    } else {
                        nrVar.lr(nrVar.lr());
                        return;
                    }
                }
                if (nrVar.lr() > nrVar.ik()) {
                    if (nrVar.lr() > i) {
                        nrVar.lr((int) (i / (nrVar.lr() / nrVar.ik())));
                        nrVar.ri(i);
                        return;
                    }
                    return;
                }
                if (nrVar.ik() > i) {
                    nrVar.ri((int) (i * (nrVar.lr() / nrVar.ik())));
                    nrVar.lr(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void ri(nr nrVar, int i, int i2) {
        try {
            if (nrVar.ik() >= i2) {
                nrVar.ri((int) ((nrVar.lr() / nrVar.ik()) * i2));
                nrVar.lr(i2);
            } else if (nrVar.lr() >= i) {
                nrVar.ri((int) ((i / i2) * nrVar.ik()));
            }
        } catch (Throwable unused) {
        }
    }

    public void ri(di diVar) {
        this.xe = diVar;
    }

    public void ri(aw awVar) {
        this.yjm = awVar;
    }

    public void ri(FilterWord filterWord) {
        this.srn.add(filterWord);
    }

    public void ri(Map<String, Object> map) {
        this.de = map;
    }

    public void ri(float f) {
        this.tyc = f;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.aw.ri riVar) {
        this.hqg = riVar;
    }

    public void ri(bu buVar) {
        this.pye = buVar;
    }

    public void ri(vr vrVar) {
        this.zz = vrVar;
    }

    public void ri(zf zfVar) {
        this.uo = zfVar;
    }

    public void ri(PAGBannerSize pAGBannerSize) {
        this.jfv = pAGBannerSize;
    }

    public void ri(su suVar) {
        this.jf = suVar;
    }

    public void ri(com.bytedance.sdk.openadsdk.ay.ri.lr lrVar) {
        this.wzv = lrVar;
    }

    public void ri(ory oryVar) {
        this.vgs = oryVar;
    }

    public void ri(fi fiVar) {
        this.nr = fiVar;
    }

    public void ri(ay ayVar) {
        this.fr = ayVar;
    }

    public static void ri(wjv wjvVar, JSONObject jSONObject) throws JSONException {
        List<nr> listRbz = wjvVar.rbz();
        if (listRbz != null) {
            JSONArray jSONArray = new JSONArray();
            for (nr nrVar : listRbz) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", nrVar.ri());
                jSONObject2.put("height", nrVar.ik());
                jSONObject2.put("width", nrVar.lr());
                jSONObject2.put("image_preview", nrVar.di());
                jSONObject2.put("image_key", nrVar.xha());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
