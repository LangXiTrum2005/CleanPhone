package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class rs0 {
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public final jk0 a;
    public final String b;

    static {
        Pattern patternCompile = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        c = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        d = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "compile(...)");
        e = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>[.\\s]*<\\s*head[^>]*>", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile4, "compile(...)");
        f = patternCompile4;
    }

    public rs0(jk0 flags, String gmaVersion) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.a = flags;
        this.b = gmaVersion;
    }

    public static String a(String str, String str2) {
        return StringsKt.stupefactive("\n      <script>Object.defineProperty(window,'" + str + "',{get:function(){return " + str2 + "}});</script>\n    ").toString();
    }

    public final String a() {
        return a("MRAID_ENV", StringsKt.stupefactive("\n      {\"version\": \"" + this.a.N() + "\", \"sdk\": \"Google Mobile Ads\", \"sdkVersion\": \"" + this.b + "\"}\n    ").toString());
    }

    public final String a(h1 configuration) {
        fw fwVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!this.a.R() || !configuration.N) {
            return null;
        }
        ay1 ay1Var = configuration.R;
        if (!ay1Var.c) {
            return null;
        }
        if (ay1Var.a == zx1.VIDEO) {
            fwVar = fw.e;
        } else {
            fwVar = fw.c;
        }
        return a("GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV", arytenoidectomy.cutely("\n      {\"creativeType\": \"" + fwVar + "\", \"contentUrl\": \"" + configuration.x + "\"}\n    "));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[PHI: r0
  0x006b: PHI (r0v6 java.lang.Integer) = (r0v5 java.lang.Integer), (r0v12 java.lang.Integer), (r0v19 java.lang.Integer) binds: [B:7:0x002c, B:13:0x004b, B:19:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static String a(String html, List scripts) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Matcher matcher = f.matcher(html);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        Intrinsics.checkNotNullParameter(matcher, "<this>");
        Integer numValueOf = matcher.find() ? Integer.valueOf(matcher.end()) : null;
        if (numValueOf == null) {
            Matcher matcher2 = e.matcher(html);
            Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
            Intrinsics.checkNotNullParameter(matcher2, "<this>");
            numValueOf = matcher2.find() ? Integer.valueOf(matcher2.end()) : null;
            if (numValueOf == null) {
                Matcher matcher3 = d.matcher(html);
                Intrinsics.checkNotNullExpressionValue(matcher3, "matcher(...)");
                Intrinsics.checkNotNullParameter(matcher3, "<this>");
                Integer numValueOf2 = matcher3.find() ? Integer.valueOf(matcher3.end()) : null;
                if (numValueOf2 != null) {
                    numValueOf = numValueOf2;
                    iIntValue = numValueOf.intValue();
                } else {
                    if (c.matcher(html).find()) {
                        return html;
                    }
                    iIntValue = 0;
                }
            } else {
                iIntValue = numValueOf.intValue();
            }
        } else {
            iIntValue = numValueOf.intValue();
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = html.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        Iterator it = scripts.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String strSubstring2 = html.substring(iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
