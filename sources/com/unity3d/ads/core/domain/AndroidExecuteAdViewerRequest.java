package com.unity3d.ads.core.domain;

import ak.f;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import no.b;
import org.json.JSONArray;
import wj.g;
import wj.r;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidExecuteAdViewerRequest;", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "Lcn/w;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/GetCachedAsset;)V", "Lcom/unity3d/services/core/network/model/RequestType;", "type", "", "", "parameters", "Lcom/unity3d/services/core/network/model/HttpRequest;", "createRequest", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;)Lcom/unity3d/services/core/network/model/HttpRequest;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "invoke", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "Lcn/w;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final w ioDispatcher;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;
        final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, f fVar) {
            super(2, fVar);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass2(this.$parameters, this.this$0, this.$type, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objC;
            Object objInvoke;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            int i10 = this.label;
            bk.a aVar = bk.a.f5708a;
            if (i10 == 0) {
                t9.e.z(obj);
                Object objS0 = k.s0(1, this.$parameters);
                byte[] bArrE = null;
                String str = objS0 instanceof String ? (String) objS0 : null;
                if (str == null) {
                    str = "";
                }
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                try {
                    objC = Uri.parse(str);
                    n.e(objC, "parse(this)");
                } catch (Throwable th2) {
                    objC = t9.e.c(th2);
                }
                if (objC instanceof g) {
                    objC = null;
                }
                Uri uri = (Uri) objC;
                if (uri != null) {
                    if (this.$type != RequestType.GET) {
                        uri = null;
                    }
                    if (uri != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                        bArrE = b.E(data);
                    }
                }
                byte[] bArr = bArrE;
                if (bArr != null) {
                    return new HttpResponse(bArr, 0, null, null, null, null, 0L, WebSocketProtocol.PAYLOAD_SHORT, null);
                }
                HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                objInvoke = httpClientProvider.invoke(this);
                if (objInvoke != aVar) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            objInvoke = obj;
            HttpRequest httpRequestCreateRequest = this.this$0.createRequest(this.$type, this.$parameters);
            this.label = 2;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequestCreateRequest, false, this, 2, null);
            return objExecute$default == aVar ? aVar : objExecute$default;
        }
    }

    public AndroidExecuteAdViewerRequest(w ioDispatcher, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(httpClientProvider, "httpClientProvider");
        n.f(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType type, Object[] parameters) {
        Map<String, List<String>> headersMap;
        Map<String, List<String>> headersMap2;
        String str = (String) k.s0(1, parameters);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        Map<String, List<String>> map = xj.w.f53867a;
        if (i10 == 1 || i10 == 2) {
            JSONArray jSONArray = (JSONArray) k.s0(2, parameters);
            Integer num = (Integer) k.s0(3, parameters);
            Integer num2 = (Integer) k.s0(4, parameters);
            if (jSONArray == null || (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                headersMap = map;
            }
            return new HttpRequest(str, null, type, null, headersMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i10 != 3) {
            throw new aa.b((byte) 0, 20);
        }
        String str2 = (String) k.s0(2, parameters);
        JSONArray jSONArray2 = (JSONArray) k.s0(3, parameters);
        Integer num3 = (Integer) k.s0(4, parameters);
        Integer num4 = (Integer) k.s0(5, parameters);
        if (jSONArray2 != null && (headersMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) != null) {
            map = headersMap2;
        }
        return new HttpRequest(str, null, type, str2, map, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, f fVar) {
        return d0.J(this.ioDispatcher, new AnonymousClass2(objArr, this, requestType, null), fVar);
    }
}
