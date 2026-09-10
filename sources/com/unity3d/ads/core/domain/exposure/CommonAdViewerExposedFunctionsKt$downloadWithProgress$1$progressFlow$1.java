package com.unity3d.ads.core.domain.exposure;

import ak.f;
import ck.e;
import ck.i;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheFile;
import en.r;
import jk.c;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Len/r;", "Lcom/unity3d/ads/adplayer/model/OnDownloadProgressEvent;", "Lwj/r;", "<anonymous>", "(Len/r;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1", f = "CommonAdViewerExposedFunctions.kt", l = {370, 378, 382}, m = "invokeSuspend")
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ String $downloadId;
    final /* synthetic */ JSONArray $headers;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i10, int i11, String str2, f fVar) {
        super(2, fVar);
        this.$cacheFile = cacheFile;
        this.$url = str;
        this.$adObject = adObject;
        this.$headers = jSONArray;
        this.$priority = i10;
        this.$intervalMs = i11;
        this.$downloadId = str2;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(this.$cacheFile, this.$url, this.$adObject, this.$headers, this.$priority, this.$intervalMs, this.$downloadId, fVar);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1.L$0 = obj;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1;
    }

    @Override // jk.c
    public final Object invoke(r rVar, f fVar) {
        return ((CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1) create(rVar, fVar)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        if (((en.q) r12).f40176d.b(r22, r13) == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fb, code lost:
    
        if (((en.q) r12).f40176d.b(r22, r13) == r11) goto L29;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
