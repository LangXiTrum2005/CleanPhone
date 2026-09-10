package com.tiktok.util;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public class TTHandlerUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TTHandlerUtil f42673b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f42674a;

    static {
        TTHandlerUtil tTHandlerUtil = new TTHandlerUtil();
        tTHandlerUtil.f42674a = null;
        try {
            HandlerThread handlerThread = new HandlerThread("tiktok");
            handlerThread.start();
            tTHandlerUtil.f42674a = new Handler(handlerThread.getLooper());
        } catch (Throwable unused) {
        }
        f42673b = tTHandlerUtil;
    }
}
