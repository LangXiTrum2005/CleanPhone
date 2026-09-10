package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Ao;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Ao extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ao(ViewGroup viewGroup, dern dernVar) {
        super(2, dernVar);
        this.c = viewGroup;
    }

    public static final Unit a(View view, zo zoVar) {
        view.removeOnAttachStateChangeListener(zoVar);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Ao ao = new Ao(this.c, dernVar);
        ao.b = obj;
        return ao;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ao ao = new Ao(this.c, (dern) obj2);
        ao.b = (kowloon) obj;
        return ao.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kowloon kowloonVar = (kowloon) this.b;
            kowloonVar.triweekly(igo.attabal.attabal(this.c.isAttachedToWindow()));
            final zo zoVar = new zo(kowloonVar);
            this.c.addOnAttachStateChangeListener(zoVar);
            final ViewGroup viewGroup = this.c;
            Function0 function0 = new Function0() { // from class: adsuki.dern
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ao.a(viewGroup, zoVar);
                }
            };
            this.a = 1;
            if (ProduceKt.attabal(kowloonVar, function0, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
