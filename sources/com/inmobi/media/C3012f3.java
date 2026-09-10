package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3012f3 implements N2 {
    @Override // com.inmobi.media.N2
    public final void a(Config config) {
        List<String> skipFields;
        AdConfig.ContextualDataConfig contextualData;
        Intrinsics.f(config, "config");
        synchronized (this) {
            try {
                C3044h3 c3044h3 = C3044h3.f23645a;
                C3044h3.f23648e = (AdConfig) config;
                String str = C3044h3.g;
                AdConfig adConfig = C3044h3.f23648e;
                if (adConfig == null || (contextualData = adConfig.getContextualData()) == null || (skipFields = contextualData.getSkipFields()) == null) {
                    skipFields = EmptyList.X;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C3060i3.j);
                arrayList.removeAll(skipFields);
                String strD = CollectionsKt.D(arrayList, ",", null, null, null, 62);
                C3044h3.g = strD;
                if (!Intrinsics.a(strD, str)) {
                    c3044h3.e();
                }
                C3044h3.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
