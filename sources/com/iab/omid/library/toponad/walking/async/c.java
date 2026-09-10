package com.iab.omid.library.toponad.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f22411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f22412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f22413c = new ArrayDeque<>();
    private b d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22411a = linkedBlockingQueue;
        this.f22412b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f22413c.poll();
        this.d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f22412b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f22413c.add(bVar);
        if (this.d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.a
    public void a(b bVar) {
        this.d = null;
        a();
    }
}
