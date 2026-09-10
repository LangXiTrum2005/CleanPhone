package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.premeiotic;
import com.inmobi.media.Co;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.kowloon;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Co extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(ViewGroup viewGroup, dern dernVar) {
        super(2, dernVar);
        this.c = viewGroup;
    }

    public static final void a(kowloon kowloonVar, boolean z) {
        kowloonVar.triweekly(Boolean.valueOf(z));
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Co co2 = new Co(this.c, dernVar);
        co2.b = obj;
        return co2;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Co co2 = new Co(this.c, (dern) obj2);
        co2.b = (kowloon) obj;
        return co2.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            final kowloon kowloonVar = (kowloon) this.b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: adsuki.competently
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    Co.a(kowloonVar, z);
                }
            };
            this.c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.c;
            if (premeiotic.starveling(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Bo(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            Function0 function0 = new Function0() { // from class: adsuki.impromptu
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Co.a();
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
