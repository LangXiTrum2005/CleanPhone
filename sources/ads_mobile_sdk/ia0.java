package ads_mobile_sdk;

import android.app.Activity;
import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public w03 c;
    public Activity d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ja0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ja0.b(this.f, this);
    }
}
