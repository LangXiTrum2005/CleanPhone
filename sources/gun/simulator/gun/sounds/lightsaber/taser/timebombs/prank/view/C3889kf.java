package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator$Companion;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3889kf implements InterfaceC5088yE {
    private static final String AD_ID_KEY = "AD_ID_KEY";
    public static final Cif Companion = new Cif(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final ZT pathProvider;

    public C3889kf(Context context, ZT zt) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(zt, "pathProvider");
        this.context = context;
        this.pathProvider = zt;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.f4736a, new C3801jf(this.context));
        int i = m249checkIfSdkUpgraded$lambda3(interfaceC3069bHH).getInt("VERSION_CODE", -1);
        if (i < 70403) {
            if (i < 70000) {
                dropV6Data();
            }
            if (i < 70100) {
                dropV700Data();
            }
            if (i < 70301) {
                dropV730TempData();
            }
            if (i < 70403) {
                dropV742TpatData();
            }
            m249checkIfSdkUpgraded$lambda3(interfaceC3069bHH).put("VERSION_CODE", 70403).apply();
        }
    }

    /* JADX INFO: renamed from: checkIfSdkUpgraded$lambda-3, reason: not valid java name */
    private static final C2919Yt m249checkIfSdkUpgraded$lambda3(InterfaceC3069bH interfaceC3069bH) {
        return (C2919Yt) interfaceC3069bH.getValue();
    }

    private final void dropV6Data() {
        C4917wJ.Companion.d(TAG, "CleanupJob: drop old files data");
        int i = Build.VERSION.SDK_INT;
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            C3300du.delete(file);
            C3300du.delete(new File(file.getPath() + "-journal"));
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("com.vungle.sdk", 0);
        String string = sharedPreferences.getString("cache_path", null);
        if (i >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            sharedPreferences.edit().clear().apply();
        }
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        AbstractC2995aW.p(noBackupFilesDir, "{\n            context.noBackupFilesDir\n        }");
        C3300du.delete(new File(noBackupFilesDir, "vungle_settings"));
        if (string != null) {
            C3300du.delete(new File(string));
        }
    }

    private final void dropV700Data() {
        C3300du.delete(new File(this.context.getApplicationInfo().dataDir, "vungle"));
    }

    private final void dropV730TempData() {
        try {
            C3300du.delete(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"));
            C3300du.delete(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"));
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Failed to delete temp data", e);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            C3300du.delete(new File(noBackupFilesDir, C2919Yt.TPAT_FAILED_FILENAME));
            C3300du.delete(new File(noBackupFilesDir, C2919Yt.GENERIC_TPAT_FAILED_FILENAME));
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Failed to delete 742 tpat data", e);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final ZT getPathProvider() {
        return this.pathProvider;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5088yE
    public int onRunJob(Bundle bundle, JE je) {
        File downloadsDirForAd;
        AbstractC2995aW.q(bundle, "bundle");
        AbstractC2995aW.q(je, "jobRunner");
        File downloadDir = this.pathProvider.getDownloadDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = downloadDir;
        }
        C4917wJ.Companion.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!AbstractC2995aW.i(downloadsDirForAd, downloadDir)) {
                C3300du.delete(downloadsDirForAd);
                return 0;
            }
            checkIfSdkUpgraded();
            C3300du.deleteContents(downloadsDirForAd);
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }
}
