package com.bytedance.adsdk.ud.lnr.lnr;

import android.support.v4.media.a;
import com.bytedance.adsdk.ud.lnr.qdl.fs;
import com.bytedance.adsdk.ud.lnr.qdl.rq;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class mzz {
    private final List<com.bytedance.adsdk.ud.wd.qdl<Float>> aaj;
    private final com.bytedance.adsdk.ud.mzz.to bch;
    private final float bjy;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud exc;
    private final float exu;
    private final int fs;
    private final rq jl;
    private final List<com.bytedance.adsdk.ud.lnr.ud.jpc> jpc;
    private final float jtx;
    private final ud jyq;
    private final com.bytedance.adsdk.ud.lnr.ud.qdl ljh;
    private final String lnr;
    private final long mml;
    private final long mo;
    private final qdl mzz;
    private final boolean oth;
    private final List<com.bytedance.adsdk.ud.lnr.ud.lnr> qdl;
    private final float rdp;
    private final int rq;
    private final int to;
    private final fs tvp;
    private final com.bytedance.adsdk.ud.wd ud;
    private final String wd;
    private final com.bytedance.adsdk.ud.lnr.qdl.to yt;

    public enum qdl {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum ud {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public mzz(List<com.bytedance.adsdk.ud.lnr.ud.lnr> list, com.bytedance.adsdk.ud.wd wdVar, String str, long j, qdl qdlVar, long j2, String str2, List<com.bytedance.adsdk.ud.lnr.ud.jpc> list2, fs fsVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, com.bytedance.adsdk.ud.lnr.qdl.to toVar, rq rqVar, List<com.bytedance.adsdk.ud.wd.qdl<Float>> list3, ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, boolean z2, com.bytedance.adsdk.ud.lnr.ud.qdl qdlVar2, com.bytedance.adsdk.ud.mzz.to toVar2) {
        this.qdl = list;
        this.ud = wdVar;
        this.lnr = str;
        this.mml = j;
        this.mzz = qdlVar;
        this.mo = j2;
        this.wd = str2;
        this.jpc = list2;
        this.tvp = fsVar;
        this.to = i2;
        this.rq = i3;
        this.fs = i4;
        this.exu = f;
        this.rdp = f2;
        this.bjy = f3;
        this.jtx = f4;
        this.yt = toVar;
        this.jl = rqVar;
        this.aaj = list3;
        this.jyq = udVar;
        this.exc = udVar2;
        this.oth = z2;
        this.ljh = qdlVar2;
        this.bch = toVar2;
    }

    public rq aaj() {
        return this.jl;
    }

    public com.bytedance.adsdk.ud.mzz.to bch() {
        return this.bch;
    }

    public fs bjy() {
        return this.tvp;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.to exc() {
        return this.yt;
    }

    public long exu() {
        return this.mo;
    }

    public ud fs() {
        return this.jyq;
    }

    public int jl() {
        return this.to;
    }

    public float jpc() {
        return this.bjy;
    }

    public int jtx() {
        return this.fs;
    }

    public com.bytedance.adsdk.ud.lnr.qdl.ud jyq() {
        return this.exc;
    }

    public com.bytedance.adsdk.ud.lnr.ud.qdl ljh() {
        return this.ljh;
    }

    public float lnr() {
        return this.rdp / this.ud.yt();
    }

    public List<com.bytedance.adsdk.ud.wd.qdl<Float>> mml() {
        return this.aaj;
    }

    public String mo() {
        return this.lnr;
    }

    public long mzz() {
        return this.mml;
    }

    public boolean oth() {
        return this.oth;
    }

    public String qdl(String str) {
        StringBuilder sbW = a.w(str);
        sbW.append(mo());
        sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        mzz mzzVarQdl = this.ud.qdl(exu());
        if (mzzVarQdl != null) {
            sbW.append("\t\tParents: ");
            sbW.append(mzzVarQdl.mo());
            mzz mzzVarQdl2 = this.ud.qdl(mzzVarQdl.exu());
            while (mzzVarQdl2 != null) {
                sbW.append("->");
                sbW.append(mzzVarQdl2.mo());
                mzzVarQdl2 = this.ud.qdl(mzzVarQdl2.exu());
            }
            sbW.append(str);
            sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!to().isEmpty()) {
            sbW.append(str);
            sbW.append("\tMasks: ");
            sbW.append(to().size());
            sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (jl() != 0 && yt() != 0) {
            sbW.append(str);
            sbW.append("\tBackground: ");
            sbW.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(jl()), Integer.valueOf(yt()), Integer.valueOf(jtx())));
        }
        if (!this.qdl.isEmpty()) {
            sbW.append(str);
            sbW.append("\tShapes:\n");
            for (com.bytedance.adsdk.ud.lnr.ud.lnr lnrVar : this.qdl) {
                sbW.append(str);
                sbW.append("\t\t");
                sbW.append(lnrVar);
                sbW.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sbW.toString();
    }

    public List<com.bytedance.adsdk.ud.lnr.ud.lnr> rdp() {
        return this.qdl;
    }

    public qdl rq() {
        return this.mzz;
    }

    public List<com.bytedance.adsdk.ud.lnr.ud.jpc> to() {
        return this.jpc;
    }

    public String toString() {
        return qdl("");
    }

    public float tvp() {
        return this.jtx;
    }

    public float ud() {
        return this.exu;
    }

    public String wd() {
        return this.wd;
    }

    public int yt() {
        return this.rq;
    }

    public com.bytedance.adsdk.ud.wd qdl() {
        return this.ud;
    }
}
