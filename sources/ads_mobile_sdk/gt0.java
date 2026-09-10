package ads_mobile_sdk;

import java.util.UUID;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class gt0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public rotuma c;
    public UUID d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ it0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(it0 it0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = it0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((preprohormone) null, (rotuma) null, this);
    }
}
