package com.zg.adlib.util;

import androidx.datastore.preferences.protobuf.a;
import com.smartdigimkt.o1.b;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/zg/adlib/util/TimeUtil;", "", "<init>", "()V", "formatTime", "", "timestamp", "", "formatString", "formatHKTime", "getTimeZone", "Ljava/util/TimeZone;", "convertToHMS", "milliseconds", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeUtil {
    public static final TimeUtil INSTANCE = new TimeUtil();

    private TimeUtil() {
    }

    public final String convertToHMS(long milliseconds) {
        String strI;
        String strI2;
        String strI3;
        long j = milliseconds / ((long) 1000);
        long j2 = b.l2;
        long j3 = j / j2;
        if (j3 < 10) {
            strI = a.i(j3, "0");
        } else {
            strI = j3 + "";
        }
        long j4 = 60;
        long j5 = (j % j2) / j4;
        if (j5 < 10) {
            strI2 = a.i(j5, "0");
        } else {
            strI2 = j5 + "";
        }
        long j6 = j % j4;
        if (j6 < 10) {
            strI3 = a.i(j6, "0");
        } else {
            strI3 = j6 + "";
        }
        return strI + AbstractJsonLexerKt.COLON + strI2 + AbstractJsonLexerKt.COLON + strI3;
    }

    public final String formatHKTime(long timestamp, String formatString) {
        Intrinsics.f(formatString, "formatString");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT+08"));
        String str = simpleDateFormat.format(new Date(timestamp));
        Intrinsics.e(str, "format(...)");
        return str;
    }

    public final String formatTime(long timestamp, String formatString) {
        Intrinsics.f(formatString, "formatString");
        String str = new SimpleDateFormat(formatString, Locale.ENGLISH).format(new Date(timestamp));
        Intrinsics.e(str, "format(...)");
        return str;
    }

    public final TimeZone getTimeZone() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.e(timeZone, "getDefault(...)");
        return timeZone;
    }
}
