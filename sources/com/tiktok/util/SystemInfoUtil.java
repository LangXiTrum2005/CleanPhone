package com.tiktok.util;

import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.tiktok.TikTokBusinessSdk;

/* JADX INFO: loaded from: classes6.dex */
public class SystemInfoUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42671a = 0;

    /* JADX INFO: renamed from: com.tiktok.util.SystemInfoUtil$1, reason: invalid class name */
    final class AnonymousClass1 implements InstallReferrerStateListener {
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i2) {
            try {
                TTHandlerUtil tTHandlerUtil = TTHandlerUtil.f42673b;
                Runnable runnable = new Runnable() { // from class: com.tiktok.util.SystemInfoUtil.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (i2 == 0) {
                                try {
                                    throw null;
                                } catch (Throwable unused) {
                                }
                            }
                            throw null;
                        } catch (Throwable unused2) {
                        }
                    }
                };
                tTHandlerUtil.getClass();
                Handler handler = tTHandlerUtil.f42674a;
                if (handler == null) {
                    return;
                }
                handler.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        try {
            String str = TikTokBusinessSdk.f42660a;
            throw null;
        } catch (Exception unused) {
        }
    }
}
