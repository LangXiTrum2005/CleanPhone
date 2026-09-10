package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettingsProvider {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Boolean a();

    Duration b();

    Double c();

    Object d(Continuation continuation);
}
