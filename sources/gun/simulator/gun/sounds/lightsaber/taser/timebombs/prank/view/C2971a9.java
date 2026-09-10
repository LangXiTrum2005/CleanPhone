package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2971a9 implements InterfaceC3757j6 {
    final /* synthetic */ AbstractC3325e9 this$0;

    public C2971a9(AbstractC3325e9 abstractC3325e9) {
        this.this$0 = abstractC3325e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onError$lambda-0, reason: not valid java name */
    public static final void m230onError$lambda0(AbstractC3325e9 abstractC3325e9, C2474Hp c2474Hp, C3319e6 c3319e6) {
        AbstractC2995aW.q(abstractC3325e9, "this$0");
        AbstractC2995aW.q(c2474Hp, "$downloadRequest");
        abstractC3325e9.fullyDownloaded.set(false);
        if (c2474Hp.getAsset().isRequired()) {
            abstractC3325e9.requiredAssetDownloaded.set(false);
        }
        StringBuilder sb = new StringBuilder("Failed to download assets. required=");
        sb.append(c2474Hp.getAsset().isRequired());
        sb.append(" reason=");
        sb.append(c3319e6 != null ? Integer.valueOf(c3319e6.getReason()) : null);
        sb.append(" cause=");
        sb.append(c3319e6 != null ? c3319e6.getCause() : null);
        String string = sb.toString();
        if (c2474Hp.getAsset().isRequired() && abstractC3325e9.downloadRequiredCount.decrementAndGet() <= 0) {
            abstractC3325e9.onAdLoadFailed(new C2965a6(EnumC4719u30.ASSET_RESPONSE_DATA_ERROR, string).setLogEntry$vungle_ads_release(abstractC3325e9.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            abstractC3325e9.cancel();
        } else if (abstractC3325e9.downloadCount.decrementAndGet() <= 0) {
            abstractC3325e9.onAdLoadFailed(new C2965a6(EnumC4719u30.ASSET_RESPONSE_DATA_ERROR, string).setLogEntry$vungle_ads_release(abstractC3325e9.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSuccess$lambda-1, reason: not valid java name */
    public static final void m231onSuccess$lambda1(File file, C2971a9 c2971a9, C2474Hp c2474Hp, AbstractC3325e9 abstractC3325e9) {
        AbstractC2995aW.q(file, "$file");
        AbstractC2995aW.q(c2971a9, "this$0");
        AbstractC2995aW.q(c2474Hp, "$downloadRequest");
        AbstractC2995aW.q(abstractC3325e9, "this$1");
        if (!file.exists()) {
            c2971a9.onError(new C3319e6(-1, new IOException("Downloaded file not found!"), InterfaceC3231d6.Companion.getFILE_NOT_FOUND_ERROR()), c2474Hp);
            return;
        }
        C2955a1 asset = c2474Hp.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(Z0.DOWNLOAD_SUCCESS);
        if (c2474Hp.isTemplate()) {
            c2474Hp.stopRecord();
            C3586h70 c3586h70 = c2474Hp.isHtmlTemplate() ? abstractC3325e9.templateHtmlSizeMetric : abstractC3325e9.templateSizeMetric;
            c3586h70.setValue(Long.valueOf(file.length()));
            C2961a4.INSTANCE.logMetric$vungle_ads_release(c3586h70, abstractC3325e9.getLogEntry$vungle_ads_release(), asset.getServerPath());
        } else if (c2474Hp.isMainVideo()) {
            abstractC3325e9.mainVideoSizeMetric.setValue(Long.valueOf(file.length()));
            C2961a4.INSTANCE.logMetric$vungle_ads_release(abstractC3325e9.mainVideoSizeMetric, abstractC3325e9.getLogEntry$vungle_ads_release(), asset.getServerPath());
        }
        C4980x2 advertisement$vungle_ads_release = abstractC3325e9.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release != null) {
            advertisement$vungle_ads_release.updateAdAssetPath(asset);
        }
        if (c2474Hp.isTemplate() && !abstractC3325e9.processVmTemplate(asset, abstractC3325e9.getAdvertisement$vungle_ads_release())) {
            abstractC3325e9.fullyDownloaded.set(false);
            if (asset.isRequired()) {
                abstractC3325e9.requiredAssetDownloaded.set(false);
            }
        }
        if (asset.isRequired() && abstractC3325e9.downloadRequiredCount.decrementAndGet() <= 0) {
            if (!abstractC3325e9.requiredAssetDownloaded.get()) {
                abstractC3325e9.onAdLoadFailed(new C2965a6(EnumC4719u30.ASSET_RESPONSE_DATA_ERROR, "Failed to download required assets.").setLogEntry$vungle_ads_release(abstractC3325e9.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                abstractC3325e9.cancel();
                return;
            }
            abstractC3325e9.onRequiredDownloadCompleted();
        }
        if (abstractC3325e9.downloadCount.decrementAndGet() <= 0) {
            if (abstractC3325e9.fullyDownloaded.get()) {
                abstractC3325e9.onDownloadCompleted(abstractC3325e9.getAdRequest());
            } else {
                abstractC3325e9.onAdLoadFailed(new C2965a6(EnumC4719u30.ASSET_RESPONSE_DATA_ERROR, "Failed to download assets.").setLogEntry$vungle_ads_release(abstractC3325e9.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3757j6
    public void onError(C3319e6 c3319e6, C2474Hp c2474Hp) {
        AbstractC2995aW.q(c2474Hp, "downloadRequest");
        C4829vJ c4829vJ = C4917wJ.Companion;
        StringBuilder sb = new StringBuilder("onError called: reason ");
        sb.append(c3319e6 != null ? Integer.valueOf(c3319e6.getReason()) : null);
        sb.append("; cause ");
        sb.append(c3319e6 != null ? c3319e6.getCause() : null);
        c4829vJ.e("BaseAdLoader", sb.toString());
        ((C4893w20) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC4746uO(this.this$0, c2474Hp, c3319e6, 16));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3757j6
    public void onSuccess(File file, C2474Hp c2474Hp) {
        AbstractC2995aW.q(file, "file");
        AbstractC2995aW.q(c2474Hp, "downloadRequest");
        ((C4893w20) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC5099yP(file, this, c2474Hp, this.this$0, 4));
    }
}
