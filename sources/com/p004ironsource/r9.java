package com.p004ironsource;

import android.util.Log;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.smartdigimkt.o1.b;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/r9;", "Ljava/lang/Runnable;", "", "run", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "stringToSend", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JSONObject stringToSend;

    public r9(JSONObject stringToSend) {
        Intrinsics.f(stringToSend, "stringToSend");
        this.stringToSend = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(q9.d().f26554h).openConnection();
            Intrinsics.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(ko.f25535b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.stringToSend.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
            Log.i(b.g, httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.stringToSend.get("crashType") + " and date " + this.stringToSend.get("crashDate"));
        } catch (Exception e2) {
            IronLog.INTERNAL.error(e2.toString());
        }
    }
}
