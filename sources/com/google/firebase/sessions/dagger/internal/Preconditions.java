package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    public static void a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }
}
