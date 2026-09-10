package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7618c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f7619d = new AtomicInteger();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f7621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7622c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            String str = this.f7620a;
            if (str != null) {
                return str.equalsIgnoreCase(cVar.f7620a);
            }
            return cVar.f7620a == null;
        }

        public int hashCode() {
            String str = this.f7620a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f7620a + "', countdownStepMillis=" + this.f7622c + '}';
        }

        private c(String str, long j10, b bVar) {
            this.f7620a = str;
            this.f7622c = j10;
            this.f7621b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f7621b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f7622c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f7620a;
        }
    }

    public c1(Handler handler, com.applovin.impl.sdk.l lVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f7617b = handler;
        this.f7616a = lVar.Q();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f7618c);
        if (com.applovin.impl.sdk.p.a()) {
            this.f7616a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f7619d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7616a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7616a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f7619d.incrementAndGet();
        this.f7617b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f7616a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f7618c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f7617b != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    defpackage.e.A("Adding countdown: ", str, this.f7616a, "CountdownManager");
                }
                this.f7618c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f7619d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7616a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f7616a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.C(new StringBuilder("Ending countdown for "), cVar.c(), this.f7616a, "CountdownManager");
        }
    }

    private void a(c cVar, int i10) {
        this.f7617b.postDelayed(new v8(i10, 0, this, cVar), cVar.b());
    }
}
