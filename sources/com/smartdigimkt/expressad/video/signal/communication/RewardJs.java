package com.smartdigimkt.expressad.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class RewardJs extends BaseRewardJs implements IRewardBridge {
    private Handler o = new Handler(Looper.getMainLooper());

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void cai(final Object obj, final String str) {
        if (v.b()) {
            super.cai(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.9
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.cai(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void feedbackLayoutOperate(Object obj, String str) {
        super.feedbackLayoutOperate(obj, str);
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void feedbackOperate(Object obj, String str) {
        super.feedbackOperate(obj, str);
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void feedbackPopupOperate(Object obj, String str) {
        super.feedbackPopupOperate(obj, str);
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void getEndScreenInfo(final Object obj, final String str) {
        if (v.b()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.1
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void gial(final Object obj, final String str) {
        if (v.b()) {
            super.gial(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.10
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.gial(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void handlerPlayableException(final Object obj, final String str) {
        if (v.b()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.7
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.handlerPlayableException(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void install(final Object obj, final String str) {
        if (v.b()) {
            super.install(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.2
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.install(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void notifyCloseBtn(final Object obj, final String str) {
        if (v.b()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.3
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.notifyCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void openURL(final Object obj, final String str) {
        if (v.b()) {
            super.openURL(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.8
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.openURL(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void setOrientation(final Object obj, final String str) {
        if (v.b()) {
            super.setOrientation(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.6
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.setOrientation(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void toggleCloseBtn(final Object obj, final String str) {
        if (v.b()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.4
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.toggleCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.smartdigimkt.expressad.video.signal.communication.BaseRewardJs, com.smartdigimkt.expressad.video.signal.communication.IRewardBridge
    public void triggerCloseBtn(final Object obj, final String str) {
        if (v.b()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.o.post(new Runnable() { // from class: com.smartdigimkt.expressad.video.signal.communication.RewardJs.5
                @Override // java.lang.Runnable
                public void run() {
                    RewardJs.super.getEndScreenInfo(obj, str);
                }
            });
        }
    }
}
