package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.pm.PackageManager;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
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
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2700Qi {
    public static final int[] p = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3618a;
    public int c;
    public final ScheduledExecutorService f;
    public final C2881Xh g;
    public final C4266ou h;
    public final InterfaceC4705tu i;
    public final C2777Th j;
    public final Context k;
    public final C3633hi o;
    public boolean b = false;
    public final Random m = new Random();
    public final Clock n = DefaultClock.getInstance();
    public final String l = "firebase";
    public boolean d = false;
    public boolean e = false;

    public C2700Qi(C4266ou c4266ou, InterfaceC4705tu interfaceC4705tu, C2881Xh c2881Xh, C2777Th c2777Th, Context context, LinkedHashSet linkedHashSet, C3633hi c3633hi, ScheduledExecutorService scheduledExecutorService) {
        this.f3618a = linkedHashSet;
        this.f = scheduledExecutorService;
        this.c = Math.max(8 - c3633hi.b().f4427a, 1);
        this.h = c4266ou;
        this.g = c2881Xh;
        this.i = interfaceC4705tu;
        this.j = c2777Th;
        this.k = context;
        this.o = c3633hi;
    }

    public static void b(HttpURLConnection httpURLConnection) {
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

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
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
        return (this.f3618a.isEmpty() || this.b || this.d || this.e) ? false : true;
    }

    public final String c(String str) {
        C4266ou c4266ou = this.h;
        c4266ou.a();
        Matcher matcher = q.matcher(c4266ou.c.b);
        return AbstractC5044xl.n("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.f.schedule(new TY(this, 8), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new C2401Eu("Unable to connect to the server. Check your connection and try again.", 1);
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f3618a.iterator();
        while (it.hasNext()) {
            ((C2674Pi) it.next()).a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.o.b().b.getTime() - new Date(this.n.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z) {
        this.b = z;
    }

    public final void j(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strBytesToStringUppercase;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        C4266ou c4266ou = this.h;
        c4266ou.a();
        C2323Bu c2323Bu = c4266ou.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", c2323Bu.f2897a);
        Context context = this.k;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                context.getPackageName();
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpRequestHeader.Accept, "application/json");
        HashMap map = new HashMap();
        c4266ou.a();
        Matcher matcher = q.matcher(c2323Bu.b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.l);
        map.put("lastKnownVersionNumber", Long.toString(this.g.h.f4465a.getLong("last_template_version", 0L)));
        c4266ou.a();
        map.put("appId", c2323Bu.b);
        map.put("sdkVersion", "21.4.1");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized C2751Sh k(HttpURLConnection httpURLConnection) {
        return new C2751Sh(httpURLConnection, this.g, this.j, this.f3618a, new C2674Pi(this), this.f);
    }

    public final void l(Date date) {
        C3633hi c3633hi = this.o;
        int i = c3633hi.b().f4427a + 1;
        long millis = TimeUnit.MINUTES.toMillis(p[(i < 8 ? i : 8) - 1]);
        c3633hi.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.m.nextInt((int) millis))));
    }
}
