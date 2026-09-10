package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes6.dex */
public class mo0 {
    private static final String o = "mo0";

    private static String o(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    private static boolean o(String str, String str2) {
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
