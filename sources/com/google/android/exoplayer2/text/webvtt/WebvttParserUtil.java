package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttParserUtil {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i2 = Util.f18979a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void c(ParsableByteArray parsableByteArray) throws ParserException {
        int i2 = parsableByteArray.f18957b;
        Charset charset = Charsets.f19705c;
        String strH = parsableByteArray.h(charset);
        if (strH == null || !strH.startsWith("WEBVTT")) {
            parsableByteArray.F(i2);
            throw ParserException.a(null, "Expected WEBVTT. Got " + parsableByteArray.h(charset));
        }
    }
}
