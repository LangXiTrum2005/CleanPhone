package ads_mobile_sdk;

import android.os.Bundle;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class vu extends ContinuationImpl {
    public iv a;
    public Object b;
    public formularization.attabal c;
    public iv d;
    public Bundle e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ iv h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(iv ivVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return iv.a(this.h, false, false, (wretchedly.dern) this);
    }
}
