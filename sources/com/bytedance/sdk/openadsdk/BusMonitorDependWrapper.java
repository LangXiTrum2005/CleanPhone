package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.yt.ud;
import com.bytedance.sdk.openadsdk.yt.ud.qdl;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BusMonitorDependWrapper implements ud {
    private ud qdl;
    private Handler ud;

    public BusMonitorDependWrapper(ud udVar) {
        this.qdl = udVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public Context getContext() {
        ud udVar = this.qdl;
        return (udVar == null || udVar.getContext() == null) ? getReflectContext() : this.qdl.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public Handler getHandler() {
        ud udVar = this.qdl;
        if (udVar != null && udVar.getHandler() != null) {
            return this.qdl.getHandler();
        }
        if (this.ud == null) {
            this.ud = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.ud;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public int getOnceLogCount() {
        ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public int getOnceLogInterval() {
        ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public HandlerThread getSafeHandlerThread(String str, int i2) {
        HandlerThread safeHandlerThread;
        ud udVar = this.qdl;
        if (udVar != null && (safeHandlerThread = udVar.getSafeHandlerThread(str, i2)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        ud udVar = this.qdl;
        if (udVar == null || (uploadIntervalTime = udVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public boolean isMonitorOpen() {
        ud udVar = this.qdl;
        if (udVar != null) {
            return udVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.yt.ud
    public void onMonitorUpload(List<qdl> list) {
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.onMonitorUpload(list);
        }
    }
}
