package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "it"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2$1$1", f = "InitializeStateComplete.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateComplete$doWork$2$1$1 extends i implements c {
    /* synthetic */ Object L$0;
    int label;

    public InitializeStateComplete$doWork$2$1$1(f fVar) {
        super(2, fVar);
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(fVar);
        initializeStateComplete$doWork$2$1$1.L$0 = obj;
        return initializeStateComplete$doWork$2$1$1;
    }

    @Override // jk.c
    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, f fVar) {
        return ((InitializeStateComplete$doWork$2$1$1) create(byteStringStore, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().clear().build();
        n.e(byteStringStoreBuild, "it.toBuilder().clear().build()");
        return byteStringStoreBuild;
    }
}
