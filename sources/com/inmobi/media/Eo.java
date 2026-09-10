package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.premeiotic;
import com.inmobi.media.Eo;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Eo extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(ViewGroup viewGroup, dern dernVar) {
        super(2, dernVar);
        this.c = viewGroup;
    }

    public static final void a(kowloon kowloonVar, int i) {
        kowloonVar.triweekly(Boolean.valueOf(i == 0));
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Eo eo = new Eo(this.c, dernVar);
        eo.b = obj;
        return eo;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Eo eo = new Eo(this.c, (dern) obj2);
        eo.b = (kowloon) obj;
        return eo.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            final kowloon kowloonVar = (kowloon) this.b;
            kowloonVar.triweekly(igo.attabal.attabal(this.c.getWindowVisibility() == 0));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: adsuki.yemenite
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i2) {
                    Eo.a(kowloonVar, i2);
                }
            };
            this.c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.c;
            if (premeiotic.starveling(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Do(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            Function0 function0 = new Function0() { // from class: adsuki.sealless
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Eo.a();
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

    public static final Unit a() {
        return Unit.f29295attabal;
    }
}
