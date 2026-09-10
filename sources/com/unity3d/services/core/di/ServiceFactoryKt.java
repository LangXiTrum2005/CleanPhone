package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "initializer", "Lwj/d;", "factoryOf", "(Ljk/a;)Lwj/d;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ServiceFactoryKt {
    public static final <T> d factoryOf(a initializer) {
        n.f(initializer, "initializer");
        return new Factory(initializer);
    }
}
