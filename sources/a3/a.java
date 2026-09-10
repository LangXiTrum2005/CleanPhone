package a3;

import com.google.android.gms.internal.play_billing.q1;
import i1.c0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends no.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3369d = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f3370b = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f3371c = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // no.b
    public final c0 o(w2.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f3371c;
        CharsetDecoder charsetDecoder2 = this.f3370b;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new c0(new c(null, bArr, null));
        }
        Matcher matcher = f3369d.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strF = q1.F(strGroup);
                strF.getClass();
                if (strF.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strF.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new c0(new c(str, bArr, str2));
    }
}
