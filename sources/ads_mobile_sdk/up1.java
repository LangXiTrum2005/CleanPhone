package ads_mobile_sdk;

import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class up1 extends ContinuationImpl {
    public wp1 a;
    public w03 b;
    public Closeable c;
    public gq0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ wp1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(wp1 wp1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = wp1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return wp1.a(this.f, this);
    }
}
