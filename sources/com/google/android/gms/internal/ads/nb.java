package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f17730c = ob.f18214a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17731a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17732b = false;

    public final synchronized void a(long j10, String str) {
        if (this.f17732b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f17731a.add(new mb(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.f17732b = true;
        ArrayList<mb> arrayList = this.f17731a;
        long j10 = arrayList.size() == 0 ? 0L : ((mb) arrayList.get(arrayList.size() - 1)).f17371c - ((mb) arrayList.get(0)).f17371c;
        if (j10 > 0) {
            long j11 = ((mb) arrayList.get(0)).f17371c;
            ob.b("(%-4d ms) %s", Long.valueOf(j10), str);
            for (mb mbVar : arrayList) {
                long j12 = mbVar.f17371c;
                ob.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(mbVar.f17370b), mbVar.f17369a);
                j11 = j12;
            }
        }
    }

    public final void finalize() {
        if (this.f17732b) {
            return;
        }
        b("Request on the loose");
        ob.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
