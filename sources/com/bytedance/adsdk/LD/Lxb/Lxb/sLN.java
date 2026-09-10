package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class sLN implements NXR, nBu {
    private final String ZU;
    private final com.bytedance.adsdk.LD.lk.LD.QAg lc;
    private final Path Lxb = new Path();
    private final Path LD = new Path();
    private final Path lk = new Path();
    private final List<NXR> JXs = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.Lxb.Lxb.sLN$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.LD.QAg.Lxb.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public sLN(com.bytedance.adsdk.LD.lk.LD.QAg qAg) {
        this.ZU = qAg.Lxb();
        this.lc = qAg;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.nBu
    public void Lxb(ListIterator<lk> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            lk lkVarPrevious = listIterator.previous();
            if (lkVarPrevious instanceof NXR) {
                this.JXs.add((NXR) lkVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.NXR
    public Path ZU() {
        this.lk.reset();
        if (this.lc.lk()) {
            return this.lk;
        }
        int i = AnonymousClass1.Lxb[this.lc.LD().ordinal()];
        if (i == 1) {
            Lxb();
        } else if (i == 2) {
            Lxb(Path.Op.UNION);
        } else if (i == 3) {
            Lxb(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            Lxb(Path.Op.INTERSECT);
        } else if (i == 5) {
            Lxb(Path.Op.XOR);
        }
        return this.lk;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
        for (int i = 0; i < this.JXs.size(); i++) {
            this.JXs.get(i).Lxb(list, list2);
        }
    }

    private void Lxb() {
        for (int i = 0; i < this.JXs.size(); i++) {
            this.lk.addPath(this.JXs.get(i).ZU());
        }
    }

    @TargetApi(19)
    private void Lxb(Path.Op op) {
        this.LD.reset();
        this.Lxb.reset();
        for (int size = this.JXs.size() - 1; size > 0; size--) {
            NXR nxr = this.JXs.get(size);
            if (nxr instanceof ZU) {
                ZU zu = (ZU) nxr;
                List<NXR> listLD = zu.LD();
                for (int size2 = listLD.size() - 1; size2 >= 0; size2--) {
                    Path pathZU = listLD.get(size2).ZU();
                    pathZU.transform(zu.lk());
                    this.LD.addPath(pathZU);
                }
            } else {
                this.LD.addPath(nxr.ZU());
            }
        }
        NXR nxr2 = this.JXs.get(0);
        if (nxr2 instanceof ZU) {
            ZU zu2 = (ZU) nxr2;
            List<NXR> listLD2 = zu2.LD();
            for (int i = 0; i < listLD2.size(); i++) {
                Path pathZU2 = listLD2.get(i).ZU();
                pathZU2.transform(zu2.lk());
                this.Lxb.addPath(pathZU2);
            }
        } else {
            this.Lxb.set(nxr2.ZU());
        }
        this.lk.op(this.Lxb, this.LD, op);
    }
}
