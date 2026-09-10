package com.google.android.gms.ads.identifier;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IndexOutOfBoundsException e10) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e10.getMessage(), e10);
            }
        } catch (IOException | RuntimeException e11) {
            Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e11.getMessage(), e11);
        }
    }
}
