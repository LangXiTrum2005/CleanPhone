package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2947b5 extends Ma {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O4 f23460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947b5(Pa dao) {
        super(dao);
        Intrinsics.f(dao, "dao");
        this.f23460e = new O4(dao, new C2930a5(this), this.d);
    }

    @Override // com.inmobi.media.Ma
    public final void a(C3338za ping) {
        Intrinsics.f(ping, "ping");
        try {
            WeakReference weakReference = (WeakReference) this.f22983b.get(ping.f24163h);
            La la = weakReference != null ? (La) weakReference.get() : null;
            if (!a(ping.f24162e)) {
                Ma.a(0, "Database capacity exceeded for pings", (short) 2248, ping, System.currentTimeMillis(), la);
                return;
            }
            this.f22982a.a(ping);
            O4 o4 = this.f23460e;
            Objects.toString(o4.d);
            if (o4.d == Ca.PAUSED) {
                o4.d = Ca.STARTED;
                o4.a();
                o4.d();
            }
            Da daA = this.d.a(ping);
            if (Ga.a(daA)) {
                String str = daA.f22779a.f24160b;
                b(daA, la);
            } else {
                String str2 = daA.f22779a.f24160b;
                a(daA, la);
            }
        } catch (Error e2) {
            WeakReference weakReference2 = (WeakReference) this.f22983b.get(ping.f24163h);
            Ma.a(0, e2.getMessage(), (short) 2251, ping, System.currentTimeMillis(), weakReference2 != null ? (La) weakReference2.get() : null);
        } catch (Exception e3) {
            WeakReference weakReference3 = (WeakReference) this.f22983b.get(ping.f24163h);
            Ma.a(0, e3.getMessage(), (short) 2250, ping, System.currentTimeMillis(), weakReference3 != null ? (La) weakReference3.get() : null);
        }
    }
}
