package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class UP implements InterfaceC3757j6 {
    final /* synthetic */ C4980x2 $advertisement;
    final /* synthetic */ C4689tj0 $executor;
    final /* synthetic */ File $jsPath;
    final /* synthetic */ File $mraidJsFile;

    public UP(C4689tj0 c4689tj0, C4980x2 c4980x2, File file, File file2) {
        this.$executor = c4689tj0;
        this.$advertisement = c4980x2;
        this.$jsPath = file;
        this.$mraidJsFile = file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError$lambda-0, reason: not valid java name */
    public static final void m213onError$lambda0(C3319e6 c3319e6, C2474Hp c2474Hp, C4980x2 c4980x2, File file) {
        Throwable cause;
        AbstractC2995aW.q(c2474Hp, "$downloadRequest");
        AbstractC2995aW.q(file, "$jsPath");
        try {
            try {
                StringBuilder sb = new StringBuilder("download mraid js error: ");
                sb.append(c3319e6 != null ? Integer.valueOf(c3319e6.getServerCode()) : null);
                sb.append(". Failed to load ");
                sb.append(c2474Hp.getAsset().getServerPath());
                sb.append(", reason: ");
                sb.append((c3319e6 == null || (cause = c3319e6.getCause()) == null) ? null : cause.getMessage());
                String string = sb.toString();
                C4917wJ.Companion.d("MraidJsLoader", string);
                new RP(EnumC4719u30.MRAID_DOWNLOAD_JS_ERROR, string).setLogEntry$vungle_ads_release(c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : null).logErrorNoReturnValue$vungle_ads_release();
                C3300du.deleteContents(file);
            } catch (Exception e) {
                C4917wJ.Companion.e("MraidJsLoader", "Failed to delete js assets", e);
            }
        } finally {
            VP.INSTANCE.notifyListeners(12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSuccess$lambda-1, reason: not valid java name */
    public static final void m214onSuccess$lambda1(File file, File file2, C4980x2 c4980x2, File file3) {
        AbstractC2995aW.q(file, "$file");
        AbstractC2995aW.q(file2, "$mraidJsFile");
        AbstractC2995aW.q(file3, "$jsPath");
        try {
            if (file.exists() && file.length() > 0) {
                VP.INSTANCE.notifyListeners(10);
                return;
            }
            new RP(EnumC4719u30.MRAID_JS_WRITE_FAILED, "Mraid js downloaded but write failure: " + file2.getAbsolutePath()).setLogEntry$vungle_ads_release(c4980x2 != null ? c4980x2.getLogEntry$vungle_ads_release() : null).logErrorNoReturnValue$vungle_ads_release();
            C3300du.deleteContents(file3);
            VP.INSTANCE.notifyListeners(12);
        } catch (Exception e) {
            C4917wJ.Companion.e("MraidJsLoader", "Failed to delete js assets", e);
            VP.INSTANCE.notifyListeners(12);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3757j6
    public void onError(C3319e6 c3319e6, C2474Hp c2474Hp) {
        AbstractC2995aW.q(c2474Hp, "downloadRequest");
        this.$executor.execute(new RunnableC5099yP(c3319e6, c2474Hp, this.$advertisement, this.$jsPath, 6));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3757j6
    public void onSuccess(File file, C2474Hp c2474Hp) {
        AbstractC2995aW.q(file, "file");
        AbstractC2995aW.q(c2474Hp, "downloadRequest");
        this.$executor.execute(new RunnableC5099yP(file, this.$mraidJsFile, this.$advertisement, this.$jsPath, 5));
    }
}
