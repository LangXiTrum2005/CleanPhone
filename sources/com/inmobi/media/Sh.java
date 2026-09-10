package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Sh implements N {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public Sh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    public final void a(E6 metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        float f = metrics.a;
        F6 f6 = metrics.b;
        Object jSONArray = "null";
        Object objA = f6 != null ? G6.a(f6) : "null";
        ArrayList arrayList = metrics.c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(G6.a((F6) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC2829ci.g("window.mraidview.broadcastEvent('exposureChange', " + f + ", " + objA + ", " + jSONArray + ");");
    }
}
