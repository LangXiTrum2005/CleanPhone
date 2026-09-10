package com.inmobi.media;

import A.RunnableC0883c;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class F extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f22804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i2) {
        super(0);
        this.f22804a = i2;
    }

    public final void a() {
        I i2 = this.f22804a;
        i2.getClass();
        L3 l3 = L3.f22938a;
        if (l3.A()) {
            GestureDetectorOnGestureListenerC3005ec view = i2.f22866a;
            H windowInsetListener = i2.m;
            InterfaceC3333z5 interfaceC3333z5 = i2.f22869e;
            Intrinsics.f(view, "view");
            Intrinsics.f(windowInsetListener, "windowInsetListener");
            Df df = new Df(null, windowInsetListener, interfaceC3333z5);
            if (l3.F()) {
                df.f22790c = view;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("WindowInsetsHandler", "startListeningToInsets");
                }
                WeakHashMap weakHashMap = Df.g;
                Object zfVar = weakHashMap.get(view);
                if (zfVar == null) {
                    zfVar = new zf(view);
                    weakHashMap.put(view, zfVar);
                }
                ((zf) zfVar).f24168a.add(df);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("WindowInsetsHandler_INSTANCE", df + " created - " + weakHashMap.size());
                }
            } else if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
            }
            i2.f22872l = df;
        } else {
            InterfaceC3333z5 interfaceC3333z6 = i2.f22869e;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        I i3 = this.f22804a;
        i3.k = i3.f22871i.scheduleWithFixedDelay(new RunnableC0883c(i3, 3), 0L, i3.f22868c, TimeUnit.MILLISECONDS);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f43263a;
    }

    public static final void a(I this$0) {
        InterfaceC3333z5 interfaceC3333z5;
        Intrinsics.f(this$0, "this$0");
        Throwable thA = Result.a(C2.a(new E(this$0)));
        if (thA == null || (interfaceC3333z5 = this$0.f22869e) == null) {
            return;
        }
        ((A5) interfaceC3333z5).b("AdExposureTracker", androidx.datastore.preferences.protobuf.a.o(thA, new StringBuilder("Error calculating exposure metrics - ")));
    }
}
