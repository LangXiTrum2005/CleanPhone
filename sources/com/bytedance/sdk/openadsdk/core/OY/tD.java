package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.nE;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class tD extends com.bytedance.sdk.openadsdk.core.JXs.lk implements com.bytedance.sdk.component.adexpress.LD.IeN, com.bytedance.sdk.component.adexpress.LD.OY, com.bytedance.sdk.component.adexpress.dynamic.ZU, com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb, STP {
    public static int Sfi = 500;
    private boolean BcA;
    private String CG;
    public com.bytedance.sdk.openadsdk.ZU.ebl CSn;
    protected HashSet<String> DY;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> FD;
    public boolean HD;
    protected com.bytedance.sdk.component.adexpress.LD.lk IeN;
    private String Ivz;
    private final Runnable JJ;
    protected com.bytedance.sdk.openadsdk.core.model.tD JVA;
    private PAGExpressAdWrapperListener JXs;
    private com.bytedance.sdk.component.adexpress.LD.nBu.Lxb JZE;
    public com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> KPU;
    private int LD;
    private com.bytedance.sdk.component.adexpress.LD.NXR LXE;
    private eK Ld;
    private List<com.bytedance.sdk.component.adexpress.LD.nBu> Lpq;
    private boolean Lxb;
    private long MGT;
    private final ViewTreeObserver.OnScrollChangedListener NDz;
    protected boolean NXR;
    private com.bytedance.sdk.component.adexpress.LD.VVE Ns;
    private com.bytedance.sdk.openadsdk.core.JVA.ZU.lk Nu;
    protected final Context OY;
    private ThemeStatusBroadcastReceiver Of;
    private final AtomicBoolean Pw;
    protected String QAg;
    private com.bytedance.sdk.component.adexpress.LD.QAg SS;
    protected boolean STP;
    private com.bytedance.sdk.component.adexpress.LD.lc Sv;
    private final Runnable VU;
    protected boolean VVE;
    private TTDislikeDialogAbstract ZU;
    boolean aH;
    private float ae;
    private float bG;
    protected int brP;
    private lk dR;
    int eK;
    private QAg ebl;
    protected com.bytedance.sdk.component.adexpress.LD.LD foI;
    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs hg;
    long id;
    private float jeq;
    boolean kqm;
    private OY lc;
    private com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb le;
    private com.bytedance.sdk.openadsdk.lk.lk lk;
    protected AdSlot nBu;
    private float nE;
    private String nJ;
    private com.bytedance.sdk.openadsdk.core.lk.ebl nTb;
    private Sfi rW;
    public FrameLayout sLN;
    private final Runnable sRq;
    protected String tD;
    private com.bytedance.sdk.openadsdk.core.JVA.LD.ebl uxf;
    private int wbY;
    private float xan;
    private float xr;

    public tD(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, String str) {
        super(context);
        this.Lxb = true;
        this.LD = 0;
        this.QAg = "embeded_ad";
        this.Ivz = null;
        this.STP = false;
        this.VVE = false;
        this.kqm = true;
        this.brP = -1;
        this.CG = "";
        this.HD = false;
        this.BcA = true;
        this.eK = -1;
        this.CSn = new com.bytedance.sdk.openadsdk.ZU.ebl();
        this.id = 0L;
        this.Pw = new AtomicBoolean(false);
        this.NDz = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                tD tDVar2 = tD.this;
                if (tDVar2.kqm) {
                    tDVar2.Sfi();
                    tD tDVar3 = tD.this;
                    tDVar3.removeCallbacks(tDVar3.JJ);
                    tD tDVar4 = tD.this;
                    tDVar4.postDelayed(tDVar4.JJ, 500L);
                }
            }
        };
        this.JJ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.2
            @Override // java.lang.Runnable
            public void run() {
                if (!nE.Lxb(tD.this, 0, 5)) {
                    tD.this.lc(8);
                } else {
                    tD tDVar2 = tD.this;
                    tDVar2.lc(tDVar2.getVisibility());
                }
            }
        };
        this.VU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.3
            @Override // java.lang.Runnable
            public void run() {
                tD.this.lc(0);
            }
        };
        this.sRq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.4
            @Override // java.lang.Runnable
            public void run() {
                tD.this.lc(8);
            }
        };
        this.wbY = 8;
        this.FD = new SparseArray<>();
        this.ae = -1.0f;
        this.xr = -1.0f;
        this.bG = -1.0f;
        this.jeq = -1.0f;
        this.MGT = 0L;
        this.QAg = str;
        this.OY = context;
        this.JVA = tDVar;
        this.nBu = adSlot;
        this.HD = false;
        lc();
    }

    private boolean CSn() {
        return TextUtils.equals(this.QAg, "fullscreen_interstitial_ad") || TextUtils.equals(this.QAg, "rewarded_video") || TextUtils.equals("open_ad", this.QAg) || eK.LD(this.QAg) || TextUtils.equals(this.QAg, "embeded_ad");
    }

    private void DY() {
        com.bytedance.sdk.openadsdk.core.lc.Lxb.Lxb lxb = new com.bytedance.sdk.openadsdk.core.lc.Lxb.Lxb();
        int i = this.LD;
        if (i == 3) {
            com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl eblVar = new com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl();
            Context applicationContext = this.OY.getApplicationContext();
            com.bytedance.sdk.component.adexpress.LD.NXR nxr = this.LXE;
            ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.Of;
            boolean z = this.HD;
            com.bytedance.sdk.component.adexpress.LD.LD ld = new com.bytedance.sdk.component.adexpress.LD.LD(applicationContext, nxr, themeStatusBroadcastReceiver, z, eblVar, this, lxb, new lc(this.OY, themeStatusBroadcastReceiver, z, eblVar, nxr, lxb));
            this.foI = ld;
            this.Lpq.add(ld);
            return;
        }
        if (i == 7) {
            com.bytedance.sdk.openadsdk.core.JVA.ZU.lk lkVar = new com.bytedance.sdk.openadsdk.core.JVA.ZU.lk(this.OY, this.JVA, this.HD, (com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb) this.LXE, this);
            this.Nu = lkVar;
            com.bytedance.sdk.openadsdk.core.JVA.LD.ebl eblVar2 = new com.bytedance.sdk.openadsdk.core.JVA.LD.ebl(this.OY, lkVar, this, this.LXE);
            this.uxf = eblVar2;
            this.Lpq.add(eblVar2);
            return;
        }
        if (i == 10) {
            com.bytedance.sdk.openadsdk.core.JVA.LD.ebl eblVar3 = new com.bytedance.sdk.openadsdk.core.JVA.LD.ebl(this.OY, new com.bytedance.sdk.openadsdk.core.JVA.ZU.JXs(this.OY, this.JVA, this.HD, (com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb) this.LXE, this), this, this.LXE);
            this.uxf = eblVar3;
            this.Lpq.add(eblVar3);
            return;
        }
        eK eKVar = new eK(this.OY, this.LXE, this.Of, this.hg, this.JVA);
        this.Ld = eKVar;
        com.bytedance.sdk.component.adexpress.LD.VVE vve = new com.bytedance.sdk.component.adexpress.LD.VVE(this.OY, this.LXE, eKVar, this);
        this.Ns = vve;
        this.Lpq.add(vve);
    }

    private boolean HD() {
        return com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.JVA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sfi() {
        if (this.Pw.get()) {
            this.CSn.Lxb(System.currentTimeMillis(), nE.Lxb(this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003f  */
    private void VVE() {
        long jOptLong;
        boolean z;
        com.bytedance.sdk.component.adexpress.LD.NXR.Lxb lxb;
        com.bytedance.sdk.openadsdk.ZU.kqm kqmVar = new com.bytedance.sdk.openadsdk.ZU.kqm(1, this.QAg, this.JVA);
        this.hg = kqmVar;
        this.SS = new NXR(kqmVar, this.QAg, this.JVA, this.Ivz);
        final boolean zPw = this.JVA.Pw();
        try {
            com.bytedance.sdk.openadsdk.core.model.tD.Lxb lxbRW = this.JVA.rW();
            if (lxbRW != null) {
                String strJVA = lxbRW.JVA();
                if (TextUtils.isEmpty(strJVA)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new JSONObject(strJVA).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused) {
        }
        try {
            z = !com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.JVA) && com.bytedance.sdk.openadsdk.core.kqm.ZU().NXR(this.Ivz) == 1;
            try {
                if (!com.bytedance.sdk.openadsdk.core.settings.VVE.TA().STP(this.Ivz) || this.JVA.kqm() == 5 || this.JVA.kqm() == 6 || this.JVA.op() == 3) {
                    z = true;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), WorkRequest.MIN_BACKOFF_MILLIS);
        int renderTimeout = getRenderTimeout();
        double d = this.JVA.JJ() != null ? this.JVA.JJ().d * ((double) this.JVA.JJ().r) : 0.0d;
        int i = this.eK;
        this.aH = i != -1 && i < ((int) d);
        if (com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.JVA) || com.bytedance.sdk.openadsdk.core.JVA.lk.LD(this.JVA)) {
            com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb.C0091Lxb c0091Lxb = new com.bytedance.sdk.openadsdk.core.JVA.ZU.Lxb.C0091Lxb();
            if (com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.JVA)) {
                c0091Lxb.Lxb(com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.JVA, this.QAg));
            }
            c0091Lxb.Lxb((com.bytedance.adsdk.ugeno.core.IeN) this.SS);
            c0091Lxb.Lxb(this.nE);
            c0091Lxb.LD(this.xan);
            lxb = c0091Lxb;
        } else {
            lxb = new com.bytedance.sdk.component.adexpress.LD.NXR.Lxb();
        }
        lxb.JXs(zPw);
        lxb.Lxb(this.QAg).LD(this.JVA.bG()).lk(this.JVA.cf()).ZU(this.JVA.Lv()).Lxb(this.SS).ZU(this.JVA.VB()).Lxb(renderTimeout).LD(this.JVA.FV()).lk(this.BcA).LD(this.JVA.Ivz()).Lxb(jMin).lk(this.JVA.sRq()).Lxb(com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(this.JVA)).ZU(z).JXs(this.eK).Lxb(this.aH).Lxb(d).lc(com.bytedance.sdk.openadsdk.core.settings.VVE.TA().oc()).Lxb(new com.bytedance.sdk.component.adexpress.LD.JXs() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.5
            @Override // com.bytedance.sdk.component.adexpress.LD.JXs
            public JSONObject Lxb() {
                try {
                    tD tDVar = tD.this;
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = tDVar.JVA;
                    if (tDVar2 == null) {
                        tDVar.CG = "material is null";
                        return null;
                    }
                    if (zPw) {
                        tDVar.rW = new Sfi();
                        float f = tD.this.nE;
                        float f2 = tD.this.xan;
                        tD tDVar3 = tD.this;
                        JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(f, f2, tDVar3.STP, tDVar3.JVA, tDVar3.QAg, tDVar3.rW);
                        tD.this.CG = com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb();
                        return jSONObjectLxb;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(tDVar2)) {
                        float f3 = tD.this.nE;
                        float f4 = tD.this.xan;
                        tD tDVar4 = tD.this;
                        JSONObject jSONObjectLxb2 = com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(f3, f4, tDVar4.STP, tDVar4.JVA);
                        tD.this.Lxb(jSONObjectLxb2);
                        return jSONObjectLxb2;
                    }
                    tD.this.rW = new Sfi();
                    tD tDVar5 = tD.this;
                    JSONObject jSONObjectLxb3 = com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(tDVar5.JVA, tDVar5.rW);
                    tD.this.CG = com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb();
                    return jSONObjectLxb3;
                } catch (Throwable unused4) {
                    return null;
                }
            }
        });
        Lxb(lxb);
        this.LXE = lxb.Lxb();
    }

    private void aH() {
        List<com.bytedance.sdk.component.adexpress.LD.nBu> list = this.Lpq;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.LD.nBu> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void brP() {
        this.LD = this.JVA.id();
        try {
            tD();
            DY();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.JVA.foI() == 1;
        this.Lxb = z;
        if (z) {
            com.bytedance.sdk.component.adexpress.LD.lc lcVar = new com.bytedance.sdk.component.adexpress.LD.lc(this.OY, this.LXE, new DY(this, this.Of, this.LXE));
            this.Sv = lcVar;
            this.Lpq.add(lcVar);
        }
        Objects.toString(this.Lpq);
        this.JZE = new com.bytedance.sdk.component.adexpress.LD.sLN(this.Lpq, this.SS);
    }

    private void eK() {
        List<com.bytedance.sdk.component.adexpress.LD.nBu> list = this.Lpq;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.LD.nBu> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void ebl() {
        com.bytedance.sdk.openadsdk.core.model.tD.Lxb lxbRW = this.JVA.rW();
        if (!TextUtils.equals(this.QAg, "embeded_ad") || lxbRW == null) {
            return;
        }
        String strSLN = lxbRW.sLN();
        if (TextUtils.isEmpty(strSLN)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strSLN);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.xan = iOptInt2;
            this.nE = iOptInt;
        } catch (Exception unused) {
        }
    }

    private int getAdSlotType() {
        String str = this.QAg;
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }

    private void kqm() {
        if (this.JVA.lJ() == 1 && this.JVA.chu()) {
            com.bytedance.sdk.component.adexpress.LD.lc lcVar = new com.bytedance.sdk.component.adexpress.LD.lc(this.OY, this.LXE, new DY(this, this.Of, this.LXE));
            this.Sv = lcVar;
            this.Lpq.add(lcVar);
            this.JZE = new com.bytedance.sdk.component.adexpress.LD.sLN(this.Lpq, this.SS);
            return;
        }
        if (CSn()) {
            brP();
            return;
        }
        try {
            tD();
            eK eKVar = new eK(this.OY, this.LXE, this.Of, this.hg, this.JVA);
            this.Ld = eKVar;
            com.bytedance.sdk.component.adexpress.LD.VVE vve = new com.bytedance.sdk.component.adexpress.LD.VVE(this.OY, this.LXE, eKVar, this);
            this.Ns = vve;
            this.Lpq.add(vve);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        com.bytedance.sdk.component.adexpress.LD.lc lcVar2 = new com.bytedance.sdk.component.adexpress.LD.lc(this.OY, this.LXE, new DY(this, this.Of, this.LXE));
        this.Sv = lcVar2;
        this.Lpq.add(lcVar2);
        this.JZE = new com.bytedance.sdk.component.adexpress.LD.sLN(this.Lpq, this.SS);
    }

    private void tD() {
        if (com.bytedance.sdk.openadsdk.core.STP.JXs()) {
            return;
        }
        sLN.Lxb();
    }

    public boolean IeN() {
        return this.Pw.get();
    }

    public void JVA() {
        try {
            lk lkVar = this.dR;
            if (lkVar != null) {
                lkVar.LD();
            }
            STP();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.LD.nBu> list = this.Lpq;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.LD.nBu> it = list.iterator();
                while (it.hasNext()) {
                    it.next().Lxb();
                }
            }
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.JVA);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.LD(this.JVA);
            this.lk = null;
            this.ZU = null;
            this.nBu = null;
            this.JVA = null;
            this.JXs = null;
            this.lc = null;
            this.IeN = null;
            this.ebl = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("NativeExpressView", "detach error", th);
        }
    }

    public void JXs() {
    }

    public void LD() {
    }

    public void Lxb() {
    }

    public boolean NXR() {
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        return zu != null && (zu instanceof DY);
    }

    public void OY() {
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu instanceof eK) {
            if (zu == null) {
                return;
            }
            ((eK) zu).OY();
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
            com.bytedance.sdk.component.utils.ebl.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.6
                @Override // java.lang.Runnable
                public void run() {
                    tD.this.JXs(1);
                }
            }, ((long) (tDVar != null ? tDVar.nBu().Lxb() : 5)) * 1000);
        }
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.JVA;
        if (tDVar2 == null || tDVar2.SlV() == null || this.JVA.SlV().Lxb() == null) {
            return;
        }
        this.JVA.SlV().Lxb().Lxb(0L);
    }

    public void QAg() {
        if (this.JVA == null) {
            return;
        }
        this.id = SystemClock.elapsedRealtime();
        if (this.JVA.Iyd()) {
            lk lkVar = this.dR;
            if (lkVar == null) {
                a_(106);
                return;
            } else {
                lkVar.Lxb((com.bytedance.sdk.component.adexpress.LD.IeN) this);
                this.dR.Lxb();
                return;
            }
        }
        this.hg.Lxb();
        com.bytedance.sdk.component.adexpress.LD.nBu.Lxb lxb = this.JZE;
        if (lxb != null) {
            lxb.Lxb(this);
        }
        try {
            this.JZE.Lxb();
        } catch (Throwable unused) {
        }
    }

    public void STP() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
        if (tDVar == null || tDVar.SlV() == null || this.JVA.SlV().Lxb() == null) {
            return;
        }
        this.JVA.SlV().Lxb().JXs(getVideoProgress());
    }

    public int ZU() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.IeN
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.LD.QAg qAg = this.SS;
        if (qAg != null) {
            if (!this.Lxb) {
                qAg.OY();
            }
            this.SS.QAg();
            ((NXR) this.SS).JVA();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.JXs;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.OY.Lxb(i), i);
        }
        Sfi sfi = this.rW;
        if (sfi != null) {
            sfi.Lxb(this.JVA, this.QAg);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        OY oy = this.lc;
        if (oy != null) {
            oy.LD(motionEvent.getDeviceId());
            this.lc.Lxb(motionEvent.getSource());
            this.lc.lk(motionEvent.getToolType(0));
        }
        QAg qAg = this.ebl;
        if (qAg != null) {
            qAg.LD(motionEvent.getDeviceId());
            this.ebl.Lxb(motionEvent.getSource());
            this.ebl.lk(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.ae = motionEvent.getRawX();
            this.xr = motionEvent.getRawY();
            this.MGT = System.currentTimeMillis();
            i = 0;
        } else if (actionMasked == 1) {
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            this.bG = Math.abs(motionEvent.getX() - this.ae) + this.bG;
            this.jeq = Math.abs(motionEvent.getY() - this.xr) + this.jeq;
            this.ae = motionEvent.getX();
            this.xr = motionEvent.getY();
            i = (System.currentTimeMillis() - this.MGT <= 200 || (this.bG <= 8.0f && this.jeq <= 8.0f)) ? 2 : 1;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray = this.FD;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.LD.lk.Lxb(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.sdk.openadsdk.ZU.ebl getAdShowTime() {
        return this.CSn;
    }

    public lk getBrandBannerController() {
        return this.dR;
    }

    public OY getClickCreativeListener() {
        return this.lc;
    }

    public QAg getClickListener() {
        return this.ebl;
    }

    public String getClosedListenerKey() {
        return this.nJ;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu != null) {
            return zu.lk();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.xan).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.nE).intValue();
    }

    public Ivz getJsObject() {
        eK eKVar = this.Ld;
        if (eKVar != null) {
            return eKVar.VVE();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        nBu nbuIeN;
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (!(zu instanceof eK) || (nbuIeN = ((eK) zu).IeN()) == null) {
            return 0;
        }
        return nbuIeN.Lxb();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.kqm.ZU().foI();
    }

    public String getUgenTemplateErrorReason() {
        return this.CG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.lk.ebl eblVar = this.nTb;
        if (eblVar != null) {
            return eblVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.QAg.ZU getWebView() {
        eK eKVar = this.Ld;
        if (eKVar == null) {
            return null;
        }
        return eKVar.Lxb();
    }

    public void lc() {
        this.DY = new HashSet<>();
        this.Of = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.nBu;
        if (adSlot != null) {
            this.nE = adSlot.getExpressViewAcceptedWidth();
            this.xan = this.nBu.getExpressViewAcceptedHeight();
            ebl();
            this.Ivz = this.nBu.getCodeId();
            if (TextUtils.equals(this.QAg, "fullscreen_interstitial_ad")) {
                this.eK = com.bytedance.sdk.openadsdk.core.kqm.ZU().tD(this.Ivz);
            } else if (TextUtils.equals(this.QAg, "rewarded_video")) {
                this.eK = com.bytedance.sdk.openadsdk.core.kqm.ZU().nBu(this.Ivz);
            } else if (TextUtils.equals(this.QAg, "open_ad")) {
                int iHD = com.bytedance.sdk.openadsdk.core.kqm.ZU().HD(this.Ivz);
                this.eK = iHD;
                if (iHD < 0) {
                    this.eK = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.JVA.Iyd()) {
            this.dR = new lk(this.OY, this, this.JVA, this.QAg);
            return;
        }
        VVE();
        this.Lpq = new ArrayList();
        kqm();
        com.bytedance.sdk.component.adexpress.LD.VVE vve = this.Ns;
        if (vve != null) {
            this.Ld = (eK) vve.LD();
        }
        Ivz jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.lc(this.QAg);
        }
    }

    public long lk() {
        return 0L;
    }

    public void nBu() {
        eK eKVar = this.Ld;
        if (eKVar == null || eKVar.JXs() == null) {
            return;
        }
        this.Ld.lc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Sfi();
        eK();
        com.bytedance.sdk.component.utils.sLN.Lxb("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.NDz);
        com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb(this.nJ, this.le);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.NDz);
        com.bytedance.sdk.openadsdk.core.QAg.LD().lc(this.nJ);
        aH();
        com.bytedance.sdk.component.utils.sLN.Lxb("webviewpool", "onDetachedFromWindow===");
        Lxb(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.sLN.Lxb("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Sfi();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.sLN.Lxb("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        Sfi();
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(this.JVA, z);
        if (z) {
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.JVA, 4);
        } else {
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.JVA, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Lxb(i, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void onvideoComplate() {
    }

    public void sLN() {
        try {
            FrameLayout frameLayout = this.sLN;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.sLN);
        } catch (Throwable unused) {
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.LD.lk lkVar) {
        this.IeN = lkVar;
        com.bytedance.sdk.component.adexpress.LD.lc lcVar = this.Sv;
        if (lcVar != null) {
            lcVar.Lxb(lkVar);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb) {
        this.le = lxb;
    }

    public void setClickCreativeListener(OY oy) {
        this.lc = oy;
        if (oy != null) {
            oy.Lxb((com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb) this);
        }
    }

    public void setClickListener(QAg qAg) {
        this.ebl = qAg;
    }

    public void setClosedListenerKey(String str) {
        this.nJ = str;
        lk lkVar = this.dR;
        if (lkVar != null) {
            lkVar.Lxb(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.lk.lk lkVar) {
        Lxb lxb;
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu != null && (zu instanceof DY) && (lxb = (Lxb) zu.JXs()) != null) {
            lxb.setDislikeInner(lkVar);
        }
        lk lkVar2 = this.dR;
        if (lkVar2 != null) {
            lkVar2.Lxb(lkVar);
        }
        this.lk = lkVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.JXs = pAGExpressAdWrapperListener;
        lk lkVar = this.dR;
        if (lkVar != null) {
            lkVar.Lxb(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.lc lcVar) {
        if (this.Ld != null && getJsObject() != null) {
            getJsObject().Lxb(lcVar);
        }
        com.bytedance.sdk.openadsdk.core.JVA.ZU.lk lkVar = this.Nu;
        if (lkVar != null) {
            lkVar.Lxb(lcVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        Lxb lxb;
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu != null && (zu instanceof DY) && (lxb = (Lxb) zu.JXs()) != null) {
            lxb.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lk lkVar = this.dR;
        if (lkVar != null) {
            lkVar.Lxb(tTDislikeDialogAbstract);
        }
        this.ZU = tTDislikeDialogAbstract;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setSoundMute(boolean z) {
        this.HD = z;
        com.bytedance.sdk.component.adexpress.LD.LD ld = this.foI;
        if (ld != null && ld.LD() != null) {
            this.foI.LD().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) {
            ((com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) zu).setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        LD(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTimeUpdate(int i) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.lk.ebl eblVar) {
        this.nTb = eblVar;
    }

    public void LD(int i) {
    }

    public void Lxb(int i) {
    }

    public void JXs(int i) {
        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.JVA)) {
            com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
            if (zu instanceof eK) {
                ((eK) zu).LD(i);
            }
        }
    }

    public void Lxb(int i, com.bytedance.sdk.component.adexpress.LD.STP stp) {
    }

    public com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lk(int i) {
        return new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(i);
    }

    public void LD(int i, int i2) {
        int iMin;
        if (TextUtils.equals(this.QAg, "banner_ad")) {
            return;
        }
        int i3 = this.eK;
        int i4 = ((i2 < i3 || i3 < 0 || !(this.aH || TextUtils.equals(this.QAg, "open_ad"))) && !((i == 0 && TextUtils.equals(this.QAg, "open_ad")) || ZU() == 5)) ? 0 : 1;
        if (i2 <= this.eK) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
            if (tDVar != null && tDVar.JJ() != null) {
                iMin = (int) (Math.min(this.eK, this.JVA.JJ().d * ((double) this.JVA.JJ().r)) - ((double) i2));
            } else {
                iMin = this.eK - i2;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.LD.LD ld = this.foI;
        if (ld != null && ld.LD() != null) {
            this.foI.LD().setTime(String.valueOf(i), i4, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu instanceof com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) {
            ((com.bytedance.sdk.openadsdk.core.JVA.ZU.lk) zu).setTime(String.valueOf(i), i4, iMin, false);
        }
    }

    public void Lxb(int i, String str) {
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.LD.NXR.Lxb lxb) {
    }

    public void Lxb(String str, JSONObject jSONObject) {
    }

    public void Lxb(JSONObject jSONObject) {
    }

    public void Lxb(boolean z) {
    }

    public boolean Lxb(com.bytedance.sdk.component.adexpress.LD.STP stp) {
        return true;
    }

    public void Lxb(int i, boolean z, boolean z2) {
        this.kqm = z;
        removeCallbacks(this.sRq);
        removeCallbacks(this.VU);
        if (i == 0) {
            if (z2) {
                this.VU.run();
                return;
            } else {
                postDelayed(this.VU, 50L);
                return;
            }
        }
        if (z2) {
            this.sRq.run();
        } else {
            postDelayed(this.sRq, 50L);
        }
    }

    public void LD(int i, String str) {
        Ivz ivzVVE;
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu == null || !(zu instanceof eK) || (ivzVVE = ((eK) zu).VVE()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            ivzVVE.Lxb("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Lxb(View view, int i, com.bytedance.sdk.component.adexpress.lk lkVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.utils.Sfi.Lxb("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || lkVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.eK.lk(this.JVA)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.STP stp = (com.bytedance.sdk.openadsdk.core.model.STP) lkVar;
        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.JVA)) {
            try {
                JSONObject jSONObject2 = stp.kqm;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.LD(th.toString());
            }
        }
        OY oy = this.lc;
        if (oy != null) {
            oy.ZU(getDynamicShowType());
            this.lc.Lxb(map);
        }
        QAg qAg = this.ebl;
        if (qAg != null) {
            qAg.ZU(getDynamicShowType());
            this.ebl.Lxb(map);
        }
        float f = stp.Lxb;
        float f2 = stp.LD;
        float f3 = stp.lk;
        float f4 = stp.ZU;
        boolean z = stp.IeN;
        SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray = stp.STP;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.FD;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray2 = sparseArray;
        String str = stp.JVA;
        JSONObject jSONObjectLxb = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectLxb = view != this ? Lxb(view) : null;
            view2 = view;
        }
        stp.sLN = i;
        if (jSONObjectLxb != null && stp.NXR == null) {
            stp.NXR = jSONObjectLxb;
        }
        switch (i) {
            case 1:
                FrameLayout frameLayout = this.sLN;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.JVA;
                if (tDVar == null || tDVar.tD() != 1 || z) {
                    QAg qAg2 = this.ebl;
                    if (qAg2 != null) {
                        qAg2.Lxb(stp);
                        this.ebl.Lxb(str);
                        this.ebl.Lxb(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.JXs;
                    if (pAGExpressAdWrapperListener != null && !stp.brP) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (stp.VVE > 0) {
                    xan.Lxb(true);
                }
                OY oy2 = this.lc;
                if (oy2 != null) {
                    oy2.Lxb(stp);
                    this.lc.Lxb(str);
                    if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.JVA) && (jSONObject = stp.kqm) != null) {
                        this.lc.ZU(jSONObject.optBoolean("is_ceiling_page", false));
                    }
                    this.lc.Lxb(view2, f, f2, f3, f4, sparseArray2, z);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.JXs;
                if (pAGExpressAdWrapperListener2 != null && !stp.brP) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                xan.Lxb(false);
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.JVA, 9);
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.ZU;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                } else {
                    com.bytedance.sdk.openadsdk.lk.lk lkVar2 = this.lk;
                    if (lkVar2 != null) {
                        lkVar2.Lxb();
                    } else {
                        TTDelegateActivity.Lxb(this.JVA, this.nJ);
                    }
                }
                break;
            case 4:
                FrameLayout frameLayout2 = this.sLN;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.JVA;
                if (tDVar2 == null || tDVar2.tD() != 1 || z) {
                    nJ.lk(this.JVA);
                    if ("embeded_ad".equals(this.QAg) && HD() && !this.NXR && nJ.lk(this.JVA)) {
                        OY oy3 = this.lc;
                        if (oy3 != null) {
                            oy3.Lxb(stp);
                            this.lc.Lxb(str);
                            this.lc.Lxb(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        QAg qAg3 = this.ebl;
                        if (qAg3 != null) {
                            qAg3.Lxb(stp);
                            this.ebl.Lxb(str);
                            this.ebl.Lxb(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.JXs;
                    if (pAGExpressAdWrapperListener3 != null && !stp.brP) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                Lxb(!this.HD);
                break;
            case 6:
                Lxb();
                break;
            case 7:
                TTWebsiteActivity.Lxb(this.OY, this.JVA, this.QAg);
                break;
        }
    }

    public void lc(int i) {
        com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu = this.KPU;
        if (zu == null || !(zu instanceof eK)) {
            return;
        }
        ((eK) zu).Lxb(i);
        this.wbY = i;
    }

    public tD(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.Lxb = true;
        this.LD = 0;
        this.QAg = "embeded_ad";
        this.Ivz = null;
        this.STP = false;
        this.VVE = false;
        this.kqm = true;
        this.brP = -1;
        this.CG = "";
        this.HD = false;
        this.BcA = true;
        this.eK = -1;
        this.CSn = new com.bytedance.sdk.openadsdk.ZU.ebl();
        this.id = 0L;
        this.Pw = new AtomicBoolean(false);
        this.NDz = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                tD tDVar2 = tD.this;
                if (tDVar2.kqm) {
                    tDVar2.Sfi();
                    tD tDVar3 = tD.this;
                    tDVar3.removeCallbacks(tDVar3.JJ);
                    tD tDVar4 = tD.this;
                    tDVar4.postDelayed(tDVar4.JJ, 500L);
                }
            }
        };
        this.JJ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.2
            @Override // java.lang.Runnable
            public void run() {
                if (!nE.Lxb(tD.this, 0, 5)) {
                    tD.this.lc(8);
                } else {
                    tD tDVar2 = tD.this;
                    tDVar2.lc(tDVar2.getVisibility());
                }
            }
        };
        this.VU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.3
            @Override // java.lang.Runnable
            public void run() {
                tD.this.lc(0);
            }
        };
        this.sRq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.tD.4
            @Override // java.lang.Runnable
            public void run() {
                tD.this.lc(8);
            }
        };
        this.wbY = 8;
        this.FD = new SparseArray<>();
        this.ae = -1.0f;
        this.xr = -1.0f;
        this.bG = -1.0f;
        this.jeq = -1.0f;
        this.MGT = 0L;
        this.QAg = str;
        this.OY = context;
        this.JVA = tDVar;
        this.nBu = adSlot;
        this.HD = z;
        this.BcA = z2;
        lc();
    }

    public static JSONObject Lxb(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ZU<? extends View> zu, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        this.Pw.set(true);
        this.KPU = zu;
        if (this.wbY != getWindowVisibility()) {
            lc(getWindowVisibility());
        }
        zu.lk();
        if (zu.lk() == 3 && (tDVar = this.JVA) != null && tDVar.kqm() == 1) {
            this.JVA.LD(0);
        }
        if (zu.lk() != 1) {
            View viewJXs = zu.JXs();
            if (viewJXs.getParent() != null) {
                ((ViewGroup) viewJXs.getParent()).removeView(viewJXs);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof com.bytedance.sdk.component.QAg.ZU) {
                    removeView((View) arrayList.get(i2));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.JVA)) {
                addView(zu.JXs(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(zu.JXs());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.JVA;
        if (tDVar2 != null) {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb(tDVar2.LD(), this.id, this.QAg, zu.lk());
        }
        com.bytedance.sdk.component.adexpress.LD.QAg qAg = this.SS;
        if (qAg != null) {
            ((NXR) qAg).JVA();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.JXs;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) stp.ZU(), (float) stp.JXs());
        }
        if (Lxb(stp)) {
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this, this.JVA, lk(getDynamicShowType()));
        }
        Sfi sfi = this.rW;
        if (sfi != null) {
            sfi.Lxb(this.JVA, this.QAg);
        }
    }

    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (!(this.KPU instanceof eK)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (tDVar != null) {
                if (tDVar.rW() != null && tDVar.rW().STP()) {
                    jSONObject.put("engine_version", tDVar.rW().NXR());
                } else if (tDVar.dR() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }
}
