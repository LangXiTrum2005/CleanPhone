package com.bytedance.adsdk.lr.ka;

import com.ironsource.C3460cc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements di {
    @Override // com.bytedance.adsdk.lr.ka.di
    public ka ri(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(C3460cc.a);
        httpURLConnection.connect();
        return new ri(httpURLConnection);
    }
}
