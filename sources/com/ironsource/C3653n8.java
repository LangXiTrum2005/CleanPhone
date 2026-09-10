package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3653n8 {

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.n8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.n8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.n8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int a;

        d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
