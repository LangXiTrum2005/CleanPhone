package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPropertyByName", "", "propertyName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        n.f(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        n.f(propertyName, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer numValueOf = Integer.valueOf(bundle.getInt(propertyName));
            if (bundle.containsKey(propertyName)) {
                return numValueOf;
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
