package com.facebook.internal.instrument.crashreport;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/facebook/internal/instrument/InstrumentData;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 5, 1})
final class CrashHandler$Companion$sendExceptionReports$validReports$3<T> implements Comparator {
    public static final CrashHandler$Companion$sendExceptionReports$validReports$3 X = new CrashHandler$Companion$sendExceptionReports$validReports$3();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InstrumentData instrumentData = (InstrumentData) obj;
        InstrumentData o2 = (InstrumentData) obj2;
        Intrinsics.e(o2, "o2");
        instrumentData.getClass();
        Long l2 = instrumentData.g;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = o2.g;
        if (l3 != null) {
            return (l3.longValue() > jLongValue ? 1 : (l3.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }
}
