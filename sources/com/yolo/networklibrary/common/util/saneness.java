package com.yolo.networklibrary.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Daemon.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static Handler f23976attabal = new Handler(Looper.getMainLooper());

    public static synchronized Handler attabal() {
        return f23976attabal;
    }
}
