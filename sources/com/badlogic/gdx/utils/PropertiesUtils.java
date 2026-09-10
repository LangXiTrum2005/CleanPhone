package com.badlogic.gdx.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class PropertiesUtils {
    private static final int CONTINUE = 3;
    private static final int IGNORE = 5;
    private static final int KEY_DONE = 4;
    private static final String LINE_SEPARATOR = "\n";
    private static final int NONE = 0;
    private static final int SLASH = 1;
    private static final int UNICODE = 2;

    private PropertiesUtils() {
    }

    private static void dumpString(StringBuilder stringBuilder, String str, boolean z, boolean z2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > '=' && cCharAt < 127) {
                stringBuilder.append(cCharAt == '\\' ? "\\\\" : Character.valueOf(cCharAt));
            } else if (cCharAt == '\t') {
                stringBuilder.append("\\t");
            } else if (cCharAt == '\n') {
                stringBuilder.append("\\n");
            } else if (cCharAt == '\f') {
                stringBuilder.append("\\f");
            } else if (cCharAt == '\r') {
                stringBuilder.append("\\r");
            } else if (cCharAt != ' ') {
                if (cCharAt == '!' || cCharAt == '#' || cCharAt == ':' || cCharAt == '=') {
                    stringBuilder.append('\\').append(cCharAt);
                } else if ((cCharAt < ' ' || cCharAt > '~') && z2) {
                    String hexString = Integer.toHexString(cCharAt);
                    stringBuilder.append("\\u");
                    for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(hexString);
                } else {
                    stringBuilder.append(cCharAt);
                }
            } else if (i == 0 || z) {
                stringBuilder.append("\\ ");
            } else {
                stringBuilder.append(cCharAt);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0120  */
    /* JADX WARN: Code duplicated, block: B:148:0x00fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba A[PHI: r12
  0x00ba: PHI (r12v8 char) = (r12v2 char), (r12v3 char), (r12v4 char), (r12v5 char), (r12v6 char), (r12v1 char), (r12v1 char), (r12v1 char) binds: [B:61:0x00b8, B:60:0x00b5, B:59:0x00b2, B:58:0x00af, B:57:0x00ac, B:141:0x00ba, B:102:0x0118, B:104:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c A[ADDED_TO_REGION] */
    public static void load(ObjectMap<String, String> objectMap, Reader reader) throws IOException {
        char c;
        if (objectMap == null) {
            throw new NullPointerException("properties cannot be null");
        }
        if (reader == null) {
            throw new NullPointerException("reader cannot be null");
        }
        char[] cArr = new char[40];
        BufferedReader bufferedReader = new BufferedReader(reader);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        char c2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = -1;
            boolean z2 = true;
            while (true) {
                int i6 = bufferedReader.read();
                if (i6 != -1) {
                    char c3 = (char) i6;
                    if (i2 == cArr.length) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, i, cArr2, i, i2);
                        cArr = cArr2;
                    }
                    if (c2 == 2) {
                        int iDigit = Character.digit(c3, 16);
                        if (iDigit >= 0) {
                            i4 = (i4 << 4) + iDigit;
                            i3++;
                            if (i3 < 4) {
                                continue;
                            }
                        } else if (i3 <= 4) {
                            throw new IllegalArgumentException("Invalid Unicode sequence: illegal character");
                        }
                        cArr[i2] = (char) i4;
                        i2++;
                        c2 = 0;
                        if (c3 != '\n') {
                            continue;
                        }
                    }
                    if (c2 != z) {
                        if (c3 == '\n') {
                            if (c2 != 3) {
                                break;
                            }
                            z = true;
                            i = 0;
                            c2 = 5;
                        } else {
                            if (c3 == '\r') {
                                break;
                            }
                            if (c3 == '!' || c3 == '#') {
                                if (z2) {
                                    do {
                                        int i7 = bufferedReader.read();
                                        if (i7 == -1 || (c = (char) i7) == '\r') {
                                            break;
                                        }
                                    } while (c != '\n');
                                } else {
                                    if (Character.isSpace(c3)) {
                                        if (c2 == 3) {
                                            c2 = 5;
                                        }
                                        if (i2 == 0 && i2 != i5 && c2 != 5) {
                                            if (i5 == -1) {
                                                z = true;
                                                i = 0;
                                                c2 = 4;
                                            }
                                        }
                                    }
                                    if (c2 != 5 || c2 == 3) {
                                        c2 = 0;
                                    }
                                    if (c2 == 4) {
                                        i5 = i2;
                                        c2 = 0;
                                    }
                                    cArr[i2] = c3;
                                    i2++;
                                    z = true;
                                    i = 0;
                                    z2 = false;
                                }
                                z = true;
                                i = 0;
                            } else if (c3 == ':' || c3 == '=') {
                                if (i5 == -1) {
                                    i5 = i2;
                                    z = true;
                                    i = 0;
                                    c2 = 0;
                                } else {
                                    if (Character.isSpace(c3)) {
                                        if (c2 == 3) {
                                            c2 = 5;
                                        }
                                        if (i2 == 0) {
                                        }
                                        z = true;
                                        i = 0;
                                    }
                                    if (c2 != 5) {
                                        c2 = 0;
                                    } else {
                                        c2 = 0;
                                    }
                                    if (c2 == 4) {
                                        i5 = i2;
                                        c2 = 0;
                                    }
                                    cArr[i2] = c3;
                                    i2++;
                                    z = true;
                                    i = 0;
                                    z2 = false;
                                }
                            } else if (c3 != '\\') {
                                if (Character.isSpace(c3)) {
                                    if (c2 == 3) {
                                        c2 = 5;
                                    }
                                    if (i2 == 0) {
                                    }
                                    z = true;
                                    i = 0;
                                }
                                if (c2 != 5) {
                                    c2 = 0;
                                } else {
                                    c2 = 0;
                                }
                                if (c2 == 4) {
                                    i5 = i2;
                                    c2 = 0;
                                }
                                cArr[i2] = c3;
                                i2++;
                                z = true;
                                i = 0;
                                z2 = false;
                            } else {
                                if (c2 == 4) {
                                    i5 = i2;
                                }
                                z = true;
                                i = 0;
                                c2 = 1;
                            }
                        }
                    } else if (c3 == '\n') {
                        i = 0;
                        c2 = 5;
                    } else if (c3 != '\r') {
                        if (c3 == 'b') {
                            c3 = '\b';
                        } else if (c3 == 'f') {
                            c3 = '\f';
                        } else if (c3 == 'n') {
                            c3 = '\n';
                        } else if (c3 == 'r') {
                            c3 = '\r';
                        } else if (c3 == 't') {
                            c3 = '\t';
                        } else if (c3 == 'u') {
                            i = 0;
                            c2 = 2;
                            i3 = 0;
                            i4 = 0;
                        }
                        c2 = 0;
                        if (c2 == 4) {
                            i5 = i2;
                            c2 = 0;
                        }
                        cArr[i2] = c3;
                        i2++;
                        z = true;
                        i = 0;
                        z2 = false;
                    } else {
                        i = 0;
                        c2 = 3;
                    }
                } else {
                    if (c2 == 2 && i3 <= 4) {
                        throw new IllegalArgumentException("Invalid Unicode sequence: expected format \\uxxxx");
                    }
                    if (i5 == -1 && i2 > 0) {
                        i5 = i2;
                    }
                    if (i5 >= 0) {
                        String str = new String(cArr, i, i2);
                        String strSubstring = str.substring(i, i5);
                        String strSubstring2 = str.substring(i5);
                        if (c2 == z) {
                            strSubstring2 = DM.h(strSubstring2, "\u0000");
                        }
                        objectMap.put(strSubstring, strSubstring2);
                        return;
                    }
                    return;
                }
            }
            if (i2 > 0 || (i2 == 0 && i5 == 0)) {
                if (i5 == -1) {
                    i5 = i2;
                }
                i = 0;
                String str2 = new String(cArr, 0, i2);
                objectMap.put(str2.substring(0, i5), str2.substring(i5));
            } else {
                i = 0;
            }
            z = true;
            i2 = 0;
            c2 = 0;
        }
    }

    public static void store(ObjectMap<String, String> objectMap, Writer writer, String str) throws IOException {
        storeImpl(objectMap, writer, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void storeImpl(ObjectMap<String, String> objectMap, Writer writer, String str, boolean z) throws IOException {
        if (str != null) {
            writeComment(writer, str);
        }
        writer.write("#");
        writer.write(new Date().toString());
        writer.write("\n");
        StringBuilder stringBuilder = new StringBuilder(200);
        ObjectMap.Entries<String, String> it = objectMap.entries().iterator();
        while (it.hasNext()) {
            ObjectMap.Entry next = it.next();
            dumpString(stringBuilder, (String) next.key, true, z);
            stringBuilder.append('=');
            dumpString(stringBuilder, (String) next.value, false, z);
            writer.write("\n");
            writer.write(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        writer.flush();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    private static void writeComment(Writer writer, String str) throws IOException {
        writer.write("#");
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255 || cCharAt == '\n' || cCharAt == '\r') {
                if (i2 != i) {
                    writer.write(str.substring(i2, i));
                }
                if (cCharAt > 255) {
                    String hexString = Integer.toHexString(cCharAt);
                    writer.write("\\u");
                    for (int i3 = 0; i3 < 4 - hexString.length(); i3++) {
                        writer.write(48);
                    }
                    writer.write(hexString);
                } else {
                    writer.write("\n");
                    if (cCharAt == '\r' && i != length - 1) {
                        int i4 = i + 1;
                        if (str.charAt(i4) == '\n') {
                            i = i4;
                        }
                    }
                    if (i != length - 1) {
                        int i5 = i + 1;
                        if (str.charAt(i5) != '#' && str.charAt(i5) != '!') {
                            writer.write("#");
                        }
                    } else {
                        writer.write("#");
                    }
                }
                i2 = i + 1;
            }
            i++;
        }
        if (i2 != i) {
            writer.write(str.substring(i2, i));
        }
        writer.write("\n");
    }
}
