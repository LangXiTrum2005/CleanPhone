package com.bytedance.adsdk.LD.lk.lk;

import com.bytedance.adsdk.LD.lk.Lxb.JVA;
import com.bytedance.adsdk.LD.lk.Lxb.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class JXs {
    private final List<com.bytedance.adsdk.LD.ebl.Lxb<Float>> DY;
    private final boolean HD;
    private final float IeN;
    private final int JVA;
    private final Lxb JXs;
    private final com.bytedance.adsdk.LD.ebl LD;
    private final List<com.bytedance.adsdk.LD.lk.LD.lk> Lxb;
    private final float NXR;
    private final List<com.bytedance.adsdk.LD.lk.LD.OY> OY;
    private final sLN QAg;
    private final float STP;
    private final LD Sfi;
    private final float VVE;
    private final long ZU;
    private final com.bytedance.adsdk.LD.JXs.nBu aH;
    private final JVA brP;
    private final com.bytedance.adsdk.LD.lk.LD.Lxb eK;
    private final String ebl;
    private final com.bytedance.adsdk.LD.lk.Lxb.nBu kqm;
    private final long lc;
    private final String lk;
    private final int nBu;
    private final int sLN;
    private final com.bytedance.adsdk.LD.lk.Lxb.LD tD;

    public enum LD {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum Lxb {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public JXs(List<com.bytedance.adsdk.LD.lk.LD.lk> list, com.bytedance.adsdk.LD.ebl eblVar, String str, long j, Lxb lxb, long j2, String str2, List<com.bytedance.adsdk.LD.lk.LD.OY> list2, sLN sln, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.LD.lk.Lxb.nBu nbu, JVA jva, List<com.bytedance.adsdk.LD.ebl.Lxb<Float>> list3, LD ld, com.bytedance.adsdk.LD.lk.Lxb.LD ld2, boolean z, com.bytedance.adsdk.LD.lk.LD.Lxb lxb2, com.bytedance.adsdk.LD.JXs.nBu nbu2) {
        this.Lxb = list;
        this.LD = eblVar;
        this.lk = str;
        this.ZU = j;
        this.JXs = lxb;
        this.lc = j2;
        this.ebl = str2;
        this.OY = list2;
        this.QAg = sln;
        this.nBu = i;
        this.JVA = i2;
        this.sLN = i3;
        this.NXR = f;
        this.STP = f2;
        this.IeN = f3;
        this.VVE = f4;
        this.kqm = nbu;
        this.brP = jva;
        this.DY = list3;
        this.Sfi = ld;
        this.tD = ld2;
        this.HD = z;
        this.eK = lxb2;
        this.aH = nbu2;
    }

    public JVA DY() {
        return this.brP;
    }

    public boolean HD() {
        return this.HD;
    }

    public sLN IeN() {
        return this.QAg;
    }

    public Lxb JVA() {
        return this.JXs;
    }

    public long JXs() {
        return this.ZU;
    }

    public float LD() {
        return this.NXR;
    }

    public String Lxb(String str) {
        StringBuilder sbO = DM.o(str);
        sbO.append(lc());
        sbO.append("\n");
        JXs jXsLxb = this.LD.Lxb(NXR());
        if (jXsLxb != null) {
            sbO.append("\t\tParents: ");
            sbO.append(jXsLxb.lc());
            JXs jXsLxb2 = this.LD.Lxb(jXsLxb.NXR());
            while (jXsLxb2 != null) {
                sbO.append("->");
                sbO.append(jXsLxb2.lc());
                jXsLxb2 = this.LD.Lxb(jXsLxb2.NXR());
            }
            sbO.append(str);
            sbO.append("\n");
        }
        if (!nBu().isEmpty()) {
            sbO.append(str);
            sbO.append("\tMasks: ");
            sbO.append(nBu().size());
            sbO.append("\n");
        }
        if (brP() != 0 && kqm() != 0) {
            sbO.append(str);
            sbO.append("\tBackground: ");
            sbO.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(brP()), Integer.valueOf(kqm()), Integer.valueOf(VVE())));
        }
        if (!this.Lxb.isEmpty()) {
            sbO.append(str);
            sbO.append("\tShapes:\n");
            for (com.bytedance.adsdk.LD.lk.LD.lk lkVar : this.Lxb) {
                sbO.append(str);
                sbO.append("\t\t");
                sbO.append(lkVar);
                sbO.append("\n");
            }
        }
        return sbO.toString();
    }

    public long NXR() {
        return this.lc;
    }

    public float OY() {
        return this.IeN;
    }

    public float QAg() {
        return this.VVE;
    }

    public List<com.bytedance.adsdk.LD.lk.LD.lk> STP() {
        return this.Lxb;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.LD Sfi() {
        return this.tD;
    }

    public int VVE() {
        return this.sLN;
    }

    public List<com.bytedance.adsdk.LD.ebl.Lxb<Float>> ZU() {
        return this.DY;
    }

    public com.bytedance.adsdk.LD.JXs.nBu aH() {
        return this.aH;
    }

    public int brP() {
        return this.nBu;
    }

    public com.bytedance.adsdk.LD.lk.LD.Lxb eK() {
        return this.eK;
    }

    public String ebl() {
        return this.ebl;
    }

    public int kqm() {
        return this.JVA;
    }

    public String lc() {
        return this.lk;
    }

    public float lk() {
        return this.STP / this.LD.kqm();
    }

    public List<com.bytedance.adsdk.LD.lk.LD.OY> nBu() {
        return this.OY;
    }

    public LD sLN() {
        return this.Sfi;
    }

    public com.bytedance.adsdk.LD.lk.Lxb.nBu tD() {
        return this.kqm;
    }

    public String toString() {
        return Lxb("");
    }

    public com.bytedance.adsdk.LD.ebl Lxb() {
        return this.LD;
    }
}
