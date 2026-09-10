package ads_mobile_sdk;

import android.app.Activity;
import android.net.Uri;
import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class py1 extends ContinuationImpl {
    public vy1 a;
    public Map b;
    public gq0 c;
    public String d;
    public Activity e;
    public Uri f;
    public String g;
    public boolean h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vy1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py1(vy1 vy1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.k = vy1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a((Map) null, false, false, (gq0) null, (wretchedly.dern) this);
    }
}
