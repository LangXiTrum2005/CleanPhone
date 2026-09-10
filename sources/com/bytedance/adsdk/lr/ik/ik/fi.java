package com.bytedance.adsdk.lr.ik.ik;

import com.bytedance.adsdk.lr.ik.ri.co;
import com.bytedance.adsdk.lr.ik.ri.sf;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private final List<com.bytedance.adsdk.lr.xha.ri<Float>> ac;
    private final float aw;
    private final com.bytedance.adsdk.lr.fi.qt ay;
    private final float bgr;
    private final com.bytedance.adsdk.lr.ik.ri.qt bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final int f17989co;
    private final long di;
    private final ri fi;
    private final lr ihz;
    private final String ik;
    private final co jbs;
    private final long ka;
    private final com.bytedance.adsdk.lr.xha lr;
    private final List<com.bytedance.adsdk.lr.ik.lr.mj> mj;
    private final sf nr;
    private final int qt;
    private final List<com.bytedance.adsdk.lr.ik.lr.ik> ri;
    private final int sf;
    private final float slm;
    private final com.bytedance.adsdk.lr.ik.ri.lr tan;
    private final boolean uq;
    private final float vr;
    private final com.bytedance.adsdk.lr.ik.lr.ri wjv;
    private final String xha;

    public enum lr {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum ri {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public fi(List<com.bytedance.adsdk.lr.ik.lr.ik> list, com.bytedance.adsdk.lr.xha xhaVar, String str, long j, ri riVar, long j2, String str2, List<com.bytedance.adsdk.lr.ik.lr.mj> list2, co coVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.lr.ik.ri.qt qtVar, sf sfVar, List<com.bytedance.adsdk.lr.xha.ri<Float>> list3, lr lrVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, boolean z, com.bytedance.adsdk.lr.ik.lr.ri riVar2, com.bytedance.adsdk.lr.fi.qt qtVar2) {
        this.ri = list;
        this.lr = xhaVar;
        this.ik = str;
        this.ka = j;
        this.fi = riVar;
        this.di = j2;
        this.xha = str2;
        this.mj = list2;
        this.jbs = coVar;
        this.qt = i;
        this.sf = i2;
        this.f17989co = i3;
        this.aw = f;
        this.bgr = f2;
        this.vr = f3;
        this.slm = f4;
        this.bu = qtVar;
        this.nr = sfVar;
        this.ac = list3;
        this.ihz = lrVar;
        this.tan = lrVar2;
        this.uq = z;
        this.wjv = riVar2;
        this.ay = qtVar2;
    }

    public sf ac() {
        return this.nr;
    }

    public long aw() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.fi.qt ay() {
        return this.ay;
    }

    public List<com.bytedance.adsdk.lr.ik.lr.ik> bgr() {
        return this.ri;
    }

    public int bu() {
        return this.sf;
    }

    public lr co() {
        return this.ihz;
    }

    public String di() {
        return this.ik;
    }

    public long fi() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ihz() {
        return this.tan;
    }

    public float ik() {
        return this.bgr / this.lr.bu();
    }

    public float jbs() {
        return this.slm;
    }

    public List<com.bytedance.adsdk.lr.xha.ri<Float>> ka() {
        return this.ac;
    }

    public float lr() {
        return this.aw;
    }

    public float mj() {
        return this.vr;
    }

    public int nr() {
        return this.qt;
    }

    public List<com.bytedance.adsdk.lr.ik.lr.mj> qt() {
        return this.mj;
    }

    public com.bytedance.adsdk.lr.xha ri() {
        return this.lr;
    }

    public ri sf() {
        return this.fi;
    }

    public int slm() {
        return this.f17989co;
    }

    public com.bytedance.adsdk.lr.ik.ri.qt tan() {
        return this.bu;
    }

    public String toString() {
        return ri("");
    }

    public boolean uq() {
        return this.uq;
    }

    public co vr() {
        return this.jbs;
    }

    public com.bytedance.adsdk.lr.ik.lr.ri wjv() {
        return this.wjv;
    }

    public String xha() {
        return this.xha;
    }

    public String ri(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(di());
        sb.append("\n");
        fi fiVarRi = this.lr.ri(aw());
        if (fiVarRi != null) {
            sb.append("\t\tParents: ");
            sb.append(fiVarRi.di());
            fi fiVarRi2 = this.lr.ri(fiVarRi.aw());
            while (fiVarRi2 != null) {
                sb.append("->");
                sb.append(fiVarRi2.di());
                fiVarRi2 = this.lr.ri(fiVarRi2.aw());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!qt().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(qt().size());
            sb.append("\n");
        }
        if (nr() != 0 && bu() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(nr()), Integer.valueOf(bu()), Integer.valueOf(slm())));
        }
        if (!this.ri.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.lr.ik.lr.ik ikVar : this.ri) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(ikVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
