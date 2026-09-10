package com.unity3d.ads.core.domain;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCheckForGameIdAndTestModeChanges;", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", NotificationCompat.CATEGORY_EVENT, "", "tags", "", "isLegacy", "Lwj/r;", "sendDiagnostic", "(Ljava/lang/String;Ljava/util/Map;Z)V", "legacy", "invoke", "(Z)V", "Lcom/unity3d/ads/core/domain/GetGameId;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getGameId, "getGameId");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String event, Map<String, String> tags, boolean isLegacy) {
        if (isLegacy) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(event, tags, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, event, (Double) null, tags, (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean legacy) {
        String strInvoke = this.getGameId.invoke();
        if (strInvoke == null) {
            strInvoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> mapQ = b0.Q(new f("previous_game_id", previousGameId), new f("game_id", strInvoke));
        if (previousGameId.equals("null")) {
            return;
        }
        if (strInvoke.equals(previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", mapQ, legacy);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", mapQ, legacy);
        }
        boolean zIsTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> mapQ2 = b0.Q(new f("previous_test_mode", String.valueOf(previousTestMode)), new f("test_mode", String.valueOf(zIsTestMode)));
        if (zIsTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapQ2, legacy);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapQ2, legacy);
        }
    }
}
