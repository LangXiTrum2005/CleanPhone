package com.kochava.tracker.samsungreferrer;

import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes5.dex */
public enum SamsungReferrerStatus {
    /* JADX INFO: Fake field, exist only in values array */
    ServiceDisconnected("service_disconnected"),
    Ok("ok"),
    /* JADX INFO: Fake field, exist only in values array */
    ServiceUnavailable("service_unavailable"),
    FeatureNotSupported("feature_not_supported"),
    /* JADX INFO: Fake field, exist only in values array */
    DeveloperError("developer_error"),
    TimedOut("timed_out"),
    MissingDependency("missing_dependency"),
    NotGathered("not_gathered"),
    NoData("no_data"),
    /* JADX INFO: Fake field, exist only in values array */
    OtherError(x4.d);

    public final String X;

    SamsungReferrerStatus(String str) {
        this.X = str;
    }
}
