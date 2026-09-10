package com.p004ironsource;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class mb {
    public static final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25694e = 2;
    public static final String f = "C38FB23A402222A0C17D34A92F971D1F";
    public static final String g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25695h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f25696i = 32;
    private static final mb j = new mb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25697a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25698b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25699c = "";

    public static mb b() {
        return j;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f25699c)) {
            try {
                this.f25699c = nk.a(d(), g);
            } catch (Exception e2) {
                StringBuilder sbO = a.o(e2, "Session key encryption exception: ");
                sbO.append(e2.getLocalizedMessage());
                String string = sbO.toString();
                IronLog.INTERNAL.error(string);
                throw new JSONException(string);
            }
        }
        return this.f25699c;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f25697a)) {
            this.f25697a = f;
        }
        return this.f25697a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f25698b)) {
                this.f25698b = a(f25695h, 32);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25698b;
    }

    private String a(String str, int i2) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }
}
