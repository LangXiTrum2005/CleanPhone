package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class F3 extends Ma {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W9 f22807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(Pa dao) {
        super(dao);
        Intrinsics.f(dao, "dao");
        this.f22807e = new W9(dao, new E3(this), this.d);
    }

    @Override // com.inmobi.media.Ma
    public final void a(C3338za ping) {
        Intrinsics.f(ping, "ping");
        if (!a(ping.f24162e)) {
            WeakReference weakReference = (WeakReference) this.f22983b.get(ping.f24163h);
            Ma.a(0, "Database capacity exceeded for pings", (short) 2248, ping, System.currentTimeMillis(), weakReference != null ? (La) weakReference.get() : null);
            return;
        }
        this.f22982a.a(ping);
        W9 w9 = this.f22807e;
        Objects.toString(w9.d);
        if (w9.d == Ca.PAUSED) {
            w9.d = Ca.STARTED;
            w9.a();
        }
    }
}
