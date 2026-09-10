package com.google.firebase.sessions;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/supplicat;", "Lcom/google/firebase/sessions/kattegat;", "<init>", "()V", "", "attabal", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class supplicat implements kattegat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final supplicat f23062attabal = new supplicat();

    @Override // com.google.firebase.sessions.kattegat
    public long attabal() {
        return System.currentTimeMillis() * 1000;
    }
}
