package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.UserSettingsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRDetector;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class InstrumentManager$start$3 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstrumentManager$start$3 f16420a = new InstrumentManager$start$3();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (z2) {
            AtomicBoolean atomicBoolean = ANRHandler.f16427a;
            synchronized (ANRHandler.class) {
                if (CrashShieldHandler.b(ANRHandler.class)) {
                    return;
                }
                try {
                    if (ANRHandler.f16427a.getAndSet(true)) {
                        return;
                    }
                    HashSet hashSet = FacebookSdk.f15915a;
                    if (UserSettingsManager.c()) {
                        ANRHandler.a();
                    }
                    int i2 = ANRDetector.f16424a;
                    if (!CrashShieldHandler.b(ANRDetector.class)) {
                        try {
                            ANRDetector.f16425b.scheduleAtFixedRate(ANRDetector.d, 0L, 500, TimeUnit.MILLISECONDS);
                        } catch (Throwable th) {
                            CrashShieldHandler.a(ANRDetector.class, th);
                        }
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.a(ANRHandler.class, th2);
                }
            }
        }
    }
}
