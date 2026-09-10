package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: loaded from: classes2.dex */
public class NXR {
    public static long Lxb() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
