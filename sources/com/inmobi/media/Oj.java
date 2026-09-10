package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Oj;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Oj {
    public static final taiyuan a = saneness.saneness(new Function0() { // from class: adsuki.hydromechanics
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Oj.a();
        }
    });

    public static final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((Handler) a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
