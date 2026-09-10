package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class mh extends ContinuationImpl {
    public Uri a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(oh ohVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.c = ohVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
