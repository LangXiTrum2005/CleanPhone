package com.thinkup.core.common.no.m;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.dc;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class om0 {
    private static final String m = "\"([^\"]*)\"";
    private static final String o = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String m0;
    private final String om;
    private final String on;
    private final String oo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f42068n = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern o0 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private om0(String str, String str2, String str3, String str4) {
        this.oo = str;
        this.om = str2;
        this.on = str3;
        this.m0 = str4;
    }

    public static om0 m(String str) {
        try {
            return o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private Charset n() {
        return o((Charset) null);
    }

    public static om0 o(String str) {
        Matcher matcher = f42068n.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(a.i(AbstractJsonLexerKt.STRING, "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = o0.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + AbstractJsonLexerKt.STRING);
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(dc.M)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = android.support.v4.media.a.f(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(a.p(androidx.datastore.preferences.protobuf.a.q("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \""), str, AbstractJsonLexerKt.STRING));
                }
                str2 = strGroup3;
            }
        }
        return new om0(str, lowerCase, lowerCase2, str2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof om0) && ((om0) obj).oo.equals(this.oo);
    }

    public final int hashCode() {
        return this.oo.hashCode();
    }

    public final String toString() {
        return this.oo;
    }

    private String m() {
        return this.on;
    }

    public final String o() {
        return this.om;
    }

    public final Charset o(Charset charset) {
        try {
            String str = this.m0;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
