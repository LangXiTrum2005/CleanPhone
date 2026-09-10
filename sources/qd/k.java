package qd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.ln0;
import com.ironsource.B5;
import com.ironsource.C0375hc;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f48984s = {2, 4, 8, 16, 32, 64, 128, NotificationCompat.FLAG_LOCAL_ONLY};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f48985t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f48986a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48988c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f48991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln0 f48992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f48993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f48994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.g f48995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final uc.d f48996k;
    public final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f48997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48998n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f49001q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48987b = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Random f48999o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p9.b f49000p = p9.b.f48278a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48989d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48990e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f49002r = new Object();

    public k(mb.g gVar, uc.d dVar, g gVar2, b bVar, Context context, String str, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f48986a = linkedHashSet;
        this.f48993h = scheduledExecutorService;
        this.f48988c = Math.max(8 - mVar.c().f49003a, 1);
        this.f48995j = gVar;
        this.f48994i = gVar2;
        this.f48996k = dVar;
        this.l = bVar;
        this.f48997m = context;
        this.f48998n = str;
        this.f49001q = mVar;
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        return (this.f48986a.isEmpty() || this.f48987b || this.f48989d || this.f48990e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f48991f;
        if (httpURLConnection != null && !this.f48990e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e11) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e11);
            }
        }
    }

    public final String c(String str) {
        mb.g gVar = this.f48995j;
        gVar.a();
        Matcher matcher = f48985t.matcher(gVar.f45930c.f45944b);
        return l1.d.h("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j10) {
        try {
            if (a()) {
                int i10 = this.f48988c;
                if (i10 > 0) {
                    this.f48988c = i10 - 1;
                    this.f48993h.schedule(new q5.a(this, 1), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f48990e) {
                    new pd.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f48986a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f49000p.getClass();
        e(Math.max(0L, this.f49001q.c().f49004b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strC;
        httpURLConnection.setRequestMethod(C0375hc.f28789b);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        mb.g gVar = this.f48995j;
        gVar.a();
        mb.i iVar = gVar.f45930c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", iVar.f45943a);
        Context context = this.f48997m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrF = p9.c.f(context, context.getPackageName());
            if (bArrF == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strC = null;
            } else {
                strC = p9.c.c(bArrF);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strC);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", com.ironsource.mediationsdk.metadata.a.f29610g);
        httpURLConnection.setRequestProperty("Content-Type", B5.M);
        httpURLConnection.setRequestProperty("Accept", B5.M);
        HashMap map = new HashMap();
        gVar.a();
        Matcher matcher = f48985t.matcher(iVar.f45944b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f48998n);
        map.put("lastKnownVersionNumber", Long.toString(this.f48994i.f48971g.f49007a.getLong("last_template_version", 0L)));
        gVar.a();
        map.put("appId", iVar.f45944b);
        map.put("sdkVersion", "23.1.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes(B5.O);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized ln0 j(HttpURLConnection httpURLConnection) {
        return new ln0(httpURLConnection, this.f48994i, this.l, this.f48986a, new j(this), this.f48993h, this.f49001q);
    }

    public final void k(Date date) {
        m mVar = this.f49001q;
        int i10 = mVar.c().f49003a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f48984s[(i10 < 8 ? i10 : 8) - 1]);
        mVar.e(i10, new Date(date.getTime() + (millis / 2) + ((long) this.f48999o.nextInt((int) millis))));
    }
}
