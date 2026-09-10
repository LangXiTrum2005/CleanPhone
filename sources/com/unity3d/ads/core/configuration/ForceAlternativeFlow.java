package com.unity3d.ads.core.configuration;

import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "", "<init>", "()V", "", "force", "Lwj/r;", "invoke", "(Z)V", "Lfn/n0;", "_forceAlternativeFlow", "Lfn/n0;", "getForceAlternativeFlow", "()Z", "forceAlternativeFlow", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ForceAlternativeFlow {
    private final n0 _forceAlternativeFlow = g.c(Boolean.FALSE);

    public final boolean getForceAlternativeFlow() {
        return ((Boolean) ((a1) this._forceAlternativeFlow).getValue()).booleanValue();
    }

    public final void invoke(boolean force) {
        a1 a1Var;
        Object value;
        n0 n0Var = this._forceAlternativeFlow;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            ((Boolean) value).getClass();
        } while (!a1Var.c0(value, Boolean.valueOf(force)));
    }
}
