package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static String a(String str) {
        try {
            return H5DownLoadManager.getInstance().getH5ResAddress(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
