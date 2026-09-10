package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.media3.exoplayer.analytics.d;
import androidx.media3.exoplayer.analytics.o;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.p004ironsource.ko;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigRealtimeHttpClient {
    public static final int[] s = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20970a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20972c;
    public HttpURLConnection f;
    public ConfigAutoFetch g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f20974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConfigFetchHandler f20975i;
    public final FirebaseApp j;
    public final FirebaseInstallationsApi k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConfigCacheClient f20976l;
    public final Context m;
    public final ConfigSharedPrefsClient q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20971b = false;
    public final Random o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clock f20978p = DefaultClock.getInstance();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f20977n = "firebase";
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20973e = false;
    public final Object r = new Object();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$2, reason: invalid class name */
    class AnonymousClass2 implements ConfigUpdateListener {
        public AnonymousClass2() {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void a(ConfigUpdate configUpdate) {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
            int[] iArr = ConfigRealtimeHttpClient.s;
            synchronized (configRealtimeHttpClient) {
                configRealtimeHttpClient.d = true;
            }
            ConfigRealtimeHttpClient.this.g(firebaseRemoteConfigException);
        }
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, LinkedHashSet linkedHashSet, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.f20970a = linkedHashSet;
        this.f20974h = scheduledExecutorService;
        this.f20972c = Math.max(8 - configSharedPrefsClient.c().f20986a, 1);
        this.j = firebaseApp;
        this.f20975i = configFetchHandler;
        this.k = firebaseInstallationsApi;
        this.f20976l = configCacheClient;
        this.m = context;
        this.q = configSharedPrefsClient;
    }

    public static boolean d(int i2) {
        return i2 == 408 || i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        return (this.f20970a.isEmpty() || this.f20971b || this.d || this.f20973e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.f20973e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e3);
            }
        }
    }

    public final String c(String str) {
        FirebaseApp firebaseApp = this.j;
        firebaseApp.a();
        Matcher matcher = t.matcher(firebaseApp.f20147c.f20155b);
        return androidx.datastore.preferences.protobuf.a.n("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i2 = this.f20972c;
                if (i2 > 0) {
                    this.f20972c = i2 - 1;
                    this.f20974h.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zA;
                            ConfigRealtimeHttpClient configRealtimeHttpClient = ConfigRealtimeHttpClient.this;
                            synchronized (configRealtimeHttpClient) {
                                zA = configRealtimeHttpClient.a();
                                if (zA) {
                                    synchronized (configRealtimeHttpClient) {
                                        configRealtimeHttpClient.f20971b = true;
                                    }
                                }
                            }
                            if (zA) {
                                if (new Date(configRealtimeHttpClient.f20978p.currentTimeMillis()).before(configRealtimeHttpClient.q.c().f20987b)) {
                                    configRealtimeHttpClient.h();
                                    return;
                                }
                                FirebaseInstallationsApi firebaseInstallationsApi = configRealtimeHttpClient.k;
                                Task token = firebaseInstallationsApi.getToken();
                                Task id = firebaseInstallationsApi.getId();
                                Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id}).continueWithTask(configRealtimeHttpClient.f20974h, new o(configRealtimeHttpClient, token, id, 9));
                                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(configRealtimeHttpClient.f20974h, new d(29, configRealtimeHttpClient, taskContinueWithTask));
                            }
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.f20973e) {
                    g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f20970a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).b(firebaseRemoteConfigException);
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.q.c().f20987b.getTime() - new Date(this.f20978p.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String strBytesToStringUppercase;
        httpURLConnection.setRequestMethod(ko.f25535b);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        FirebaseApp firebaseApp = this.j;
        firebaseApp.a();
        FirebaseOptions firebaseOptions = firebaseApp.f20147c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", firebaseOptions.f20154a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", com.p004ironsource.mediationsdk.metadata.a.g);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        firebaseApp.a();
        Matcher matcher = t.matcher(firebaseOptions.f20155b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f20977n);
        map.put("lastKnownVersionNumber", Long.toString(this.f20975i.f20952h.f20981a.getLong("last_template_version", 0L)));
        firebaseApp.a();
        map.put(com.smartdigimkt.f3.b.f35043u, firebaseOptions.f20155b);
        map.put("sdkVersion", "23.0.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized ConfigAutoFetch j(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.f20975i, this.f20976l, this.f20970a, new AnonymousClass2(), this.f20974h, this.q);
    }

    public final void k(Date date) {
        ConfigSharedPrefsClient configSharedPrefsClient = this.q;
        int i2 = configSharedPrefsClient.c().f20986a + 1;
        long millis = TimeUnit.MINUTES.toMillis(s[(i2 < 8 ? i2 : 8) - 1]);
        configSharedPrefsClient.e(i2, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }
}
