package ads_mobile_sdk;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q90 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ja0 b;
    public final /* synthetic */ AdInspectorError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(ja0 ja0Var, AdInspectorError adInspectorError, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ja0Var;
        this.c = adInspectorError;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new q90(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q90(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ja0 ja0Var = this.b;
            String str = this.c.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String();
            this.a = 1;
            if (ja0.a(ja0Var, true, str, (Activity) null, false, (wretchedly.dern) this, 12) == objBeachfront) {
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
