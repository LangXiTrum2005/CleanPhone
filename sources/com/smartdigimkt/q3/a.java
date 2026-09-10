package com.smartdigimkt.q3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.smartdigimkt.n8.r;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37869a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37870b = r.a("dggRsoxvIodjv");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37871c = r.a("ghhsOlqn");
    private static final String d = r.a("snjQdph");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f37872e = r.a("frqwhqw=22frp1klkrqru1lg1urxwhu1urxwhufrqwhqwsurylghu2ghhsolqnVwduwBurxwhDxwkrulw|@frp1klkrqru1ppv1dgv1uhprwh");

    public static Intent a(Context context, Intent intent) {
        try {
            Method method = intent.getClass().getMethod(a(), Integer.class);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(intent, Integer.valueOf(b()));
            intent.addFlags(268435456);
            return intent;
        } catch (Throwable unused) {
            return a(intent, "chooser");
        }
    }

    private static int b() {
        return 131072;
    }

    private static String a() {
        return f37870b;
    }

    public static Intent a(Intent intent, String str) {
        try {
            intent.setFlags(805339136);
            return Intent.createChooser(intent, str);
        } catch (Exception unused) {
            return intent;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f37871c, str);
            jSONObject.put(d, str2);
            return a(context, jSONObject.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return false;
            }
            try {
                Cursor cursorQuery = contentResolver.query(Uri.parse(f37872e), null, str, null, null, null);
                if (cursorQuery == null) {
                    if (cursorQuery == null) {
                        return false;
                    }
                    cursorQuery.close();
                    return false;
                }
                try {
                    Bundle extras = cursorQuery.getExtras();
                    if (extras == null) {
                        cursorQuery.close();
                        return false;
                    }
                    if (extras.getInt("code") == 0) {
                        cursorQuery.close();
                        return true;
                    }
                    extras.getString("msg");
                    cursorQuery.close();
                    return false;
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                th.getMessage();
                return false;
            } catch (Throwable th3) {
                th3.getMessage();
                return false;
            }
        } catch (Throwable th4) {
            th4.getMessage();
            return false;
        }
    }
}
