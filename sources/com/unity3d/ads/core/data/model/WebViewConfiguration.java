package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import q4.a;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "", "version", "", "entryPoint", "", "additionalFiles", "", "type", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAdditionalFiles", "()Ljava/util/List;", "getEntryPoint", "()Ljava/lang/String;", "getType", "getVersion", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i10, String entryPoint, List<String> additionalFiles, String type) {
        n.f(entryPoint, "entryPoint");
        n.f(additionalFiles, "additionalFiles");
        n.f(type, "type");
        this.version = i10;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i11 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i10, str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final WebViewConfiguration copy(int version, String entryPoint, List<String> additionalFiles, String type) {
        n.f(entryPoint, "entryPoint");
        n.f(additionalFiles, "additionalFiles");
        n.f(type, "type");
        return new WebViewConfiguration(version, entryPoint, additionalFiles, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) other;
        return this.version == webViewConfiguration.version && n.a(this.entryPoint, webViewConfiguration.entryPoint) && n.a(this.additionalFiles, webViewConfiguration.additionalFiles) && n.a(this.type, webViewConfiguration.type);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + a.g(u.e(Integer.hashCode(this.version) * 31, 31, this.entryPoint), 31, this.additionalFiles);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewConfiguration(version=");
        sb2.append(this.version);
        sb2.append(", entryPoint=");
        sb2.append(this.entryPoint);
        sb2.append(", additionalFiles=");
        sb2.append(this.additionalFiles);
        sb2.append(", type=");
        return d.k(sb2, this.type, ')');
    }
}
