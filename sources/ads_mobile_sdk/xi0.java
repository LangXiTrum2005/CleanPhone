package ads_mobile_sdk;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ yi0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ WeakReference d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(yi0 yi0Var, View view, WeakReference weakReference, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = yi0Var;
        this.c = view;
        this.d = weakReference;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new xi0(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xi0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r1.a(r5, r3, (java.lang.String) null, r4) == r0) goto L19;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p002kotlin.dern.saneness(r5)
            goto L52
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            p002kotlin.dern.saneness(r5)
            goto L30
        L1e:
            p002kotlin.dern.saneness(r5)
            ads_mobile_sdk.yi0 r5 = r4.b
            ads_mobile_sdk.tx1 r5 = r5.s
            android.view.View r1 = r4.c
            r4.a = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L30
            goto L51
        L30:
            java.lang.ref.WeakReference r5 = r4.d
            java.lang.Object r5 = r5.get()
            saneness.technofreak r5 = (saneness.technofreak) r5
            if (r5 == 0) goto L52
            ads_mobile_sdk.cm1 r5 = (ads_mobile_sdk.cm1) r5
            android.widget.FrameLayout r5 = r5.d()
            if (r5 == 0) goto L52
            ads_mobile_sdk.yi0 r1 = r4.b
            ads_mobile_sdk.tx1 r1 = r1.s
            ads_mobile_sdk.vk0 r3 = ads_mobile_sdk.vk0.OTHER
            r4.a = r2
            r2 = 0
            java.lang.Object r5 = r1.a(r5, r3, r2, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            kotlin.Unit r5 = p002kotlin.Unit.f29295attabal
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
