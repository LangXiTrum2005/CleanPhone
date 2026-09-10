package kotlin.reflect.jvm.internal.impl.name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
final class State {
    public static final State X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final State f44186Y;
    public static final State Z;
    public static final /* synthetic */ State[] e0;

    static {
        State state = new State("BEGINNING", 0);
        X = state;
        State state2 = new State("MIDDLE", 1);
        f44186Y = state2;
        State state3 = new State("AFTER_DOT", 2);
        Z = state3;
        e0 = new State[]{state, state2, state3};
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) e0.clone();
    }
}
