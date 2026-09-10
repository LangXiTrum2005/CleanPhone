package sevenfold;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class cutely implements maggot.marial<InputStream, dern> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<ImageHeaderParser> f37569attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final trawler.saneness f37570dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final maggot.marial<ByteBuffer, dern> f37571saneness;

    public cutely(List<ImageHeaderParser> list, maggot.marial<ByteBuffer, dern> marialVar, trawler.saneness sanenessVar) {
        this.f37569attabal = list;
        this.f37571saneness = marialVar;
        this.f37570dern = sanenessVar;
    }

    public static byte[] marial(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            return null;
        }
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public endosteum.cutely<dern> attabal(InputStream inputStream, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        byte[] bArrMarial = marial(inputStream);
        if (bArrMarial == null) {
            return null;
        }
        return this.f37571saneness.attabal(ByteBuffer.wrap(bArrMarial), i, i2, wiremanVar);
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean saneness(InputStream inputStream, maggot.wireman wiremanVar) throws IOException {
        return !((Boolean) wiremanVar.dern(taiyuan.f37588saneness)).booleanValue() && com.bumptech.glide.load.attabal.beachfront(this.f37569attabal, inputStream, this.f37570dern) == ImageHeaderParser.ImageType.GIF;
    }
}
