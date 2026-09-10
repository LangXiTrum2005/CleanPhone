package com.facebook.appevents;

import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class AppEventsManager$start$1$onSuccess$2 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppEventsManager$start$1$onSuccess$2 f16019a = new AppEventsManager$start$1$onSuccess$2();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (z2) {
            boolean z3 = RestrictiveDataManager.f16191a;
            if (CrashShieldHandler.b(RestrictiveDataManager.class)) {
                return;
            }
            try {
                RestrictiveDataManager.f16191a = true;
                RestrictiveDataManager.d.b();
            } catch (Throwable th) {
                CrashShieldHandler.a(RestrictiveDataManager.class, th);
            }
        }
    }
}
