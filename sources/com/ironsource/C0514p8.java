package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0514p8 {

    /* JADX INFO: renamed from: com.ironsource.p8$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.p8$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.p8$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.p8$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29994a;

        d(int i10) {
            this.f29994a = i10;
        }

        public int b() {
            return this.f29994a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
