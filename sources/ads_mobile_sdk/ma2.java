package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.common.base.triweekly;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ d41 a;
    public final /* synthetic */ na2 b;
    public final /* synthetic */ d41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma2(d41 d41Var, na2 na2Var, d41 d41Var2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = d41Var;
        this.b = na2Var;
        this.c = d41Var2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ma2(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ma2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        phytopathogen phytopathogenVarK;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        d41 d41Var = this.a;
        if (d41Var != null && (phytopathogenVarK = d41Var.k()) != null) {
            phytopathogenVarK.a();
        }
        this.b.b().removeAllViews();
        this.b.b().a(this.c.j());
        View viewL = this.c.l();
        ViewParent parent = viewL.getParent();
        if (parent instanceof ViewGroup) {
            String adapterClassName = ((d41) this.b.c().a()).getResponseInfo().getAdapterClassName();
            triweekly triweeklyVar = kn0.a;
            kn0.c("Banner view provided from " + adapterClassName + " already has a parent view. Removing its old parent.", null);
            ((ViewGroup) parent).removeView(viewL);
        }
        this.b.b().addView(viewL);
        return Unit.f29295attabal;
    }
}
