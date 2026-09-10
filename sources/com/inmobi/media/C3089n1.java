package com.inmobi.media;

import kotlinx.coroutines.polder;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.attabal;
import patroclinal.marial;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3089n1 extends attabal implements polder {
    public final /* synthetic */ C3114o1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3089n1(polder.Companion companion, C3114o1 c3114o1) {
        super(companion);
        this.a = c3114o1;
    }

    @Override // kotlinx.coroutines.polder
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        C3097n9 c3097n9 = this.a.c;
        if (c3097n9 != null) {
            c3097n9.b("AdUnitManager", "Exception: " + marial.dern(th));
        }
        taiyuan taiyuanVar = P9.a;
        P9.a(new L2(th));
    }
}
