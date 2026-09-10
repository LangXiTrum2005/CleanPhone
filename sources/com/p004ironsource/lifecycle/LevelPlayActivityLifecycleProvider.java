package com.p004ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016JQ\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/ironsource/lifecycle/LevelPlayActivityLifecycleProvider;", "Landroid/content/ContentProvider;", "Landroid/app/Application;", "application", "", "a", "", "onCreate", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "values", "insert", "", com.smartdigimkt.o1.b.z0, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "<init>", "()V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f25605a = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/ironsource/lifecycle/LevelPlayActivityLifecycleProvider$a;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivity", "Ljava/lang/ref/WeakReference;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"com/ironsource/lifecycle/LevelPlayActivityLifecycleProvider$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.f(activity, "activity");
            Companion companion = LevelPlayActivityLifecycleProvider.INSTANCE;
            LevelPlayActivityLifecycleProvider.f25605a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.f(activity, "activity");
            Companion companion = LevelPlayActivityLifecycleProvider.INSTANCE;
            LevelPlayActivityLifecycleProvider.f25605a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.f(activity, "activity");
            Intrinsics.f(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.f(activity, "activity");
            Companion companion = LevelPlayActivityLifecycleProvider.INSTANCE;
            LevelPlayActivityLifecycleProvider.f25605a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.f(activity, "activity");
        }
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new b());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            IronLog.INTERNAL.verbose(com.smartdigimkt.d0.b.f34375a);
            return true;
        }
        if (!(getContext() instanceof Application)) {
            IronLog.INTERNAL.verbose("context is not application");
            return true;
        }
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type android.app.Application");
        a((Application) context);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Intrinsics.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.f(uri, "uri");
        return 0;
    }
}
