package com.facebook.messenger;

/* JADX INFO: loaded from: classes3.dex */
public class MessengerThreadParams {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Origin {
        public static final /* synthetic */ Origin[] X = {new Origin("REPLY_FLOW", 0), new Origin("COMPOSE_FLOW", 1), new Origin("UNKNOWN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Origin EF5;

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) X.clone();
        }
    }
}
