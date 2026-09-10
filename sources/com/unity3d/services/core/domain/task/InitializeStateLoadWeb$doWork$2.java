package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE, 64, 71}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, f fVar) {
        super(2, fVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, fVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013c A[Catch: all -> 0x01bf, CancellationException -> 0x01d9, TryCatch #5 {CancellationException -> 0x01d9, all -> 0x01bf, blocks: (B:8:0x0018, B:46:0x015b, B:50:0x017f, B:52:0x0189, B:55:0x0194, B:56:0x01a6, B:58:0x01a9, B:59:0x01b5, B:41:0x0138, B:43:0x013c, B:47:0x015f, B:48:0x0171, B:40:0x0133, B:33:0x0109, B:49:0x0172, B:32:0x0105, B:23:0x006c), top: B:75:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x015f A[Catch: all -> 0x01bf, CancellationException -> 0x01d9, TryCatch #5 {CancellationException -> 0x01d9, all -> 0x01bf, blocks: (B:8:0x0018, B:46:0x015b, B:50:0x017f, B:52:0x0189, B:55:0x0194, B:56:0x01a6, B:58:0x01a9, B:59:0x01b5, B:41:0x0138, B:43:0x013c, B:47:0x015f, B:48:0x0171, B:40:0x0133, B:33:0x0109, B:49:0x0172, B:32:0x0105, B:23:0x006c), top: B:75:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a9 A[Catch: all -> 0x01bf, CancellationException -> 0x01d9, TryCatch #5 {CancellationException -> 0x01d9, all -> 0x01bf, blocks: (B:8:0x0018, B:46:0x015b, B:50:0x017f, B:52:0x0189, B:55:0x0194, B:56:0x01a6, B:58:0x01a9, B:59:0x01b5, B:41:0x0138, B:43:0x013c, B:47:0x015f, B:48:0x0171, B:40:0x0133, B:33:0x0109, B:49:0x0172, B:32:0x0105, B:23:0x006c), top: B:75:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0158, code lost:
    
        if (r1 == r11) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.services.core.domain.task.InitializeStateLoadWeb] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
