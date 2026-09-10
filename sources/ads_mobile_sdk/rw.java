package ads_mobile_sdk;

import ads_mobile_sdk.rw;
import android.view.MotionEvent;
import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rw extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gk2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(gk2 gk2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gk2Var;
    }

    public static final void a(gk2 gk2Var, View view) {
        gk2Var.g.set(true);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        rw rwVar = new rw(this.b, dernVar);
        rwVar.a = obj;
        return rwVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rw rwVar = new rw(this.b, (wretchedly.dern) obj2);
        rwVar.a = (gq0) obj;
        return rwVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        gq0 gq0Var = (gq0) this.a;
        gq0Var.b().r = this.b;
        final gk2 gk2Var = this.b;
        gq0Var.setOnClickListener(new View.OnClickListener() { // from class: saneness.semilustrous
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rw.a(gk2Var, view);
            }
        });
        final gk2 gk2Var2 = this.b;
        gq0Var.setOnTouchListener(new View.OnTouchListener() { // from class: saneness.protium
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return rw.a(gk2Var2, view, motionEvent);
            }
        });
        return Unit.f29295attabal;
    }

    public static final boolean a(gk2 gk2Var, View view, MotionEvent motionEvent) {
        gk2Var.g.set(true);
        view.performClick();
        return false;
    }
}
