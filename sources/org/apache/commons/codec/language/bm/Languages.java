package org.apache.commons.codec.language.bm;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.codec.Resources;

/* JADX INFO: loaded from: classes7.dex */
public class Languages {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap f45210b = new EnumMap(NameType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LanguageSet f45211c;
    public static final LanguageSet d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f45212a;

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Languages$1, reason: invalid class name */
    public static class AnonymousClass1 extends LanguageSet {
        public final String toString() {
            return "NO_LANGUAGES";
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.Languages$2, reason: invalid class name */
    public static class AnonymousClass2 extends LanguageSet {
        public final String toString() {
            return "ANY_LANGUAGE";
        }
    }

    public static abstract class LanguageSet {
    }

    public static final class SomeLanguages extends LanguageSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f45213a;

        public SomeLanguages(HashSet hashSet) {
            this.f45213a = Collections.unmodifiableSet(hashSet);
        }

        public final String toString() {
            return "Languages(" + this.f45213a.toString() + ")";
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = f45210b;
            String strN = a.n("org/apache/commons/codec/language/bm/", nameType.X, "_languages.txt");
            HashSet hashSet = new HashSet();
            Scanner scanner = new Scanner(Resources.a(strN), "UTF-8");
            while (true) {
                boolean z2 = false;
                while (true) {
                    try {
                        if (!scanner.hasNextLine()) {
                            break;
                        }
                        String strTrim = scanner.nextLine().trim();
                        if (z2) {
                            if (strTrim.endsWith("*/")) {
                            }
                        } else if (strTrim.startsWith("/*")) {
                            z2 = true;
                        } else if (strTrim.length() > 0) {
                            hashSet.add(strTrim);
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
            }
            Languages languages = new Languages(Collections.unmodifiableSet(hashSet));
            scanner.close();
            enumMap.put(nameType, languages);
        }
        f45211c = new AnonymousClass1();
        d = new AnonymousClass2();
    }

    public Languages(Set set) {
        this.f45212a = set;
    }
}
