package org.apache.commons.codec.language;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class DaitchMokotoffSoundex implements StringEncoder {

    /* JADX INFO: renamed from: org.apache.commons.codec.language.DaitchMokotoffSoundex$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<Rule> {
        @Override // java.util.Comparator
        public final int compare(Rule rule, Rule rule2) {
            return rule2.f45205a.length() - rule.f45205a.length();
        }
    }

    public static final class Branch {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45204a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Branch) {
                return toString().equals(((Branch) obj).toString());
            }
            return false;
        }

        public final int hashCode() {
            return toString().hashCode();
        }

        public final String toString() {
            this.f45204a.getClass();
            return this.f45204a;
        }
    }

    public static final class Rule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f45206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f45207c;
        public final String[] d;

        public Rule(String str, String str2, String str3, String str4) {
            this.f45205a = str;
            this.f45206b = str2.split("\\|");
            this.f45207c = str3.split("\\|");
            this.d = str4.split("\\|");
        }

        public final String toString() {
            return String.format("%s=(%s,%s,%s)", this.f45205a, Arrays.asList(this.f45206b), Arrays.asList(this.f45207c), Arrays.asList(this.d));
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Scanner scanner = new Scanner(Resources.a("org/apache/commons/codec/language/dmrules.txt"), "UTF-8");
        try {
            a(scanner, map, map2);
            scanner.close();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Collections.sort((List) ((Map.Entry) it.next()).getValue(), new AnonymousClass1());
            }
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
    }

    public static void a(Scanner scanner, HashMap map, HashMap map2) {
        int i2 = 0;
        boolean z2 = false;
        while (scanner.hasNextLine()) {
            i2++;
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
                } else if (strTrim.contains(d9.i.f24747b)) {
                    String[] strArrSplit = strTrim.split(d9.i.f24747b);
                    if (strArrSplit.length != 2) {
                        throw new IllegalArgumentException("Malformed folding statement split into " + strArrSplit.length + " parts: " + strNextLine + " in org/apache/commons/codec/language/dmrules.txt");
                    }
                    String str = strArrSplit[0];
                    String str2 = strArrSplit[1];
                    if (str.length() != 1 || str2.length() != 1) {
                        throw new IllegalArgumentException(a.n("Malformed folding statement - patterns are not single characters: ", strNextLine, " in org/apache/commons/codec/language/dmrules.txt"));
                    }
                    map2.put(Character.valueOf(str.charAt(0)), Character.valueOf(str2.charAt(0)));
                } else {
                    String[] strArrSplit2 = strTrim.split("\\s+");
                    if (strArrSplit2.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + strArrSplit2.length + " parts: " + strNextLine + " in org/apache/commons/codec/language/dmrules.txt");
                    }
                    try {
                        String strB = b(strArrSplit2[0]);
                        Rule rule = new Rule(strB, b(strArrSplit2[1]), b(strArrSplit2[2]), b(strArrSplit2[3]));
                        char cCharAt = strB.charAt(0);
                        List arrayList = (List) map.get(Character.valueOf(cCharAt));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(Character.valueOf(cCharAt), arrayList);
                        }
                        arrayList.add(rule);
                    } catch (IllegalArgumentException e2) {
                        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.k("Problem parsing line '", i2, "' in org/apache/commons/codec/language/dmrules.txt"), e2);
                    }
                }
            }
        }
    }

    public static String b(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? a.f(1, 0, str) : str;
    }
}
