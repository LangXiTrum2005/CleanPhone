package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Service {

    public static abstract class Listener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final /* synthetic */ State[] X = {new State("NEW", 0), new State("STARTING", 1), new State("RUNNING", 2), new State("STOPPING", 3), new State("TERMINATED", 4), new State("FAILED", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        State EF5;

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) X.clone();
        }
    }
}
