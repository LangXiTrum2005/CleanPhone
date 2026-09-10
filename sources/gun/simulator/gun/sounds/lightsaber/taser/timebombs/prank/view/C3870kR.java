package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import android.util.Base64;
import java.net.URL;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3870kR {
    private C4275p1 adEvents;
    private M2 adSession;
    private final VE json;

    public C3870kR(String str) {
        C5190zS c5190zS;
        AbstractC2995aW.q(str, "omSdkData");
        C4913wF c4913wFB = WD.b(C3782jR.INSTANCE);
        this.json = c4913wFB;
        try {
            Y60 y60A = Y60.a(EnumC5130yk.NATIVE_DISPLAY, SC.BEGIN_TO_RENDER, EnumC3434fT.NATIVE, EnumC3434fT.NONE);
            if (TextUtils.isEmpty("Vungle")) {
                throw new IllegalArgumentException("Name is null or empty");
            }
            if (TextUtils.isEmpty("7.4.3")) {
                throw new IllegalArgumentException("Version is null or empty");
            }
            Ig0 ig0 = new Ig0("Vungle", "7.4.3", 3);
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null) {
                c5190zS = (C5190zS) c4913wFB.a(AbstractC3375el.V(c4913wFB.b, AbstractC3263dY.d(C5190zS.class)), new String(bArrDecode, AbstractC2307Be.f2881a));
            } else {
                c5190zS = null;
            }
            String vendorKey = c5190zS != null ? c5190zS.getVendorKey() : null;
            URL url = new URL(c5190zS != null ? c5190zS.getVendorURL() : null);
            String params = c5190zS != null ? c5190zS.getParams() : null;
            if (TextUtils.isEmpty(vendorKey)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(params)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            List listJ = AbstractC2340Cl.J(new C3632hh0(vendorKey, url, params));
            String oM_JS$vungle_ads_release = C2998aZ.INSTANCE.getOM_JS$vungle_ads_release();
            AbstractC3375el.e(oM_JS$vungle_ads_release, "OM SDK JS script content is null");
            this.adSession = M2.a(y60A, new TN(ig0, null, oM_JS$vungle_ads_release, listJ, R2.NATIVE));
        } catch (Exception e) {
            C4917wJ.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void impressionOccurred() {
        /*
            r4 = this;
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p1 r0 = r4.adEvents
            if (r0 == 0) goto L59
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jm0 r0 = r0.f4817a
            boolean r1 = r0.g
            if (r1 != 0) goto L51
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60 r2 = r0.b
            int r3 = r2.f4006a
            java.lang.Object r2 = r2.c
            switch(r3) {
                case 2: goto L1a;
                default: goto L13;
            }
        L13:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r2
            if (r3 != r2) goto L49
            goto L20
        L1a:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r3 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r2 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r2
            if (r3 != r2) goto L49
        L20:
            boolean r2 = r0.f
            if (r2 == 0) goto L27
            if (r1 != 0) goto L27
            goto L2c
        L27:
            r0.d()     // Catch: java.lang.Exception -> L2b
            goto L2c
        L2b:
        L2c:
            boolean r1 = r0.f
            if (r1 == 0) goto L59
            boolean r1 = r0.g
            if (r1 != 0) goto L59
            boolean r1 = r0.i
            if (r1 != 0) goto L41
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2 r1 = r0.e
            r1.p()
            r1 = 1
            r0.i = r1
            goto L59
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impression event can only be sent once"
            r0.<init>(r1)
            throw r0
        L49:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impression event is not expected from the Native AdSession"
            r0.<init>(r1)
            throw r0
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AdSession is finished"
            r0.<init>(r1)
            throw r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3870kR.impressionOccurred():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE == ((gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        throw new java.lang.IllegalStateException("Impression event is not expected from the Native AdSession");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void start(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.q(r5, r0)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xn0 r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl.e
            boolean r0 = r0.b()
            if (r0 == 0) goto L8c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.M2 r0 = r4.adSession
            if (r0 == 0) goto L8c
            r0.c(r5)
            r0.d()
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jm0 r0 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jm0) r0
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2 r5 = r0.e
            java.lang.Object r1 = r5.e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p1 r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4275p1) r1
            if (r1 != 0) goto L84
            boolean r1 = r0.g
            java.lang.String r2 = "AdSession is finished"
            if (r1 != 0) goto L7e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p1 r3 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p1
            r3.<init>(r0)
            r5.e = r3
            r4.adEvents = r3
            boolean r3 = r0.f
            if (r3 == 0) goto L76
            if (r1 != 0) goto L70
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60 r1 = r0.b
            int r2 = r1.f4006a
            java.lang.Object r1 = r1.c
            switch(r2) {
                case 2: goto L46;
                default: goto L3f;
            }
        L3f:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fT r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3434fT) r1
            if (r2 != r1) goto L68
            goto L4c
        L46:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r2 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT.NATIVE
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gT r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT) r1
            if (r2 != r1) goto L68
        L4c:
            boolean r1 = r0.j
            if (r1 != 0) goto L60
            int r1 = r5.f3855a
            switch(r1) {
                case 0: goto L59;
                default: goto L55;
            }
        L55:
            r5.j()
            goto L5c
        L59:
            r5.j()
        L5c:
            r5 = 1
            r0.j = r5
            goto L8c
        L60:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Loaded event can only be sent once"
            r5.<init>(r0)
            throw r5
        L68:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Impression event is not expected from the Native AdSession"
            r5.<init>(r0)
            throw r5
        L70:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r2)
            throw r5
        L76:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "AdSession is not started"
            r5.<init>(r0)
            throw r5
        L7e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r2)
            throw r5
        L84:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "AdEvents already exists for AdSession"
            r5.<init>(r0)
            throw r5
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3870kR.start(android.view.View):void");
    }

    public final void stop() {
        M2 m2 = this.adSession;
        if (m2 != null) {
            m2.b();
        }
        this.adSession = null;
    }
}
