package com.ironsource;

import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3763tf {
    public static final C3763tf a = new C3763tf();
    private static final patroclinal.taiyuan b = p002kotlin.saneness.saneness(a.a);

    /* JADX INFO: renamed from: com.ironsource.tf$a */
    public static final class a extends Lambda implements Function0<Yd> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yd invoke() {
            return new Yd(16, null, null, 6, null);
        }
    }

    private C3763tf() {
    }

    public final void a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    private final Yd a() {
        return (Yd) b.getValue();
    }

    public static /* synthetic */ void a(C3763tf c3763tf, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3763tf.a(runnable, j);
    }

    public final void a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        a().schedule(action, j, TimeUnit.MILLISECONDS);
    }
}
