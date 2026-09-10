package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4784un implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f5101a;

    public C4784un(HttpURLConnection httpURLConnection) {
        this.f5101a = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5101a.disconnect();
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.f5101a;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            AbstractC5005xJ.c("get error failed ", e);
            return e.getMessage();
        }
    }
}
