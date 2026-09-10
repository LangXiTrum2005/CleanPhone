package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/di/Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwj/d;", "Lkotlin/Function0;", "initializer", "<init>", "(Ljk/a;)V", "", "isInitialized", "()Z", "Ljk/a;", "getValue", "()Ljava/lang/Object;", X3.i.X, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
final class Factory<T> implements d {
    private final a initializer;

    public Factory(a initializer) {
        n.f(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // wj.d
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
