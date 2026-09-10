package ads_mobile_sdk;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class hu extends ContinuationImpl {
    public iv a;
    public et b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iv e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.e = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return iv.a(this.e, false, (wretchedly.dern) this);
    }
}
