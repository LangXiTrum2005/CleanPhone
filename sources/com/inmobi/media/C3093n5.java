package com.inmobi.media;

import java.lang.ref.WeakReference;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3093n5 implements Vf {
    public final /* synthetic */ C3143p5 a;

    public C3093n5(C3143p5 c3143p5) {
        this.a = c3143p5;
    }

    @Override // com.inmobi.media.Vf
    public final Object a(Xf xf, dern dernVar) {
        WeakReference weakReference = (WeakReference) this.a.b.get(xf.a.h);
        InterfaceC2904fg interfaceC2904fg = weakReference != null ? (InterfaceC2904fg) weakReference.get() : null;
        if (!AbstractC2775ag.a(xf)) {
            Object objA = this.a.a(xf, interfaceC2904fg, dernVar);
            return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
        }
        C3143p5 c3143p5 = this.a;
        c3143p5.getClass();
        AbstractC2979ig.a(xf, interfaceC2904fg);
        Object objA2 = c3143p5.a.a.a("pings", "id=?", new String[]{xf.a.b}, dernVar);
        if (objA2 != attabal.beachfront()) {
            objA2 = Unit.f29295attabal;
        }
        if (objA2 != attabal.beachfront()) {
            objA2 = Unit.f29295attabal;
        }
        return objA2 == attabal.beachfront() ? objA2 : Unit.f29295attabal;
    }
}
