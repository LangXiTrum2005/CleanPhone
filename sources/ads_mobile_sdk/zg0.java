package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends ContinuationImpl {
    public ch0 a;
    public Uri.Builder b;
    public Uri.Builder c;
    public Uri d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ch0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(ch0 ch0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ch0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
