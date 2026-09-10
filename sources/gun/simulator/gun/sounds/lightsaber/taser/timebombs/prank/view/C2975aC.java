package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2975aC extends FW {
    public static final Pattern i = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder g = AbstractC2333Ce.c.newDecoder();
    public final CharsetDecoder h = AbstractC2333Ce.b.newDecoder();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW
    public final Metadata z(C4747uP c4747uP, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.h;
        CharsetDecoder charsetDecoder2 = this.g;
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
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = i.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strH0 = FW.h0(strGroup);
                strH0.getClass();
                if (strH0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strH0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
