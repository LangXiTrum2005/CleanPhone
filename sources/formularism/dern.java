package formularism;

import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lformularism/dern;", "", "<init>", "()V", "", "inbound", "", "streamId", "length", "type", "flags", "", "dern", "(ZIIII)Ljava/lang/String;", "saneness", "(I)Ljava/lang/String;", "attabal", "(II)Ljava/lang/String;", "Lokio/ByteString;", "Lokio/ByteString;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "wireman", "FLAGS", "marial", "BINARY", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final String[] BINARY;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f26356attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final ByteString CONNECTION_PREFACE = ByteString.INSTANCE.wireman("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            strArr[i2] = dovishness.merc(hereditist.wireman.graveside("%8s", binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = Intrinsics.arytenoidectomy(strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = FLAGS;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = FLAGS.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i] == null) {
                strArr4[i] = BINARY[i];
            }
            i = i8;
        }
    }

    public final String attabal(int type, int flags) {
        String str;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : BINARY[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = FLAGS;
                if (flags < strArr.length) {
                    str = strArr[flags];
                    Intrinsics.beachfront(str);
                } else {
                    str = BINARY[flags];
                }
                String str2 = str;
                if (type != 5 || (flags & 4) == 0) {
                    return (type != 0 || (flags & 32) == 0) ? str2 : dovishness.polder(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return dovishness.polder(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[flags];
    }

    public final String dern(boolean inbound, int streamId, int length, int type, int flags) {
        return hereditist.wireman.graveside("%s 0x%08x %5d %-13s %s", inbound ? "<<" : ">>", Integer.valueOf(streamId), Integer.valueOf(length), saneness(type), attabal(type, flags));
    }

    public final String saneness(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : hereditist.wireman.graveside("0x%02x", Integer.valueOf(type));
    }
}
