package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3223s7 implements InterfaceC3207r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3207r7 f23982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23983b;

    public C3223s7(InterfaceC3207r7 mediaChangeReceiver) {
        Intrinsics.f(mediaChangeReceiver, "mediaChangeReceiver");
        this.f23982a = mediaChangeReceiver;
        this.f23983b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void a() {
        if (this.f23983b.getAndSet(false)) {
            this.f23982a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void b() {
        if (this.f23983b.getAndSet(true)) {
            return;
        }
        this.f23982a.b();
    }
}
