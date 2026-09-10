package androidx.emoji2.text.flatbuffer;

import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class FlexBuffers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayReadWriteBuf f5005a;

    public static class Blob extends Sized {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Blob f5006e = new Blob(FlexBuffers.f5005a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append(AbstractJsonLexerKt.STRING);
            sb.append(this.f5008a.a(this.f5009b, this.d));
            sb.append(AbstractJsonLexerKt.STRING);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            return this.f5008a.a(this.f5009b, this.d);
        }
    }

    public static class FlexBufferException extends RuntimeException {
    }

    public static class Key extends Object {
        public static final Key d = new Key(FlexBuffers.f5005a, 0, 0);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f5009b == this.f5009b && key.f5010c == this.f5010c;
        }

        public final int hashCode() {
            return this.f5009b ^ this.f5010c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final String toString() {
            int i2 = this.f5009b;
            int i3 = i2;
            while (true) {
                ReadBuf readBuf = this.f5008a;
                if (readBuf.get(i3) == 0) {
                    return readBuf.a(i2, i3 - i2);
                }
                i3++;
            }
        }
    }

    public static class KeyVector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypedVector f5007a;

        public KeyVector(TypedVector typedVector) {
            this.f5007a = typedVector;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            int i2 = 0;
            while (true) {
                TypedVector typedVector = this.f5007a;
                int i3 = typedVector.d;
                if (i2 >= i3) {
                    sb.append(d9.i.f24752e);
                    return sb.toString();
                }
                typedVector.b(i2).d(sb);
                if (i2 != i3 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
        }
    }

    public static class Map extends Vector {
        public static final Map f = new Map(FlexBuffers.f5005a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public final StringBuilder a(StringBuilder sb) {
            Key key;
            sb.append("{ ");
            int i2 = this.f5010c;
            int i3 = this.f5009b;
            int i4 = i3 - (i2 * 3);
            ReadBuf readBuf = this.f5008a;
            KeyVector keyVector = new KeyVector(new TypedVector(readBuf, FlexBuffers.a(readBuf, i4, i2), (int) FlexBuffers.c(readBuf, i4 + i2, i2), 4));
            Vector vector = new Vector(readBuf, i3, i2);
            int i5 = 0;
            while (true) {
                int i6 = this.d;
                if (i5 >= i6) {
                    sb.append(" }");
                    return sb;
                }
                sb.append(AbstractJsonLexerKt.STRING);
                TypedVector typedVector = keyVector.f5007a;
                if (i5 >= typedVector.d) {
                    key = Key.d;
                } else {
                    int i7 = typedVector.f5009b;
                    int i8 = typedVector.f5010c;
                    ReadBuf readBuf2 = typedVector.f5008a;
                    key = new Key(readBuf2, FlexBuffers.a(readBuf2, (i5 * i8) + i7, i8), 1);
                }
                sb.append(key.toString());
                sb.append("\" : ");
                sb.append(vector.b(i5).toString());
                if (i5 != i6 - 1) {
                    sb.append(", ");
                }
                i5++;
            }
        }
    }

    public static abstract class Object {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReadBuf f5008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5010c;

        public Object(ReadBuf readBuf, int i2, int i3) {
            this.f5008a = readBuf;
            this.f5009b = i2;
            this.f5010c = i3;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class Reference {
        public static final Reference f = new Reference(FlexBuffers.f5005a, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReadBuf f5011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5013c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5014e;

        public Reference(ReadBuf readBuf, int i2, int i3, int i4) {
            this(readBuf, i2, i3, 1 << (i4 & 3), i4 >> 2);
        }

        public final String a() {
            int i2 = this.f5014e;
            boolean z2 = i2 == 5;
            int i3 = this.d;
            int i4 = this.f5012b;
            ReadBuf readBuf = this.f5011a;
            if (z2) {
                int iA = FlexBuffers.a(readBuf, i4, this.f5013c);
                return readBuf.a(iA, (int) FlexBuffers.d(readBuf, iA - i3, i3));
            }
            if (i2 != 4) {
                return "";
            }
            int iA2 = FlexBuffers.a(readBuf, i4, i3);
            int i5 = iA2;
            while (readBuf.get(i5) != 0) {
                i5++;
            }
            return readBuf.a(iA2, i5 - iA2);
        }

        public final long b() {
            int i2 = this.f5012b;
            ReadBuf readBuf = this.f5011a;
            int i3 = this.f5013c;
            int i4 = this.f5014e;
            if (i4 == 2) {
                return FlexBuffers.d(readBuf, i2, i3);
            }
            if (i4 == 1) {
                return FlexBuffers.c(readBuf, i2, i3);
            }
            if (i4 == 3) {
                return (long) FlexBuffers.b(readBuf, i2, i3);
            }
            if (i4 == 10) {
                return c().d;
            }
            if (i4 == 26) {
                return (int) FlexBuffers.c(readBuf, i2, i3);
            }
            if (i4 == 5) {
                return Long.parseLong(a());
            }
            int i5 = this.d;
            if (i4 == 6) {
                return FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i2, i3), i5);
            }
            if (i4 == 7) {
                return FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i2, i3), i5);
            }
            if (i4 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i2, i3), i3);
        }

        public final Vector c() {
            int i2 = this.f5014e;
            int i3 = this.d;
            int i4 = this.f5013c;
            int i5 = this.f5012b;
            ReadBuf readBuf = this.f5011a;
            if (i2 == 10 || i2 == 9) {
                return new Vector(readBuf, FlexBuffers.a(readBuf, i5, i4), i3);
            }
            if (i2 == 15) {
                return new TypedVector(readBuf, FlexBuffers.a(readBuf, i5, i4), i3, 4);
            }
            return ((i2 < 11 || i2 > 15) && i2 != 36) ? Vector.f5015e : new TypedVector(readBuf, FlexBuffers.a(readBuf, i5, i4), i3, i2 - 10);
        }

        /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
        public final StringBuilder d(StringBuilder sb) {
            long jD;
            double dB;
            int iC;
            long jC;
            int i2;
            double dB2;
            long jD2;
            int i3 = this.f5014e;
            if (i3 != 36) {
                int i4 = this.d;
                int i5 = this.f5013c;
                int i6 = this.f5012b;
                ReadBuf readBuf = this.f5011a;
                boolean z2 = true;
                switch (i3) {
                    case 0:
                        sb.append(AbstractJsonLexerKt.NULL);
                        return sb;
                    case 1:
                    case 6:
                        if (i3 == 1) {
                            jD = FlexBuffers.c(readBuf, i6, i5);
                        } else if (i3 != 2) {
                            if (i3 == 3) {
                                dB = FlexBuffers.b(readBuf, i6, i5);
                            } else if (i3 == 5) {
                                try {
                                    jD = Long.parseLong(a());
                                } catch (NumberFormatException unused) {
                                    jD = 0;
                                }
                                break;
                            } else if (i3 == 6) {
                                jD = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i6, i5), i4);
                            } else if (i3 == 7) {
                                jD = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i6, i5), i5);
                            } else if (i3 != 8) {
                                if (i3 == 10) {
                                    iC = c().d;
                                } else if (i3 != 26) {
                                    jD = 0;
                                } else {
                                    iC = (int) FlexBuffers.c(readBuf, i6, i5);
                                }
                                jD = iC;
                            } else {
                                dB = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i6, i5), i4);
                            }
                            jD = (long) dB;
                        } else {
                            jD = FlexBuffers.d(readBuf, i6, i5);
                        }
                        sb.append(jD);
                        return sb;
                    case 2:
                    case 7:
                        sb.append(b());
                        return sb;
                    case 3:
                    case 8:
                        if (i3 == 3) {
                            dB2 = FlexBuffers.b(readBuf, i6, i5);
                        } else {
                            if (i3 == 1) {
                                jC = FlexBuffers.c(readBuf, i6, i5);
                            } else if (i3 == 2) {
                                jD2 = FlexBuffers.d(readBuf, i6, i5);
                                dB2 = jD2;
                            } else if (i3 == 5) {
                                dB2 = Double.parseDouble(a());
                            } else if (i3 == 6) {
                                jC = FlexBuffers.c(readBuf, FlexBuffers.a(readBuf, i6, i5), i4);
                            } else if (i3 == 7) {
                                jD2 = FlexBuffers.d(readBuf, FlexBuffers.a(readBuf, i6, i5), i4);
                                dB2 = jD2;
                            } else if (i3 == 8) {
                                dB2 = FlexBuffers.b(readBuf, FlexBuffers.a(readBuf, i6, i5), i4);
                            } else if (i3 == 10) {
                                i2 = c().d;
                                dB2 = i2;
                            } else if (i3 != 26) {
                                dB2 = 0.0d;
                            } else {
                                jD2 = FlexBuffers.d(readBuf, i6, i5);
                                dB2 = jD2;
                            }
                            i2 = (int) jC;
                            dB2 = i2;
                        }
                        sb.append(dB2);
                        return sb;
                    case 4:
                        Key key = i3 == 4 ? new Key(readBuf, FlexBuffers.a(readBuf, i6, i5), i4) : Key.d;
                        sb.append(AbstractJsonLexerKt.STRING);
                        key.a(sb);
                        sb.append(AbstractJsonLexerKt.STRING);
                        return sb;
                    case 5:
                        sb.append(AbstractJsonLexerKt.STRING);
                        sb.append(a());
                        sb.append(AbstractJsonLexerKt.STRING);
                        return sb;
                    case 9:
                        (i3 == 9 ? new Map(readBuf, FlexBuffers.a(readBuf, i6, i5), i4) : Map.f).a(sb);
                        return sb;
                    case 10:
                        c().a(sb);
                        return sb;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException(android.support.v4.media.a.h(i3, "not_implemented:"));
                    case 25:
                        ((i3 == 25 || i3 == 5) ? new Blob(readBuf, FlexBuffers.a(readBuf, i6, i5), i4) : Blob.f5006e).a(sb);
                        return sb;
                    case 26:
                        if (i3 != 26 ? b() == 0 : readBuf.get(i6) == 0) {
                            z2 = false;
                        }
                        sb.append(z2);
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(c());
            return sb;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            d(sb);
            return sb.toString();
        }

        public Reference(ReadBuf readBuf, int i2, int i3, int i4, int i5) {
            this.f5011a = readBuf;
            this.f5012b = i2;
            this.f5013c = i3;
            this.d = i4;
            this.f5014e = i5;
        }
    }

    public static abstract class Sized extends Object {
        public final int d;

        public Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.d = (int) FlexBuffers.c(readBuf, i2 - i3, i3);
        }
    }

    public static class TypedVector extends Vector {
        public final int f;

        static {
            new TypedVector(FlexBuffers.f5005a, 1, 1, 1);
        }

        public TypedVector(ReadBuf readBuf, int i2, int i3, int i4) {
            super(readBuf, i2, i3);
            this.f = i4;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public final Reference b(int i2) {
            if (i2 >= this.d) {
                return Reference.f;
            }
            return new Reference(this.f5008a, (i2 * this.f5010c) + this.f5009b, this.f5010c, 1, this.f);
        }
    }

    public static class Unsigned {
    }

    public static class Vector extends Sized {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Vector f5015e = new Vector(FlexBuffers.f5005a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int i2 = 0;
            while (true) {
                int i3 = this.d;
                if (i2 >= i3) {
                    sb.append(" ]");
                    return sb;
                }
                b(i2).d(sb);
                if (i2 != i3 - 1) {
                    sb.append(", ");
                }
                i2++;
            }
        }

        public Reference b(int i2) {
            long j = this.d;
            long j2 = i2;
            if (j2 >= j) {
                return Reference.f;
            }
            int i3 = this.f5009b;
            int i4 = this.f5010c;
            long j3 = j * ((long) i4);
            ReadBuf readBuf = this.f5008a;
            return new Reference(readBuf, (i2 * i4) + i3, i4, readBuf.get((int) (j3 + ((long) i3) + j2)) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
    }

    static {
        ArrayReadWriteBuf arrayReadWriteBuf = new ArrayReadWriteBuf();
        arrayReadWriteBuf.f5004a = new byte[]{0};
        f5005a = arrayReadWriteBuf;
    }

    public static int a(ReadBuf readBuf, int i2, int i3) {
        return (int) (((long) i2) - d(readBuf, i2, i3));
    }

    public static double b(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 4) {
            return readBuf.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i2);
    }

    public static long c(ReadBuf readBuf, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = readBuf.get(i2);
        } else if (i3 == 2) {
            i4 = readBuf.getShort(i2);
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i2);
            }
            i4 = readBuf.getInt(i2);
        }
        return i4;
    }

    public static long d(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 1) {
            return readBuf.get(i2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i3 == 2) {
            return readBuf.getShort(i2) & 65535;
        }
        if (i3 == 4) {
            return ((long) readBuf.getInt(i2)) & 4294967295L;
        }
        if (i3 != 8) {
            return -1L;
        }
        return readBuf.getLong(i2);
    }
}
