package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.ironsource.V5;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"unityAdsDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", V5.c.f27366b, "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String fileName) {
        n.f(context, "<this>");
        n.f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH.concat(fileName));
    }
}
