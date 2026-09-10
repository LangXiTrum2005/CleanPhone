package sayid;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: WidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends ConstraintWidget {

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f37384osteal = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void achondroplasia(coffeecake.attabal attabalVar) {
        super.achondroplasia(attabalVar);
        int size = this.f37384osteal.size();
        for (int i = 0; i < size; i++) {
            this.f37384osteal.get(i).achondroplasia(attabalVar);
        }
    }

    public void attabal(ConstraintWidget constraintWidget) {
        this.f37384osteal.add(constraintWidget);
        if (constraintWidget.grimness() != null) {
            ((dern) constraintWidget.grimness()).polyfoil(constraintWidget);
        }
        constraintWidget.libya(this);
    }

    public void bluecoat() {
        this.f37384osteal.clear();
    }

    public void hydromechanics() {
        ArrayList<ConstraintWidget> arrayList = this.f37384osteal;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f37384osteal.get(i);
            if (constraintWidget instanceof dern) {
                ((dern) constraintWidget).hydromechanics();
            }
        }
    }

    public ArrayList<ConstraintWidget> microanalysis() {
        return this.f37384osteal;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void palmyra() {
        this.f37384osteal.clear();
        super.palmyra();
    }

    public void polyfoil(ConstraintWidget constraintWidget) {
        this.f37384osteal.remove(constraintWidget);
        constraintWidget.palmyra();
    }
}
