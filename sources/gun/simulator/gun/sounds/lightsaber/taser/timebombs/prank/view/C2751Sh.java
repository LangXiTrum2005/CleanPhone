package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2751Sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3727a;
    public final HttpURLConnection b;
    public final C2881Xh c;
    public final C2777Th d;
    public final C2674Pi e;
    public final ScheduledExecutorService f;
    public final Random g = new Random();

    public C2751Sh(HttpURLConnection httpURLConnection, C2881Xh c2881Xh, C2777Th c2777Th, Set set, C2674Pi c2674Pi, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = c2881Xh;
        this.d = c2777Th;
        this.f3727a = set;
        this.e = c2674Pi;
        this.f = scheduledExecutorService;
    }

    public final void a(int i, long j) {
        if (i == 0) {
            new C2479Hu("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        this.f.schedule(new RunnableC2725Rh(this, i, j), this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strH = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strH = DM.h(strH, line);
            if (line.contains("}")) {
                int iIndexOf = strH.indexOf(123);
                int iLastIndexOf = strH.lastIndexOf(EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE);
                String strSubstring = "";
                if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf < iLastIndexOf) {
                    strSubstring = strH.substring(iIndexOf, iLastIndexOf + 1);
                }
                strH = strSubstring;
                if (strH.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strH);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            C2674Pi c2674Pi = this.e;
                            new C2479Hu("The server is temporarily unavailable. Try again in a few minutes.");
                            c2674Pi.a();
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f3727a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.c.h.f4465a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        strH = "";
                    } catch (JSONException e) {
                        new C2401Eu("Unable to parse config update message.", e.getCause(), 1);
                        d();
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            b(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final synchronized void d() {
        Iterator it = this.f3727a.iterator();
        while (it.hasNext()) {
            ((C2674Pi) it.next()).a();
        }
    }
}
