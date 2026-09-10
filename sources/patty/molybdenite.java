package patty;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ExifInterfaceImageHeaderParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class molybdenite implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int attabal(InputStream inputStream, trawler.saneness sanenessVar) throws IOException {
        int iDern = new tectonization.attabal(inputStream).dern("Orientation", 1);
        if (iDern == 0) {
            return -1;
        }
        return iDern;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType dern(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType saneness(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int wireman(ByteBuffer byteBuffer, trawler.saneness sanenessVar) throws IOException {
        return attabal(com.bumptech.glide.util.attabal.competently(byteBuffer), sanenessVar);
    }
}
