package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f37831i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f37832h = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37834b;

        public a(Object obj, String str) {
            this.f37833a = obj;
            this.f37834b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f37833a, this.f37834b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37837b;

        public b(Object obj, String str) {
            this.f37836a = obj;
            this.f37837b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f37836a, this.f37837b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37840b;

        public c(Object obj, String str) {
            this.f37839a = obj;
            this.f37840b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f37839a, this.f37840b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37843b;

        public d(Object obj, String str) {
            this.f37842a = obj;
            this.f37843b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f37842a, this.f37843b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37846b;

        public e(Object obj, String str) {
            this.f37845a = obj;
            this.f37846b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f37845a, this.f37846b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37849b;

        public f(Object obj, String str) {
            this.f37848a = obj;
            this.f37849b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f37848a, this.f37849b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37852b;

        public g(Object obj, String str) {
            this.f37851a = obj;
            this.f37852b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f37851a, this.f37852b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37855b;

        public h(Object obj, String str) {
            this.f37854a = obj;
            this.f37855b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f37854a, this.f37855b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (v0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f37832h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (v0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f37832h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (v0.h()) {
            super.install(obj, str);
        } else {
            this.f37832h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f37832h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (v0.h()) {
            super.openURL(obj, str);
        } else {
            this.f37832h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (v0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.f37832h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f37832h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f37832h.post(new e(obj, str));
        }
    }
}
