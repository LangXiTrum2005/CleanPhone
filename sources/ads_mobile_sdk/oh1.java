package ads_mobile_sdk;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends ContinuationImpl {
    public qh1 a;
    public Activity b;
    public Window c;
    public ViewGroup d;
    public yq e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qh1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh1(qh1 qh1Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.l = qh1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return qh1.a(this.l, (Map) null, this);
    }
}
