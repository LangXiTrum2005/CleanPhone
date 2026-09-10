package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/UuidGeneratorImpl;", "Lcom/google/firebase/sessions/UuidGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UuidGeneratorImpl implements UuidGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UuidGeneratorImpl f21142a = new UuidGeneratorImpl();

    @Override // com.google.firebase.sessions.UuidGenerator
    public final UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.e(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
