package com.smartdigimkt.n8;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37230a = "t";

    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    public static boolean a(String str, String str2) {
        try {
            File canonicalFile = new File(str).getCanonicalFile();
            File canonicalFile2 = new File(str2).getCanonicalFile();
            if (canonicalFile.exists() && canonicalFile2.exists()) {
                return canonicalFile.getPath().startsWith(canonicalFile2.getPath());
            }
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }
}
