package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowConfigurationInternal;", "", "customRewardString", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "(Ljava/lang/String;Ljava/util/Map;)V", "getCustomRewardString", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class ShowConfigurationInternal {
    private final String customRewardString;
    private final Map<String, String> extras;

    public ShowConfigurationInternal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowConfigurationInternal copy$default(ShowConfigurationInternal showConfigurationInternal, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = showConfigurationInternal.customRewardString;
        }
        if ((i10 & 2) != 0) {
            map = showConfigurationInternal.extras;
        }
        return showConfigurationInternal.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> component2() {
        return this.extras;
    }

    public final ShowConfigurationInternal copy(String customRewardString, Map<String, String> extras) {
        n.f(extras, "extras");
        return new ShowConfigurationInternal(customRewardString, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowConfigurationInternal)) {
            return false;
        }
        ShowConfigurationInternal showConfigurationInternal = (ShowConfigurationInternal) other;
        return n.a(this.customRewardString, showConfigurationInternal.customRewardString) && n.a(this.extras, showConfigurationInternal.extras);
    }

    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public int hashCode() {
        String str = this.customRewardString;
        return this.extras.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "ShowConfigurationInternal(customRewardString=" + this.customRewardString + ", extras=" + this.extras + ')';
    }

    public ShowConfigurationInternal(String str, Map<String, String> extras) {
        n.f(extras, "extras");
        this.customRewardString = str;
        this.extras = extras;
    }

    public /* synthetic */ ShowConfigurationInternal(String str, Map map, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? w.f53867a : map);
    }
}
