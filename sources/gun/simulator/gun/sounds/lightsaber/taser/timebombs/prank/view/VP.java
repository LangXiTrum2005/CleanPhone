package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class VP {
    public static final int MRAID_AVAILABLE = 13;
    public static final int MRAID_DOWNLOADED = 10;
    public static final int MRAID_DOWNLOAD_FAILED = 12;
    public static final int MRAID_INVALID_ENDPOINT = 11;
    private static final String TAG = "MraidJsLoader";
    public static final VP INSTANCE = new VP();
    private static final AtomicBoolean isDownloading = new AtomicBoolean(false);
    private static final CopyOnWriteArrayList<TP> listeners = new CopyOnWriteArrayList<>();

    private VP() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadJs$lambda-1, reason: not valid java name */
    public static final void m215downloadJs$lambda1(TP tp, C4980x2 c4980x2, ZT zt, InterfaceC2526Jp interfaceC2526Jp, C4689tj0 c4689tj0) {
        AbstractC2995aW.q(zt, "$pathProvider");
        AbstractC2995aW.q(interfaceC2526Jp, "$downloader");
        AbstractC2995aW.q(c4689tj0, "$executor");
        if (tp != null) {
            try {
                listeners.add(tp);
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Failed to download mraid js", e);
                return;
            }
        }
        if (isDownloading.getAndSet(true)) {
            C4917wJ.Companion.w(TAG, "mraid js is downloading, waiting for the previous request.");
            return;
        }
        C3457fi c3457fi = C3457fi.INSTANCE;
        String mraidEndpoint = c3457fi.getMraidEndpoint();
        if (mraidEndpoint != null && mraidEndpoint.length() != 0) {
            File file = new File(zt.getJsAssetDir(c3457fi.getMraidJsVersion()), C2390Ej.MRAID_JS_FILE_NAME);
            if (file.exists()) {
                C4917wJ.Companion.w(TAG, "mraid js already downloaded");
                INSTANCE.notifyListeners(13);
                return;
            }
            File jsDir = zt.getJsDir();
            C3300du.deleteContents(jsDir);
            String str = mraidEndpoint + "/mraid.min.js";
            String absolutePath = file.getAbsolutePath();
            AbstractC2995aW.p(absolutePath, "mraidJsFile.absolutePath");
            ((C4197o6) interfaceC2526Jp).download(new C2474Hp(EnumC2448Gp.HIGH, new C2955a1(C2390Ej.MRAID_JS_FILE_NAME, str, absolutePath, Y0.ASSET, true), c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : null), new UP(c4689tj0, c4980x2, jsDir, file));
            return;
        }
        new RP(EnumC4719u30.MRAID_DOWNLOAD_JS_ERROR, "Mraid endpoint is empty").setLogEntry$vungle_ads_release(c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : null).logErrorNoReturnValue$vungle_ads_release();
        INSTANCE.notifyListeners(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListeners(int i) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((C3148c9) ((TP) it.next())).onDownloadResult(i);
        }
        listeners.clear();
        isDownloading.set(false);
    }

    public final void downloadJs(ZT zt, InterfaceC2526Jp interfaceC2526Jp, C4689tj0 c4689tj0, TP tp, C4980x2 c4980x2) {
        AbstractC2995aW.q(zt, "pathProvider");
        AbstractC2995aW.q(interfaceC2526Jp, "downloader");
        AbstractC2995aW.q(c4689tj0, "executor");
        c4689tj0.execute(new SP(tp, c4980x2, zt, interfaceC2526Jp, c4689tj0, 0));
    }
}
