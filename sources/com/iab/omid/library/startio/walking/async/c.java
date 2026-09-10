package com.iab.omid.library.startio.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f22311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f22312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f22313c = new ArrayDeque<>();
    private b d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22311a = linkedBlockingQueue;
        this.f22312b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f22313c.poll();
        this.d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f22312b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f22313c.add(bVar);
        if (this.d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.startio.walking.async.b.a
    public void a(b bVar) {
        this.d = null;
        a();
    }
}
