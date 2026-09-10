package com.bytedance.adsdk.ugeno.LD;

import android.annotation.SuppressLint;
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
import com.badlogic.gdx.Input;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.IeN;
import com.bytedance.adsdk.ugeno.core.JVA;
import com.bytedance.adsdk.ugeno.core.LD.JXs;
import com.bytedance.adsdk.ugeno.core.LD.ZU;
import com.bytedance.adsdk.ugeno.core.NXR;
import com.bytedance.adsdk.ugeno.core.OY;
import com.bytedance.adsdk.ugeno.core.ebl;
import com.bytedance.adsdk.ugeno.core.lc;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk<T extends View> implements View.OnTouchListener, sLN.LD, sLN.Lxb, com.bytedance.adsdk.ugeno.lk {
    protected float AcC;
    protected boolean BcA;
    private boolean Bg;

    @Deprecated
    private JXs Bj;
    protected float CG;
    protected boolean CSn;
    protected float DY;
    protected String FD;
    protected float FGm;
    protected sLN FV;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.LD.Lxb FtP;
    protected float HD;
    private boolean HN;
    protected float Hu;
    protected String IeN;
    protected float Ivz;
    private boolean Iyd;
    protected NXR JD;
    protected float JJ;
    protected com.bytedance.adsdk.ugeno.core.JXs.Lxb JVA;
    protected Context JXs;
    protected float JZE;
    private ebl KOQ;
    protected boolean KPU;
    private boolean LD;
    private String LRt;
    protected float LXE;
    protected float Ld;
    protected float Lpq;
    protected float Lv;
    private boolean Lxb;
    protected com.bytedance.adsdk.ugeno.Lxb.Lxb MGT;
    private JSONObject Mvg;
    private boolean Mx;
    protected ImageView.ScaleType NDz;
    protected boolean NXR;
    protected float Ns;
    protected boolean Nu;
    protected T OY;
    protected float Of;
    private com.bytedance.adsdk.ugeno.ZU.JXs Pd;
    protected int Pw;
    protected Lxb<ViewGroup> QAg;
    private boolean Rt;
    protected boolean SS;
    protected String STP;
    protected float Sfi;
    private boolean SlV;
    protected boolean Sv;
    private String TA;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.LD.lk.Lxb VB;
    protected boolean VU;
    protected float VVE;
    private com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb Vs;
    protected float Wi;
    private boolean ZU;
    protected float Za;
    private IeN Zg;
    protected float aH;
    protected int ae;
    protected boolean bG;
    protected boolean bm;
    protected float brP;
    private float cR;
    private boolean chu;
    protected String dR;
    protected float eK;
    protected com.bytedance.adsdk.ugeno.ebl.Lxb.C0039Lxb eXY;
    protected JSONObject ebl;
    private com.bytedance.adsdk.ugeno.core.Lxb ek;
    private boolean fG;
    protected boolean foI;
    protected float gS;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.LD.LD goy;
    protected float hg;
    protected Map<Integer, nBu> iC;
    protected boolean id;
    protected ViewGroup.LayoutParams jeq;
    protected float kqm;
    private boolean lJ;
    protected JSONObject lc;
    protected boolean le;
    private boolean lk;
    private boolean mOF;
    private boolean mb;
    protected Lxb<ViewGroup> nBu;
    protected float nE;

    @Deprecated
    private ZU nH;
    protected boolean nJ;
    protected float nTb;
    protected float oc;
    private boolean op;
    private GradientDrawable owi;
    private boolean pyu;
    private boolean rK;
    protected boolean rW;
    protected float ro;
    protected OY sLN;
    protected boolean sRq;
    protected float tD;
    private boolean tv;
    protected boolean uxf;
    protected float wCT;
    protected lc wPa;
    protected int wbY;
    protected float xan;
    protected float xr;

    public lk(Context context) {
        this(context, null);
    }

    private void JZE() {
        if (TextUtils.equals("dashed", this.FD)) {
            GradientDrawable gradientDrawable = this.owi;
            float f = this.LXE;
            gradientDrawable.setStroke((int) f, this.wbY, 3.0f * f, f);
        } else {
            if (!TextUtils.equals("dotted", this.FD)) {
                this.owi.setStroke((int) this.LXE, this.wbY);
                return;
            }
            GradientDrawable gradientDrawable2 = this.owi;
            float f2 = this.LXE;
            gradientDrawable2.setStroke((int) f2, this.wbY, f2 / 2.0f, f2);
        }
    }

    private void Ld() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.STP);
        this.OY.setContentDescription(sb);
    }

    private void Lpq() {
        float f = this.Sv ? this.Ld : this.Of;
        float f2 = this.uxf ? this.Lpq : this.Of;
        float f3 = this.Nu ? this.JZE : this.Of;
        float f4 = this.SS ? this.Ns : this.Of;
        this.owi.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    private void Of() {
        nBu nbu;
        if (this.FV == null || !LD(18) || (nbu = this.iC.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectLk = nbu.lk();
        if (jSONObjectLk != null) {
            try {
                jSONObjectLk.put("rotateZ", com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObjectLk.optString("rotateZ"), this.ebl));
            } catch (JSONException unused) {
            }
        }
        this.FV.Lxb(nbu, this, this);
    }

    public com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb BcA() {
        return this.Vs;
    }

    public int CG() {
        return (int) this.kqm;
    }

    public ViewGroup.LayoutParams CSn() {
        return this.jeq;
    }

    public float DY() {
        return this.Of;
    }

    public JSONObject HD() {
        return this.lc;
    }

    public float IeN() {
        return this.ro;
    }

    public Lxb Ivz() {
        return this.QAg;
    }

    public float JJ() {
        T t = this.OY;
        if (t instanceof com.bytedance.adsdk.ugeno.Lxb.JXs) {
            return ((com.bytedance.adsdk.ugeno.Lxb.JXs) t).getStretch();
        }
        return 0.0f;
    }

    public void JVA() {
        this.OY.setPadding((int) (this.nJ ? this.nE : this.Ivz), (int) (this.BcA ? this.hg : this.Ivz), (int) (this.le ? this.xan : this.Ivz), (int) (this.rW ? this.CG : this.Ivz));
    }

    public void JXs(String str) {
        this.STP = str;
    }

    public boolean KPU() {
        return this.NXR;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void LD() {
        eK();
        JVA();
        lk(this.ae);
        Lxb();
        lk();
        com.bytedance.adsdk.ugeno.ZU.JXs jXs = this.Pd;
        if (jXs != null) {
            jXs.Lxb();
            this.Pd.LD();
            this.Pd.lk();
        }
        this.OY.setOnTouchListener(this);
        Ld();
        ViewGroup viewGroup = (ViewGroup) this.OY.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.SlV);
        }
        com.bytedance.adsdk.ugeno.Lxb.Lxb lxb = this.MGT;
        if (lxb != null) {
            lxb.lk();
        }
        if (this.FV == null || !LD(22)) {
            return;
        }
        this.FV.Lxb(this.iC.get(22), this, this);
    }

    public void Lxb(JSONObject jSONObject) {
        this.ebl = jSONObject;
        JSONObject jSONObject2 = this.lc;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        Lxb<ViewGroup> lxb = this.QAg;
        Lxb.C0029Lxb c0029LxbLk = lxb instanceof Lxb ? lxb.lk() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(this.lc.optString(next), jSONObject);
            Lxb(next, strLxb);
            if (c0029LxbLk != null) {
                c0029LxbLk.Lxb(this.JXs, next, strLxb);
            }
        }
        if (c0029LxbLk != null) {
            Lxb(c0029LxbLk.Lxb());
        }
        if (this.Mvg == null || this.ebl == null) {
            return;
        }
        try {
            if (!KPU()) {
                this.ebl.put("i18n", this.Mvg);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.Mvg);
            this.ebl.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    public float NDz() {
        T t = this.OY;
        if (t instanceof com.bytedance.adsdk.ugeno.Lxb.JXs) {
            return ((com.bytedance.adsdk.ugeno.Lxb.JXs) t).getShine();
        }
        return 0.0f;
    }

    public float NXR() {
        return this.FGm;
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void OY() {
        ebl eblVar = this.KOQ;
        if (eblVar != null) {
            eblVar.LD();
        }
        com.bytedance.adsdk.ugeno.Lxb.Lxb lxb = this.MGT;
        if (lxb != null) {
            lxb.LD();
        }
    }

    public void Pw() {
    }

    public T QAg() {
        return this.OY;
    }

    public float STP() {
        return this.oc;
    }

    public sLN Sfi() {
        return this.FV;
    }

    public float VU() {
        T t = this.OY;
        if (t instanceof com.bytedance.adsdk.ugeno.Lxb.JXs) {
            return ((com.bytedance.adsdk.ugeno.Lxb.JXs) t).getRubIn();
        }
        return 0.0f;
    }

    public float VVE() {
        return this.Hu;
    }

    public T ZU() {
        return null;
    }

    public void aH() {
        com.bytedance.adsdk.ugeno.ZU.Lxb().LD().Lxb(this.sLN, this.dR, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.ugeno.LD.lk.4
            @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
            public void Lxb(final Bitmap bitmap) {
                if (bitmap != null) {
                    lk lkVar = lk.this;
                    if (!lkVar.VU) {
                        com.bytedance.adsdk.ugeno.ebl.OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.LD.lk.4.2
                            @Override // java.lang.Runnable
                            public void run() {
                                lk.this.Lxb(new BitmapDrawable(bitmap));
                            }
                        });
                        return;
                    }
                    final Bitmap bitmapLxb = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(lkVar.JXs, bitmap, (int) lkVar.JJ);
                    if (bitmapLxb != null) {
                        com.bytedance.adsdk.ugeno.ebl.OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.LD.lk.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                lk.this.Lxb(new BitmapDrawable(bitmapLxb));
                            }
                        });
                    }
                }
            }
        });
    }

    public float brP() {
        return this.wCT;
    }

    public float dR() {
        T t = this.OY;
        if (t instanceof com.bytedance.adsdk.ugeno.Lxb.JXs) {
            return ((com.bytedance.adsdk.ugeno.Lxb.JXs) t).getRipple();
        }
        return 0.0f;
    }

    public void eK() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapLxb;
        if (TextUtils.isEmpty(this.dR)) {
            if (this.bm) {
                Lxb(this.eXY);
                return;
            } else {
                this.owi.setColor(this.Pw);
                ZU(this.Pw);
                return;
            }
        }
        if (!this.dR.startsWith("local://")) {
            aH();
            return;
        }
        String strReplace = this.dR.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.VU ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.JXs.getResources().openRawResource(com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(this.JXs, strReplace)), null, options);
            if (!this.VU || (bitmapLxb = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, bitmapDecodeStream, (int) this.JJ)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.JXs.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.JXs.getResources(), bitmapLxb);
            }
            Lxb(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void ebl() {
        com.bytedance.adsdk.ugeno.core.Lxb lxb = this.ek;
        if (lxb != null) {
            ebl eblVar = new ebl(this.OY, lxb);
            this.KOQ = eblVar;
            eblVar.Lxb();
        }
        com.bytedance.adsdk.ugeno.Lxb.Lxb lxb2 = this.MGT;
        if (lxb2 != null) {
            lxb2.Lxb();
        }
        com.bytedance.adsdk.ugeno.ZU.JXs jXs = this.Pd;
        if (jXs != null) {
            jXs.ZU();
        }
        if (this.FtP != null && LD(10)) {
            this.FtP.Lxb();
        }
        if (this.Bj == null || !LD(9)) {
            return;
        }
        this.Bj.Lxb();
    }

    public com.bytedance.adsdk.ugeno.core.JXs.Lxb foI() {
        return this.JVA;
    }

    public int hg() {
        return (int) this.VVE;
    }

    public void id() {
        if (this.OY != null) {
            Lxb(this.jeq);
            JXs((int) this.VVE);
            lc((int) this.kqm);
        }
    }

    public float kqm() {
        return this.AcC;
    }

    public void lc(String str) {
        this.IeN = str;
    }

    public int le() {
        return this.Pw;
    }

    public JSONObject nBu() {
        return this.ebl;
    }

    public String nE() {
        return this.STP;
    }

    public boolean nJ() {
        return this.bG;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ZU zu;
        sLN sln;
        com.bytedance.adsdk.ugeno.core.LD.LD ld;
        int action = motionEvent.getAction();
        if (action == 0) {
            rW();
        } else if (action == 1 || action == 3) {
            Pw();
        }
        NXR nxr = this.JD;
        if (nxr != null) {
            nxr.Lxb(this, motionEvent);
        }
        if (LD(17) && motionEvent.getAction() == 0) {
            this.FV.Lxb(this.iC.get(17), this, this);
        }
        if (LD(1) && this.Bg && (sln = this.FV) != null && (ld = this.goy) != null) {
            return ld.Lxb(sln, this, motionEvent);
        }
        sLN sln2 = this.FV;
        if (sln2 != null && (zu = this.nH) != null) {
            return zu.Lxb(sln2, this, motionEvent);
        }
        com.bytedance.adsdk.ugeno.ZU.JXs jXs = this.Pd;
        if (jXs != null) {
            return jXs.Lxb(motionEvent);
        }
        return false;
    }

    public void rW() {
    }

    public float sLN() {
        return this.Lv;
    }

    public boolean sRq() {
        return this.Iyd;
    }

    public float tD() {
        return this.Za;
    }

    public String xan() {
        return this.IeN;
    }

    public lk(Context context, Lxb<ViewGroup> lxb) {
        this.VVE = -2.0f;
        this.kqm = -2.0f;
        this.FD = "solid";
        this.ae = 0;
        this.bG = true;
        this.nTb = 0.0f;
        this.Lv = 0.0f;
        this.FGm = 0.0f;
        this.Wi = 1.0f;
        this.oc = 1.0f;
        this.ro = 1.0f;
        this.gS = 0.0f;
        this.Hu = 0.0f;
        this.AcC = 0.0f;
        this.wCT = 0.0f;
        this.Za = 1.0f;
        this.SlV = true;
        this.mOF = true;
        this.lJ = false;
        this.op = false;
        this.cR = 12.0f;
        this.JXs = context;
        this.QAg = lxb;
        this.iC = new HashMap();
        this.owi = new GradientDrawable();
        this.OY = (T) ZU();
    }

    @Deprecated
    private void lk() {
        com.bytedance.adsdk.ugeno.core.LD.lk lkVarZU;
        this.OY.setVisibility(this.ae);
        float f = this.wCT;
        if (f != 0.0f) {
            this.OY.setRotation(f);
        }
        com.bytedance.adsdk.ugeno.core.JXs.Lxb lxb = this.JVA;
        if (lxb != null && TextUtils.isEmpty(lxb.LD())) {
            this.OY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.LD.lk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lk lkVar = lk.this;
                    if (lkVar.wPa != null) {
                        boolean unused = lkVar.mOF;
                    }
                }
            });
        } else if (LD(1) && !this.Bg) {
            this.OY.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.LD.lk.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    lk lkVar = lk.this;
                    if (lkVar.FV == null || !lkVar.mOF) {
                        return;
                    }
                    lk lkVar2 = lk.this;
                    sLN sln = lkVar2.FV;
                    nBu nbu = lkVar2.iC.get(1);
                    lk lkVar3 = lk.this;
                    sln.Lxb(nbu, lkVar3, lkVar3);
                }
            });
        }
        if (this.FV != null && LD(4)) {
            if (LD(1)) {
                this.tv = true;
                this.nH = new ZU(this.JXs, this.iC.get(4), this.iC.get(1), this.tv);
            } else {
                this.nH = new ZU(this.JXs, this.iC.get(4), this.tv);
            }
        }
        if (this.FV != null && LD(1) && this.Bg) {
            this.goy = new com.bytedance.adsdk.ugeno.core.LD.LD(this.JXs, this.iC.get(1));
        }
        Of();
        if (this.FV != null && LD(3) && (lkVarZU = com.bytedance.adsdk.ugeno.ZU.Lxb().ZU()) != null) {
            this.VB = lkVarZU.Lxb(this.JXs);
            new Object() { // from class: com.bytedance.adsdk.ugeno.LD.lk.3
            };
        }
        if (this.FV != null && LD(9)) {
            JXs jXs = new JXs(this.JXs, this.iC.get(9), this);
            this.Bj = jXs;
            jXs.Lxb(this.FV);
        }
        if (LD(10)) {
            com.bytedance.adsdk.ugeno.core.LD.Lxb lxb2 = new com.bytedance.adsdk.ugeno.core.LD.Lxb(this.JXs, this.iC.get(10), this);
            this.FtP = lxb2;
            lxb2.Lxb(this.FV);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void JXs() {
        if (this.Zg == null || this.HN) {
            return;
        }
        this.HN = true;
    }

    public void ZU(int i) {
        this.owi.setShape(0);
        this.owi.setColor(i);
        Lpq();
        JZE();
        this.OY.setBackground(this.owi);
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void lc() {
        if (this.Zg == null || this.Mx) {
            return;
        }
        this.Mx = true;
    }

    private boolean OY(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, MRAIDCommunicatorUtil.STATES_HIDDEN);
    }

    public void JXs(int i) {
        if (KPU()) {
            T t = this.OY;
            if (t instanceof LD) {
                ((LD) t).Lxb(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof LD) {
                ((LD) viewParent).Lxb(this.OY, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.OY.getLayoutParams();
        layoutParams.width = i;
        this.OY.setLayoutParams(layoutParams);
    }

    public void lc(int i) {
        if (KPU()) {
            T t = this.OY;
            if (t instanceof LD) {
                ((LD) t).LD(i);
                return;
            }
            ViewParent viewParent = (ViewGroup) t.getParent();
            if (viewParent instanceof LD) {
                ((LD) viewParent).LD(this.OY, i);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.OY.getLayoutParams();
        layoutParams.height = i;
        this.OY.setLayoutParams(layoutParams);
    }

    public lk<T> ZU(String str) {
        return LD(str);
    }

    private ImageView.ScaleType ebl(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.NDz = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.NDz = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.NDz = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.NDz = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.NDz;
    }

    private void Lxb() {
        if (this.Lxb) {
            this.OY.setTranslationX(this.Lv);
        }
        if (this.LD) {
            this.OY.setTranslationY(this.FGm);
        }
        if (this.lk) {
            this.OY.setScaleX(this.oc);
        }
        if (this.ZU) {
            this.OY.setScaleY(this.ro);
        }
        if (this.Rt) {
            this.OY.setRotation(this.gS);
        }
        if (this.pyu) {
            this.OY.setRotationX(this.gS);
        }
        if (this.mb) {
            this.OY.setRotationY(this.AcC);
        }
        if (this.chu) {
            this.OY.setAlpha(this.Za);
        }
        float f = this.wCT;
        if (f != 0.0f) {
            this.OY.setRotation(f);
        }
    }

    public boolean LD(int i) {
        Map<Integer, nBu> map = this.iC;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void LD(JSONObject jSONObject) {
        this.lc = jSONObject;
    }

    public lk<T> LD(String str) {
        if (TextUtils.isEmpty(this.IeN) || !TextUtils.equals(this.IeN, str)) {
            return null;
        }
        return this;
    }

    public void LD(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.iC == null) {
            return;
        }
        try {
            int iLxb = JVA.Lxb(str).Lxb();
            nBu nbu = new nBu();
            nbu.Lxb(iLxb);
            nbu.Lxb(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iLxb == 3) {
                try {
                    this.cR = Float.parseFloat(com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObject.optString("shakeAmplitude"), this.ebl));
                } catch (NumberFormatException unused) {
                    this.cR = 12.0f;
                }
            }
            sLN sln = this.FV;
            if (!(sln instanceof com.bytedance.adsdk.ugeno.core.Lxb.Lxb)) {
                Lxb(iLxb, jSONObject, nbu);
            } else if (!((com.bytedance.adsdk.ugeno.core.Lxb.Lxb) sln).Lxb()) {
                Lxb(iLxb, jSONObject, nbu);
            } else {
                nbu.Lxb(jSONObject);
                this.iC.put(Integer.valueOf(iLxb), nbu);
            }
        } catch (JSONException unused2) {
        }
    }

    public void lk(int i) {
        ViewParent viewParent = (ViewGroup) this.OY.getParent();
        if (viewParent instanceof LD) {
            ((LD) viewParent).lk(this.OY, i);
        } else {
            this.OY.setVisibility(i);
        }
    }

    public lk<T> lk(String str) {
        return Lxb(str);
    }

    public void Lxb(IeN ieN) {
        this.Zg = ieN;
    }

    public void Lxb(NXR nxr) {
        this.JD = nxr;
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void LD(int i, int i2, int i3, int i4) {
        ebl eblVar = this.KOQ;
        if (eblVar != null) {
            eblVar.Lxb(i, i2);
        }
        com.bytedance.adsdk.ugeno.Lxb.Lxb lxb = this.MGT;
        if (lxb != null) {
            lxb.Lxb(i, i2);
        }
    }

    public void Lxb(sLN sln) {
        this.FV = sln;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.ebl.Lxb.C0039Lxb c0039Lxb) {
        if (c0039Lxb == null) {
            return;
        }
        this.owi.setShape(0);
        this.owi.setOrientation(c0039Lxb.Lxb);
        if (Build.VERSION.SDK_INT >= 29) {
            this.owi.setColors(c0039Lxb.LD, c0039Lxb.lk);
        } else {
            this.owi.setColors(c0039Lxb.LD);
        }
        Lpq();
        JZE();
        this.OY.setBackground(this.owi);
    }

    public lk LD(lk lkVar) {
        return (lkVar.Ivz() == null && (lkVar instanceof Lxb)) ? lkVar : LD(lkVar.Ivz());
    }

    public void Lxb(Drawable drawable) {
        this.OY.setBackground(drawable);
    }

    public void Lxb(ViewGroup.LayoutParams layoutParams) {
        T t = this.OY;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.jeq = layoutParams;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.core.JXs.Lxb lxb) {
        this.JVA = lxb;
    }

    public lk<T> Lxb(String str) {
        if (TextUtils.isEmpty(this.STP) || !TextUtils.equals(this.STP, str)) {
            return null;
        }
        return this;
    }

    public void Lxb(boolean z) {
        this.NXR = z;
    }

    public void Lxb(Lxb lxb) {
        this.QAg = lxb;
    }

    public void Lxb(OY oy) {
        this.sLN = oy;
    }

    public void Lxb(lc lcVar) {
        this.wPa = lcVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void Lxb(String str, String str2) {
        Lxb<ViewGroup> lxb;
        Lxb<ViewGroup> lxb2;
        if (TextUtils.isEmpty(str)) {
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
                if (str.equals(f.ax)) {
                    b = 12;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = cw.k;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b = cw.l;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b = cw.m;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b = cw.n;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b = 17;
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
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    b = 32;
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
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b = 38;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b = 39;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b = 40;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b = 41;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b = 42;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b = 43;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b = 44;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b = 45;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b = 46;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b = 47;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b = 48;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 49;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b = 50;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b = 51;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b = 52;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b = 53;
                }
                break;
            case 1287124693:
                if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    b = 54;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b = 55;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b = 56;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b = 57;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b = 58;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b = 59;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b = 60;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b = 61;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b = 62;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b = 63;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 64;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b = 65;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b = 66;
                }
                break;
        }
        switch (b) {
            case 0:
                this.mOF = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 38:
            case 47:
            case 50:
            case 53:
            case Input.Keys.TAB /* 61 */:
            case 63:
                LD(str, str2);
                break;
            case 2:
                this.Lxb = true;
                this.Lv = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f));
                break;
            case 3:
                this.LD = true;
                this.FGm = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f));
                break;
            case 4:
                this.nE = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.nJ = true;
                break;
            case 5:
                this.eK = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 11:
            case 54:
                if (com.bytedance.adsdk.ugeno.ebl.Lxb.lk(str2)) {
                    this.bm = true;
                    this.eXY = com.bytedance.adsdk.ugeno.ebl.Lxb.LD(str2);
                } else {
                    this.Pw = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2, 0);
                    this.bm = false;
                }
                break;
            case 12:
                this.Pd = com.bytedance.adsdk.ugeno.ZU.JXs.Lxb(this, str2);
                break;
            case 13:
                this.chu = true;
                this.Za = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 1.0f);
                break;
            case 14:
                this.Ld = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.Sv = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    if (KPU() && (lxb = this.QAg) != null && lxb.CG() == -2) {
                        this.kqm = -2.0f;
                    } else {
                        this.kqm = -1.0f;
                    }
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.kqm = -2.0f;
                } else {
                    this.kqm = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                }
                this.op = true;
                break;
            case 16:
                this.brP = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                break;
            case 17:
                this.Sfi = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.foI = true;
                break;
            case 19:
            case 55:
                this.dR = str2;
                break;
            case 20:
                this.Rt = true;
                this.gS = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 21:
                this.lk = true;
                this.oc = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 22:
                this.ZU = true;
                this.ro = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 23:
                this.Ivz = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                break;
            case 24:
                this.LRt = str2;
                break;
            case 25:
                this.HD = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.KPU = true;
                break;
            case 26:
                this.aH = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 27:
                this.STP = str2;
                break;
            case 28:
                this.Mvg = com.bytedance.adsdk.ugeno.ebl.LD.Lxb(str2, (JSONObject) null);
                break;
            case 29:
                this.IeN = str2;
                break;
            case 30:
                float fLxb = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                this.JJ = fLxb;
                if (fLxb > 0.0f) {
                    this.VU = true;
                }
                break;
            case 31:
                this.hg = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.BcA = true;
                break;
            case 32:
                this.TA = str2;
                break;
            case 34:
                this.xr = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 35:
                this.lk = true;
                this.ZU = true;
                float[] fArrLk = com.bytedance.adsdk.ugeno.Lxb.lk.lk(str2);
                this.oc = fArrLk[0];
                this.ro = fArrLk[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    if (KPU() && (lxb2 = this.QAg) != null && lxb2.hg() == -2) {
                        this.VVE = -2.0f;
                    } else {
                        this.VVE = -1.0f;
                    }
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.VVE = -2.0f;
                } else {
                    this.VVE = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                }
                this.lJ = true;
                break;
            case 37:
                this.CG = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.rW = true;
                break;
            case 39:
                this.Lpq = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.uxf = true;
                break;
            case 40:
                this.SlV = OY(str2);
                break;
            case 41:
                this.JZE = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.Nu = true;
                break;
            case 42:
                this.Ns = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.SS = true;
                break;
            case 43:
                this.xan = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.le = true;
                break;
            case 44:
                this.wbY = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case 45:
                this.FD = str2;
                break;
            case 46:
                this.LXE = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                break;
            case 48:
                this.DY = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.id = true;
                break;
            case 49:
                this.Lxb = true;
                this.LD = true;
                float[] fArrLk2 = com.bytedance.adsdk.ugeno.Lxb.lk.lk(str2);
                this.Lv = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, fArrLk2[0]);
                this.FGm = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, fArrLk2[1]);
                break;
            case 51:
                try {
                    this.MGT = new com.bytedance.adsdk.ugeno.Lxb.Lxb(this.JXs, this, com.bytedance.adsdk.ugeno.Lxb.lk.Lxb(new JSONObject(str2)));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 52:
                this.ek = com.bytedance.adsdk.ugeno.core.Lxb.Lxb(str2, this);
                break;
            case Input.Keys.PERIOD /* 56 */:
                this.sRq = true;
                this.NDz = ebl(str2);
                break;
            case Input.Keys.ALT_LEFT /* 57 */:
                this.Of = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                break;
            case Input.Keys.ALT_RIGHT /* 58 */:
                this.pyu = true;
                this.Hu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case Input.Keys.SHIFT_LEFT /* 59 */:
                this.mb = true;
                this.AcC = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 60:
                this.wCT = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case Input.Keys.SPACE /* 62 */:
                this.Iyd = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, false);
                break;
            case 64:
                if (TextUtils.equals("visible", str2)) {
                    this.ae = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.ae = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals(MRAIDCommunicatorUtil.STATES_HIDDEN, str2)) {
                    this.ae = 8;
                }
                this.OY.setVisibility(this.ae);
                break;
            case 65:
                this.tD = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(this.JXs, str2);
                this.CSn = true;
                break;
            case 66:
                this.bG = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    @Deprecated
    public void Lxb(int i, JSONObject jSONObject, nBu nbu) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            nBu nbu2 = new nBu();
            nbu2.Lxb(jSONObjectOptJSONObject);
            nbu2.Lxb(this);
            nbu.Lxb(nbu2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("fail");
        if (jSONObjectOptJSONObject2 != null) {
            nBu nbu3 = new nBu();
            nbu3.Lxb(jSONObjectOptJSONObject2);
            nbu3.Lxb(this);
            nbu.LD(nbu3);
        }
        nbu.Lxb(jSONObject);
        this.iC.put(Integer.valueOf(i), nbu);
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public int[] Lxb(int i, int i2) {
        if (this.xr > 0.0f) {
            if (this.lJ) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.xr;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.op) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.xr;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.Zg != null && !this.rK) {
            this.rK = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void Lxb(int i, int i2, int i3, int i4) {
        if (this.Zg == null || this.fG) {
            return;
        }
        this.fG = true;
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void Lxb(Canvas canvas, IAnimation iAnimation) {
        ebl eblVar = this.KOQ;
        if (eblVar != null) {
            eblVar.Lxb(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lk
    public void Lxb(Canvas canvas) {
        com.bytedance.adsdk.ugeno.Lxb.Lxb lxb = this.MGT;
        if (lxb != null) {
            lxb.Lxb(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN.LD
    public void Lxb(nBu nbu) {
        Lxb<ViewGroup> lxb;
        lk<T> lkVarLk;
        if (nbu == null || nbu.lk() == null || !TextUtils.equals(nbu.lk().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = nbu.lk().optString("nodeId");
        lk(8);
        this.nBu = (Lxb) LD(this);
        if (TextUtils.isEmpty(strOptString) || (lxb = this.nBu) == null || (lkVarLk = lxb.lk(strOptString)) == null) {
            return;
        }
        lkVarLk.lk(8);
    }

    public void Lxb(com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb lxb) {
        this.Vs = lxb;
    }
}
