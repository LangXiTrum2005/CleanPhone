package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3148c9 implements TP {
    final /* synthetic */ AbstractC3325e9 this$0;

    public C3148c9(AbstractC3325e9 abstractC3325e9) {
        this.this$0 = abstractC3325e9;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TP
    public void onDownloadResult(int i) {
        if (i == 10 || i == 13) {
            if (i == 10) {
                C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, B30.MRAID_DOWNLOAD_JS_RETRY_SUCCESS, 0L, this.this$0.getLogEntry$vungle_ads_release(), null, 10, null);
            }
            this.this$0.downloadAssets();
        } else {
            R1 r1 = this.this$0.adLoaderCallback;
            if (r1 != null) {
                r1.onFailure(new RP(EnumC4719u30.MRAID_DOWNLOAD_JS_ERROR, "Failed to download mraid.js."));
            }
        }
    }
}
