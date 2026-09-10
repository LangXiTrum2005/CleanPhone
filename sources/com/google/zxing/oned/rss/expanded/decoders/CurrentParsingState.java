package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes3.dex */
final class CurrentParsingState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final /* synthetic */ State[] X = {new State("NUMERIC", 0), new State("ALPHA", 1), new State("ISO_IEC_646", 2)};

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
