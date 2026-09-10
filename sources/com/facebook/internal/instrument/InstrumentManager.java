package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.UserSettingsManager;
import com.facebook.internal.FeatureManager;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InstrumentManager {
    public static final void a() {
        HashSet hashSet = FacebookSdk.f15915a;
        if (UserSettingsManager.c()) {
            FeatureManager.a(InstrumentManager$start$1.f16418a, FeatureManager.Feature.CrashReport);
            FeatureManager.a(InstrumentManager$start$2.f16419a, FeatureManager.Feature.ErrorReport);
            FeatureManager.a(InstrumentManager$start$3.f16420a, FeatureManager.Feature.AnrReport);
        }
    }
}
