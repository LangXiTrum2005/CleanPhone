package com.bytedance.adsdk.ugeno.lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.bgr;
import com.bytedance.adsdk.ugeno.core.lr.di;
import com.bytedance.adsdk.ugeno.core.lr.fi;
import com.bytedance.adsdk.ugeno.core.mj;
import com.bytedance.adsdk.ugeno.core.nr;
import com.bytedance.adsdk.ugeno.core.qt;
import com.bytedance.adsdk.ugeno.core.sf;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.core.xha;
import com.bytedance.adsdk.ugeno.ka;
import com.bytedance.adsdk.ugeno.ka.jbs;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik<T extends View> implements View.OnTouchListener, vr.lr, vr.ri, ka {
    protected boolean aac;
    protected float ac;
    private boolean adz;
    protected float ajz;
    private boolean akr;
    private qt amj;
    protected float aw;
    protected boolean ay;
    private String bfa;
    protected float bgr;
    protected float bnj;
    protected float bu;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.lr.lr bzf;
    private float cem;
    protected Map<Integer, aw> che;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected String f18024co;
    private boolean de;
    protected ri<ViewGroup> di;
    protected float dw;
    protected boolean dzy;
    protected mj eb;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.lr.ka.ri eqw;
    private boolean eu;
    private String evm;
    private GradientDrawable ezp;

    @Deprecated
    private di fb;
    protected float fe;
    protected boolean feb;
    protected T fi;
    private boolean fn;
    protected boolean fr;
    protected int gcp;
    protected boolean hcw;
    protected boolean hd;
    protected float hpn;
    protected float hws;
    private boolean ib;
    protected float id;
    protected int ig;
    protected float igq;
    protected float ihz;
    protected JSONObject ik;
    protected slm iph;
    protected sf jbs;
    protected float jc;
    private boolean jg;
    private boolean jm;
    protected float jxw;
    protected JSONObject ka;
    private boolean klz;
    protected boolean kt;
    private boolean lau;
    protected Context lr;
    protected float luy;
    protected xha.ri mj;
    private long mvf;
    protected jbs nbc;
    protected int nd;
    protected float nh;
    protected float nr;
    protected boolean oh;
    protected float ory;
    protected float pc;
    protected com.bytedance.adsdk.ugeno.core.di pu;
    protected boolean pv;
    protected String qd;
    protected float qh;
    protected float qmx;
    protected boolean qt;

    @Deprecated
    private fi rbz;
    private boolean ri;
    protected boolean rzk;
    protected com.bytedance.adsdk.ugeno.ri.di saa;
    protected com.bytedance.adsdk.ugeno.xha.ri.C0197ri sez;
    protected String sf;
    protected boolean siy;
    private boolean skk;
    protected float slm;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.lr.ik smj;
    protected ImageView.ScaleType srn;
    protected float su;
    private com.bytedance.adsdk.ugeno.core.ri sz;
    protected float ta;
    protected float tan;
    private boolean tn;
    protected float tnn;
    private boolean tpb;
    private nr tq;
    protected String tw;
    private boolean tyc;
    private JSONObject tyz;
    protected float ud;
    protected boolean uq;
    protected float vr;
    protected vr vt;
    private com.bytedance.adsdk.ugeno.ka.ri.ri vz;
    protected boolean whw;
    protected boolean wjv;
    protected boolean xd;
    protected ViewGroup.LayoutParams xe;
    private boolean xh;
    protected ri<ViewGroup> xha;
    private boolean xlq;
    protected boolean xm;
    private boolean yjg;
    protected com.bytedance.adsdk.ugeno.ri.ri yjm;
    protected float zb;
    protected float zf;
    protected float zk;
    private boolean zv;
    private boolean zxp;
    protected float zyn;

    public ik(Context context) {
        this(context, null);
    }

    private void jbs() {
        aw awVar;
        if (this.vt == null || !lr(18) || (awVar = this.che.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectIk = awVar.ik();
        if (jSONObjectIk != null) {
            try {
                jSONObjectIk.put("rotateZ", com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObjectIk.optString("rotateZ"), this.ka));
            } catch (JSONException unused) {
            }
        }
        this.vt.ri(awVar, this, this);
    }

    @Deprecated
    private void ka() {
        com.bytedance.adsdk.ugeno.core.lr.ka kaVarKa;
        this.fi.setVisibility(this.nd);
        float f = this.jxw;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.fi.setRotation(f);
        }
        xha.ri riVar = this.mj;
        if (riVar != null && TextUtils.isEmpty(riVar.lr())) {
            this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.lr.ik.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ik ikVar = ik.this;
                    if (ikVar.eb != null) {
                        boolean unused = ikVar.klz;
                    }
                }
            });
        } else if (lr(1) && !this.fn) {
            this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.lr.ik.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ik ikVar = ik.this;
                    if (ikVar.vt == null || !ikVar.klz) {
                        return;
                    }
                    ik ikVar2 = ik.this;
                    vr vrVar = ikVar2.vt;
                    aw awVar = ikVar2.che.get(1);
                    ik ikVar3 = ik.this;
                    vrVar.ri(awVar, ikVar3, ikVar3);
                }
            });
        }
        if (this.vt != null && lr(4)) {
            if (lr(1)) {
                xd();
                this.xh = true;
                this.rbz = new fi(this.lr, this.che.get(4), this.che.get(1), this.xh, whw());
            } else {
                xd();
                this.rbz = new fi(this.lr, this.che.get(4), this.xh, whw());
            }
        }
        if (this.vt != null && lr(1) && this.fn) {
            xd();
            this.smj = new com.bytedance.adsdk.ugeno.core.lr.ik(this.lr, this.che.get(1));
        }
        jbs();
        if (this.vt != null && lr(3) && (kaVarKa = com.bytedance.adsdk.ugeno.fi.ri().ka()) != null) {
            this.eqw = kaVarKa.ri(this.lr, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.lr.ik.3
            };
        }
        if (this.vt != null && lr(9)) {
            di diVar = new di(this.lr, this.che.get(9), this);
            this.fb = diVar;
            diVar.ri(this.vt);
        }
        if (lr(10)) {
            com.bytedance.adsdk.ugeno.core.lr.lr lrVar = new com.bytedance.adsdk.ugeno.core.lr.lr(this.lr, this.che.get(10), this);
            this.bzf = lrVar;
            lrVar.ri(this.vt);
        }
    }

    private void qt() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.sf);
        this.fi.setContentDescription(sb);
    }

    private void rzk() {
        float f = this.siy ? this.tnn : this.zyn;
        float f2 = this.whw ? this.ta : this.zyn;
        float f3 = this.xm ? this.fe : this.zyn;
        float f4 = this.rzk ? this.bnj : this.zyn;
        this.ezp.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    private void xm() {
        if (TextUtils.equals("dashed", this.tw)) {
            GradientDrawable gradientDrawable = this.ezp;
            float f = this.qh;
            gradientDrawable.setStroke((int) f, this.gcp, 3.0f * f, f);
        } else {
            if (!TextUtils.equals("dotted", this.tw)) {
                this.ezp.setStroke((int) this.qh, this.gcp);
                return;
            }
            GradientDrawable gradientDrawable2 = this.ezp;
            float f2 = this.qh;
            gradientDrawable2.setStroke((int) f2, this.gcp, f2 / 2.0f, f2);
        }
    }

    public float ac() {
        return this.hws;
    }

    public void aw() {
        this.ib = this.ka.optBoolean("gesture_through_enable", false);
    }

    public vr ay() {
        return this.vt;
    }

    public void bgr() {
        this.fi.setPadding((int) (this.oh ? this.igq : this.su), (int) (this.dzy ? this.dw : this.su), (int) (this.xd ? this.zf : this.su), (int) (this.pv ? this.ory : this.su));
    }

    public float bnj() {
        T t = this.fi;
        return t instanceof com.bytedance.adsdk.ugeno.ri.xha ? ((com.bytedance.adsdk.ugeno.ri.xha) t).getRubIn() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float bu() {
        return this.ud;
    }

    public JSONObject co() {
        return this.ka;
    }

    public ik<T> di(String str) {
        return lr(str);
    }

    public ViewGroup.LayoutParams dw() {
        return this.xe;
    }

    public String dzy() {
        return this.f18024co;
    }

    public float fe() {
        T t = this.fi;
        return t instanceof com.bytedance.adsdk.ugeno.ri.xha ? ((com.bytedance.adsdk.ugeno.ri.xha) t).getShine() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ik<T> fi(String str) {
        return ri(str);
    }

    public long fr() {
        return this.mvf;
    }

    public boolean hcw() {
        return this.qt;
    }

    public int ig() {
        return (int) this.bgr;
    }

    public void igq() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapRi;
        if (TextUtils.isEmpty(this.qd)) {
            if (this.hd) {
                ri(this.sez);
                return;
            } else {
                this.ezp.setColor(this.ig);
                ka(this.ig);
                return;
            }
        }
        if (!this.qd.startsWith("local://")) {
            zf();
            return;
        }
        String strReplace = this.qd.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.kt ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.lr.getResources().openRawResource(com.bytedance.adsdk.ugeno.xha.ka.lr(this.lr, strReplace)), null, options);
            if (!this.kt || (bitmapRi = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, bitmapDecodeStream, (int) this.jc)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.lr.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.lr.getResources(), bitmapRi);
            }
            ri(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public float ihz() {
        return this.jxw;
    }

    public com.bytedance.adsdk.ugeno.ka.ri.ri jc() {
        return this.vz;
    }

    public void lr(JSONObject jSONObject) {
        this.ka = jSONObject;
        aw();
    }

    public void mj() {
        qt qtVar = this.amj;
        if (qtVar != null) {
            qtVar.lr();
        }
        com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
        if (riVar != null) {
            riVar.ik();
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            diVar.ik();
        }
    }

    public float nr() {
        return this.hpn;
    }

    public ri oh() {
        return this.di;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        fi fiVar;
        vr vrVar;
        com.bytedance.adsdk.ugeno.core.lr.ik ikVar;
        motionEvent.toString();
        int action = motionEvent.getAction();
        if (action == 0) {
            kt();
        } else if (action == 1 || action == 3) {
            feb();
        }
        slm slmVar = this.iph;
        if (slmVar != null) {
            slmVar.ri(this, motionEvent);
        }
        if (lr(17) && motionEvent.getAction() == 0) {
            this.vt.ri(this.che.get(17), this, this);
        }
        if (lr(1) && this.fn && (vrVar = this.vt) != null && (ikVar = this.smj) != null) {
            return ikVar.ri(vrVar, this, motionEvent);
        }
        vr vrVar2 = this.vt;
        if (vrVar2 != null && (fiVar = this.rbz) != null) {
            return fiVar.ri(vrVar2, this, motionEvent, whw());
        }
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            return jbsVar.ri(motionEvent);
        }
        return false;
    }

    public xha.ri ory() {
        return this.mj;
    }

    public int pv() {
        return (int) this.aw;
    }

    public boolean qd() {
        return this.aac;
    }

    public T ri() {
        return null;
    }

    public T sf() {
        return this.fi;
    }

    public boolean siy() {
        return this.adz;
    }

    public float slm() {
        return this.zk;
    }

    public int srn() {
        return this.ig;
    }

    public JSONObject su() {
        return this.ik;
    }

    public float ta() {
        T t = this.fi;
        return t instanceof com.bytedance.adsdk.ugeno.ri.xha ? ((com.bytedance.adsdk.ugeno.ri.xha) t).getStretch() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float tan() {
        return this.id;
    }

    public float tnn() {
        T t = this.fi;
        return t instanceof com.bytedance.adsdk.ugeno.ri.xha ? ((com.bytedance.adsdk.ugeno.ri.xha) t).getRipple() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float uq() {
        return this.nh;
    }

    public float vr() {
        return this.ajz;
    }

    public boolean whw() {
        return this.ib;
    }

    public float wjv() {
        return this.zyn;
    }

    public String xd() {
        return this.sf;
    }

    public void xha() {
        com.bytedance.adsdk.ugeno.core.ri riVar = this.sz;
        if (riVar != null) {
            qt qtVar = new qt(this.fi, riVar);
            this.amj = qtVar;
            qtVar.ri();
        }
        com.bytedance.adsdk.ugeno.ri.ri riVar2 = this.yjm;
        if (riVar2 != null) {
            riVar2.ri();
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            diVar.lr();
        }
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.fi();
        }
        if (this.bzf != null && lr(10)) {
            this.bzf.ri();
        }
        if (this.fb != null && lr(9)) {
            this.fb.ri();
        }
        fi fiVar = this.rbz;
        if (fiVar != null) {
            fiVar.ri();
        }
        this.mvf = System.currentTimeMillis();
    }

    public void zf() {
        com.bytedance.adsdk.ugeno.fi.ri().lr().ri(this.jbs, this.qd, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4
            @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
            public void ri(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                ik ikVar = ik.this;
                if (!ikVar.kt) {
                    com.bytedance.adsdk.ugeno.xha.mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ik.this.ri(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapRi = com.bytedance.adsdk.ugeno.xha.mj.ri(ikVar.lr, bitmap, (int) ikVar.jc);
                if (bitmapRi != null) {
                    com.bytedance.adsdk.ugeno.xha.mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ik.this.ri(new BitmapDrawable(bitmapRi));
                        }
                    });
                }
            }
        });
    }

    public boolean zyn() {
        return this.zb > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ik(Context context, ri<ViewGroup> riVar) {
        this.aw = -2.0f;
        this.bgr = -2.0f;
        this.tw = "solid";
        this.nd = 0;
        this.aac = true;
        this.pc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ajz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zk = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.luy = 1.0f;
        this.ud = 1.0f;
        this.hpn = 1.0f;
        this.qmx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.id = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.hws = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.jxw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.nh = 1.0f;
        this.jm = true;
        this.klz = true;
        this.lau = false;
        this.yjg = false;
        this.ib = false;
        this.cem = 12.0f;
        this.lr = context;
        this.di = riVar;
        this.che = new HashMap();
        this.ezp = new GradientDrawable();
        this.fi = (T) ri();
    }

    private ImageView.ScaleType aw(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.srn = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.srn = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.srn = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.srn = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.srn;
    }

    private void ik() {
        if (this.ri) {
            this.fi.setTranslationX(this.ajz);
        }
        if (this.akr) {
            this.fi.setTranslationY(this.zk);
        }
        if (this.de) {
            this.fi.setScaleX(this.ud);
        }
        if (this.zv) {
            this.fi.setScaleY(this.hpn);
        }
        if (this.xlq) {
            this.fi.setRotation(this.qmx);
        }
        if (this.zxp) {
            this.fi.setRotationX(this.id);
        }
        if (this.eu) {
            this.fi.setRotationY(-this.hws);
        }
        if (this.tpb) {
            this.fi.setAlpha(this.nh);
        }
        float f = this.jxw;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.fi.setRotation(f);
        }
        if (this.xlq || this.zxp || this.eu) {
            this.fi.setCameraDistance(10000.0f);
        }
    }

    public com.bytedance.adsdk.ugeno.ri.ri co(String str) {
        com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
        if (riVar != null && TextUtils.equals(str, riVar.fi())) {
            return this.yjm;
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            return diVar.ri(str);
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void di() {
        if (this.tq == null || this.tn) {
            return;
        }
        this.tn = true;
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void fi() {
        if (this.tq == null || this.skk) {
            return;
        }
        this.skk = true;
    }

    public void ri(JSONObject jSONObject) {
        this.ka = jSONObject;
        aw();
        JSONObject jSONObject2 = this.ik;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        ri.C0193ri c0193riQt = this.di != null ? this.di.qt() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(this.ik.optString(next), jSONObject);
            ri(next, strRi);
            if (c0193riQt != null) {
                c0193riQt.ri(this.lr, next, strRi);
            }
        }
        if (c0193riQt != null) {
            ri(c0193riQt.ri());
        }
        if (this.tyz == null || this.ka == null) {
            return;
        }
        try {
            if (!hcw()) {
                this.ka.put("i18n", this.tyz);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.tyz);
            this.ka.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public List<com.bytedance.adsdk.ugeno.ka.ka.ik> sf(String str) {
        jbs jbsVar;
        if (TextUtils.isEmpty(str) || (jbsVar = this.nbc) == null) {
            return null;
        }
        return jbsVar.ri(str);
    }

    public void lr() {
        igq();
        bgr();
        ik(this.nd);
        ik();
        ka();
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.ri();
            this.nbc.lr();
            this.nbc.ik();
        }
        this.fi.setOnTouchListener(this);
        qt();
        ViewGroup viewGroup = (ViewGroup) this.fi.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.jm);
        }
        com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
        if (riVar != null) {
            riVar.ka();
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            diVar.ri();
        }
        jbs jbsVar2 = this.nbc;
        if (jbsVar2 != null) {
            jbsVar2.ka();
        }
        if (this.vt == null || !lr(22)) {
            return;
        }
        this.vt.ri(this.che.get(22), this, this);
    }

    public void qt(String str) {
        this.f18024co = str;
    }

    public void di(int i) {
        if (hcw()) {
            T t = this.fi;
            if (t instanceof lr) {
                ((lr) t).lr(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof lr) {
                ((lr) viewParent).lr(this.fi, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.fi.getLayoutParams();
        layoutParams.height = i;
        this.fi.setLayoutParams(layoutParams);
    }

    public void fi(int i) {
        if (hcw()) {
            T t = this.fi;
            if (t instanceof lr) {
                ((lr) t).ri(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof lr) {
                ((lr) viewParent).ri(this.fi, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.fi.getLayoutParams();
        layoutParams.width = i;
        this.fi.setLayoutParams(layoutParams);
    }

    private boolean bgr(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    public ik<T> mj(String str) {
        return ka(str);
    }

    public void jbs(String str) {
        this.sf = str;
    }

    public ik<T> xha(String str) {
        return ik(str);
    }

    public void feb() {
    }

    public void kt() {
    }

    public void ri(nr nrVar) {
        this.tq = nrVar;
    }

    public void ri(slm slmVar) {
        this.iph = slmVar;
    }

    public void ik(int i) {
        ViewParent viewParent = (ViewGroup) this.fi.getParent();
        if (viewParent instanceof lr) {
            ((lr) viewParent).ik(this.fi, i);
        } else {
            this.fi.setVisibility(i);
        }
    }

    public void ri(vr vrVar) {
        this.vt = vrVar;
    }

    public void ri(com.bytedance.adsdk.ugeno.xha.ri.C0197ri c0197ri) {
        if (c0197ri == null) {
            return;
        }
        this.ezp.setShape(0);
        this.ezp.setOrientation(c0197ri.ri);
        if (Build.VERSION.SDK_INT >= 29) {
            this.ezp.setColors(c0197ri.lr, c0197ri.ik);
        } else {
            this.ezp.setColors(c0197ri.lr);
        }
        rzk();
        xm();
        this.fi.setBackground(this.ezp);
    }

    public boolean lr(int i) {
        Map<Integer, aw> map = this.che;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void ik(JSONObject jSONObject) {
        this.ik = jSONObject;
    }

    public ik<T> lr(String str) {
        if (TextUtils.isEmpty(this.f18024co) || !TextUtils.equals(this.f18024co, str)) {
            return null;
        }
        return this;
    }

    public ik<T> ik(String str) {
        if (!TextUtils.isEmpty(this.f18024co) && TextUtils.equals(this.f18024co, str) && this.nd == 0) {
            return this;
        }
        return null;
    }

    public void lr(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.che == null) {
            return;
        }
        try {
            int iRi = bgr.ri(str).ri();
            aw awVar = new aw();
            awVar.ri(iRi);
            awVar.ri(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iRi == 3) {
                try {
                    this.cem = Float.parseFloat(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("shakeAmplitude"), this.ka));
                } catch (NumberFormatException unused) {
                    this.cem = 12.0f;
                }
            }
            if (!(this.vt instanceof com.bytedance.adsdk.ugeno.core.ri.lr)) {
                ri(iRi, jSONObject, awVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    public void ri(Drawable drawable) {
        this.fi.setBackground(drawable);
    }

    public void ka(int i) {
        this.ezp.setShape(0);
        this.ezp.setColor(i);
        rzk();
        xm();
        this.fi.setBackground(this.ezp);
    }

    public void ri(ViewGroup.LayoutParams layoutParams) {
        T t = this.fi;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.xe = layoutParams;
    }

    public void ri(boolean z, boolean z2) {
        if (this.fi != null) {
            ri(this.xe);
            if (z) {
                fi((int) this.aw);
            }
            if (z2) {
                di((int) this.bgr);
            }
        }
    }

    public ik<T> ka(String str) {
        if (co(str) != null) {
            return this;
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void lr(Canvas canvas) {
        if (this instanceof ri) {
            com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
            if (riVar != null) {
                riVar.lr(canvas);
            }
            com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
            if (diVar != null) {
                diVar.lr(canvas);
            }
        }
    }

    public void ri(xha.ri riVar) {
        this.mj = riVar;
    }

    public ik<T> ri(String str) {
        if (TextUtils.isEmpty(this.sf) || !TextUtils.equals(this.sf, str)) {
            return null;
        }
        return this;
    }

    public void ri(boolean z) {
        this.qt = z;
    }

    public void ri(ri riVar) {
        this.di = riVar;
    }

    public void ri(sf sfVar) {
        this.jbs = sfVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void lr(int i, int i2, int i3, int i4) {
        qt qtVar = this.amj;
        if (qtVar != null) {
            qtVar.ri(i, i2);
        }
        com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
        if (riVar != null) {
            riVar.ri(i, i2);
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            diVar.ri(i, i2);
        }
    }

    public void ri(mj mjVar) {
        this.eb = mjVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b = 0;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    b = 1;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b = 2;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b = 3;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b = 4;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    b = 5;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b = 6;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b = 7;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b = 8;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b = 9;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b = 10;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    b = 11;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b = 12;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 13;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b = 14;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b = 15;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b = 18;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b = 19;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b = 20;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 21;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 22;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    b = 23;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b = 24;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b = 25;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    b = 26;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b = 27;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b = 28;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 29;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b = 30;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b = 31;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b = RemoteControlWriter.BLOCK_CMDOK;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b = 33;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    b = 34;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b = 35;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 36;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b = 37;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    b = 38;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b = 39;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b = 40;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b = 41;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b = 42;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b = 43;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b = 44;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b = 45;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b = 46;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b = 47;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b = 48;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b = 49;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 50;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b = 51;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b = 52;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b = 53;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b = 54;
                }
                break;
            case 1287124693:
                if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    b = 55;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b = 56;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b = 57;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b = 58;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b = 59;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b = 60;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b = 61;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b = 62;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b = RemoteControlWriter.BLOCK_CMDDUMP;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 65;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b = 66;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b = 67;
                }
                break;
        }
        switch (b) {
            case 0:
                this.klz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 39:
            case 48:
            case 51:
            case 54:
            case 62:
            case 64:
                lr(str, str2);
                break;
            case 2:
                this.ri = true;
                this.ajz = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 3:
                this.akr = true;
                this.zk = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case 4:
                this.igq = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.oh = true;
                break;
            case 5:
                this.ac = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 11:
            case 55:
                if (com.bytedance.adsdk.ugeno.xha.ri.ik(str2)) {
                    this.hd = true;
                    this.sez = com.bytedance.adsdk.ugeno.xha.ri.lr(str2);
                } else {
                    this.ig = com.bytedance.adsdk.ugeno.xha.ri.ri(str2, 0);
                    this.hd = false;
                }
                break;
            case 12:
                this.nbc = jbs.ri(this, str2);
                break;
            case 13:
                this.tpb = true;
                this.nh = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                break;
            case 14:
                this.tnn = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.siy = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.bgr = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.bgr = -2.0f;
                } else {
                    this.bgr = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                }
                this.yjg = true;
                break;
            case 16:
                this.vr = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                break;
            case 17:
                this.nr = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.ay = true;
                break;
            case 19:
            case 56:
                this.qd = str2;
                break;
            case 20:
                this.xlq = true;
                this.qmx = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 21:
                this.de = true;
                this.ud = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 22:
                this.zv = true;
                this.hpn = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 23:
                this.su = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.hcw = true;
                break;
            case 24:
                this.bfa = str2;
                break;
            case 25:
                this.tan = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.fr = true;
                break;
            case 26:
                this.ihz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 27:
                this.sf = str2;
                break;
            case 28:
                this.tyz = com.bytedance.adsdk.ugeno.xha.lr.ri(str2, (JSONObject) null);
                break;
            case 29:
                this.f18024co = str2;
                break;
            case 30:
                float fRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.jc = fRi;
                if (fRi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.kt = true;
                }
                break;
            case 31:
                this.dw = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.dzy = true;
                break;
            case 32:
                this.evm = str2;
                break;
            case 34:
                this.zb = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 35:
                this.de = true;
                this.zv = true;
                float[] fArrIk = com.bytedance.adsdk.ugeno.ri.ka.ik(str2);
                this.ud = fArrIk[0];
                this.hpn = fArrIk[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.aw = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.aw = -2.0f;
                } else {
                    this.aw = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                }
                this.lau = true;
                break;
            case 37:
                this.ory = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.pv = true;
                break;
            case 38:
                List<com.bytedance.adsdk.ugeno.ri.ik> listRi = com.bytedance.adsdk.ugeno.ri.ka.ri(str2, this.ka);
                if (listRi != null && !listRi.isEmpty()) {
                    this.saa = new com.bytedance.adsdk.ugeno.ri.di(this.lr, this, listRi);
                    break;
                }
                break;
            case 40:
                this.ta = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.whw = true;
                break;
            case 41:
                this.jm = bgr(str2);
                break;
            case 42:
                this.fe = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.xm = true;
                break;
            case 43:
                this.bnj = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.rzk = true;
                break;
            case 44:
                this.zf = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.xd = true;
                break;
            case 45:
                this.gcp = com.bytedance.adsdk.ugeno.xha.ri.ri(str2);
                break;
            case 46:
                this.tw = str2;
                break;
            case 47:
                this.qh = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                break;
            case 49:
                this.bu = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.wjv = true;
                break;
            case 50:
                this.ri = true;
                this.akr = true;
                float[] fArrIk2 = com.bytedance.adsdk.ugeno.ri.ka.ik(str2);
                this.ajz = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, fArrIk2[0]);
                this.zk = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, fArrIk2[1]);
                break;
            case 52:
                try {
                    this.yjm = new com.bytedance.adsdk.ugeno.ri.ri(this.lr, this, com.bytedance.adsdk.ugeno.ri.ka.ri(new JSONObject(str2), this.ka));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 53:
                this.sz = com.bytedance.adsdk.ugeno.core.ri.ri(str2, this);
                break;
            case 57:
                this.feb = true;
                this.srn = aw(str2);
                break;
            case 58:
                this.zyn = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                break;
            case 59:
                this.zxp = true;
                this.id = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 60:
                this.eu = true;
                this.hws = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 61:
                this.jxw = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 63:
                this.adz = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, false);
                break;
            case 65:
                if (TextUtils.equals("visible", str2)) {
                    this.nd = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.nd = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.nd = 8;
                }
                this.fi.setVisibility(this.nd);
                break;
            case 66:
                this.slm = com.bytedance.adsdk.ugeno.xha.mj.ri(this.lr, str2);
                this.uq = true;
                break;
            case 67:
                this.aac = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public ik lr(ik ikVar) {
        return (ikVar.oh() == null && (ikVar instanceof ri)) ? ikVar : lr(ikVar.oh());
    }

    @Deprecated
    public void ri(int i, JSONObject jSONObject, aw awVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            aw awVar2 = new aw();
            awVar2.ri(jSONObjectOptJSONObject);
            awVar2.ri(this);
            awVar.ri(awVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(X3.g.e);
        if (jSONObjectOptJSONObject2 != null) {
            aw awVar3 = new aw();
            awVar3.ri(jSONObjectOptJSONObject2);
            awVar3.ri(this);
            awVar.lr(awVar3);
        }
        awVar.ri(jSONObject);
        this.che.put(Integer.valueOf(i), awVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public int[] ri(int i, int i2) {
        if (this.zb > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.lau) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.zb;
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.yjg) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.zb;
                if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.tq != null && !this.jg) {
            this.jg = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void ri(int i, int i2, int i3, int i4) {
        if (this.tq == null || this.tyc) {
            return;
        }
        this.tyc = true;
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void ri(Canvas canvas, IAnimation iAnimation) {
        qt qtVar = this.amj;
        if (qtVar != null) {
            qtVar.ri(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ka
    public void ri(Canvas canvas) {
        if (this instanceof ri) {
            return;
        }
        com.bytedance.adsdk.ugeno.ri.ri riVar = this.yjm;
        if (riVar != null) {
            riVar.ri(canvas);
        }
        com.bytedance.adsdk.ugeno.ri.di diVar = this.saa;
        if (diVar != null) {
            diVar.ri(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vr.lr
    public void ri(aw awVar) {
        ri<ViewGroup> riVar;
        ik<T> ikVarFi;
        if (awVar == null || awVar.ik() == null || !TextUtils.equals(awVar.ik().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = awVar.ik().optString("nodeId");
        ik(8);
        this.xha = (ri) lr(this);
        if (TextUtils.isEmpty(strOptString) || (riVar = this.xha) == null || (ikVarFi = riVar.fi(strOptString)) == null) {
            return;
        }
        ikVarFi.ik(8);
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.ri.ri riVar) {
        this.vz = riVar;
    }

    public void ri(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.ka.ka.ik> listSf = sf(str);
        if (listSf == null || listSf.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.ka.ka.ik ikVar : listSf) {
            ikVar.ri(this.nbc);
            ikVar.ri(objArr);
        }
    }

    public void ri(com.bytedance.adsdk.ugeno.core.fi fiVar) {
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.ri(fiVar);
        }
    }

    public void ri(com.bytedance.adsdk.ugeno.core.di diVar) {
        this.pu = diVar;
    }

    public void ri(com.bytedance.adsdk.ugeno.ka.aw awVar) {
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.ri(awVar);
        }
    }
}
