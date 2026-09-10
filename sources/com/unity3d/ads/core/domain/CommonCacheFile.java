package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ji\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2*\u0010\u0016\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0011H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", "url", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lak/f;", "Lwj/r;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;IILjk/d;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCacheFile$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {33}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCacheFile.this.invoke(null, null, null, 0, 0, null, this);
        }
    }

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(cacheRepository, "cacheRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i10, int i11, d dVar, f fVar) {
        AnonymousClass1 anonymousClass1;
        long jB;
        Object file;
        String message;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i12 = anonymousClass1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i12 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        int i13 = anonymousClass2.label;
        if (i13 == 0) {
            t9.e.z(obj);
            jB = bn.d.b();
            CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = adObject;
            anonymousClass2.J$0 = jB;
            anonymousClass2.label = 1;
            file = cacheRepository.getFile(str, jSONArray, i10, i11, dVar, anonymousClass2);
            bk.a aVar = bk.a.f5708a;
            if (file == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = anonymousClass2.J$0;
            adObject = (AdObject) anonymousClass2.L$1;
            CommonCacheFile commonCacheFile = (CommonCacheFile) anonymousClass2.L$0;
            t9.e.z(obj);
            file = obj;
            this = commonCacheFile;
            jB = j10;
        }
        AdObject adObject2 = adObject;
        CacheResult cacheResult = (CacheResult) file;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB))), b0.Q(new wj.f("cache_source", success.getSource().toString()), new wj.f("protocol", success.getCachedFile().getProtocol())), b0.P(new wj.f("size_kb", new Integer((int) (success.getCachedFile().getContentLength() / ((long) 1024))))), adObject2, (Integer) null, 32, (Object) null);
            return cacheResult;
        }
        if (cacheResult instanceof CacheResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME;
            Double d10 = new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB)));
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            wj.f fVar2 = new wj.f("cache_source", failure.getSource().toString());
            wj.f fVar3 = new wj.f("reason", failure.getError().toString());
            Throwable reason = failure.getReason();
            if (reason == null || (message = reason.getMessage()) == null) {
                message = "";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d10, b0.Q(fVar2, fVar3, new wj.f("reason_debug", message)), (Map) null, adObject2, (Integer) null, 40, (Object) null);
        }
        return cacheResult;
    }
}
