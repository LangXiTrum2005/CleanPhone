package org.apache.commons.codec.language.bm;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneticEngine {

    /* JADX INFO: renamed from: org.apache.commons.codec.language.bm.PhoneticEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45215a;

        static {
            int[] iArr = new int[NameType.values().length];
            f45215a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45215a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45215a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class PhonemeBuilder {
    }

    public static final class RulesApplication {
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        enumMap.put(NameType.ASHKENAZI, Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put(NameType.SEPHARDIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
        enumMap.put(NameType.GENERIC, Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", "di", "do", "dos", "du", "van", "von"))));
    }
}
