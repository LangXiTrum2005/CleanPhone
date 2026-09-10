package ads_mobile_sdk;

import android.view.View;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pw1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ xw1 a;
    public final /* synthetic */ d91 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ vk0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(xw1 xw1Var, d91 d91Var, View view, vk0 vk0Var, String str, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.a = xw1Var;
        this.b = d91Var;
        this.c = view;
        this.d = vk0Var;
        this.e = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new pw1(this.a, this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((pw1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        lv1 lv1Var = this.a.c;
        d91 javaScriptSessionService = this.b;
        View friendlyObstructionView = this.c;
        vk0 purpose = this.d;
        String str = this.e;
        lv1Var.getClass();
        Intrinsics.checkNotNullParameter(javaScriptSessionService, "javaScriptSessionService");
        Intrinsics.checkNotNullParameter(friendlyObstructionView, "friendlyObstructionView");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return (Unit) lv1Var.f.attabal("AddFriendlyObstructionToJavaScriptSessionService", new uu1(javaScriptSessionService, friendlyObstructionView, purpose, str));
    }
}
