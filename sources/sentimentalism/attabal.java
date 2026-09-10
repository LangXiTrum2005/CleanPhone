package sentimentalism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: DefaultLottieFetchResult.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal implements dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final HttpURLConnection f37512kowloon;

    public attabal(HttpURLConnection httpURLConnection) {
        this.f37512kowloon = httpURLConnection;
    }

    public final String attabal(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37512kowloon.disconnect();
    }

    @Override // sentimentalism.dern
    public boolean isSuccessful() {
        try {
            return this.f37512kowloon.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // sentimentalism.dern
    public String stratoscope() {
        return this.f37512kowloon.getContentType();
    }

    @Override // sentimentalism.dern
    public String treadless() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f37512kowloon.getURL() + ". Failed with " + this.f37512kowloon.getResponseCode() + "\n" + attabal(this.f37512kowloon);
        } catch (IOException | NullPointerException e) {
            utwa.beachfront.wireman("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // sentimentalism.dern
    public InputStream yemenite() throws IOException {
        return this.f37512kowloon.getInputStream();
    }
}
