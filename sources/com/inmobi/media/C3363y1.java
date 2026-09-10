package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3363y1 extends AbstractC3242t5 {
    public final Context b;
    public final long c;
    public final int d;
    public final ActivityManager e;
    public final Ea f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3363y1(Context context, C3267u5 listener, long j, int i) {
        super(listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b = context;
        this.c = j;
        this.d = i;
        Object systemService = context.getSystemService("activity");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.e = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = Ea.b;
        this.f = Da.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC3242t5
    public final void a() {
        AbstractC2984il.a(new C3338x1(this, null));
    }

    @Override // com.inmobi.media.AbstractC3242t5
    public final void b() {
    }
}
