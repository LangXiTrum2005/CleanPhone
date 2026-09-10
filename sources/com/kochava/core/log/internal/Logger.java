package com.kochava.core.log.internal;

import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import com.kochava.core.buffer.internal.CircularBuffer;
import com.kochava.core.json.internal.JsonArrayApi;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Logger implements LoggerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircularBuffer f28026a = new CircularBuffer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f28027b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f28028c = false;
    public volatile boolean d = false;

    public static String b(int i2, boolean z2) {
        switch (i2) {
            case 2:
                return z2 ? "Trace" : RequestConfiguration.MAX_AD_CONTENT_RATING_T;
            case 3:
                return z2 ? "Debug" : "D";
            case 4:
                return z2 ? "Info" : "I";
            case 5:
                return z2 ? "Warn" : "W";
            case 6:
                return z2 ? "Error" : "E";
            case 7:
                return z2 ? "None" : "N";
            default:
                return z2 ? "Info" : "I";
        }
    }

    public final ClassLoggerApi a(String str, String str2) {
        return new a(this, str, str2);
    }

    public final void c(Object obj, String str, String str2, int i2) {
        String string;
        int i3 = this.f28027b;
        if (!this.f28028c) {
            this.d = Log.isLoggable("kochava.forcelogging", 2);
            this.f28028c = true;
        }
        if (this.d || (i2 != 7 && i3 <= i2)) {
            try {
                if (obj instanceof String) {
                    JsonObjectApi jsonObjectApiK = ObjectUtil.k(obj);
                    if (jsonObjectApiK != null) {
                        string = jsonObjectApiK.a();
                    } else {
                        JsonArrayApi jsonArrayApiJ = ObjectUtil.j(obj);
                        string = jsonArrayApiJ != null ? jsonArrayApiJ.a() : (String) obj;
                    }
                } else if (obj instanceof JsonObjectApi) {
                    string = ((JsonObjectApi) obj).a();
                } else if (obj instanceof JsonArrayApi) {
                    string = ((JsonArrayApi) obj).a();
                } else if (obj instanceof Throwable) {
                    string = Log.getStackTraceString((Throwable) obj);
                } else {
                    string = obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
                }
            } catch (Throwable unused) {
                string = "";
            }
            LogItem logItem = new LogItem(i2, str, str2, string);
            if (i2 >= 4) {
                CircularBuffer circularBuffer = this.f28026a;
                synchronized (circularBuffer) {
                    try {
                        if (circularBuffer.f28009a.size() == 5) {
                            circularBuffer.f28009a.poll();
                        }
                        circularBuffer.f28009a.offer(logItem);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String strConcat = "KVA/".concat(str);
            for (String str3 : (str2 + ": " + string).split(IOUtils.LINE_SEPARATOR_UNIX)) {
                Log.println(logItem.f28023a, strConcat, str3);
            }
        }
    }
}
