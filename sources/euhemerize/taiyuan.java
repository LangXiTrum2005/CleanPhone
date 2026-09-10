package euhemerize;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ShapeData.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<lamplit.attabal> f26124attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f26125dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public PointF f26126saneness;

    public taiyuan(PointF pointF, boolean z, List<lamplit.attabal> list) {
        this.f26126saneness = pointF;
        this.f26125dern = z;
        this.f26124attabal = new ArrayList(list);
    }

    public List<lamplit.attabal> attabal() {
        return this.f26124attabal;
    }

    public void beachfront(float f, float f2) {
        if (this.f26126saneness == null) {
            this.f26126saneness = new PointF();
        }
        this.f26126saneness.set(f, f2);
    }

    public void dern(taiyuan taiyuanVar, taiyuan taiyuanVar2, float f) {
        if (this.f26126saneness == null) {
            this.f26126saneness = new PointF();
        }
        this.f26125dern = taiyuanVar.wireman() || taiyuanVar2.wireman();
        if (taiyuanVar.attabal().size() != taiyuanVar2.attabal().size()) {
            utwa.beachfront.dern("Curves must have the same number of control points. Shape 1: " + taiyuanVar.attabal().size() + "\tShape 2: " + taiyuanVar2.attabal().size());
        }
        int iMin = Math.min(taiyuanVar.attabal().size(), taiyuanVar2.attabal().size());
        if (this.f26124attabal.size() < iMin) {
            for (int size = this.f26124attabal.size(); size < iMin; size++) {
                this.f26124attabal.add(new lamplit.attabal());
            }
        } else if (this.f26124attabal.size() > iMin) {
            for (int size2 = this.f26124attabal.size() - 1; size2 >= iMin; size2--) {
                List<lamplit.attabal> list = this.f26124attabal;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFSaneness = taiyuanVar.saneness();
        PointF pointFSaneness2 = taiyuanVar2.saneness();
        beachfront(utwa.apical.taiyuan(pointFSaneness.x, pointFSaneness2.x, f), utwa.apical.taiyuan(pointFSaneness.y, pointFSaneness2.y, f));
        for (int size3 = this.f26124attabal.size() - 1; size3 >= 0; size3--) {
            lamplit.attabal attabalVar = taiyuanVar.attabal().get(size3);
            lamplit.attabal attabalVar2 = taiyuanVar2.attabal().get(size3);
            PointF pointFAttabal = attabalVar.attabal();
            PointF pointFSaneness3 = attabalVar.saneness();
            PointF pointFDern = attabalVar.dern();
            PointF pointFAttabal2 = attabalVar2.attabal();
            PointF pointFSaneness4 = attabalVar2.saneness();
            PointF pointFDern2 = attabalVar2.dern();
            this.f26124attabal.get(size3).wireman(utwa.apical.taiyuan(pointFAttabal.x, pointFAttabal2.x, f), utwa.apical.taiyuan(pointFAttabal.y, pointFAttabal2.y, f));
            this.f26124attabal.get(size3).marial(utwa.apical.taiyuan(pointFSaneness3.x, pointFSaneness4.x, f), utwa.apical.taiyuan(pointFSaneness3.y, pointFSaneness4.y, f));
            this.f26124attabal.get(size3).beachfront(utwa.apical.taiyuan(pointFDern.x, pointFDern2.x, f), utwa.apical.taiyuan(pointFDern.y, pointFDern2.y, f));
        }
    }

    public void marial(boolean z) {
        this.f26125dern = z;
    }

    public PointF saneness() {
        return this.f26126saneness;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f26124attabal.size() + "closed=" + this.f26125dern + '}';
    }

    public boolean wireman() {
        return this.f26125dern;
    }

    public taiyuan() {
        this.f26124attabal = new ArrayList();
    }
}
