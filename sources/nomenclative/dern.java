package nomenclative;

import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern implements attabal {
    @Override // nomenclative.attabal
    public final Metadata attabal(saneness sanenessVar) {
        ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(sanenessVar.f11483polloi);
        decarock.attabal.attabal(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return saneness(sanenessVar, byteBuffer);
    }

    public abstract Metadata saneness(saneness sanenessVar, ByteBuffer byteBuffer);
}
