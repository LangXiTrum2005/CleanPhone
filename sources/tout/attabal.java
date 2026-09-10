package tout;

import androidx.media3.common.polloi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f38888attabal = new C0812attabal();

    /* JADX INFO: renamed from: tout.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class C0812attabal implements attabal {
        @Override // tout.attabal
        public boolean attabal(polloi polloiVar) {
            String str = polloiVar.f11218triweekly;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // tout.attabal
        public nomenclative.attabal saneness(polloi polloiVar) {
            String str = polloiVar.f11218triweekly;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new hypokinesis.attabal();
                    case "application/x-icy":
                        return new untruth.attabal();
                    case "application/id3":
                        return new imparkation.saneness();
                    case "application/x-emsg":
                        return new murrine.attabal();
                    case "application/x-scte35":
                        return new infiltration.attabal();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean attabal(polloi polloiVar);

    nomenclative.attabal saneness(polloi polloiVar);
}
