package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4197o6 implements InterfaceC2526Jp {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final C3845k6 Companion = new C3845k6(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final String TAG = "AssetDownloader";
    private final C4689tj0 downloadExecutor;
    private final InterfaceC3069bH okHttpClient$delegate;
    private final ZT pathProvider;
    private final List<C2474Hp> transitioning;

    public C4197o6(C4689tj0 c4689tj0, ZT zt) {
        AbstractC2995aW.q(c4689tj0, "downloadExecutor");
        AbstractC2995aW.q(zt, "pathProvider");
        this.downloadExecutor = c4689tj0;
        this.pathProvider = zt;
        this.okHttpClient$delegate = AbstractC2340Cl.I(new C4109n6(this));
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(C2474Hp c2474Hp) {
        ZT zt = this.pathProvider;
        String absolutePath = zt.getVungleDir().getAbsolutePath();
        AbstractC2995aW.p(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = zt.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new JR(AbstractC5044xl.h("Insufficient space ", availableBytes)).setLogEntry$vungle_ads_release(c2474Hp.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final CZ decodeGzipIfNeeded(C5021xZ c5021xZ) {
        CZ cz = c5021xZ.g;
        if (!AbstractC3089ba0.o0("gzip", C5021xZ.i(c5021xZ, "Content-Encoding")) || cz == null) {
            return cz;
        }
        return new AZ(C5021xZ.i(c5021xZ, "Content-Type"), -1L, AbstractC4496rb.f(new C2716Qy(cz.source())));
    }

    private final void deliverError(C2474Hp c2474Hp, InterfaceC3757j6 interfaceC3757j6, C3319e6 c3319e6) {
        if (interfaceC3757j6 != null) {
            interfaceC3757j6.onError(c3319e6, c2474Hp);
        }
    }

    private final void deliverSuccess(File file, C2474Hp c2474Hp, InterfaceC3757j6 interfaceC3757j6) {
        C4917wJ.Companion.d(TAG, "On success " + c2474Hp);
        if (interfaceC3757j6 != null) {
            interfaceC3757j6.onSuccess(file, c2474Hp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m260download$lambda0(C4197o6 c4197o6, C2474Hp c2474Hp, InterfaceC3757j6 interfaceC3757j6) {
        AbstractC2995aW.q(c4197o6, "this$0");
        c4197o6.deliverError(c2474Hp, interfaceC3757j6, new C3319e6(-1, new C3258dT("Cannot complete " + c2474Hp + " : Out of Memory"), InterfaceC3231d6.Companion.getINTERNAL_ERROR()));
    }

    private final C4838vS getOkHttpClient() {
        return (C4838vS) this.okHttpClient$delegate.getValue();
    }

    private final boolean isValidUrl(String str) {
        if (str != null && str.length() != 0) {
            char[] cArr = ZA.k;
            if (C3336eJ.r(str) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14771. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void launchRequest(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2474Hp r27, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3757j6 r28) {
        /*
            Method dump skipped, instruction units count: 1477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4197o6.launchRequest(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hp, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j6):void");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2526Jp
    public void cancel(C2474Hp c2474Hp) {
        if (c2474Hp == null || c2474Hp.isCancelled()) {
            return;
        }
        c2474Hp.cancel();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2526Jp
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((C2474Hp) it.next());
        }
        this.transitioning.clear();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2526Jp
    public void download(C2474Hp c2474Hp, InterfaceC3757j6 interfaceC3757j6) {
        if (c2474Hp == null) {
            return;
        }
        this.transitioning.add(c2474Hp);
        this.downloadExecutor.execute(new C4021m6(this, c2474Hp, interfaceC3757j6), new RunnableC4746uO(this, c2474Hp, interfaceC3757j6, 15));
    }
}
