package com.inmobi.media;

import com.inmobi.media.C3349xc;
import com.inmobi.media.I2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3349xc {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService b;

    public C3349xc() {
        Intrinsics.checkNotNullParameter("MultiEventBus", "name");
        this.b = Executors.newSingleThreadExecutor(new B9("MultiEventBus", false));
    }

    public static final void a(I2 i2, C3349xc c3349xc) {
        int i = i2.a;
        c3349xc.a(i2);
    }

    public final void b(final I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.b.execute(new Runnable() { // from class: adsuki.iiion
                @Override // java.lang.Runnable
                public final void run() {
                    C3349xc.a(event, this);
                }
            });
        } catch (InternalError unused) {
            int i = event.a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return polloi.restrictive(iArr, event.a);
    }

    public final void a(final int[] eventIds, Function1 subscriber) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.a.put(new Function1() { // from class: adsuki.dynein
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C3349xc.a(eventIds, (I2) obj));
            }
        }, new WeakReference(subscriber));
    }

    public final void a(Function1 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(I2 i2) {
        Function1 function1;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            Intrinsics.beachfront(entry2);
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Function1 function2 = (Function1) key;
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function2.invoke(i2)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(i2);
                }
            } catch (Exception e) {
                taiyuan taiyuanVar = P9.a;
                AbstractC2973i9.a(e);
            }
        }
    }
}
