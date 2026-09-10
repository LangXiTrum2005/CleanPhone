package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.ironsource.A5;
import com.ironsource.C3460cc;
import com.ironsource.mediationsdk.metadata.a;
import iiion.beachfront;
import ingathering.apical;
import ingathering.competently;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import snarler.marial;

/* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int[] f22822monoploid = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final Pattern f22823polloi = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public marial f22824apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman f22825arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<neuropteran.dern> f22826attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ScheduledExecutorService f22828competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final competently f22829cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f22830dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Context f22831formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final String f22832impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final ConfigFetchHandler f22833impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final beachfront f22837taiyuan;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f22827beachfront = 8;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f22836saneness = false;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final Random f22838triweekly = new Random();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Clock f22834kowloon = DefaultClock.getInstance();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f22839wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f22835marial = false;

    /* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dern.this.marial();
        }
    }

    public dern(beachfront beachfrontVar, competently competentlyVar, ConfigFetchHandler configFetchHandler, marial marialVar, Context context, String str, Set<neuropteran.dern> set, wireman wiremanVar, ScheduledExecutorService scheduledExecutorService) {
        this.f22826attabal = set;
        this.f22828competently = scheduledExecutorService;
        this.f22830dern = Math.max(8 - wiremanVar.impromptu().saneness(), 1);
        this.f22837taiyuan = beachfrontVar;
        this.f22833impromptu = configFetchHandler;
        this.f22829cutely = competentlyVar;
        this.f22824apical = marialVar;
        this.f22831formularize = context;
        this.f22832impassible = str;
        this.f22825arytenoidectomy = wiremanVar;
    }

    public static String apical(String str) {
        Matcher matcher = f22823polloi.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    public static /* synthetic */ Task attabal(dern dernVar, Task task, Task task2) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        dernVar.getClass();
        boolean z = true;
        try {
            if (!task.isSuccessful()) {
                throw new IOException(task.getException());
            }
            dernVar.gintrap(true);
            httpURLConnection = (HttpURLConnection) task.getResult();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        dernVar.graveside();
                        dernVar.f22825arytenoidectomy.cutely();
                        dernVar.cord(httpURLConnection).impromptu();
                    } catch (IOException unused) {
                        dernVar.competently(httpURLConnection);
                        dernVar.gintrap(false);
                        if (numValueOf != null && !dernVar.arytenoidectomy(numValueOf.intValue())) {
                            z = false;
                        }
                        if (z) {
                            dernVar.stratoscope(new Date(dernVar.f22834kowloon.currentTimeMillis()));
                        }
                        if (z || numValueOf.intValue() == 200) {
                            dernVar.adultoid();
                        } else {
                            String strPolloi = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strPolloi = dernVar.polloi(httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strPolloi, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                        }
                        return Tasks.forResult(null);
                    } catch (Throwable th2) {
                        th = th2;
                        dernVar.competently(httpURLConnection);
                        dernVar.gintrap(false);
                        if (numValueOf != null && !dernVar.arytenoidectomy(numValueOf.intValue())) {
                            z = false;
                        }
                        if (z) {
                            dernVar.stratoscope(new Date(dernVar.f22834kowloon.currentTimeMillis()));
                        }
                        if (z || numValueOf.intValue() == 200) {
                            dernVar.adultoid();
                        } else {
                            String strPolloi2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strPolloi2 = dernVar.polloi(httpURLConnection.getErrorStream());
                            }
                            dernVar.molybdenite(new FirebaseRemoteConfigServerException(numValueOf.intValue(), strPolloi2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        }
                        throw th;
                    }
                }
                dernVar.competently(httpURLConnection);
                dernVar.gintrap(false);
                boolean zArytenoidectomy = dernVar.arytenoidectomy(responseCode);
                if (zArytenoidectomy) {
                    dernVar.stratoscope(new Date(dernVar.f22834kowloon.currentTimeMillis()));
                }
                if (zArytenoidectomy || responseCode == 200) {
                    dernVar.adultoid();
                } else {
                    String strPolloi3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (responseCode == 403) {
                        strPolloi3 = dernVar.polloi(httpURLConnection.getErrorStream());
                    }
                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strPolloi3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                    dernVar.molybdenite(firebaseRemoteConfigServerException);
                }
            } catch (IOException unused2) {
                numValueOf = null;
            } catch (Throwable th3) {
                numValueOf = null;
                th = th3;
            }
            return Tasks.forResult(null);
        } catch (IOException unused3) {
            httpURLConnection = null;
            numValueOf = null;
        } catch (Throwable th4) {
            numValueOf = null;
            th = th4;
            httpURLConnection = null;
        }
    }

    public static /* synthetic */ Task saneness(dern dernVar, Task task, Task task2, Task task3) {
        dernVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) dernVar.kowloon().openConnection();
            dernVar.preprohormone(httpURLConnection, (String) task2.getResult(), ((apical) task.getResult()).saneness());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    public synchronized void adultoid() {
        monoploid(Math.max(0L, this.f22825arytenoidectomy.impromptu().attabal().getTime() - new Date(this.f22834kowloon.currentTimeMillis()).getTime()));
    }

    public final boolean arytenoidectomy(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public final synchronized boolean beachfront() {
        return (this.f22826attabal.isEmpty() || this.f22836saneness || this.f22839wireman || this.f22835marial) ? false : true;
    }

    public void competently(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public synchronized com.google.firebase.remoteconfig.internal.attabal cord(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.attabal(httpURLConnection, this.f22833impromptu, this.f22824apical, this.f22826attabal, new saneness(), this.f22828competently);
    }

    public void cuirassed() {
        monoploid(0L);
    }

    public final synchronized void cutely() {
        this.f22839wireman = true;
    }

    public final void dovishness(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f22837taiyuan.kowloon().saneness());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f22831formularize.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", formularize());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", a.g);
        httpURLConnection.setRequestProperty("Content-Type", A5.M);
        httpURLConnection.setRequestProperty("Accept", A5.M);
    }

    public final String formularize() {
        try {
            Context context = this.f22831formularize;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.f22831formularize.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.f22831formularize.getPackageName();
            return null;
        }
    }

    public final synchronized void gintrap(boolean z) {
        this.f22836saneness = z;
    }

    public final synchronized void graveside() {
        this.f22830dern = 8;
    }

    public final long impassible(int i) {
        int[] iArr = f22822monoploid;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + ((long) this.f22838triweekly.nextInt((int) millis));
    }

    public Task<HttpURLConnection> impromptu() {
        final Task<apical> taskAttabal = this.f22829cutely.attabal(false);
        final Task<String> id = this.f22829cutely.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskAttabal, id}).continueWithTask(this.f22828competently, new Continuation() { // from class: snarler.triweekly
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.internal.dern.saneness(this.f37687attabal, taskAttabal, id, task);
            }
        });
    }

    public final URL kowloon() {
        try {
            return new URL(triweekly(this.f22832impassible));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public void marial() {
        if (beachfront()) {
            if (new Date(this.f22834kowloon.currentTimeMillis()).before(this.f22825arytenoidectomy.impromptu().attabal())) {
                adultoid();
            } else {
                final Task<HttpURLConnection> taskImpromptu = impromptu();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskImpromptu}).continueWith(this.f22828competently, new Continuation() { // from class: snarler.impassible
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return com.google.firebase.remoteconfig.internal.dern.attabal(this.f37671attabal, taskImpromptu, task);
                    }
                });
            }
        }
    }

    public final synchronized void molybdenite(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<neuropteran.dern> it = this.f22826attabal.iterator();
        while (it.hasNext()) {
            it.next().attabal(firebaseRemoteConfigException);
        }
    }

    public final synchronized void monoploid(long j) {
        try {
            if (beachfront()) {
                int i = this.f22830dern;
                if (i > 0) {
                    this.f22830dern = i - 1;
                    this.f22828competently.schedule(new attabal(), j, TimeUnit.MILLISECONDS);
                } else if (!this.f22835marial) {
                    molybdenite(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String polloi(InputStream inputStream) {
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

    public void preprohormone(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(C3460cc.b);
        dovishness(httpURLConnection, str2);
        byte[] bytes = taiyuan(str).toString().getBytes(A5.O);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public void rotuma(boolean z) {
        this.f22835marial = z;
    }

    public final void stratoscope(Date date) {
        int iSaneness = this.f22825arytenoidectomy.impromptu().saneness() + 1;
        this.f22825arytenoidectomy.triweekly(iSaneness, new Date(date.getTime() + impassible(iSaneness)));
    }

    public final JSONObject taiyuan(String str) {
        HashMap map = new HashMap();
        map.put("project", apical(this.f22837taiyuan.kowloon().dern()));
        map.put("namespace", this.f22832impassible);
        map.put("lastKnownVersionNumber", Long.toString(this.f22833impromptu.monoploid()));
        map.put("appId", this.f22837taiyuan.kowloon().dern());
        map.put("sdkVersion", "22.1.0");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    public final String triweekly(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", apical(this.f22837taiyuan.kowloon().dern()), str);
    }

    /* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
    public class saneness implements neuropteran.dern {
        public saneness() {
        }

        @Override // neuropteran.dern
        public void attabal(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            dern.this.cutely();
            dern.this.molybdenite(firebaseRemoteConfigException);
        }

        @Override // neuropteran.dern
        public void saneness(neuropteran.saneness sanenessVar) {
        }
    }
}
