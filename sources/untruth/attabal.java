package untruth;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nomenclative.dern;
import nomenclative.saneness;

/* JADX INFO: compiled from: IcyDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Pattern f39241dern = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CharsetDecoder f39242attabal = com.google.common.base.dern.f21534dern.newDecoder();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final CharsetDecoder f39243saneness = com.google.common.base.dern.f21536saneness.newDecoder();

    public final String dern(ByteBuffer byteBuffer) {
        try {
            String string = this.f39242attabal.decode(byteBuffer).toString();
            this.f39242attabal.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f39242attabal.reset();
            byteBuffer.rewind();
            try {
                return this.f39243saneness.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f39243saneness.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.f39242attabal.reset();
            byteBuffer.rewind();
            throw th;
        }
    }

    @Override // nomenclative.dern
    public Metadata saneness(saneness sanenessVar, ByteBuffer byteBuffer) {
        String strDern = dern(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strDern == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f39241dern.matcher(strDern);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strBeachfront = com.google.common.base.attabal.beachfront(strGroup);
                strBeachfront.getClass();
                if (strBeachfront.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strBeachfront.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
