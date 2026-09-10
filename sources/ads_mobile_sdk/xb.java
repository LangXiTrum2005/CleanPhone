package ads_mobile_sdk;

import android.app.ActivityManager;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends ContinuationImpl {
    public yb a;
    public ActivityManager.MemoryInfo b;
    public mo c;
    public eo0 d;
    public eo0 e;
    public eo0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(yb ybVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = ybVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
