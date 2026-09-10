package androidx.webkit;

import androidx.webkit.internal.TracingControllerImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class TracingController {

    public static class LAZY_HOLDER {
        static {
            new TracingControllerImpl();
        }
    }
}
