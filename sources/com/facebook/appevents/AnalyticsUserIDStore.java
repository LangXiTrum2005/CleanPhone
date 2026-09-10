package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.internal.AppEventUtility;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import l7.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/AnalyticsUserIDStore;", "", "<init>", "()V", "Lwj/r;", "initStore", "", "id", "setUserID", "(Ljava/lang/String;)V", "getUserID", "()Ljava/lang/String;", "initAndWait", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "ANALYTICS_USER_ID_KEY", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "userID", "", "initialized", "Z", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AnalyticsUserIDStore {
    private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
    private static volatile boolean initialized;
    private static String userID;
    public static final AnalyticsUserIDStore INSTANCE = new AnalyticsUserIDStore();
    private static final String TAG = "AnalyticsUserIDStore";
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private AnalyticsUserIDStore() {
    }

    public static final String getUserID() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    private final void initAndWait() {
        if (initialized) {
            return;
        }
        lock.writeLock().lock();
        try {
            if (!initialized) {
                userID = PreferenceManager.getDefaultSharedPreferences(s.b()).getString(ANALYTICS_USER_ID_KEY, null);
                initialized = true;
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static final void initStore() {
        if (initialized) {
            return;
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new x(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStore$lambda$0() {
        INSTANCE.initAndWait();
    }

    public static final void setUserID(String id2) {
        AppEventUtility.assertIsNotMainThread();
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.initAndWait();
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new a(id2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserID$lambda$1(String str) {
        lock.writeLock().lock();
        try {
            userID = str;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.b()).edit();
            editorEdit.putString(ANALYTICS_USER_ID_KEY, userID);
            editorEdit.apply();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
