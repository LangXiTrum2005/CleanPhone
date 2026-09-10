package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4363q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3203cn0 f4863a;

    public C4363q1(C3203cn0 c3203cn0) {
        this.f4863a = c3203cn0;
    }

    public static C4363q1 a(N2 n2) {
        C3203cn0 c3203cn0 = (C3203cn0) n2;
        AbstractC2995aW.d(n2, "AdSession is null");
        if (c3203cn0.e.c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        AbstractC2995aW.l(c3203cn0);
        C4363q1 c4363q1 = new C4363q1(c3203cn0);
        c3203cn0.e.c = c4363q1;
        return c4363q1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            r0 = 1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cn0 r1 = r7.f4863a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.l(r1)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60 r2 = r1.b
            int r3 = r2.f4006a
            java.lang.Object r2 = r2.c
            switch(r3) {
                case 2: goto L16;
                default: goto Lf;
            }
        Lf:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2
            if (r3 != r2) goto L56
            goto L1c
        L16:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2
            if (r3 != r2) goto L56
        L1c:
            boolean r2 = r1.f
            if (r2 == 0) goto L25
            boolean r2 = r1.g
            if (r2 != 0) goto L25
            goto L2a
        L25:
            r1.f()     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
        L2a:
            boolean r2 = r1.f
            if (r2 == 0) goto L55
            boolean r2 = r1.g
            if (r2 != 0) goto L55
            boolean r2 = r1.i
            if (r2 != 0) goto L4d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2 r2 = r1.e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD.b
            android.webkit.WebView r4 = r2.f()
            java.lang.String r2 = r2.f3906a
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r6 = 0
            r5[r6] = r2
            java.lang.String r2 = "publishImpressionEvent"
            r3.a(r4, r2, r5)
            r1.i = r0
            goto L55
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impression event can only be sent once"
            r0.<init>(r1)
            throw r0
        L55:
            return
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impression event is not expected from the Native AdSession"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1.j != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r1.e;
        gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD.b.a(r2.f(), "publishLoadedEvent", null, r2.f3906a);
        r1.j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        throw new java.lang.IllegalStateException("Loaded event can only be sent once");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r8 = this;
            r0 = 1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cn0 r1 = r8.f4863a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.c(r1)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60 r2 = r1.b
            int r3 = r2.f4006a
            java.lang.Object r2 = r2.c
            switch(r3) {
                case 2: goto L16;
                default: goto Lf;
            }
        Lf:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2
            if (r3 != r2) goto L43
            goto L1c
        L16:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2
            if (r3 != r2) goto L43
        L1c:
            boolean r2 = r1.j
            if (r2 != 0) goto L3b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2 r2 = r1.e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD.b
            android.webkit.WebView r4 = r2.f()
            java.lang.String r2 = r2.f3906a
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r7 = 0
            r5[r7] = r6
            r5[r0] = r2
            java.lang.String r2 = "publishLoadedEvent"
            r3.a(r4, r2, r5)
            r1.j = r0
            return
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Loaded event can only be sent once"
            r0.<init>(r1)
            throw r0
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impression event is not expected from the Native AdSession"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1.c():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r2.put("skippable", r8.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r8.b == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r2.put("skipOffset", (java.lang.Float) r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r2.put("autoPlay", r8.c);
        r2.put("position", (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4314pV) r8.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = new org.json.JSONObject();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bj0 r8) {
        /*
            r7 = this;
            r0 = 1
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cn0 r1 = r7.f4863a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.c(r1)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60 r2 = r1.b
            int r3 = r2.f4006a
            java.lang.Object r2 = r2.c
            switch(r3) {
                case 2: goto L16;
                default: goto Lf;
            }
        Lf:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2
            if (r3 != r2) goto L6e
            goto L1c
        L16:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2
            if (r3 != r2) goto L6e
        L1c:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "skippable"
            boolean r4 = r8.b     // Catch: org.json.JSONException -> L36
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L36
            boolean r3 = r8.b     // Catch: org.json.JSONException -> L36
            if (r3 == 0) goto L38
            java.lang.String r3 = "skipOffset"
            java.lang.Object r4 = r8.d     // Catch: org.json.JSONException -> L36
            java.lang.Float r4 = (java.lang.Float) r4     // Catch: org.json.JSONException -> L36
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L36
            goto L38
        L36:
            goto L48
        L38:
            java.lang.String r3 = "autoPlay"
            boolean r4 = r8.c     // Catch: org.json.JSONException -> L36
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L36
            java.lang.String r3 = "position"
            java.lang.Object r8 = r8.e     // Catch: org.json.JSONException -> L36
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pV r8 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4314pV) r8     // Catch: org.json.JSONException -> L36
            r2.put(r3, r8)     // Catch: org.json.JSONException -> L36
        L48:
            boolean r8 = r1.j
            if (r8 != 0) goto L66
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W2 r8 = r1.e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CD.b
            android.webkit.WebView r4 = r8.f()
            java.lang.String r8 = r8.f3906a
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r2
            r5[r0] = r8
            java.lang.String r8 = "publishLoadedEvent"
            r3.a(r4, r8, r5)
            r1.j = r0
            return
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Loaded event can only be sent once"
            r8.<init>(r0)
            throw r8
        L6e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Impression event is not expected from the Native AdSession"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1.d(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bj0):void");
    }
}
