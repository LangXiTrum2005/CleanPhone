package com.facebook.appevents;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class UserDataStore$setUserDataAndHash$1 implements Runnable {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            UserDataStore userDataStore = UserDataStore.f16035e;
            ConcurrentHashMap concurrentHashMap2 = null;
            if (!UserDataStore.a().get()) {
                Log.w(CrashShieldHandler.b(UserDataStore.class) ? null : "UserDataStore", "initStore should have been called before calling setUserData");
                UserDataStore.c();
            }
            if (!CrashShieldHandler.b(UserDataStore.class)) {
                try {
                    CrashShieldHandler.b(userDataStore);
                } catch (Throwable th) {
                    CrashShieldHandler.a(UserDataStore.class, th);
                }
            }
            SharedPreferences sharedPreferences = UserDataStore.f16032a;
            if (CrashShieldHandler.b(UserDataStore.class)) {
                concurrentHashMap = null;
            } else {
                try {
                    concurrentHashMap = UserDataStore.f16034c;
                } catch (Throwable th2) {
                    CrashShieldHandler.a(UserDataStore.class, th2);
                    concurrentHashMap = null;
                }
            }
            String strJ = Utility.J(concurrentHashMap);
            UserDataStore userDataStore2 = UserDataStore.f16035e;
            if (!CrashShieldHandler.b(UserDataStore.class)) {
                try {
                    userDataStore2.g("com.facebook.appevents.UserDataStore.userData", strJ);
                } catch (Throwable th3) {
                    CrashShieldHandler.a(UserDataStore.class, th3);
                }
            }
            if (!CrashShieldHandler.b(UserDataStore.class)) {
                try {
                    concurrentHashMap2 = UserDataStore.d;
                } catch (Throwable th4) {
                    CrashShieldHandler.a(UserDataStore.class, th4);
                }
            }
            String strJ2 = Utility.J(concurrentHashMap2);
            UserDataStore userDataStore3 = UserDataStore.f16035e;
            if (CrashShieldHandler.b(UserDataStore.class)) {
                return;
            }
            try {
                userDataStore3.g("com.facebook.appevents.UserDataStore.internalUserData", strJ2);
            } catch (Throwable th5) {
                CrashShieldHandler.a(UserDataStore.class, th5);
            }
        } catch (Throwable th6) {
            CrashShieldHandler.a(this, th6);
        }
    }
}
