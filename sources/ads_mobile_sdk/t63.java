package ads_mobile_sdk;

import java.nio.charset.StandardCharsets;
import saneness.civitan;
import saneness.defective;
import saneness.unready;

/* JADX INFO: loaded from: classes.dex */
public abstract class t63 {
    public static final unready a;

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    static {
        unready civitanVar;
        if (!sb.b() && n53.e && n53.d) {
            try {
                if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                    civitanVar = new civitan();
                } else {
                    civitanVar = new defective();
                }
            } catch (SecurityException unused) {
            }
        } else {
            civitanVar = new civitan();
        }
        a = civitanVar;
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new r63(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (r63 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.wireman(bArr, i, i2);
    }
}
