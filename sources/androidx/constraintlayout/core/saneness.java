package androidx.constraintlayout.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: ArrayRow.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements dern.attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public attabal f8069marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public SolverVariable f8066attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f8070saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f8068dern = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ArrayList<SolverVariable> f8071wireman = new ArrayList<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f8067beachfront = false;

    /* JADX INFO: compiled from: ArrayRow.java */
    public interface attabal {
        void apical(float f);

        boolean attabal(SolverVariable solverVariable);

        int beachfront();

        void clear();

        float competently(saneness sanenessVar, boolean z);

        float cutely(SolverVariable solverVariable);

        void dern(SolverVariable solverVariable, float f, boolean z);

        void impromptu(SolverVariable solverVariable, float f);

        float marial(SolverVariable solverVariable, boolean z);

        SolverVariable saneness(int i);

        float taiyuan(int i);

        void wireman();
    }

    public saneness() {
    }

    public final boolean adultoid(SolverVariable solverVariable, dern dernVar) {
        return solverVariable.f8000cuirassed <= 1;
    }

    public saneness apical(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f8069marial.impromptu(solverVariable, -1.0f);
        this.f8069marial.impromptu(solverVariable2, 1.0f);
        this.f8069marial.impromptu(solverVariable3, f);
        this.f8069marial.impromptu(solverVariable4, -f);
        return this;
    }

    public saneness arytenoidectomy(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8070saneness = i;
        }
        if (z) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            this.f8069marial.impromptu(solverVariable3, 1.0f);
            return this;
        }
        this.f8069marial.impromptu(solverVariable, -1.0f);
        this.f8069marial.impromptu(solverVariable2, 1.0f);
        this.f8069marial.impromptu(solverVariable3, -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public void attabal(dern.attabal attabalVar) {
        if (attabalVar instanceof saneness) {
            saneness sanenessVar = (saneness) attabalVar;
            this.f8066attabal = null;
            this.f8069marial.clear();
            for (int i = 0; i < sanenessVar.f8069marial.beachfront(); i++) {
                this.f8069marial.dern(sanenessVar.f8069marial.saneness(i), sanenessVar.f8069marial.taiyuan(i), true);
            }
        }
    }

    public boolean beachfront(dern dernVar) {
        boolean z;
        SolverVariable solverVariableCompetently = competently(dernVar);
        if (solverVariableCompetently == null) {
            z = true;
        } else {
            rotuma(solverVariableCompetently);
            z = false;
        }
        if (this.f8069marial.beachfront() == 0) {
            this.f8067beachfront = true;
        }
        return z;
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public void clear() {
        this.f8069marial.clear();
        this.f8066attabal = null;
        this.f8070saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public SolverVariable competently(dern dernVar) {
        int iBeachfront = this.f8069marial.beachfront();
        SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        SolverVariable solverVariable2 = null;
        for (int i = 0; i < iBeachfront; i++) {
            float fTaiyuan = this.f8069marial.taiyuan(i);
            SolverVariable solverVariableSaneness = this.f8069marial.saneness(i);
            if (solverVariableSaneness.f8010rotuma == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f > fTaiyuan) {
                    boolean zAdultoid = adultoid(solverVariableSaneness, dernVar);
                    z = zAdultoid;
                    f = fTaiyuan;
                    solverVariable = solverVariableSaneness;
                } else if (!z && adultoid(solverVariableSaneness, dernVar)) {
                    f = fTaiyuan;
                    solverVariable = solverVariableSaneness;
                    z = true;
                }
            } else if (solverVariable == null && fTaiyuan < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (solverVariable2 == null || f2 > fTaiyuan) {
                    boolean zAdultoid2 = adultoid(solverVariableSaneness, dernVar);
                    z2 = zAdultoid2;
                    f2 = fTaiyuan;
                    solverVariable2 = solverVariableSaneness;
                } else if (!z2 && adultoid(solverVariableSaneness, dernVar)) {
                    f2 = fTaiyuan;
                    solverVariable2 = solverVariableSaneness;
                    z2 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    public String cord() {
        boolean z;
        String str = (this.f8066attabal == null ? "0" : "" + this.f8066attabal) + " = ";
        if (this.f8070saneness != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            str = str + this.f8070saneness;
            z = true;
        } else {
            z = false;
        }
        int iBeachfront = this.f8069marial.beachfront();
        for (int i = 0; i < iBeachfront; i++) {
            SolverVariable solverVariableSaneness = this.f8069marial.saneness(i);
            if (solverVariableSaneness != null) {
                float fTaiyuan = this.f8069marial.taiyuan(i);
                if (fTaiyuan != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    String string = solverVariableSaneness.toString();
                    if (z) {
                        if (fTaiyuan > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fTaiyuan *= -1.0f;
                        }
                    } else if (fTaiyuan < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        str = str + "- ";
                        fTaiyuan *= -1.0f;
                    }
                    str = fTaiyuan == 1.0f ? str + string : str + fTaiyuan + " " + string;
                    z = true;
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    public void cuirassed(dern dernVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.f7997adultoid) {
            return;
        }
        this.f8070saneness += solverVariable.f8003graveside * this.f8069marial.cutely(solverVariable);
        this.f8069marial.marial(solverVariable, z);
        if (z) {
            solverVariable.marial(this);
        }
        if (dern.f8027adultoid && this.f8069marial.beachfront() == 0) {
            this.f8067beachfront = true;
            dernVar.f8048saneness = true;
        }
    }

    public saneness cutely(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.f8069marial.impromptu(solverVariable, -1.0f);
        this.f8069marial.impromptu(solverVariable2, f);
        return this;
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public void dern(SolverVariable solverVariable) {
        int i = solverVariable.f8005molybdenite;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f8069marial.impromptu(solverVariable, f);
    }

    public SolverVariable dovishness(SolverVariable solverVariable) {
        return gintrap(null, solverVariable);
    }

    public saneness formularize(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f8070saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == f3) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            this.f8069marial.impromptu(solverVariable4, 1.0f);
            this.f8069marial.impromptu(solverVariable3, -1.0f);
            return this;
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            return this;
        }
        if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f8069marial.impromptu(solverVariable3, 1.0f);
            this.f8069marial.impromptu(solverVariable4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.f8069marial.impromptu(solverVariable, 1.0f);
        this.f8069marial.impromptu(solverVariable2, -1.0f);
        this.f8069marial.impromptu(solverVariable4, f4);
        this.f8069marial.impromptu(solverVariable3, -f4);
        return this;
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public SolverVariable getKey() {
        return this.f8066attabal;
    }

    public final SolverVariable gintrap(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iBeachfront = this.f8069marial.beachfront();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < iBeachfront; i++) {
            float fTaiyuan = this.f8069marial.taiyuan(i);
            if (fTaiyuan < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                SolverVariable solverVariableSaneness = this.f8069marial.saneness(i);
                if ((zArr == null || !zArr[solverVariableSaneness.f8006monoploid]) && solverVariableSaneness != solverVariable && (((type = solverVariableSaneness.f8010rotuma) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fTaiyuan < f)) {
                    f = fTaiyuan;
                    solverVariable2 = solverVariableSaneness;
                }
            }
        }
        return solverVariable2;
    }

    public boolean graveside(SolverVariable solverVariable) {
        return this.f8069marial.attabal(solverVariable);
    }

    public saneness impassible(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f8070saneness = i * (-1);
            this.f8069marial.impromptu(solverVariable, 1.0f);
            return this;
        }
        this.f8070saneness = i;
        this.f8069marial.impromptu(solverVariable, -1.0f);
        return this;
    }

    public saneness impromptu(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable4, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            this.f8069marial.impromptu(solverVariable3, -1.0f);
            this.f8069marial.impromptu(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f8070saneness = (-i) + i2;
                return this;
            }
        } else {
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f8069marial.impromptu(solverVariable, -1.0f);
                this.f8069marial.impromptu(solverVariable2, 1.0f);
                this.f8070saneness = i;
                return this;
            }
            if (f >= 1.0f) {
                this.f8069marial.impromptu(solverVariable4, -1.0f);
                this.f8069marial.impromptu(solverVariable3, 1.0f);
                this.f8070saneness = -i2;
                return this;
            }
            float f2 = 1.0f - f;
            this.f8069marial.impromptu(solverVariable, f2 * 1.0f);
            this.f8069marial.impromptu(solverVariable2, f2 * (-1.0f));
            this.f8069marial.impromptu(solverVariable3, (-1.0f) * f);
            this.f8069marial.impromptu(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f8070saneness = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public boolean isEmpty() {
        return this.f8066attabal == null && this.f8070saneness == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f8069marial.beachfront() == 0;
    }

    public saneness kowloon(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8070saneness = i;
        }
        if (z) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            this.f8069marial.impromptu(solverVariable3, -1.0f);
            return this;
        }
        this.f8069marial.impromptu(solverVariable, -1.0f);
        this.f8069marial.impromptu(solverVariable2, 1.0f);
        this.f8069marial.impromptu(solverVariable3, 1.0f);
        return this;
    }

    public saneness marial(SolverVariable solverVariable, int i) {
        this.f8069marial.impromptu(solverVariable, i);
        return this;
    }

    public boolean molybdenite() {
        SolverVariable solverVariable = this.f8066attabal;
        if (solverVariable != null) {
            return solverVariable.f8010rotuma == SolverVariable.Type.UNRESTRICTED || this.f8070saneness >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }

    public saneness monoploid(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f8069marial.impromptu(solverVariable3, 0.5f);
        this.f8069marial.impromptu(solverVariable4, 0.5f);
        this.f8069marial.impromptu(solverVariable, -0.5f);
        this.f8069marial.impromptu(solverVariable2, -0.5f);
        this.f8070saneness = -f;
        return this;
    }

    public void oilcan(dern dernVar) {
        if (dernVar.f8043impromptu.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iBeachfront = this.f8069marial.beachfront();
            for (int i = 0; i < iBeachfront; i++) {
                SolverVariable solverVariableSaneness = this.f8069marial.saneness(i);
                if (solverVariableSaneness.f8008polloi != -1 || solverVariableSaneness.f7997adultoid || solverVariableSaneness.f8011stratoscope) {
                    this.f8071wireman.add(solverVariableSaneness);
                }
            }
            int size = this.f8071wireman.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    SolverVariable solverVariable = this.f8071wireman.get(i2);
                    if (solverVariable.f7997adultoid) {
                        cuirassed(dernVar, solverVariable, true);
                    } else if (solverVariable.f8011stratoscope) {
                        trm(dernVar, solverVariable, true);
                    } else {
                        stratoscope(dernVar, dernVar.f8043impromptu[solverVariable.f8008polloi], true);
                    }
                }
                this.f8071wireman.clear();
            } else {
                z = true;
            }
        }
        if (dern.f8027adultoid && this.f8066attabal != null && this.f8069marial.beachfront() == 0) {
            this.f8067beachfront = true;
            dernVar.f8048saneness = true;
        }
    }

    public void polloi() {
        float f = this.f8070saneness;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f8070saneness = f * (-1.0f);
            this.f8069marial.wireman();
        }
    }

    public void preprohormone() {
        this.f8066attabal = null;
        this.f8069marial.clear();
        this.f8070saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8067beachfront = false;
    }

    public void rotuma(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f8066attabal;
        if (solverVariable2 != null) {
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            this.f8066attabal.f8008polloi = -1;
            this.f8066attabal = null;
        }
        float fMarial = this.f8069marial.marial(solverVariable, true) * (-1.0f);
        this.f8066attabal = solverVariable;
        if (fMarial == 1.0f) {
            return;
        }
        this.f8070saneness /= fMarial;
        this.f8069marial.apical(fMarial);
    }

    @Override // androidx.constraintlayout.core.dern.attabal
    public SolverVariable saneness(dern dernVar, boolean[] zArr) {
        return gintrap(zArr, null);
    }

    public void stratoscope(dern dernVar, saneness sanenessVar, boolean z) {
        this.f8070saneness += sanenessVar.f8070saneness * this.f8069marial.competently(sanenessVar, z);
        if (z) {
            sanenessVar.f8066attabal.marial(this);
        }
        if (dern.f8027adultoid && this.f8066attabal != null && this.f8069marial.beachfront() == 0) {
            this.f8067beachfront = true;
            dernVar.f8048saneness = true;
        }
    }

    public saneness taiyuan(SolverVariable solverVariable, int i) {
        this.f8066attabal = solverVariable;
        float f = i;
        solverVariable.f8003graveside = f;
        this.f8070saneness = f;
        this.f8067beachfront = true;
        return this;
    }

    public String toString() {
        return cord();
    }

    public saneness triweekly(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8070saneness = i;
        }
        if (z) {
            this.f8069marial.impromptu(solverVariable, 1.0f);
            this.f8069marial.impromptu(solverVariable2, -1.0f);
            return this;
        }
        this.f8069marial.impromptu(solverVariable, -1.0f);
        this.f8069marial.impromptu(solverVariable2, 1.0f);
        return this;
    }

    public void trm(dern dernVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.f8011stratoscope) {
            return;
        }
        float fCutely = this.f8069marial.cutely(solverVariable);
        this.f8070saneness += solverVariable.f8007oilcan * fCutely;
        this.f8069marial.marial(solverVariable, z);
        if (z) {
            solverVariable.marial(this);
        }
        this.f8069marial.dern(dernVar.f8044kowloon.f15760wireman[solverVariable.f8012trm], fCutely, z);
        if (dern.f8027adultoid && this.f8069marial.beachfront() == 0) {
            this.f8067beachfront = true;
            dernVar.f8048saneness = true;
        }
    }

    public saneness wireman(dern dernVar, int i) {
        this.f8069marial.impromptu(dernVar.kowloon(i, "ep"), 1.0f);
        this.f8069marial.impromptu(dernVar.kowloon(i, "em"), -1.0f);
        return this;
    }

    public saneness(coffeecake.attabal attabalVar) {
        this.f8069marial = new androidx.constraintlayout.core.attabal(this, attabalVar);
    }
}
