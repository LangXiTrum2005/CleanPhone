package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21119c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataCollectionStatus f21120e;
    public final String f;
    public final String g;

    public SessionInfo(String sessionId, String firstSessionId, int i2, long j, DataCollectionStatus dataCollectionStatus, String str, String firebaseAuthenticationToken) {
        Intrinsics.f(sessionId, "sessionId");
        Intrinsics.f(firstSessionId, "firstSessionId");
        Intrinsics.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f21117a = sessionId;
        this.f21118b = firstSessionId;
        this.f21119c = i2;
        this.d = j;
        this.f21120e = dataCollectionStatus;
        this.f = str;
        this.g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.a(this.f21117a, sessionInfo.f21117a) && Intrinsics.a(this.f21118b, sessionInfo.f21118b) && this.f21119c == sessionInfo.f21119c && this.d == sessionInfo.d && Intrinsics.a(this.f21120e, sessionInfo.f21120e) && Intrinsics.a(this.f, sessionInfo.f) && Intrinsics.a(this.g, sessionInfo.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f, (this.f21120e.hashCode() + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.f21119c, androidx.datastore.preferences.protobuf.a.b(this.f21118b, this.f21117a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f21117a);
        sb.append(", firstSessionId=");
        sb.append(this.f21118b);
        sb.append(", sessionIndex=");
        sb.append(this.f21119c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f21120e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.g, ')');
    }
}
