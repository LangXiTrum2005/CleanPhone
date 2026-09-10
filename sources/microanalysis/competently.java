package microanalysis;

import androidx.media3.common.polloi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import strother.formularize;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f33320attabal = new attabal();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    public class attabal implements competently {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final strother.impromptu f33321saneness = new strother.impromptu();

        @Override // microanalysis.competently
        public boolean attabal(polloi polloiVar) {
            String str = polloiVar.f11218triweekly;
            return this.f33321saneness.attabal(polloiVar) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }

        @Override // microanalysis.competently
        public formularize saneness(polloi polloiVar) {
            String str = polloiVar.f11218triweekly;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new philabeg.attabal(str, polloiVar.f11200kattegat, 16000L);
                    case "application/cea-708":
                        return new philabeg.dern(polloiVar.f11200kattegat, polloiVar.f11205monoploid);
                }
            }
            if (!this.f33321saneness.attabal(polloiVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            strother.polloi polloiVarDern = this.f33321saneness.dern(polloiVar);
            return new saneness(polloiVarDern.getClass().getSimpleName() + "Decoder", polloiVarDern);
        }
    }

    boolean attabal(polloi polloiVar);

    formularize saneness(polloi polloiVar);
}
