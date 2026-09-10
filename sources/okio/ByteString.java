package okio;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", ScarConstants.IN_SIGNAL_KEY, "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "X", "[B", "getData$okio", "()[B", "data", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString e0 = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final byte[] data;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient int f45134Y;
    public transient String Z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokio/ByteString$Companion;", "", "Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:68:0x00e8 A[RETURN] */
        public static ByteString a(String str) {
            char c2;
            int i2;
            char cCharAt;
            char c3 = 'A';
            Intrinsics.f(str, "<this>");
            byte[] bArr = Base64.f45128a;
            int length = str.length();
            while (true) {
                c2 = '\t';
                if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                    break;
                }
                length--;
            }
            int i3 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i4 >= length) {
                    int i8 = i5 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                            i7 = 1 + i7;
                        } else if (i8 == 3) {
                            int i9 = i6 << 6;
                            int i10 = 1 + i7;
                            bArrCopyOf[i7] = (byte) (i9 >> 16);
                            i7 += 2;
                            bArrCopyOf[i10] = (byte) (i9 >> 8);
                        }
                        if (i7 != i3) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                            Intrinsics.e(bArrCopyOf, "copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i4);
                char c4 = c3;
                if (c3 <= cCharAt2 && cCharAt2 < '[') {
                    i2 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i2 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i2 = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i2 = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c2) {
                            break;
                        }
                    } else {
                        i2 = 63;
                    }
                    i4++;
                    c3 = c4;
                    c2 = '\t';
                }
                int i11 = i2 | (i6 << 6);
                i5++;
                if (i5 % 4 == 0) {
                    bArrCopyOf[i7] = (byte) (i11 >> 16);
                    int i12 = i7 + 2;
                    bArrCopyOf[i7 + 1] = (byte) (i11 >> 8);
                    i7 += 3;
                    bArrCopyOf[i12] = (byte) i11;
                }
                i6 = i11;
                i4++;
                c3 = c4;
                c2 = '\t';
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString(bArrCopyOf);
            }
            return null;
        }

        public static ByteString b(String str) {
            Intrinsics.f(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (okio.internal.ByteString.a(str.charAt(i3 + 1)) + (okio.internal.ByteString.a(str.charAt(i3)) << 4));
            }
            return new ByteString(bArr);
        }

        public static ByteString c(String str) {
            Intrinsics.f(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.Z = str;
            return byteString;
        }

        public static ByteString d(byte[] bArr) {
            ByteString byteString = ByteString.e0;
            int length = bArr.length;
            SegmentedByteString.b(bArr.length, 0, length);
            return new ByteString(ArraysKt.q(0, length, bArr));
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.f(data, "data");
        this.data = data;
    }

    public static int k(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.f(other, "other");
        return byteString.j(other.data, 0);
    }

    public static int o(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.f(other, "other");
        return byteString.n(other.data);
    }

    public static final ByteString p(byte... data) {
        Intrinsics.f(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.e(bArrCopyOf, "copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i2 = in.readInt();
        if (i2 < 0) {
            throw new IllegalArgumentException(a.h(i2, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = in.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 += i4;
        }
        ByteString byteString = new ByteString(bArr);
        Field declaredField = ByteString.class.getDeclaredField("X");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString t(ByteString byteString, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = -1234567890;
        }
        return byteString.s(i2, i3);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    public String d() {
        byte[] bArr = this.data;
        byte[] map = Base64.f45128a;
        Intrinsics.f(bArr, "<this>");
        Intrinsics.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i2 + 2;
            byte b3 = bArr[i2 + 1];
            i2 += 3;
            byte b4 = bArr[i4];
            bArr2[i3] = map[(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i3 + 1] = map[((b2 & 3) << 4) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = map[((b3 & 15) << 2) | ((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 6)];
            i3 += 4;
            bArr2[i5] = map[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            bArr2[i3] = map[(b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i3 + 1] = map[(b5 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i6];
            bArr2[i3] = map[(b6 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr2[i3 + 1] = map[((b6 & 3) << 4) | ((b7 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            bArr2[i3 + 2] = map[(b7 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        return new String(bArr2, Charsets.f44691a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iH = byteString.h();
            byte[] bArr = this.data;
            if (iH == bArr.length && byteString.r(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString other) {
        Intrinsics.f(other, "other");
        int iH = h();
        int iH2 = other.h();
        int iMin = Math.min(iH, iH2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iM = m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iM2 = other.m(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iH == iH2) {
            return 0;
        }
        return iH < iH2 ? -1 : 1;
    }

    public ByteString g(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, h());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public int h() {
        return this.data.length;
    }

    public int hashCode() {
        int i2 = this.f45134Y;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f45134Y = iHashCode;
        return iHashCode;
    }

    public String i() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = okio.internal.ByteString.f45169a;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int j(byte[] other, int i2) {
        Intrinsics.f(other, "other");
        int length = this.data.length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.a(this.data, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte m(int i2) {
        return this.data[i2];
    }

    public int n(byte[] other) {
        Intrinsics.f(other, "other");
        for (int iMin = Math.min(h(), this.data.length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.a(this.data, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean q(int i2, ByteString other, int i3) {
        Intrinsics.f(other, "other");
        return other.r(0, this.data, i2, i3);
    }

    public boolean r(int i2, byte[] other, int i3, int i4) {
        Intrinsics.f(other, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr = this.data;
        return i2 <= bArr.length - i4 && i3 >= 0 && i3 <= other.length - i4 && SegmentedByteString.a(bArr, i2, other, i3, i4);
    }

    public ByteString s(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = h();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(a.p(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (i3 - i2 >= 0) {
            return (i2 == 0 && i3 == bArr.length) ? this : new ByteString(ArraysKt.q(i2, i3, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01ae A[EDGE_INSN: B:182:0x01ae->B:183:0x01af BREAK  A[LOOP:0: B:7:0x000e->B:244:0x000e]] */
    public String toString() {
        byte b2;
        int i2;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b3 = bArr[i3];
            if (b3 < 0) {
                if ((b3 >> 5) != -2) {
                    if ((b3 >> 4) != -2) {
                        if ((b3 >> 3) != -2) {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i6 = i3 + 3;
                        if (length > i6) {
                            byte b4 = bArr[i3 + 1];
                            if ((b4 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b5 = bArr[i3 + 2];
                            if ((b5 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b6 = bArr[i6];
                            if ((b6 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i7 = (((b6 ^ 3678080) ^ (b5 << 6)) ^ (b4 << 12)) ^ (b3 << 18);
                            if (i7 <= 1114111) {
                                if (55296 <= i7 && i7 < 57344) {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                if (i7 >= 65536) {
                                    i2 = i5 + 1;
                                    if (i5 == 64) {
                                        break;
                                    }
                                    if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                        i4 = -1;
                                        break;
                                    }
                                    i4 += i7 < 65536 ? 1 : 2;
                                    i3 += 4;
                                    i5 = i2;
                                } else {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                            } else {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        int i8 = i3 + 2;
                        if (length > i8) {
                            byte b7 = bArr[i3 + 1];
                            if ((b7 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b8 = bArr[i8];
                            if ((b8 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i9 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b3 << 12);
                            if (i9 >= 2048) {
                                if (55296 <= i9 && i9 < 57344) {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                i2 = i5 + 1;
                                if (i5 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    i4 = -1;
                                    break;
                                }
                                i4 += i9 < 65536 ? 1 : 2;
                                i3 += 3;
                                i5 = i2;
                            } else {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    }
                } else {
                    int i10 = i3 + 1;
                    if (length > i10) {
                        byte b9 = bArr[i10];
                        if ((b9 & 192) != 128) {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i11 = (b9 ^ 3968) ^ (b3 << 6);
                        if (i11 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                i4 = -1;
                                break;
                            }
                            i4 += i11 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        if (i5 == 64) {
                            break;
                        }
                        i4 = -1;
                        break;
                    }
                }
            } else {
                int i12 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b3 == 10 || b3 == 13 || ((b3 < 0 || b3 >= 32) && (127 > b3 || b3 >= 160))) && b3 != 65533) {
                    i4 += b3 < 65536 ? 1 : 2;
                    i3++;
                    while (true) {
                        i5 = i12;
                        if (i3 < length && (b2 = bArr[i3]) >= 0) {
                            i3++;
                            i12 = i5 + 1;
                            if (i5 == 64) {
                                break loop0;
                            }
                            if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                                i4 += b2 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i4 = -1;
                break;
            }
        }
        if (i4 != -1) {
            String strV = v();
            String strSubstring = strV.substring(0, i4);
            Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strI = StringsKt.I(StringsKt.I(StringsKt.I(strSubstring, "\\", "\\\\"), IOUtils.LINE_SEPARATOR_UNIX, "\\n"), "\r", "\\r");
            if (i4 >= strV.length()) {
                return androidx.media3.extractor.text.ttml.a.i(AbstractJsonLexerKt.END_LIST, "[text=", strI);
            }
            return "[size=" + this.data.length + " text=" + strI + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + i() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.data.length);
        sb.append(" hex=");
        byte[] bArr2 = this.data;
        if (64 > bArr2.length) {
            throw new IllegalArgumentException(a.p(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        sb.append((64 == bArr2.length ? this : new ByteString(ArraysKt.q(0, 64, bArr2))).i());
        sb.append("…]");
        return sb.toString();
    }

    public ByteString u() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.e(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b3 = bArrCopyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i2++;
        }
    }

    public final String v() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        byte[] data = getData();
        Intrinsics.f(data, "<this>");
        String str2 = new String(data, Charsets.f44691a);
        this.Z = str2;
        return str2;
    }

    public void w(int i2, Buffer buffer) {
        Intrinsics.f(buffer, "buffer");
        buffer.S(this.data, 0, i2);
    }
}
