package com.badlogic.gdx.utils;

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
public class JsonSkimmer {
    static final int json_en_array = 23;
    static final int json_en_main = 1;
    static final int json_en_object = 5;
    static final int json_error = 0;
    static final int json_first_final = 35;
    static final int json_start = 1;
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

    public boolean isStopped() {
        return this.stop;
    }

    public void parse(String str) {
        char[] charArray = str.toCharArray();
        parse(charArray, 0, charArray.length);
    }

    public void pop() {
    }

    public void push(@Null String str, boolean z) {
    }

    public void stop() {
        this.stop = true;
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

    public void value(@Null String str, String str2, boolean z) {
    }

    public void parse(Reader reader) {
        char[] cArr = new char[1024];
        int i = 0;
        while (true) {
            try {
                try {
                    int i2 = reader.read(cArr, i, cArr.length - i);
                    if (i2 == -1) {
                        StreamUtils.closeQuietly(reader);
                        parse(cArr, 0, i);
                        return;
                    } else if (i2 == 0) {
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

    public void parse(InputStream inputStream) {
        try {
            parse(new InputStreamReader(inputStream, C.UTF8_NAME));
        } catch (Exception e) {
            throw new SerializationException("Error reading stream.", e);
        }
    }

    public void parse(FileHandle fileHandle) {
        try {
            try {
                parse(fileHandle.reader(C.UTF8_NAME));
            } catch (Exception e) {
                throw new SerializationException(AbstractC5044xl.k("Error parsing file: ", fileHandle), e);
            }
        } catch (Exception e2) {
            throw new SerializationException(AbstractC5044xl.k("Error reading file: ", fileHandle), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0166 A[LOOP:7: B:95:0x012e->B:122:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187 A[Catch: RuntimeException -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c4 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01d7 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x01da A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f9 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0207 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x020a A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0214  */
    /* JADX WARN: Code duplicated, block: B:180:0x021f A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0229 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x022f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0233 A[Catch: RuntimeException -> 0x006b, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x023e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0243  */
    /* JADX WARN: Code duplicated, block: B:197:0x0254  */
    /* JADX WARN: Code duplicated, block: B:199:0x025c A[Catch: RuntimeException -> 0x0298, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x0298, blocks: (B:199:0x025c, B:200:0x0266, B:202:0x026a, B:44:0x00af, B:30:0x0070), top: B:240:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:202:0x026a A[Catch: RuntimeException -> 0x0298, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0298, blocks: (B:199:0x025c, B:200:0x0266, B:202:0x026a, B:44:0x00af, B:30:0x0070), top: B:240:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0274 A[Catch: RuntimeException -> 0x0282, TRY_ENTER, TryCatch #4 {RuntimeException -> 0x0282, blocks: (B:206:0x0274, B:208:0x027d, B:214:0x028d, B:213:0x0289, B:14:0x002f), top: B:244:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:208:0x027d A[Catch: RuntimeException -> 0x0282, TryCatch #4 {RuntimeException -> 0x0282, blocks: (B:206:0x0274, B:208:0x027d, B:214:0x028d, B:213:0x0289, B:14:0x002f), top: B:244:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:212:0x0287  */
    /* JADX WARN: Code duplicated, block: B:213:0x0289 A[Catch: RuntimeException -> 0x0282, TryCatch #4 {RuntimeException -> 0x0282, blocks: (B:206:0x0274, B:208:0x027d, B:214:0x028d, B:213:0x0289, B:14:0x002f), top: B:244:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0292  */
    /* JADX WARN: Code duplicated, block: B:224:0x029f  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:228:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:232:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x02e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:234:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:238:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0171 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[Catch: RuntimeException -> 0x006b, TRY_ENTER, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7 A[Catch: RuntimeException -> 0x006b, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x006b, blocks: (B:20:0x0051, B:46:0x00bd, B:47:0x00c3, B:49:0x00c7, B:133:0x0187, B:155:0x01bc, B:158:0x01c4, B:160:0x01ce, B:163:0x01d7, B:165:0x01da, B:166:0x01e3, B:168:0x01f1, B:171:0x01f9, B:172:0x01fe, B:175:0x0207, B:177:0x020a, B:179:0x0215, B:180:0x021f, B:182:0x0229, B:186:0x0239, B:185:0x0233, B:36:0x008c, B:38:0x0096, B:39:0x009b), top: B:248:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0134 A[ADDED_TO_REGION] */
    public void parse(char[] cArr, int i, int i2) {
        RuntimeException runtimeException;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c;
        char[] cArr2;
        int i13;
        RuntimeException e;
        byte b;
        byte b2;
        int i14;
        int i15;
        int i16;
        int i17;
        String str2;
        boolean z;
        int i18;
        int i19;
        int i20;
        char c2;
        int i21;
        char c3;
        int i22;
        char c4;
        int i23;
        boolean z2;
        char c5;
        this.stop = false;
        char c6 = 4;
        char c7 = 1;
        int[] iArrCopyOf = new int[4];
        int i24 = 0;
        char c8 = 0;
        int i25 = 1;
        int i26 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str3 = null;
        boolean z5 = false;
        int i27 = i;
        while (true) {
            try {
                if (c8 != 0) {
                    if (c8 != c7) {
                        if (c8 != 2) {
                            if (c8 == c6) {
                            }
                            runtimeException = null;
                            if (i27 >= i2) {
                                if (runtimeException != null) {
                                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                }
                                return;
                            }
                            i6 = 1;
                            for (i7 = 0; i7 < i27; i7++) {
                                if (cArr[i7] == '\n') {
                                    i6++;
                                }
                            }
                            int iMax = Math.max(0, i27 - 32);
                            java.lang.StringBuilder sbQ = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                            sbQ.append(new String(cArr, iMax, i27 - iMax));
                            sbQ.append("*ERROR*");
                            sbQ.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                            throw new SerializationException(sbQ.toString(), runtimeException);
                        }
                        if (i27 == i2) {
                            byte b3 = _json_eof_actions[i25];
                            i3 = b3 + 1;
                            i4 = _json_actions[b3];
                            while (true) {
                                i5 = i4 - 1;
                                if (i4 > 0) {
                                    int i28 = i3 + 1;
                                    if (_json_actions[i3] == 1) {
                                        str = new String(cArr, i26, i27 - i26);
                                        if (z3) {
                                            str = unescape(str);
                                        }
                                        if (z4) {
                                            z4 = false;
                                        } else {
                                            value(str3, str, z5);
                                            str = null;
                                        }
                                        if (this.stop) {
                                            return;
                                        }
                                        str3 = str;
                                        i26 = i27;
                                        z5 = false;
                                    }
                                    i4 = i5;
                                    i3 = i28;
                                }
                            }
                        }
                        runtimeException = null;
                        if (i27 >= i2) {
                            if (runtimeException != null) {
                                throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                            }
                            return;
                        }
                        i6 = 1;
                        while (i7 < i27) {
                            if (cArr[i7] == '\n') {
                                i6++;
                            }
                        }
                        int iMax2 = Math.max(0, i27 - 32);
                        java.lang.StringBuilder sbQ2 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                        sbQ2.append(new String(cArr, iMax2, i27 - iMax2));
                        sbQ2.append("*ERROR*");
                        sbQ2.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                        throw new SerializationException(sbQ2.toString(), runtimeException);
                    }
                    if (i25 == 0) {
                        c6 = 4;
                        c7 = 1;
                        c8 = 5;
                    } else {
                        i27++;
                        if (i27 == i2) {
                            if (i27 == i2) {
                                byte b4 = _json_eof_actions[i25];
                                i3 = b4 + 1;
                                i4 = _json_actions[b4];
                                while (true) {
                                    i5 = i4 - 1;
                                    if (i4 > 0) {
                                        int i29 = i3 + 1;
                                        if (_json_actions[i3] == 1) {
                                            str = new String(cArr, i26, i27 - i26);
                                            if (z3) {
                                                str = unescape(str);
                                            }
                                            if (z4) {
                                                z4 = false;
                                            } else {
                                                value(str3, str, z5);
                                                str = null;
                                            }
                                            if (this.stop) {
                                                return;
                                            }
                                            str3 = str;
                                            i26 = i27;
                                            z5 = false;
                                        }
                                        i4 = i5;
                                        i3 = i29;
                                    }
                                }
                            }
                            runtimeException = null;
                            if (i27 >= i2) {
                                if (runtimeException != null) {
                                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                }
                                return;
                            }
                            i6 = 1;
                            while (i7 < i27) {
                                if (cArr[i7] == '\n') {
                                    i6++;
                                }
                            }
                            int iMax3 = Math.max(0, i27 - 32);
                            java.lang.StringBuilder sbQ3 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                            sbQ3.append(new String(cArr, iMax3, i27 - iMax3));
                            sbQ3.append("*ERROR*");
                            sbQ3.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                            throw new SerializationException(sbQ3.toString(), runtimeException);
                        }
                        c6 = 4;
                        c7 = 1;
                        c8 = 1;
                    }
                } else if (i27 == i2) {
                    c8 = 4;
                } else if (i25 == 0) {
                    c8 = 5;
                }
                short s = _json_key_offsets[i25];
                short s2 = _json_index_offsets[i25];
                byte b5 = _json_single_lengths[i25];
                int i30 = s;
                int i31 = s2;
                if (b5 > 0) {
                    int i32 = s + b5;
                    int i33 = s;
                    int i34 = i32 - 1;
                    while (true) {
                        if (i34 >= i33) {
                            int i35 = i33 + ((i34 - i33) >> 1);
                            try {
                                char c9 = cArr[i27];
                                int i36 = i34;
                                char c10 = _json_trans_keys[i35];
                                if (c9 < c10) {
                                    i34 = i35 - 1;
                                } else if (c9 > c10) {
                                    i33 = i35 + 1;
                                    i34 = i36;
                                } else {
                                    i9 = (i35 - s) + s2;
                                    byte b6 = _json_indicies[i9];
                                    b = _json_trans_targs[b6];
                                    b2 = _json_trans_actions[b6];
                                    if (b2 != 0) {
                                        i14 = b2 + 1;
                                        i15 = _json_actions[b2];
                                        while (true) {
                                            i16 = i15 - 1;
                                            if (i15 > 0) {
                                                i17 = i14 + 1;
                                                switch (_json_actions[i14]) {
                                                    case 0:
                                                        z4 = true;
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                    case 1:
                                                        str2 = new String(cArr, i26, i27 - i26);
                                                        if (z3) {
                                                            str2 = unescape(str2);
                                                        }
                                                        if (z4) {
                                                            str3 = str2;
                                                            z = false;
                                                        } else {
                                                            value(str3, str2, z5);
                                                            z = z4;
                                                            str3 = null;
                                                        }
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        i26 = i27;
                                                        z4 = z;
                                                        z5 = false;
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                    case 2:
                                                        push(str3, true);
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        if (i24 == iArrCopyOf.length) {
                                                            c8 = 2;
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                        } else {
                                                            c8 = 2;
                                                        }
                                                        iArrCopyOf[i24] = b;
                                                        i24++;
                                                        c6 = 4;
                                                        c7 = 1;
                                                        i25 = 5;
                                                        str3 = null;
                                                        break;
                                                    case 3:
                                                        pop();
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        i24--;
                                                        i25 = iArrCopyOf[i24];
                                                        c6 = 4;
                                                        c7 = 1;
                                                        c8 = 2;
                                                        break;
                                                    case 4:
                                                        push(str3, false);
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        if (i24 == iArrCopyOf.length) {
                                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                        }
                                                        iArrCopyOf[i24] = b;
                                                        i25 = 23;
                                                        i24++;
                                                        c6 = 4;
                                                        c7 = 1;
                                                        c8 = 2;
                                                        str3 = null;
                                                        break;
                                                    case 5:
                                                        pop();
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        i24--;
                                                        i25 = iArrCopyOf[i24];
                                                        c6 = 4;
                                                        c7 = 1;
                                                        c8 = 2;
                                                        break;
                                                    case 6:
                                                        i18 = i27 + 1;
                                                        if (cArr[i27] == '/') {
                                                            i20 = i18;
                                                            while (i20 != i2) {
                                                                i20++;
                                                            }
                                                            i27 = i20 - 1;
                                                        } else {
                                                            i27 = i18;
                                                            while (true) {
                                                                i19 = i27 + 1;
                                                                if (i19 < i2) {
                                                                    if (cArr[i27] == '*') {
                                                                    }
                                                                    i27 = i19;
                                                                }
                                                                if (cArr[i19] != '/') {
                                                                    i27 = i19;
                                                                } else {
                                                                    i27 = i19;
                                                                }
                                                            }
                                                        }
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                    case 7:
                                                        c2 = '\r';
                                                        if (z4) {
                                                            i22 = i27;
                                                            z3 = false;
                                                            do {
                                                                c4 = cArr[i22];
                                                                if (c4 == '\n') {
                                                                }
                                                            } while (i22 != i2);
                                                        } else {
                                                            i21 = i27;
                                                            boolean z6 = false;
                                                            while (true) {
                                                                c3 = cArr[i21];
                                                                if (c3 == '\n') {
                                                                }
                                                                c2 = '\r';
                                                            }
                                                            z3 = z6;
                                                            i22 = i21;
                                                        }
                                                        do {
                                                            i22--;
                                                        } while (Character.isSpace(cArr[i22]));
                                                        z5 = true;
                                                        i26 = i27;
                                                        i27 = i22;
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                    case 8:
                                                        int i37 = i27 + 1;
                                                        i23 = i37;
                                                        z2 = false;
                                                        do {
                                                            c5 = cArr[i23];
                                                            if (c5 != '\"') {
                                                                if (c5 == '\\') {
                                                                    i23++;
                                                                    z2 = true;
                                                                }
                                                                i23++;
                                                            }
                                                            z3 = z2;
                                                            i19 = i23 - 1;
                                                            i26 = i37;
                                                            i27 = i19;
                                                            i15 = i16;
                                                            i14 = i17;
                                                            break;
                                                        } while (i23 != i2);
                                                        z3 = z2;
                                                        i19 = i23 - 1;
                                                        i26 = i37;
                                                        i27 = i19;
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                    default:
                                                        i15 = i16;
                                                        i14 = i17;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    i25 = b;
                                    if (i25 == 0) {
                                        c6 = 4;
                                        c7 = 1;
                                        c8 = 5;
                                    } else {
                                        i27++;
                                        if (i27 == i2) {
                                            c6 = 4;
                                            c7 = 1;
                                            c8 = 1;
                                        } else {
                                            if (i27 == i2) {
                                                byte b7 = _json_eof_actions[i25];
                                                i3 = b7 + 1;
                                                i4 = _json_actions[b7];
                                                while (true) {
                                                    i5 = i4 - 1;
                                                    if (i4 > 0) {
                                                        int i210 = i3 + 1;
                                                        if (_json_actions[i3] == 1) {
                                                            str = new String(cArr, i26, i27 - i26);
                                                            if (z3) {
                                                                str = unescape(str);
                                                            }
                                                            if (z4) {
                                                                z4 = false;
                                                            } else {
                                                                value(str3, str, z5);
                                                                str = null;
                                                            }
                                                            if (this.stop) {
                                                                return;
                                                            }
                                                            str3 = str;
                                                            i26 = i27;
                                                            z5 = false;
                                                        }
                                                        i4 = i5;
                                                        i3 = i210;
                                                    }
                                                }
                                            }
                                            runtimeException = null;
                                        }
                                    }
                                }
                                i33 = i33;
                            } catch (RuntimeException e2) {
                                e = e2;
                                runtimeException = e;
                                if (i27 >= i2) {
                                    if (runtimeException != null) {
                                        throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                    }
                                    return;
                                }
                                i6 = 1;
                                while (i7 < i27) {
                                    if (cArr[i7] == '\n') {
                                        i6++;
                                    }
                                }
                                int iMax4 = Math.max(0, i27 - 32);
                                java.lang.StringBuilder sbQ4 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                                sbQ4.append(new String(cArr, iMax4, i27 - iMax4));
                                sbQ4.append("*ERROR*");
                                sbQ4.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                                throw new SerializationException(sbQ4.toString(), runtimeException);
                            }
                        } else {
                            i30 = i32;
                            i31 = s2 + b5;
                            i8 = _json_range_lengths[i25];
                            if (i8 > 0) {
                                i10 = ((i8 << 1) + i30) - 2;
                                i11 = i30;
                                while (i10 >= i11) {
                                    i12 = (((i10 - i11) >> 1) & (-2)) + i11;
                                    i8 = i8;
                                    c = cArr[i27];
                                    cArr2 = _json_trans_keys;
                                    i13 = i10;
                                    if (c < cArr2[i12]) {
                                        i10 = i12 - 2;
                                    } else if (c > cArr2[i12 + 1]) {
                                        i11 = i12 + 2;
                                        i10 = i13;
                                    } else {
                                        i8 = (i12 - i30) >> 1;
                                        i9 = i31 + i8;
                                    }
                                }
                                i9 = i31 + i8;
                            } else {
                                i9 = i31;
                            }
                            try {
                                byte b8 = _json_indicies[i9];
                                b = _json_trans_targs[b8];
                                b2 = _json_trans_actions[b8];
                                if (b2 != 0) {
                                    i14 = b2 + 1;
                                    i15 = _json_actions[b2];
                                    while (true) {
                                        i16 = i15 - 1;
                                        if (i15 > 0) {
                                            i17 = i14 + 1;
                                            switch (_json_actions[i14]) {
                                                case 0:
                                                    z4 = true;
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                                case 1:
                                                    str2 = new String(cArr, i26, i27 - i26);
                                                    if (z3) {
                                                        str2 = unescape(str2);
                                                    }
                                                    if (z4) {
                                                        str3 = str2;
                                                        z = false;
                                                    } else {
                                                        value(str3, str2, z5);
                                                        z = z4;
                                                        str3 = null;
                                                    }
                                                    if (this.stop) {
                                                        return;
                                                    }
                                                    i26 = i27;
                                                    z4 = z;
                                                    z5 = false;
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                                case 2:
                                                    push(str3, true);
                                                    if (this.stop) {
                                                        return;
                                                    }
                                                    if (i24 == iArrCopyOf.length) {
                                                        c8 = 2;
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                    } else {
                                                        c8 = 2;
                                                    }
                                                    iArrCopyOf[i24] = b;
                                                    i24++;
                                                    c6 = 4;
                                                    c7 = 1;
                                                    i25 = 5;
                                                    str3 = null;
                                                    break;
                                                case 3:
                                                    pop();
                                                    if (this.stop) {
                                                        return;
                                                    }
                                                    i24--;
                                                    i25 = iArrCopyOf[i24];
                                                    c6 = 4;
                                                    c7 = 1;
                                                    c8 = 2;
                                                    break;
                                                case 4:
                                                    push(str3, false);
                                                    if (this.stop) {
                                                        return;
                                                    }
                                                    if (i24 == iArrCopyOf.length) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                    }
                                                    iArrCopyOf[i24] = b;
                                                    i25 = 23;
                                                    i24++;
                                                    c6 = 4;
                                                    c7 = 1;
                                                    c8 = 2;
                                                    str3 = null;
                                                    break;
                                                case 5:
                                                    pop();
                                                    if (this.stop) {
                                                        return;
                                                    }
                                                    i24--;
                                                    i25 = iArrCopyOf[i24];
                                                    c6 = 4;
                                                    c7 = 1;
                                                    c8 = 2;
                                                    break;
                                                case 6:
                                                    i18 = i27 + 1;
                                                    if (cArr[i27] == '/') {
                                                        i20 = i18;
                                                        while (i20 != i2 && cArr[i20] != '\n') {
                                                            i20++;
                                                        }
                                                        i27 = i20 - 1;
                                                    } else {
                                                        i27 = i18;
                                                        while (true) {
                                                            i19 = i27 + 1;
                                                            try {
                                                                if (i19 < i2) {
                                                                    try {
                                                                        if (cArr[i27] == '*') {
                                                                        }
                                                                        i27 = i19;
                                                                    } catch (RuntimeException e3) {
                                                                        e = e3;
                                                                        runtimeException = e;
                                                                        if (i27 >= i2) {
                                                                            if (runtimeException != null) {
                                                                                throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                                                            }
                                                                            return;
                                                                        }
                                                                        i6 = 1;
                                                                        while (i7 < i27) {
                                                                            if (cArr[i7] == '\n') {
                                                                                i6++;
                                                                            }
                                                                        }
                                                                        int iMax5 = Math.max(0, i27 - 32);
                                                                        java.lang.StringBuilder sbQ5 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                                                                        sbQ5.append(new String(cArr, iMax5, i27 - iMax5));
                                                                        sbQ5.append("*ERROR*");
                                                                        sbQ5.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                                                                        throw new SerializationException(sbQ5.toString(), runtimeException);
                                                                    }
                                                                }
                                                                if (cArr[i19] != '/') {
                                                                    i27 = i19;
                                                                } else {
                                                                    i27 = i19;
                                                                }
                                                            } catch (RuntimeException e4) {
                                                                runtimeException = e4;
                                                                i27 = i27;
                                                                if (i27 >= i2) {
                                                                    if (runtimeException != null) {
                                                                        throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                                                    }
                                                                    return;
                                                                }
                                                                i6 = 1;
                                                                while (i7 < i27) {
                                                                    if (cArr[i7] == '\n') {
                                                                        i6++;
                                                                    }
                                                                }
                                                                int iMax6 = Math.max(0, i27 - 32);
                                                                java.lang.StringBuilder sbQ6 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                                                                sbQ6.append(new String(cArr, iMax6, i27 - iMax6));
                                                                sbQ6.append("*ERROR*");
                                                                sbQ6.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                                                                throw new SerializationException(sbQ6.toString(), runtimeException);
                                                            }
                                                        }
                                                    }
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                                case 7:
                                                    c2 = '\r';
                                                    if (z4) {
                                                        i22 = i27;
                                                        z3 = false;
                                                        do {
                                                            try {
                                                                c4 = cArr[i22];
                                                                if (c4 == '\n' && c4 != '\r') {
                                                                    if (c4 == '/') {
                                                                        int i38 = i22 + 1;
                                                                        if (i38 != i2) {
                                                                            char c11 = cArr[i38];
                                                                            if (c11 == '/' || c11 == '*') {
                                                                            }
                                                                        }
                                                                        i22++;
                                                                    } else if (c4 != ':') {
                                                                        if (c4 == '\\') {
                                                                            z3 = true;
                                                                        }
                                                                        i22++;
                                                                    }
                                                                }
                                                            } catch (RuntimeException e5) {
                                                                runtimeException = e5;
                                                                i27 = i22;
                                                                if (i27 >= i2) {
                                                                    if (runtimeException != null) {
                                                                        throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                                                    }
                                                                    return;
                                                                }
                                                                i6 = 1;
                                                                while (i7 < i27) {
                                                                    if (cArr[i7] == '\n') {
                                                                        i6++;
                                                                    }
                                                                }
                                                                int iMax7 = Math.max(0, i27 - 32);
                                                                java.lang.StringBuilder sbQ7 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                                                                sbQ7.append(new String(cArr, iMax7, i27 - iMax7));
                                                                sbQ7.append("*ERROR*");
                                                                sbQ7.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                                                                throw new SerializationException(sbQ7.toString(), runtimeException);
                                                            }
                                                        } while (i22 != i2);
                                                    } else {
                                                        i21 = i27;
                                                        boolean z7 = false;
                                                        while (true) {
                                                            c3 = cArr[i21];
                                                            if (c3 == '\n' && c3 != c2 && c3 != ',') {
                                                                if (c3 == '/') {
                                                                    int i39 = i21 + 1;
                                                                    if (i39 != i2) {
                                                                        char c12 = cArr[i39];
                                                                        if (c12 == '/' || c12 == '*') {
                                                                        }
                                                                    }
                                                                    i21++;
                                                                    if (i21 == i2) {
                                                                        c2 = '\r';
                                                                    }
                                                                } else if (c3 != '}') {
                                                                    if (c3 == '\\') {
                                                                        z7 = true;
                                                                    } else if (c3 != ']') {
                                                                    }
                                                                    i21++;
                                                                    if (i21 == i2) {
                                                                        c2 = '\r';
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z3 = z7;
                                                        i22 = i21;
                                                    }
                                                    do {
                                                        i22--;
                                                    } while (Character.isSpace(cArr[i22]));
                                                    z5 = true;
                                                    i26 = i27;
                                                    i27 = i22;
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                                case 8:
                                                    int i310 = i27 + 1;
                                                    i23 = i310;
                                                    z2 = false;
                                                    do {
                                                        try {
                                                            c5 = cArr[i23];
                                                            if (c5 != '\"') {
                                                                if (c5 == '\\') {
                                                                    i23++;
                                                                    z2 = true;
                                                                }
                                                                i23++;
                                                            }
                                                            z3 = z2;
                                                            i19 = i23 - 1;
                                                            i26 = i310;
                                                            i27 = i19;
                                                            i15 = i16;
                                                            i14 = i17;
                                                        } catch (RuntimeException e6) {
                                                            runtimeException = e6;
                                                            i27 = i23;
                                                            if (i27 >= i2) {
                                                                if (runtimeException != null) {
                                                                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                                                                }
                                                                return;
                                                            }
                                                            i6 = 1;
                                                            while (i7 < i27) {
                                                                if (cArr[i7] == '\n') {
                                                                    i6++;
                                                                }
                                                            }
                                                            int iMax8 = Math.max(0, i27 - 32);
                                                            java.lang.StringBuilder sbQ8 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
                                                            sbQ8.append(new String(cArr, iMax8, i27 - iMax8));
                                                            sbQ8.append("*ERROR*");
                                                            sbQ8.append(new String(cArr, i27, Math.min(64, i2 - i27)));
                                                            throw new SerializationException(sbQ8.toString(), runtimeException);
                                                        }
                                                        break;
                                                    } while (i23 != i2);
                                                    z3 = z2;
                                                    i19 = i23 - 1;
                                                    i26 = i310;
                                                    i27 = i19;
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                                default:
                                                    i15 = i16;
                                                    i14 = i17;
                                                    break;
                                            }
                                        }
                                    }
                                }
                                i25 = b;
                                if (i25 == 0) {
                                    c6 = 4;
                                    c7 = 1;
                                    c8 = 5;
                                } else {
                                    i27++;
                                    if (i27 == i2) {
                                        c6 = 4;
                                        c7 = 1;
                                        c8 = 1;
                                    } else {
                                        if (i27 == i2) {
                                            byte b9 = _json_eof_actions[i25];
                                            i3 = b9 + 1;
                                            i4 = _json_actions[b9];
                                            while (true) {
                                                i5 = i4 - 1;
                                                if (i4 > 0) {
                                                    int i211 = i3 + 1;
                                                    if (_json_actions[i3] == 1) {
                                                        str = new String(cArr, i26, i27 - i26);
                                                        if (z3) {
                                                            str = unescape(str);
                                                        }
                                                        if (z4) {
                                                            z4 = false;
                                                        } else {
                                                            value(str3, str, z5);
                                                            str = null;
                                                        }
                                                        if (this.stop) {
                                                            return;
                                                        }
                                                        str3 = str;
                                                        i26 = i27;
                                                        z5 = false;
                                                    }
                                                    i4 = i5;
                                                    i3 = i211;
                                                }
                                            }
                                        }
                                        runtimeException = null;
                                    }
                                }
                            } catch (RuntimeException e7) {
                                e = e7;
                                runtimeException = e;
                            }
                        }
                    }
                } else {
                    i8 = _json_range_lengths[i25];
                    if (i8 > 0) {
                        i10 = ((i8 << 1) + i30) - 2;
                        i11 = i30;
                        while (i10 >= i11) {
                            i12 = (((i10 - i11) >> 1) & (-2)) + i11;
                            i8 = i8;
                            c = cArr[i27];
                            cArr2 = _json_trans_keys;
                            i13 = i10;
                            if (c < cArr2[i12]) {
                                i10 = i12 - 2;
                            } else if (c > cArr2[i12 + 1]) {
                                i11 = i12 + 2;
                                i10 = i13;
                            } else {
                                i8 = (i12 - i30) >> 1;
                                i9 = i31 + i8;
                            }
                        }
                        i9 = i31 + i8;
                    } else {
                        i9 = i31;
                    }
                    byte b10 = _json_indicies[i9];
                    b = _json_trans_targs[b10];
                    b2 = _json_trans_actions[b10];
                    if (b2 != 0) {
                        i14 = b2 + 1;
                        i15 = _json_actions[b2];
                        while (true) {
                            i16 = i15 - 1;
                            if (i15 > 0) {
                                i17 = i14 + 1;
                                switch (_json_actions[i14]) {
                                    case 0:
                                        z4 = true;
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                    case 1:
                                        str2 = new String(cArr, i26, i27 - i26);
                                        if (z3) {
                                            str2 = unescape(str2);
                                        }
                                        if (z4) {
                                            str3 = str2;
                                            z = false;
                                        } else {
                                            value(str3, str2, z5);
                                            z = z4;
                                            str3 = null;
                                        }
                                        if (this.stop) {
                                            return;
                                        }
                                        i26 = i27;
                                        z4 = z;
                                        z5 = false;
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                    case 2:
                                        push(str3, true);
                                        if (this.stop) {
                                            return;
                                        }
                                        if (i24 == iArrCopyOf.length) {
                                            c8 = 2;
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        } else {
                                            c8 = 2;
                                        }
                                        iArrCopyOf[i24] = b;
                                        i24++;
                                        c6 = 4;
                                        c7 = 1;
                                        i25 = 5;
                                        str3 = null;
                                        break;
                                    case 3:
                                        pop();
                                        if (this.stop) {
                                            return;
                                        }
                                        i24--;
                                        i25 = iArrCopyOf[i24];
                                        c6 = 4;
                                        c7 = 1;
                                        c8 = 2;
                                        break;
                                    case 4:
                                        push(str3, false);
                                        if (this.stop) {
                                            return;
                                        }
                                        if (i24 == iArrCopyOf.length) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        }
                                        iArrCopyOf[i24] = b;
                                        i25 = 23;
                                        i24++;
                                        c6 = 4;
                                        c7 = 1;
                                        c8 = 2;
                                        str3 = null;
                                        break;
                                    case 5:
                                        pop();
                                        if (this.stop) {
                                            return;
                                        }
                                        i24--;
                                        i25 = iArrCopyOf[i24];
                                        c6 = 4;
                                        c7 = 1;
                                        c8 = 2;
                                        break;
                                    case 6:
                                        i18 = i27 + 1;
                                        if (cArr[i27] == '/') {
                                            i20 = i18;
                                            while (i20 != i2) {
                                                i20++;
                                            }
                                            i27 = i20 - 1;
                                        } else {
                                            i27 = i18;
                                            while (true) {
                                                i19 = i27 + 1;
                                                if (i19 < i2) {
                                                    if (cArr[i27] == '*') {
                                                    }
                                                    i27 = i19;
                                                }
                                                if (cArr[i19] != '/') {
                                                    i27 = i19;
                                                } else {
                                                    i27 = i19;
                                                }
                                            }
                                        }
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                    case 7:
                                        c2 = '\r';
                                        if (z4) {
                                            i22 = i27;
                                            z3 = false;
                                            do {
                                                c4 = cArr[i22];
                                                if (c4 == '\n') {
                                                }
                                            } while (i22 != i2);
                                        } else {
                                            i21 = i27;
                                            boolean z8 = false;
                                            while (true) {
                                                c3 = cArr[i21];
                                                if (c3 == '\n') {
                                                }
                                                c2 = '\r';
                                            }
                                            z3 = z8;
                                            i22 = i21;
                                        }
                                        do {
                                            i22--;
                                        } while (Character.isSpace(cArr[i22]));
                                        z5 = true;
                                        i26 = i27;
                                        i27 = i22;
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                    case 8:
                                        int i311 = i27 + 1;
                                        i23 = i311;
                                        z2 = false;
                                        do {
                                            c5 = cArr[i23];
                                            if (c5 != '\"') {
                                                if (c5 == '\\') {
                                                    i23++;
                                                    z2 = true;
                                                }
                                                i23++;
                                            }
                                            z3 = z2;
                                            i19 = i23 - 1;
                                            i26 = i311;
                                            i27 = i19;
                                            i15 = i16;
                                            i14 = i17;
                                            break;
                                        } while (i23 != i2);
                                        z3 = z2;
                                        i19 = i23 - 1;
                                        i26 = i311;
                                        i27 = i19;
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                    default:
                                        i15 = i16;
                                        i14 = i17;
                                        break;
                                }
                            }
                        }
                    }
                    i25 = b;
                    if (i25 == 0) {
                        c6 = 4;
                        c7 = 1;
                        c8 = 5;
                    } else {
                        i27++;
                        if (i27 == i2) {
                            c6 = 4;
                            c7 = 1;
                            c8 = 1;
                        } else {
                            if (i27 == i2) {
                                byte b11 = _json_eof_actions[i25];
                                i3 = b11 + 1;
                                i4 = _json_actions[b11];
                                while (true) {
                                    i5 = i4 - 1;
                                    if (i4 > 0) {
                                        int i212 = i3 + 1;
                                        if (_json_actions[i3] == 1) {
                                            str = new String(cArr, i26, i27 - i26);
                                            if (z3) {
                                                str = unescape(str);
                                            }
                                            if (z4) {
                                                z4 = false;
                                            } else {
                                                value(str3, str, z5);
                                                str = null;
                                            }
                                            if (this.stop) {
                                                return;
                                            }
                                            str3 = str;
                                            i26 = i27;
                                            z5 = false;
                                        }
                                        i4 = i5;
                                        i3 = i212;
                                    }
                                }
                            }
                            runtimeException = null;
                        }
                    }
                }
            } catch (RuntimeException e8) {
                e = e8;
                runtimeException = e;
            }
            if (i27 >= i2) {
                if (runtimeException != null) {
                    throw new SerializationException("Error parsing JSON: ".concat(new String(cArr)), runtimeException);
                }
                return;
            }
            i6 = 1;
            while (i7 < i27) {
                if (cArr[i7] == '\n') {
                    i6++;
                }
            }
            int iMax9 = Math.max(0, i27 - 32);
            java.lang.StringBuilder sbQ9 = AbstractC5044xl.q("Error parsing JSON on line ", i6, " near: ");
            sbQ9.append(new String(cArr, iMax9, i27 - iMax9));
            sbQ9.append("*ERROR*");
            sbQ9.append(new String(cArr, i27, Math.min(64, i2 - i27)));
            throw new SerializationException(sbQ9.toString(), runtimeException);
        }
    }
}
