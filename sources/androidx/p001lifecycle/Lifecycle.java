package androidx.p001lifecycle;

import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import pussyfooter.attabal;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bR*\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "Landroidx/lifecycle/kowloon;", "observer", "", "attabal", "(Landroidx/lifecycle/kowloon;)V", "wireman", "Landroidx/lifecycle/saneness;", "Landroidx/lifecycle/saneness;", "dern", "()Landroidx/lifecycle/saneness;", "setInternalScopeRef", "(Landroidx/lifecycle/saneness;)V", "internalScopeRef", "Landroidx/lifecycle/Lifecycle$State;", "saneness", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Event", "State", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Lifecycle {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public saneness<Object> internalScopeRef = new saneness<>(null);

    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "attabal", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ attabal $ENTRIES = p002kotlin.enums.attabal.attabal(attabal());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$attabal;", "", "<init>", "()V", "Landroidx/lifecycle/Lifecycle$State;", "state", "Landroidx/lifecycle/Lifecycle$Event;", "attabal", "(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;", "saneness", "dern", "wireman", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$attabal$attabal, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Lifecycle.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final /* synthetic */ class C0074attabal {

                /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                public static final /* synthetic */ int[] f10440attabal;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f10440attabal = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Event attabal(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0074attabal.f10440attabal[state.ordinal()];
                if (i == 1) {
                    return Event.ON_DESTROY;
                }
                if (i == 2) {
                    return Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public final Event dern(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0074attabal.f10440attabal[state.ordinal()];
                if (i == 1) {
                    return Event.ON_START;
                }
                if (i == 2) {
                    return Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            public final Event saneness(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0074attabal.f10440attabal[state.ordinal()];
                if (i == 1) {
                    return Event.ON_STOP;
                }
                if (i == 2) {
                    return Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            public final Event wireman(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = C0074attabal.f10440attabal[state.ordinal()];
                if (i == 1) {
                    return Event.ON_CREATE;
                }
                if (i == 2) {
                    return Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public Companion() {
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f10441attabal;

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
                f10441attabal = iArr;
            }
        }

        public static final Event downFrom(State state) {
            return INSTANCE.attabal(state);
        }

        public static final Event downTo(State state) {
            return INSTANCE.saneness(state);
        }

        public static attabal<Event> getEntries() {
            return $ENTRIES;
        }

        public static final Event upFrom(State state) {
            return INSTANCE.dern(state);
        }

        public static final Event upTo(State state) {
            return INSTANCE.wireman(state);
        }

        public final State getTargetState() {
            switch (saneness.f10441attabal[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "<init>", "(Ljava/lang/String;I)V", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "isAtLeast", "", "state", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ attabal f10442arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());

        public static attabal<State> getEntries() {
            return f10442arytenoidectomy;
        }

        public final boolean isAtLeast(State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void attabal(kowloon observer);

    public final saneness<Object> dern() {
        return this.internalScopeRef;
    }

    public abstract State saneness();

    public abstract void wireman(kowloon observer);
}
