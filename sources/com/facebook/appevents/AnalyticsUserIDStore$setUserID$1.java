package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class AnalyticsUserIDStore$setUserID$1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = AnalyticsUserIDStore.f15997a;
            AnalyticsUserIDStore.f15997a.writeLock().lock();
            try {
                AnalyticsUserIDStore.f15998b = null;
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.b()).edit();
                editorEdit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", AnalyticsUserIDStore.f15998b);
                editorEdit.apply();
            } finally {
                ReentrantReadWriteLock reentrantReadWriteLock2 = AnalyticsUserIDStore.f15997a;
                AnalyticsUserIDStore.f15997a.writeLock().unlock();
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
