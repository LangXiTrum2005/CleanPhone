package com.smartdigimkt.c6;

import android.text.TextUtils;
import com.smartdigimkt.n8.g;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34327a = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34328b = "<VAST\\s.*version\\s*=\\s*\".*\"(\\s.*|)?>";

    public static boolean a(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(charSequence.charAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile(f34328b).matcher(str).find();
    }

    public static long a(String str) {
        Date date;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(g.f37187c, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e2) {
            e2.getMessage();
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }
}
