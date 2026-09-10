package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class mh {

    public enum a {
        None,
        Device,
        Controller
    }

    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    public enum c {
        Web,
        Native,
        None
    }

    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26166a;

        d(int i2) {
            this.f26166a = i2;
        }

        public int a() {
            return this.f26166a;
        }
    }

    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
