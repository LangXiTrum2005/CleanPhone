package uc;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C0375hc;
import com.ironsource.InterfaceC0435l1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k9.c0;
import m5.k;
import org.json.JSONException;
import org.json.JSONObject;
import tb.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f51984m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.g f51985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc.c f51986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f51987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f51988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f51989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f51990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f51991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f51992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ub.k f51993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f51994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f51995k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public c(mb.g gVar, tc.b bVar, ExecutorService executorService, ub.k kVar) {
        gVar.a();
        wc.c cVar = new wc.c(gVar.f45928a, bVar);
        k kVar2 = new k(gVar, 26);
        if (v1.j.f52330b == null) {
            v1.j.f52330b = new v1.j(9);
        }
        v1.j jVar = v1.j.f52330b;
        if (j.f52003d == null) {
            j.f52003d = new j(jVar);
        }
        j jVar2 = j.f52003d;
        l lVar = new l(new tb.c(gVar, 2));
        h hVar = new h();
        this.f51991g = new Object();
        this.f51995k = new HashSet();
        this.l = new ArrayList();
        this.f51985a = gVar;
        this.f51986b = cVar;
        this.f51987c = kVar2;
        this.f51988d = jVar2;
        this.f51989e = lVar;
        this.f51990f = hVar;
        this.f51992h = executorService;
        this.f51993i = kVar;
    }

    public final void a() {
        vc.b bVarE;
        synchronized (f51984m) {
            try {
                mb.g gVar = this.f51985a;
                gVar.a();
                k kVarF = k.f(gVar.f45928a);
                try {
                    bVarE = this.f51987c.E();
                    int i10 = bVarE.f52544b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        String strF = f(bVarE);
                        k kVar = this.f51987c;
                        vc.a aVarA = bVarE.a();
                        aVarA.f52534a = strF;
                        aVarA.f52535b = 3;
                        bVarE = aVarA.a();
                        kVar.B(bVarE);
                    }
                    if (kVarF != null) {
                        kVarF.F();
                    }
                } catch (Throwable th2) {
                    if (kVarF != null) {
                        kVarF.F();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(bVarE);
        this.f51993i.execute(new b(this, 2));
    }

    public final vc.b b(vc.b bVar) throws e {
        int i10;
        wc.b bVar2;
        wc.b bVarF;
        wc.c cVar = this.f51986b;
        mb.g gVar = this.f51985a;
        gVar.a();
        String str = gVar.f45930c.f45943a;
        String str2 = bVar.f52543a;
        mb.g gVar2 = this.f51985a;
        gVar2.a();
        String str3 = gVar2.f45930c.f45950h;
        String str4 = bVar.f52546d;
        wc.d dVar = cVar.f53163c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = wc.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i11 = 0;
        while (true) {
            if (i11 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(C0375hc.f28789b);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    wc.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = wc.c.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    wc.c.b(httpURLConnectionC, null, str, str3);
                    i10 = i11;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new wc.b(3, 0L, null);
                        } else {
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                bVar2 = new wc.b(2, 0L, null);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11 = i10 + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (IOException | AssertionError unused2) {
                    i10 = i11;
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        int iC = v0.i.c(bVarF.f53158c);
        if (iC != 0) {
            if (iC == 1) {
                vc.a aVarA = bVar.a();
                aVarA.f52540g = "BAD CONFIG";
                aVarA.f52535b = 5;
                return aVarA.a();
            }
            if (iC != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f51994j = null;
            }
            vc.a aVarA2 = bVar.a();
            aVarA2.f52535b = 2;
            return aVarA2.a();
        }
        String str5 = bVarF.f53156a;
        long j10 = bVarF.f53157b;
        j jVar = this.f51988d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.f52004a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        vc.a aVarA3 = bVar.a();
        aVarA3.f52536c = str5;
        aVarA3.f52538e = j10;
        byte b10 = (byte) (aVarA3.f52541h | 1);
        aVarA3.f52539f = seconds;
        aVarA3.f52541h = (byte) (b10 | 2);
        return aVarA3.a();
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f51994j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f51991g) {
            this.l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f51992h.execute(new b(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.f51988d, taskCompletionSource);
        synchronized (this.f51991g) {
            this.l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f51992h.execute(new b(this, 1));
        return task;
    }

    public final void e() {
        mb.g gVar = this.f51985a;
        gVar.a();
        c0.f(gVar.f45930c.f45944b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.f(gVar.f45930c.f45950h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        c0.f(gVar.f45930c.f45943a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f45930c.f45944b;
        Pattern pattern = j.f52002c;
        c0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        c0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f52002c.matcher(gVar.f45930c.f45943a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public final String f(vc.b bVar) {
        jc.c cVar;
        String strEncodeToString;
        String str;
        String str2;
        PublicKey publicKeyGeneratePublic;
        mb.g gVar = this.f51985a;
        gVar.a();
        String str3 = gVar.f45929b;
        boolean zEquals = str3.equals("CHIME_ANDROID_SDK");
        h hVar = this.f51990f;
        if (!zEquals) {
            gVar.a();
            if ("[DEFAULT]".equals(str3)) {
                if (bVar.f52544b == 1) {
                    cVar = ((vc.c) this.f51989e.get()).f52553a;
                    strEncodeToString = null;
                    str = (String) cVar.b(vc.c.f52551d, null);
                    if (str != null) {
                        strEncodeToString = str;
                    } else {
                        str2 = (String) cVar.b(vc.c.f52550c, null);
                        if (str2 != null) {
                            try {
                                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                                Log.w("ContentValues", "Invalid key stored " + e10);
                                publicKeyGeneratePublic = null;
                            }
                            if (publicKeyGeneratePublic != null) {
                                try {
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + InterfaceC0435l1.d.b.f29113j) & 255);
                                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(strEncodeToString)) {
                        return strEncodeToString;
                    }
                    hVar.getClass();
                    return h.a();
                }
            }
        } else if (bVar.f52544b == 1) {
            cVar = ((vc.c) this.f51989e.get()).f52553a;
            strEncodeToString = null;
            str = (String) cVar.b(vc.c.f52551d, null);
            if (str != null) {
                strEncodeToString = str;
            } else {
                str2 = (String) cVar.b(vc.c.f52550c, null);
                if (str2 != null) {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 8)));
                    if (publicKeyGeneratePublic != null) {
                        byte[] bArrDigest2 = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                        bArrDigest2[0] = (byte) (((bArrDigest2[0] & 15) + InterfaceC0435l1.d.b.f29113j) & 255);
                        strEncodeToString = Base64.encodeToString(bArrDigest2, 0, 8, 11);
                    }
                }
            }
            if (TextUtils.isEmpty(strEncodeToString)) {
                return strEncodeToString;
            }
            hVar.getClass();
            return h.a();
        }
        hVar.getClass();
        return h.a();
    }

    public final vc.b g(vc.b bVar) throws e {
        wc.a aVarE;
        String str = bVar.f52543a;
        String string = null;
        if (str != null && str.length() == 11) {
            vc.c cVar = (vc.c) this.f51989e.get();
            cVar.getClass();
            for (String str2 : vc.c.f52552e) {
                String str3 = (String) cVar.f52553a.b(go.k.X("|T|" + cVar.f52554b + "|" + str2), null);
                if (str3 != null && !str3.isEmpty()) {
                    if (!str3.startsWith("{")) {
                        string = str3;
                        break;
                    }
                    try {
                        string = new JSONObject(str3).getString("token");
                        break;
                    } catch (JSONException unused) {
                        break;
                    }
                }
            }
        }
        mb.g gVar = this.f51985a;
        gVar.a();
        String str4 = gVar.f45930c.f45943a;
        gVar.a();
        String str5 = gVar.f45930c.f45950h;
        gVar.a();
        String str6 = gVar.f45930c.f45944b;
        wc.c cVar2 = this.f51986b;
        wc.d dVar = cVar2.f53163c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = wc.c.a("projects/" + str5 + "/installations");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar2.c(urlA, str4);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(C0375hc.f28789b);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    wc.c.g(httpURLConnectionC, str, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        aVarE = wc.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    wc.c.b(httpURLConnectionC, str6, str4, str5);
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        wc.a aVar = new wc.a(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVarE = aVar;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iC = v0.i.c(aVarE.f53155e);
        if (iC != 0) {
            if (iC != 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            vc.a aVarA = bVar.a();
            aVarA.f52540g = "BAD CONFIG";
            aVarA.f52535b = 5;
            return aVarA.a();
        }
        String str7 = aVarE.f53152b;
        String str8 = aVarE.f53153c;
        j jVar = this.f51988d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.f52004a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        wc.b bVar2 = aVarE.f53154d;
        String str9 = bVar2.f53156a;
        long j10 = bVar2.f53157b;
        vc.a aVarA2 = bVar.a();
        aVarA2.f52534a = str7;
        aVarA2.f52535b = 4;
        aVarA2.f52536c = str9;
        aVarA2.f52537d = str8;
        aVarA2.f52538e = j10;
        byte b10 = (byte) (aVarA2.f52541h | 1);
        aVarA2.f52539f = seconds;
        aVarA2.f52541h = (byte) (b10 | 2);
        return aVarA2.a();
    }

    public final void h(Exception exc) {
        synchronized (this.f51991g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(vc.b bVar) {
        synchronized (this.f51991g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
