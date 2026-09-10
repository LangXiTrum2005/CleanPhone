package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "", "<init>", "()V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettings", "Lwj/r;", "invoke", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HandleDebugSettings {
    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        n.f(debugSettings, "debugSettings");
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
