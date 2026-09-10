package com.facebook.appevents.suggestedevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class SuggestedEventsManager$enable$1 implements Runnable {
    public static final SuggestedEventsManager$enable$1 X = new SuggestedEventsManager$enable$1();

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            SuggestedEventsManager suggestedEventsManager = SuggestedEventsManager.d;
            AtomicBoolean atomicBoolean2 = null;
            if (CrashShieldHandler.b(SuggestedEventsManager.class)) {
                atomicBoolean = null;
            } else {
                try {
                    atomicBoolean = SuggestedEventsManager.f16205a;
                } catch (Throwable th) {
                    CrashShieldHandler.a(SuggestedEventsManager.class, th);
                    atomicBoolean = null;
                }
            }
            if (atomicBoolean.get()) {
                return;
            }
            if (!CrashShieldHandler.b(SuggestedEventsManager.class)) {
                try {
                    atomicBoolean2 = SuggestedEventsManager.f16205a;
                } catch (Throwable th2) {
                    CrashShieldHandler.a(SuggestedEventsManager.class, th2);
                }
            }
            atomicBoolean2.set(true);
            if (CrashShieldHandler.b(SuggestedEventsManager.class)) {
                return;
            }
            try {
                suggestedEventsManager.b();
            } catch (Throwable th3) {
                CrashShieldHandler.a(SuggestedEventsManager.class, th3);
            }
        } catch (Throwable th4) {
            CrashShieldHandler.a(this, th4);
        }
    }
}
