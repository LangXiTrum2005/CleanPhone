package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0421k5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f29025d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29026e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29027f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29028g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29029h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f29030i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C0421k5 f29031j = new C0421k5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29032a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29033b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29034c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public static C0421k5 b() {
        return f29031j;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f29032a)) {
            this.f29032a = f29027f;
        }
        return this.f29032a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f29033b)) {
                this.f29033b = a(f29029h, 32);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29033b;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f29034c)) {
            try {
                this.f29034c = C0247aa.a(d(), f29028g);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f29034c;
    }
}
