package com.efs.sdk.memleaksdk.monitor;

import com.efs.sdk.memleaksdk.monitor.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public class UMonitorJNI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f444a;

    static {
        boolean z;
        try {
            System.loadLibrary("umonitor");
            z = true;
        } catch (Throwable th) {
            g.b("UMonitor.JNI", "loadLibrary failed", th);
            z = false;
        }
        f444a = z;
    }

    public static native void exit();

    public static native void init();

    public static native void initStrip();

    public static native void initStripPath(String str, String str2);

    public static native boolean resumeVM(int i);

    public static native int suspendVM();
}
