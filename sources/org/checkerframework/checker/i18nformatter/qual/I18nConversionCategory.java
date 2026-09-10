package org.checkerframework.checker.i18nformatter.qual;

import java.util.Date;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes7.dex */
public enum I18nConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(new Class[]{Date.class, Number.class}),
    /* JADX INFO: Fake field, exist only in values array */
    NUMBER(new Class[]{Number.class});

    public final Class[] X;

    I18nConversionCategory(Class[] clsArr) {
        this.X = clsArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder(name());
        Class[] clsArr = this.X;
        if (clsArr == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class cls : clsArr) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
