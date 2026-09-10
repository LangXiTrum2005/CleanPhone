package ads_mobile_sdk;

import android.os.Bundle;
import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class fv extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Object c;
    public formularization.attabal d;
    public /* synthetic */ Object e;
    public final /* synthetic */ iv f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.f = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((Bundle) null, this);
    }
}
