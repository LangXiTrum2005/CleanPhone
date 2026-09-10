package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ab3 extends ContinuationImpl {
    public cb3 a;
    public Uri b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cb3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab3(cb3 cb3Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = cb3Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
