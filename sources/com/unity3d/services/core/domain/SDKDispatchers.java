package com.unity3d.services.core.domain;

import cn.n0;
import cn.w;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.o;
import jn.d;
import jn.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "Lcn/w;", "io", "Lcn/w;", "getIo", "()Lcn/w;", BuildConfig.FLAVOR, "getDefault", X3.i.Z, "getMain", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SDKDispatchers implements ISDKDispatchers {
    private final w default;
    private final w io;
    private final w main;

    public SDKDispatchers() {
        e eVar = n0.f6748a;
        this.io = d.f44017b;
        this.default = n0.f6748a;
        this.main = o.f42451a;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public w getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public w getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public w getMain() {
        return this.main;
    }
}
