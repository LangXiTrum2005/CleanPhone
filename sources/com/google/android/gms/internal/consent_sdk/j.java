package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentInformation;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23054b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f23053a = i10;
        this.f23054b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23053a;
        Object obj = this.f23054b;
        switch (i10) {
            case 0:
                ((m) obj).b(new p1(4, "Web view timed out."));
                break;
            case 1:
                ((q) obj).b();
                break;
            case 2:
                c0 c0Var = (c0) obj;
                AtomicReference atomicReference = c0Var.f22975k;
                String str = (String) c0Var.f22965a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                } else {
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i11 = 0; i11 < size; i11++) {
                        u2 u2Var = (u2) ((Queue) atomicReference.get()).poll();
                        if (u2Var != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(c0Var.f22966b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod(C0375hc.f28789b);
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                int iC = u2Var.c();
                                Logger logger = o5.f23150g;
                                if (iC > 4096) {
                                    iC = 4096;
                                }
                                o5 o5Var = new o5(outputStream, iC);
                                u2Var.a(o5Var);
                                if (o5Var.f23155e > 0) {
                                    o5Var.k();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(u2Var);
                                }
                            } catch (IOException e10) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e10.getMessage())));
                                ((Queue) atomicReference.get()).add(u2Var);
                            } catch (URISyntaxException e11) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e11.getMessage());
                            }
                        }
                    }
                }
                break;
            default:
                ((ConsentInformation.OnConsentInfoUpdateSuccessListener) obj).onConsentInfoUpdateSuccess();
                break;
        }
    }
}
