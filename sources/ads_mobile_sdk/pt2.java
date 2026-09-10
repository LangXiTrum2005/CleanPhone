package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import svd.arytenoidectomy;
import svd.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 extends ContinuationImpl {
    public Object a;
    public Object b;
    public arytenoidectomy c;
    public List d;
    public Iterator e;
    public vn f;
    public /* synthetic */ Object g;
    public final /* synthetic */ polloi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt2(polloi polloiVar, wretchedly.dern dernVar) {
        super(dernVar);
        this.h = polloiVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return polloi.dern(this.h, this);
    }
}
