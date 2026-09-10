package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import empress.cutely;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ConstraintAnchor f8073beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f8075dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Type f8077marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f8078saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public SolverVariable f8079taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ConstraintWidget f8080wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f8072attabal = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f8074competently = 0;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f8076impromptu = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f8080wireman = constraintWidget;
        this.f8077marial = type;
    }

    public void adultoid(int i) {
        if (kowloon()) {
            this.f8076impromptu = i;
        }
    }

    public Type apical() {
        return this.f8077marial;
    }

    public boolean arytenoidectomy(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type typeApical = constraintAnchor.apical();
        Type type = this.f8077marial;
        if (typeApical == type) {
            return type != Type.BASELINE || (constraintAnchor.impromptu().premeiotic() && impromptu().premeiotic());
        }
        switch (type) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = typeApical == Type.LEFT || typeApical == Type.RIGHT;
                if (constraintAnchor.impromptu() instanceof beachfront) {
                    return z || typeApical == Type.CENTER_X;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = typeApical == Type.TOP || typeApical == Type.BOTTOM;
                if (constraintAnchor.impromptu() instanceof beachfront) {
                    return z2 || typeApical == Type.CENTER_Y;
                }
                return z2;
            case BASELINE:
                return (typeApical == Type.LEFT || typeApical == Type.RIGHT) ? false : true;
            case CENTER:
                return (typeApical == Type.BASELINE || typeApical == Type.CENTER_X || typeApical == Type.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f8077marial.name());
        }
    }

    public boolean attabal(ConstraintAnchor constraintAnchor, int i) {
        return saneness(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public int beachfront() {
        ConstraintAnchor constraintAnchor;
        if (this.f8080wireman.clubfoot() == 8) {
            return 0;
        }
        return (this.f8076impromptu == Integer.MIN_VALUE || (constraintAnchor = this.f8073beachfront) == null || constraintAnchor.f8080wireman.clubfoot() != 8) ? this.f8074competently : this.f8076impromptu;
    }

    public final ConstraintAnchor competently() {
        switch (this.f8077marial) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f8080wireman.f8177walach;
            case TOP:
                return this.f8080wireman.f8144peridotite;
            case RIGHT:
                return this.f8080wireman.f8164starveling;
            case BOTTOM:
                return this.f8080wireman.f8116hydrovane;
            default:
                throw new AssertionError(this.f8077marial.name());
        }
    }

    public ConstraintAnchor cutely() {
        return this.f8073beachfront;
    }

    public void dern(int i, ArrayList<cutely> arrayList, cutely cutelyVar) {
        HashSet<ConstraintAnchor> hashSet = this.f8072attabal;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                empress.competently.attabal(it.next().f8080wireman, i, arrayList, cutelyVar);
            }
        }
    }

    public boolean formularize() {
        HashSet<ConstraintAnchor> hashSet = this.f8072attabal;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().competently().kowloon()) {
                return true;
            }
        }
        return false;
    }

    public void graveside(int i) {
        this.f8078saneness = i;
        this.f8075dern = true;
    }

    public boolean impassible() {
        HashSet<ConstraintAnchor> hashSet = this.f8072attabal;
        return hashSet != null && hashSet.size() > 0;
    }

    public ConstraintWidget impromptu() {
        return this.f8080wireman;
    }

    public boolean kowloon() {
        return this.f8073beachfront != null;
    }

    public int marial() {
        if (this.f8075dern) {
            return this.f8078saneness;
        }
        return 0;
    }

    public void molybdenite(coffeecake.attabal attabalVar) {
        SolverVariable solverVariable = this.f8079taiyuan;
        if (solverVariable == null) {
            this.f8079taiyuan = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.taiyuan();
        }
    }

    public void monoploid() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f8073beachfront;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f8072attabal) != null) {
            hashSet.remove(this);
            if (this.f8073beachfront.f8072attabal.size() == 0) {
                this.f8073beachfront.f8072attabal = null;
            }
        }
        this.f8072attabal = null;
        this.f8073beachfront = null;
        this.f8074competently = 0;
        this.f8076impromptu = Integer.MIN_VALUE;
        this.f8075dern = false;
        this.f8078saneness = 0;
    }

    public void polloi() {
        this.f8075dern = false;
        this.f8078saneness = 0;
    }

    public boolean saneness(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            monoploid();
            return true;
        }
        if (!z && !arytenoidectomy(constraintAnchor)) {
            return false;
        }
        this.f8073beachfront = constraintAnchor;
        if (constraintAnchor.f8072attabal == null) {
            constraintAnchor.f8072attabal = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f8073beachfront.f8072attabal;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8074competently = i;
        this.f8076impromptu = i2;
        return true;
    }

    public SolverVariable taiyuan() {
        return this.f8079taiyuan;
    }

    public String toString() {
        return this.f8080wireman.dovishness() + ":" + this.f8077marial.toString();
    }

    public boolean triweekly() {
        return this.f8075dern;
    }

    public HashSet<ConstraintAnchor> wireman() {
        return this.f8072attabal;
    }
}
