package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.impromptu;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class el {
    public final jk0 a;
    public final CoroutineContext b;

    public el(jk0 flags, CoroutineContext uiContext) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        this.a = flags;
        this.b = uiContext;
    }

    public final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        jk0 jk0Var = this.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:call_all_methods_on_ui_thread:enabled", X3.i.W);
        return ((Boolean) jk0Var.a("gads:call_all_methods_on_ui_thread:enabled", Boolean.FALSE, zk.b)).booleanValue() ? impromptu.competently(this.b, new dl(function1, null), continuationImpl) : function1.invoke(continuationImpl);
    }
}
