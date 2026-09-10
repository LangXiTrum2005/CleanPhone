package com.inmobi.media;

import com.inmobi.media.C2796bb;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2796bb extends AbstractC3213s1 {
    public final C3114o1 b;
    public final Ac c;
    public monroe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2796bb(C3114o1 adManagerComponent, Ac stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    public static final Unit a(C2796bb c2796bb) {
        c2796bb.c.e();
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC3213s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3213s1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3213s1
    public final void e() {
        H6.a(this.d);
        this.d = null;
    }

    public final void g() {
        long j = this.a.c;
        saran coroutineScope = this.b.e;
        Function0 timeOutCallback = new Function0() { // from class: adsuki.http
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2796bb.a(this.f3464kowloon);
            }
        };
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(timeOutCallback, "timeOutCallback");
        this.d = cutely.wireman(coroutineScope, null, null, new C3232sk(j, timeOutCallback, null), 3, null);
    }

    @Override // com.inmobi.media.AbstractC3213s1
    public final void a() {
        H6.a(this.d);
        this.d = null;
    }
}
