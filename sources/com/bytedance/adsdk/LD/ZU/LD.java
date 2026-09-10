package com.bytedance.adsdk.LD.ZU;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LD implements lc {
    @Override // com.bytedance.adsdk.LD.ZU.lc
    public ZU Lxb(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new Lxb(httpURLConnection);
    }
}
