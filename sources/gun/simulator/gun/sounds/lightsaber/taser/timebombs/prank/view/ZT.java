package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.StatFs;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class ZT {
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    public static final YT Companion = new YT(null);
    private static final String DOWNLOADS_FOLDER = "downloads";
    private static final String JS_FOLDER = "js";
    private static final long UNKNOWN_SIZE = -1;
    private static final String VUNGLE_FOLDER = "vungle_cache";
    private final File cleverCacheDir;
    private final Context context;
    private final File downloadsDir;
    private final File jsDir;
    private final File vungleDir;

    public ZT(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
        File file = new File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        File file2 = new File(file, DOWNLOADS_FOLDER);
        this.downloadsDir = file2;
        File file3 = new File(file, JS_FOLDER);
        this.jsDir = file3;
        File file4 = new File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file4;
        for (File file5 : AbstractC2340Cl.K(file, file2, file3, file4)) {
            if (!file5.exists()) {
                file5.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(String str) {
        AbstractC2995aW.q(str, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        try {
            return new StatFs(str).getAvailableBytes();
        } catch (IllegalArgumentException e) {
            C4917wJ.Companion.w("PathProvider", "Failed to get available bytes " + e.getMessage());
            return -1L;
        }
    }

    public final File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    public final Context getContext() {
        return this.context;
    }

    public final File getDownloadDir() {
        if (!this.downloadsDir.exists()) {
            this.downloadsDir.mkdirs();
        }
        return this.downloadsDir;
    }

    public final File getDownloadsDirForAd(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        File downloadDir = getDownloadDir();
        StringBuilder sb = new StringBuilder();
        sb.append(downloadDir.getPath());
        File file = new File(DM.m(sb, File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsAssetDir(String str) {
        AbstractC2995aW.q(str, "jsVersion");
        File file = new File(getJsDir(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getJsDir() {
        if (!this.jsDir.exists()) {
            this.jsDir.mkdirs();
        }
        return this.jsDir;
    }

    public final File getSharedPrefsDir() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        AbstractC2995aW.p(noBackupFilesDir, "{\n        context.noBackupFilesDir\n    }");
        return noBackupFilesDir;
    }

    public final File getUnclosedAdFile(String str) {
        AbstractC2995aW.q(str, "name");
        return new File(getSharedPrefsDir(), str);
    }

    public final File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}
