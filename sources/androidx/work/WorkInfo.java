package androidx.work;

import java.util.HashSet;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class WorkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f8638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f8639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Data f8640c;
    public HashSet d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Data f8641e;
    public int f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final State f8642Y;
        public static final State Z;
        public static final State e0;
        public static final State f0;
        public static final State g0;
        public static final /* synthetic */ State[] h0;

        static {
            State state = new State("ENQUEUED", 0);
            X = state;
            State state2 = new State("RUNNING", 1);
            f8642Y = state2;
            State state3 = new State("SUCCEEDED", 2);
            Z = state3;
            State state4 = new State("FAILED", 3);
            e0 = state4;
            State state5 = new State("BLOCKED", 4);
            f0 = state5;
            State state6 = new State("CANCELLED", 5);
            g0 = state6;
            h0 = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h0.clone();
        }

        public final boolean d() {
            return this == Z || this == e0 || this == g0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.f8638a.equals(workInfo.f8638a) && this.f8639b == workInfo.f8639b && this.f8640c.equals(workInfo.f8640c) && this.d.equals(workInfo.d)) {
            return this.f8641e.equals(workInfo.f8641e);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8641e.hashCode() + ((this.d.hashCode() + ((this.f8640c.hashCode() + ((this.f8639b.hashCode() + (this.f8638a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f8638a + "', mState=" + this.f8639b + ", mOutputData=" + this.f8640c + ", mTags=" + this.d + ", mProgress=" + this.f8641e + AbstractJsonLexerKt.END_OBJ;
    }
}
