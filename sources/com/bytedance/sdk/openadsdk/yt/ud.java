package com.bytedance.sdk.openadsdk.yt;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ud {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i2);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.yt.ud.qdl> list);
}
