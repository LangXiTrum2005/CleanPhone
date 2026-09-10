package com.zhy.http.okhttp;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class OkHttpUtils {

    /* JADX INFO: renamed from: com.zhy.http.okhttp.OkHttpUtils$1, reason: invalid class name */
    class AnonymousClass1 implements Callback {
        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            throw null;
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            try {
                try {
                    if (!call.getCanceled()) {
                        throw null;
                    }
                    new IOException("Canceled!");
                    throw null;
                } catch (Exception unused) {
                    throw null;
                }
            } catch (Throwable th) {
                if (response.body() != null) {
                    response.body().close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.zhy.http.okhttp.OkHttpUtils$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.zhy.http.okhttp.OkHttpUtils$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class METHOD {
    }
}
