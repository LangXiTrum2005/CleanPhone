package com.bytedance.adsdk.ugeno.core.Lxb;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.bytedance.adsdk.ugeno.ZU.LD;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lxb implements sLN {
    private volatile C0038Lxb JXs;
    private String LD;
    private sLN Lxb;
    private JSONObject ZU;
    private boolean lk = true;
    private boolean lc = false;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public class C0038Lxb implements ICustomRouter {
        sLN.Lxb Lxb;
        private sLN.LD ZU;
        private nBu lk;

        public C0038Lxb() {
        }

        public void Lxb(nBu nbu) {
            this.lk = nbu;
        }

        public void Lxb(sLN.LD ld) {
            this.ZU = ld;
        }

        public void Lxb(sLN.Lxb lxb) {
            this.Lxb = lxb;
        }
    }

    public Lxb(sLN sln) {
        this.Lxb = sln;
    }

    private void lk(nBu nbu, sLN.LD ld, sLN.Lxb lxb) {
        if (this.JXs == null) {
            this.JXs = LD();
        }
        this.JXs.Lxb(nbu);
        this.JXs.Lxb(ld);
        this.JXs.Lxb(lxb);
        JSONObject jSONObjectLk = nbu.lk();
        if (jSONObjectLk == null) {
            return;
        }
        new EventChainAction.Builder(jSONObjectLk.optString("type")).setChainData(this.ZU).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.Lxb.Lxb.1
        }).build().run();
    }

    public void LD(boolean z) {
        this.lc = z;
    }

    public void Lxb(JSONObject jSONObject) {
        this.ZU = jSONObject;
    }

    private void LD(nBu nbu, sLN.LD ld, sLN.Lxb lxb) {
        sLN sln = this.Lxb;
        if (sln == null) {
            return;
        }
        sln.Lxb(nbu, ld, lxb);
    }

    public void Lxb(String str) {
        this.LD = str;
    }

    public void Lxb(boolean z) {
        this.lk = z;
    }

    private C0038Lxb LD() {
        if (this.JXs != null) {
            return this.JXs;
        }
        synchronized (C0038Lxb.class) {
            try {
                if (this.JXs != null) {
                    return this.JXs;
                }
                this.JXs = new C0038Lxb();
                return this.JXs;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Lxb() {
        String str;
        return this.lk && (str = this.LD) != null && ExifInterface.GPS_MEASUREMENT_3D.compareTo(str) <= 0 && this.ZU != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(nBu nbu, sLN.LD ld, sLN.Lxb lxb) {
        if (Lxb()) {
            lk(nbu, ld, lxb);
        } else {
            LD(nbu, ld, lxb);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(lk lkVar, String str, LD.Lxb lxb) {
        sLN sln = this.Lxb;
        if (sln == null) {
            return;
        }
        sln.Lxb(lkVar, str, lxb);
    }
}
