package ads_mobile_sdk;

import complexometry.monoploid;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends ContinuationImpl {
    public wz0 a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wz0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return wz0.a(this.h, (sy0) null, (monoploid) null, this);
    }
}
