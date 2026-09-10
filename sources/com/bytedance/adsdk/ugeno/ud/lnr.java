package com.bytedance.adsdk.ugeno.ud;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.jl;
import com.bytedance.adsdk.ugeno.core.jpc;
import com.bytedance.adsdk.ugeno.core.jtx;
import com.bytedance.adsdk.ugeno.core.rdp;
import com.bytedance.adsdk.ugeno.core.rq;
import com.bytedance.adsdk.ugeno.core.to;
import com.bytedance.adsdk.ugeno.core.ud.mzz;
import com.bytedance.adsdk.ugeno.core.wd;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.mml.tvp;
import com.bytedance.adsdk.ugeno.qdl.mo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lnr<T extends View> implements View.OnTouchListener, bjy.qdl, bjy.ud, mml {
    protected float aaj;
    protected float ag;
    private boolean auu;
    protected ImageView.ScaleType ax;
    private boolean az;
    protected boolean bch;
    protected float bjy;
    protected jpc blf;
    private boolean bo;
    protected float bqt;
    protected jtx bx;
    private boolean ca;
    protected String car;
    protected float cx;
    protected boolean dk;
    private boolean dps;
    protected boolean ekw;
    protected mo en;
    private boolean eta;
    protected float ew;
    protected float exc;
    protected float exu;
    protected boolean fco;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.lnr fge;
    private com.bytedance.adsdk.ugeno.mml.qdl.qdl fhs;
    protected String fs;
    protected float fzn;
    protected float gg;
    private boolean gsp;
    private boolean gsv;
    protected float gt;
    protected String gy;

    @Deprecated
    private mzz hcs;
    private com.bytedance.adsdk.ugeno.core.qdl hd;
    protected boolean hkc;
    private String hr;
    private boolean hvi;
    protected boolean hzv;
    protected ViewGroup.LayoutParams ijp;
    private long ir;
    protected float irn;
    private boolean iw;
    protected float ji;
    protected boolean jjk;
    protected float jl;
    protected com.bytedance.adsdk.ugeno.wd.qdl.C0071qdl jle;
    protected Map<Integer, exu> jnw;
    protected wd.qdl jpc;
    protected float jtx;
    protected com.bytedance.adsdk.ugeno.core.mo jut;
    protected float jyq;
    protected float kab;
    protected boolean kdv;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.mml.qdl kj;
    protected float koa;
    private boolean kr;
    protected boolean ljh;
    private boolean lme;
    protected JSONObject lnr;
    protected float lq;
    protected float lte;
    protected int mlb;
    protected JSONObject mml;
    protected qdl<ViewGroup> mo;
    protected int mrf;
    protected T mzz;
    private boolean nts;
    protected float nz;
    private to od;
    protected boolean om;
    protected boolean oth;
    private boolean oz;
    private boolean qdl;
    protected float qk;
    protected float ra;
    protected float rc;
    protected float rdp;
    protected String rq;
    protected float rzg;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.mo se;
    private boolean skm;
    protected int sy;
    private boolean syy;
    protected boolean taz;
    private boolean tdy;
    protected float tid;
    protected boolean to;
    protected float tqd;
    protected rq tvp;
    protected Context ud;
    private boolean uvi;
    protected boolean uw;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.ud.ud vc;
    private String vm;
    private jl vr;
    protected float vu;
    private float vxg;
    protected float wak;
    protected boolean wc;
    protected qdl<ViewGroup> wd;
    protected tvp xdk;
    protected boolean xi;
    protected float xmv;
    private boolean xx;
    private GradientDrawable ygv;
    protected float yh;
    private JSONObject yre;
    protected float yt;
    protected boolean zlt;
    protected boolean zpu;
    protected bjy zvv;
    protected com.bytedance.adsdk.ugeno.qdl.qdl zy;

    public lnr(Context context) {
        this(context, null);
    }

    @Deprecated
    private void mml() {
        com.bytedance.adsdk.ugeno.core.ud.mml mmlVarMml;
        this.mzz.setVisibility(this.mlb);
        float f = this.ji;
        if (f != 0.0f) {
            this.mzz.setRotation(f);
        }
        wd.qdl qdlVar = this.jpc;
        if (qdlVar != null && TextUtils.isEmpty(qdlVar.ud())) {
            this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lnr lnrVar = lnr.this;
                    if (lnrVar.blf != null) {
                        boolean unused = lnrVar.oz;
                    }
                }
            });
        } else if (ud(1) && !this.nts) {
            this.mzz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    lnr lnrVar = lnr.this;
                    if (lnrVar.zvv == null || !lnrVar.oz) {
                        return;
                    }
                    lnr lnrVar2 = lnr.this;
                    bjy bjyVar = lnrVar2.zvv;
                    exu exuVar = lnrVar2.jnw.get(1);
                    lnr lnrVar3 = lnr.this;
                    bjyVar.qdl(exuVar, lnrVar3, lnrVar3);
                }
            });
        }
        if (this.zvv != null && ud(4)) {
            if (ud(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + hkc());
                this.eta = true;
                this.hcs = new mzz(this.ud, this.jnw.get(4), this.jnw.get(1), this.eta, jjk());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + hkc());
                this.hcs = new mzz(this.ud, this.jnw.get(4), this.eta, jjk());
            }
        }
        if (this.zvv != null && ud(1) && this.nts) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.nts + ", view.id: " + hkc());
            this.fge = new com.bytedance.adsdk.ugeno.core.ud.lnr(this.ud, this.jnw.get(1));
        }
        tvp();
        if (this.zvv != null && ud(3) && (mmlVarMml = com.bytedance.adsdk.ugeno.mzz.qdl().mml()) != null) {
            this.kj = mmlVarMml.qdl(this.ud, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.3
            };
        }
        if (this.zvv != null && ud(9)) {
            com.bytedance.adsdk.ugeno.core.ud.mo moVar = new com.bytedance.adsdk.ugeno.core.ud.mo(this.ud, this.jnw.get(9), this);
            this.se = moVar;
            moVar.qdl(this.zvv);
        }
        if (ud(10)) {
            com.bytedance.adsdk.ugeno.core.ud.ud udVar = new com.bytedance.adsdk.ugeno.core.ud.ud(this.ud, this.jnw.get(10), this);
            this.vc = udVar;
            udVar.qdl(this.zvv);
        }
    }

    private void taz() {
        float f = this.xi ? this.yh : this.cx;
        float f2 = this.jjk ? this.gt : this.cx;
        float f3 = this.zlt ? this.wak : this.cx;
        float f4 = this.taz ? this.irn : this.cx;
        this.ygv.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    private void to() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.rq);
        this.mzz.setContentDescription(sb);
    }

    private void tvp() {
        exu exuVar;
        if (this.zvv == null || !ud(18) || (exuVar = this.jnw.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectLnr = exuVar.lnr();
        if (jSONObjectLnr != null) {
            try {
                jSONObjectLnr.put("rotateZ", com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObjectLnr.optString("rotateZ"), this.mml));
            } catch (JSONException unused) {
            }
        }
        this.zvv.qdl(exuVar, this, this);
    }

    private void zlt() {
        if (TextUtils.equals("dashed", this.car)) {
            GradientDrawable gradientDrawable = this.ygv;
            float f = this.tid;
            gradientDrawable.setStroke((int) f, this.sy, 3.0f * f, f);
        } else {
            if (!TextUtils.equals("dotted", this.car)) {
                this.ygv.setStroke((int) this.tid, this.sy);
                return;
            }
            GradientDrawable gradientDrawable2 = this.ygv;
            float f2 = this.tid;
            gradientDrawable2.setStroke((int) f2, this.sy, f2 / 2.0f, f2);
        }
    }

    public float aaj() {
        return this.rzg;
    }

    public com.bytedance.adsdk.ugeno.mml.qdl.qdl ag() {
        return this.fhs;
    }

    public int ax() {
        return this.mrf;
    }

    public bjy bch() {
        return this.zvv;
    }

    public float bjy() {
        return this.kab;
    }

    public void bqt() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapQdl;
        if (TextUtils.isEmpty(this.gy)) {
            if (this.zpu) {
                qdl(this.jle);
                return;
            } else {
                this.ygv.setColor(this.mrf);
                mml(this.mrf);
                return;
            }
        }
        if (!this.gy.startsWith("local://")) {
            koa();
            return;
        }
        String strReplace = this.gy.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.wc ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.ud.getResources().openRawResource(com.bytedance.adsdk.ugeno.wd.mml.ud(this.ud, strReplace)), null, options);
            if (!this.wc || (bitmapQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, bitmapDecodeStream, (int) this.ag)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.ud.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.ud.getResources(), bitmapQdl);
            }
            qdl(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public boolean cx() {
        return this.lte > 0.0f;
    }

    public qdl ekw() {
        return this.mo;
    }

    public float exc() {
        return this.gg;
    }

    public void exu() {
        this.bo = this.mml.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.bo);
    }

    public int fco() {
        return (int) this.exu;
    }

    public JSONObject fs() {
        return this.mml;
    }

    public float gt() {
        T t = this.mzz;
        if (t instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t).getStretch();
        }
        return 0.0f;
    }

    public boolean gy() {
        return this.dk;
    }

    public String hkc() {
        return this.rq;
    }

    public String hzv() {
        return this.fs;
    }

    public float irn() {
        T t = this.mzz;
        if (t instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t).getRubIn();
        }
        return 0.0f;
    }

    public boolean jjk() {
        return this.bo;
    }

    public float jl() {
        return this.fzn;
    }

    public void jpc() {
        to toVar = this.od;
        if (toVar != null) {
            toVar.ud();
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.lnr();
        }
    }

    public float jtx() {
        return this.ra;
    }

    public float jyq() {
        return this.ji;
    }

    public boolean kdv() {
        return this.to;
    }

    public void koa() {
        com.bytedance.adsdk.ugeno.mzz.qdl().ud().qdl(this.tvp, this.gy, new com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4
            @Override // com.bytedance.adsdk.ugeno.qdl.InterfaceC0066qdl
            public void qdl(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                lnr lnrVar = lnr.this;
                if (!lnrVar.wc) {
                    com.bytedance.adsdk.ugeno.wd.jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            lnr.this.qdl(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(lnrVar.ud, bitmap, (int) lnrVar.ag);
                if (bitmapQdl != null) {
                    com.bytedance.adsdk.ugeno.wd.jpc.qdl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ud.lnr.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            lnr.this.qdl(new BitmapDrawable(bitmapQdl));
                        }
                    });
                }
            }
        });
    }

    public float ljh() {
        return this.cx;
    }

    public lnr<T> mo(String str) {
        return ud(str);
    }

    public int mrf() {
        return (int) this.rdp;
    }

    public lnr<T> mzz(String str) {
        return qdl(str);
    }

    public void om() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        mzz mzzVar;
        bjy bjyVar;
        com.bytedance.adsdk.ugeno.core.ud.lnr lnrVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            wc();
        } else if (action == 1 || action == 3) {
            om();
        }
        jtx jtxVar = this.bx;
        if (jtxVar != null) {
            jtxVar.qdl(this, motionEvent);
        }
        if (ud(17) && motionEvent.getAction() == 0) {
            this.zvv.qdl(this.jnw.get(17), this, this);
        }
        if (ud(1) && this.nts && (bjyVar = this.zvv) != null && (lnrVar = this.fge) != null) {
            return lnrVar.qdl(bjyVar, this, motionEvent);
        }
        bjy bjyVar2 = this.zvv;
        if (bjyVar2 != null && (mzzVar = this.hcs) != null) {
            return mzzVar.qdl(bjyVar2, this, motionEvent, jjk());
        }
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            return tvpVar.qdl(motionEvent);
        }
        return false;
    }

    public float oth() {
        return this.ew;
    }

    public T qdl() {
        return null;
    }

    public wd.qdl rc() {
        return this.jpc;
    }

    public void rdp() {
        this.mzz.setPadding((int) (this.ekw ? this.bqt : this.xmv), (int) (this.hzv ? this.vu : this.xmv), (int) (this.hkc ? this.koa : this.xmv), (int) (this.fco ? this.rc : this.xmv));
    }

    public T rq() {
        return this.mzz;
    }

    public void ud(JSONObject jSONObject) {
        this.mml = jSONObject;
        exu();
    }

    public long uw() {
        return this.ir;
    }

    public ViewGroup.LayoutParams vu() {
        return this.ijp;
    }

    public float wak() {
        T t = this.mzz;
        if (t instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t).getShine();
        }
        return 0.0f;
    }

    public void wc() {
    }

    public void wd() {
        com.bytedance.adsdk.ugeno.core.qdl qdlVar = this.hd;
        if (qdlVar != null) {
            to toVar = new to(this.mzz, qdlVar);
            this.od = toVar;
            toVar.qdl();
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar2 = this.zy;
        if (qdlVar2 != null) {
            qdlVar2.qdl();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.ud();
        }
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.mzz();
        }
        if (this.vc != null && ud(10)) {
            this.vc.qdl();
        }
        if (this.se != null && ud(9)) {
            this.se.qdl();
        }
        mzz mzzVar = this.hcs;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        this.ir = System.currentTimeMillis();
    }

    public boolean xi() {
        return this.gsp;
    }

    public JSONObject xmv() {
        return this.lnr;
    }

    public float yh() {
        T t = this.mzz;
        if (t instanceof com.bytedance.adsdk.ugeno.qdl.wd) {
            return ((com.bytedance.adsdk.ugeno.qdl.wd) t).getRipple();
        }
        return 0.0f;
    }

    public float yt() {
        return this.tqd;
    }

    public lnr(Context context, qdl<ViewGroup> qdlVar) {
        this.exu = -2.0f;
        this.rdp = -2.0f;
        this.car = "solid";
        this.mlb = 0;
        this.dk = true;
        this.nz = 0.0f;
        this.kab = 0.0f;
        this.ra = 0.0f;
        this.qk = 1.0f;
        this.tqd = 1.0f;
        this.fzn = 1.0f;
        this.lq = 0.0f;
        this.gg = 0.0f;
        this.rzg = 0.0f;
        this.ji = 0.0f;
        this.ew = 1.0f;
        this.ca = true;
        this.oz = true;
        this.skm = false;
        this.az = false;
        this.bo = false;
        this.vxg = 12.0f;
        this.ud = context;
        this.mo = qdlVar;
        this.jnw = new HashMap();
        this.ygv = new GradientDrawable();
        this.mzz = (T) qdl();
    }

    private boolean bjy(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    private void lnr() {
        if (this.qdl) {
            this.mzz.setTranslationX(this.kab);
        }
        if (this.dps) {
            this.mzz.setTranslationY(this.ra);
        }
        if (this.iw) {
            this.mzz.setScaleX(this.tqd);
        }
        if (this.lme) {
            this.mzz.setScaleY(this.fzn);
        }
        if (this.kr) {
            this.mzz.setRotation(this.lq);
        }
        if (this.xx) {
            this.mzz.setRotationX(this.gg);
        }
        if (this.syy) {
            this.mzz.setRotationY(-this.rzg);
        }
        if (this.tdy) {
            this.mzz.setAlpha(this.ew);
        }
        float f = this.ji;
        if (f != 0.0f) {
            this.mzz.setRotation(f);
        }
        if (this.kr || this.xx || this.syy) {
            this.mzz.setCameraDistance(10000.0f);
        }
    }

    public com.bytedance.adsdk.ugeno.mml.mml.lnr fs(String str) {
        tvp tvpVar;
        if (TextUtils.isEmpty(str) || (tvpVar = this.xdk) == null) {
            return null;
        }
        return tvpVar.ud(str);
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void mo() {
        if (this.vr == null || this.hvi) {
            return;
        }
        this.hvi = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void mzz() {
        if (this.vr == null || this.auu) {
            return;
        }
        this.auu = true;
    }

    public void qdl(JSONObject jSONObject) {
        this.mml = jSONObject;
        exu();
        JSONObject jSONObject2 = this.lnr;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        qdl.C0070qdl c0070qdl = this.mo != null ? this.mo.to() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(this.lnr.optString(next), jSONObject);
            qdl(next, strQdl);
            if (c0070qdl != null) {
                c0070qdl.qdl(this.ud, next, strQdl);
            }
        }
        if (c0070qdl != null) {
            qdl(c0070qdl.qdl());
        }
        if (this.yre == null || this.mml == null) {
            return;
        }
        try {
            if (!kdv()) {
                this.mml.put("i18n", this.yre);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.yre);
            this.mml.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public List<com.bytedance.adsdk.ugeno.mml.mml.lnr> rq(String str) {
        tvp tvpVar;
        if (TextUtils.isEmpty(str) || (tvpVar = this.xdk) == null) {
            return null;
        }
        return tvpVar.qdl(str);
    }

    public com.bytedance.adsdk.ugeno.qdl.qdl exu(String str) {
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null && TextUtils.equals(str, qdlVar.mzz())) {
            return this.zy;
        }
        mo moVar = this.en;
        if (moVar != null) {
            return moVar.qdl(str);
        }
        return null;
    }

    public void ud() {
        bqt();
        rdp();
        lnr(this.mlb);
        lnr();
        mml();
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl();
            this.xdk.ud();
            this.xdk.lnr();
        }
        this.mzz.setOnTouchListener(this);
        to();
        ViewGroup viewGroup = (ViewGroup) this.mzz.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.ca);
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.mml();
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl();
        }
        tvp tvpVar2 = this.xdk;
        if (tvpVar2 != null) {
            tvpVar2.mml();
        }
        if (this.zvv == null || !ud(22)) {
            return;
        }
        this.zvv.qdl(this.jnw.get(22), this, this);
    }

    public void to(String str) {
        this.fs = str;
    }

    public void mo(int i2) {
        if (kdv()) {
            T t = this.mzz;
            if (t instanceof ud) {
                ((ud) t).ud(i2);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof ud) {
                ((ud) viewParent).ud(this.mzz, i2);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mzz.getLayoutParams();
        layoutParams.height = i2;
        this.mzz.setLayoutParams(layoutParams);
    }

    public void mzz(int i2) {
        if (kdv()) {
            T t = this.mzz;
            if (t instanceof ud) {
                ((ud) t).qdl(i2);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof ud) {
                ((ud) viewParent).qdl(this.mzz, i2);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mzz.getLayoutParams();
        layoutParams.width = i2;
        this.mzz.setLayoutParams(layoutParams);
    }

    private ImageView.ScaleType rdp(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.ax = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.ax = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.ax = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.ax = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.ax;
    }

    public lnr<T> jpc(String str) {
        return mml(str);
    }

    public void tvp(String str) {
        this.rq = str;
    }

    public lnr<T> wd(String str) {
        return lnr(str);
    }

    public void qdl(jl jlVar) {
        this.vr = jlVar;
    }

    public void qdl(jtx jtxVar) {
        this.bx = jtxVar;
    }

    public void lnr(int i2) {
        ViewParent viewParent = (ViewGroup) this.mzz.getParent();
        if (viewParent instanceof ud) {
            ((ud) viewParent).lnr(this.mzz, i2);
        } else {
            this.mzz.setVisibility(i2);
        }
    }

    public void qdl(bjy bjyVar) {
        this.zvv = bjyVar;
    }

    public void qdl(com.bytedance.adsdk.ugeno.wd.qdl.C0071qdl c0071qdl) {
        if (c0071qdl == null) {
            return;
        }
        this.ygv.setShape(0);
        this.ygv.setOrientation(c0071qdl.qdl);
        if (Build.VERSION.SDK_INT >= 29) {
            this.ygv.setColors(c0071qdl.ud, c0071qdl.lnr);
        } else {
            this.ygv.setColors(c0071qdl.ud);
        }
        taz();
        zlt();
        this.mzz.setBackground(this.ygv);
    }

    public boolean ud(int i2) {
        Map<Integer, exu> map = this.jnw;
        return map != null && map.containsKey(Integer.valueOf(i2));
    }

    public void lnr(JSONObject jSONObject) {
        this.lnr = jSONObject;
    }

    public lnr<T> ud(String str) {
        if (TextUtils.isEmpty(this.fs) || !TextUtils.equals(this.fs, str)) {
            return null;
        }
        return this;
    }

    public lnr<T> lnr(String str) {
        if (!TextUtils.isEmpty(this.fs) && TextUtils.equals(this.fs, str) && this.mlb == 0) {
            return this;
        }
        return null;
    }

    public void ud(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.jnw == null) {
            return;
        }
        try {
            int iQdl = rdp.qdl(str).qdl();
            exu exuVar = new exu();
            exuVar.qdl(iQdl);
            exuVar.qdl(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iQdl == 3) {
                try {
                    this.vxg = Float.parseFloat(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("shakeAmplitude"), this.mml));
                } catch (NumberFormatException unused) {
                    this.vxg = 12.0f;
                }
            }
            if (!(this.zvv instanceof com.bytedance.adsdk.ugeno.core.qdl.ud)) {
                qdl(iQdl, jSONObject, exuVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    public void mml(int i2) {
        this.ygv.setShape(0);
        this.ygv.setColor(i2);
        taz();
        zlt();
        this.mzz.setBackground(this.ygv);
    }

    public void qdl(Drawable drawable) {
        this.mzz.setBackground(drawable);
    }

    public void qdl(ViewGroup.LayoutParams layoutParams) {
        T t = this.mzz;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.ijp = layoutParams;
    }

    public lnr<T> mml(String str) {
        if (exu(str) != null) {
            return this;
        }
        return null;
    }

    public void qdl(boolean z2, boolean z3) {
        if (this.mzz != null) {
            qdl(this.ijp);
            if (z2) {
                mzz((int) this.exu);
            }
            if (z3) {
                mo((int) this.rdp);
            }
        }
    }

    public void qdl(wd.qdl qdlVar) {
        this.jpc = qdlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void ud(Canvas canvas) {
        if (this instanceof qdl) {
            com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
            if (qdlVar != null) {
                qdlVar.ud(canvas);
            }
            mo moVar = this.en;
            if (moVar != null) {
                moVar.ud(canvas);
            }
        }
    }

    public lnr<T> qdl(String str) {
        if (TextUtils.isEmpty(this.rq) || !TextUtils.equals(this.rq, str)) {
            return null;
        }
        return this;
    }

    public void qdl(boolean z2) {
        this.to = z2;
    }

    public void qdl(qdl qdlVar) {
        this.mo = qdlVar;
    }

    public void qdl(rq rqVar) {
        this.tvp = rqVar;
    }

    public void qdl(jpc jpcVar) {
        this.blf = jpcVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void ud(int i2, int i3, int i4, int i5) {
        to toVar = this.od;
        if (toVar != null) {
            toVar.qdl(i2, i3);
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.qdl(i2, i3);
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl(i2, i3);
        }
    }

    public void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "clickable":
                this.oz = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case "onRenderSuccess":
            case "onDelay":
            case "onShake":
            case "onSlide":
            case "onTimer":
            case "onTwist":
            case "onDown":
            case "onTap":
            case "onLoadMore":
            case "onExposure":
            case "onAnimation":
            case "onPullToRefresh":
            case "onScroll":
            case "onLongTap":
                ud(str, str2);
                break;
            case "translateX":
                this.qdl = true;
                this.kab = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "translateY":
                this.dps = true;
                this.ra = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case "paddingLeft":
                this.bqt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.ekw = true;
                break;
            case "minWidth":
                this.aaj = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "background":
            case "backgroundColor":
                if (com.bytedance.adsdk.ugeno.wd.qdl.lnr(str2)) {
                    this.zpu = true;
                    this.jle = com.bytedance.adsdk.ugeno.wd.qdl.ud(str2);
                    break;
                } else {
                    this.mrf = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2, 0);
                    this.zpu = false;
                    break;
                }
                break;
            case "events":
                this.xdk = tvp.qdl(this, str2);
                break;
            case "opacity":
                this.tdy = true;
                this.ew = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case "borderTopLeftRadius":
                this.yh = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.xi = true;
                break;
            case "height":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.rdp = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.rdp = -2.0f;
                } else {
                    this.rdp = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                }
                this.az = true;
                break;
            case "margin":
                this.bjy = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                break;
            case "marginTop":
                this.jl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.bch = true;
                break;
            case "backgroundDrawable":
            case "backgroundImage":
                this.gy = str2;
                break;
            case "rotate":
                this.kr = true;
                this.lq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "scaleX":
                this.iw = true;
                this.tqd = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "scaleY":
                this.lme = true;
                this.fzn = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "padding":
                this.xmv = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.kdv = true;
                break;
            case "triggerFunc":
                this.vm = str2;
                break;
            case "marginBottom":
                this.exc = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.uw = true;
                break;
            case "minHeight":
                this.jyq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "id":
                this.rq = str2;
                break;
            case "i18n":
                this.yre = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONObject) null);
                break;
            case "name":
                this.fs = str2;
                break;
            case "backgroundImageBlur":
                float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                this.ag = fQdl;
                if (fQdl > 0.0f) {
                    this.wc = true;
                    break;
                }
                break;
            case "paddingTop":
                this.vu = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.hzv = true;
                break;
            case "click":
                this.hr = str2;
                break;
            case "ratio":
                this.lte = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "scale":
                this.iw = true;
                this.lme = true;
                float[] fArrLnr = com.bytedance.adsdk.ugeno.qdl.mml.lnr(str2);
                this.tqd = fArrLnr[0];
                this.fzn = fArrLnr[1];
                break;
            case "width":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.exu = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.exu = -2.0f;
                } else {
                    this.exu = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                }
                this.skm = true;
                break;
            case "paddingBottom":
                this.rc = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.fco = true;
                break;
            case "animations":
                List<com.bytedance.adsdk.ugeno.qdl.lnr> listQdl = com.bytedance.adsdk.ugeno.qdl.mml.qdl(str2, this.mml);
                if (listQdl != null && !listQdl.isEmpty()) {
                    this.en = new mo(this.ud, this, listQdl);
                    break;
                }
                break;
            case "borderTopRightRadius":
                this.gt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.jjk = true;
                break;
            case "overflow":
                this.ca = bjy(str2);
                break;
            case "borderBottomLeftRadius":
                this.wak = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.zlt = true;
                break;
            case "borderBottomRightRadius":
                this.irn = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.taz = true;
                break;
            case "paddingRight":
                this.koa = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.hkc = true;
                break;
            case "borderColor":
                this.sy = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case "borderStyle":
                this.car = str2;
                break;
            case "borderWidth":
                this.tid = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                break;
            case "marginRight":
                this.yt = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.ljh = true;
                break;
            case "translate":
                this.qdl = true;
                this.dps = true;
                float[] fArrLnr2 = com.bytedance.adsdk.ugeno.qdl.mml.lnr(str2);
                this.kab = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, fArrLnr2[0]);
                this.ra = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, fArrLnr2[1]);
                break;
            case "animation":
                try {
                    this.zy = new com.bytedance.adsdk.ugeno.qdl.qdl(this.ud, this, com.bytedance.adsdk.ugeno.qdl.mml.qdl(new JSONObject(str2), this.mml));
                    break;
                } catch (JSONException unused) {
                    return;
                }
                break;
            case "animatorSet":
                this.hd = com.bytedance.adsdk.ugeno.core.qdl.qdl(str2, this);
                break;
            case "backgroundScale":
                this.om = true;
                this.ax = rdp(str2);
                break;
            case "borderRadius":
                this.cx = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                break;
            case "rotateX":
                this.xx = true;
                this.gg = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "rotateY":
                this.syy = true;
                this.rzg = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "rotateZ":
                this.ji = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case "disable":
                this.gsp = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, false);
                break;
            case "visibility":
                if (TextUtils.equals("visible", str2)) {
                    this.mlb = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.mlb = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.mlb = 8;
                }
                this.mzz.setVisibility(this.mlb);
                break;
            case "marginLeft":
                this.jtx = com.bytedance.adsdk.ugeno.wd.jpc.qdl(this.ud, str2);
                this.oth = true;
                break;
            case "availability":
                this.dk = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public lnr ud(lnr lnrVar) {
        return (lnrVar.ekw() == null && (lnrVar instanceof qdl)) ? lnrVar : ud(lnrVar.ekw());
    }

    public void ud(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVarFs = fs(str);
        if (lnrVarFs == null) {
            return;
        }
        lnrVarFs.qdl(this.xdk);
        lnrVarFs.qdl(objArr);
    }

    @Deprecated
    public void qdl(int i2, JSONObject jSONObject, exu exuVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            exu exuVar2 = new exu();
            exuVar2.qdl(jSONObjectOptJSONObject);
            exuVar2.qdl(this);
            exuVar.qdl(exuVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            exu exuVar3 = new exu();
            exuVar3.qdl(jSONObjectOptJSONObject2);
            exuVar3.qdl(this);
            exuVar.ud(exuVar3);
        }
        exuVar.qdl(jSONObject);
        this.jnw.put(Integer.valueOf(i2), exuVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public int[] qdl(int i2, int i3) {
        if (this.lte > 0.0f) {
            if (this.skm) {
                int size = View.MeasureSpec.getSize(i2);
                float f = this.lte;
                if (f != 0.0f) {
                    i3 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.az) {
                int size2 = View.MeasureSpec.getSize(i3);
                float f2 = this.lte;
                if (f2 != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.vr != null && !this.gsv) {
            this.gsv = true;
        }
        return new int[]{i2, i3};
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(int i2, int i3, int i4, int i5) {
        if (this.vr == null || this.uvi) {
            return;
        }
        this.uvi = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(Canvas canvas, IAnimation iAnimation) {
        to toVar = this.od;
        if (toVar != null) {
            toVar.qdl(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mml
    public void qdl(Canvas canvas) {
        if (this instanceof qdl) {
            return;
        }
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVar = this.zy;
        if (qdlVar != null) {
            qdlVar.qdl(canvas);
        }
        mo moVar = this.en;
        if (moVar != null) {
            moVar.qdl(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.bjy.ud
    public void qdl(exu exuVar) {
        qdl<ViewGroup> qdlVar;
        lnr<T> lnrVarMzz;
        if (exuVar == null || exuVar.lnr() == null || !TextUtils.equals(exuVar.lnr().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = exuVar.lnr().optString("nodeId");
        lnr(8);
        this.wd = (qdl) ud(this);
        if (TextUtils.isEmpty(strOptString) || (qdlVar = this.wd) == null || (lnrVarMzz = qdlVar.mzz(strOptString)) == null) {
            return;
        }
        lnrVarMzz.lnr(8);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.qdl.qdl qdlVar) {
        this.fhs = qdlVar;
    }

    public void qdl(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.mml.mml.lnr> listRq = rq(str);
        if (listRq == null || listRq.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar : listRq) {
            lnrVar.qdl(this.xdk);
            lnrVar.qdl(objArr);
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.core.mzz mzzVar) {
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl(mzzVar);
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.core.mo moVar) {
        this.jut = moVar;
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml.exu exuVar) {
        tvp tvpVar = this.xdk;
        if (tvpVar != null) {
            tvpVar.qdl(exuVar);
        }
    }
}
