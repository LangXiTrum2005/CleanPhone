package saneness;

import ads_mobile_sdk.z52;

/* JADX INFO: loaded from: classes.dex */
public final class uralian {
    public static z52 attabal(int i) {
        if (i == 0) {
            return z52.UNKNOWN;
        }
        if (i != 1) {
            return i != 2 ? z52.FIFO : z52.ECPM;
        }
        return z52.FIFO;
    }
}
