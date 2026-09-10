package com.inmobi.media;

import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2876ee implements wireman {
    public final /* synthetic */ C3251te a;

    public C2876ee(saran saranVar, C3251te c3251te) {
        this.a = c3251te;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        AbstractC2797bc mediaEvent = (AbstractC2797bc) obj;
        Nc nc = this.a.b.f;
        nc.getClass();
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Em) {
            nc.a.d = AbstractC2960hl.a(((Em) mediaEvent).a);
        } else if (mediaEvent instanceof Xm) {
            nc.a.e = ((Xm) mediaEvent).a;
        }
        if (!(mediaEvent instanceof Xm)) {
            InterfaceC3072m9 interfaceC3072m9L = this.a.l();
            if (interfaceC3072m9L != null) {
                ((C3097n9) interfaceC3072m9L).a("NativeRenderedState", "listenMediaEvents - processing media event: " + mediaEvent);
            }
            ((Sc) this.a.b.m.getValue()).a(mediaEvent);
            C3106ni c3106ni = (C3106ni) this.a.b.n.getValue();
            c3106ni.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            if (mediaEvent instanceof Rl) {
                c3106ni.b.a((Rl) mediaEvent);
            }
            C3106ni c3106ni2 = (C3106ni) this.a.b.n.getValue();
            c3106ni2.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            Ac ac = c3106ni2.c.c;
            if (mediaEvent instanceof C3036kn) {
                ac.f();
            } else if (mediaEvent instanceof C2962hn) {
                ac.i();
            } else if (mediaEvent instanceof Om) {
                ac.b();
            } else if (mediaEvent instanceof Pl) {
                ac.h();
            } else if (mediaEvent instanceof S1) {
                ac.a(((S1) mediaEvent).a);
            }
            C3106ni c3106ni3 = (C3106ni) this.a.b.n.getValue();
            c3106ni3.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof Pl) {
                c3106ni3.a.g();
            }
        }
        return Unit.f29295attabal;
    }
}
