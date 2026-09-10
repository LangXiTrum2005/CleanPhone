package com.unity3d.services;

import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.services.core.di.IServiceComponent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke", "()Ljava/lang/Object;", "com/unity3d/services/core/di/IServiceComponentKt$inject$1"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$2 extends o implements a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$2(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.unity3d.ads.core.domain.ValidateExtrasSize, java.lang.Object] */
    @Override // jk.a
    public final ValidateExtrasSize invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, d0.f44761a.b(ValidateExtrasSize.class));
    }
}
