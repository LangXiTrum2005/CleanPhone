package ads_mobile_sdk;

import java.util.UUID;
import okhttp3.cuirassed;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends ContinuationImpl {
    public it0 a;
    public cuirassed b;
    public UUID c;
    public /* synthetic */ Object d;
    public final /* synthetic */ it0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(it0 it0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = it0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((cuirassed) null, (UUID) null, this);
    }
}
