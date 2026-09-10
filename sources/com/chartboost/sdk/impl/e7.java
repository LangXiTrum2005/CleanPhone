package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 implements d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f13787a = LazyKt.b(b.f13790b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f13788b = LazyKt.b(a.f13789b);

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13789b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return i2.a(0, null, 3, null);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13790b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return i2.a(4, 0L, null, 6, null);
        }
    }

    @Override // com.chartboost.sdk.impl.d7
    public ExecutorService a() {
        return (ExecutorService) this.f13787a.getX();
    }

    @Override // com.chartboost.sdk.impl.d7
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.f13788b.getX();
    }
}
