package ads_mobile_sdk;

import complexometry.dovishness;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 extends ContinuationImpl {
    public ql1 a;
    public Integer b;
    public ArrayList c;
    public Integer d;
    public Boolean e;
    public String f;
    public Boolean g;
    public List h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public dovishness l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ql1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl1(ql1 ql1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.n = ql1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(this);
    }
}
