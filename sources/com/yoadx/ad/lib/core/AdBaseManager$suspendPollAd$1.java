package com.yoadx.ad.lib.core;

import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AdBaseManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@igo.wireman(c = "com.yoadx.ad.lib.core.AdBaseManager", f = "AdBaseManager.kt", l = {Opcodes.IF_ACMPNE}, m = "suspendPollAd")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class AdBaseManager$suspendPollAd$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdBaseManager<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdBaseManager$suspendPollAd$1(AdBaseManager<T> adBaseManager, wretchedly.dern<? super AdBaseManager$suspendPollAd$1> dernVar) {
        super(dernVar);
        this.this$0 = adBaseManager;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wretchedly.dern to com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$1 for r1v1 'this'  wretchedly.dern
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.yoadx.ad.lib.core.AdBaseManager<T> r2 = r1.this$0
            java.lang.Object r2 = r2.stratoscope(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yoadx.ad.lib.core.AdBaseManager$suspendPollAd$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
