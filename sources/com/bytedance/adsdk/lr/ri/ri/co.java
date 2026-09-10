package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class co implements aw, qt {
    private final com.bytedance.adsdk.lr.ik.lr.jbs di;
    private final String ka;
    private final Path ri = new Path();
    private final Path lr = new Path();
    private final Path ik = new Path();
    private final List<aw> fi = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.co$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.adsdk.lr.ik.lr.jbs.ri.values().length];
            ri = iArr;
            try {
                iArr[com.bytedance.adsdk.lr.ik.lr.jbs.ri.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.jbs.ri.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.jbs.ri.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.jbs.ri.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.lr.jbs.ri.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public co(com.bytedance.adsdk.lr.ik.lr.jbs jbsVar) {
        this.ka = jbsVar.ri();
        this.di = jbsVar;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        this.ik.reset();
        if (this.di.ik()) {
            return this.ik;
        }
        int i = AnonymousClass1.ri[this.di.lr().ordinal()];
        if (i == 1) {
            ri();
        } else if (i == 2) {
            ri(Path.Op.UNION);
        } else if (i == 3) {
            ri(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            ri(Path.Op.INTERSECT);
        } else if (i == 5) {
            ri(Path.Op.XOR);
        }
        return this.ik;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.qt
    public void ri(ListIterator<ik> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ik ikVarPrevious = listIterator.previous();
            if (ikVarPrevious instanceof aw) {
                this.fi.add((aw) ikVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < this.fi.size(); i++) {
            this.fi.get(i).ri(list, list2);
        }
    }

    private void ri() {
        for (int i = 0; i < this.fi.size(); i++) {
            this.ik.addPath(this.fi.get(i).ka());
        }
    }

    private void ri(Path.Op op) {
        this.lr.reset();
        this.ri.reset();
        for (int size = this.fi.size() - 1; size > 0; size--) {
            aw awVar = this.fi.get(size);
            if (awVar instanceof ka) {
                ka kaVar = (ka) awVar;
                List<aw> listLr = kaVar.lr();
                for (int size2 = listLr.size() - 1; size2 >= 0; size2--) {
                    Path pathKa = listLr.get(size2).ka();
                    pathKa.transform(kaVar.ik());
                    this.lr.addPath(pathKa);
                }
            } else {
                this.lr.addPath(awVar.ka());
            }
        }
        aw awVar2 = this.fi.get(0);
        if (awVar2 instanceof ka) {
            ka kaVar2 = (ka) awVar2;
            List<aw> listLr2 = kaVar2.lr();
            for (int i = 0; i < listLr2.size(); i++) {
                Path pathKa2 = listLr2.get(i).ka();
                pathKa2.transform(kaVar2.ik());
                this.ri.addPath(pathKa2);
            }
        } else {
            this.ri.set(awVar2.ka());
        }
        this.ik.op(this.ri, this.lr, op);
    }
}
