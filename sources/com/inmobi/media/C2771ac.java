package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2771ac implements Zb {
    public final Zb a;
    public final AtomicBoolean b;

    public C2771ac(Zb mediaChangeReceiver) {
        Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.a = mediaChangeReceiver;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        if (this.b.getAndSet(false)) {
            this.a.a();
        }
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.b();
    }
}
