package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.ironsource.A5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import snarler.marial;

/* JADX INFO: compiled from: ConfigAutoFetch.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<neuropteran.dern> f22812attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ScheduledExecutorService f22813beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Random f22814competently = new Random();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ConfigFetchHandler f22815dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final neuropteran.dern f22816marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final HttpURLConnection f22817saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final marial f22818wireman;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConfigAutoFetch.java */
    public class RunnableC0328attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ long f22819arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ int f22820kowloon;

        public RunnableC0328attabal(int i, long j) {
            this.f22820kowloon = i;
            this.f22819arytenoidectomy = j;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            attabal.this.wireman(this.f22820kowloon, this.f22819arytenoidectomy);
        }
    }

    public attabal(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, marial marialVar, Set<neuropteran.dern> set, neuropteran.dern dernVar, ScheduledExecutorService scheduledExecutorService) {
        this.f22817saneness = httpURLConnection;
        this.f22815dern = configFetchHandler;
        this.f22818wireman = marialVar;
        this.f22812attabal = set;
        this.f22816marial = dernVar;
        this.f22813beachfront = scheduledExecutorService;
    }

    public static /* synthetic */ Task attabal(attabal attabalVar, Task task, Task task2, long j, int i, Task task3) throws JSONException {
        attabalVar.getClass();
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.attabal attabalVar2 = (ConfigFetchHandler.attabal) task.getResult();
        saneness sanenessVarAttabal = (saneness) task2.getResult();
        if (!marial(attabalVar2, j).booleanValue()) {
            attabalVar.saneness(i, j);
            return Tasks.forResult(null);
        }
        if (attabalVar2.wireman() == null) {
            return Tasks.forResult(null);
        }
        if (sanenessVarAttabal == null) {
            sanenessVarAttabal = saneness.apical().attabal();
        }
        Set<String> setMarial = sanenessVarAttabal.marial(attabalVar2.wireman());
        if (setMarial.isEmpty()) {
            return Tasks.forResult(null);
        }
        attabalVar.dern(neuropteran.saneness.attabal(setMarial));
        return Tasks.forResult(null);
    }

    public static Boolean marial(ConfigFetchHandler.attabal attabalVar, long j) {
        if (attabalVar.wireman() != null) {
            return Boolean.valueOf(attabalVar.wireman().cutely() >= j);
        }
        return Boolean.valueOf(attabalVar.beachfront() == 1);
    }

    public final void beachfront(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, A5.O));
        loop0: while (true) {
            String strTaiyuan = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strTaiyuan = strTaiyuan + line;
                if (line.contains("}")) {
                    strTaiyuan = taiyuan(strTaiyuan);
                    if (strTaiyuan.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strTaiyuan);
                if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                    this.f22816marial.attabal(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (competently()) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long jMonoploid = this.f22815dern.monoploid();
                        long j = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j > jMonoploid) {
                            saneness(3, j);
                        }
                    }
                }
            } catch (JSONException e) {
                cutely(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final synchronized boolean competently() {
        return this.f22812attabal.isEmpty();
    }

    public final synchronized void cutely(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<neuropteran.dern> it = this.f22812attabal.iterator();
        while (it.hasNext()) {
            it.next().attabal(firebaseRemoteConfigException);
        }
    }

    public final synchronized void dern(neuropteran.saneness sanenessVar) {
        Iterator<neuropteran.dern> it = this.f22812attabal.iterator();
        while (it.hasNext()) {
            it.next().saneness(sanenessVar);
        }
    }

    public void impromptu() {
        HttpURLConnection httpURLConnection = this.f22817saneness;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            beachfront(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } finally {
            this.f22817saneness.disconnect();
        }
    }

    public final void saneness(int i, long j) {
        if (i == 0) {
            cutely(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.f22813beachfront.schedule(new RunnableC0328attabal(i, j), this.f22814competently.nextInt(4), TimeUnit.SECONDS);
        }
    }

    public final String taiyuan(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    public synchronized Task<Void> wireman(int i, final long j) throws Throwable {
        final int i2 = i - 1;
        try {
            try {
                final Task<ConfigFetchHandler.attabal> taskImpassible = this.f22815dern.impassible(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
                final Task<saneness> taskWireman = this.f22818wireman.wireman();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskImpassible, taskWireman}).continueWithTask(this.f22813beachfront, new Continuation() { // from class: snarler.attabal
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return com.google.firebase.remoteconfig.internal.attabal.attabal(this.f37645attabal, taskImpassible, taskWireman, j, i2, task);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
