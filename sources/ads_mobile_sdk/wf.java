package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class wf {
    public final Context a;
    public final loun b;
    public float c;
    public boolean d;

    public wf(Context applicationContext, loun traceLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = applicationContext;
        this.b = traceLogger;
        this.c = 1.0f;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(float f) {
        this.c = f;
    }
}
