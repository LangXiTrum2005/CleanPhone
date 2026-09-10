package com.facebook.appevents;

import android.util.Log;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class UserDataStore$clear$1 implements Runnable {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if (!UserDataStore.a().get()) {
                Log.w(CrashShieldHandler.b(UserDataStore.class) ? null : "UserDataStore", "initStore should have been called before calling setUserData");
                UserDataStore.c();
            }
            if (CrashShieldHandler.b(UserDataStore.class)) {
                concurrentHashMap = null;
            } else {
                try {
                    concurrentHashMap = UserDataStore.f16034c;
                } catch (Throwable th) {
                    CrashShieldHandler.a(UserDataStore.class, th);
                    concurrentHashMap = null;
                }
            }
            concurrentHashMap.clear();
            UserDataStore.b().edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }
}
