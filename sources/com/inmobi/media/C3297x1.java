package com.inmobi.media;

import A.RunnableC0883c;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3297x1 implements ReadOnlyProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f24085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f24087c;
    public final AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24088e;

    public /* synthetic */ C3297x1(Integer num, Function0 function0, boolean z2, int i2) {
        this((Object) num, function0, (i2 & 4) != 0 ? false : z2, false);
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.f24088e = true;
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).submit(new RunnableC0883c(this, 23));
        }
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.f(property, "property");
        if (this.f24086b || !this.f24088e) {
            a();
        }
        return this.f24087c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3297x1(Object obj, Function0 refreshLogic, boolean z2, boolean z3) {
        Intrinsics.f(refreshLogic, "refreshLogic");
        this.f24085a = (Lambda) refreshLogic;
        this.f24086b = z2;
        this.f24087c = obj;
        this.d = new AtomicBoolean(false);
        if (z3) {
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public static final void a(C3297x1 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            this$0.f24087c = this$0.f24085a.invoke();
        } catch (Exception unused) {
        } finally {
            this$0.d.set(false);
        }
    }
}
