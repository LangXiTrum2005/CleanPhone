package com.google.firebase.sessions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataCollectionStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionState f21060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionState f21061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f21062c;

    public DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        this.f21060a = dataCollectionState;
        this.f21061b = dataCollectionState2;
        this.f21062c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.f21060a == dataCollectionStatus.f21060a && this.f21061b == dataCollectionStatus.f21061b && Double.compare(this.f21062c, dataCollectionStatus.f21062c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21062c) + ((this.f21061b.hashCode() + (this.f21060a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f21060a + ", crashlytics=" + this.f21061b + ", sessionSamplingRate=" + this.f21062c + ')';
    }
}
