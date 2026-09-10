package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class q7 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdView c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(AdView adView, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = adView;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.loadFromAdResponse((String) null, this);
    }
}
