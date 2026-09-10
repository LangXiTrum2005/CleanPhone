package ads_mobile_sdk;

import android.net.Uri;
import android.os.Bundle;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class bh0 extends ContinuationImpl {
    public ch0 a;
    public tg0 b;
    public Bundle c;
    public Uri.Builder d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ch0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(ch0 ch0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ch0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
