package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ uq0 c;
    public final /* synthetic */ WebResourceRequest d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(Uri uri, WebResourceRequest webResourceRequest, uq0 uq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = uri;
        this.c = uq0Var;
        this.d = webResourceRequest;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new sq0(this.b, this.d, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sq0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (android.util.Log.isLoggable("GoogleMobileAdsNetwork", 2) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if (r7 == r0) goto L38;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
