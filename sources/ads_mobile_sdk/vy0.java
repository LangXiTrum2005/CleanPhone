package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.io.Closeable;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class vy0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public w03 c;
    public Closeable d;
    public wt0 e;
    public hobby f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wz0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(wz0 wz0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.i = wz0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a((JsonObject) null, (String) null, this);
    }
}
