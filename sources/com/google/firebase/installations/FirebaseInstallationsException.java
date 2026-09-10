package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final /* synthetic */ Status[] X = {new Status("BAD_CONFIG", 0), new Status("UNAVAILABLE", 1), new Status("TOO_MANY_REQUESTS", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Status EF5;

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) X.clone();
        }
    }
}
