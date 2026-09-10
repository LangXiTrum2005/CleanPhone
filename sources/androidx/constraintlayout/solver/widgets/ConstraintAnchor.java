package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintWidget f3939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f3940c;
    public ConstraintAnchor d;
    public SolverVariable g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f3938a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3941e = 0;
    public int f = -1;

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3942a;

        static {
            int[] iArr = new int[Type.values().length];
            f3942a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3942a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3942a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3942a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3942a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3942a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3942a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3942a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3942a[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f3943Y;
        public static final Type Z;
        public static final Type e0;
        public static final Type f0;
        public static final Type g0;
        public static final Type h0;
        public static final Type i0;
        public static final /* synthetic */ Type[] j0;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            X = type2;
            Type type3 = new Type("TOP", 2);
            f3943Y = type3;
            Type type4 = new Type("RIGHT", 3);
            Z = type4;
            Type type5 = new Type("BOTTOM", 4);
            e0 = type5;
            Type type6 = new Type("BASELINE", 5);
            f0 = type6;
            Type type7 = new Type("CENTER", 6);
            g0 = type7;
            Type type8 = new Type("CENTER_X", 7);
            h0 = type8;
            Type type9 = new Type("CENTER_Y", 8);
            i0 = type9;
            j0 = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) j0.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f3939b = constraintWidget;
        this.f3940c = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i2) {
        b(constraintAnchor, i2, -1, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z2) {
        if (constraintAnchor == null) {
            h();
            return true;
        }
        if (!z2 && !g(constraintAnchor)) {
            return false;
        }
        this.d = constraintAnchor;
        if (constraintAnchor.f3938a == null) {
            constraintAnchor.f3938a = new HashSet();
        }
        this.d.f3938a.add(this);
        if (i2 > 0) {
            this.f3941e = i2;
        } else {
            this.f3941e = 0;
        }
        this.f = i3;
        return true;
    }

    public final int c() {
        ConstraintAnchor constraintAnchor;
        if (this.f3939b.X == 8) {
            return 0;
        }
        int i2 = this.f;
        return (i2 <= -1 || (constraintAnchor = this.d) == null || constraintAnchor.f3939b.X != 8) ? this.f3941e : i2;
    }

    public final ConstraintAnchor d() {
        Type type = this.f3940c;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f3939b;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.f3944A;
            case 2:
                return constraintWidget.f3945B;
            case 3:
                return constraintWidget.y;
            case 4:
                return constraintWidget.f3971z;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f3938a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConstraintAnchor) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d != null;
    }

    public final boolean g(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f0;
        Type type2 = this.f3940c;
        ConstraintWidget constraintWidget = constraintAnchor.f3939b;
        Type type3 = constraintAnchor.f3940c;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.f3970w && this.f3939b.f3970w);
        }
        int iOrdinal = type2.ordinal();
        Type type4 = Type.h0;
        Type type5 = Type.i0;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = type3 == Type.X || type3 == Type.Z;
                if (constraintWidget instanceof Guideline) {
                    return z2 || type3 == type4;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = type3 == Type.f3943Y || type3 == Type.e0;
                if (constraintWidget instanceof Guideline) {
                    return z3 || type3 == type5;
                }
                return z3;
            case 6:
                return (type3 == type || type3 == type4 || type3 == type5) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void h() {
        HashSet hashSet;
        ConstraintAnchor constraintAnchor = this.d;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f3938a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.f3941e = 0;
        this.f = -1;
    }

    public final void i() {
        SolverVariable solverVariable = this.g;
        if (solverVariable == null) {
            this.g = new SolverVariable(SolverVariable.Type.X);
        } else {
            solverVariable.c();
        }
    }

    public final String toString() {
        return this.f3939b.f3956Y + ":" + this.f3940c.toString();
    }
}
