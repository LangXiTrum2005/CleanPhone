package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.jyq;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bjy {
    private String aaj;
    private boolean bch;
    private boolean bjy;
    private long exc;
    private boolean exu;
    private long fs;
    private long jl;
    private final ljh jpc;
    private final qdl ljh;
    boolean lnr;
    final boolean mml;
    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr mo;
    private boolean oth;
    private com.bytedance.sdk.openadsdk.mml.wd rc;
    private boolean rdp;
    private long rq;
    private final String to;
    private FrameLayout tvp;
    private com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl vu;
    private final Activity wd;
    protected boolean qdl = false;
    boolean ud = false;
    protected boolean mzz = false;
    private long jtx = -1;
    private int yt = -1;
    private boolean uw = false;
    private int xmv = 0;
    private float bqt = 1.0f;
    private boolean koa = false;
    private HashSet<String> jyq = new HashSet<>();

    public bjy(qdl qdlVar) {
        this.ljh = qdlVar;
        this.wd = qdlVar.ag;
        this.jpc = qdlVar.ud;
        this.mml = qdlVar.mml;
        this.to = qdlVar.mzz;
    }

    private void yh() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return;
        }
        this.rq = this.mo.mo();
        if (this.mo.rq().lnr() || !this.mo.rq().ud()) {
            this.mo.ud();
            this.mo.mml();
            this.qdl = true;
        }
    }

    public void aaj() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.lnr();
        }
    }

    public void ag() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).ag();
        }
    }

    public void ax() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).ax();
        }
    }

    public int bch() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.jpc();
        }
        return 0;
    }

    public void bjy() {
        try {
            if (mo()) {
                this.mo.ud();
            }
        } catch (Throwable th) {
            aaj.lnr(a.o(th, new StringBuilder("RewardFullVideoPlayerManager onPause throw Exception :")), new Object[0]);
        }
    }

    public boolean bqt() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            if (lnrVar.rq() != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVarRq = this.mo.rq();
                if (qdlVarRq.wd() || qdlVarRq.jpc()) {
                    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar2 = this.mo;
                    if (lnrVar2 instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
                        ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar2).mrf();
                    }
                    return true;
                }
            } else if (rq()) {
                qdl(false);
                com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar3 = this.mo;
                if (lnrVar3 instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
                    ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar3).mrf();
                }
                return true;
            }
        }
        return false;
    }

    public boolean cx() {
        return this.exu;
    }

    public void ekw() {
        this.uw = false;
        jl();
    }

    public void exc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.mzz();
        }
    }

    public long exu() {
        return this.fs;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public double fco() {
        double dMo;
        long jMml;
        com.bytedance.sdk.openadsdk.component.reward.rq rqVar;
        jyq jyqVarAaj = this.jpc.aaj();
        if (!com.bytedance.sdk.openadsdk.core.model.aaj.mml(this.jpc) || jyqVarAaj == null) {
            if (!com.bytedance.sdk.openadsdk.core.model.aaj.wd(this.jpc) || jyqVarAaj == null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = this.jpc.tdy();
                dMo = udVarTdy != null ? udVarTdy.mo() * ((double) udVarTdy.oth()) : 0.0d;
            } else {
                jMml = jyqVarAaj.mml();
            }
            rqVar = this.ljh.gg;
            if (rqVar != null) {
                rqVar.qdl((long) dMo);
            }
            return dMo;
        }
        jMml = jyqVarAaj.ud();
        dMo = jMml;
        rqVar = this.ljh.gg;
        if (rqVar != null) {
            rqVar.qdl((long) dMo);
        }
        return dMo;
    }

    public long fs() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null ? lnrVar.mo() : this.rq;
    }

    public View gy() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            return (View) ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).gy();
        }
        return null;
    }

    public void hkc() {
        try {
            if (mo()) {
                this.mzz = true;
                jyq();
            }
        } catch (Exception e2) {
            aaj.lnr("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e2.getMessage());
        }
    }

    public boolean hzv() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return false;
        }
        return this.mo.rq().qdl();
    }

    public void jl() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        lnrVar.mml();
        this.mo = null;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl jpc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lnr ? ((com.bytedance.sdk.openadsdk.component.reward.lnr) lnrVar).yt() : lnrVar.fs();
        }
        return null;
    }

    public long jtx() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.wd();
        }
        return 0L;
    }

    public void jyq() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.ud();
        }
    }

    public boolean kdv() {
        return this.lnr;
    }

    public boolean koa() {
        return this.mo != null;
    }

    public int ljh() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.to();
        }
        return 0;
    }

    public boolean mml() {
        int i2;
        if (this.koa) {
            return this.uw && this.xmv == 1;
        }
        return this.uw && ((i2 = this.xmv) == 2 || i2 == 1);
    }

    public boolean mo() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return (lnrVar == null || lnrVar.rq() == null || !this.mo.rq().mo()) ? false : true;
    }

    public void mrf() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).fco();
        }
    }

    public com.bytedance.sdk.openadsdk.mml.wd mzz() {
        return this.rc;
    }

    public void om() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return;
        }
        this.rq = this.mo.mo();
        exc();
        qdl(true);
        this.exu = true;
    }

    public long oth() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.tvp();
        }
        return 0L;
    }

    public void rc() {
        int i2 = this.xmv;
        if (i2 == 1 || i2 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                qdl(jSONObject);
            } catch (Throwable th) {
                aaj.qdl("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public long rdp() {
        return this.rq;
    }

    public boolean rq() {
        return this.qdl;
    }

    public boolean to() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.rdp();
    }

    public boolean tvp() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return (lnrVar == null || lnrVar.rq() == null || !this.mo.rq().wd()) ? false : true;
    }

    public long uw() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return 0L;
        }
        return this.mo.wd() + lnrVar.tvp();
    }

    public boolean vu() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.rq() == null;
    }

    public void wc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl();
        }
    }

    public boolean wd() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.exu();
    }

    public long xmv() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.tvp();
        }
        return 0L;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.qdl yt() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.rq();
        }
        return null;
    }

    public boolean lnr() {
        return this.uw;
    }

    public void mzz(boolean z2) {
        this.bjy = z2;
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).mo(z2);
        }
    }

    public long qdl() {
        return this.jtx;
    }

    public long ud() {
        return this.jl;
    }

    private void ud(long j, long j2) {
        int iAbs = (int) Math.abs(((long) this.yt) - j);
        int i2 = this.yt;
        if (i2 < 0 || iAbs > 500 || i2 > j2 || iAbs >= 500 || this.jyq.contains(this.aaj)) {
            return;
        }
        if (this.yt > j) {
            com.bytedance.sdk.openadsdk.core.rdp.lnr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.bjy.1
                @Override // java.lang.Runnable
                public void run() {
                    bjy.this.hkc();
                    bjy.this.ljh.bqt.qdl(bjy.this.yt, bjy.this.aaj);
                }
            }, iAbs);
        } else {
            hkc();
            this.ljh.bqt.qdl(this.yt, this.aaj);
        }
        this.jyq.add(this.aaj);
    }

    public void lnr(boolean z2) {
        this.lnr = z2;
    }

    public void qdl(long j) {
        this.jtx = j;
    }

    public void mml(boolean z2) {
        this.bch = z2;
        if (this.mo instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            if (z2) {
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).ud(this.jpc.tdy().oth());
            } else {
                this.jpc.tdy().to(1);
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).ud(1);
            }
        }
    }

    public void qdl(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.mml.wd wdVar) {
        if (this.oth) {
            return;
        }
        this.oth = true;
        this.tvp = frameLayout;
        if (this.jpc.eu() != null) {
            this.xmv = this.jpc.eu().ud();
            this.bqt = this.jpc.eu().qdl();
        }
        this.rc = wdVar;
        if (ljh.mzz(this.jpc)) {
            this.koa = true;
            this.mo = new com.bytedance.sdk.openadsdk.core.exu.mml.qdl(this.wd, this.tvp, this.jpc, wdVar);
            mml(this.bch);
            com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl interfaceC0111qdl = this.vu;
            if (interfaceC0111qdl != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).qdl(interfaceC0111qdl);
            }
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).mo(this.bjy);
            return;
        }
        this.koa = false;
        com.bytedance.sdk.openadsdk.component.reward.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.reward.lnr(this.jpc, wdVar);
        this.mo = lnrVar;
        com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl interfaceC0111qdl2 = this.vu;
        if (interfaceC0111qdl2 != null) {
            lnrVar.qdl(interfaceC0111qdl2);
        }
    }

    public void ud(long j) {
        this.rq = j;
    }

    public void ud(boolean z2) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.ud();
            this.rdp = z2;
        }
    }

    public void ud(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        if (!bqt() || udVar == null) {
            return;
        }
        udVar.qdl(rdp(), true);
    }

    public void qdl(com.bytedance.sdk.openadsdk.mml.wd wdVar) {
        this.rc = wdVar;
    }

    public void qdl(long j, long j2) {
        this.fs = j;
        ud(j, j2);
    }

    public void qdl(int i2, String str) {
        this.yt = i2;
        this.aaj = str;
    }

    public void qdl(boolean z2) {
        this.qdl = z2;
    }

    public void qdl(int i2, int i3) {
        if (this.mo != null) {
            com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy.qdl qdlVar = new com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy.qdl();
            qdlVar.lnr(jtx());
            qdlVar.mml(uw());
            qdlVar.ud(fs());
            qdlVar.qdl(i2);
            qdlVar.ud(i3);
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.mml(this.mo.fs(), qdlVar);
        }
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(qdlVar);
        }
    }

    public void qdl(boolean z2, String str) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(z2, str);
        }
    }

    public void qdl(String str, boolean z2) {
        if (this.mo != null) {
            long jFs = fs();
            if (this.jpc.yh()) {
                jFs = this.ljh.lnr();
            }
            long j = jFs;
            JSONObject jSONObjectQdl = gy.qdl(this.jpc, this.mo.wd(), this.mo.rq());
            try {
                jSONObjectQdl.put("auto_click", z2);
                if (!z2) {
                    qdl qdlVar = this.ljh;
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(jSONObjectQdl, qdlVar.mml ? qdlVar.ud.qg() : qdlVar.ud.ws(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.jpc, this.to, str, j, ljh(), jSONObjectQdl, this.rc);
            uw();
            ljh();
        }
        ax();
    }

    public boolean qdl(long j, boolean z2, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        boolean zQdl;
        boolean z3 = false;
        if (!koa()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.aaj.mml(this.ljh.ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(this.ljh.ud)) {
            return true;
        }
        if (!z2 || !vu()) {
            qdl(udVar);
        }
        try {
            zQdl = qdl(j, this.ljh.gt);
            try {
                this.exu = false;
            } catch (Exception e2) {
                e = e2;
                z3 = zQdl;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                zQdl = z3;
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (zQdl && !z2) {
            this.ljh.vu.qdl(map);
        }
        return zQdl;
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        if (this.ljh.to.get()) {
            return;
        }
        qdl qdlVar = this.ljh;
        if (!qdlVar.irn || vu.lnr(qdlVar.ud)) {
            return;
        }
        if ((!ljh.mzz(this.ljh.ud) && com.bytedance.sdk.openadsdk.core.yt.mml().exu(String.valueOf(this.ljh.mo)) == 1 && this.ljh.bqt.mml()) || com.bytedance.sdk.openadsdk.core.model.aaj.mml(this.ljh.ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(this.ljh.ud) || this.mzz || !udVar.mo()) {
            return;
        }
        this.ljh.cx.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.ljh.cx.sendMessageDelayed(messageObtain, 5000L);
    }

    public boolean qdl(JSONObject jSONObject) {
        int i2;
        if (this.mo != null && jSONObject != null && ((i2 = this.xmv) == 1 || i2 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.bqt = fOptDouble;
            if (fOptDouble <= 0.0f && this.ljh.ud.eu() != null) {
                this.bqt = this.ljh.ud.eu().qdl();
            }
            if (iOptInt == 0) {
                this.bqt = 1.0f;
                if (this.uw) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - this.exc) + this.jl;
                    this.jl = jCurrentTimeMillis;
                    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
                    if (lnrVar != null) {
                        lnrVar.qdl(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar = this.ljh.wc;
                    if (udVar != null) {
                        udVar.mml(false);
                    }
                }
            } else if (iOptInt == 1 && !this.uw) {
                this.exc = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar2 = this.ljh.wc;
                if (udVar2 != null) {
                    udVar2.mml(true);
                }
            }
            this.uw = iOptInt == 1;
            if (this.xmv == 1) {
                return true;
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar2 = this.mo;
            if (lnrVar2 == null) {
                return false;
            }
            return lnrVar2.qdl(this.bqt);
        }
        this.uw = false;
        return false;
    }

    private boolean qdl(long j, boolean z2) {
        if (this.mo == null || this.jpc.tdy() == null) {
            return false;
        }
        String strQdl = CacheDirFactory.getICacheDir(this.jpc.lhl()).qdl();
        File file = new File(strQdl, this.jpc.tdy().rdp());
        if (file.exists() && file.length() > 0) {
            this.ud = true;
        }
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(strQdl, this.jpc);
        udVarQdl.ud(this.jpc.yre());
        udVarQdl.ud(this.tvp.getWidth());
        udVarQdl.lnr(this.tvp.getHeight());
        udVarQdl.lnr(this.jpc.ir());
        udVarQdl.qdl(j);
        udVarQdl.qdl(z2);
        return this.mo.qdl(udVarQdl);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        try {
            this.mzz = false;
            if (rq()) {
                yh();
                ud(udVar);
            } else if (tvp()) {
                aaj();
            }
        } catch (Throwable th) {
            aaj.lnr("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void qdl(boolean z2, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, boolean z3) {
        if (this.rdp || !(!z3 || z2 || this.mzz)) {
            if (tvp()) {
                aaj();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                yh();
                ud(udVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.rdp = false;
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0111qdl interfaceC0111qdl) {
        this.vu = interfaceC0111qdl;
    }
}
