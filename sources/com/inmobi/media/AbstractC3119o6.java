package com.inmobi.media;

import com.inmobi.media.AbstractC3119o6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3119o6 {
    public static final taiyuan a = saneness.saneness(new Function0() { // from class: adsuki.lehua
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.a();
        }
    });
    public static final taiyuan b = saneness.saneness(new Function0() { // from class: adsuki.vaporizer
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.c();
        }
    });
    public static final taiyuan c = saneness.saneness(new Function0() { // from class: adsuki.delouse
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.e();
        }
    });
    public static final taiyuan d = saneness.saneness(new Function0() { // from class: adsuki.nucleosidase
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.b();
        }
    });
    public static final taiyuan e = saneness.saneness(new Function0() { // from class: adsuki.unliveable
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.d();
        }
    });
    public static final taiyuan f = saneness.saneness(new Function0() { // from class: adsuki.neurotropism
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3119o6.f();
        }
    });

    public static final ExecutorService a() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.highIO", false));
    }

    public static final Wb d() {
        return new Wb();
    }

    public static final ExecutorService e() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new B9("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new B9("ExecutorProvider.single", false));
    }
}
