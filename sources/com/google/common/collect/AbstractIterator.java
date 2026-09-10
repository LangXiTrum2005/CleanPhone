package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {
    public State X = State.f19784Y;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f19782Y;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19783a;

        static {
            int[] iArr = new int[State.values().length];
            f19783a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19783a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final State f19784Y;
        public static final State Z;
        public static final State e0;
        public static final /* synthetic */ State[] f0;

        static {
            State state = new State("READY", 0);
            X = state;
            State state2 = new State("NOT_READY", 1);
            f19784Y = state2;
            State state3 = new State("DONE", 2);
            Z = state3;
            State state4 = new State("FAILED", 3);
            e0 = state4;
            f0 = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f0.clone();
        }
    }

    public abstract Object a();

    public final void b() {
        this.X = State.Z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.X;
        State state2 = State.e0;
        Preconditions.p(state != state2);
        int iOrdinal = this.X.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.X = state2;
            this.f19782Y = a();
            if (this.X != State.Z) {
                this.X = State.X;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.X = State.f19784Y;
        Object obj = this.f19782Y;
        this.f19782Y = null;
        return obj;
    }
}
