package com.kochava.tracker.installreferrer.internal;

import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes5.dex */
public enum InstallReferrerStatus {
    ServiceDisconnected("service_disconnected"),
    Ok("ok"),
    ServiceUnavailable("service_unavailable"),
    FeatureNotSupported("feature_not_supported"),
    DeveloperError("developer_error"),
    TimedOut("timed_out"),
    MissingDependency("missing_dependency"),
    NotGathered("not_gathered"),
    OtherError(x4.d);

    public final String X;

    InstallReferrerStatus(String str) {
        this.X = str;
    }
}
