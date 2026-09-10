package sayid;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.wireman;
import empress.competently;
import empress.cutely;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: HelperWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends ConstraintWidget implements attabal {

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public ConstraintWidget[] f37386osteal = new ConstraintWidget[4];

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public int f37385licking = 0;

    @Override // sayid.attabal
    public void attabal(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.f37385licking + 1;
        ConstraintWidget[] constraintWidgetArr = this.f37386osteal;
        if (i > constraintWidgetArr.length) {
            this.f37386osteal = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f37386osteal;
        int i2 = this.f37385licking;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f37385licking = i2 + 1;
    }

    public int hydromechanics(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f37385licking; i4++) {
            ConstraintWidget constraintWidget = this.f37386osteal[i4];
            if (i == 0 && (i3 = constraintWidget.f8089basify) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = constraintWidget.f8169tectonization) != -1) {
                return i2;
            }
        }
        return -1;
    }

    public void microanalysis(ArrayList<cutely> arrayList, int i, cutely cutelyVar) {
        for (int i2 = 0; i2 < this.f37385licking; i2++) {
            cutelyVar.attabal(this.f37386osteal[i2]);
        }
        for (int i3 = 0; i3 < this.f37385licking; i3++) {
            competently.attabal(this.f37386osteal[i3], i, arrayList, cutelyVar);
        }
    }

    @Override // sayid.attabal
    public void saneness() {
        this.f37385licking = 0;
        Arrays.fill(this.f37386osteal, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void triweekly(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.triweekly(constraintWidget, map);
        saneness sanenessVar = (saneness) constraintWidget;
        this.f37385licking = 0;
        int i = sanenessVar.f37385licking;
        for (int i2 = 0; i2 < i; i2++) {
            attabal(map.get(sanenessVar.f37386osteal[i2]));
        }
    }

    public void dern(wireman wiremanVar) {
    }
}
