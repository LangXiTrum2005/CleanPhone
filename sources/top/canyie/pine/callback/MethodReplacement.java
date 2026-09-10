package top.canyie.pine.callback;

import top.canyie.pine.Pine;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MethodReplacement extends MethodHook {

    /* JADX INFO: renamed from: top.canyie.pine.callback.MethodReplacement$1, reason: invalid class name */
    public class AnonymousClass1 extends MethodReplacement {
    }

    /* JADX INFO: renamed from: top.canyie.pine.callback.MethodReplacement$2, reason: invalid class name */
    class AnonymousClass2 extends MethodReplacement {
    }

    @Override // top.canyie.pine.callback.MethodHook
    public final void a(Pine.CallFrame callFrame) {
    }

    @Override // top.canyie.pine.callback.MethodHook
    public final void b(Pine.CallFrame callFrame) {
        try {
            callFrame.f48858c = null;
            callFrame.d = null;
            callFrame.f48859e = true;
        } catch (Throwable th) {
            callFrame.d = th;
            callFrame.f48858c = null;
            callFrame.f48859e = true;
        }
    }
}
