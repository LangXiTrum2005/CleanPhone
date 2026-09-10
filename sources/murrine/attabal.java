package murrine;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import decarock.stratoscope;
import java.nio.ByteBuffer;
import java.util.Arrays;
import nomenclative.dern;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends dern {
    public EventMessage dern(stratoscope stratoscopeVar) {
        return new EventMessage((String) decarock.attabal.marial(stratoscopeVar.stratoscope()), (String) decarock.attabal.marial(stratoscopeVar.stratoscope()), stratoscopeVar.cuirassed(), stratoscopeVar.cuirassed(), Arrays.copyOfRange(stratoscopeVar.marial(), stratoscopeVar.beachfront(), stratoscopeVar.competently()));
    }

    @Override // nomenclative.dern
    public Metadata saneness(nomenclative.saneness sanenessVar, ByteBuffer byteBuffer) {
        return new Metadata(dern(new stratoscope(byteBuffer.array(), byteBuffer.limit())));
    }
}
