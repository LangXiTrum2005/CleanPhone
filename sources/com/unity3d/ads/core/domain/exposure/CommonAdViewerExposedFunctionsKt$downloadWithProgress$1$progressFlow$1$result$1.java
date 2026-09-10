package com.unity3d.ads.core.domain.exposure;

import ak.f;
import ck.e;
import ck.i;
import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import en.q;
import en.r;
import java.util.Locale;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "bytesDownloaded", "totalBytes", "Lwj/r;", "<anonymous>", "(JJ)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends i implements d {
    final /* synthetic */ r $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(r rVar, String str, f fVar) {
        super(3, fVar);
        this.$$this$channelFlow = rVar;
        this.$downloadId = str;
    }

    public final Object invoke(long j10, long j11, f fVar) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, fVar);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j10;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j11;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        long j10 = this.J$0;
        long j11 = this.J$1;
        Integer num = j11 > 0 ? new Integer(com.bumptech.glide.d.m((int) ((((long) 100) * j10) / j11), 0, 100)) : null;
        r rVar = this.$$this$channelFlow;
        String str = this.$downloadId;
        Long l = new Long(j11);
        String lowerCase = "REMOTE".toLowerCase(Locale.ROOT);
        n.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ((q) rVar).i(new OnDownloadProgressEvent(str, num, j10, l, false, null, lowerCase));
        return wj.r.f53297a;
    }

    @Override // jk.d
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (f) obj3);
    }
}
