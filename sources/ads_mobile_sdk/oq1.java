package ads_mobile_sdk;

import java.lang.ref.WeakReference;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 {
    public WeakReference a = new WeakReference(null);
    public WeakReference b = new WeakReference(null);
    public WeakReference c = new WeakReference(null);
    public WeakReference d = new WeakReference(null);

    public final void a(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.a = weakReference;
    }

    public final void b(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.d = weakReference;
    }
}
