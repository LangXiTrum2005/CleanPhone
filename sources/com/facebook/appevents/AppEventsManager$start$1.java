package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/appevents/AppEventsManager$start$1", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventsManager$start$1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public final void onSuccess() {
        FeatureManager.a(AppEventsManager$start$1$onSuccess$1.f16018a, FeatureManager.Feature.AAM);
        FeatureManager.a(AppEventsManager$start$1$onSuccess$2.f16019a, FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.a(AppEventsManager$start$1$onSuccess$3.f16020a, FeatureManager.Feature.PrivacyProtection);
        FeatureManager.a(AppEventsManager$start$1$onSuccess$4.f16021a, FeatureManager.Feature.EventDeactivation);
        FeatureManager.a(AppEventsManager$start$1$onSuccess$5.f16022a, FeatureManager.Feature.IapLogging);
    }
}
