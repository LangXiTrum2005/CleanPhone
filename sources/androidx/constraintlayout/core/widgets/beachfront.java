package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends ConstraintWidget {

    /* JADX INFO: renamed from: cig, reason: collision with root package name */
    public boolean f8217cig;

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public float f8222osteal = -1.0f;

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public int f8220licking = -1;

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public int f8221microchemistry = -1;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public boolean f8219fastrack = true;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public ConstraintAnchor f8218cosy = this.f8116hydrovane;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public int f8223pruinose = 0;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name */
    public int f8224tarboosh = 0;

    /* JADX INFO: compiled from: Guideline.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f8225attabal;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f8225attabal = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8225attabal[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public beachfront() {
        this.f8145permissivist.clear();
        this.f8145permissivist.add(this.f8218cosy);
        int length = this.f8103dent.length;
        for (int i = 0; i < length; i++) {
            this.f8103dent[i] = this.f8218cosy;
        }
    }

    public int bluecoat() {
        return this.f8221microchemistry;
    }

    public void collection(int i) {
        if (i > -1) {
            this.f8222osteal = -1.0f;
            this.f8220licking = i;
            this.f8221microchemistry = -1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void competently(androidx.constraintlayout.core.dern dernVar, boolean z) {
        wireman wiremanVar = (wireman) grimness();
        if (wiremanVar == null) {
            return;
        }
        ConstraintAnchor constraintAnchorMonoploid = wiremanVar.monoploid(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorMonoploid2 = wiremanVar.monoploid(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.f8170timberyard;
        boolean z2 = constraintWidget != null && constraintWidget.f8149premeiotic[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.f8223pruinose == 0) {
            constraintAnchorMonoploid = wiremanVar.monoploid(ConstraintAnchor.Type.TOP);
            constraintAnchorMonoploid2 = wiremanVar.monoploid(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f8170timberyard;
            z2 = constraintWidget2 != null && constraintWidget2.f8149premeiotic[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.f8217cig && this.f8218cosy.triweekly()) {
            SolverVariable solverVariableMonoploid = dernVar.monoploid(this.f8218cosy);
            dernVar.beachfront(solverVariableMonoploid, this.f8218cosy.marial());
            if (this.f8220licking != -1) {
                if (z2) {
                    dernVar.impromptu(dernVar.monoploid(constraintAnchorMonoploid2), solverVariableMonoploid, 0, 5);
                }
            } else if (this.f8221microchemistry != -1 && z2) {
                SolverVariable solverVariableMonoploid2 = dernVar.monoploid(constraintAnchorMonoploid2);
                dernVar.impromptu(solverVariableMonoploid, dernVar.monoploid(constraintAnchorMonoploid), 0, 5);
                dernVar.impromptu(solverVariableMonoploid2, solverVariableMonoploid, 0, 5);
            }
            this.f8217cig = false;
            return;
        }
        if (this.f8220licking != -1) {
            SolverVariable solverVariableMonoploid3 = dernVar.monoploid(this.f8218cosy);
            dernVar.marial(solverVariableMonoploid3, dernVar.monoploid(constraintAnchorMonoploid), this.f8220licking, 8);
            if (z2) {
                dernVar.impromptu(dernVar.monoploid(constraintAnchorMonoploid2), solverVariableMonoploid3, 0, 5);
                return;
            }
            return;
        }
        if (this.f8221microchemistry == -1) {
            if (this.f8222osteal != -1.0f) {
                dernVar.wireman(androidx.constraintlayout.core.dern.molybdenite(dernVar, dernVar.monoploid(this.f8218cosy), dernVar.monoploid(constraintAnchorMonoploid2), this.f8222osteal));
                return;
            }
            return;
        }
        SolverVariable solverVariableMonoploid4 = dernVar.monoploid(this.f8218cosy);
        SolverVariable solverVariableMonoploid5 = dernVar.monoploid(constraintAnchorMonoploid2);
        dernVar.marial(solverVariableMonoploid4, solverVariableMonoploid5, -this.f8221microchemistry, 8);
        if (z2) {
            dernVar.impromptu(solverVariableMonoploid4, dernVar.monoploid(constraintAnchorMonoploid), 0, 5);
            dernVar.impromptu(solverVariableMonoploid5, solverVariableMonoploid4, 0, 5);
        }
    }

    public void cybernatic(int i) {
        this.f8218cosy.graveside(i);
        this.f8217cig = true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void ethene(androidx.constraintlayout.core.dern dernVar, boolean z) {
        if (grimness() == null) {
            return;
        }
        int iPreprohormone = dernVar.preprohormone(this.f8218cosy);
        if (this.f8223pruinose == 1) {
            ctenidium(iPreprohormone);
            rajahship(0);
            sakeen(grimness().cord());
            hyalinization(0);
            return;
        }
        ctenidium(0);
        rajahship(iPreprohormone);
        hyalinization(grimness().dent());
        sakeen(0);
    }

    public void genii(int i) {
        if (this.f8223pruinose == i) {
            return;
        }
        this.f8223pruinose = i;
        this.f8145permissivist.clear();
        if (this.f8223pruinose == 1) {
            this.f8218cosy = this.f8164starveling;
        } else {
            this.f8218cosy = this.f8116hydrovane;
        }
        this.f8145permissivist.add(this.f8218cosy);
        int length = this.f8103dent.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f8103dent[i2] = this.f8218cosy;
        }
    }

    public float harlequinade() {
        return this.f8222osteal;
    }

    public void homophylic(float f) {
        if (f > -1.0f) {
            this.f8222osteal = f;
            this.f8220licking = -1;
            this.f8221microchemistry = -1;
        }
    }

    public int hydromechanics() {
        return this.f8223pruinose;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean impromptu() {
        return true;
    }

    public void likeable(int i) {
        if (i > -1) {
            this.f8222osteal = -1.0f;
            this.f8220licking = -1;
            this.f8221microchemistry = i;
        }
    }

    public ConstraintAnchor microanalysis() {
        return this.f8218cosy;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor monoploid(ConstraintAnchor.Type type) {
        int i = attabal.f8225attabal[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f8223pruinose == 1) {
                return this.f8218cosy;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f8223pruinose == 0) {
            return this.f8218cosy;
        }
        return null;
    }

    public int polyfoil() {
        return this.f8220licking;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean preterite() {
        return this.f8217cig;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void triweekly(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.triweekly(constraintWidget, map);
        beachfront beachfrontVar = (beachfront) constraintWidget;
        this.f8222osteal = beachfrontVar.f8222osteal;
        this.f8220licking = beachfrontVar.f8220licking;
        this.f8221microchemistry = beachfrontVar.f8221microchemistry;
        this.f8219fastrack = beachfrontVar.f8219fastrack;
        genii(beachfrontVar.f8223pruinose);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean underbelly() {
        return this.f8217cig;
    }
}
