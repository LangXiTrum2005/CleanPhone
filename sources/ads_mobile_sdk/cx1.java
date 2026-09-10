package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.glassmaker;
import tetrahedral.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class cx1 extends SuspendLambda implements triweekly {
    public /* synthetic */ glassmaker a;
    public final /* synthetic */ tx1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ vk0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(tx1 tx1Var, View view, vk0 vk0Var, String str, wretchedly.dern dernVar) {
        super(3, dernVar);
        this.b = tx1Var;
        this.c = view;
        this.d = vk0Var;
        this.e = str;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cx1 cx1Var = new cx1(this.b, this.c, this.d, this.e, (wretchedly.dern) obj3);
        cx1Var.a = (glassmaker) obj2;
        return cx1Var.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        glassmaker adSession = this.a;
        lv1 lv1Var = this.b.f;
        View friendlyObstructionView = this.c;
        vk0 purpose = this.d;
        String str = this.e;
        lv1Var.getClass();
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(friendlyObstructionView, "friendlyObstructionView");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return Unit.f29295attabal;
    }
}
