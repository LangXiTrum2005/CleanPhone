package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class g23 extends ContinuationImpl {
    public m23 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m23 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g23(m23 m23Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = m23Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((FullScreenContentError) null, this);
    }
}
