package com.yolo.networklibrary.common.util;

import android.os.Process;
import com.google.android.gms.ads.AdSize;
import com.mbridge.msdk.foundation.entity.b;

/* JADX INFO: compiled from: ThreadManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final com.lzh.easythread.competently f23971attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final com.lzh.easythread.competently f23972dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final com.lzh.easythread.competently f23974saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.lzh.easythread.competently f23975wireman = com.lzh.easythread.competently.saneness.saneness(6).wireman(b.JSON_KEY_ADS).marial(10).attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final com.lzh.easythread.competently f23973marial = com.lzh.easythread.competently.saneness.saneness(6).wireman("http").marial(10).attabal();

    static {
        f23972dern = com.lzh.easythread.competently.saneness.saneness(6).wireman("normal").marial(1).dern(new saneness()).attabal();
        f23971attabal = com.lzh.easythread.competently.saneness.saneness(10).wireman("core").marial(10).dern(new saneness()).attabal();
        f23974saneness = com.lzh.easythread.competently.saneness.saneness(AdSize.MEDIUM_RECTANGLE_WIDTH).wireman("ping").marial(10).dern(new saneness()).attabal();
    }

    public static com.lzh.easythread.competently attabal() {
        return f23973marial;
    }

    /* JADX INFO: compiled from: ThreadManager.java */
    public static class saneness implements com.lzh.easythread.dern {
        public saneness() {
        }

        @Override // com.lzh.easythread.dern
        public void onStart(String str) {
            Process.setThreadPriority(10);
        }

        @Override // com.lzh.easythread.dern
        public void saneness(String str, Throwable th) {
            th.printStackTrace();
        }

        @Override // com.lzh.easythread.dern
        public void attabal(String str) {
        }
    }
}
