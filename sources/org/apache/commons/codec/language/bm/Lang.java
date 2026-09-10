package org.apache.commons.codec.language.bm;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;

/* JADX INFO: loaded from: classes7.dex */
public class Lang {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap f45208b = new EnumMap(NameType.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45209a;

    public static final class LangRule {
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = f45208b;
            String strN = a.n("org/apache/commons/codec/language/bm/", nameType.X, "_lang.txt");
            Languages languages = (Languages) Languages.f45210b.get(nameType);
            ArrayList arrayList = new ArrayList();
            Scanner scanner = new Scanner(Resources.a(strN), "UTF-8");
            while (true) {
                boolean z2 = false;
                while (true) {
                    try {
                        if (scanner.hasNextLine()) {
                            String strNextLine = scanner.nextLine();
                            if (z2) {
                                if (strNextLine.endsWith("*/")) {
                                }
                            } else if (strNextLine.startsWith("/*")) {
                                z2 = true;
                            } else {
                                int iIndexOf = strNextLine.indexOf("//");
                                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                                if (strTrim.length() != 0) {
                                    String[] strArrSplit = strTrim.split("\\s+");
                                    if (strArrSplit.length != 3) {
                                        throw new IllegalArgumentException("Malformed line '" + strNextLine + "' in language resource '" + strN + "'");
                                    }
                                    Pattern.compile(strArrSplit[0]);
                                    String[] strArrSplit2 = strArrSplit[1].split("\\+");
                                    strArrSplit[2].equals(com.p004ironsource.mediationsdk.metadata.a.g);
                                    new HashSet(Arrays.asList(strArrSplit2));
                                    arrayList.add(new LangRule());
                                }
                            }
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
            scanner.close();
            enumMap.put(nameType, new Lang(arrayList, languages));
        }
    }

    public Lang(ArrayList arrayList, Languages languages) {
        this.f45209a = Collections.unmodifiableList(arrayList);
    }
}
