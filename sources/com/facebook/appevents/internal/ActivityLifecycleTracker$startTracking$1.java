package com.facebook.appevents.internal;

import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.codeless.ViewIndexingTrigger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class ActivityLifecycleTracker$startTracking$1 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ActivityLifecycleTracker$startTracking$1 f16136a = new ActivityLifecycleTracker$startTracking$1();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (z2) {
            ViewIndexingTrigger viewIndexingTrigger = CodelessManager.f16049a;
            if (CrashShieldHandler.b(CodelessManager.class)) {
                return;
            }
            try {
                CodelessManager.f16052e.set(true);
                return;
            } catch (Throwable th) {
                CrashShieldHandler.a(CodelessManager.class, th);
                return;
            }
        }
        ViewIndexingTrigger viewIndexingTrigger2 = CodelessManager.f16049a;
        if (CrashShieldHandler.b(CodelessManager.class)) {
            return;
        }
        try {
            CodelessManager.f16052e.set(false);
        } catch (Throwable th2) {
            CrashShieldHandler.a(CodelessManager.class, th2);
        }
    }
}
