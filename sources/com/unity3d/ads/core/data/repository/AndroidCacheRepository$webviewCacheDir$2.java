package com.unity3d.ads.core.data.repository;

import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidCacheRepository$webviewCacheDir$2 extends o implements jk.a {
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$webviewCacheDir$2(AndroidCacheRepository androidCacheRepository) {
        super(0);
        this.this$0 = androidCacheRepository;
    }

    @Override // jk.a
    public final File invoke() {
        return this.this$0.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }
}
