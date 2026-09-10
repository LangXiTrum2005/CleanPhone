package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q7 implements k0 {
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41392c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f41393e;

    public q7(Context context, lb executor) {
        Intrinsics.f(context, "context");
        Intrinsics.f(executor, "executor");
        this.f41390a = context;
        this.f41391b = executor;
        this.f41393e = new ArrayList();
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a() {
        b(new androidx.room.d(11));
    }

    public final void b(Function1 function1) {
        synchronized (f) {
            try {
                if (this.d) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                if (!this.f41392c) {
                    this.f41392c = true;
                    ((Executor) this.f41391b.a()).execute(new C(this, 3));
                }
                a(function1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Unit a(boolean z2) {
        return Unit.f43263a;
    }

    public static final void a(final q7 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            MobileAds.initialize(this$0.f41390a, new OnInitializationCompleteListener() { // from class: com.startapp.sdk.internal.G
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    q7.a(this.f40774a, initializationStatus);
                }
            });
        } catch (Throwable unused) {
            synchronized (f) {
                List listI0 = CollectionsKt.i0(this$0.f41393e);
                this$0.f41393e.clear();
                this$0.f41392c = false;
                Iterator it = listI0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(Boolean.FALSE);
                }
            }
        }
    }

    public static final Unit b(Function1 listener, q7 this$0, AdUnitConfig config, boolean z2) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(config, "$config");
        listener.invoke(z2 ? new s7(this$0.f41390a, config) : null);
        return Unit.f43263a;
    }

    public static final void a(q7 this$0, InitializationStatus it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "it");
        synchronized (f) {
            List listI0 = CollectionsKt.i0(this$0.f41393e);
            this$0.f41393e.clear();
            this$0.f41392c = false;
            this$0.d = true;
            Iterator it2 = listI0.iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Boolean.TRUE);
            }
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void b(AdUnitConfig config, Function1 listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
        b(new F(listener, this, config, 1));
    }

    public final void a(Function1 function1) {
        synchronized (f) {
            this.f41393e.add(function1);
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a(AdUnitConfig config, Function1 listener) {
        Intrinsics.f(config, "config");
        Intrinsics.f(listener, "listener");
        b(new F(listener, this, config, 0));
    }

    public static final Unit a(Function1 listener, q7 this$0, AdUnitConfig config, boolean z2) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(config, "$config");
        listener.invoke(z2 ? new p7(this$0.f41390a, config) : null);
        return Unit.f43263a;
    }
}
