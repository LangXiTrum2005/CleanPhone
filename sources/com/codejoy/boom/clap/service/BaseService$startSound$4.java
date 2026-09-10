package com.codejoy.boom.clap.service;

import kotlinx.coroutines.saran;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BaseService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.service.BaseService$startSound$4", f = "BaseService.kt", l = {Opcodes.INSTANCEOF, Opcodes.MONITOREXIT}, m = "invokeSuspend", v = 1)
public final class BaseService$startSound$4 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BaseService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseService$startSound$4(BaseService baseService, wretchedly.dern<? super BaseService$startSound$4> dernVar) {
        super(2, dernVar);
        this.this$0 = baseService;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        BaseService$startSound$4 baseService$startSound$4 = new BaseService$startSound$4(this.this$0, dernVar);
        baseService$startSound$4.L$0 = obj;
        return baseService$startSound$4;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x001f, B:18:0x0049, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:27:0x0078, B:29:0x007e, B:30:0x0088, B:33:0x009d, B:14:0x003c, B:17:0x0045), top: B:38:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x001f, B:18:0x0049, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:27:0x0078, B:29:0x007e, B:30:0x0088, B:33:0x009d, B:14:0x003c, B:17:0x0045), top: B:38:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x001f, B:18:0x0049, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:27:0x0078, B:29:0x007e, B:30:0x0088, B:33:0x009d, B:14:0x003c, B:17:0x0045), top: B:38:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:7:0x001f, B:18:0x0049, B:20:0x004f, B:22:0x0055, B:23:0x005f, B:27:0x0078, B:29:0x007e, B:30:0x0088, B:33:0x009d, B:14:0x003c, B:17:0x0045), top: B:38:0x000f }] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (kotlinx.coroutines.splinterproof.attabal(200, r11) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009a -> B:8:0x0022). Please report as a decompilation issue!!! */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.L$0
            kotlinx.coroutines.saran r0 = (kotlinx.coroutines.saran) r0
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r11.label
            r3 = 200(0xc8, double:9.9E-322)
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L40
            if (r2 == r7) goto L32
            if (r2 != r6) goto L2a
            int r2 = r11.I$0
            java.lang.Object r8 = r11.L$2
            kotlinx.coroutines.saran r8 = (kotlinx.coroutines.saran) r8
            java.lang.Object r9 = r11.L$1
            com.codejoy.boom.clap.service.BaseService r9 = (com.codejoy.boom.clap.service.BaseService) r9
            p002kotlin.dern.saneness(r12)     // Catch: java.lang.Throwable -> L27
        L22:
            r12 = r8
            r8 = r2
            r2 = r12
            r12 = r9
            goto L49
        L27:
            r12 = move-exception
            goto La3
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            int r2 = r11.I$0
            java.lang.Object r8 = r11.L$2
            kotlinx.coroutines.saran r8 = (kotlinx.coroutines.saran) r8
            java.lang.Object r9 = r11.L$1
            com.codejoy.boom.clap.service.BaseService r9 = (com.codejoy.boom.clap.service.BaseService) r9
            p002kotlin.dern.saneness(r12)     // Catch: java.lang.Throwable -> L27
            goto L78
        L40:
            p002kotlin.dern.saneness(r12)
            com.codejoy.boom.clap.service.BaseService r12 = r11.this$0
            kotlin.Result$attabal r2 = p002kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L27
            r2 = r0
            r8 = r5
        L49:
            boolean r9 = kotlinx.coroutines.privatdozent.competently(r2)     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L9d
            android.hardware.camera2.CameraManager r9 = com.codejoy.boom.clap.service.BaseService.marial(r12)     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L5f
            java.lang.String r10 = com.codejoy.boom.clap.service.BaseService.wireman(r12)     // Catch: java.lang.Throwable -> L27
            p002kotlin.jvm.internal.Intrinsics.beachfront(r10)     // Catch: java.lang.Throwable -> L27
            r9.setTorchMode(r10, r7)     // Catch: java.lang.Throwable -> L27
        L5f:
            java.lang.Object r9 = igo.impromptu.attabal(r0)     // Catch: java.lang.Throwable -> L27
            r11.L$0 = r9     // Catch: java.lang.Throwable -> L27
            r11.L$1 = r12     // Catch: java.lang.Throwable -> L27
            r11.L$2 = r2     // Catch: java.lang.Throwable -> L27
            r11.I$0 = r8     // Catch: java.lang.Throwable -> L27
            r11.label = r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = kotlinx.coroutines.splinterproof.attabal(r3, r11)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L74
            goto L9c
        L74:
            r9 = r8
            r8 = r2
            r2 = r9
            r9 = r12
        L78:
            android.hardware.camera2.CameraManager r12 = com.codejoy.boom.clap.service.BaseService.marial(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L88
            java.lang.String r10 = com.codejoy.boom.clap.service.BaseService.wireman(r9)     // Catch: java.lang.Throwable -> L27
            p002kotlin.jvm.internal.Intrinsics.beachfront(r10)     // Catch: java.lang.Throwable -> L27
            r12.setTorchMode(r10, r5)     // Catch: java.lang.Throwable -> L27
        L88:
            java.lang.Object r12 = igo.impromptu.attabal(r0)     // Catch: java.lang.Throwable -> L27
            r11.L$0 = r12     // Catch: java.lang.Throwable -> L27
            r11.L$1 = r9     // Catch: java.lang.Throwable -> L27
            r11.L$2 = r8     // Catch: java.lang.Throwable -> L27
            r11.I$0 = r2     // Catch: java.lang.Throwable -> L27
            r11.label = r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r12 = kotlinx.coroutines.splinterproof.attabal(r3, r11)     // Catch: java.lang.Throwable -> L27
            if (r12 != r1) goto L22
        L9c:
            return r1
        L9d:
            kotlin.Unit r12 = p002kotlin.Unit.f29295attabal     // Catch: java.lang.Throwable -> L27
            p002kotlin.Result.m3351constructorimpl(r12)     // Catch: java.lang.Throwable -> L27
            goto Lac
        La3:
            kotlin.Result$attabal r0 = p002kotlin.Result.INSTANCE
            java.lang.Object r12 = p002kotlin.dern.attabal(r12)
            p002kotlin.Result.m3351constructorimpl(r12)
        Lac:
            kotlin.Unit r12 = p002kotlin.Unit.f29295attabal
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codejoy.boom.clap.service.BaseService$startSound$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((BaseService$startSound$4) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
