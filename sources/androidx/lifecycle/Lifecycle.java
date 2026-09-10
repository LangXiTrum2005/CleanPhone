package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f5230a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[2] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[3] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[4] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[0] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[1] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }

            public static Event a(State state) {
                Intrinsics.f(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return Event.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public static Event b(State state) {
                Intrinsics.f(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return Event.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5231a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5231a = iArr;
            }
        }

        static {
            Event event = new Event("ON_CREATE", 0);
            ON_CREATE = event;
            Event event2 = new Event("ON_START", 1);
            ON_START = event2;
            Event event3 = new Event("ON_RESUME", 2);
            ON_RESUME = event3;
            Event event4 = new Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            Event event5 = new Event("ON_STOP", 4);
            ON_STOP = event5;
            Event event6 = new Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            Event event7 = new Event("ON_ANY", 6);
            ON_ANY = event7;
            $VALUES = new Event[]{event, event2, event3, event4, event5, event6, event7};
            INSTANCE = new Companion();
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State d() {
            switch (WhenMappings.f5231a[ordinal()]) {
                case 1:
                case 2:
                    return State.Z;
                case 3:
                case 4:
                    return State.e0;
                case 5:
                    return State.f0;
                case 6:
                    return State.X;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State {
        public static final State X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final State f5232Y;
        public static final State Z;
        public static final State e0;
        public static final State f0;
        public static final /* synthetic */ State[] g0;

        static {
            State state = new State("DESTROYED", 0);
            X = state;
            State state2 = new State("INITIALIZED", 1);
            f5232Y = state2;
            State state3 = new State("CREATED", 2);
            Z = state3;
            State state4 = new State("STARTED", 3);
            e0 = state4;
            State state5 = new State("RESUMED", 4);
            f0 = state5;
            g0 = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) g0.clone();
        }
    }

    public abstract void a(LifecycleObserver lifecycleObserver);

    public abstract State b();

    public abstract void c(LifecycleObserver lifecycleObserver);
}
