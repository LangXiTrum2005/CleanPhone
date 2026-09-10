package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.UL;
import com.facebook.ads.redexgen.core.UN;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class UM<T extends UN, E extends UL> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A00(E e2) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e2.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            UN un = (UN) ((WeakReference) it.next()).get();
            if (un != null && un.A00(e2)) {
                un.A03(e2);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A02(E e2) {
        if (this.A01.isEmpty()) {
            this.A01.add(e2);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        Class<E> clsA01 = t.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    private void A01(List<WeakReference<T>> subscribers) {
        if (subscribers != null) {
            int writePtr = 0;
            for (int i2 = 0; i2 < writePtr; i2++) {
                WeakReference<T> weakReference = subscribers.get(i2);
                if (weakReference.get() != null) {
                    subscribers.set(writePtr, weakReference);
                    writePtr++;
                }
            }
            int writePtr2 = subscribers.size();
            for (int writePtr3 = writePtr2 - 1; writePtr3 >= writePtr; writePtr3--) {
                subscribers.remove(writePtr3);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).get() == subscriber) {
                list.get(i2).clear();
                return true;
            }
        }
        return false;
    }
}
