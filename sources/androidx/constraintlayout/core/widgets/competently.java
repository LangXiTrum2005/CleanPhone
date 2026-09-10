package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Optimizer.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean[] f8226attabal = new boolean[3];

    public static void attabal(wireman wiremanVar, androidx.constraintlayout.core.dern dernVar, ConstraintWidget constraintWidget) {
        constraintWidget.f8110graveside = -1;
        constraintWidget.f8084adultoid = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = wiremanVar.f8149premeiotic[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f8149premeiotic[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f8164starveling.f8074competently;
            int iDent = wiremanVar.dent() - constraintWidget.f8177walach.f8074competently;
            ConstraintAnchor constraintAnchor = constraintWidget.f8164starveling;
            constraintAnchor.f8079taiyuan = dernVar.monoploid(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f8177walach;
            constraintAnchor2.f8079taiyuan = dernVar.monoploid(constraintAnchor2);
            dernVar.beachfront(constraintWidget.f8164starveling.f8079taiyuan, i);
            dernVar.beachfront(constraintWidget.f8177walach.f8079taiyuan, iDent);
            constraintWidget.f8110graveside = 2;
            constraintWidget.tectonization(i, iDent);
        }
        if (wiremanVar.f8149premeiotic[1] == dimensionBehaviour2 || constraintWidget.f8149premeiotic[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.f8116hydrovane.f8074competently;
        int iCord = wiremanVar.cord() - constraintWidget.f8144peridotite.f8074competently;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f8116hydrovane;
        constraintAnchor3.f8079taiyuan = dernVar.monoploid(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f8144peridotite;
        constraintAnchor4.f8079taiyuan = dernVar.monoploid(constraintAnchor4);
        dernVar.beachfront(constraintWidget.f8116hydrovane.f8079taiyuan, i2);
        dernVar.beachfront(constraintWidget.f8144peridotite.f8079taiyuan, iCord);
        if (constraintWidget.f8101czestochowa > 0 || constraintWidget.clubfoot() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f8132mathsort;
            constraintAnchor5.f8079taiyuan = dernVar.monoploid(constraintAnchor5);
            dernVar.beachfront(constraintWidget.f8132mathsort.f8079taiyuan, constraintWidget.f8101czestochowa + i2);
        }
        constraintWidget.f8084adultoid = 2;
        constraintWidget.liable(i2, iCord);
    }

    public static final boolean saneness(int i, int i2) {
        return (i & i2) == i2;
    }
}
