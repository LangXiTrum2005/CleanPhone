package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4617su implements InterfaceC4705tu {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4266ou f5004a;
    public final C4442qu b;
    public final C3491g4 c;
    public final Yg0 d;
    public final C3157cH e;
    public final C3262dX f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public C4617su(C4266ou c4266ou, AW aw, ExecutorService executorService, C40 c40) {
        c4266ou.a();
        C4442qu c4442qu = new C4442qu(c4266ou.f4812a, aw);
        C3491g4 c3491g4 = new C3491g4(c4266ou, 13);
        if (C2498In.b == null) {
            C2498In.b = new C2498In(4);
        }
        C2498In c2498In = C2498In.b;
        if (Yg0.d == null) {
            Yg0.d = new Yg0(c2498In);
        }
        Yg0 yg0 = Yg0.d;
        C3157cH c3157cH = new C3157cH(new C3631hh(c4266ou, 2));
        C3262dX c3262dX = new C3262dX();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.f5004a = c4266ou;
        this.b = c4442qu;
        this.c = c3491g4;
        this.d = yg0;
        this.e = c3157cH;
        this.f = c3262dX;
        this.h = executorService;
        this.i = c40;
    }

    public final void a(InterfaceC5171z90 interfaceC5171z90) {
        synchronized (this.g) {
            this.l.add(interfaceC5171z90);
        }
    }

    public final void b(boolean z) {
        C3761j8 c3761j8E;
        synchronized (m) {
            try {
                C4266ou c4266ou = this.f5004a;
                c4266ou.a();
                C3491g4 c3491g4O = C3491g4.o(c4266ou.f4812a);
                try {
                    c3761j8E = this.c.E();
                    EnumC3699iU enumC3699iU = EnumC3699iU.b;
                    EnumC3699iU enumC3699iU2 = c3761j8E.b;
                    if (enumC3699iU2 == enumC3699iU || enumC3699iU2 == EnumC3699iU.f4502a) {
                        String strH = h(c3761j8E);
                        C3491g4 c3491g4 = this.c;
                        C3274de0 c3274de0A = c3761j8E.a();
                        c3274de0A.f4281a = strH;
                        c3274de0A.k(EnumC3699iU.c);
                        c3761j8E = c3274de0A.f();
                        c3491g4.B(c3761j8E);
                    }
                    if (c3491g4O != null) {
                        c3491g4O.F();
                    }
                } catch (Throwable th) {
                    if (c3491g4O != null) {
                        c3491g4O.F();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z) {
            C3274de0 c3274de0A2 = c3761j8E.a();
            c3274de0A2.c = null;
            c3761j8E = c3274de0A2.f();
        }
        k(c3761j8E);
        this.i.execute(new RunnableC4529ru(this, z, 0));
    }

    public final C3761j8 c(C3761j8 c3761j8) throws C4793uu {
        HttpURLConnection httpURLConnectionC;
        C4113n8 c4113n8F;
        C4266ou c4266ou = this.f5004a;
        c4266ou.a();
        String str = c4266ou.c.f2897a;
        c4266ou.a();
        String str2 = c4266ou.c.g;
        String str3 = c3761j8.d;
        C4442qu c4442qu = this.b;
        SY sy = c4442qu.c;
        if (!sy.b()) {
            throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
        }
        URL urlA = C4442qu.a("projects/" + str2 + "/installations/" + c3761j8.f4538a + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = c4442qu.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty(HttpRequestHeader.Authorization, "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    C4442qu.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    sy.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c4113n8F = C4442qu.f(httpURLConnectionC);
                        break;
                    }
                    C4442qu.b(httpURLConnectionC, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        C4568sM c4568sMA = C4113n8.a();
                        c4568sMA.d = Pc0.c;
                        c4113n8F = c4568sMA.i();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new C4793uu("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 1);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C4568sM c4568sMA2 = C4113n8.a();
                        c4568sMA2.d = Pc0.b;
                        c4113n8F = c4568sMA2.i();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iOrdinal = c4113n8F.c.ordinal();
        if (iOrdinal == 0) {
            Yg0 yg0 = this.d;
            yg0.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            yg0.f4032a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C3274de0 c3274de0A = c3761j8.a();
            c3274de0A.c = c4113n8F.f4731a;
            c3274de0A.e = Long.valueOf(c4113n8F.b);
            c3274de0A.f = Long.valueOf(seconds);
            return c3274de0A.f();
        }
        if (iOrdinal == 1) {
            C3274de0 c3274de0A2 = c3761j8.a();
            c3274de0A2.g = "BAD CONFIG";
            c3274de0A2.k(EnumC3699iU.e);
            return c3274de0A2.f();
        }
        if (iOrdinal != 2) {
            throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
        }
        l(null);
        C3274de0 c3274de0A3 = c3761j8.a();
        c3274de0A3.k(EnumC3699iU.b);
        return c3274de0A3.f();
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new C2456Gx(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new RunnableC2928Zc(this, 18));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new C2430Fx(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new RunnableC4529ru(this, false, 1));
        return task;
    }

    public final void f(C3761j8 c3761j8) {
        synchronized (m) {
            try {
                C4266ou c4266ou = this.f5004a;
                c4266ou.a();
                C3491g4 c3491g4O = C3491g4.o(c4266ou.f4812a);
                try {
                    this.c.B(c3761j8);
                    if (c3491g4O != null) {
                        c3491g4O.F();
                    }
                } catch (Throwable th) {
                    if (c3491g4O != null) {
                        c3491g4O.F();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        C4266ou c4266ou = this.f5004a;
        c4266ou.a();
        Preconditions.checkNotEmpty(c4266ou.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c4266ou.a();
        Preconditions.checkNotEmpty(c4266ou.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c4266ou.a();
        Preconditions.checkNotEmpty(c4266ou.c.f2897a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c4266ou.a();
        String str = c4266ou.c.b;
        Pattern pattern = Yg0.c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c4266ou.a();
        Preconditions.checkArgument(Yg0.c.matcher(c4266ou.c.f2897a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[Catch: all -> 0x0037, DONT_GENERATE, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x002f, B:12:0x0035, B:16:0x0039, B:17:0x003d), top: B:26:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x002f, B:12:0x0035, B:16:0x0039, B:17:0x003d), top: B:26:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final String h(C3761j8 c3761j8) {
        C3329eC c3329eC;
        String strA;
        C4266ou c4266ou = this.f5004a;
        c4266ou.a();
        if (c4266ou.b.equals("CHIME_ANDROID_SDK")) {
            if (c3761j8.b == EnumC3699iU.f4502a) {
                c3329eC = (C3329eC) this.e.get();
                synchronized (c3329eC.f4312a) {
                    strA = c3329eC.a();
                    if (strA != null) {
                        strA = c3329eC.b();
                    }
                    if (TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f.getClass();
                    return C3262dX.a();
                }
            }
        } else {
            C4266ou c4266ou2 = this.f5004a;
            c4266ou2.a();
            if ("[DEFAULT]".equals(c4266ou2.b)) {
                if (c3761j8.b == EnumC3699iU.f4502a) {
                    c3329eC = (C3329eC) this.e.get();
                    synchronized (c3329eC.f4312a) {
                        try {
                            strA = c3329eC.a();
                            if (strA != null) {
                                strA = c3329eC.b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f.getClass();
                    return C3262dX.a();
                }
            }
        }
        this.f.getClass();
        return C3262dX.a();
    }

    public final C3761j8 i(C3761j8 c3761j8) throws C4793uu {
        C3058b8 c3058b8E;
        String str = c3761j8.f4538a;
        int i = 0;
        String string = null;
        if (str != null && str.length() == 11) {
            C3329eC c3329eC = (C3329eC) this.e.get();
            synchronized (c3329eC.f4312a) {
                try {
                    String[] strArr = C3329eC.c;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break;
                        }
                        String str2 = strArr[i2];
                        String string2 = c3329eC.f4312a.getString("|T|" + c3329eC.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(BidResponsed.KEY_TOKEN);
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
        C4442qu c4442qu = this.b;
        C4266ou c4266ou = this.f5004a;
        c4266ou.a();
        String str3 = c4266ou.c.f2897a;
        String str4 = c3761j8.f4538a;
        C4266ou c4266ou2 = this.f5004a;
        c4266ou2.a();
        String str5 = c4266ou2.c.g;
        C4266ou c4266ou3 = this.f5004a;
        c4266ou3.a();
        String str6 = c4266ou3.c.b;
        SY sy = c4442qu.c;
        if (!sy.b()) {
            throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
        }
        URL urlA = C4442qu.a("projects/" + str5 + "/installations");
        while (true) {
            if (i > 1) {
                throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c4442qu.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C4442qu.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    sy.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c3058b8E = C4442qu.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    C4442qu.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new C4793uu("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 1);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C3058b8 c3058b8 = new C3058b8(null, null, null, null, EnumC4471rD.b);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c3058b8E = c3058b8;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iOrdinal = c3058b8E.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new C4793uu("Firebase Installations Service is unavailable. Please try again later.", 1);
            }
            C3274de0 c3274de0A = c3761j8.a();
            c3274de0A.g = "BAD CONFIG";
            c3274de0A.k(EnumC3699iU.e);
            return c3274de0A.f();
        }
        String str7 = c3058b8E.b;
        String str8 = c3058b8E.c;
        Yg0 yg0 = this.d;
        yg0.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yg0.f4032a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        C4113n8 c4113n8 = c3058b8E.d;
        String str9 = c4113n8.f4731a;
        long j = c4113n8.b;
        C3274de0 c3274de0A2 = c3761j8.a();
        c3274de0A2.f4281a = str7;
        c3274de0A2.k(EnumC3699iU.d);
        c3274de0A2.c = str9;
        c3274de0A2.d = str8;
        c3274de0A2.e = Long.valueOf(j);
        c3274de0A2.f = Long.valueOf(seconds);
        return c3274de0A2.f();
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC5171z90) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(C3761j8 c3761j8) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC5171z90) it.next()).a(c3761j8)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(C3761j8 c3761j8, C3761j8 c3761j9) {
        if (this.k.size() != 0 && !TextUtils.equals(c3761j8.f4538a, c3761j9.f4538a)) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                AbstractC3950lJ.z(it.next());
                throw null;
            }
        }
    }
}
