package com.smartdigimkt.sdk.api.format;

/* JADX INFO: loaded from: classes6.dex */
public class SDMSplashAdExtraInfo {
    private int dismissType;

    public static class SPLASH_DISMISS_TYPE {
        public static final int CLICKAD = 4;
        public static final int NORMAL = 1;
        public static final int SHOWFAILED = 99;
        public static final int SKIP = 2;
        public static final int TIMEOVER = 3;
        public static final int UNKNOWN = 0;
    }

    public SDMSplashAdExtraInfo(int i2) {
        this.dismissType = i2;
    }

    public int getDismissType() {
        return this.dismissType;
    }
}
