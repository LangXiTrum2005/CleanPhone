package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3133ok;
import java.util.HashMap;
import java.util.Timer;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3133ok {
    public final AbstractC3039l1 a;
    public final HashMap b;

    public C3133ok(AbstractC3039l1 timeOutInformer) {
        Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.a = timeOutInformer;
        this.b = new HashMap();
    }

    public final boolean a(byte b, long j) {
        Intrinsics.checkNotNullExpressionValue("ok", "TAG");
        if (this.b.containsKey(Byte.valueOf(b))) {
            a(b);
        }
        try {
            Timer timer = new Timer("ok");
            this.b.put(Byte.valueOf(b), timer);
            timer.schedule(new C3108nk(this, b), j);
            return true;
        } catch (InternalError e) {
            Intrinsics.checkNotNullExpressionValue("ok", "TAG");
            e.toString();
            return false;
        }
    }

    public final void b(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: adsuki.kamptulicon
            @Override // java.lang.Runnable
            public final void run() {
                C3133ok.a(this.f3498kowloon, b);
            }
        });
    }

    public static final void a(C3133ok c3133ok, byte b) {
        c3133ok.a.a(b);
    }

    public final void a(byte b) {
        Intrinsics.checkNotNullExpressionValue("ok", "TAG");
        Timer timer = (Timer) this.b.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(Byte.valueOf(b));
        }
    }
}
