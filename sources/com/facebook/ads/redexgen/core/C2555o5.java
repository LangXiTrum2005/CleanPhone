package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2555o5 implements InterfaceC1086Bd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, 29, 29, 12, 4, 25, 29, 12, 13, 73, 29, 6, 73, 10, 27, 12, 8, 29, 12, 73, 13, 12, 10, 6, 13, 12, 27, 73, 15, 6, 27, 73, 28, 7, 26, 28, 25, 25, 6, 27, 29, 12, 13, 73, 36, RemoteControlWriter.BLOCK_CMDOK, 36, 44, 73, 29, ExecutionDataWriter.BLOCK_SESSIONINFO, 25, 12, 83, 73, 25, 8, 8, 20, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 27, 25, 12, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 23, 22, 87, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 28, 75, 19, 2, 2, 30, 27, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 19, 6, 27, 29, 28, 93, 10, 95, 23, 31, 1, 21, 5, 20, 20, 8, 13, 7, 5, ExecutionDataWriter.BLOCK_SESSIONINFO, 13, 11, 10, 75, 28, 73, 13, 7, 29, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 35, 118, 40, 56, 47, 62, 104, 110};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Bd
    public final InterfaceC1257Hw A5J(C2691qI c2691qI) {
        byte b;
        String str = c2691qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    String mimeType = A00(88, 17, 73);
                    if (!str.equals(mimeType)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1248341703:
                    String mimeType2 = A00(55, 15, 85);
                    if (!str.equals(mimeType2)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 1154383568:
                    String mimeType3 = A00(70, 18, 95);
                    if (!str.equals(mimeType3)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 1652648887:
                    String mimeType4 = A00(105, 20, 118);
                    if (!str.equals(mimeType4)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    return new C9U();
                case 1:
                    return new AbstractC2463mZ() { // from class: com.facebook.ads.redexgen.X.9d
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        private final EventMessage A00(C09384v c09384v) {
                            return new EventMessage((String) AbstractC09153y.A01(c09384v.A0U()), (String) AbstractC09153y.A01(c09384v.A0U()), c09384v.A0P(), c09384v.A0P(), Arrays.copyOfRange(c09384v.A0l(), c09384v.A09(), c09384v.A0A()));
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC2463mZ
                        public final Metadata A0R(C10459e c10459e, ByteBuffer byteBuffer) {
                            return new Metadata(A00(new C09384v(byteBuffer.array(), byteBuffer.limit())));
                        }
                    };
                case 2:
                    return new AbstractC2463mZ() { // from class: com.facebook.ads.redexgen.X.94
                        public static String[] A03 = {"LinnqKc1r0Ls5OIb", "1aWHF9GftncklZYsR1NJvylUpCZwYQhA", "WIGwItTSIaUh0S", "86hqVYxCYoyBTLzVv0XRyx6tGel5Hfof", "L8UaESXrw6FNBEuX", "ZSKLe1wjy7TzDmQANFt3bVwH52LTNoGA", "sWuUgP3CrL0lX60YF5iqvlGlBvq7Icsz", "4dV7lZySL5Inrb"};
                        public AnonymousClass53 A00;
                        public final C09384v A02 = new C09384v();
                        public final C09374u A01 = new C09374u();

                        @Override // com.facebook.ads.redexgen.core.AbstractC2463mZ
                        public final Metadata A0R(C10459e c10459e, ByteBuffer byteBuffer) {
                            if (this.A00 == null || c10459e.A00 != this.A00.A04()) {
                                this.A00 = new AnonymousClass53(c10459e.A01);
                                this.A00.A05(c10459e.A01 - c10459e.A00);
                            }
                            byte[] bArrArray = byteBuffer.array();
                            int size = byteBuffer.limit();
                            this.A02.A0j(bArrArray, size);
                            this.A01.A0E(bArrArray, size);
                            this.A01.A09(39);
                            long jA04 = (((long) this.A01.A04(1)) << 32) | ((long) this.A01.A04(32));
                            this.A01.A09(20);
                            int iA04 = this.A01.A04(12);
                            int spliceCommandType = this.A01.A04(8);
                            Metadata.Entry spliceNullCommand = null;
                            this.A02.A0g(14);
                            switch (spliceCommandType) {
                                case 0:
                                    spliceNullCommand = new SpliceNullCommand();
                                    break;
                                case 4:
                                    spliceNullCommand = SpliceScheduleCommand.A00(this.A02);
                                    break;
                                case 5:
                                    C09384v c09384v = this.A02;
                                    String[] strArr = A03;
                                    if (strArr[0].length() != strArr[4].length()) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A03;
                                    strArr2[0] = "3zG9Y3L3pcSl9hsO";
                                    strArr2[4] = "rzd7tnlstbcgZZIh";
                                    spliceNullCommand = SpliceInsertCommand.A00(c09384v, jA04, this.A00);
                                    break;
                                case 6:
                                    spliceNullCommand = TimeSignalCommand.A01(this.A02, jA04, this.A00);
                                    break;
                                case 255:
                                    spliceNullCommand = PrivateCommand.A00(this.A02, iA04, jA04);
                                    break;
                            }
                            return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
                        }
                    };
                case 3:
                    return new AbstractC2463mZ() { // from class: com.facebook.ads.redexgen.X.9c
                        public static byte[] A02;
                        public static String[] A03 = {"Lh0eiN4oYILfPl4jy3dJZhwMArdhxg", "ZZdJzt9nksvE8tVcjKh5yb5LHp4DKBwy", "Dbw1S4FpTZ", "Q8KOrM0jMS", "", "1W", "E5bBazuIHkpw9TIkFnjV805WNgqTNchu", "VvZ"};
                        public static final Pattern A04;
                        public final CharsetDecoder A01 = AbstractC2328k9.A05.newDecoder();
                        public final CharsetDecoder A00 = AbstractC2328k9.A00.newDecoder();

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A02() {
                            byte[] bArr = {72, 78, 75, 95, 73, 93, 71, 72, 78, 74, 95, 73, 71, 91, 11, 12, 10, 29, 25, 21, 12, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 12, 20, 29, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 22, ExecutionDataWriter.BLOCK_SESSIONINFO, 7, 3, 15, 23, ExecutionDataWriter.BLOCK_SESSIONINFO, 14};
                            String[] strArr = A03;
                            if (strArr[3].length() != strArr[2].length()) {
                                throw new RuntimeException();
                            }
                            A03[7] = "K4Z";
                            A02 = bArr;
                        }

                        static {
                            A02();
                            A04 = Pattern.compile(A00(0, 14, 85), 32);
                        }

                        private String A01(ByteBuffer byteBuffer) {
                            try {
                                String string = this.A01.decode(byteBuffer).toString();
                                this.A01.reset();
                                byteBuffer.rewind();
                                return string;
                            } catch (CharacterCodingException unused) {
                                this.A01.reset();
                                byteBuffer.rewind();
                                try {
                                    return this.A00.decode(byteBuffer).toString();
                                } catch (CharacterCodingException unused2) {
                                    return null;
                                } finally {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                }
                            } catch (Throwable th) {
                                this.A01.reset();
                                byteBuffer.rewind();
                                throw th;
                            }
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
                        @Override // com.facebook.ads.redexgen.core.AbstractC2463mZ
                        public final Metadata A0R(C10459e c10459e, ByteBuffer byteBuffer) {
                            byte b2;
                            String strA01 = A01(byteBuffer);
                            byte[] bArr = new byte[byteBuffer.limit()];
                            byteBuffer.get(bArr);
                            if (strA01 == null) {
                                return new Metadata(new IcyInfo(bArr, null, null));
                            }
                            String str2 = null;
                            String name = null;
                            Pattern pattern = A04;
                            String icyString = A03[7];
                            if (icyString.length() != 3) {
                                throw new RuntimeException();
                            }
                            A03[4] = "";
                            Matcher matcher = pattern.matcher(strA01);
                            for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                                String strGroup = matcher.group(1);
                                String strGroup2 = matcher.group(2);
                                if (strGroup != null) {
                                    String key = AbstractC2326k7.A01(strGroup);
                                    switch (key.hashCode()) {
                                        case -315603473:
                                            if (key.equals(A00(25, 9, 87))) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 1646559960:
                                            if (key.equals(A00(14, 11, 77))) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    switch (b2) {
                                        case 0:
                                            str2 = strGroup2;
                                            break;
                                        case 1:
                                            name = strGroup2;
                                            break;
                                    }
                                }
                            }
                            return new Metadata(new IcyInfo(bArr, str2, name));
                        }
                    };
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType5 = A00(0, 55, 68);
        throw new IllegalArgumentException(sb.append(mimeType5).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Bd
    public final boolean AKN(C2691qI c2691qI) {
        String str = c2691qI.A0W;
        String mimeType = A00(55, 15, 85);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(70, 18, 95);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(105, 20, 118);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(88, 17, 73);
                    if (!mimeType4.equals(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
