package com.facebook;

import com.facebook.appevents.AppEventsManager;
import com.facebook.appevents.AppEventsManager$start$1;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class FacebookSdk$sdkInitialize$3 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FacebookSdk$sdkInitialize$3 f15928a = new FacebookSdk$sdkInitialize$3();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (!z2 || CrashShieldHandler.b(AppEventsManager.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.d.add(new AppEventsManager$start$1());
            FetchedAppSettingsManager.c();
        } catch (Throwable th) {
            CrashShieldHandler.a(AppEventsManager.class, th);
        }
    }
}
