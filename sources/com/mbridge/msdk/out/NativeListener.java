package com.mbridge.msdk.out;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeListener {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface FilpListener {
        void filpEvent(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i10);

        void onLoggingImpression(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i10);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Template {
        private int adNum;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f35109id;

        public Template(int i10, int i11) {
            this.f35109id = i10;
            this.adNum = i11;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.f35109id;
        }

        public void setAdNum(int i10) {
            this.adNum = i10;
        }

        public void setId(int i10) {
            this.f35109id = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
