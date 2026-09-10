package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pn1 extends ContinuationImpl {
    public Collection a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sn1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(sn1 sn1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.d = sn1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JsonObject) null, (String) null, this);
    }
}
