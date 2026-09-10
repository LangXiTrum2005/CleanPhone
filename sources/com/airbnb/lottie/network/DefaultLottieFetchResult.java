package com.airbnb.lottie.network;

import com.airbnb.lottie.utils.Logger;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLottieFetchResult implements LottieFetchResult {
    public final HttpURLConnection X;

    public DefaultLottieFetchResult(HttpURLConnection httpURLConnection) {
        this.X = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.disconnect();
    }

    public final String d() {
        HttpURLConnection httpURLConnection = this.X;
        try {
            if (h()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
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
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e2) {
            Logger.c("get error failed ", e2);
            return e2.getMessage();
        }
    }

    public final boolean h() {
        try {
            return this.X.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
