package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2881Xh {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4705tu f3988a;
    public final AW b;
    public final Executor c;
    public final Clock d;
    public final Random e;
    public final C2777Th f;
    public final ConfigFetchHttpClient g;
    public final C3633hi h;
    public final Map i;

    public C2881Xh(InterfaceC4705tu interfaceC4705tu, AW aw, ScheduledExecutorService scheduledExecutorService, Clock clock, Random random, C2777Th c2777Th, ConfigFetchHttpClient configFetchHttpClient, C3633hi c3633hi, HashMap map) {
        this.f3988a = interfaceC4705tu;
        this.b = aw;
        this.c = scheduledExecutorService;
        this.d = clock;
        this.e = random;
        this.f = c2777Th;
        this.g = configFetchHttpClient;
        this.h = c3633hi;
        this.i = map;
    }

    public final C2855Wh a(String str, String str2, Date date, Map map) throws C2427Fu {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.g;
            HashMap mapD = d();
            String string = this.h.f4465a.getString("last_fetch_etag", null);
            InterfaceC3227d4 interfaceC3227d4 = (InterfaceC3227d4) this.b.get();
            C2855Wh c2855WhFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, interfaceC3227d4 == null ? null : (Long) ((C3315e4) interfaceC3227d4).f4306a.getUserProperties(null, null, true).get("_fot"), date);
            C2803Uh c2803Uh = c2855WhFetch.b;
            if (c2803Uh != null) {
                C3633hi c3633hi = this.h;
                long j2 = c2803Uh.f;
                synchronized (c3633hi.b) {
                    c3633hi.f4465a.edit().putLong("last_template_version", j2).apply();
                }
            }
            String str4 = c2855WhFetch.c;
            if (str4 != null) {
                this.h.d(str4);
            }
            this.h.c(0, C3633hi.f);
            return c2855WhFetch;
        } catch (C2479Hu e) {
            int i = e.f3191a;
            C3633hi c3633hi2 = this.h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = c3633hi2.a().f4427a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = k;
                long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
                c3633hi2.c(i2, new Date(date.getTime() + (millis / 2) + ((long) this.e.nextInt((int) millis))));
            }
            C3545gi c3545giA = c3633hi2.a();
            int i3 = e.f3191a;
            if (c3545giA.f4427a > 1 || i3 == 429) {
                c3545giA.b.getTime();
                throw new C2453Gu("Fetch was throttled.", 1);
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new C2401Eu("The throttled response from the server was not handled correctly by the FRC SDK.", 1);
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
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
            throw new C2479Hu(e.f3191a, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task b(long j2, Task task, final Map map) {
        Task taskContinueWithTask;
        final Date date = new Date(this.d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        C3633hi c3633hi = this.h;
        if (zIsSuccessful) {
            c3633hi.getClass();
            Date date2 = new Date(c3633hi.f4465a.getLong("last_fetch_time_in_millis", -1L));
            if (!date2.equals(C3633hi.e) && date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()))) {
                return Tasks.forResult(new C2855Wh(2, null, null));
            }
        }
        Date date3 = c3633hi.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new C2453Gu(str, 1));
        } else {
            C4617su c4617su = (C4617su) this.f3988a;
            final Task taskD = c4617su.d();
            final Task taskE = c4617su.e();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskE}).continueWithTask(executor, new Continuation() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vh
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task taskOnSuccessTask;
                    Date date5 = date;
                    Map map2 = map;
                    C2881Xh c2881Xh = this.f3885a;
                    c2881Xh.getClass();
                    Task task3 = taskD;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new C2401Eu("Firebase Installations failed to get installation ID for fetch.", task3.getException(), 1));
                    }
                    Task task4 = taskE;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new C2401Eu("Firebase Installations failed to get installation auth token for fetch.", task4.getException(), 1));
                    }
                    try {
                        C2855Wh c2855WhA = c2881Xh.a((String) task3.getResult(), ((C3146c8) task4.getResult()).f4207a, date5, map2);
                        if (c2855WhA.f3933a != 0) {
                            taskOnSuccessTask = Tasks.forResult(c2855WhA);
                        } else {
                            C2777Th c2777Th = c2881Xh.f;
                            C2803Uh c2803Uh = c2855WhA.b;
                            c2777Th.getClass();
                            GJ gj = new GJ(4, c2777Th, c2803Uh);
                            Executor executor2 = c2777Th.f3784a;
                            taskOnSuccessTask = Tasks.call(executor2, gj).onSuccessTask(executor2, new C2809Un(c2777Th, c2803Uh)).onSuccessTask(c2881Xh.c, new Md0(c2855WhA, 29));
                        }
                        return taskOnSuccessTask;
                    } catch (C2427Fu e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new C3285dk(16, this, date));
    }

    public final Task c(int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", DM.b(2) + "/" + i);
        return this.f.b().continueWithTask(this.c, new C3285dk(17, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        InterfaceC3227d4 interfaceC3227d4 = (InterfaceC3227d4) this.b.get();
        if (interfaceC3227d4 == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : ((C3315e4) interfaceC3227d4).f4306a.getUserProperties(null, null, false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
