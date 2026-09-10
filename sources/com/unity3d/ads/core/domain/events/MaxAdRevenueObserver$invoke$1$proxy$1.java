package com.unity3d.ads.core.domain.events;

import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.core.reflection.CommunicatorSubscriberProxy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import wj.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public /* synthetic */ class MaxAdRevenueObserver$invoke$1$proxy$1 implements CommunicatorSubscriberProxy.CommunicatorMessageListener, h {
    final /* synthetic */ MaxAdRevenueListener $tmp0;

    public MaxAdRevenueObserver$invoke$1$proxy$1(MaxAdRevenueListener maxAdRevenueListener) {
        this.$tmp0 = maxAdRevenueListener;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CommunicatorSubscriberProxy.CommunicatorMessageListener) && (obj instanceof h)) {
            return n.a(getFunctionDelegate(), ((h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public final a getFunctionDelegate() {
        return new k(1, this.$tmp0, MaxAdRevenueListener.class, "onMessageReceived", "onMessageReceived(Landroid/os/Bundle;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.unity3d.services.core.reflection.CommunicatorSubscriberProxy.CommunicatorMessageListener
    public final void onMessageReceived(Bundle p10) {
        n.f(p10, "p0");
        this.$tmp0.onMessageReceived(p10);
    }
}
