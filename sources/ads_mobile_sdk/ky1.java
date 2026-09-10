package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends ContinuationImpl {
    public my1 a;
    public FullScreenContentError b;
    public /* synthetic */ Object c;
    public final /* synthetic */ my1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky1(my1 my1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = my1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return my1.a(this.d, (FullScreenContentError) null, this);
    }
}
