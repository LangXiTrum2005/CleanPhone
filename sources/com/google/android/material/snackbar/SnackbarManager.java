package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
class SnackbarManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SnackbarManager f19489b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19490a = new Object();

    public interface Callback {
    }

    public static class SnackbarRecord {
    }

    public SnackbarManager() {
        new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 0) {
                    return false;
                }
                SnackbarManager snackbarManager = SnackbarManager.this;
                SnackbarRecord snackbarRecord = (SnackbarRecord) message.obj;
                synchronized (snackbarManager.f19490a) {
                    try {
                        if (snackbarRecord == null || snackbarRecord == null) {
                            snackbarRecord.getClass();
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            }
        });
    }

    public static SnackbarManager a() {
        if (f19489b == null) {
            f19489b = new SnackbarManager();
        }
        return f19489b;
    }
}
