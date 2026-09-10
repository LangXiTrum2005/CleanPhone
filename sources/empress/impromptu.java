package empress;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu extends WidgetRun {
    public impromptu(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f8130marial.beachfront();
        constraintWidget.f8090beachfront.beachfront();
        this.f8196beachfront = ((androidx.constraintlayout.core.widgets.beachfront) constraintWidget).hydromechanics();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, empress.wireman
    public void attabal(wireman wiremanVar) {
        DependencyNode dependencyNode = this.f8200impromptu;
        if (dependencyNode.f8188dern && !dependencyNode.f8192taiyuan) {
            this.f8200impromptu.wireman((int) ((dependencyNode.f8183apical.get(0).value * ((androidx.constraintlayout.core.widgets.beachfront) this.f8202saneness).harlequinade()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void beachfront() {
        this.f8200impromptu.dern();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean impassible() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void marial() {
        if (((androidx.constraintlayout.core.widgets.beachfront) this.f8202saneness).hydromechanics() == 1) {
            this.f8202saneness.ctenidium(this.f8200impromptu.value);
        } else {
            this.f8202saneness.rajahship(this.f8200impromptu.value);
        }
    }

    public final void monoploid(DependencyNode dependencyNode) {
        this.f8200impromptu.f8187cutely.add(dependencyNode);
        dependencyNode.f8183apical.add(this.f8200impromptu);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void wireman() {
        androidx.constraintlayout.core.widgets.beachfront beachfrontVar = (androidx.constraintlayout.core.widgets.beachfront) this.f8202saneness;
        int iPolyfoil = beachfrontVar.polyfoil();
        int iBluecoat = beachfrontVar.bluecoat();
        beachfrontVar.harlequinade();
        if (beachfrontVar.hydromechanics() == 1) {
            if (iPolyfoil != -1) {
                this.f8200impromptu.f8183apical.add(this.f8202saneness.f8170timberyard.f8130marial.f8200impromptu);
                this.f8202saneness.f8170timberyard.f8130marial.f8200impromptu.f8187cutely.add(this.f8200impromptu);
                this.f8200impromptu.f8185beachfront = iPolyfoil;
            } else if (iBluecoat != -1) {
                this.f8200impromptu.f8183apical.add(this.f8202saneness.f8170timberyard.f8130marial.f8203taiyuan);
                this.f8202saneness.f8170timberyard.f8130marial.f8203taiyuan.f8187cutely.add(this.f8200impromptu);
                this.f8200impromptu.f8185beachfront = -iBluecoat;
            } else {
                DependencyNode dependencyNode = this.f8200impromptu;
                dependencyNode.f8191saneness = true;
                dependencyNode.f8183apical.add(this.f8202saneness.f8170timberyard.f8130marial.f8203taiyuan);
                this.f8202saneness.f8170timberyard.f8130marial.f8203taiyuan.f8187cutely.add(this.f8200impromptu);
            }
            monoploid(this.f8202saneness.f8130marial.f8200impromptu);
            monoploid(this.f8202saneness.f8130marial.f8203taiyuan);
            return;
        }
        if (iPolyfoil != -1) {
            this.f8200impromptu.f8183apical.add(this.f8202saneness.f8170timberyard.f8090beachfront.f8200impromptu);
            this.f8202saneness.f8170timberyard.f8090beachfront.f8200impromptu.f8187cutely.add(this.f8200impromptu);
            this.f8200impromptu.f8185beachfront = iPolyfoil;
        } else if (iBluecoat != -1) {
            this.f8200impromptu.f8183apical.add(this.f8202saneness.f8170timberyard.f8090beachfront.f8203taiyuan);
            this.f8202saneness.f8170timberyard.f8090beachfront.f8203taiyuan.f8187cutely.add(this.f8200impromptu);
            this.f8200impromptu.f8185beachfront = -iBluecoat;
        } else {
            DependencyNode dependencyNode2 = this.f8200impromptu;
            dependencyNode2.f8191saneness = true;
            dependencyNode2.f8183apical.add(this.f8202saneness.f8170timberyard.f8090beachfront.f8203taiyuan);
            this.f8202saneness.f8170timberyard.f8090beachfront.f8203taiyuan.f8187cutely.add(this.f8200impromptu);
        }
        monoploid(this.f8202saneness.f8090beachfront.f8200impromptu);
        monoploid(this.f8202saneness.f8090beachfront.f8203taiyuan);
    }
}
