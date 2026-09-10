package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.webkit.DownloadListener;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.eK;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    public static int LD = 1;
    public static int Lxb = 0;
    public static int lk = 2;

    @Nullable
    private nBu JXs;
    private final boolean ZU;

    @Nullable
    private QAg lc;

    public OY(Lxb lxb, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        boolean zII = tDVar.II();
        this.ZU = zII;
        if (zII) {
            this.JXs = eK.lc(tDVar) ? new ebl(lxb) : new nBu(lxb);
        } else {
            this.lc = new QAg(lxb);
        }
    }

    public void IeN() {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.Lxb();
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb();
        }
    }

    public com.bytedance.sdk.openadsdk.sLN.ZU JVA() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.STP();
        }
        return null;
    }

    public void JXs() {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.lc();
        }
    }

    public float LD() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.nBu();
        }
        return 0.0f;
    }

    public boolean Lxb() {
        QAg qAg = this.lc;
        return qAg != null && qAg.kqm();
    }

    public void NXR() {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.ZU();
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.JVA();
        }
    }

    public void OY() {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.LD();
        }
    }

    public long QAg() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.QAg();
        }
        return 0L;
    }

    public void STP() {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.OY();
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.NXR();
        }
    }

    public void VVE() {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.JXs();
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.sLN();
        }
    }

    public com.bytedance.sdk.openadsdk.tD.OY ZU() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.brP();
        }
        return null;
    }

    public void brP() {
        nBu nbu = this.JXs;
        if (nbu != null) {
            nbu.lk();
        }
    }

    public boolean ebl() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.IeN();
        }
        return false;
    }

    public void kqm() {
        nBu nbu = this.JXs;
        if (nbu != null) {
            nbu.JVA();
        }
    }

    public void lc() {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.ebl();
        }
    }

    public boolean lk() {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.VVE();
        }
        return true;
    }

    public void nBu() {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.JXs();
        }
    }

    public void sLN() {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.ZU();
        }
    }

    public void Lxb(int i) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.LD(i);
        }
    }

    public void JXs(boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.JXs(z);
        }
    }

    public int LD(int i) {
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.ZU(i);
        }
        return 0;
    }

    public boolean OY(int i) {
        if (this.ZU && i == LD) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                return nbu.nBu();
            }
            return false;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            return qAg.OY();
        }
        return false;
    }

    public void ZU(boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.ZU(z);
        }
    }

    public void ebl(int i) {
        nBu nbu;
        if (this.ZU && i != lk && (nbu = this.JXs) != null) {
            nbu.lc();
            return;
        }
        QAg qAg = this.lc;
        if (qAg == null || i == LD) {
            return;
        }
        qAg.lk();
    }

    public void lc(int i) {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.LD(i);
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.lc(i);
        }
    }

    public void lk(int i) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.lk(i);
        }
    }

    public void Lxb(boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.LD(z);
        }
    }

    public void JXs(int i) {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.Lxb(i);
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(i);
        }
    }

    public void LD(boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.lc(z);
        }
    }

    public boolean ZU(int i) {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                return nbu.QAg();
            }
        } else {
            QAg qAg = this.lc;
            if (qAg != null && qAg.QAg() - this.lc.nBu() >= i) {
                return true;
            }
        }
        return false;
    }

    public void lk(boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(z);
        }
    }

    public void Lxb(JSONObject jSONObject) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(jSONObject);
        }
    }

    public void LD(String str) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.LD(str);
        }
    }

    public void lk(String str) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(str);
        }
    }

    public void Lxb(int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar, boolean z) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(i, tDVar, z);
        }
    }

    public void lc(boolean z) {
        nBu nbu = this.JXs;
        if (nbu != null) {
            nbu.lk(z);
        }
    }

    public void Lxb(DownloadListener downloadListener) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(downloadListener);
        }
    }

    public void Lxb(String str) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.lk(str);
        }
    }

    public void Lxb(int i, String str, String str2) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(i, str, str2);
        }
    }

    public void Lxb(boolean z, String str, int i) {
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(z, str, i);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.Lxb(jXs);
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(jXs);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.sLN.JXs jXs, boolean z) {
        if (this.ZU) {
            nBu nbu = this.JXs;
            if (nbu != null) {
                nbu.LD(z);
                return;
            }
            return;
        }
        QAg qAg = this.lc;
        if (qAg != null) {
            qAg.Lxb(jXs, z);
        }
    }
}
