package com.mbridge.msdk.playercommon.exoplayer2.text.ssa;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.LongArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
    private static final String FORMAT_LINE_PREFIX = "Format: ";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    private static final String TAG = "SsaDecoder";
    private int formatEndIndex;
    private int formatKeyCount;
    private int formatStartIndex;
    private int formatTextIndex;
    private final boolean haveInitializationData;

    public SsaDecoder() {
        this(null);
    }

    private void parseDialogueLine(String str, List<Cue> list, LongArray longArray) {
        long timecodeUs;
        if (this.formatKeyCount == 0) {
            Log.w(TAG, "Skipping dialogue line before complete format: " + str);
            return;
        }
        String[] strArrSplit = str.substring(10).split(",", this.formatKeyCount);
        if (strArrSplit.length != this.formatKeyCount) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[this.formatStartIndex]);
        if (timecodeUs2 == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: ".concat(str));
            return;
        }
        String str2 = strArrSplit[this.formatEndIndex];
        if (str2.trim().isEmpty()) {
            timecodeUs = -9223372036854775807L;
        } else {
            timecodeUs = parseTimecodeUs(str2);
            if (timecodeUs == C.TIME_UNSET) {
                Log.w(TAG, "Skipping invalid timing: ".concat(str));
                return;
            }
        }
        list.add(new Cue(strArrSplit[this.formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        longArray.add(timecodeUs2);
        if (timecodeUs != C.TIME_UNSET) {
            list.add(null);
            longArray.add(timecodeUs);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<Cue> list, LongArray longArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if (!this.haveInitializationData && line.startsWith(FORMAT_LINE_PREFIX)) {
                parseFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                parseDialogueLine(line, list, longArray);
            }
        }
    }

    private void parseFormatLine(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(8), ",");
        this.formatKeyCount = strArrSplit.length;
        this.formatStartIndex = -1;
        this.formatEndIndex = -1;
        this.formatTextIndex = -1;
        for (int i10 = 0; i10 < this.formatKeyCount; i10++) {
            String lowerInvariant = Util.toLowerInvariant(strArrSplit[i10].trim());
            lowerInvariant.getClass();
            switch (lowerInvariant) {
                case "end":
                    this.formatEndIndex = i10;
                    break;
                case "text":
                    this.formatTextIndex = i10;
                    break;
                case "start":
                    this.formatStartIndex = i10;
                    break;
            }
        }
        if (this.formatStartIndex == -1 || this.formatEndIndex == -1 || this.formatTextIndex == -1) {
            this.formatKeyCount = 0;
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
        String line;
        do {
            line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
        } while (!line.startsWith("[Events]"));
    }

    public static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong(matcher.group(4)) * Xa.f27908s) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(1)) * 3600000000L);
    }

    public SsaDecoder(List<byte[]> list) {
        super(TAG);
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        parseFormatLine(strFromUtf8Bytes);
        parseHeader(new ParsableByteArray(list.get(1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public SsaSubtitle decode(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i10);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, longArray);
        Cue[] cueArr = new Cue[arrayList.size()];
        arrayList.toArray(cueArr);
        return new SsaSubtitle(cueArr, longArray.toArray());
    }
}
