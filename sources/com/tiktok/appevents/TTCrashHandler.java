package com.tiktok.appevents;

import android.support.v4.media.a;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import java.io.Serializable;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TTLogger f42665a = new TTLogger(TTCrashHandler.class.getCanonicalName(), TikTokBusinessSdk.f42661b);

    public static class TTCrashReport implements Serializable {

        public static class Monitor implements Serializable {
        }
    }

    static {
        new ArrayList();
    }

    public static void a(String str, Throwable th) {
        TTLogger tTLogger = f42665a;
        StringBuilder sbY = a.y("Error caused by sdk at ", str, IOUtils.LINE_SEPARATOR_UNIX);
        sbY.append(th.getMessage());
        sbY.append(IOUtils.LINE_SEPARATOR_UNIX);
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        sbY.append(sb.toString());
        String string = sbY.toString();
        Object[] objArr = new Object[0];
        if (tTLogger.f42675a.ordinal() >= TikTokBusinessSdk.LogLevel.X.ordinal()) {
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            } else if (objArr.length != 0) {
                string = String.format(string, objArr);
            }
            Log.e(tTLogger.f42676b, string, th);
        }
        try {
            new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                TikTokBusinessSdk.a();
                TTUtil.a(Long.valueOf(jCurrentTimeMillis));
                throw null;
            } catch (Exception unused) {
                new JSONObject();
                String str2 = TikTokBusinessSdk.f42660a;
                int i2 = SystemInfoUtil.f42671a;
                throw null;
            }
        } catch (Exception unused2) {
        }
    }
}
