package nattier;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import decarock.stratoscope;

/* JADX INFO: compiled from: SmtaAtomUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid {
    public static int attabal(int i, stratoscope stratoscopeVar, int i2) {
        if (i == 12) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && stratoscopeVar.attabal() >= 8 && stratoscopeVar.beachfront() + 8 <= i2) {
            int iMonoploid = stratoscopeVar.monoploid();
            int iMonoploid2 = stratoscopeVar.monoploid();
            if (iMonoploid >= 12 && iMonoploid2 == 1936877170) {
                return stratoscopeVar.restrictive();
            }
        }
        return -2147483647;
    }

    public static Metadata saneness(stratoscope stratoscopeVar, int i) {
        stratoscopeVar.splinterproof(12);
        while (stratoscopeVar.beachfront() < i) {
            int iBeachfront = stratoscopeVar.beachfront();
            int iMonoploid = stratoscopeVar.monoploid();
            if (stratoscopeVar.monoploid() == 1935766900) {
                if (iMonoploid < 16) {
                    return null;
                }
                stratoscopeVar.splinterproof(4);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int iSupplicat = stratoscopeVar.supplicat();
                    int iSupplicat2 = stratoscopeVar.supplicat();
                    if (iSupplicat == 0) {
                        i2 = iSupplicat2;
                    } else if (iSupplicat == 1) {
                        i3 = iSupplicat2;
                    }
                }
                int iAttabal = attabal(i2, stratoscopeVar, i);
                if (iAttabal == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(iAttabal, i3));
            }
            stratoscopeVar.mathsort(iBeachfront + iMonoploid);
        }
        return null;
    }
}
