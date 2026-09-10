package com.airbnb.lottie.parser.moshi;

import com.applovin.shadow.okio.internal.Buffer;
import com.ironsource.mediationsdk.metadata.a;
import duvetyn.beachfront;
import duvetyn.wireman;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends JsonReader {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f16166cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public String f16167cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final beachfront f16168dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final wireman f16169gintrap;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public long f16170preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f16171rotuma = 0;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final ByteString f16163stratoscope = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final ByteString f16164trm = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final ByteString f16161oilcan = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final ByteString f16165yemenite = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final ByteString f16162sealless = ByteString.encodeUtf8("*/");

    public attabal(beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f16168dovishness = beachfrontVar;
        this.f16169gintrap = beachfrontVar.getBufferField();
        merc(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean arytenoidectomy() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 5) {
            this.f16171rotuma = 0;
            int[] iArr = this.f16157polloi;
            int i = this.f16154kowloon - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iDent == 6) {
            this.f16171rotuma = 0;
            int[] iArr2 = this.f16157polloi;
            int i2 = this.f16154kowloon - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + restrictive() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16171rotuma = 0;
        this.f16152arytenoidectomy[0] = 8;
        this.f16154kowloon = 1;
        this.f16169gintrap.attabal();
        this.f16168dovishness.close();
    }

    public final int coi() throws IOException {
        long j;
        int i;
        boolean z = true;
        int i2 = 0;
        char c = 0;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f16168dovishness.request(i3)) {
                j = 0;
                i = 0;
                break;
            }
            j = 0;
            byte bCuirassed = this.f16169gintrap.cuirassed(i2);
            i = 0;
            if (bCuirassed != 43) {
                if (bCuirassed == 69 || bCuirassed == 101) {
                    if (c != 2 && c != 4) {
                        return 0;
                    }
                    c = 5;
                } else if (bCuirassed != 45) {
                    if (bCuirassed != 46) {
                        if (bCuirassed < 48 || bCuirassed > 57) {
                            if (!milliradian(bCuirassed)) {
                                break;
                            }
                            return 0;
                        }
                        if (c == 1 || c == 0) {
                            j2 = -(bCuirassed - 48);
                            c = 2;
                        } else if (c == 2) {
                            if (j2 == 0) {
                                return 0;
                            }
                            long j3 = (10 * j2) - ((long) (bCuirassed - 48));
                            z &= j2 > Buffer.OVERFLOW_ZONE || (j2 == Buffer.OVERFLOW_ZONE && j3 < j2);
                            j2 = j3;
                        } else if (c == 3) {
                            c = 4;
                        } else if (c == 5 || c == 6) {
                            c = 7;
                        }
                    } else {
                        if (c != 2) {
                            return 0;
                        }
                        c = 3;
                    }
                } else if (c == 0) {
                    c = 1;
                    z2 = true;
                } else if (c != 5) {
                    return 0;
                }
                i2 = i3;
            } else if (c != 5) {
                return 0;
            }
            c = 6;
            i2 = i3;
        }
        if (c == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != j || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.f16170preprohormone = j2;
            this.f16169gintrap.skip(i2);
            this.f16171rotuma = 16;
            return 16;
        }
        if (c != 2 && c != 4 && c != 7) {
            return i;
        }
        this.f16166cord = i2;
        this.f16171rotuma = 17;
        return 17;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String cuirassed() throws IOException {
        String utf8;
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 10) {
            utf8 = nosophobia();
        } else if (iDent == 9) {
            utf8 = lerp(f16164trm);
        } else if (iDent == 8) {
            utf8 = lerp(f16163stratoscope);
        } else if (iDent == 11) {
            utf8 = this.f16167cuirassed;
            this.f16167cuirassed = null;
        } else if (iDent == 16) {
            utf8 = Long.toString(this.f16170preprohormone);
        } else {
            if (iDent != 17) {
                throw new JsonDataException("Expected a string but was " + restrictive() + " at path " + getPath());
            }
            utf8 = this.f16169gintrap.readUtf8(this.f16166cord);
        }
        this.f16171rotuma = 0;
        int[] iArr = this.f16157polloi;
        int i = this.f16154kowloon - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void cutely() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + restrictive() + " at path " + getPath());
        }
        int i = this.f16154kowloon;
        int i2 = i - 1;
        this.f16154kowloon = i2;
        this.f16156monoploid[i2] = null;
        int[] iArr = this.f16157polloi;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f16171rotuma = 0;
    }

    public final char czestochowa() throws IOException {
        int i;
        if (!this.f16168dovishness.request(1L)) {
            throw creditor("Unterminated escape sequence");
        }
        byte b = this.f16169gintrap.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.f16155molybdenite) {
                return (char) b;
            }
            throw creditor("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f16168dovishness.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bCuirassed = this.f16169gintrap.cuirassed(i2);
            char c2 = (char) (c << 4);
            if (bCuirassed >= 48 && bCuirassed <= 57) {
                i = bCuirassed - 48;
            } else if (bCuirassed >= 97 && bCuirassed <= 102) {
                i = bCuirassed - 87;
            } else {
                if (bCuirassed < 65 || bCuirassed > 70) {
                    throw creditor("\\u" + this.f16169gintrap.readUtf8(4L));
                }
                i = bCuirassed - 55;
            }
            c = (char) (c2 + i);
        }
        this.f16169gintrap.skip(4L);
        return c;
    }

    public final int dent() throws IOException {
        int[] iArr = this.f16152arytenoidectomy;
        int i = this.f16154kowloon;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iItchy = itchy(true);
            this.f16169gintrap.readByte();
            if (iItchy != 44) {
                if (iItchy != 59) {
                    if (iItchy != 93) {
                        throw creditor("Unterminated array");
                    }
                    this.f16171rotuma = 4;
                    return 4;
                }
                starveling();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iItchy2 = itchy(true);
                    this.f16169gintrap.readByte();
                    if (iItchy2 != 44) {
                        if (iItchy2 != 59) {
                            if (iItchy2 != 125) {
                                throw creditor("Unterminated object");
                            }
                            this.f16171rotuma = 2;
                            return 2;
                        }
                        starveling();
                    }
                }
                int iItchy3 = itchy(true);
                if (iItchy3 == 34) {
                    this.f16169gintrap.readByte();
                    this.f16171rotuma = 13;
                    return 13;
                }
                if (iItchy3 == 39) {
                    this.f16169gintrap.readByte();
                    starveling();
                    this.f16171rotuma = 12;
                    return 12;
                }
                if (iItchy3 != 125) {
                    starveling();
                    if (!milliradian((char) iItchy3)) {
                        throw creditor("Expected name");
                    }
                    this.f16171rotuma = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw creditor("Expected name");
                }
                this.f16169gintrap.readByte();
                this.f16171rotuma = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iItchy4 = itchy(true);
                this.f16169gintrap.readByte();
                if (iItchy4 != 58) {
                    if (iItchy4 != 61) {
                        throw creditor("Expected ':'");
                    }
                    starveling();
                    if (this.f16168dovishness.request(1L) && this.f16169gintrap.cuirassed(0L) == 62) {
                        this.f16169gintrap.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (itchy(false) == -1) {
                    this.f16171rotuma = 18;
                    return 18;
                }
                starveling();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iItchy5 = itchy(true);
        if (iItchy5 == 34) {
            this.f16169gintrap.readByte();
            this.f16171rotuma = 9;
            return 9;
        }
        if (iItchy5 == 39) {
            starveling();
            this.f16169gintrap.readByte();
            this.f16171rotuma = 8;
            return 8;
        }
        if (iItchy5 != 44 && iItchy5 != 59) {
            if (iItchy5 == 91) {
                this.f16169gintrap.readByte();
                this.f16171rotuma = 3;
                return 3;
            }
            if (iItchy5 != 93) {
                if (iItchy5 == 123) {
                    this.f16169gintrap.readByte();
                    this.f16171rotuma = 1;
                    return 1;
                }
                int iSayid = sayid();
                if (iSayid != 0) {
                    return iSayid;
                }
                int iCoi = coi();
                if (iCoi != 0) {
                    return iCoi;
                }
                if (!milliradian(this.f16169gintrap.cuirassed(0L))) {
                    throw creditor("Expected value");
                }
                starveling();
                this.f16171rotuma = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f16169gintrap.readByte();
                this.f16171rotuma = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw creditor("Unexpected value");
        }
        starveling();
        this.f16171rotuma = 7;
        return 7;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void dern() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 1) {
            merc(3);
            this.f16171rotuma = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + restrictive() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int dovishness() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 16) {
            long j = this.f16170preprohormone;
            int i = (int) j;
            if (j == i) {
                this.f16171rotuma = 0;
                int[] iArr = this.f16157polloi;
                int i2 = this.f16154kowloon - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.f16170preprohormone + " at path " + getPath());
        }
        if (iDent == 17) {
            this.f16167cuirassed = this.f16169gintrap.readUtf8(this.f16166cord);
        } else if (iDent == 9 || iDent == 8) {
            String strLerp = iDent == 9 ? lerp(f16164trm) : lerp(f16163stratoscope);
            this.f16167cuirassed = strLerp;
            try {
                int i3 = Integer.parseInt(strLerp);
                this.f16171rotuma = 0;
                int[] iArr2 = this.f16157polloi;
                int i4 = this.f16154kowloon - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iDent != 11) {
            throw new JsonDataException("Expected an int but was " + restrictive() + " at path " + getPath());
        }
        this.f16171rotuma = 11;
        try {
            double d = Double.parseDouble(this.f16167cuirassed);
            int i5 = (int) d;
            if (i5 == d) {
                this.f16167cuirassed = null;
                this.f16171rotuma = 0;
                int[] iArr3 = this.f16157polloi;
                int i6 = this.f16154kowloon - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f16167cuirassed + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f16167cuirassed + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean formularize() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        return (iDent == 2 || iDent == 4 || iDent == 18) ? false : true;
    }

    public final void igbo() throws IOException {
        long jGintrap = this.f16168dovishness.gintrap(f16161oilcan);
        wireman wiremanVar = this.f16169gintrap;
        if (jGintrap == -1) {
            jGintrap = wiremanVar.getSize();
        }
        wiremanVar.skip(jGintrap);
    }

    public final int itchy(boolean z) throws IOException {
        byte bCuirassed;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.f16168dovishness.request(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bCuirassed = this.f16169gintrap.cuirassed(i);
                if (bCuirassed == 10 || bCuirassed == 32 || bCuirassed == 13 || bCuirassed == 9) {
                    i = i2;
                }
            }
            this.f16169gintrap.skip(i);
            if (bCuirassed == 47) {
                if (this.f16168dovishness.request(2L)) {
                    starveling();
                    byte bCuirassed2 = this.f16169gintrap.cuirassed(1L);
                    if (bCuirassed2 == 42) {
                        this.f16169gintrap.readByte();
                        this.f16169gintrap.readByte();
                        if (!preterite()) {
                            throw creditor("Unterminated comment");
                        }
                    } else if (bCuirassed2 == 47) {
                        this.f16169gintrap.readByte();
                        this.f16169gintrap.readByte();
                        wostteth();
                    }
                }
                return bCuirassed;
            }
            if (bCuirassed != 35) {
                return bCuirassed;
            }
            starveling();
            wostteth();
        }
    }

    public final String lerp(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jGintrap = this.f16168dovishness.gintrap(byteString);
            if (jGintrap == -1) {
                throw creditor("Unterminated string");
            }
            if (this.f16169gintrap.cuirassed(jGintrap) != 92) {
                if (sb == null) {
                    String utf8 = this.f16169gintrap.readUtf8(jGintrap);
                    this.f16169gintrap.readByte();
                    return utf8;
                }
                sb.append(this.f16169gintrap.readUtf8(jGintrap));
                this.f16169gintrap.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f16169gintrap.readUtf8(jGintrap));
            this.f16169gintrap.readByte();
            sb.append(czestochowa());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void marial() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + restrictive() + " at path " + getPath());
        }
        int i = this.f16154kowloon;
        this.f16154kowloon = i - 1;
        int[] iArr = this.f16157polloi;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f16171rotuma = 0;
    }

    public final boolean milliradian(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        starveling();
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double monoploid() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 16) {
            this.f16171rotuma = 0;
            int[] iArr = this.f16157polloi;
            int i = this.f16154kowloon - 1;
            iArr[i] = iArr[i] + 1;
            return this.f16170preprohormone;
        }
        if (iDent == 17) {
            this.f16167cuirassed = this.f16169gintrap.readUtf8(this.f16166cord);
        } else if (iDent == 9) {
            this.f16167cuirassed = lerp(f16164trm);
        } else if (iDent == 8) {
            this.f16167cuirassed = lerp(f16163stratoscope);
        } else if (iDent == 10) {
            this.f16167cuirassed = nosophobia();
        } else if (iDent != 11) {
            throw new JsonDataException("Expected a double but was " + restrictive() + " at path " + getPath());
        }
        this.f16171rotuma = 11;
        try {
            double d = Double.parseDouble(this.f16167cuirassed);
            if (this.f16155molybdenite || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.f16167cuirassed = null;
                this.f16171rotuma = 0;
                int[] iArr2 = this.f16157polloi;
                int i2 = this.f16154kowloon - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f16167cuirassed + " at path " + getPath());
        }
    }

    public final String nosophobia() throws IOException {
        long jGintrap = this.f16168dovishness.gintrap(f16161oilcan);
        return jGintrap != -1 ? this.f16169gintrap.readUtf8(jGintrap) : this.f16169gintrap.readUtf8();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int polder(JsonReader.attabal attabalVar) throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent < 12 || iDent > 15) {
            return -1;
        }
        if (iDent == 15) {
            return timberyard(this.f16167cuirassed, attabalVar);
        }
        int iSplinterproof = this.f16168dovishness.splinterproof(attabalVar.f16160saneness);
        if (iSplinterproof != -1) {
            this.f16171rotuma = 0;
            this.f16156monoploid[this.f16154kowloon - 1] = attabalVar.f16159attabal[iSplinterproof];
            return iSplinterproof;
        }
        String str = this.f16156monoploid[this.f16154kowloon - 1];
        String strRotuma = rotuma();
        int iTimberyard = timberyard(strRotuma, attabalVar);
        if (iTimberyard == -1) {
            this.f16171rotuma = 15;
            this.f16167cuirassed = strRotuma;
            this.f16156monoploid[this.f16154kowloon - 1] = str;
        }
        return iTimberyard;
    }

    public final boolean preterite() throws IOException {
        beachfront beachfrontVar = this.f16168dovishness;
        ByteString byteString = f16162sealless;
        long jMolybdenite = beachfrontVar.molybdenite(byteString);
        boolean z = jMolybdenite != -1;
        wireman wiremanVar = this.f16169gintrap;
        wiremanVar.skip(z ? jMolybdenite + ((long) byteString.size()) : wiremanVar.getSize());
        return z;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token restrictive() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        switch (iDent) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String rotuma() throws IOException {
        String strLerp;
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 14) {
            strLerp = nosophobia();
        } else if (iDent == 13) {
            strLerp = lerp(f16164trm);
        } else if (iDent == 12) {
            strLerp = lerp(f16163stratoscope);
        } else {
            if (iDent != 15) {
                throw new JsonDataException("Expected a name but was " + restrictive() + " at path " + getPath());
            }
            strLerp = this.f16167cuirassed;
        }
        this.f16171rotuma = 0;
        this.f16156monoploid[this.f16154kowloon - 1] = strLerp;
        return strLerp;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void saneness() throws IOException {
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 3) {
            merc(1);
            this.f16157polloi[this.f16154kowloon - 1] = 0;
            this.f16171rotuma = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + restrictive() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void saran() throws IOException {
        if (this.f16153graveside) {
            throw new JsonDataException("Cannot skip unexpected " + restrictive() + " at " + getPath());
        }
        int i = 0;
        do {
            int iDent = this.f16171rotuma;
            if (iDent == 0) {
                iDent = dent();
            }
            if (iDent == 3) {
                merc(1);
            } else {
                if (iDent == 1) {
                    merc(3);
                } else if (iDent == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + restrictive() + " at path " + getPath());
                    }
                    this.f16154kowloon--;
                } else if (iDent == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + restrictive() + " at path " + getPath());
                    }
                    this.f16154kowloon--;
                } else if (iDent == 14 || iDent == 10) {
                    igbo();
                } else if (iDent == 9 || iDent == 13) {
                    underbelly(f16164trm);
                } else if (iDent == 8 || iDent == 12) {
                    underbelly(f16163stratoscope);
                } else if (iDent == 17) {
                    this.f16169gintrap.skip(this.f16166cord);
                } else if (iDent == 18) {
                    throw new JsonDataException("Expected a value but was " + restrictive() + " at path " + getPath());
                }
                this.f16171rotuma = 0;
            }
            i++;
            this.f16171rotuma = 0;
        } while (i != 0);
        int[] iArr = this.f16157polloi;
        int i2 = this.f16154kowloon;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f16156monoploid[i2 - 1] = "null";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int sayid() throws IOException {
        String str;
        String str2;
        int i;
        byte bCuirassed = this.f16169gintrap.cuirassed(0L);
        if (bCuirassed == 116 || bCuirassed == 84) {
            str = a.g;
            str2 = "TRUE";
            i = 5;
        } else if (bCuirassed == 102 || bCuirassed == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bCuirassed != 110 && bCuirassed != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f16168dovishness.request(i3)) {
                return 0;
            }
            byte bCuirassed2 = this.f16169gintrap.cuirassed(i2);
            if (bCuirassed2 != str.charAt(i2) && bCuirassed2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f16168dovishness.request(length + 1) && milliradian(this.f16169gintrap.cuirassed(length))) {
            return 0;
        }
        this.f16169gintrap.skip(length);
        this.f16171rotuma = i;
        return i;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void seminary() throws IOException {
        if (this.f16153graveside) {
            throw new JsonDataException("Cannot skip unexpected " + restrictive() + " at " + getPath());
        }
        int iDent = this.f16171rotuma;
        if (iDent == 0) {
            iDent = dent();
        }
        if (iDent == 14) {
            igbo();
        } else if (iDent == 13) {
            underbelly(f16164trm);
        } else if (iDent == 12) {
            underbelly(f16163stratoscope);
        } else if (iDent != 15) {
            throw new JsonDataException("Expected a name but was " + restrictive() + " at path " + getPath());
        }
        this.f16171rotuma = 0;
        this.f16156monoploid[this.f16154kowloon - 1] = "null";
    }

    public final void starveling() throws IOException {
        if (!this.f16155molybdenite) {
            throw creditor("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int timberyard(String str, JsonReader.attabal attabalVar) {
        int length = attabalVar.f16159attabal.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(attabalVar.f16159attabal[i])) {
                this.f16171rotuma = 0;
                this.f16156monoploid[this.f16154kowloon - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return "JsonReader(" + this.f16168dovishness + ")";
    }

    public final void underbelly(ByteString byteString) throws IOException {
        while (true) {
            long jGintrap = this.f16168dovishness.gintrap(byteString);
            if (jGintrap == -1) {
                throw creditor("Unterminated string");
            }
            if (this.f16169gintrap.cuirassed(jGintrap) != 92) {
                this.f16169gintrap.skip(jGintrap + 1);
                return;
            } else {
                this.f16169gintrap.skip(jGintrap + 1);
                czestochowa();
            }
        }
    }

    public final void wostteth() throws IOException {
        long jGintrap = this.f16168dovishness.gintrap(f16165yemenite);
        wireman wiremanVar = this.f16169gintrap;
        wiremanVar.skip(jGintrap != -1 ? jGintrap + 1 : wiremanVar.getSize());
    }
}
