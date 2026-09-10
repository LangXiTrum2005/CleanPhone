package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d0.a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HandlerDispatcherKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44775a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new HandlerContext(b(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
    }

    public static final void a() {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.c(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new a());
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
