package qd;

import android.text.format.DateUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f48963i = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f48964j = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc.d f48965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc.b f48966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f48967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f48968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f48969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f48970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f48971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f48972h;

    public g(uc.d dVar, tc.b bVar, Executor executor, Random random, b bVar2, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap map) {
        this.f48965a = dVar;
        this.f48966b = bVar;
        this.f48967c = executor;
        this.f48968d = random;
        this.f48969e = bVar2;
        this.f48970f = configFetchHttpClient;
        this.f48971g = mVar;
        this.f48972h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws pd.d {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f48970f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f48970f;
            HashMap mapD = d();
            String string = this.f48971g.f49007a.getString("last_fetch_etag", null);
            qb.b bVar = (qb.b) this.f48966b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((qb.c) bVar).f48930a.f24514a.a(null, null, true).get("_fot") : null, date, this.f48971g.b());
            c cVar = fVarFetch.f48961b;
            if (cVar != null) {
                m mVar = this.f48971g;
                long j10 = cVar.f48950f;
                synchronized (mVar.f49008b) {
                    mVar.f49007a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fVarFetch.f48962c;
            if (str4 != null) {
                m mVar2 = this.f48971g;
                synchronized (mVar2.f49008b) {
                    mVar2.f49007a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f48971g.d(0, m.f49006f);
            return fVarFetch;
        } catch (pd.f e10) {
            int i10 = e10.f48335a;
            m mVar3 = this.f48971g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = mVar3.a().f49003a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f48964j;
                long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                mVar3.d(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f48968d.nextInt((int) millis))));
            }
            l lVarA = mVar3.a();
            int i12 = e10.f48335a;
            if (lVarA.f49003a > 1 || i12 == 429) {
                lVarA.f49004b.getTime();
                throw new pd.e("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new pd.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new pd.f(e10.f48335a, "Fetch failed: ".concat(str3), e10);
        }
    }

    public final Task b(Task task, long j10, final HashMap map) {
        final g gVar;
        Task taskContinueWithTask;
        boolean zBefore;
        final Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        m mVar = this.f48971g;
        if (zIsSuccessful) {
            Date date2 = new Date(mVar.f49007a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(m.f49005e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new f(2, null, null));
            }
        }
        Date date3 = mVar.a().f49004b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f48967c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new pd.e(str));
            gVar = this;
        } else {
            uc.c cVar = (uc.c) this.f48965a;
            final Task taskC = cVar.c();
            final Task taskD = cVar.d();
            gVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskD}).continueWithTask(executor, new Continuation() { // from class: qd.e
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    g gVar2 = this.f48955a;
                    Date date5 = date;
                    HashMap map2 = map;
                    Task task3 = taskC;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new pd.c("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = taskD;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new pd.c("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        f fVarA = gVar2.a((String) task3.getResult(), ((uc.a) task4.getResult()).f51979a, date5, map2);
                        if (fVarA.f48960a != 0) {
                            return Tasks.forResult(fVarA);
                        }
                        b bVar = gVar2.f48969e;
                        c cVar2 = fVarA.f48961b;
                        Executor executor2 = bVar.f48941a;
                        return Tasks.call(executor2, new com.unity3d.ads.core.data.repository.a(2, bVar, cVar2)).onSuccessTask(executor2, new cj.h(25, bVar, cVar2)).onSuccessTask(gVar2.f48967c, new k3.j(fVarA, 23));
                    } catch (pd.d e10) {
                        return Tasks.forException(e10);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new cj.h(26, gVar, date));
    }

    public final Task c(int i10) {
        HashMap map = new HashMap(this.f48972h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.f48969e.b().continueWithTask(this.f48967c, new cj.h(27, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        qb.b bVar = (qb.b) this.f48966b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((qb.c) bVar).f48930a.f24514a.a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
