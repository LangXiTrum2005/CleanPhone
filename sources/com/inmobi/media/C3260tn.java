package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3260tn;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3260tn extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3260tn(View view, ViewGroup viewGroup, dern dernVar) {
        super(2, dernVar);
        this.c = view;
        this.d = viewGroup;
    }

    public static final Unit a(View view, ViewOnAttachStateChangeListenerC3235sn viewOnAttachStateChangeListenerC3235sn) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3235sn);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3260tn c3260tn = new C3260tn(this.c, this.d, dernVar);
        c3260tn.b = obj;
        return c3260tn;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3260tn) create((kowloon) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kowloon kowloonVar = (kowloon) this.b;
            View view = this.c;
            final ViewOnAttachStateChangeListenerC3235sn viewOnAttachStateChangeListenerC3235sn = new ViewOnAttachStateChangeListenerC3235sn(kowloonVar, view, this.d);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3235sn);
            kowloonVar.triweekly(igo.attabal.attabal(AbstractC3310vn.b(this.c, this.d)));
            final View view2 = this.c;
            Function0 function0 = new Function0() { // from class: adsuki.manhattanization
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3260tn.a(view2, viewOnAttachStateChangeListenerC3235sn);
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
