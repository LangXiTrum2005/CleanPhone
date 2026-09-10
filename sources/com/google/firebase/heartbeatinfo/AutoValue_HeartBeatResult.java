package com.google.firebase.heartbeatinfo;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20819b;

    public AutoValue_HeartBeatResult(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f20818a = str;
        this.f20819b = arrayList;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List a() {
        return this.f20819b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String b() {
        return this.f20818a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f20818a.equals(heartBeatResult.b()) && this.f20819b.equals(heartBeatResult.a());
    }

    public final int hashCode() {
        return ((this.f20818a.hashCode() ^ 1000003) * 1000003) ^ this.f20819b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f20818a + ", usedDates=" + this.f20819b + "}";
    }
}
