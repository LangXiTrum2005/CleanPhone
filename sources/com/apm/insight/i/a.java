package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f10138a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f10139b = "";

    private a(Context context) {
        String string;
        if (f10138a == null) {
            synchronized (a.class) {
                if (f10138a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f10138a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f10138a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f10138a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f10138a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f10139b)) {
                new a(context);
                UUID uuid = f10138a;
                if (uuid != null) {
                    f10139b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10139b;
    }
}
