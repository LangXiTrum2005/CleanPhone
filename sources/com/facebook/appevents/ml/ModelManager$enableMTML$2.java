package com.facebook.appevents.ml;

import com.facebook.FacebookSdk;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class ModelManager$enableMTML$2 implements Runnable {
    public static final ModelManager$enableMTML$2 X = new ModelManager$enableMTML$2();

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.b(IntegrityManager.class)) {
                return;
            }
            try {
                IntegrityManager.f16125a = true;
                IntegrityManager.f16126b = FetchedAppGateKeepersManager.b("FBSDKFeatureIntegritySample", FacebookSdk.c(), false);
            } catch (Throwable th) {
                CrashShieldHandler.a(IntegrityManager.class, th);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }
}
