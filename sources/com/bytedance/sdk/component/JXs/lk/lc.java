package com.bytedance.sdk.component.JXs.lk;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.JXs.NXR;
import com.bytedance.sdk.component.JXs.Sfi;
import com.bytedance.sdk.component.JXs.brP;
import com.bytedance.sdk.component.JXs.kqm;
import com.bytedance.sdk.component.JXs.sLN;
import com.bytedance.sdk.component.JXs.tD;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private final NXR LD;
    private ExecutorService OY;
    private kqm QAg;
    private sLN ebl;
    private com.bytedance.sdk.component.JXs.ZU lc;
    private Map<String, List<lk>> Lxb = new ConcurrentHashMap();
    private Map<String, brP> lk = new HashMap();
    private Map<String, tD> ZU = new HashMap();
    private Map<String, com.bytedance.sdk.component.JXs.lk> JXs = new HashMap();

    public lc(Context context, NXR nxr) {
        this.LD = (NXR) OY.Lxb(nxr);
        com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb(context, nxr.QAg());
    }

    private ExecutorService JVA() {
        ExecutorService executorServiceLD = this.LD.LD();
        return executorServiceLD != null ? executorServiceLD : com.bytedance.sdk.component.JXs.Lxb.lk.Lxb();
    }

    private tD JXs(com.bytedance.sdk.component.JXs.LD ld) {
        tD tDVarLc = this.LD.lc();
        return tDVarLc != null ? tDVarLc : com.bytedance.sdk.component.JXs.lk.Lxb.LD.JXs.Lxb(ld.LD());
    }

    private com.bytedance.sdk.component.JXs.ZU QAg() {
        com.bytedance.sdk.component.JXs.ZU ZU = this.LD.ZU();
        return ZU == null ? com.bytedance.sdk.component.JXs.LD.LD.Lxb() : ZU;
    }

    private brP ZU(com.bytedance.sdk.component.JXs.LD ld) {
        brP brpJXs = this.LD.JXs();
        return brpJXs != null ? com.bytedance.sdk.component.JXs.lk.Lxb.LD.Lxb.Lxb(brpJXs) : com.bytedance.sdk.component.JXs.lk.Lxb.LD.Lxb.Lxb(ld.LD());
    }

    private com.bytedance.sdk.component.JXs.lk lc(com.bytedance.sdk.component.JXs.LD ld) {
        com.bytedance.sdk.component.JXs.lk lkVarEbl = this.LD.ebl();
        return lkVarEbl != null ? lkVarEbl : new com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.LD(ld.JXs(), ld.Lxb(), lc());
    }

    private sLN nBu() {
        sLN slnLxb = this.LD.Lxb();
        return slnLxb != null ? slnLxb : com.bytedance.sdk.component.JXs.Lxb.LD.Lxb();
    }

    private kqm sLN() {
        kqm kqmVarOY = this.LD.OY();
        return kqmVarOY == null ? new ebl() : kqmVarOY;
    }

    public Collection<tD> LD() {
        return this.ZU.values();
    }

    public Collection<brP> Lxb() {
        return this.lk.values();
    }

    public kqm OY() {
        if (this.QAg == null) {
            this.QAg = sLN();
        }
        return this.QAg;
    }

    public Map<String, List<lk>> ebl() {
        return this.Lxb;
    }

    public Collection<com.bytedance.sdk.component.JXs.lk> lk() {
        return this.JXs.values();
    }

    public tD LD(com.bytedance.sdk.component.JXs.LD ld) {
        if (ld == null) {
            ld = com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.ebl();
        }
        String string = ld.JXs().toString();
        tD tDVar = this.ZU.get(string);
        if (tDVar != null) {
            return tDVar;
        }
        tD tDVarJXs = JXs(ld);
        this.ZU.put(string, tDVarJXs);
        return tDVarJXs;
    }

    public brP Lxb(com.bytedance.sdk.component.JXs.LD ld) {
        if (ld == null) {
            ld = com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.ebl();
        }
        String string = ld.JXs().toString();
        brP brp = this.lk.get(string);
        if (brp != null) {
            return brp;
        }
        brP brpZU = ZU(ld);
        this.lk.put(string, brpZU);
        return brpZU;
    }

    public com.bytedance.sdk.component.JXs.lk lk(com.bytedance.sdk.component.JXs.LD ld) {
        if (ld == null) {
            ld = com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.ebl();
        }
        String string = ld.JXs().toString();
        com.bytedance.sdk.component.JXs.lk lkVar = this.JXs.get(string);
        if (lkVar != null) {
            return lkVar;
        }
        com.bytedance.sdk.component.JXs.lk lkVarLc = lc(ld);
        this.JXs.put(string, lkVarLc);
        return lkVarLc;
    }

    public sLN JXs() {
        if (this.ebl == null) {
            this.ebl = nBu();
        }
        return this.ebl;
    }

    public ExecutorService lc() {
        ExecutorService executorServiceLxb;
        Sfi sfiLk = this.LD.lk();
        if (sfiLk != null && (executorServiceLxb = sfiLk.Lxb()) != null) {
            return executorServiceLxb;
        }
        if (this.OY == null) {
            this.OY = JVA();
        }
        return this.OY;
    }

    public com.bytedance.sdk.component.JXs.ZU ZU() {
        if (this.lc == null) {
            this.lc = QAg();
        }
        return this.lc;
    }

    public com.bytedance.sdk.component.JXs.lk Lxb(String str) {
        return lk(com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb(new File(str)));
    }

    public com.bytedance.sdk.component.JXs.lk.LD.Lxb Lxb(lk lkVar) {
        ImageView.ScaleType scaleTypeZU = lkVar.ZU();
        if (scaleTypeZU == null) {
            scaleTypeZU = com.bytedance.sdk.component.JXs.lk.LD.Lxb.Lxb;
        }
        ImageView.ScaleType scaleType = scaleTypeZU;
        Bitmap.Config configJVA = lkVar.JVA();
        if (configJVA == null) {
            configJVA = com.bytedance.sdk.component.JXs.lk.LD.Lxb.LD;
        }
        return new com.bytedance.sdk.component.JXs.lk.LD.Lxb(lkVar.LD(), lkVar.lk(), scaleType, configJVA, lkVar.ebl(), lkVar.OY());
    }
}
