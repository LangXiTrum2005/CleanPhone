package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ android.adservices.customaudience.CustomAudience.Builder c() {
        return new android.adservices.customaudience.CustomAudience.Builder();
    }

    public static /* synthetic */ DeletionRequest.Builder d() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager h(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder i() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Topic m(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager o(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void r() {
        new android.adservices.customaudience.LeaveCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void z() {
        new android.adservices.customaudience.JoinCustomAudienceRequest.Builder();
    }
}
