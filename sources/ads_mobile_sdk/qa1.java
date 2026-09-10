package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class qa1 extends ContinuationImpl {
    public ya1 a;
    public gq0 b;
    public Uri c;
    public String d;
    public String e;
    public Ref$ObjectRef f;
    public formularization.attabal g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ya1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa1(ya1 ya1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = ya1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return ya1.a(this.i, (gq0) null, (Uri) null, this);
    }
}
