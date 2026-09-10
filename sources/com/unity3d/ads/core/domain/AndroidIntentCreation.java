package com.unity3d.ads.core.domain;

import android.content.Intent;
import android.net.Uri;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0096\u0002¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidIntentCreation;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "()V", "invoke", "Landroid/content/Intent;", "url", "", "packageName", "action", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidIntentCreation implements IntentCreation {
    @Override // com.unity3d.ads.core.domain.IntentCreation
    public Intent invoke(String url, String packageName, String action, Map<String, ? extends Object> extras) {
        n.f(url, "url");
        Intent intent = new Intent();
        if (packageName != null) {
            if (packageName.length() <= 0) {
                packageName = null;
            }
            if (packageName != null) {
                intent.setPackage(packageName);
            }
        }
        if (action != null) {
            if (action.length() <= 0) {
                action = null;
            }
            if (action != null) {
                intent.setAction(action);
            }
        }
        Uri uri = Uri.parse(url);
        n.e(uri, "parse(this)");
        intent.setData(uri);
        if (extras != null) {
            for (Map.Entry<String, ? extends Object> entry : extras.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    intent.putExtra(key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    intent.putExtra(key, ((Number) value).doubleValue());
                }
            }
        }
        return intent;
    }
}
