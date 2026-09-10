package com.bytedance.sdk.openadsdk.VVE;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface LD {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.VVE.LD.Lxb> list);
}
