package com.google.firebase.sessions;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeProvider f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UuidGenerator f21114b;

    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        Intrinsics.f(timeProvider, "timeProvider");
        Intrinsics.f(uuidGenerator, "uuidGenerator");
        this.f21113a = timeProvider;
        this.f21114b = uuidGenerator;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String firstSessionId;
        String string = this.f21114b.next().toString();
        Intrinsics.e(string, "toString(...)");
        String lowerCase = StringsKt.I(string, TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.ROOT);
        Intrinsics.e(lowerCase, "toLowerCase(...)");
        return new SessionDetails(lowerCase, (sessionDetails == null || (firstSessionId = sessionDetails.getFirstSessionId()) == null) ? lowerCase : firstSessionId, sessionDetails != null ? sessionDetails.getSessionIndex() + 1 : 0, this.f21113a.a().getUs());
    }
}
