package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.common.base.triweekly;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.ferdelance;

/* JADX INFO: loaded from: classes.dex */
public final class rq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uq0 b;
    public final /* synthetic */ WebResourceRequest c;
    public final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(Uri uri, WebResourceRequest webResourceRequest, uq0 uq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = uq0Var;
        this.c = webResourceRequest;
        this.d = uri;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        uq0 uq0Var = this.b;
        return new rq0(this.d, this.c, uq0Var, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rq0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                ferdelance ferdelanceVarE = this.b.e();
                if (ferdelanceVarE == null) {
                    return null;
                }
                WebResourceRequest webResourceRequest = this.c;
                this.a = 1;
                obj = ((cb3) ferdelanceVarE).a(webResourceRequest, this);
                if (obj == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return (WebResourceResponse) obj;
        } catch (Exception e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Failed to intercept request using WebViewFirebaseAnalyticsEventsHandler: " + this.d, e);
            return null;
        }
    }
}
