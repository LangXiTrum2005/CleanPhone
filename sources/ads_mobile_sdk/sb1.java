package ads_mobile_sdk;

import android.webkit.WebSettings;
import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sb1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vb1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(gq0 gq0Var, int i, int i2, vb1 vb1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = gq0Var;
        this.b = i;
        this.c = i2;
        this.d = vb1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new sb1(this.a, this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sb1) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.a(new ia3(ha3.FIXED_RECTANGLE, this.b, this.c, 8));
        WebSettings settings = this.a.getSettings();
        jk0 jk0Var = this.d.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:use_wide_viewport:enabled", X3.i.W);
        Boolean bool = Boolean.FALSE;
        jk jkVar = zk.b;
        settings.setUseWideViewPort(((Boolean) jk0Var.a("gads:use_wide_viewport:enabled", bool, jkVar)).booleanValue());
        WebSettings settings2 = this.a.getSettings();
        jk0 jk0Var2 = this.d.a;
        jk0Var2.getClass();
        Intrinsics.checkNotNullParameter("gads:load_with_overview_mode:enabled", X3.i.W);
        settings2.setLoadWithOverviewMode(((Boolean) jk0Var2.a("gads:load_with_overview_mode:enabled", bool, jkVar)).booleanValue());
        return Unit.f29295attabal;
    }
}
