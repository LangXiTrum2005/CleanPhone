package com.airbnb.lottie.network;

import com.p004ironsource.ko;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    public final DefaultLottieFetchResult a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(ko.f25534a);
        httpURLConnection.connect();
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
