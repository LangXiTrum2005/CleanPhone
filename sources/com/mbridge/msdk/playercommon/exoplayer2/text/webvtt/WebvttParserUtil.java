package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
    private static final Pattern HEADER = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    private WebvttParserUtil() {
    }

    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String line;
        while (true) {
            String line2 = parsableByteArray.readLine();
            if (line2 == null) {
                return null;
            }
            if (COMMENT.matcher(line2).matches()) {
                do {
                    line = parsableByteArray.readLine();
                    if (line == null) {
                        break;
                    }
                } while (!line.isEmpty());
            } else {
                Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, "\\.");
        long j10 = 0;
        for (String str2 : Util.split(strArrSplitAtFirst[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplitAtFirst.length == 2) {
            j11 += Long.parseLong(strArrSplitAtFirst[1]);
        }
        return j11 * 1000;
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        String line = parsableByteArray.readLine();
        if (line == null || !HEADER.matcher(line).matches()) {
            throw new SubtitleDecoderException(e.n("Expected WEBVTT. Got ", line));
        }
    }
}
