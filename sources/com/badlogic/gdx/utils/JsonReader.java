package com.badlogic.gdx.utils;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class JsonReader implements BaseJsonReader {
    static final int json_en_array = 23;
    static final int json_en_main = 1;
    static final int json_en_object = 5;
    static final int json_error = 0;
    static final int json_first_final = 35;
    static final int json_start = 1;
    private JsonValue current;
    private final Array<JsonValue> elements = new Array<>(8);
    private final Array<JsonValue> lastChild = new Array<>(8);
    private JsonValue root;
    private boolean stop;
    private static final byte[] _json_actions = init__json_actions_0();
    private static final short[] _json_key_offsets = init__json_key_offsets_0();
    private static final char[] _json_trans_keys = init__json_trans_keys_0();
    private static final byte[] _json_single_lengths = init__json_single_lengths_0();
    private static final byte[] _json_range_lengths = init__json_range_lengths_0();
    private static final short[] _json_index_offsets = init__json_index_offsets_0();
    private static final byte[] _json_indicies = init__json_indicies_0();
    private static final byte[] _json_trans_targs = init__json_trans_targs_0();
    private static final byte[] _json_trans_actions = init__json_trans_actions_0();
    private static final byte[] _json_eof_actions = init__json_eof_actions_0();

    private void addChild(@Null String str, JsonValue jsonValue) {
        jsonValue.setName(str);
        JsonValue jsonValue2 = this.current;
        if (jsonValue2 == null) {
            this.current = jsonValue;
            this.root = jsonValue;
            return;
        }
        if (!jsonValue2.isArray() && !this.current.isObject()) {
            this.root = this.current;
            return;
        }
        JsonValue jsonValue3 = this.current;
        jsonValue.parent = jsonValue3;
        if (jsonValue3.size == 0) {
            jsonValue3.child = jsonValue;
        } else {
            JsonValue jsonValuePop = this.lastChild.pop();
            jsonValuePop.next = jsonValue;
            jsonValue.prev = jsonValuePop;
        }
        this.lastChild.add(jsonValue);
        this.current.size++;
    }

    private static byte[] init__json_actions_0() {
        return new byte[]{0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    }

    private static byte[] init__json_eof_actions_0() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    }

    private static short[] init__json_index_offsets_0() {
        return new short[]{0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, 111, 113, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    }

    private static byte[] init__json_indicies_0() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, cw.k, cw.l, 3, cw.m, 11, 10, cw.n, cw.n, 17, 18, cw.n, 3, 19, 19, 20, 21, 19, 3, 22, 22, 3, 21, 21, 24, 3, 25, 3, 26, 3, 27, 21, 23, 28, 29, 29, 28, 30, 31, 32, 3, 33, 34, 34, 33, cw.k, 35, cw.m, 3, 34, 34, 12, 36, 37, 3, cw.m, 34, 10, cw.n, 3, 36, 36, 12, 3, 38, 3, 3, 36, 10, 39, 39, 3, 40, 40, 3, cw.k, cw.k, 12, 3, 41, 3, cw.m, cw.k, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, 45, 45, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, 61, 52, 3, 60, 60, 48, 62, 63, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    private static short[] init__json_key_offsets_0() {
        return new short[]{0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    }

    private static byte[] init__json_range_lengths_0() {
        return new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    }

    private static byte[] init__json_single_lengths_0() {
        return new byte[]{0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    }

    private static byte[] init__json_trans_actions_0() {
        return new byte[]{cw.k, 0, cw.m, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, cw.k, cw.m, 0, 7, 3, 1, 1, 1, 1, 23, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, cw.k, 0, cw.m, 0, 0, 7, 9, 3, 1, 1, 1, 1, 26, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    private static char[] init__json_trans_keys_0() {
        return new char[]{'\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '\"', '*', '/', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '\r', ' ', '/', ':', '\t', '\n', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', '}', '\t', '\n', '\r', ' ', ',', '/', '}', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '}', '\t', '\n', '*', '/', '*', '/', '\"', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\t', '\n', '\r', ' ', ',', '/', ']', '\t', '\n', '\r', ' ', ',', '/', ']', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '\"', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '*', '/', '\r', ' ', '\"', ',', '/', ':', '[', ']', '{', '\t', '\n', '*', '/', '*', '/', '*', '/', '\r', ' ', '/', '\t', '\n', '\r', ' ', '/', '\t', '\n', 0};
    }

    private static byte[] init__json_trans_targs_0() {
        return new byte[]{35, 1, 3, 0, 4, 36, 36, 36, 36, 1, 6, 5, cw.k, 17, 22, 37, 7, 8, 9, 7, 8, 9, 7, 10, 20, 21, 11, 11, 11, 12, 17, 19, 37, 11, 12, 19, cw.l, cw.n, cw.m, cw.l, 12, 18, 17, 11, 9, 5, 24, 23, 27, 31, 34, 25, 38, 25, 25, 26, 31, 33, 38, 25, 26, 33, 28, 30, 29, 28, 26, 32, 31, 25, 23, 2, 36, 2};
    }

    public void bool(@Null String str, boolean z) {
        addChild(str, new JsonValue(z));
    }

    public boolean isStopped() {
        return this.stop;
    }

    public void number(@Null String str, double d, String str2) {
        addChild(str, new JsonValue(d, str2));
    }

    public JsonValue parse(String str) {
        char[] charArray = str.toCharArray();
        return parse(charArray, 0, charArray.length);
    }

    public void pop() {
        this.root = this.elements.pop();
        if (this.current.size > 0) {
            this.lastChild.pop();
        }
        Array<JsonValue> array = this.elements;
        this.current = array.size > 0 ? array.peek() : null;
    }

    public void startArray(@Null String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        if (this.current != null) {
            addChild(str, jsonValue);
        }
        this.elements.add(jsonValue);
        this.current = jsonValue;
    }

    public void startObject(@Null String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.object);
        if (this.current != null) {
            addChild(str, jsonValue);
        }
        this.elements.add(jsonValue);
        this.current = jsonValue;
    }

    public void stop() {
        this.stop = true;
    }

    public void string(@Null String str, String str2) {
        addChild(str, new JsonValue(str2));
    }

    public String unescape(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length + 16);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\\') {
                stringBuilder.append(cCharAt);
                i = i2;
            } else {
                if (i2 == length) {
                    break;
                }
                int i3 = i + 2;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == 'u') {
                    i += 6;
                    stringBuilder.append(Character.toChars(Integer.parseInt(str.substring(i3, i), 16)));
                } else {
                    if (cCharAt2 != '\"' && cCharAt2 != '/' && cCharAt2 != '\\') {
                        if (cCharAt2 == 'b') {
                            cCharAt2 = '\b';
                        } else if (cCharAt2 == 'f') {
                            cCharAt2 = '\f';
                        } else if (cCharAt2 == 'n') {
                            cCharAt2 = '\n';
                        } else if (cCharAt2 == 'r') {
                            cCharAt2 = '\r';
                        } else {
                            if (cCharAt2 != 't') {
                                throw new SerializationException("Illegal escaped character: \\" + cCharAt2);
                            }
                            cCharAt2 = '\t';
                        }
                    }
                    stringBuilder.append(cCharAt2);
                    i = i3;
                }
            }
        }
        return stringBuilder.toString();
    }

    public void number(@Null String str, long j, String str2) {
        addChild(str, new JsonValue(j, str2));
    }

    public JsonValue parse(Reader reader) {
        char[] cArr = new char[1024];
        int i = 0;
        while (true) {
            try {
                try {
                    int i2 = reader.read(cArr, i, cArr.length - i);
                    if (i2 == -1) {
                        StreamUtils.closeQuietly(reader);
                        return parse(cArr, 0, i);
                    }
                    if (i2 == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i += i2;
                    }
                } catch (IOException e) {
                    throw new SerializationException("Error reading input.", e);
                }
            } catch (Throwable th) {
                StreamUtils.closeQuietly(reader);
                throw th;
            }
        }
    }

    @Override // com.badlogic.gdx.utils.BaseJsonReader
    public JsonValue parse(InputStream inputStream) {
        try {
            return parse(new InputStreamReader(inputStream, C.UTF8_NAME));
        } catch (Exception e) {
            throw new SerializationException("Error reading stream.", e);
        }
    }

    @Override // com.badlogic.gdx.utils.BaseJsonReader
    public JsonValue parse(FileHandle fileHandle) {
        try {
            try {
                return parse(fileHandle.reader(C.UTF8_NAME));
            } catch (Exception e) {
                throw new SerializationException(AbstractC5044xl.k("Error parsing file: ", fileHandle), e);
            }
        } catch (Exception e2) {
            throw new SerializationException(AbstractC5044xl.k("Error reading file: ", fileHandle), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9 A[LOOP:7: B:109:0x0180->B:136:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c9 A[Catch: RuntimeException -> 0x009b, LOOP:5: B:138:0x01c1->B:140:0x01c9, LOOP_END, TryCatch #10 {RuntimeException -> 0x009b, blocks: (B:260:0x0370, B:267:0x038a, B:273:0x039e, B:278:0x03a9, B:281:0x03b2, B:27:0x007e, B:68:0x011c, B:138:0x01c1, B:140:0x01c9, B:142:0x01d3, B:145:0x01dd), top: B:369:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01d3 A[Catch: RuntimeException -> 0x009b, TryCatch #10 {RuntimeException -> 0x009b, blocks: (B:260:0x0370, B:267:0x038a, B:273:0x039e, B:278:0x03a9, B:281:0x03b2, B:27:0x007e, B:68:0x011c, B:138:0x01c1, B:140:0x01c9, B:142:0x01d3, B:145:0x01dd), top: B:369:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01db A[ADDED_TO_REGION, LOOP:8: B:144:0x01db->B:148:0x01e3, LOOP_START, PHI: r5
  0x01db: PHI (r5v81 int) = (r5v74 int), (r5v83 int) binds: [B:143:0x01d9, B:148:0x01e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x01dd A[Catch: RuntimeException -> 0x009b, TRY_LEAVE, TryCatch #10 {RuntimeException -> 0x009b, blocks: (B:260:0x0370, B:267:0x038a, B:273:0x039e, B:278:0x03a9, B:281:0x03b2, B:27:0x007e, B:68:0x011c, B:138:0x01c1, B:140:0x01c9, B:142:0x01d3, B:145:0x01dd), top: B:369:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01eb A[LOOP:9: B:150:0x01eb->B:162:0x0206, LOOP_START, PHI: r5
  0x01eb: PHI (r5v75 int) = (r5v74 int), (r5v79 int) binds: [B:143:0x01d9, B:162:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x0204  */
    /* JADX WARN: Code duplicated, block: B:168:0x0215 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:175:0x022d A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0230 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0253 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0261 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0264 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:190:0x026e  */
    /* JADX WARN: Code duplicated, block: B:192:0x027b A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0285 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:196:0x028c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0294 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:200:0x029a A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:202:0x02a3 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:204:0x02a9 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:205:0x02ae A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:207:0x02b4 A[Catch: RuntimeException -> 0x0221, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:208:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:210:0x02bd A[Catch: RuntimeException -> 0x0221, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0221, blocks: (B:63:0x010a, B:165:0x020c, B:168:0x0215, B:172:0x0224, B:175:0x022d, B:177:0x0230, B:178:0x0239, B:180:0x024a, B:183:0x0253, B:184:0x0258, B:187:0x0261, B:189:0x0264, B:191:0x026f, B:192:0x027b, B:194:0x0285, B:237:0x0309, B:198:0x0294, B:200:0x029a, B:202:0x02a3, B:204:0x02a9, B:205:0x02ae, B:207:0x02b4, B:210:0x02bd, B:229:0x02ef, B:235:0x0305, B:232:0x02fa), top: B:355:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:213:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:219:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:221:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:230:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:232:0x02fa A[Catch: RuntimeException -> 0x0221, NumberFormatException -> 0x0305, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0305, blocks: (B:229:0x02ef, B:232:0x02fa), top: B:349:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:234:0x0302  */
    /* JADX WARN: Code duplicated, block: B:240:0x030f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0313  */
    /* JADX WARN: Code duplicated, block: B:249:0x033c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0355 A[Catch: RuntimeException -> 0x0401, TryCatch #4 {RuntimeException -> 0x0401, blocks: (B:252:0x0347, B:253:0x0351, B:255:0x0355, B:258:0x0367, B:264:0x0383, B:270:0x0397, B:275:0x03a2), top: B:357:0x0347 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x035e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0367 A[Catch: RuntimeException -> 0x0401, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0401, blocks: (B:252:0x0347, B:253:0x0351, B:255:0x0355, B:258:0x0367, B:264:0x0383, B:270:0x0397, B:275:0x03a2), top: B:357:0x0347 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0370 A[Catch: RuntimeException -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #10 {RuntimeException -> 0x009b, blocks: (B:260:0x0370, B:267:0x038a, B:273:0x039e, B:278:0x03a9, B:281:0x03b2, B:27:0x007e, B:68:0x011c, B:138:0x01c1, B:140:0x01c9, B:142:0x01d3, B:145:0x01dd), top: B:369:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0376  */
    /* JADX WARN: Code duplicated, block: B:263:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0383 A[Catch: RuntimeException -> 0x0401, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0401, blocks: (B:252:0x0347, B:253:0x0351, B:255:0x0355, B:258:0x0367, B:264:0x0383, B:270:0x0397, B:275:0x03a2), top: B:357:0x0347 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0389  */
    /* JADX WARN: Code duplicated, block: B:269:0x0396  */
    /* JADX WARN: Code duplicated, block: B:272:0x039d  */
    /* JADX WARN: Code duplicated, block: B:275:0x03a2 A[Catch: RuntimeException -> 0x0401, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0401, blocks: (B:252:0x0347, B:253:0x0351, B:255:0x0355, B:258:0x0367, B:264:0x0383, B:270:0x0397, B:275:0x03a2), top: B:357:0x0347 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:279:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:281:0x03b2 A[Catch: RuntimeException -> 0x009b, TRY_LEAVE, TryCatch #10 {RuntimeException -> 0x009b, blocks: (B:260:0x0370, B:267:0x038a, B:273:0x039e, B:278:0x03a9, B:281:0x03b2, B:27:0x007e, B:68:0x011c, B:138:0x01c1, B:140:0x01c9, B:142:0x01d3, B:145:0x01dd), top: B:369:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:284:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:286:0x03be  */
    /* JADX WARN: Code duplicated, block: B:294:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:295:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:300:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:304:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03f9 A[Catch: RuntimeException -> 0x03f0, NumberFormatException -> 0x040b, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x03f0, blocks: (B:313:0x040f, B:301:0x03e8, B:311:0x040b, B:306:0x03f9), top: B:361:0x040f }] */
    /* JADX WARN: Code duplicated, block: B:310:0x0404  */
    /* JADX WARN: Code duplicated, block: B:316:0x0415  */
    /* JADX WARN: Code duplicated, block: B:323:0x0435 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x0437  */
    /* JADX WARN: Code duplicated, block: B:326:0x043b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0441  */
    /* JADX WARN: Code duplicated, block: B:332:0x047d  */
    /* JADX WARN: Code duplicated, block: B:334:0x0483  */
    /* JADX WARN: Code duplicated, block: B:336:0x0490  */
    /* JADX WARN: Code duplicated, block: B:342:0x04a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:344:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:353:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0347 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:21:0x0058, B:37:0x00a0, B:39:0x00a6, B:41:0x00ae, B:42:0x00b1), top: B:351:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:408:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x01be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:? A[LOOP:4: B:365:0x0148->B:416:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x01be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[Catch: RuntimeException -> 0x00e5, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:21:0x0058, B:37:0x00a0, B:39:0x00a6, B:41:0x00ae, B:42:0x00b1), top: B:351:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7 A[Catch: RuntimeException -> 0x00df, TryCatch #7 {RuntimeException -> 0x00df, blocks: (B:57:0x00ed, B:59:0x00fb, B:44:0x00c3, B:46:0x00c7, B:48:0x00ce, B:50:0x00d4, B:51:0x00d7), top: B:363:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[Catch: RuntimeException -> 0x00df, TryCatch #7 {RuntimeException -> 0x00df, blocks: (B:57:0x00ed, B:59:0x00fb, B:44:0x00c3, B:46:0x00c7, B:48:0x00ce, B:50:0x00d4, B:51:0x00d7), top: B:363:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[Catch: RuntimeException -> 0x00df, TryCatch #7 {RuntimeException -> 0x00df, blocks: (B:57:0x00ed, B:59:0x00fb, B:44:0x00c3, B:46:0x00c7, B:48:0x00ce, B:50:0x00d4, B:51:0x00d7), top: B:363:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[Catch: RuntimeException -> 0x00df, TRY_LEAVE, TryCatch #7 {RuntimeException -> 0x00df, blocks: (B:57:0x00ed, B:59:0x00fb, B:44:0x00c3, B:46:0x00c7, B:48:0x00ce, B:50:0x00d4, B:51:0x00d7), top: B:363:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0113 A[PHI: r10
  0x0113: PHI (r10v47 int) = (r10v23 int), (r10v30 int), (r10v30 int), (r10v32 int) binds: [B:64:0x0110, B:431:0x0113, B:432:0x0113, B:149:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132 A[LOOP:3: B:68:0x011c->B:78:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x0150 A[ADDED_TO_REGION] */
    public JsonValue parse(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        RuntimeException runtimeException;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        char c;
        int i8;
        Array<JsonValue> array;
        JsonValue jsonValuePeek;
        int i9;
        int i10;
        byte b;
        int i11;
        int i12;
        int i13;
        int i14;
        char c2;
        char[] cArr2;
        byte b2;
        byte b3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        String str5;
        boolean z3;
        boolean z4;
        boolean z5;
        char c3;
        int i20;
        char c4;
        int i21;
        boolean z6;
        char c5;
        int i22;
        boolean z7;
        char c6;
        int i23;
        int i24;
        boolean z8;
        char c7;
        int i25;
        int i26;
        int i27;
        this.stop = false;
        int[] iArrCopyOf = new int[4];
        int i28 = 0;
        char c8 = 0;
        int i29 = 1;
        int i30 = 0;
        boolean z9 = false;
        String str6 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i31 = i;
        while (true) {
            String str7 = "null";
            String str8 = "false";
            int i32 = i30;
            try {
                if (c8 != 0) {
                    z9 = z9;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            if (c8 == 4) {
                                i30 = i32;
                                z9 = z9;
                                if (i31 == i2) {
                                    try {
                                        byte b4 = _json_eof_actions[i29];
                                        i5 = b4 + 1;
                                        i6 = _json_actions[b4];
                                        while (true) {
                                            i7 = i6 - 1;
                                            if (i6 > 0) {
                                                int i33 = i5 + 1;
                                                if (_json_actions[i5] != 1) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i4 = i31;
                                                } else {
                                                    str = new String(cArr, i30, i31 - i30);
                                                    if (z9) {
                                                        str = unescape(str);
                                                    }
                                                    if (z10) {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                        str4 = str;
                                                        z10 = false;
                                                    } else {
                                                        if (z11) {
                                                            if (str.equals("true")) {
                                                                bool(str6, true);
                                                            } else if (str.equals(str8)) {
                                                                bool(str6, false);
                                                            } else {
                                                                if (str.equals(str7)) {
                                                                    string(str6, null);
                                                                } else {
                                                                    z = false;
                                                                    z2 = true;
                                                                    while (true) {
                                                                        if (i30 < i31) {
                                                                            c = cArr[i30];
                                                                            str2 = str8;
                                                                            if (c == '+') {
                                                                                if (c == 'E' && c != 'e') {
                                                                                    if (c != '-') {
                                                                                        if (c != '.') {
                                                                                            switch (c) {
                                                                                                case '0':
                                                                                                case '1':
                                                                                                case '2':
                                                                                                case '3':
                                                                                                case '4':
                                                                                                case '5':
                                                                                                case '6':
                                                                                                case '7':
                                                                                                case Input.Keys.PERIOD /* 56 */:
                                                                                                case Input.Keys.ALT_LEFT /* 57 */:
                                                                                                    break;
                                                                                                default:
                                                                                                    z = false;
                                                                                                    z2 = false;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z = true;
                                                                                z2 = false;
                                                                            }
                                                                            i30++;
                                                                            str8 = str2;
                                                                        } else {
                                                                            str2 = str8;
                                                                        }
                                                                    }
                                                                    if (z) {
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                        try {
                                                                            number(str6, Double.parseDouble(str), str);
                                                                        } catch (NumberFormatException unused) {
                                                                            string(str6, str);
                                                                        }
                                                                    } else {
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                        if (z2) {
                                                                            number(str6, Long.parseLong(str), str);
                                                                        }
                                                                    }
                                                                }
                                                                str4 = null;
                                                            }
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i4 = i31;
                                                            str4 = null;
                                                        } else {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i4 = i31;
                                                        }
                                                        string(str6, str);
                                                        str4 = null;
                                                    }
                                                    try {
                                                        if (this.stop) {
                                                            i31 = i4;
                                                        } else {
                                                            str6 = str4;
                                                            i30 = i4;
                                                            z11 = false;
                                                        }
                                                    } catch (RuntimeException e) {
                                                        e = e;
                                                        runtimeException = e;
                                                        i31 = i4;
                                                    }
                                                }
                                                str7 = str3;
                                                i6 = i7;
                                                i31 = i4;
                                                i5 = i33;
                                                str8 = str2;
                                            }
                                        }
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        i4 = i31;
                                    }
                                }
                                i31 = i31;
                            }
                            runtimeException = null;
                            JsonValue jsonValue = this.root;
                            this.root = null;
                            this.current = null;
                            this.lastChild.clear();
                            if (!this.stop) {
                                if (i31 < i2) {
                                    i10 = 1;
                                    for (i9 = 0; i9 < i31; i9++) {
                                        if (cArr[i9] == '\n') {
                                            i10++;
                                        }
                                    }
                                    int iMax = Math.max(0, i31 - 32);
                                    java.lang.StringBuilder sbQ = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                                    sbQ.append(new String(cArr, iMax, i31 - iMax));
                                    sbQ.append("*ERROR*");
                                    sbQ.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                                    throw new SerializationException(sbQ.toString(), runtimeException);
                                }
                                array = this.elements;
                                if (array.size != 0) {
                                    jsonValuePeek = array.peek();
                                    this.elements.clear();
                                    if (jsonValuePeek == null && jsonValuePeek.isObject()) {
                                        throw new SerializationException("Error parsing JSON, unmatched brace.");
                                    }
                                    throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                }
                                if (runtimeException != null) {
                                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                }
                            }
                            return jsonValue;
                        }
                        i3 = i31;
                        i30 = i32;
                        z9 = z9;
                        if (i29 == 0) {
                            iArrCopyOf = iArrCopyOf;
                            i28 = i28;
                            i31 = i3;
                            c8 = 5;
                        } else {
                            i8 = i3 + 1;
                            if (i8 != i2) {
                                iArrCopyOf = iArrCopyOf;
                                i31 = i8;
                                i28 = i28;
                                c8 = 1;
                            } else {
                                i31 = i8;
                                if (i31 == i2) {
                                    byte b5 = _json_eof_actions[i29];
                                    i5 = b5 + 1;
                                    i6 = _json_actions[b5];
                                    while (true) {
                                        i7 = i6 - 1;
                                        if (i6 > 0) {
                                            int i34 = i5 + 1;
                                            if (_json_actions[i5] != 1) {
                                                str2 = str8;
                                                str3 = str7;
                                                i4 = i31;
                                            } else {
                                                str = new String(cArr, i30, i31 - i30);
                                                if (z9) {
                                                    str = unescape(str);
                                                }
                                                if (z10) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i4 = i31;
                                                    str4 = str;
                                                    z10 = false;
                                                } else {
                                                    if (z11) {
                                                        if (str.equals("true")) {
                                                            bool(str6, true);
                                                        } else if (str.equals(str8)) {
                                                            bool(str6, false);
                                                        } else {
                                                            if (str.equals(str7)) {
                                                                string(str6, null);
                                                            } else {
                                                                z = false;
                                                                z2 = true;
                                                                while (true) {
                                                                    if (i30 < i31) {
                                                                        c = cArr[i30];
                                                                        str2 = str8;
                                                                        if (c == '+') {
                                                                            if (c == 'E') {
                                                                                z = true;
                                                                                z2 = false;
                                                                            } else {
                                                                                z = true;
                                                                                z2 = false;
                                                                            }
                                                                        }
                                                                        i30++;
                                                                        str8 = str2;
                                                                    } else {
                                                                        str2 = str8;
                                                                    }
                                                                }
                                                                if (z) {
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    number(str6, Double.parseDouble(str), str);
                                                                } else {
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    if (z2) {
                                                                        number(str6, Long.parseLong(str), str);
                                                                    }
                                                                }
                                                            }
                                                            str4 = null;
                                                        }
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                        str4 = null;
                                                    } else {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                    }
                                                    string(str6, str);
                                                    str4 = null;
                                                }
                                                if (this.stop) {
                                                    i31 = i4;
                                                } else {
                                                    str6 = str4;
                                                    i30 = i4;
                                                    z11 = false;
                                                }
                                            }
                                            str7 = str3;
                                            i6 = i7;
                                            i31 = i4;
                                            i5 = i34;
                                            str8 = str2;
                                        }
                                        runtimeException = null;
                                        JsonValue jsonValue2 = this.root;
                                        this.root = null;
                                        this.current = null;
                                        this.lastChild.clear();
                                        if (!this.stop) {
                                            if (i31 < i2) {
                                                i10 = 1;
                                                while (i9 < i31) {
                                                    if (cArr[i9] == '\n') {
                                                        i10++;
                                                    }
                                                }
                                                int iMax2 = Math.max(0, i31 - 32);
                                                java.lang.StringBuilder sbQ2 = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                                                sbQ2.append(new String(cArr, iMax2, i31 - iMax2));
                                                sbQ2.append("*ERROR*");
                                                sbQ2.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                                                throw new SerializationException(sbQ2.toString(), runtimeException);
                                            }
                                            array = this.elements;
                                            if (array.size != 0) {
                                                jsonValuePeek = array.peek();
                                                this.elements.clear();
                                                if (jsonValuePeek == null) {
                                                }
                                                throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                            }
                                            if (runtimeException != null) {
                                                throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                            }
                                        }
                                        return jsonValue2;
                                    }
                                }
                                i31 = i31;
                            }
                        }
                    }
                    i31 = i31;
                    runtimeException = null;
                    JsonValue jsonValue3 = this.root;
                    this.root = null;
                    this.current = null;
                    this.lastChild.clear();
                    if (!this.stop) {
                        if (i31 < i2) {
                            i10 = 1;
                            while (i9 < i31) {
                                if (cArr[i9] == '\n') {
                                    i10++;
                                }
                            }
                            int iMax3 = Math.max(0, i31 - 32);
                            java.lang.StringBuilder sbQ3 = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                            sbQ3.append(new String(cArr, iMax3, i31 - iMax3));
                            sbQ3.append("*ERROR*");
                            sbQ3.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                            throw new SerializationException(sbQ3.toString(), runtimeException);
                        }
                        array = this.elements;
                        if (array.size != 0) {
                            jsonValuePeek = array.peek();
                            this.elements.clear();
                            if (jsonValuePeek == null) {
                            }
                            throw new SerializationException("Error parsing JSON, unmatched bracket.");
                        }
                        if (runtimeException != null) {
                            throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                        }
                    }
                    return jsonValue3;
                }
                z9 = z9;
                if (i31 == i2) {
                    i30 = i32;
                    z9 = z9;
                    c8 = 4;
                } else if (i29 == 0) {
                    i30 = i32;
                    z9 = z9;
                    c8 = 5;
                }
                short s = _json_key_offsets[i29];
                short s2 = _json_index_offsets[i29];
                byte b6 = _json_single_lengths[i29];
                int i35 = s;
                int i36 = s2;
                if (b6 > 0) {
                    int i37 = s + b6;
                    int i38 = s;
                    int i39 = i37 - 1;
                    while (true) {
                        if (i39 >= i38) {
                            int i40 = i38 + ((i39 - i38) >> 1);
                            int i41 = i38;
                            try {
                                char c9 = cArr[i31];
                                int i42 = i39;
                                char c10 = _json_trans_keys[i40];
                                if (c9 < c10) {
                                    i39 = i40 - 1;
                                    i38 = i41 == true ? 1 : 0;
                                } else if (c9 > c10) {
                                    i38 = i40 + 1;
                                    i39 = i42;
                                } else {
                                    i27 = (i40 - s) + s2;
                                    i3 = i31;
                                    i11 = i27;
                                    byte b7 = _json_indicies[i11];
                                    b2 = _json_trans_targs[b7];
                                    b3 = _json_trans_actions[b7];
                                    if (b3 != 0) {
                                        int i43 = b3 + 1;
                                        i15 = _json_actions[b3];
                                        i16 = i43;
                                        i30 = i32;
                                        i31 = i3;
                                        while (true) {
                                            i17 = i15 - 1;
                                            if (i15 > 0) {
                                                i18 = i16 + 1;
                                                switch (_json_actions[i16]) {
                                                    case 0:
                                                        i28 = i28;
                                                        iArr = iArrCopyOf;
                                                        z10 = true;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 1:
                                                        str5 = new String(cArr, i30, i31 - i30);
                                                        if (z9) {
                                                            str5 = unescape(str5);
                                                        }
                                                        if (z10) {
                                                            i28 = i28;
                                                            iArr = iArrCopyOf;
                                                            z10 = false;
                                                        } else {
                                                            if (z11) {
                                                                if (str5.equals("true")) {
                                                                    bool(str6, true);
                                                                } else if (str5.equals("false")) {
                                                                    bool(str6, false);
                                                                } else {
                                                                    if (str5.equals("null")) {
                                                                        string(str6, null);
                                                                    } else {
                                                                        z3 = false;
                                                                        z4 = true;
                                                                        while (true) {
                                                                            if (i30 < i31) {
                                                                                z3 = z3;
                                                                                c3 = cArr[i30];
                                                                                i28 = i28;
                                                                                if (c3 != '+') {
                                                                                    if (c3 != 'E') {
                                                                                        if (c3 != '-') {
                                                                                            if (c3 != '.') {
                                                                                                switch (c3) {
                                                                                                    case '0':
                                                                                                    case '1':
                                                                                                    case '2':
                                                                                                    case '3':
                                                                                                    case '4':
                                                                                                    case '5':
                                                                                                    case '6':
                                                                                                    case '7':
                                                                                                    case Input.Keys.PERIOD /* 56 */:
                                                                                                    case Input.Keys.ALT_LEFT /* 57 */:
                                                                                                        break;
                                                                                                    default:
                                                                                                        z4 = false;
                                                                                                        z5 = false;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            i28 = i28;
                                                                                        }
                                                                                    }
                                                                                    z3 = true;
                                                                                    z4 = false;
                                                                                    i30++;
                                                                                    i28 = i28;
                                                                                }
                                                                                i30++;
                                                                                i28 = i28;
                                                                            } else {
                                                                                z5 = z3;
                                                                                i28 = i28;
                                                                            }
                                                                        }
                                                                        if (z5) {
                                                                            iArr = iArrCopyOf;
                                                                            number(str6, Double.parseDouble(str5), str5);
                                                                        } else {
                                                                            iArr = iArrCopyOf;
                                                                            if (z4) {
                                                                                number(str6, Long.parseLong(str5), str5);
                                                                            }
                                                                        }
                                                                    }
                                                                    str5 = null;
                                                                }
                                                                i28 = i28;
                                                                iArr = iArrCopyOf;
                                                                str5 = null;
                                                            } else {
                                                                i28 = i28;
                                                                iArr = iArrCopyOf;
                                                            }
                                                            string(str6, str5);
                                                            str5 = null;
                                                        }
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i30 = i31;
                                                            str6 = str5;
                                                            z11 = false;
                                                            iArrCopyOf = iArr;
                                                            i15 = i17;
                                                            i16 = i18;
                                                            i28 = i28;
                                                        }
                                                        break;
                                                    case 2:
                                                        startObject(str6);
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i28 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i28] = b2;
                                                            i28++;
                                                            c8 = 2;
                                                            i29 = 5;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 3:
                                                        pop();
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i28--;
                                                            i19 = iArrCopyOf[i28];
                                                            i31 = i31;
                                                            z9 = z9;
                                                            c8 = 2;
                                                            i29 = i19;
                                                        }
                                                        break;
                                                    case 4:
                                                        startArray(str6);
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i28 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i28] = b2;
                                                            i28++;
                                                            c8 = 2;
                                                            i29 = 23;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 5:
                                                        pop();
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i28--;
                                                            i19 = iArrCopyOf[i28];
                                                            i31 = i31;
                                                            z9 = z9;
                                                            c8 = 2;
                                                            i29 = i19;
                                                        }
                                                        break;
                                                    case 6:
                                                        i20 = i31 + 1;
                                                        if (cArr[i31] == '/') {
                                                            while (i20 != i2) {
                                                                i20++;
                                                            }
                                                            i31 = i20 - 1;
                                                        } else {
                                                            while (true) {
                                                                i31 = i20 + 1;
                                                                if (i31 < i2) {
                                                                    if (cArr[i20] == '*') {
                                                                        if (cArr[i31] != '/') {
                                                                        }
                                                                    }
                                                                    i20 = i31;
                                                                }
                                                            }
                                                        }
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 7:
                                                        c4 = '\r';
                                                        i21 = i31;
                                                        if (z10) {
                                                            z7 = false;
                                                            while (true) {
                                                                c6 = cArr[i21];
                                                                z9 = z7;
                                                                if (c6 == '\n') {
                                                                }
                                                            }
                                                        } else {
                                                            z6 = false;
                                                            while (true) {
                                                                c5 = cArr[i21];
                                                                z9 = z6;
                                                                if (c5 == '\n') {
                                                                }
                                                                z6 = z9;
                                                                c4 = '\r';
                                                            }
                                                        }
                                                        i22 = i21 - 1;
                                                        while (Character.isSpace(cArr[i22])) {
                                                            i22--;
                                                        }
                                                        i30 = i31;
                                                        z11 = true;
                                                        i31 = i22;
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 8:
                                                        i23 = i31 + 1;
                                                        i24 = i23;
                                                        z8 = false;
                                                        while (true) {
                                                            c7 = cArr[i24];
                                                            i25 = i23;
                                                            if (c7 != '\"') {
                                                                if (c7 != '\\') {
                                                                    i26 = 1;
                                                                } else {
                                                                    i24++;
                                                                    i26 = 1;
                                                                    z8 = true;
                                                                }
                                                                i24 += i26;
                                                                if (i24 != i2) {
                                                                    i23 = i25;
                                                                }
                                                            }
                                                        }
                                                        i31 = i24 - 1;
                                                        i28 = i28;
                                                        iArr = iArrCopyOf;
                                                        z9 = z8;
                                                        i30 = i25;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    default:
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                }
                                            } else {
                                                i28 = i28;
                                                iArrCopyOf = iArrCopyOf;
                                                i3 = i31;
                                                z9 = z9;
                                                i29 = b2;
                                                if (i29 == 0) {
                                                    iArrCopyOf = iArrCopyOf;
                                                    i28 = i28;
                                                    i31 = i3;
                                                    c8 = 5;
                                                } else {
                                                    i8 = i3 + 1;
                                                    if (i8 != i2) {
                                                        iArrCopyOf = iArrCopyOf;
                                                        i31 = i8;
                                                        i28 = i28;
                                                        c8 = 1;
                                                    } else {
                                                        i31 = i8;
                                                        if (i31 == i2) {
                                                            byte b8 = _json_eof_actions[i29];
                                                            i5 = b8 + 1;
                                                            i6 = _json_actions[b8];
                                                            while (true) {
                                                                i7 = i6 - 1;
                                                                if (i6 > 0) {
                                                                    int i310 = i5 + 1;
                                                                    if (_json_actions[i5] != 1) {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                    } else {
                                                                        str = new String(cArr, i30, i31 - i30);
                                                                        if (z9) {
                                                                            str = unescape(str);
                                                                        }
                                                                        if (z10) {
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i4 = i31;
                                                                            str4 = str;
                                                                            z10 = false;
                                                                        } else {
                                                                            if (z11) {
                                                                                if (str.equals("true")) {
                                                                                    bool(str6, true);
                                                                                } else if (str.equals(str8)) {
                                                                                    bool(str6, false);
                                                                                } else {
                                                                                    if (str.equals(str7)) {
                                                                                        string(str6, null);
                                                                                    } else {
                                                                                        z = false;
                                                                                        z2 = true;
                                                                                        while (true) {
                                                                                            if (i30 < i31) {
                                                                                                c = cArr[i30];
                                                                                                str2 = str8;
                                                                                                if (c == '+') {
                                                                                                    if (c == 'E') {
                                                                                                        z = true;
                                                                                                        z2 = false;
                                                                                                    } else {
                                                                                                        z = true;
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                }
                                                                                                i30++;
                                                                                                str8 = str2;
                                                                                            } else {
                                                                                                str2 = str8;
                                                                                            }
                                                                                        }
                                                                                        if (z) {
                                                                                            str3 = str7;
                                                                                            i4 = i31;
                                                                                            number(str6, Double.parseDouble(str), str);
                                                                                        } else {
                                                                                            str3 = str7;
                                                                                            i4 = i31;
                                                                                            if (z2) {
                                                                                                number(str6, Long.parseLong(str), str);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str4 = null;
                                                                                }
                                                                                str2 = str8;
                                                                                str3 = str7;
                                                                                i4 = i31;
                                                                                str4 = null;
                                                                            } else {
                                                                                str2 = str8;
                                                                                str3 = str7;
                                                                                i4 = i31;
                                                                            }
                                                                            string(str6, str);
                                                                            str4 = null;
                                                                        }
                                                                        if (this.stop) {
                                                                            i31 = i4;
                                                                        } else {
                                                                            str6 = str4;
                                                                            i30 = i4;
                                                                            z11 = false;
                                                                        }
                                                                    }
                                                                    str7 = str3;
                                                                    i6 = i7;
                                                                    i31 = i4;
                                                                    i5 = i310;
                                                                    str8 = str2;
                                                                }
                                                                runtimeException = null;
                                                            }
                                                        }
                                                        i31 = i31;
                                                        i31 = i31;
                                                        runtimeException = null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i29 = b2;
                                        i30 = i32;
                                        z9 = z9;
                                        if (i29 == 0) {
                                            iArrCopyOf = iArrCopyOf;
                                            i28 = i28;
                                            i31 = i3;
                                            c8 = 5;
                                        } else {
                                            i8 = i3 + 1;
                                            if (i8 != i2) {
                                                iArrCopyOf = iArrCopyOf;
                                                i31 = i8;
                                                i28 = i28;
                                                c8 = 1;
                                            } else {
                                                i31 = i8;
                                                if (i31 == i2) {
                                                    byte b9 = _json_eof_actions[i29];
                                                    i5 = b9 + 1;
                                                    i6 = _json_actions[b9];
                                                    while (true) {
                                                        i7 = i6 - 1;
                                                        if (i6 > 0) {
                                                            int i311 = i5 + 1;
                                                            if (_json_actions[i5] != 1) {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i4 = i31;
                                                            } else {
                                                                str = new String(cArr, i30, i31 - i30);
                                                                if (z9) {
                                                                    str = unescape(str);
                                                                }
                                                                if (z10) {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    str4 = str;
                                                                    z10 = false;
                                                                } else {
                                                                    if (z11) {
                                                                        if (str.equals("true")) {
                                                                            bool(str6, true);
                                                                        } else if (str.equals(str8)) {
                                                                            bool(str6, false);
                                                                        } else {
                                                                            if (str.equals(str7)) {
                                                                                string(str6, null);
                                                                            } else {
                                                                                z = false;
                                                                                z2 = true;
                                                                                while (true) {
                                                                                    if (i30 < i31) {
                                                                                        c = cArr[i30];
                                                                                        str2 = str8;
                                                                                        if (c == '+') {
                                                                                            if (c == 'E') {
                                                                                                z = true;
                                                                                                z2 = false;
                                                                                            } else {
                                                                                                z = true;
                                                                                                z2 = false;
                                                                                            }
                                                                                        }
                                                                                        i30++;
                                                                                        str8 = str2;
                                                                                    } else {
                                                                                        str2 = str8;
                                                                                    }
                                                                                }
                                                                                if (z) {
                                                                                    str3 = str7;
                                                                                    i4 = i31;
                                                                                    number(str6, Double.parseDouble(str), str);
                                                                                } else {
                                                                                    str3 = str7;
                                                                                    i4 = i31;
                                                                                    if (z2) {
                                                                                        number(str6, Long.parseLong(str), str);
                                                                                    }
                                                                                }
                                                                            }
                                                                            str4 = null;
                                                                        }
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                        str4 = null;
                                                                    } else {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                    }
                                                                    string(str6, str);
                                                                    str4 = null;
                                                                }
                                                                if (this.stop) {
                                                                    i31 = i4;
                                                                } else {
                                                                    str6 = str4;
                                                                    i30 = i4;
                                                                    z11 = false;
                                                                }
                                                            }
                                                            str7 = str3;
                                                            i6 = i7;
                                                            i31 = i4;
                                                            i5 = i311;
                                                            str8 = str2;
                                                        }
                                                        runtimeException = null;
                                                    }
                                                }
                                                i31 = i31;
                                                i31 = i31;
                                                runtimeException = null;
                                            }
                                        }
                                    }
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                i31 = i31;
                                runtimeException = e;
                                JsonValue jsonValue4 = this.root;
                                this.root = null;
                                this.current = null;
                                this.lastChild.clear();
                                if (!this.stop) {
                                    if (i31 < i2) {
                                        i10 = 1;
                                        while (i9 < i31) {
                                            if (cArr[i9] == '\n') {
                                                i10++;
                                            }
                                        }
                                        int iMax4 = Math.max(0, i31 - 32);
                                        java.lang.StringBuilder sbQ4 = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                                        sbQ4.append(new String(cArr, iMax4, i31 - iMax4));
                                        sbQ4.append("*ERROR*");
                                        sbQ4.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                                        throw new SerializationException(sbQ4.toString(), runtimeException);
                                    }
                                    array = this.elements;
                                    if (array.size != 0) {
                                        jsonValuePeek = array.peek();
                                        this.elements.clear();
                                        if (jsonValuePeek == null) {
                                        }
                                        throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                    }
                                    if (runtimeException != null) {
                                        throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                    }
                                }
                                return jsonValue4;
                            }
                        } else {
                            i35 = i37;
                            i36 = s2 + b6;
                            b = _json_range_lengths[i29];
                            if (b > 0) {
                                i12 = ((b << 1) + i35) - 2;
                                i13 = i35;
                                while (true) {
                                    if (i12 < i13) {
                                        i27 = i36 + b;
                                        i3 = i31;
                                        i11 = i27;
                                    } else {
                                        i14 = i13 + (((i12 - i13) >> 1) & (-2));
                                        byte b10 = b;
                                        c2 = cArr[i31];
                                        cArr2 = _json_trans_keys;
                                        i3 = i31;
                                        if (c2 < cArr2[i14]) {
                                            i12 = i14 - 2;
                                        } else if (c2 > cArr2[i14 + 1]) {
                                            i13 = i14 + 2;
                                        } else {
                                            i11 = i36 + ((i14 - i35) >> 1);
                                        }
                                        b = b10;
                                        i31 = i3;
                                        i13 = i13;
                                    }
                                }
                            } else {
                                i3 = i31;
                                i11 = i36;
                            }
                            try {
                                byte b11 = _json_indicies[i11];
                                b2 = _json_trans_targs[b11];
                                b3 = _json_trans_actions[b11];
                                if (b3 != 0) {
                                    int i44 = b3 + 1;
                                    i15 = _json_actions[b3];
                                    i16 = i44;
                                    i30 = i32;
                                    i31 = i3;
                                    while (true) {
                                        i17 = i15 - 1;
                                        if (i15 > 0) {
                                            try {
                                                i18 = i16 + 1;
                                                switch (_json_actions[i16]) {
                                                    case 0:
                                                        i28 = i28;
                                                        iArr = iArrCopyOf;
                                                        z10 = true;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 1:
                                                        str5 = new String(cArr, i30, i31 - i30);
                                                        if (z9) {
                                                            str5 = unescape(str5);
                                                        }
                                                        if (z10) {
                                                            i28 = i28;
                                                            iArr = iArrCopyOf;
                                                            z10 = false;
                                                        } else {
                                                            if (z11) {
                                                                if (str5.equals("true")) {
                                                                    bool(str6, true);
                                                                } else if (str5.equals("false")) {
                                                                    bool(str6, false);
                                                                } else {
                                                                    if (str5.equals("null")) {
                                                                        string(str6, null);
                                                                    } else {
                                                                        z3 = false;
                                                                        z4 = true;
                                                                        while (true) {
                                                                            if (i30 < i31) {
                                                                                z3 = z3;
                                                                                c3 = cArr[i30];
                                                                                i28 = i28;
                                                                                if (c3 != '+') {
                                                                                    if (c3 != 'E' && c3 != 'e') {
                                                                                        if (c3 != '-') {
                                                                                            if (c3 != '.') {
                                                                                                switch (c3) {
                                                                                                    case '0':
                                                                                                    case '1':
                                                                                                    case '2':
                                                                                                    case '3':
                                                                                                    case '4':
                                                                                                    case '5':
                                                                                                    case '6':
                                                                                                    case '7':
                                                                                                    case Input.Keys.PERIOD /* 56 */:
                                                                                                    case Input.Keys.ALT_LEFT /* 57 */:
                                                                                                        break;
                                                                                                    default:
                                                                                                        z4 = false;
                                                                                                        z5 = false;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            i28 = i28;
                                                                                        }
                                                                                    }
                                                                                    z3 = true;
                                                                                    z4 = false;
                                                                                    i30++;
                                                                                    i28 = i28;
                                                                                }
                                                                                i30++;
                                                                                i28 = i28;
                                                                            } else {
                                                                                z5 = z3;
                                                                                i28 = i28;
                                                                            }
                                                                        }
                                                                        if (z5) {
                                                                            iArr = iArrCopyOf;
                                                                            try {
                                                                                number(str6, Double.parseDouble(str5), str5);
                                                                            } catch (NumberFormatException unused2) {
                                                                                string(str6, str5);
                                                                            }
                                                                        } else {
                                                                            iArr = iArrCopyOf;
                                                                            if (z4) {
                                                                                number(str6, Long.parseLong(str5), str5);
                                                                            }
                                                                        }
                                                                    }
                                                                    str5 = null;
                                                                }
                                                                i28 = i28;
                                                                iArr = iArrCopyOf;
                                                                str5 = null;
                                                            } else {
                                                                i28 = i28;
                                                                iArr = iArrCopyOf;
                                                            }
                                                            string(str6, str5);
                                                            str5 = null;
                                                        }
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i30 = i31;
                                                            str6 = str5;
                                                            z11 = false;
                                                            iArrCopyOf = iArr;
                                                            i15 = i17;
                                                            i16 = i18;
                                                            i28 = i28;
                                                        }
                                                        break;
                                                    case 2:
                                                        startObject(str6);
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i28 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i28] = b2;
                                                            i28++;
                                                            c8 = 2;
                                                            i29 = 5;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 3:
                                                        pop();
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i28--;
                                                            i19 = iArrCopyOf[i28];
                                                            i31 = i31;
                                                            z9 = z9;
                                                            c8 = 2;
                                                            i29 = i19;
                                                        }
                                                        break;
                                                    case 4:
                                                        startArray(str6);
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i28 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i28] = b2;
                                                            i28++;
                                                            c8 = 2;
                                                            i29 = 23;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 5:
                                                        pop();
                                                        if (this.stop) {
                                                            runtimeException = null;
                                                        } else {
                                                            i28--;
                                                            i19 = iArrCopyOf[i28];
                                                            i31 = i31;
                                                            z9 = z9;
                                                            c8 = 2;
                                                            i29 = i19;
                                                        }
                                                        break;
                                                    case 6:
                                                        i20 = i31 + 1;
                                                        if (cArr[i31] == '/') {
                                                            while (i20 != i2 && cArr[i20] != '\n') {
                                                                i20++;
                                                            }
                                                            i31 = i20 - 1;
                                                        } else {
                                                            while (true) {
                                                                i31 = i20 + 1;
                                                                if (i31 < i2) {
                                                                    try {
                                                                        if (cArr[i20] == '*') {
                                                                            try {
                                                                                if (cArr[i31] != '/') {
                                                                                }
                                                                            } catch (RuntimeException e4) {
                                                                                e = e4;
                                                                                runtimeException = e;
                                                                                i31 = i20;
                                                                                JsonValue jsonValue5 = this.root;
                                                                                this.root = null;
                                                                                this.current = null;
                                                                                this.lastChild.clear();
                                                                                if (!this.stop) {
                                                                                    if (i31 < i2) {
                                                                                        i10 = 1;
                                                                                        while (i9 < i31) {
                                                                                            if (cArr[i9] == '\n') {
                                                                                                i10++;
                                                                                            }
                                                                                        }
                                                                                        int iMax5 = Math.max(0, i31 - 32);
                                                                                        java.lang.StringBuilder sbQ5 = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                                                                                        sbQ5.append(new String(cArr, iMax5, i31 - iMax5));
                                                                                        sbQ5.append("*ERROR*");
                                                                                        sbQ5.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                                                                                        throw new SerializationException(sbQ5.toString(), runtimeException);
                                                                                    }
                                                                                    array = this.elements;
                                                                                    if (array.size != 0) {
                                                                                        jsonValuePeek = array.peek();
                                                                                        this.elements.clear();
                                                                                        if (jsonValuePeek == null) {
                                                                                            break;
                                                                                        }
                                                                                        throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                                                                    }
                                                                                    if (runtimeException != null) {
                                                                                        throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                                                                    }
                                                                                }
                                                                                return jsonValue5;
                                                                            }
                                                                        }
                                                                        i20 = i31;
                                                                    } catch (RuntimeException e5) {
                                                                        e = e5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 7:
                                                        c4 = '\r';
                                                        i21 = i31;
                                                        if (z10) {
                                                            z7 = false;
                                                            while (true) {
                                                                try {
                                                                    c6 = cArr[i21];
                                                                    z9 = z7;
                                                                    if (c6 == '\n' && c6 != '\r') {
                                                                        if (c6 == '/') {
                                                                            int i45 = i21 + 1;
                                                                            if (i45 != i2) {
                                                                                char c11 = cArr[i45];
                                                                                if (c11 != '/') {
                                                                                    if (c11 != '*') {
                                                                                    }
                                                                                }
                                                                            }
                                                                            i21++;
                                                                            if (i21 == i2) {
                                                                                z9 = z7;
                                                                            }
                                                                        } else if (c6 != ':') {
                                                                            z7 = c6 != '\\' ? z9 : true;
                                                                            i21++;
                                                                            if (i21 == i2) {
                                                                                z9 = z7;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (RuntimeException e6) {
                                                                    runtimeException = e6;
                                                                    i31 = i21;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z6 = false;
                                                            while (true) {
                                                                c5 = cArr[i21];
                                                                z9 = z6;
                                                                if (c5 == '\n' && c5 != c4 && c5 != ',') {
                                                                    if (c5 == '/') {
                                                                        int i46 = i21 + 1;
                                                                        if (i46 != i2) {
                                                                            char c12 = cArr[i46];
                                                                            if (c12 == '/' || c12 == '*') {
                                                                            }
                                                                        }
                                                                        i21++;
                                                                        if (i21 == i2) {
                                                                            z6 = z9;
                                                                            c4 = '\r';
                                                                        }
                                                                    } else if (c5 != '}') {
                                                                        if (c5 == '\\') {
                                                                            z9 = true;
                                                                        } else if (c5 != ']') {
                                                                        }
                                                                        i21++;
                                                                        if (i21 == i2) {
                                                                            z6 = z9;
                                                                            c4 = '\r';
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i22 = i21 - 1;
                                                        while (Character.isSpace(cArr[i22])) {
                                                            i22--;
                                                        }
                                                        i30 = i31;
                                                        z11 = true;
                                                        i31 = i22;
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    case 8:
                                                        i23 = i31 + 1;
                                                        i24 = i23;
                                                        z8 = false;
                                                        while (true) {
                                                            c7 = cArr[i24];
                                                            i25 = i23;
                                                            if (c7 != '\"') {
                                                                if (c7 != '\\') {
                                                                    i26 = 1;
                                                                } else {
                                                                    i24++;
                                                                    i26 = 1;
                                                                    z8 = true;
                                                                }
                                                                i24 += i26;
                                                                if (i24 != i2) {
                                                                    i23 = i25;
                                                                }
                                                            }
                                                        }
                                                        i31 = i24 - 1;
                                                        i28 = i28;
                                                        iArr = iArrCopyOf;
                                                        z9 = z8;
                                                        i30 = i25;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                    default:
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i15 = i17;
                                                        i16 = i18;
                                                        i28 = i28;
                                                        break;
                                                }
                                            } catch (RuntimeException e7) {
                                                e = e7;
                                                runtimeException = e;
                                            }
                                        } else {
                                            i28 = i28;
                                            iArrCopyOf = iArrCopyOf;
                                            i3 = i31;
                                            z9 = z9;
                                            i29 = b2;
                                            if (i29 == 0) {
                                                iArrCopyOf = iArrCopyOf;
                                                i28 = i28;
                                                i31 = i3;
                                                c8 = 5;
                                            } else {
                                                i8 = i3 + 1;
                                                if (i8 != i2) {
                                                    iArrCopyOf = iArrCopyOf;
                                                    i31 = i8;
                                                    i28 = i28;
                                                    c8 = 1;
                                                } else {
                                                    i31 = i8;
                                                    if (i31 == i2) {
                                                        byte b12 = _json_eof_actions[i29];
                                                        i5 = b12 + 1;
                                                        i6 = _json_actions[b12];
                                                        while (true) {
                                                            i7 = i6 - 1;
                                                            if (i6 > 0) {
                                                                int i312 = i5 + 1;
                                                                if (_json_actions[i5] != 1) {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                } else {
                                                                    str = new String(cArr, i30, i31 - i30);
                                                                    if (z9) {
                                                                        str = unescape(str);
                                                                    }
                                                                    if (z10) {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i4 = i31;
                                                                        str4 = str;
                                                                        z10 = false;
                                                                    } else {
                                                                        if (z11) {
                                                                            if (str.equals("true")) {
                                                                                bool(str6, true);
                                                                            } else if (str.equals(str8)) {
                                                                                bool(str6, false);
                                                                            } else {
                                                                                if (str.equals(str7)) {
                                                                                    string(str6, null);
                                                                                } else {
                                                                                    z = false;
                                                                                    z2 = true;
                                                                                    while (true) {
                                                                                        if (i30 < i31) {
                                                                                            c = cArr[i30];
                                                                                            str2 = str8;
                                                                                            if (c == '+') {
                                                                                                if (c == 'E') {
                                                                                                    z = true;
                                                                                                    z2 = false;
                                                                                                } else {
                                                                                                    z = true;
                                                                                                    z2 = false;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            str8 = str2;
                                                                                        } else {
                                                                                            str2 = str8;
                                                                                        }
                                                                                    }
                                                                                    if (z) {
                                                                                        str3 = str7;
                                                                                        i4 = i31;
                                                                                        number(str6, Double.parseDouble(str), str);
                                                                                    } else {
                                                                                        str3 = str7;
                                                                                        i4 = i31;
                                                                                        if (z2) {
                                                                                            number(str6, Long.parseLong(str), str);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str4 = null;
                                                                            }
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i4 = i31;
                                                                            str4 = null;
                                                                        } else {
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i4 = i31;
                                                                        }
                                                                        string(str6, str);
                                                                        str4 = null;
                                                                    }
                                                                    if (this.stop) {
                                                                        i31 = i4;
                                                                    } else {
                                                                        str6 = str4;
                                                                        i30 = i4;
                                                                        z11 = false;
                                                                    }
                                                                }
                                                                str7 = str3;
                                                                i6 = i7;
                                                                i31 = i4;
                                                                i5 = i312;
                                                                str8 = str2;
                                                            }
                                                            runtimeException = null;
                                                        }
                                                    }
                                                    i31 = i31;
                                                    i31 = i31;
                                                    runtimeException = null;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i29 = b2;
                                    i30 = i32;
                                    z9 = z9;
                                    if (i29 == 0) {
                                        iArrCopyOf = iArrCopyOf;
                                        i28 = i28;
                                        i31 = i3;
                                        c8 = 5;
                                    } else {
                                        i8 = i3 + 1;
                                        if (i8 != i2) {
                                            iArrCopyOf = iArrCopyOf;
                                            i31 = i8;
                                            i28 = i28;
                                            c8 = 1;
                                        } else {
                                            i31 = i8;
                                            if (i31 == i2) {
                                                byte b13 = _json_eof_actions[i29];
                                                i5 = b13 + 1;
                                                i6 = _json_actions[b13];
                                                while (true) {
                                                    i7 = i6 - 1;
                                                    if (i6 > 0) {
                                                        int i313 = i5 + 1;
                                                        if (_json_actions[i5] != 1) {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i4 = i31;
                                                        } else {
                                                            str = new String(cArr, i30, i31 - i30);
                                                            if (z9) {
                                                                str = unescape(str);
                                                            }
                                                            if (z10) {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i4 = i31;
                                                                str4 = str;
                                                                z10 = false;
                                                            } else {
                                                                if (z11) {
                                                                    if (str.equals("true")) {
                                                                        bool(str6, true);
                                                                    } else if (str.equals(str8)) {
                                                                        bool(str6, false);
                                                                    } else {
                                                                        if (str.equals(str7)) {
                                                                            string(str6, null);
                                                                        } else {
                                                                            z = false;
                                                                            z2 = true;
                                                                            while (true) {
                                                                                if (i30 < i31) {
                                                                                    c = cArr[i30];
                                                                                    str2 = str8;
                                                                                    if (c == '+') {
                                                                                        if (c == 'E') {
                                                                                            z = true;
                                                                                            z2 = false;
                                                                                        } else {
                                                                                            z = true;
                                                                                            z2 = false;
                                                                                        }
                                                                                    }
                                                                                    i30++;
                                                                                    str8 = str2;
                                                                                } else {
                                                                                    str2 = str8;
                                                                                }
                                                                            }
                                                                            if (z) {
                                                                                str3 = str7;
                                                                                i4 = i31;
                                                                                number(str6, Double.parseDouble(str), str);
                                                                            } else {
                                                                                str3 = str7;
                                                                                i4 = i31;
                                                                                if (z2) {
                                                                                    number(str6, Long.parseLong(str), str);
                                                                                }
                                                                            }
                                                                        }
                                                                        str4 = null;
                                                                    }
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    str4 = null;
                                                                } else {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                }
                                                                string(str6, str);
                                                                str4 = null;
                                                            }
                                                            if (this.stop) {
                                                                i31 = i4;
                                                            } else {
                                                                str6 = str4;
                                                                i30 = i4;
                                                                z11 = false;
                                                            }
                                                        }
                                                        str7 = str3;
                                                        i6 = i7;
                                                        i31 = i4;
                                                        i5 = i313;
                                                        str8 = str2;
                                                    }
                                                    runtimeException = null;
                                                }
                                            }
                                            i31 = i31;
                                            i31 = i31;
                                            runtimeException = null;
                                        }
                                    }
                                }
                            } catch (RuntimeException e8) {
                                e = e8;
                                runtimeException = e;
                                i31 = i3;
                            }
                        }
                    }
                } else {
                    b = _json_range_lengths[i29];
                    if (b > 0) {
                        i12 = ((b << 1) + i35) - 2;
                        i13 = i35;
                        while (true) {
                            if (i12 < i13) {
                                i27 = i36 + b;
                                i3 = i31;
                                i11 = i27;
                            } else {
                                i14 = i13 + (((i12 - i13) >> 1) & (-2));
                                byte b14 = b;
                                c2 = cArr[i31];
                                cArr2 = _json_trans_keys;
                                i3 = i31;
                                if (c2 < cArr2[i14]) {
                                    i12 = i14 - 2;
                                } else if (c2 > cArr2[i14 + 1]) {
                                    i13 = i14 + 2;
                                } else {
                                    i11 = i36 + ((i14 - i35) >> 1);
                                }
                                b = b14;
                                i31 = i3;
                                i13 = i13;
                            }
                        }
                    } else {
                        i3 = i31;
                        i11 = i36;
                    }
                    byte b15 = _json_indicies[i11];
                    b2 = _json_trans_targs[b15];
                    b3 = _json_trans_actions[b15];
                    if (b3 != 0) {
                        int i47 = b3 + 1;
                        i15 = _json_actions[b3];
                        i16 = i47;
                        i30 = i32;
                        i31 = i3;
                        while (true) {
                            i17 = i15 - 1;
                            if (i15 > 0) {
                                i18 = i16 + 1;
                                switch (_json_actions[i16]) {
                                    case 0:
                                        i28 = i28;
                                        iArr = iArrCopyOf;
                                        z10 = true;
                                        iArrCopyOf = iArr;
                                        i15 = i17;
                                        i16 = i18;
                                        i28 = i28;
                                        break;
                                    case 1:
                                        str5 = new String(cArr, i30, i31 - i30);
                                        if (z9) {
                                            str5 = unescape(str5);
                                        }
                                        if (z10) {
                                            i28 = i28;
                                            iArr = iArrCopyOf;
                                            z10 = false;
                                        } else {
                                            if (z11) {
                                                if (str5.equals("true")) {
                                                    bool(str6, true);
                                                } else if (str5.equals("false")) {
                                                    bool(str6, false);
                                                } else {
                                                    if (str5.equals("null")) {
                                                        string(str6, null);
                                                    } else {
                                                        z3 = false;
                                                        z4 = true;
                                                        while (true) {
                                                            if (i30 < i31) {
                                                                z3 = z3;
                                                                c3 = cArr[i30];
                                                                i28 = i28;
                                                                if (c3 != '+') {
                                                                    if (c3 != 'E') {
                                                                        if (c3 != '-') {
                                                                            if (c3 != '.') {
                                                                                switch (c3) {
                                                                                    case '0':
                                                                                    case '1':
                                                                                    case '2':
                                                                                    case '3':
                                                                                    case '4':
                                                                                    case '5':
                                                                                    case '6':
                                                                                    case '7':
                                                                                    case Input.Keys.PERIOD /* 56 */:
                                                                                    case Input.Keys.ALT_LEFT /* 57 */:
                                                                                        break;
                                                                                    default:
                                                                                        z4 = false;
                                                                                        z5 = false;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i30++;
                                                                            i28 = i28;
                                                                        }
                                                                    }
                                                                    z3 = true;
                                                                    z4 = false;
                                                                    i30++;
                                                                    i28 = i28;
                                                                }
                                                                i30++;
                                                                i28 = i28;
                                                            } else {
                                                                z5 = z3;
                                                                i28 = i28;
                                                            }
                                                        }
                                                        if (z5) {
                                                            iArr = iArrCopyOf;
                                                            number(str6, Double.parseDouble(str5), str5);
                                                        } else {
                                                            iArr = iArrCopyOf;
                                                            if (z4) {
                                                                number(str6, Long.parseLong(str5), str5);
                                                            }
                                                        }
                                                    }
                                                    str5 = null;
                                                }
                                                i28 = i28;
                                                iArr = iArrCopyOf;
                                                str5 = null;
                                            } else {
                                                i28 = i28;
                                                iArr = iArrCopyOf;
                                            }
                                            string(str6, str5);
                                            str5 = null;
                                        }
                                        if (this.stop) {
                                            runtimeException = null;
                                        } else {
                                            i30 = i31;
                                            str6 = str5;
                                            z11 = false;
                                            iArrCopyOf = iArr;
                                            i15 = i17;
                                            i16 = i18;
                                            i28 = i28;
                                        }
                                        break;
                                    case 2:
                                        startObject(str6);
                                        if (this.stop) {
                                            runtimeException = null;
                                        } else {
                                            if (i28 == iArrCopyOf.length) {
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                            }
                                            iArrCopyOf[i28] = b2;
                                            i28++;
                                            c8 = 2;
                                            i29 = 5;
                                            str6 = null;
                                        }
                                        break;
                                    case 3:
                                        pop();
                                        if (this.stop) {
                                            runtimeException = null;
                                        } else {
                                            i28--;
                                            i19 = iArrCopyOf[i28];
                                            i31 = i31;
                                            z9 = z9;
                                            c8 = 2;
                                            i29 = i19;
                                        }
                                        break;
                                    case 4:
                                        startArray(str6);
                                        if (this.stop) {
                                            runtimeException = null;
                                        } else {
                                            if (i28 == iArrCopyOf.length) {
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                            }
                                            iArrCopyOf[i28] = b2;
                                            i28++;
                                            c8 = 2;
                                            i29 = 23;
                                            str6 = null;
                                        }
                                        break;
                                    case 5:
                                        pop();
                                        if (this.stop) {
                                            runtimeException = null;
                                        } else {
                                            i28--;
                                            i19 = iArrCopyOf[i28];
                                            i31 = i31;
                                            z9 = z9;
                                            c8 = 2;
                                            i29 = i19;
                                        }
                                        break;
                                    case 6:
                                        i20 = i31 + 1;
                                        if (cArr[i31] == '/') {
                                            while (i20 != i2) {
                                                i20++;
                                            }
                                            i31 = i20 - 1;
                                        } else {
                                            while (true) {
                                                i31 = i20 + 1;
                                                if (i31 < i2) {
                                                    if (cArr[i20] == '*') {
                                                        if (cArr[i31] != '/') {
                                                        }
                                                    }
                                                    i20 = i31;
                                                }
                                            }
                                        }
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i15 = i17;
                                        i16 = i18;
                                        i28 = i28;
                                        break;
                                    case 7:
                                        c4 = '\r';
                                        i21 = i31;
                                        if (z10) {
                                            z7 = false;
                                            while (true) {
                                                c6 = cArr[i21];
                                                z9 = z7;
                                                if (c6 == '\n') {
                                                }
                                            }
                                        } else {
                                            z6 = false;
                                            while (true) {
                                                c5 = cArr[i21];
                                                z9 = z6;
                                                if (c5 == '\n') {
                                                }
                                                z6 = z9;
                                                c4 = '\r';
                                            }
                                        }
                                        i22 = i21 - 1;
                                        while (Character.isSpace(cArr[i22])) {
                                            i22--;
                                        }
                                        i30 = i31;
                                        z11 = true;
                                        i31 = i22;
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i15 = i17;
                                        i16 = i18;
                                        i28 = i28;
                                        break;
                                    case 8:
                                        i23 = i31 + 1;
                                        i24 = i23;
                                        z8 = false;
                                        while (true) {
                                            c7 = cArr[i24];
                                            i25 = i23;
                                            if (c7 != '\"') {
                                                if (c7 != '\\') {
                                                    i26 = 1;
                                                } else {
                                                    i24++;
                                                    i26 = 1;
                                                    z8 = true;
                                                }
                                                i24 += i26;
                                                if (i24 != i2) {
                                                    i23 = i25;
                                                }
                                            }
                                        }
                                        i31 = i24 - 1;
                                        i28 = i28;
                                        iArr = iArrCopyOf;
                                        z9 = z8;
                                        i30 = i25;
                                        iArrCopyOf = iArr;
                                        i15 = i17;
                                        i16 = i18;
                                        i28 = i28;
                                        break;
                                    default:
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i15 = i17;
                                        i16 = i18;
                                        i28 = i28;
                                        break;
                                }
                            } else {
                                i28 = i28;
                                iArrCopyOf = iArrCopyOf;
                                i3 = i31;
                                z9 = z9;
                                i29 = b2;
                                if (i29 == 0) {
                                    iArrCopyOf = iArrCopyOf;
                                    i28 = i28;
                                    i31 = i3;
                                    c8 = 5;
                                } else {
                                    i8 = i3 + 1;
                                    if (i8 != i2) {
                                        iArrCopyOf = iArrCopyOf;
                                        i31 = i8;
                                        i28 = i28;
                                        c8 = 1;
                                    } else {
                                        i31 = i8;
                                        if (i31 == i2) {
                                            byte b16 = _json_eof_actions[i29];
                                            i5 = b16 + 1;
                                            i6 = _json_actions[b16];
                                            while (true) {
                                                i7 = i6 - 1;
                                                if (i6 > 0) {
                                                    int i314 = i5 + 1;
                                                    if (_json_actions[i5] != 1) {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                    } else {
                                                        str = new String(cArr, i30, i31 - i30);
                                                        if (z9) {
                                                            str = unescape(str);
                                                        }
                                                        if (z10) {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i4 = i31;
                                                            str4 = str;
                                                            z10 = false;
                                                        } else {
                                                            if (z11) {
                                                                if (str.equals("true")) {
                                                                    bool(str6, true);
                                                                } else if (str.equals(str8)) {
                                                                    bool(str6, false);
                                                                } else {
                                                                    if (str.equals(str7)) {
                                                                        string(str6, null);
                                                                    } else {
                                                                        z = false;
                                                                        z2 = true;
                                                                        while (true) {
                                                                            if (i30 < i31) {
                                                                                c = cArr[i30];
                                                                                str2 = str8;
                                                                                if (c == '+') {
                                                                                    if (c == 'E') {
                                                                                        z = true;
                                                                                        z2 = false;
                                                                                    } else {
                                                                                        z = true;
                                                                                        z2 = false;
                                                                                    }
                                                                                }
                                                                                i30++;
                                                                                str8 = str2;
                                                                            } else {
                                                                                str2 = str8;
                                                                            }
                                                                        }
                                                                        if (z) {
                                                                            str3 = str7;
                                                                            i4 = i31;
                                                                            number(str6, Double.parseDouble(str), str);
                                                                        } else {
                                                                            str3 = str7;
                                                                            i4 = i31;
                                                                            if (z2) {
                                                                                number(str6, Long.parseLong(str), str);
                                                                            }
                                                                        }
                                                                    }
                                                                    str4 = null;
                                                                }
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i4 = i31;
                                                                str4 = null;
                                                            } else {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i4 = i31;
                                                            }
                                                            string(str6, str);
                                                            str4 = null;
                                                        }
                                                        if (this.stop) {
                                                            i31 = i4;
                                                        } else {
                                                            str6 = str4;
                                                            i30 = i4;
                                                            z11 = false;
                                                        }
                                                    }
                                                    str7 = str3;
                                                    i6 = i7;
                                                    i31 = i4;
                                                    i5 = i314;
                                                    str8 = str2;
                                                }
                                                runtimeException = null;
                                            }
                                        }
                                        i31 = i31;
                                        i31 = i31;
                                        runtimeException = null;
                                    }
                                }
                            }
                        }
                    } else {
                        i29 = b2;
                        i30 = i32;
                        z9 = z9;
                        if (i29 == 0) {
                            iArrCopyOf = iArrCopyOf;
                            i28 = i28;
                            i31 = i3;
                            c8 = 5;
                        } else {
                            i8 = i3 + 1;
                            if (i8 != i2) {
                                iArrCopyOf = iArrCopyOf;
                                i31 = i8;
                                i28 = i28;
                                c8 = 1;
                            } else {
                                i31 = i8;
                                if (i31 == i2) {
                                    byte b17 = _json_eof_actions[i29];
                                    i5 = b17 + 1;
                                    i6 = _json_actions[b17];
                                    while (true) {
                                        i7 = i6 - 1;
                                        if (i6 > 0) {
                                            int i315 = i5 + 1;
                                            if (_json_actions[i5] != 1) {
                                                str2 = str8;
                                                str3 = str7;
                                                i4 = i31;
                                            } else {
                                                str = new String(cArr, i30, i31 - i30);
                                                if (z9) {
                                                    str = unescape(str);
                                                }
                                                if (z10) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i4 = i31;
                                                    str4 = str;
                                                    z10 = false;
                                                } else {
                                                    if (z11) {
                                                        if (str.equals("true")) {
                                                            bool(str6, true);
                                                        } else if (str.equals(str8)) {
                                                            bool(str6, false);
                                                        } else {
                                                            if (str.equals(str7)) {
                                                                string(str6, null);
                                                            } else {
                                                                z = false;
                                                                z2 = true;
                                                                while (true) {
                                                                    if (i30 < i31) {
                                                                        c = cArr[i30];
                                                                        str2 = str8;
                                                                        if (c == '+') {
                                                                            if (c == 'E') {
                                                                                z = true;
                                                                                z2 = false;
                                                                            } else {
                                                                                z = true;
                                                                                z2 = false;
                                                                            }
                                                                        }
                                                                        i30++;
                                                                        str8 = str2;
                                                                    } else {
                                                                        str2 = str8;
                                                                    }
                                                                }
                                                                if (z) {
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    number(str6, Double.parseDouble(str), str);
                                                                } else {
                                                                    str3 = str7;
                                                                    i4 = i31;
                                                                    if (z2) {
                                                                        number(str6, Long.parseLong(str), str);
                                                                    }
                                                                }
                                                            }
                                                            str4 = null;
                                                        }
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                        str4 = null;
                                                    } else {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i4 = i31;
                                                    }
                                                    string(str6, str);
                                                    str4 = null;
                                                }
                                                if (this.stop) {
                                                    i31 = i4;
                                                } else {
                                                    str6 = str4;
                                                    i30 = i4;
                                                    z11 = false;
                                                }
                                            }
                                            str7 = str3;
                                            i6 = i7;
                                            i31 = i4;
                                            i5 = i315;
                                            str8 = str2;
                                        }
                                        runtimeException = null;
                                    }
                                }
                                i31 = i31;
                                i31 = i31;
                                runtimeException = null;
                            }
                        }
                    }
                }
            } catch (RuntimeException e9) {
                e = e9;
                i3 = i31;
            }
            JsonValue jsonValue6 = this.root;
            this.root = null;
            this.current = null;
            this.lastChild.clear();
            if (!this.stop) {
                if (i31 < i2) {
                    i10 = 1;
                    while (i9 < i31) {
                        if (cArr[i9] == '\n') {
                            i10++;
                        }
                    }
                    int iMax6 = Math.max(0, i31 - 32);
                    java.lang.StringBuilder sbQ6 = AbstractC5044xl.q("Error parsing JSON on line ", i10, " near: ");
                    sbQ6.append(new String(cArr, iMax6, i31 - iMax6));
                    sbQ6.append("*ERROR*");
                    sbQ6.append(new String(cArr, i31, Math.min(64, i2 - i31)));
                    throw new SerializationException(sbQ6.toString(), runtimeException);
                }
                array = this.elements;
                if (array.size != 0) {
                    jsonValuePeek = array.peek();
                    this.elements.clear();
                    if (jsonValuePeek == null) {
                    }
                    throw new SerializationException("Error parsing JSON, unmatched bracket.");
                }
                if (runtimeException != null) {
                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                }
            }
            return jsonValue6;
        }
    }
}
