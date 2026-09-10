package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Encodable
public final /* data */ class SessionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionInfo f21099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f21100b;

    public SessionEvent(SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        EventType eventType = EventType.SESSION_START;
        this.f21099a = sessionInfo;
        this.f21100b = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        sessionEvent.getClass();
        EventType eventType = EventType.SESSION_START;
        return this.f21099a.equals(sessionEvent.f21099a) && this.f21100b.equals(sessionEvent.f21100b);
    }

    public final int hashCode() {
        return this.f21100b.hashCode() + ((this.f21099a.hashCode() + (EventType.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EventType.SESSION_START + ", sessionData=" + this.f21099a + ", applicationInfo=" + this.f21100b + ')';
    }
}
