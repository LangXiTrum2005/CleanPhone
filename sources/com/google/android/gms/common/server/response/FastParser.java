package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};
    private static final char[] zab = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e'};
    private static final char[] zac = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e', AbstractJsonLexerKt.STRING};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', AbstractJsonLexerKt.STRING};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            int i3 = 0;
            while (i3 < i2) {
                char c2 = cArr[i3];
                if (Character.isISOControl(c2) && (cArr2 == null || cArr2[0] != c2)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i4 = i3 + 1;
                if (c2 != '\"') {
                    if (c2 == '\\') {
                        z2 = !z2;
                        z3 = true;
                    }
                    i3 = i4;
                } else if (!z2) {
                    sb.append(cArr, 0, i3);
                    bufferedReader.reset();
                    bufferedReader.skip(i4);
                    return z3 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                z2 = false;
                i3 = i4;
            }
            sb.append(cArr, 0, i2);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i2;
        int i3;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c2 = cArr[0];
        int i4 = c2 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i5 = c2 == '-' ? 1 : 0;
        if (i5 < iZam) {
            i3 = i5 + 1;
            int iDigit = Character.digit(cArr[i5], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i2 = -iDigit;
        } else {
            i2 = 0;
            i3 = i5;
        }
        while (i3 < iZam) {
            int i6 = i3 + 1;
            int iDigit2 = Character.digit(cArr[i3], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i2 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i7 = i2 * 10;
            if (i7 < i4 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i2 = i7 - iDigit2;
            i3 = i6;
        }
        if (i5 == 0) {
            return -i2;
        }
        if (i3 > 1) {
            return i2;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i2 = 0;
            boolean z2 = false;
            while (i2 < 1024 && bufferedReader.read(cArr, i2, 1) != -1) {
                char c2 = cArr[i2];
                if (Character.isISOControl(c2)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i3 = i2 + 1;
                if (c2 != '\"') {
                    if (c2 == '\\') {
                        z2 = !z2;
                    }
                    i2 = i3;
                } else if (!z2) {
                    bufferedReader.reset();
                    bufferedReader.skip(i3);
                    return i2;
                }
                z2 = false;
                i2 = i3;
            }
        } else {
            cArr[0] = cZai;
            i2 = 1;
            while (i2 < 1024 && bufferedReader.read(cArr, i2, 1) != -1) {
                char c3 = cArr[i2];
                if (c3 == '}' || c3 == ',' || Character.isWhitespace(c3) || cArr[i2] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i2 - 1);
                    cArr[i2] = 0;
                    return i2;
                }
                i2++;
            }
        }
        if (i2 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        int i2;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c2 = cArr[0];
        long j2 = c2 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i3 = c2 == '-' ? 1 : 0;
        int i4 = 10;
        if (i3 < iZam) {
            i2 = i3 + 1;
            int iDigit = Character.digit(cArr[i3], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j = -iDigit;
        } else {
            j = 0;
            i2 = i3;
        }
        while (i2 < iZam) {
            int i5 = i2 + 1;
            int iDigit2 = Character.digit(cArr[i2], i4);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j < Buffer.OVERFLOW_ZONE) {
                throw new ParseException("Number too large");
            }
            long j3 = j * 10;
            long j4 = j2;
            long j5 = iDigit2;
            if (j3 < j4 + j5) {
                throw new ParseException("Number too large");
            }
            j = j3 - j5;
            i2 = i5;
            j2 = j4;
            i4 = 10;
        }
        if (i3 == 0) {
            return -j;
        }
        if (i2 > 1) {
            return j;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i2 = 1;
        if (cZai != '\"') {
            if (cZai == ',') {
                throw new ParseException("Missing value");
            }
            if (cZai == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) == ']') {
                    zaw(5);
                } else {
                    bufferedReader.reset();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i2 > 0) {
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cZai2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cZai2 == '\"') {
                            if (!z3) {
                                z2 = !z2;
                            }
                            cZai2 = '\"';
                        }
                        if (cZai2 == '[') {
                            if (!z2) {
                                i2++;
                            }
                            cZai2 = '[';
                        }
                        if (cZai2 == ']' && !z2) {
                            i2--;
                        }
                        z3 = (cZai2 == '\\' && z2) ? !z3 : false;
                    }
                    zaw(5);
                }
            } else if (cZai != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char cZai3 = zai(bufferedReader);
                if (cZai3 == '}') {
                    zaw(1);
                } else {
                    if (cZai3 != '\"') {
                        throw new ParseException("Unexpected token " + cZai3);
                    }
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    while (zar(bufferedReader) != null) {
                    }
                    zaw(1);
                }
            }
        } else {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c2 = this.zao[0];
            boolean z4 = false;
            while (true) {
                if (c2 == '\"') {
                    if (!z4) {
                        break;
                    }
                    c2 = '\"';
                    z4 = true;
                }
                z4 = c2 == '\\' ? !z4 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c2 = this.zao[0];
                if (Character.isISOControl(c2)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException("Unexpected token: " + cZai);
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e2) {
                throw new ParseException("Error instantiating inner object", e2);
            } catch (InstantiationException e3) {
                throw new ParseException("Error instantiating inner object", e3);
            }
        }
    }

    private final void zaw(int i2) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException(a.k("Expected state ", i2, " but had empty stack"));
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue != i2) {
            throw new ParseException(android.support.v4.media.a.g(i2, iIntValue, "Expected state ", " but had "));
        }
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2 = 0;
        while (true) {
            int length = cArr.length;
            if (i2 >= length) {
                return;
            }
            int i3 = bufferedReader.read(this.zap, 0, length - i2);
            if (i3 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (cArr[i4 + i2] != this.zap[i4]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i2 += i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z2) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z2 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z2 ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0253  */
    /* JADX WARN: Code duplicated, block: B:131:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i2;
        HashMap map;
        char cZai;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i3 = field.zaa;
                switch (i3) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 10:
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZai3 = zai(bufferedReader);
                                if (cZai3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZai3 == '\"') {
                                    String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai4 = zai(bufferedReader);
                                    if (cZai4 != ',') {
                                        if (cZai4 != '}') {
                                            throw new ParseException("Unexpected character while parsing string map: " + cZai4);
                                        }
                                        zaw(1);
                                    }
                                } else if (cZai3 == '}') {
                                    zaw(1);
                                }
                                i2 = 4;
                                zaw(i2);
                                zaw(2);
                                cZai = zai(bufferedReader);
                                if (cZai == ',') {
                                    strZaq = zaq(bufferedReader);
                                } else {
                                    if (cZai != '}') {
                                        throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                                    }
                                    strZaq = null;
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    case 11:
                        if (!field.zab) {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (IllegalAccessException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                } catch (InstantiationException e3) {
                                    throw new ParseException("Error instantiating inner object", e3);
                                }
                            }
                            break;
                        } else {
                            char cZai6 = zai(bufferedReader);
                            if (cZai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (cZai6 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        }
                        i2 = 4;
                        zaw(i2);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                throw new ParseException("Expected end of object or field separator, but found: " + cZai);
                            }
                            strZaq = null;
                        }
                        break;
                    default:
                        throw new ParseException(android.support.v4.media.a.h(i3, "Invalid field type "));
                }
            }
        }
        zaw(1);
        return true;
    }

    public void parse(InputStream inputStream, T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e2) {
                throw new ParseException(e2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
