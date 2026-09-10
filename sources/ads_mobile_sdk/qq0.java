package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uq0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ WebResourceRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(Uri uri, WebResourceRequest webResourceRequest, uq0 uq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = uq0Var;
        this.c = uri;
        this.d = webResourceRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qq0(this.c, this.d, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qq0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            gk2 gk2Var = this.b.r;
            if (gk2Var != null) {
                String string = this.c.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                b10 b10Var = b10.AD_RESOURCE_CREATIVE;
                Map<String, String> requestHeaders = this.d.getRequestHeaders();
                if (requestHeaders == null) {
                    requestHeaders = seminary.taiyuan();
                }
                this.a = 1;
                if (gk2.a(gk2Var, string, b10Var, requestHeaders, this) == objBeachfront) {
                    return objBeachfront;
                }
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
