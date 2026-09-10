package ads_mobile_sdk;

import android.app.Activity;
import java.io.Closeable;
import java.util.ArrayList;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class u90 extends ContinuationImpl {
    public Object a;
    public Closeable b;
    public Closeable c;
    public Activity d;
    public ArrayList e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ja0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(ja0 ja0Var, wretchedly.dern dernVar) {
        super(dernVar);
        this.j = ja0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
