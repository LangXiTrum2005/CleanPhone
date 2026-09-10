package org.apache.commons.codec.language.bm;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;

/* JADX INFO: loaded from: classes7.dex */
public class Rule {
    public static final RPattern d = new AnonymousClass1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumMap f45216e = new EnumMap(NameType.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RPattern f45217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhonemeExpr f45218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RPattern f45219c;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$1, reason: invalid class name */
    public static class AnonymousClass1 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$10, reason: invalid class name */
    final class AnonymousClass10 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$3, reason: invalid class name */
    final class AnonymousClass3 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$4, reason: invalid class name */
    final class AnonymousClass4 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$5, reason: invalid class name */
    final class AnonymousClass5 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$6, reason: invalid class name */
    final class AnonymousClass6 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$7, reason: invalid class name */
    final class AnonymousClass7 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$8, reason: invalid class name */
    final class AnonymousClass8 implements RPattern {
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$9, reason: invalid class name */
    final class AnonymousClass9 implements RPattern {
    }

    public static final class Phoneme implements PhonemeExpr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f45222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Languages.LanguageSet f45223b;

        /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Rule$Phoneme$1, reason: invalid class name */
        public static class AnonymousClass1 implements Comparator<Phoneme> {
            @Override // java.util.Comparator
            public final int compare(Phoneme phoneme, Phoneme phoneme2) {
                Phoneme phoneme3 = phoneme;
                Phoneme phoneme4 = phoneme2;
                int i2 = 0;
                while (true) {
                    int length = phoneme3.f45222a.length();
                    StringBuilder sb = phoneme3.f45222a;
                    if (i2 >= length) {
                        return sb.length() < phoneme4.f45222a.length() ? -1 : 0;
                    }
                    if (i2 >= phoneme4.f45222a.length()) {
                        return 1;
                    }
                    int iCharAt = sb.charAt(i2) - phoneme4.f45222a.charAt(i2);
                    if (iCharAt != 0) {
                        return iCharAt;
                    }
                    i2++;
                }
            }
        }

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.f45222a = new StringBuilder(charSequence);
            this.f45223b = languageSet;
        }

        public final String toString() {
            return this.f45222a.toString() + d9.i.d + this.f45223b + d9.i.f24752e;
        }
    }

    public interface PhonemeExpr {
    }

    public static final class PhonemeList implements PhonemeExpr {
    }

    public interface RPattern {
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap map = new HashMap();
                for (String str : ((Languages) Languages.f45210b.get(nameType)).f45212a) {
                    try {
                        Scanner scanner = new Scanner(Resources.a(a(nameType, ruleType, str)), "UTF-8");
                        try {
                            map.put(str, d(scanner, a(nameType, ruleType, str)));
                            scanner.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    scanner.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        throw new IllegalStateException("Problem processing ".concat(a(nameType, ruleType, str)), e2);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    Scanner scanner2 = new Scanner(Resources.a(a(nameType, ruleType, "common")), "UTF-8");
                    try {
                        map.put("common", d(scanner2, a(nameType, ruleType, "common")));
                        scanner2.close();
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            try {
                                scanner2.close();
                            } catch (Throwable th6) {
                                th4.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                }
                enumMap.put(ruleType, Collections.unmodifiableMap(map));
            }
            f45216e.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.f45217a = e(str2 + "$");
        StringBuilder sb = new StringBuilder("^");
        sb.append(str3);
        this.f45219c = e(sb.toString());
        this.f45218b = phonemeExpr;
    }

    public static String a(NameType nameType, RuleType ruleType, String str) {
        return a.r(androidx.datastore.preferences.protobuf.a.q("org/apache/commons/codec/language/bm/", nameType.X, "_", ruleType.X, "_"), str, ".txt");
    }

    public static Phoneme b(String str) {
        int iIndexOf = str.indexOf(d9.i.d);
        if (iIndexOf < 0) {
            return new Phoneme(str, Languages.d);
        }
        if (!str.endsWith(d9.i.f24752e)) {
            throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
        }
        String strSubstring = str.substring(0, iIndexOf);
        HashSet hashSet = new HashSet(Arrays.asList(a.f(1, iIndexOf + 1, str).split("[+]")));
        return new Phoneme(strSubstring, hashSet.isEmpty() ? Languages.f45211c : new Languages.SomeLanguages(hashSet));
    }

    public static PhonemeExpr c(String str) {
        if (!str.startsWith("(")) {
            return b(str);
        }
        if (!str.endsWith(")")) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String strF = a.f(1, 1, str);
        for (String str2 : strF.split("[|]")) {
            arrayList.add(b(str2));
        }
        if (strF.startsWith(com.smartdigimkt.b0.a.U1) || strF.endsWith(com.smartdigimkt.b0.a.U1)) {
            arrayList.add(new Phoneme("", Languages.d));
        }
        return new PhonemeList();
    }

    public static HashMap d(Scanner scanner, String str) {
        HashMap map = new HashMap();
        int i2 = 0;
        boolean z2 = false;
        while (scanner.hasNextLine()) {
            int i3 = i2 + 1;
            String strNextLine = scanner.nextLine();
            if (z2) {
                if (strNextLine.endsWith("*/")) {
                    z2 = false;
                }
            } else if (strNextLine.startsWith("/*")) {
                z2 = true;
            } else {
                int iIndexOf = strNextLine.indexOf("//");
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                if (strTrim.length() == 0) {
                    continue;
                } else if (strTrim.startsWith("#include")) {
                    String strTrim2 = strTrim.substring(8).trim();
                    if (strTrim2.contains(" ")) {
                        throw new IllegalArgumentException(a.o("Malformed import statement '", strNextLine, "' in ", str));
                    }
                    Scanner scanner2 = new Scanner(Resources.a(a.n("org/apache/commons/codec/language/bm/", strTrim2, ".txt")), "UTF-8");
                    try {
                        map.putAll(d(scanner2, str + "->" + strTrim2));
                        scanner2.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                scanner2.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    }
                } else {
                    String[] strArrSplit = strTrim.split("\\s+");
                    if (strArrSplit.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + strArrSplit.length + " parts: " + strNextLine + " in " + str);
                    }
                    try {
                        String strF = f(strArrSplit[0]);
                        String strF2 = f(strArrSplit[1]);
                        String strF3 = f(strArrSplit[2]);
                        Rule rule = new Rule(strF, strF2, strF3, c(f(strArrSplit[3])), i3, str, strF, strF2, strF3) { // from class: org.apache.commons.codec.language.bm.Rule.2
                            public final int f;
                            public final String g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ String f45220h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final /* synthetic */ String f45221i;
                            public final /* synthetic */ String j;

                            {
                                this.f45220h = strF;
                                this.f45221i = strF2;
                                this.j = strF3;
                                this.f = i3;
                                this.g = str;
                            }

                            public final String toString() {
                                StringBuilder sb = new StringBuilder("Rule{line=");
                                sb.append(this.f);
                                sb.append(", loc='");
                                sb.append(this.g);
                                sb.append("', pat='");
                                sb.append(this.f45220h);
                                sb.append("', lcon='");
                                sb.append(this.f45221i);
                                sb.append("', rcon='");
                                return a.r(sb, this.j, "'}");
                            }
                        };
                        String strSubstring = strF.substring(0, 1);
                        List arrayList = (List) map.get(strSubstring);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(strSubstring, arrayList);
                        }
                        arrayList.add(rule);
                    } catch (IllegalArgumentException e2) {
                        throw new IllegalStateException("Problem parsing line '" + i3 + "' in " + str, e2);
                    }
                }
            }
            i2 = i3;
        }
        return map;
    }

    public static RPattern e(String str) {
        boolean zStartsWith = str.startsWith("^");
        boolean zEndsWith = str.endsWith("$");
        int length = str.length();
        if (zEndsWith) {
            length--;
        }
        String strSubstring = str.substring(zStartsWith ? 1 : 0, length);
        if (strSubstring.contains(d9.i.d)) {
            boolean zStartsWith2 = strSubstring.startsWith(d9.i.d);
            boolean zEndsWith2 = strSubstring.endsWith(d9.i.f24752e);
            if (zStartsWith2 && zEndsWith2) {
                String strF = a.f(1, 1, strSubstring);
                if (!strF.contains(d9.i.d)) {
                    if (strF.startsWith("^")) {
                        strF.substring(1);
                    }
                    if (zStartsWith && zEndsWith) {
                        return new AnonymousClass7();
                    }
                    if (zStartsWith) {
                        return new AnonymousClass8();
                    }
                    if (zEndsWith) {
                        return new AnonymousClass9();
                    }
                }
            }
        } else {
            if (zStartsWith && zEndsWith) {
                return strSubstring.length() == 0 ? new AnonymousClass3() : new AnonymousClass4();
            }
            if ((zStartsWith || zEndsWith) && strSubstring.length() == 0) {
                return d;
            }
            if (zStartsWith) {
                return new AnonymousClass5();
            }
            if (zEndsWith) {
                return new AnonymousClass6();
            }
        }
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        Pattern.compile(str);
        return anonymousClass10;
    }

    public static String f(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? a.f(1, 0, str) : str;
    }
}
