package com.inmobi.media;

import com.squareup.picasso.Picasso;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3236t implements Function1 {
    public final /* synthetic */ C3311w a;

    public C3236t(C3311w c3311w) {
        this.a = c3311w;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3097n9 c3097n9 = this.a.d;
        if (c3097n9 != null) {
            c3097n9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C3311w c3311w = this.a;
        C3097n9 c3097n10 = c3311w.d;
        if (c3097n10 != null) {
            c3097n10.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Qf.a;
        Qf.b(c3311w.a).cancelTag(c3311w.e);
        return Unit.f29295attabal;
    }
}
