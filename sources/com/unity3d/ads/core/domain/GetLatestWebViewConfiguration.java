package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "webviewConfigurationDataSource", "<init>", "(Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;)V", "", "receivedEntryPoint", "", "receivedVersion", "", "receivedAdditionalFiles", "receivedType", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", l = {17, 33}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetLatestWebViewConfiguration.this.invoke(null, null, null, null, this);
        }
    }

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        n.f(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, String str2, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, str2, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(String str, Integer num, List<String> list, String str2, f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj);
            WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = num;
            anonymousClass1.L$3 = list;
            anonymousClass1.L$4 = str2;
            anonymousClass1.label = 1;
            obj = webviewConfigurationDataSource.get(anonymousClass1);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            WebViewConfiguration webViewConfiguration = (WebViewConfiguration) anonymousClass1.L$0;
            t9.e.z(obj);
            return webViewConfiguration;
        }
        str2 = (String) anonymousClass1.L$4;
        list = (List) anonymousClass1.L$3;
        num = (Integer) anonymousClass1.L$2;
        str = (String) anonymousClass1.L$1;
        this = (GetLatestWebViewConfiguration) anonymousClass1.L$0;
        t9.e.z(obj);
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
        int version = webViewConfigurationStore.getVersion();
        String entryPoint = webViewConfigurationStore.getEntryPoint();
        n.e(entryPoint, "it.entryPoint");
        List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
        n.e(additionalFilesList, "it.additionalFilesList");
        String type = webViewConfigurationStore.getType();
        n.e(type, "it.type");
        WebViewConfiguration webViewConfiguration2 = new WebViewConfiguration(version, entryPoint, additionalFilesList, type);
        if (str == null && num == null && list == null && str2 == null) {
            return webViewConfiguration2;
        }
        int iIntValue = num != null ? num.intValue() : webViewConfiguration2.getVersion();
        if (str == null) {
            str = webViewConfiguration2.getEntryPoint();
        }
        if (list == null) {
            list = webViewConfiguration2.getAdditionalFiles();
        }
        if (str2 == null) {
            str2 = webViewConfiguration2.getType();
        }
        WebViewConfiguration webViewConfiguration3 = new WebViewConfiguration(iIntValue, str, list, str2);
        if (!webViewConfiguration3.equals(webViewConfiguration2)) {
            WebviewConfigurationDataSource webviewConfigurationDataSource2 = this.webviewConfigurationDataSource;
            WebviewConfigurationStore.WebViewConfigurationStore.Builder builderNewBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
            builderNewBuilder.setVersion(webViewConfiguration3.getVersion());
            builderNewBuilder.setEntryPoint(webViewConfiguration3.getEntryPoint());
            builderNewBuilder.addAllAdditionalFiles(webViewConfiguration3.getAdditionalFiles());
            builderNewBuilder.setType(webViewConfiguration3.getType());
            WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStoreBuild = builderNewBuilder.build();
            n.e(webViewConfigurationStoreBuild, "newBuilder().apply {\n   …                }.build()");
            anonymousClass1.L$0 = webViewConfiguration3;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 2;
            if (webviewConfigurationDataSource2.set(webViewConfigurationStoreBuild, anonymousClass1) == aVar) {
                return aVar;
            }
        }
        return webViewConfiguration3;
    }
}
