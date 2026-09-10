package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: compiled from: Barrier.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal extends sayid.saneness {

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public int f8215microchemistry = 0;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public boolean f8214fastrack = true;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public int f8213cosy = 0;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public boolean f8216pruinose = false;

    public attabal() {
    }

    public boolean bluecoat() {
        return this.f8214fastrack;
    }

    public int collection() {
        int i = this.f8215microchemistry;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void competently(androidx.constraintlayout.core.dern dernVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.f8103dent;
        constraintAnchorArr2[0] = this.f8164starveling;
        constraintAnchorArr2[2] = this.f8116hydrovane;
        constraintAnchorArr2[1] = this.f8177walach;
        constraintAnchorArr2[3] = this.f8144peridotite;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.f8103dent;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i4];
            constraintAnchor.f8079taiyuan = dernVar.monoploid(constraintAnchor);
            i4++;
        }
        int i5 = this.f8215microchemistry;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i5];
        if (!this.f8216pruinose) {
            polyfoil();
        }
        if (this.f8216pruinose) {
            this.f8216pruinose = false;
            int i6 = this.f8215microchemistry;
            if (i6 == 0 || i6 == 1) {
                dernVar.beachfront(this.f8164starveling.f8079taiyuan, this.f8126lerp);
                dernVar.beachfront(this.f8177walach.f8079taiyuan, this.f8126lerp);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    dernVar.beachfront(this.f8116hydrovane.f8079taiyuan, this.f8139nosophobia);
                    dernVar.beachfront(this.f8144peridotite.f8079taiyuan, this.f8139nosophobia);
                    return;
                }
                return;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.f37385licking) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f37386osteal[i7];
            if ((this.f8214fastrack || constraintWidget.impromptu()) && ((((i2 = this.f8215microchemistry) == 0 || i2 == 1) && constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8164starveling.f8073beachfront != null && constraintWidget.f8177walach.f8073beachfront != null) || (((i3 = this.f8215microchemistry) == 2 || i3 == 3) && constraintWidget.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8116hydrovane.f8073beachfront != null && constraintWidget.f8144peridotite.f8073beachfront != null))) {
                z2 = true;
                break;
            }
            i7++;
        }
        boolean z3 = this.f8164starveling.formularize() || this.f8177walach.formularize();
        boolean z4 = this.f8116hydrovane.formularize() || this.f8144peridotite.formularize();
        int i8 = !(!z2 && (((i = this.f8215microchemistry) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.f37385licking; i9++) {
            ConstraintWidget constraintWidget2 = this.f37386osteal[i9];
            if (this.f8214fastrack || constraintWidget2.impromptu()) {
                SolverVariable solverVariableMonoploid = dernVar.monoploid(constraintWidget2.f8103dent[this.f8215microchemistry]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f8103dent;
                int i10 = this.f8215microchemistry;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i10];
                constraintAnchor3.f8079taiyuan = solverVariableMonoploid;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.f8073beachfront;
                int i11 = (constraintAnchor4 == null || constraintAnchor4.f8080wireman != this) ? 0 : constraintAnchor3.f8074competently;
                if (i10 == 0 || i10 == 2) {
                    dernVar.taiyuan(constraintAnchor2.f8079taiyuan, solverVariableMonoploid, this.f8213cosy - i11, z2);
                } else {
                    dernVar.competently(constraintAnchor2.f8079taiyuan, solverVariableMonoploid, this.f8213cosy + i11, z2);
                }
                dernVar.marial(constraintAnchor2.f8079taiyuan, solverVariableMonoploid, this.f8213cosy + i11, i8);
            }
        }
        int i12 = this.f8215microchemistry;
        if (i12 == 0) {
            dernVar.marial(this.f8177walach.f8079taiyuan, this.f8164starveling.f8079taiyuan, 0, 8);
            dernVar.marial(this.f8164starveling.f8079taiyuan, this.f8170timberyard.f8177walach.f8079taiyuan, 0, 4);
            dernVar.marial(this.f8164starveling.f8079taiyuan, this.f8170timberyard.f8164starveling.f8079taiyuan, 0, 0);
            return;
        }
        if (i12 == 1) {
            dernVar.marial(this.f8164starveling.f8079taiyuan, this.f8177walach.f8079taiyuan, 0, 8);
            dernVar.marial(this.f8164starveling.f8079taiyuan, this.f8170timberyard.f8164starveling.f8079taiyuan, 0, 4);
            dernVar.marial(this.f8164starveling.f8079taiyuan, this.f8170timberyard.f8177walach.f8079taiyuan, 0, 0);
        } else if (i12 == 2) {
            dernVar.marial(this.f8144peridotite.f8079taiyuan, this.f8116hydrovane.f8079taiyuan, 0, 8);
            dernVar.marial(this.f8116hydrovane.f8079taiyuan, this.f8170timberyard.f8144peridotite.f8079taiyuan, 0, 4);
            dernVar.marial(this.f8116hydrovane.f8079taiyuan, this.f8170timberyard.f8116hydrovane.f8079taiyuan, 0, 0);
        } else if (i12 == 3) {
            dernVar.marial(this.f8116hydrovane.f8079taiyuan, this.f8144peridotite.f8079taiyuan, 0, 8);
            dernVar.marial(this.f8116hydrovane.f8079taiyuan, this.f8170timberyard.f8116hydrovane.f8079taiyuan, 0, 4);
            dernVar.marial(this.f8116hydrovane.f8079taiyuan, this.f8170timberyard.f8144peridotite.f8079taiyuan, 0, 0);
        }
    }

    public int cybernatic() {
        return this.f8213cosy;
    }

    public void genii(int i) {
        this.f8215microchemistry = i;
    }

    public int harlequinade() {
        return this.f8215microchemistry;
    }

    public void homophylic(boolean z) {
        this.f8214fastrack = z;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean impromptu() {
        return true;
    }

    public void likeable() {
        for (int i = 0; i < this.f37385licking; i++) {
            ConstraintWidget constraintWidget = this.f37386osteal[i];
            if (this.f8214fastrack || constraintWidget.impromptu()) {
                int i2 = this.f8215microchemistry;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.microchemistry(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.microchemistry(1, true);
                }
            }
        }
    }

    public boolean polyfoil() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f37385licking;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f37386osteal[i4];
            if ((this.f8214fastrack || constraintWidget.impromptu()) && ((((i2 = this.f8215microchemistry) == 0 || i2 == 1) && !constraintWidget.underbelly()) || (((i3 = this.f8215microchemistry) == 2 || i3 == 3) && !constraintWidget.preterite()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f37385licking; i5++) {
            ConstraintWidget constraintWidget2 = this.f37386osteal[i5];
            if (this.f8214fastrack || constraintWidget2.impromptu()) {
                if (!z2) {
                    int i6 = this.f8215microchemistry;
                    if (i6 == 0) {
                        iMax = constraintWidget2.monoploid(ConstraintAnchor.Type.LEFT).marial();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.monoploid(ConstraintAnchor.Type.RIGHT).marial();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.monoploid(ConstraintAnchor.Type.TOP).marial();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.monoploid(ConstraintAnchor.Type.BOTTOM).marial();
                    }
                    z2 = true;
                }
                int i7 = this.f8215microchemistry;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.monoploid(ConstraintAnchor.Type.LEFT).marial());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.monoploid(ConstraintAnchor.Type.RIGHT).marial());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.monoploid(ConstraintAnchor.Type.TOP).marial());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.monoploid(ConstraintAnchor.Type.BOTTOM).marial());
                }
            }
        }
        int i8 = iMax + this.f8213cosy;
        int i9 = this.f8215microchemistry;
        if (i9 == 0 || i9 == 1) {
            attendance(i8, i8);
        } else {
            libyan(i8, i8);
        }
        this.f8216pruinose = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean preterite() {
        return this.f8216pruinose;
    }

    public void saccharic(int i) {
        this.f8213cosy = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + dovishness() + " {";
        for (int i = 0; i < this.f37385licking; i++) {
            ConstraintWidget constraintWidget = this.f37386osteal[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.dovishness();
        }
        return str + "}";
    }

    @Override // sayid.saneness, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void triweekly(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.triweekly(constraintWidget, map);
        attabal attabalVar = (attabal) constraintWidget;
        this.f8215microchemistry = attabalVar.f8215microchemistry;
        this.f8214fastrack = attabalVar.f8214fastrack;
        this.f8213cosy = attabalVar.f8213cosy;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean underbelly() {
        return this.f8216pruinose;
    }

    public attabal(String str) {
        vesuvio(str);
    }
}
