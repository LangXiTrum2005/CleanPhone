package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.B5;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f36675e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f36676f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36680d;

    private u(String str, String str2, String str3, String str4) {
        this.f36677a = str;
        this.f36678b = str2;
        this.f36679c = str3;
        this.f36680d = str4;
    }

    public static u a(String str) {
        Matcher matcher = f36675e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(defpackage.e.f('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f36676f.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(B5.N)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(wi.d.k(defpackage.e.v("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \""), str, '\"'));
                }
                str2 = strGroup3;
            }
        }
        return new u(str, lowerCase, lowerCase2, str2);
    }

    public static u b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).f36677a.equals(this.f36677a);
    }

    public int hashCode() {
        return this.f36677a.hashCode();
    }

    public String toString() {
        return this.f36677a;
    }

    public Charset a(Charset charset) {
        try {
            String str = this.f36680d;
            if (str != null) {
                return Charset.forName(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return charset;
    }
}
