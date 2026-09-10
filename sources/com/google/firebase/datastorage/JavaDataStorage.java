package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/datastorage/JavaDataStorage;", "", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaDataStorage {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f20774e = {Reflection.f43333a.j(new PropertyReference2Impl(CallableReference.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f20777c;
    public final DataStore d;

    public JavaDataStorage(Context context, String name) {
        Intrinsics.f(context, "context");
        Intrinsics.f(name, "name");
        this.f20775a = context;
        this.f20776b = name;
        this.f20777c = new ThreadLocal();
        final int i2 = 0;
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler(new Function1(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f20781Y;

            {
                this.f20781Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaDataStorage javaDataStorage = this.f20781Y;
                switch (i2) {
                    case 0:
                        CorruptionException ex = (CorruptionException) obj;
                        KProperty[] kPropertyArr = JavaDataStorage.f20774e;
                        Intrinsics.f(ex, "ex");
                        Log.w(Reflection.f43333a.b(JavaDataStorage.class).l(), "CorruptionException in " + javaDataStorage.f20776b + " DataStore running in process " + Process.myPid(), ex);
                        return new MutablePreferences(true);
                    default:
                        Context it = (Context) obj;
                        KProperty[] kPropertyArr2 = JavaDataStorage.f20774e;
                        Intrinsics.f(it, "it");
                        String sharedPreferencesName = javaDataStorage.f20776b;
                        LinkedHashSet keysToMigrate = SharedPreferencesMigrationKt.f4721a;
                        Intrinsics.f(sharedPreferencesName, "sharedPreferencesName");
                        Intrinsics.f(keysToMigrate, "keysToMigrate");
                        return CollectionsKt.H(new SharedPreferencesMigration(it, sharedPreferencesName, SharedPreferencesMigrationKt.b(keysToMigrate), SharedPreferencesMigrationKt.a()));
                }
            }
        });
        final int i3 = 1;
        Function1 function1 = new Function1(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ JavaDataStorage f20781Y;

            {
                this.f20781Y = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaDataStorage javaDataStorage = this.f20781Y;
                switch (i3) {
                    case 0:
                        CorruptionException ex = (CorruptionException) obj;
                        KProperty[] kPropertyArr = JavaDataStorage.f20774e;
                        Intrinsics.f(ex, "ex");
                        Log.w(Reflection.f43333a.b(JavaDataStorage.class).l(), "CorruptionException in " + javaDataStorage.f20776b + " DataStore running in process " + Process.myPid(), ex);
                        return new MutablePreferences(true);
                    default:
                        Context it = (Context) obj;
                        KProperty[] kPropertyArr2 = JavaDataStorage.f20774e;
                        Intrinsics.f(it, "it");
                        String sharedPreferencesName = javaDataStorage.f20776b;
                        LinkedHashSet keysToMigrate = SharedPreferencesMigrationKt.f4721a;
                        Intrinsics.f(sharedPreferencesName, "sharedPreferencesName");
                        Intrinsics.f(keysToMigrate, "keysToMigrate");
                        return CollectionsKt.H(new SharedPreferencesMigration(it, sharedPreferencesName, SharedPreferencesMigrationKt.b(keysToMigrate), SharedPreferencesMigrationKt.a()));
                }
            }
        };
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.d = (DataStore) new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, function1, CoroutineScopeKt.a(DefaultIoScheduler.f45062Y.plus(SupervisorKt.b()))).getValue(context, f20774e[0]);
    }

    public final void a(Function1 function1) {
    }

    public final Map b() {
        return (Map) BuildersKt.d(EmptyCoroutineContext.X, new JavaDataStorage$getAllSync$1(this, null));
    }
}
