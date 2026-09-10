package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.igo;
import saneness.preterite;
import saneness.pussyfooter;

/* JADX INFO: loaded from: classes.dex */
public final class my2 implements preterite {
    public final saran a;
    public final e2 b;
    public final igo c;
    public final pussyfooter d;
    public final AtomicBoolean e;

    public my2(saran backgroundScope, e2 adEventEmitter, igo thirdPartyEventEmitter, pussyfooter thirdPartyFullscreenShowMethod) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyEventEmitter, "thirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyFullscreenShowMethod, "thirdPartyFullscreenShowMethod");
        this.a = backgroundScope;
        this.b = adEventEmitter;
        this.c = thirdPartyEventEmitter;
        this.d = thirdPartyFullscreenShowMethod;
        this.e = new AtomicBoolean(false);
    }

    @Override // saneness.preterite
    public final void a(Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.e.getAndSet(true)) {
            kn0.a("This ad has already been shown.", (Throwable) null);
            y13.a(this.a, new jy2(this, null));
            y13.a("The ad has already been shown", null, 6);
            return;
        }
        try {
            this.d.a();
            saran saranVar = this.a;
            ly2 block = new ly2(this, null);
            EmptyCoroutineContext context2 = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context2, null, new x13(block, null), 2, null);
        } catch (Exception e) {
            y13.a("Mediation Fullscreen Ad failed to show.", e, 4);
            y13.a(this.a, new ky2(this, null));
        }
    }
}
