package strother;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSubtitleParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements polloi.attabal {
    @Override // strother.polloi.attabal
    public boolean attabal(androidx.media3.common.polloi polloiVar) {
        String str = polloiVar.f11218triweekly;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    @Override // strother.polloi.attabal
    public polloi dern(androidx.media3.common.polloi polloiVar) {
        String str = polloiVar.f11218triweekly;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new crock.attabal(polloiVar.f11205monoploid);
                case "application/pgs":
                    return new electropaint.attabal();
                case "application/x-mp4-vtt":
                    return new estragon.attabal();
                case "text/vtt":
                    return new estragon.competently();
                case "application/x-quicktime-tx3g":
                    return new transformable.attabal(polloiVar.f11205monoploid);
                case "text/x-ssa":
                    return new astrogate.saneness(polloiVar.f11205monoploid);
                case "application/x-subrip":
                    return new irani.attabal();
                case "application/ttml+xml":
                    return new rsp.wireman();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // strother.polloi.attabal
    public int saneness(androidx.media3.common.polloi polloiVar) {
        String str = polloiVar.f11218triweekly;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
