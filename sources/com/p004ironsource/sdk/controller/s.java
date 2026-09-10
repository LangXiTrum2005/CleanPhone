package com.p004ironsource.sdk.controller;

import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.ln;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27018b = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27019a;

    public s(String str) {
        this.f27019a = str;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public String b() {
        return this.f27019a;
    }

    private String a(String str) {
        try {
            return ln.a(str);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return b(str);
        }
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return "";
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f27019a));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }
}
