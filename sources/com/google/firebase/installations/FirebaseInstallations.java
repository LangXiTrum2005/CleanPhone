package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.time.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f20839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationServiceClient f20840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation f20841c;
    public final Utils d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f20842e;
    public final RandomFidGenerator f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f20843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f20844i;
    public String j;
    public final HashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f20845l;

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$2, reason: invalid class name */
    class AnonymousClass2 implements FidListenerHandle {
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20847b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f20847b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20847b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20847b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f20846a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20846a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
            public final AtomicInteger X = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.X.getAndIncrement())));
            }
        };
    }

    public FirebaseInstallations(final FirebaseApp firebaseApp, Provider provider, ExecutorService executorService, Executor executor) {
        firebaseApp.a();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.f20145a, provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        if (SystemClock.f20897a == null) {
            SystemClock.f20897a = new SystemClock();
        }
        SystemClock systemClock = SystemClock.f20897a;
        if (Utils.d == null) {
            Utils.d = new Utils(systemClock);
        }
        Utils utils = Utils.d;
        Lazy lazy = new Lazy(new Provider() { // from class: com.google.firebase.installations.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseInstallations.m;
                return new IidStore(firebaseApp);
            }
        });
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.g = new Object();
        this.k = new HashSet();
        this.f20845l = new ArrayList();
        this.f20839a = firebaseApp;
        this.f20840b = firebaseInstallationServiceClient;
        this.f20841c = persistedInstallation;
        this.d = utils;
        this.f20842e = lazy;
        this.f = randomFidGenerator;
        this.f20843h = executorService;
        this.f20844i = executor;
    }

    public static FirebaseInstallations c() {
        FirebaseApp firebaseAppC = FirebaseApp.c();
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        firebaseAppC.a();
        return (FirebaseInstallations) firebaseAppC.d.a(FirebaseInstallationsApi.class);
    }

    public final void a() {
        PersistedInstallationEntry persistedInstallationEntryC;
        synchronized (m) {
            try {
                FirebaseApp firebaseApp = this.f20839a;
                firebaseApp.a();
                CrossProcessLock crossProcessLockA = CrossProcessLock.a(firebaseApp.f20145a);
                try {
                    persistedInstallationEntryC = this.f20841c.c();
                    if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.f20872Y || persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.X) {
                        String strE = e(persistedInstallationEntryC);
                        PersistedInstallation persistedInstallation = this.f20841c;
                        PersistedInstallationEntry.Builder builderH = persistedInstallationEntryC.h();
                        builderH.d(strE);
                        builderH.f(PersistedInstallation.RegistrationStatus.Z);
                        persistedInstallationEntryC = builderH.a();
                        persistedInstallation.b(persistedInstallationEntryC);
                    }
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                } catch (Throwable th) {
                    if (crossProcessLockA != null) {
                        crossProcessLockA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h(persistedInstallationEntryC);
        this.f20844i.execute(new b(this, 0));
    }

    public final PersistedInstallationEntry b(PersistedInstallationEntry persistedInstallationEntry) {
        FirebaseApp firebaseApp = this.f20839a;
        firebaseApp.a();
        String str = firebaseApp.f20147c.f20154a;
        String strC = persistedInstallationEntry.c();
        FirebaseApp firebaseApp2 = this.f20839a;
        firebaseApp2.a();
        TokenResult tokenResultB = this.f20840b.b(str, strC, firebaseApp2.f20147c.g, persistedInstallationEntry.e());
        int iOrdinal = tokenResultB.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return persistedInstallationEntry.i();
            }
            if (iOrdinal != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
            builderH.f(PersistedInstallation.RegistrationStatus.f20872Y);
            return builderH.a();
        }
        String strB = tokenResultB.b();
        long jC = tokenResultB.c();
        Utils utils = this.d;
        utils.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        utils.f20855a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        PersistedInstallationEntry.Builder builderH2 = persistedInstallationEntry.h();
        builderH2.b(strB);
        builderH2.c(jC);
        builderH2.g(seconds);
        return builderH2.a();
    }

    public final void d() {
        FirebaseApp firebaseApp = this.f20839a;
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.f20147c.f20155b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.f20147c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkNotEmpty(firebaseApp.f20147c.f20154a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        String str = firebaseApp.f20147c.f20155b;
        Pattern pattern = Utils.f20854c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.a();
        Preconditions.checkArgument(Utils.f20854c.matcher(firebaseApp.f20147c.f20154a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: all -> 0x0042, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:10:0x0031, B:11:0x0033, B:15:0x0040, B:19:0x0044, B:20:0x0048, B:28:0x005c, B:12:0x0034, B:13:0x003d), top: B:33:0x0031, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:10:0x0031, B:11:0x0033, B:15:0x0040, B:19:0x0044, B:20:0x0048, B:28:0x005c, B:12:0x0034, B:13:0x003d), top: B:33:0x0031, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final String e(PersistedInstallationEntry persistedInstallationEntry) {
        IidStore iidStore;
        String string;
        FirebaseApp firebaseApp = this.f20839a;
        firebaseApp.a();
        if (!firebaseApp.f20146b.equals("CHIME_ANDROID_SDK")) {
            FirebaseApp firebaseApp2 = this.f20839a;
            firebaseApp2.a();
            if ("[DEFAULT]".equals(firebaseApp2.f20146b)) {
                if (persistedInstallationEntry.f() == PersistedInstallation.RegistrationStatus.X) {
                    iidStore = (IidStore) this.f20842e.get();
                    synchronized (iidStore.f20868a) {
                        try {
                            synchronized (iidStore.f20868a) {
                                string = iidStore.f20868a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = iidStore.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return RandomFidGenerator.a();
                }
            }
        } else if (persistedInstallationEntry.f() == PersistedInstallation.RegistrationStatus.X) {
            iidStore = (IidStore) this.f20842e.get();
            synchronized (iidStore.f20868a) {
                synchronized (iidStore.f20868a) {
                    string = iidStore.f20868a.getString("|S|id", null);
                    if (string != null) {
                        string = iidStore.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return RandomFidGenerator.a();
                }
            }
        }
        this.f.getClass();
        return RandomFidGenerator.a();
    }

    public final PersistedInstallationEntry f(PersistedInstallationEntry persistedInstallationEntry) {
        String string = null;
        if (persistedInstallationEntry.c() != null && persistedInstallationEntry.c().length() == 11) {
            IidStore iidStore = (IidStore) this.f20842e.get();
            synchronized (iidStore.f20868a) {
                try {
                    String[] strArr = IidStore.f20867c;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break;
                        }
                        String str = strArr[i2];
                        String string2 = iidStore.f20868a.getString("|T|" + iidStore.f20869b + com.smartdigimkt.b0.a.U1 + str, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str2 = string;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f20840b;
        FirebaseApp firebaseApp = this.f20839a;
        firebaseApp.a();
        String str3 = firebaseApp.f20147c.f20154a;
        String strC = persistedInstallationEntry.c();
        FirebaseApp firebaseApp2 = this.f20839a;
        firebaseApp2.a();
        String str4 = firebaseApp2.f20147c.g;
        FirebaseApp firebaseApp3 = this.f20839a;
        firebaseApp3.a();
        InstallationResponse installationResponseA = firebaseInstallationServiceClient.a(str3, strC, str4, firebaseApp3.f20147c.f20155b, str2);
        int iOrdinal = installationResponseA.d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return persistedInstallationEntry.i();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        String strB = installationResponseA.b();
        String strC2 = installationResponseA.c();
        Utils utils = this.d;
        utils.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        utils.f20855a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        String strB2 = installationResponseA.a().b();
        long jC = installationResponseA.a().c();
        PersistedInstallationEntry.Builder builderH = persistedInstallationEntry.h();
        builderH.d(strB);
        builderH.f(PersistedInstallation.RegistrationStatus.e0);
        builderH.b(strB2);
        builderH.e(strC2);
        builderH.c(jC);
        builderH.g(seconds);
        return builderH.a();
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f20845l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetIdListener getIdListener = new GetIdListener(taskCompletionSource);
        synchronized (this.g) {
            this.f20845l.add(getIdListener);
        }
        Task task = taskCompletionSource.getTask();
        this.f20843h.execute(new b(this, 1));
        return task;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public final Task getToken() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.f20845l.add(getAuthTokenListener);
        }
        Task task = taskCompletionSource.getTask();
        this.f20843h.execute(new b(this, 2));
        return task;
    }

    public final void h(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.g) {
            try {
                Iterator it = this.f20845l.iterator();
                while (it.hasNext()) {
                    if (((StateListener) it.next()).b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
