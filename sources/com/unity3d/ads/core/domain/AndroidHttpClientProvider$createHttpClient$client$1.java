package com.unity3d.ads.core.domain;

import ak.f;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {78}, m = "invokeSuspend")
public final class AndroidHttpClientProvider$createHttpClient$client$1 extends i implements c {
    final /* synthetic */ HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClientSelection.values().length];
            try {
                iArr[HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$createHttpClient$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, f fVar) {
        super(2, fVar);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidHttpClientProvider$createHttpClient$client$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i11 == 1) {
                return this.this$0.getOkHttp3Client();
            }
            if (i11 == 2) {
                return new LegacyHttpClient(this.this$0.dispatchers);
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            Context context = androidHttpClientProvider.context;
            ISDKDispatchers iSDKDispatchers = this.this$0.dispatchers;
            HttpClientSelection httpClientSelection = this.$selectedHttpClient;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, httpClientSelection, this);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return (HttpClient) obj;
    }
}
