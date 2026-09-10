package com.smartdigimkt.n8;

import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37185a = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37186b = "yyyy-MM-dd";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37187c = "HH:mm:ss";

    public static String a(long j) {
        return a(j, f37185a);
    }

    public static String a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(Long.valueOf(j));
        } catch (Throwable unused) {
            return "";
        }
    }
}
