package likeable;

import androidx.media3.common.polloi;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;

/* JADX INFO: compiled from: StreamFormatChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final polloi f33008attabal;

    public competently(polloi polloiVar) {
        this.f33008attabal = polloiVar;
    }

    public static String attabal(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static attabal dern(stratoscope stratoscopeVar) {
        stratoscopeVar.splinterproof(4);
        int iAdultoid = stratoscopeVar.adultoid();
        int iAdultoid2 = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(4);
        int iAdultoid3 = stratoscopeVar.adultoid();
        String strAttabal = attabal(iAdultoid3);
        if (strAttabal != null) {
            polloi.saneness sanenessVar = new polloi.saneness();
            sanenessVar.palmyra(iAdultoid).dent(iAdultoid2).sensatory(strAttabal);
            return new competently(sanenessVar.polder());
        }
        triweekly.impromptu("StreamFormatChunk", "Ignoring track with unsupported compression " + iAdultoid3);
        return null;
    }

    public static attabal marial(stratoscope stratoscopeVar) {
        int iCord = stratoscopeVar.cord();
        String strSaneness = saneness(iCord);
        if (strSaneness == null) {
            triweekly.impromptu("StreamFormatChunk", "Ignoring track with unsupported format tag " + iCord);
            return null;
        }
        int iCord2 = stratoscopeVar.cord();
        int iAdultoid = stratoscopeVar.adultoid();
        stratoscopeVar.splinterproof(6);
        int iPremeiotic = grimness.premeiotic(stratoscopeVar.cord());
        int iCord3 = stratoscopeVar.attabal() > 0 ? stratoscopeVar.cord() : 0;
        byte[] bArr = new byte[iCord3];
        stratoscopeVar.formularize(bArr, 0, iCord3);
        polloi.saneness sanenessVar = new polloi.saneness();
        sanenessVar.sensatory(strSaneness).saran(iCord2).underbelly(iAdultoid);
        if (MimeTypes.AUDIO_RAW.equals(strSaneness) && iPremeiotic != 0) {
            sanenessVar.nosophobia(iPremeiotic);
        }
        if (MimeTypes.AUDIO_AAC.equals(strSaneness) && iCord3 > 0) {
            sanenessVar.premeiotic(ImmutableList.of(bArr));
        }
        return new competently(sanenessVar.polder());
    }

    public static String saneness(int i) {
        if (i == 1) {
            return MimeTypes.AUDIO_RAW;
        }
        if (i == 85) {
            return MimeTypes.AUDIO_MPEG;
        }
        if (i == 255) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 8192) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i != 8193) {
            return null;
        }
        return MimeTypes.AUDIO_DTS;
    }

    public static attabal wireman(int i, stratoscope stratoscopeVar) {
        if (i == 2) {
            return dern(stratoscopeVar);
        }
        if (i == 1) {
            return marial(stratoscopeVar);
        }
        triweekly.impromptu("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + grimness.coi(i));
        return null;
    }

    @Override // likeable.attabal
    public int getType() {
        return 1718776947;
    }
}
