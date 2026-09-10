package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class B40 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2853a = 1;
    public Runnable b;
    public final /* synthetic */ C40 c;

    public /* synthetic */ B40(C40 c40, int i) {
        this(c40);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r1 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r10.b.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.b, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40 r2 = r10.c     // Catch: java.lang.Throwable -> L54
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L54
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54
            r3 = 1
            if (r0 != 0) goto L28
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40 r0 = r10.c     // Catch: java.lang.Throwable -> L1c
            int r4 = r0.c     // Catch: java.lang.Throwable -> L1c
            r5 = 4
            if (r4 != r5) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            r0 = move-exception
            goto L77
        L1e:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L1c
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L1c
            r0.c = r5     // Catch: java.lang.Throwable -> L1c
            r0 = 1
        L28:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40 r4 = r10.c     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L1c
            r10.b = r4     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L45
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40 r0 = r10.c     // Catch: java.lang.Throwable -> L1c
            r0.c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L44
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L54
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.b     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
            r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
        L51:
            r10.b = r2     // Catch: java.lang.Throwable -> L54
            goto L2
        L54:
            r0 = move-exception
            goto L79
        L56:
            r0 = move-exception
            goto L74
        L58:
            r3 = move-exception
            java.util.logging.Logger r4 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40.f     // Catch: java.lang.Throwable -> L56
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r6.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.Runnable r7 = r10.b     // Catch: java.lang.Throwable -> L56
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            goto L51
        L74:
            r10.b = r2     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L54
        L79:
            if (r1 == 0) goto L82
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B40.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2853a) {
            case 0:
                this.b.run();
                return;
            default:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (this.c.b) {
                        this.c.c = 1;
                        throw e;
                    }
                }
        }
    }

    public final String toString() {
        switch (this.f2853a) {
            case 0:
                return this.b.toString();
            default:
                Runnable runnable = this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + AbstractC3950lJ.F(this.c.c) + "}";
        }
    }

    public B40(C40 c40, Runnable runnable) {
        this.c = c40;
        this.b = runnable;
    }

    public B40(C40 c40) {
        this.c = c40;
    }
}
