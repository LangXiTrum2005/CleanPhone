package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3110nm;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3110nm extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3135om a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110nm(C3135om c3135om, dern dernVar) {
        super(2, dernVar);
        this.a = c3135om;
    }

    public static final void a(C3135om c3135om, View view) {
        P4.a(c3135om.d, c3135om.b, Ol.a);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3110nm(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3110nm(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        final C3135om c3135om = this.a;
        ViewGroup viewGroup = c3135om.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: adsuki.escorial
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3110nm.a(c3135om, view);
                }
            });
        }
        return Unit.f29295attabal;
    }
}
