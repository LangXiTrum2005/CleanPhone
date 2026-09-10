package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ironsource/v3;", "Lcom/ironsource/iq;", "", "e", "", "b", "Lcom/ironsource/lifecycle/b;", "d", "Lcom/ironsource/lifecycle/b;", "lifeCycleObserver", "Lcom/ironsource/uk;", "Lcom/ironsource/uk;", "lifecycleListener", "<init>", "(Lcom/ironsource/lifecycle/b;)V", f.j, "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v3 extends iq {
    private static final String g = "AppLifecycleTrigger";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.p004ironsource.lifecycle.b lifeCycleObserver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final uk lifecycleListener;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/v3$b", "Lcom/ironsource/uk;", "", "c", "a", "d", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements uk {
        public b() {
        }

        @Override // com.p004ironsource.uk
        public void a() {
            v3.this.a(false);
        }

        @Override // com.p004ironsource.uk
        public void b() {
        }

        @Override // com.p004ironsource.uk
        public void c() {
        }

        @Override // com.p004ironsource.uk
        public void d() {
            v3.this.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.p004ironsource.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        Intrinsics.f(lifeCycleObserver, "lifeCycleObserver");
        this.lifeCycleObserver = lifeCycleObserver;
        b bVar = new b();
        this.lifecycleListener = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.p004ironsource.iq
    public String b() {
        return g;
    }

    public final void e() {
        this.lifeCycleObserver.b(this.lifecycleListener);
    }
}
