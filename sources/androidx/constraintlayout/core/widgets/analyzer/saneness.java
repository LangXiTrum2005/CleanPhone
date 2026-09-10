package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;

/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends WidgetRun {
    public saneness(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void monoploid(DependencyNode dependencyNode) {
        this.f8200impromptu.f8187cutely.add(dependencyNode);
        dependencyNode.f8183apical.add(this.f8200impromptu);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, empress.wireman
    public void attabal(empress.wireman wiremanVar) {
        androidx.constraintlayout.core.widgets.attabal attabalVar = (androidx.constraintlayout.core.widgets.attabal) this.f8202saneness;
        int iHarlequinade = attabalVar.harlequinade();
        Iterator<DependencyNode> it = this.f8200impromptu.f8183apical.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().value;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iHarlequinade == 0 || iHarlequinade == 2) {
            this.f8200impromptu.wireman(i2 + attabalVar.cybernatic());
        } else {
            this.f8200impromptu.wireman(i + attabalVar.cybernatic());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void beachfront() {
        this.f8199dern = null;
        this.f8200impromptu.dern();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean impassible() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void marial() {
        ConstraintWidget constraintWidget = this.f8202saneness;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.attabal) {
            int iHarlequinade = ((androidx.constraintlayout.core.widgets.attabal) constraintWidget).harlequinade();
            if (iHarlequinade == 0 || iHarlequinade == 1) {
                this.f8202saneness.ctenidium(this.f8200impromptu.value);
            } else {
                this.f8202saneness.rajahship(this.f8200impromptu.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void wireman() {
        ConstraintWidget constraintWidget = this.f8202saneness;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.attabal) {
            this.f8200impromptu.f8191saneness = true;
            androidx.constraintlayout.core.widgets.attabal attabalVar = (androidx.constraintlayout.core.widgets.attabal) constraintWidget;
            int iHarlequinade = attabalVar.harlequinade();
            boolean zBluecoat = attabalVar.bluecoat();
            int i = 0;
            if (iHarlequinade == 0) {
                this.f8200impromptu.f8190marial = DependencyNode.Type.LEFT;
                while (i < attabalVar.f37385licking) {
                    ConstraintWidget constraintWidget2 = attabalVar.f37386osteal[i];
                    if (zBluecoat || constraintWidget2.clubfoot() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f8130marial.f8200impromptu;
                        dependencyNode.f8187cutely.add(this.f8200impromptu);
                        this.f8200impromptu.f8183apical.add(dependencyNode);
                    }
                    i++;
                }
                monoploid(this.f8202saneness.f8130marial.f8200impromptu);
                monoploid(this.f8202saneness.f8130marial.f8203taiyuan);
                return;
            }
            if (iHarlequinade == 1) {
                this.f8200impromptu.f8190marial = DependencyNode.Type.RIGHT;
                while (i < attabalVar.f37385licking) {
                    ConstraintWidget constraintWidget3 = attabalVar.f37386osteal[i];
                    if (zBluecoat || constraintWidget3.clubfoot() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f8130marial.f8203taiyuan;
                        dependencyNode2.f8187cutely.add(this.f8200impromptu);
                        this.f8200impromptu.f8183apical.add(dependencyNode2);
                    }
                    i++;
                }
                monoploid(this.f8202saneness.f8130marial.f8200impromptu);
                monoploid(this.f8202saneness.f8130marial.f8203taiyuan);
                return;
            }
            if (iHarlequinade == 2) {
                this.f8200impromptu.f8190marial = DependencyNode.Type.TOP;
                while (i < attabalVar.f37385licking) {
                    ConstraintWidget constraintWidget4 = attabalVar.f37386osteal[i];
                    if (zBluecoat || constraintWidget4.clubfoot() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f8090beachfront.f8200impromptu;
                        dependencyNode3.f8187cutely.add(this.f8200impromptu);
                        this.f8200impromptu.f8183apical.add(dependencyNode3);
                    }
                    i++;
                }
                monoploid(this.f8202saneness.f8090beachfront.f8200impromptu);
                monoploid(this.f8202saneness.f8090beachfront.f8203taiyuan);
                return;
            }
            if (iHarlequinade != 3) {
                return;
            }
            this.f8200impromptu.f8190marial = DependencyNode.Type.BOTTOM;
            while (i < attabalVar.f37385licking) {
                ConstraintWidget constraintWidget5 = attabalVar.f37386osteal[i];
                if (zBluecoat || constraintWidget5.clubfoot() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f8090beachfront.f8203taiyuan;
                    dependencyNode4.f8187cutely.add(this.f8200impromptu);
                    this.f8200impromptu.f8183apical.add(dependencyNode4);
                }
                i++;
            }
            monoploid(this.f8202saneness.f8090beachfront.f8200impromptu);
            monoploid(this.f8202saneness.f8090beachfront.f8203taiyuan);
        }
    }
}
