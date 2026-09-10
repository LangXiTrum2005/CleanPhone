package ads_mobile_sdk;

import java.util.UUID;
import kotlinx.coroutines.gintrap;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mp0 extends ContinuationImpl {
    public gq0 a;
    public Object b;
    public String c;
    public UUID d;
    public gintrap e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gq0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(gq0 gq0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.g = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
