package sentimentalism;

import com.ironsource.C3460cc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: DefaultLottieNetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements marial {
    @Override // sentimentalism.marial
    public dern attabal(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(C3460cc.a);
        httpURLConnection.connect();
        return new attabal(httpURLConnection);
    }
}
