package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: LinearSystem.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static boolean f8027adultoid = true;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static boolean f8028dovishness = true;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static boolean f8029gintrap = false;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static boolean f8030graveside = true;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static boolean f8031molybdenite = false;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static long f8032preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static long f8033rotuma;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final coffeecake.attabal f8044kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public attabal f8045marial;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public attabal f8047polloi;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f8036attabal = 1000;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f8048saneness = false;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f8040dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public HashMap<String, SolverVariable> f8051wireman = null;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f8037beachfront = 32;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f8038competently = 32;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f8049taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f8039cutely = false;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public boolean[] f8034apical = new boolean[32];

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f8041formularize = 1;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f8042impassible = 0;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f8050triweekly = 32;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public SolverVariable[] f8035arytenoidectomy = new SolverVariable[1000];

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f8046monoploid = 0;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public androidx.constraintlayout.core.saneness[] f8043impromptu = new androidx.constraintlayout.core.saneness[32];

    /* JADX INFO: compiled from: LinearSystem.java */
    public interface attabal {
        void attabal(attabal attabalVar);

        void clear();

        void dern(SolverVariable solverVariable);

        SolverVariable getKey();

        boolean isEmpty();

        SolverVariable saneness(dern dernVar, boolean[] zArr);
    }

    /* JADX INFO: compiled from: LinearSystem.java */
    public static class saneness extends androidx.constraintlayout.core.saneness {
        public saneness(coffeecake.attabal attabalVar) {
            this.f8069marial = new marial(this, attabalVar);
        }
    }

    public dern() {
        oilcan();
        coffeecake.attabal attabalVar = new coffeecake.attabal();
        this.f8044kowloon = attabalVar;
        this.f8045marial = new wireman(attabalVar);
        if (f8029gintrap) {
            this.f8047polloi = new saneness(attabalVar);
        } else {
            this.f8047polloi = new androidx.constraintlayout.core.saneness(attabalVar);
        }
    }

    public static androidx.constraintlayout.core.saneness molybdenite(dern dernVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return dernVar.polloi().cutely(solverVariable, solverVariable2, f);
    }

    public static coffeecake.saneness rotuma() {
        return null;
    }

    public final int adultoid(attabal attabalVar) throws Exception {
        float f;
        for (int i = 0; i < this.f8042impassible; i++) {
            androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i];
            if (sanenessVar.f8066attabal.f8010rotuma != SolverVariable.Type.UNRESTRICTED) {
                float f2 = sanenessVar.f8070saneness;
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f4 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            if (i3 >= this.f8042impassible) {
                                break;
                            }
                            androidx.constraintlayout.core.saneness sanenessVar2 = this.f8043impromptu[i3];
                            if (sanenessVar2.f8066attabal.f8010rotuma == SolverVariable.Type.UNRESTRICTED || sanenessVar2.f8067beachfront || sanenessVar2.f8070saneness >= f3) {
                                f = f3;
                            } else if (f8028dovishness) {
                                int iBeachfront = sanenessVar2.f8069marial.beachfront();
                                int i7 = 0;
                                while (i7 < iBeachfront) {
                                    SolverVariable solverVariableSaneness = sanenessVar2.f8069marial.saneness(i7);
                                    float fCutely = sanenessVar2.f8069marial.cutely(solverVariableSaneness);
                                    if (fCutely > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f5 = solverVariableSaneness.f8001dovishness[i8] / fCutely;
                                            if ((f5 < f4 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = solverVariableSaneness.f8006monoploid;
                                                i4 = i3;
                                                f4 = f5;
                                            }
                                        }
                                    }
                                    i7++;
                                    f3 = f3;
                                }
                                f = f3;
                            } else {
                                f = f3;
                                for (int i9 = 1; i9 < this.f8041formularize; i9++) {
                                    SolverVariable solverVariable = this.f8044kowloon.f15760wireman[i9];
                                    float fCutely2 = sanenessVar2.f8069marial.cutely(solverVariable);
                                    if (fCutely2 > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f6 = solverVariable.f8001dovishness[i10] / fCutely2;
                                            if ((f6 < f4 && i10 == i6) || i10 > i6) {
                                                i6 = i10;
                                                i4 = i3;
                                                i5 = i9;
                                                f4 = f6;
                                            }
                                        }
                                    }
                                }
                            }
                            i3++;
                            f3 = f;
                        }
                        float f7 = f3;
                        if (i4 != -1) {
                            androidx.constraintlayout.core.saneness sanenessVar3 = this.f8043impromptu[i4];
                            sanenessVar3.f8066attabal.f8008polloi = -1;
                            sanenessVar3.rotuma(this.f8044kowloon.f15760wireman[i5]);
                            SolverVariable solverVariable2 = sanenessVar3.f8066attabal;
                            solverVariable2.f8008polloi = i4;
                            solverVariable2.formularize(this, sanenessVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f8041formularize / 2) {
                            z = true;
                        }
                        f3 = f7;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    public void apical(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        sanenessVarPolloi.apical(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            sanenessVarPolloi.wireman(this, i);
        }
        wireman(sanenessVarPolloi);
    }

    public SolverVariable arytenoidectomy() {
        if (this.f8041formularize + 1 >= this.f8038competently) {
            cord();
        }
        SolverVariable solverVariableAttabal = attabal(SolverVariable.Type.SLACK, null);
        int i = this.f8040dern + 1;
        this.f8040dern = i;
        this.f8041formularize++;
        solverVariableAttabal.f8006monoploid = i;
        this.f8044kowloon.f15760wireman[i] = solverVariableAttabal;
        return solverVariableAttabal;
    }

    public final SolverVariable attabal(SolverVariable.Type type, String str) {
        SolverVariable solverVariableSaneness = this.f8044kowloon.f15758dern.saneness();
        if (solverVariableSaneness == null) {
            solverVariableSaneness = new SolverVariable(type, str);
            solverVariableSaneness.apical(type, str);
        } else {
            solverVariableSaneness.taiyuan();
            solverVariableSaneness.apical(type, str);
        }
        int i = this.f8046monoploid;
        int i2 = this.f8036attabal;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.f8036attabal = i3;
            this.f8035arytenoidectomy = (SolverVariable[]) Arrays.copyOf(this.f8035arytenoidectomy, i3);
        }
        SolverVariable[] solverVariableArr = this.f8035arytenoidectomy;
        int i4 = this.f8046monoploid;
        this.f8046monoploid = i4 + 1;
        solverVariableArr[i4] = solverVariableSaneness;
        return solverVariableSaneness;
    }

    public void beachfront(SolverVariable solverVariable, int i) {
        if (f8030graveside && solverVariable.f8008polloi == -1) {
            float f = i;
            solverVariable.cutely(this, f);
            for (int i2 = 0; i2 < this.f8040dern + 1; i2++) {
                SolverVariable solverVariable2 = this.f8044kowloon.f15760wireman[i2];
                if (solverVariable2 != null && solverVariable2.f8011stratoscope && solverVariable2.f8012trm == solverVariable.f8006monoploid) {
                    solverVariable2.cutely(this, solverVariable2.f8007oilcan + f);
                }
            }
            return;
        }
        int i3 = solverVariable.f8008polloi;
        if (i3 == -1) {
            androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
            sanenessVarPolloi.taiyuan(solverVariable, i);
            wireman(sanenessVarPolloi);
            return;
        }
        androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i3];
        if (sanenessVar.f8067beachfront) {
            sanenessVar.f8070saneness = i;
            return;
        }
        if (sanenessVar.f8069marial.beachfront() == 0) {
            sanenessVar.f8067beachfront = true;
            sanenessVar.f8070saneness = i;
        } else {
            androidx.constraintlayout.core.saneness sanenessVarPolloi2 = polloi();
            sanenessVarPolloi2.impassible(solverVariable, i);
            wireman(sanenessVarPolloi2);
        }
    }

    public void competently(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        SolverVariable solverVariableGraveside = graveside();
        solverVariableGraveside.f8005molybdenite = 0;
        sanenessVarPolloi.kowloon(solverVariable, solverVariable2, solverVariableGraveside, i);
        wireman(sanenessVarPolloi);
    }

    public final void cord() {
        int i = this.f8037beachfront * 2;
        this.f8037beachfront = i;
        this.f8043impromptu = (androidx.constraintlayout.core.saneness[]) Arrays.copyOf(this.f8043impromptu, i);
        coffeecake.attabal attabalVar = this.f8044kowloon;
        attabalVar.f15760wireman = (SolverVariable[]) Arrays.copyOf(attabalVar.f15760wireman, this.f8037beachfront);
        int i2 = this.f8037beachfront;
        this.f8034apical = new boolean[i2];
        this.f8038competently = i2;
        this.f8050triweekly = i2;
    }

    public void cuirassed() throws Exception {
        if (this.f8045marial.isEmpty()) {
            triweekly();
            return;
        }
        if (!this.f8049taiyuan && !this.f8039cutely) {
            stratoscope(this.f8045marial);
            return;
        }
        for (int i = 0; i < this.f8042impassible; i++) {
            if (!this.f8043impromptu[i].f8067beachfront) {
                stratoscope(this.f8045marial);
                return;
            }
        }
        triweekly();
    }

    public void cutely(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        SolverVariable solverVariableGraveside = graveside();
        solverVariableGraveside.f8005molybdenite = 0;
        sanenessVarPolloi.arytenoidectomy(solverVariable, solverVariable2, solverVariableGraveside, i);
        if (i2 != 8) {
            impassible(sanenessVarPolloi, (int) (sanenessVarPolloi.f8069marial.cutely(solverVariableGraveside) * (-1.0f)), i2);
        }
        wireman(sanenessVarPolloi);
    }

    public void dern(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        sanenessVarPolloi.impromptu(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            sanenessVarPolloi.wireman(this, i3);
        }
        wireman(sanenessVarPolloi);
    }

    public final void formularize(androidx.constraintlayout.core.saneness sanenessVar) {
        int i;
        if (f8027adultoid && sanenessVar.f8067beachfront) {
            sanenessVar.f8066attabal.cutely(this, sanenessVar.f8070saneness);
        } else {
            androidx.constraintlayout.core.saneness[] sanenessVarArr = this.f8043impromptu;
            int i2 = this.f8042impassible;
            sanenessVarArr[i2] = sanenessVar;
            SolverVariable solverVariable = sanenessVar.f8066attabal;
            solverVariable.f8008polloi = i2;
            this.f8042impassible = i2 + 1;
            solverVariable.formularize(this, sanenessVar);
        }
        if (f8027adultoid && this.f8048saneness) {
            int i3 = 0;
            while (i3 < this.f8042impassible) {
                if (this.f8043impromptu[i3] == null) {
                    System.out.getClass();
                }
                androidx.constraintlayout.core.saneness sanenessVar2 = this.f8043impromptu[i3];
                if (sanenessVar2 != null && sanenessVar2.f8067beachfront) {
                    sanenessVar2.f8066attabal.cutely(this, sanenessVar2.f8070saneness);
                    if (f8029gintrap) {
                        this.f8044kowloon.f15757attabal.attabal(sanenessVar2);
                    } else {
                        this.f8044kowloon.f15759saneness.attabal(sanenessVar2);
                    }
                    this.f8043impromptu[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f8042impassible;
                        if (i4 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.saneness[] sanenessVarArr2 = this.f8043impromptu;
                        int i6 = i4 - 1;
                        androidx.constraintlayout.core.saneness sanenessVar3 = sanenessVarArr2[i4];
                        sanenessVarArr2[i6] = sanenessVar3;
                        SolverVariable solverVariable2 = sanenessVar3.f8066attabal;
                        if (solverVariable2.f8008polloi == i4) {
                            solverVariable2.f8008polloi = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f8043impromptu[i5] = null;
                    }
                    this.f8042impassible = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f8048saneness = false;
        }
    }

    public coffeecake.attabal gintrap() {
        return this.f8044kowloon;
    }

    public SolverVariable graveside() {
        if (this.f8041formularize + 1 >= this.f8038competently) {
            cord();
        }
        SolverVariable solverVariableAttabal = attabal(SolverVariable.Type.SLACK, null);
        int i = this.f8040dern + 1;
        this.f8040dern = i;
        this.f8041formularize++;
        solverVariableAttabal.f8006monoploid = i;
        this.f8044kowloon.f15760wireman[i] = solverVariableAttabal;
        return solverVariableAttabal;
    }

    public void impassible(androidx.constraintlayout.core.saneness sanenessVar, int i, int i2) {
        sanenessVar.marial(kowloon(i2, null), i);
    }

    public void impromptu(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        SolverVariable solverVariableGraveside = graveside();
        solverVariableGraveside.f8005molybdenite = 0;
        sanenessVarPolloi.kowloon(solverVariable, solverVariable2, solverVariableGraveside, i);
        if (i2 != 8) {
            impassible(sanenessVarPolloi, (int) (sanenessVarPolloi.f8069marial.cutely(solverVariableGraveside) * (-1.0f)), i2);
        }
        wireman(sanenessVarPolloi);
    }

    public SolverVariable kowloon(int i, String str) {
        if (this.f8041formularize + 1 >= this.f8038competently) {
            cord();
        }
        SolverVariable solverVariableAttabal = attabal(SolverVariable.Type.ERROR, str);
        int i2 = this.f8040dern + 1;
        this.f8040dern = i2;
        this.f8041formularize++;
        solverVariableAttabal.f8006monoploid = i2;
        solverVariableAttabal.f8005molybdenite = i;
        this.f8044kowloon.f15760wireman[i2] = solverVariableAttabal;
        this.f8045marial.dern(solverVariableAttabal);
        return solverVariableAttabal;
    }

    public androidx.constraintlayout.core.saneness marial(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (f8030graveside && i2 == 8 && solverVariable2.f7997adultoid && solverVariable.f8008polloi == -1) {
            solverVariable.cutely(this, solverVariable2.f8003graveside + i);
            return null;
        }
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        sanenessVarPolloi.triweekly(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            sanenessVarPolloi.wireman(this, i2);
        }
        wireman(sanenessVarPolloi);
        return sanenessVarPolloi;
    }

    public SolverVariable monoploid(Object obj) {
        SolverVariable solverVariableTaiyuan = null;
        if (obj == null) {
            return null;
        }
        if (this.f8041formularize + 1 >= this.f8038competently) {
            cord();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableTaiyuan = constraintAnchor.taiyuan();
            if (solverVariableTaiyuan == null) {
                constraintAnchor.molybdenite(this.f8044kowloon);
                solverVariableTaiyuan = constraintAnchor.taiyuan();
            }
            int i = solverVariableTaiyuan.f8006monoploid;
            if (i != -1 && i <= this.f8040dern && this.f8044kowloon.f15760wireman[i] != null) {
                return solverVariableTaiyuan;
            }
            if (i != -1) {
                solverVariableTaiyuan.taiyuan();
            }
            int i2 = this.f8040dern + 1;
            this.f8040dern = i2;
            this.f8041formularize++;
            solverVariableTaiyuan.f8006monoploid = i2;
            solverVariableTaiyuan.f8010rotuma = SolverVariable.Type.UNRESTRICTED;
            this.f8044kowloon.f15760wireman[i2] = solverVariableTaiyuan;
        }
        return solverVariableTaiyuan;
    }

    public final void oilcan() {
        int i = 0;
        if (f8029gintrap) {
            while (i < this.f8042impassible) {
                androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i];
                if (sanenessVar != null) {
                    this.f8044kowloon.f15757attabal.attabal(sanenessVar);
                }
                this.f8043impromptu[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f8042impassible) {
            androidx.constraintlayout.core.saneness sanenessVar2 = this.f8043impromptu[i];
            if (sanenessVar2 != null) {
                this.f8044kowloon.f15759saneness.attabal(sanenessVar2);
            }
            this.f8043impromptu[i] = null;
            i++;
        }
    }

    public androidx.constraintlayout.core.saneness polloi() {
        androidx.constraintlayout.core.saneness sanenessVarSaneness;
        if (f8029gintrap) {
            sanenessVarSaneness = this.f8044kowloon.f15757attabal.saneness();
            if (sanenessVarSaneness == null) {
                sanenessVarSaneness = new saneness(this.f8044kowloon);
                f8032preprohormone++;
            } else {
                sanenessVarSaneness.preprohormone();
            }
        } else {
            sanenessVarSaneness = this.f8044kowloon.f15759saneness.saneness();
            if (sanenessVarSaneness == null) {
                sanenessVarSaneness = new androidx.constraintlayout.core.saneness(this.f8044kowloon);
                f8033rotuma++;
            } else {
                sanenessVarSaneness.preprohormone();
            }
        }
        SolverVariable.wireman();
        return sanenessVarSaneness;
    }

    public int preprohormone(Object obj) {
        SolverVariable solverVariableTaiyuan = ((ConstraintAnchor) obj).taiyuan();
        if (solverVariableTaiyuan != null) {
            return (int) (solverVariableTaiyuan.f8003graveside + 0.5f);
        }
        return 0;
    }

    public void saneness(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableMonoploid = monoploid(constraintWidget.monoploid(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableMonoploid2 = monoploid(constraintWidget.monoploid(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableMonoploid3 = monoploid(constraintWidget.monoploid(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableMonoploid4 = monoploid(constraintWidget.monoploid(type4));
        SolverVariable solverVariableMonoploid5 = monoploid(constraintWidget2.monoploid(type));
        SolverVariable solverVariableMonoploid6 = monoploid(constraintWidget2.monoploid(type2));
        SolverVariable solverVariableMonoploid7 = monoploid(constraintWidget2.monoploid(type3));
        SolverVariable solverVariableMonoploid8 = monoploid(constraintWidget2.monoploid(type4));
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        double d = f;
        double d2 = i;
        sanenessVarPolloi.monoploid(solverVariableMonoploid2, solverVariableMonoploid4, solverVariableMonoploid6, solverVariableMonoploid8, (float) (Math.sin(d) * d2));
        wireman(sanenessVarPolloi);
        androidx.constraintlayout.core.saneness sanenessVarPolloi2 = polloi();
        sanenessVarPolloi2.monoploid(solverVariableMonoploid, solverVariableMonoploid3, solverVariableMonoploid5, solverVariableMonoploid7, (float) (Math.cos(d) * d2));
        wireman(sanenessVarPolloi2);
    }

    public void stratoscope(attabal attabalVar) throws Exception {
        adultoid(attabalVar);
        trm(attabalVar, false);
        triweekly();
    }

    public void taiyuan(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.saneness sanenessVarPolloi = polloi();
        SolverVariable solverVariableGraveside = graveside();
        solverVariableGraveside.f8005molybdenite = 0;
        sanenessVarPolloi.arytenoidectomy(solverVariable, solverVariable2, solverVariableGraveside, i);
        wireman(sanenessVarPolloi);
    }

    public final void triweekly() {
        for (int i = 0; i < this.f8042impassible; i++) {
            androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i];
            sanenessVar.f8066attabal.f8003graveside = sanenessVar.f8070saneness;
        }
    }

    public final int trm(attabal attabalVar, boolean z) {
        for (int i = 0; i < this.f8041formularize; i++) {
            this.f8034apical[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 < this.f8041formularize * 2) {
                if (attabalVar.getKey() != null) {
                    this.f8034apical[attabalVar.getKey().f8006monoploid] = true;
                }
                SolverVariable solverVariableSaneness = attabalVar.saneness(this, this.f8034apical);
                if (solverVariableSaneness != null) {
                    boolean[] zArr = this.f8034apical;
                    int i3 = solverVariableSaneness.f8006monoploid;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (solverVariableSaneness != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.f8042impassible; i5++) {
                        androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i5];
                        if (sanenessVar.f8066attabal.f8010rotuma != SolverVariable.Type.UNRESTRICTED && !sanenessVar.f8067beachfront && sanenessVar.graveside(solverVariableSaneness)) {
                            float fCutely = sanenessVar.f8069marial.cutely(solverVariableSaneness);
                            if (fCutely < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f2 = (-sanenessVar.f8070saneness) / fCutely;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        androidx.constraintlayout.core.saneness sanenessVar2 = this.f8043impromptu[i4];
                        sanenessVar2.f8066attabal.f8008polloi = -1;
                        sanenessVar2.rotuma(solverVariableSaneness);
                        SolverVariable solverVariable = sanenessVar2.f8066attabal;
                        solverVariable.f8008polloi = i4;
                        solverVariable.formularize(this, sanenessVar2);
                    }
                } else {
                    z2 = true;
                }
            }
            return i2;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void wireman(androidx.constraintlayout.core.saneness sanenessVar) {
        SolverVariable solverVariableDovishness;
        if (sanenessVar == null) {
            return;
        }
        boolean z = true;
        if (this.f8042impassible + 1 >= this.f8050triweekly || this.f8041formularize + 1 >= this.f8038competently) {
            cord();
        }
        boolean z2 = false;
        if (!sanenessVar.f8067beachfront) {
            sanenessVar.oilcan(this);
            if (sanenessVar.isEmpty()) {
                return;
            }
            sanenessVar.polloi();
            if (sanenessVar.beachfront(this)) {
                SolverVariable solverVariableArytenoidectomy = arytenoidectomy();
                sanenessVar.f8066attabal = solverVariableArytenoidectomy;
                int i = this.f8042impassible;
                formularize(sanenessVar);
                if (this.f8042impassible == i + 1) {
                    this.f8047polloi.attabal(sanenessVar);
                    trm(this.f8047polloi, true);
                    if (solverVariableArytenoidectomy.f8008polloi == -1) {
                        if (sanenessVar.f8066attabal == solverVariableArytenoidectomy && (solverVariableDovishness = sanenessVar.dovishness(solverVariableArytenoidectomy)) != null) {
                            sanenessVar.rotuma(solverVariableDovishness);
                        }
                        if (!sanenessVar.f8067beachfront) {
                            sanenessVar.f8066attabal.formularize(this, sanenessVar);
                        }
                        if (f8029gintrap) {
                            this.f8044kowloon.f15757attabal.attabal(sanenessVar);
                        } else {
                            this.f8044kowloon.f15759saneness.attabal(sanenessVar);
                        }
                        this.f8042impassible--;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!sanenessVar.molybdenite()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        formularize(sanenessVar);
    }

    public void yemenite() {
        coffeecake.attabal attabalVar;
        int i = 0;
        while (true) {
            attabalVar = this.f8044kowloon;
            SolverVariable[] solverVariableArr = attabalVar.f15760wireman;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.taiyuan();
            }
            i++;
        }
        attabalVar.f15758dern.dern(this.f8035arytenoidectomy, this.f8046monoploid);
        this.f8046monoploid = 0;
        Arrays.fill(this.f8044kowloon.f15760wireman, (Object) null);
        HashMap<String, SolverVariable> map = this.f8051wireman;
        if (map != null) {
            map.clear();
        }
        this.f8040dern = 0;
        this.f8045marial.clear();
        this.f8041formularize = 1;
        for (int i2 = 0; i2 < this.f8042impassible; i2++) {
            androidx.constraintlayout.core.saneness sanenessVar = this.f8043impromptu[i2];
            if (sanenessVar != null) {
                sanenessVar.f8068dern = false;
            }
        }
        oilcan();
        this.f8042impassible = 0;
        if (f8029gintrap) {
            this.f8047polloi = new saneness(this.f8044kowloon);
        } else {
            this.f8047polloi = new androidx.constraintlayout.core.saneness(this.f8044kowloon);
        }
    }

    public void dovishness(coffeecake.saneness sanenessVar) {
    }
}
