package ads_mobile_sdk;

import android.view.View;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tw1 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ xq0 b;
    public final /* synthetic */ xw1 c;
    public final /* synthetic */ d91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(xq0 xq0Var, xw1 xw1Var, d91 d91Var, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.b = xq0Var;
        this.c = xw1Var;
        this.d = d91Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new tw1(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((tw1) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            xq0 xq0Var = this.b;
            xq0Var.getClass();
            ArrayList<View> arrayList = new ArrayList();
            int childCount = xq0Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = xq0Var.getChildAt(i2);
                if (!Intrinsics.wireman(childAt, xq0Var.a)) {
                    Intrinsics.beachfront(childAt);
                    arrayList.add(childAt);
                }
            }
            xw1 xw1Var = this.c;
            d91 javaScriptSessionService = this.d;
            for (View friendlyObstructionView : arrayList) {
                lv1 lv1Var = xw1Var.c;
                vk0 purpose = vk0.OTHER;
                lv1Var.getClass();
                Intrinsics.checkNotNullParameter(javaScriptSessionService, "javaScriptSessionService");
                Intrinsics.checkNotNullParameter(friendlyObstructionView, "friendlyObstructionView");
                Intrinsics.checkNotNullParameter(purpose, "purpose");
            }
            gq0 gq0Var = this.b.a;
            JsonObject jsonObject = new JsonObject();
            this.a = 1;
            if (gq0Var.a(jsonObject, "onSdkLoaded", this) == objBeachfront) {
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
