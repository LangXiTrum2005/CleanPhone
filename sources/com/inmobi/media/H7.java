package com.inmobi.media;

import A.RunnableC0905n;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f22860a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f22861b = Executors.newSingleThreadExecutor(new K5("MultiEventBus"));

    public static final void a(C2978d2 event, H7 this$0) {
        Intrinsics.f(event, "$event");
        Intrinsics.f(this$0, "this$0");
        this$0.a(event);
    }

    public final void b(C2978d2 event) {
        Intrinsics.f(event, "event");
        try {
            this.f22861b.execute(new RunnableC0905n(3, event, this));
        } catch (InternalError unused) {
            a(event);
        }
    }

    public final void a(int[] eventIds, Function1 subscriber) {
        Intrinsics.f(eventIds, "eventIds");
        Intrinsics.f(subscriber, "subscriber");
        this.f22860a.put(new G7(eventIds), new WeakReference(subscriber));
    }

    public final void a(Function1 subscriber) {
        Intrinsics.f(subscriber, "subscriber");
        Iterator it = this.f22860a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(C2978d2 c2978d2) {
        Function1 function1;
        Set<Map.Entry> setEntrySet = this.f22860a.entrySet();
        Intrinsics.e(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f22860a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f22860a.entrySet();
        Intrinsics.e(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            Intrinsics.c(entry2);
            Function1 function2 = (Function1) entry2.getKey();
            WeakReference weakReference = (WeakReference) entry2.getValue();
            try {
                if (((Boolean) function2.invoke(c2978d2)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(c2978d2);
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }
}
