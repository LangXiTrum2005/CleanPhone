package androidx.constraintlayout.solver.state;

/* JADX INFO: loaded from: classes.dex */
public class State {

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.state.State$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3925a;

        static {
            int[] iArr = new int[Helper.values().length];
            f3925a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3925a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3925a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3925a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3925a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Chain {
        public static final /* synthetic */ Chain[] X = {new Chain("SPREAD", 0), new Chain("SPREAD_INSIDE", 1), new Chain("PACKED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Chain EF5;

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Constraint {
        public static final /* synthetic */ Constraint[] X = {new Constraint("LEFT_TO_LEFT", 0), new Constraint("LEFT_TO_RIGHT", 1), new Constraint("RIGHT_TO_LEFT", 2), new Constraint("RIGHT_TO_RIGHT", 3), new Constraint("START_TO_START", 4), new Constraint("START_TO_END", 5), new Constraint("END_TO_START", 6), new Constraint("END_TO_END", 7), new Constraint("TOP_TO_TOP", 8), new Constraint("TOP_TO_BOTTOM", 9), new Constraint("BOTTOM_TO_TOP", 10), new Constraint("BOTTOM_TO_BOTTOM", 11), new Constraint("BASELINE_TO_BASELINE", 12), new Constraint("CENTER_HORIZONTALLY", 13), new Constraint("CENTER_VERTICALLY", 14)};

        /* JADX INFO: Fake field, exist only in values array */
        Constraint EF5;

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        public static final /* synthetic */ Direction[] X = {new Direction("LEFT", 0), new Direction("RIGHT", 1), new Direction("START", 2), new Direction("END", 3), new Direction("TOP", 4), new Direction("BOTTOM", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Direction EF5;

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) X.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Helper {
        public static final /* synthetic */ Helper[] X = {new Helper("HORIZONTAL_CHAIN", 0), new Helper("VERTICAL_CHAIN", 1), new Helper("ALIGN_HORIZONTALLY", 2), new Helper("ALIGN_VERTICALLY", 3), new Helper("BARRIER", 4), new Helper("LAYER", 5), new Helper("FLOW", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        Helper EF5;

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) X.clone();
        }
    }
}
