package com.inmobi.media;

import kotlinx.coroutines.polder;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.attabal;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3270u8 extends attabal implements polder {
    public final /* synthetic */ C3295v8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3270u8(polder.Companion companion, C3295v8 c3295v8) {
        super(companion);
        this.a = c3295v8;
    }

    @Override // kotlinx.coroutines.polder
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        InterfaceC3072m9 interfaceC3072m9 = this.a.c;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th.getMessage());
        }
        taiyuan taiyuanVar = P9.a;
        P9.a(new L2(th));
    }
}
