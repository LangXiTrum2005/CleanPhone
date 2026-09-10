package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2810c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2810c extends AbstractC3242t5 {
    public final long b;
    public final Function0 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final Handler f;
    public saran g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2810c(long j, final C3267u5 listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = j;
        this.c = new Function0() { // from class: adsuki.overassessment
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2810c.a(this.f3574kowloon, listener);
            }
        };
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final Unit a(C2810c c2810c, InterfaceC3217s5 interfaceC3217s5) {
        if (c2810c.d.get()) {
            if (c2810c.f.hasMessages(2023)) {
                c2810c.f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c2810c.e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    Intrinsics.beachfront(stackTrace);
                    ((C3267u5) interfaceC3217s5).a(new Wn(stackTrace));
                }
            }
            c2810c.e.getAndSet(true);
            c2810c.f.sendEmptyMessage(2023);
        }
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC3242t5
    public final void b() {
        if (this.d.getAndSet(false)) {
            this.d.set(false);
            this.e.set(false);
            F3.a(this.g);
        }
    }

    @Override // com.inmobi.media.AbstractC3242t5
    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        Intrinsics.checkNotNullParameter("ANRWatchDog", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("ANRWatchDog", false));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        saran saranVarAttabal = privatdozent.attabal(preterite.dern(executorServiceNewSingleThreadExecutor));
        this.g = saranVarAttabal;
        if (saranVarAttabal != null) {
            F3.a(saranVarAttabal, 0L, this.b, new C2784b(this.c));
        }
    }
}
