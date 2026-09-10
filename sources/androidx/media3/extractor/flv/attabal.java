package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.common.polloi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import decarock.stratoscope;
import java.util.Collections;

/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends TagPayloadReader {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f13014marial = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f13015dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f13016saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f13017wireman;

    public attabal(privatdozent privatdozentVar) {
        super(privatdozentVar);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean dern(stratoscope stratoscopeVar, long j) throws ParserException {
        if (this.f13017wireman == 2) {
            int iAttabal = stratoscopeVar.attabal();
            this.f13013attabal.saneness(stratoscopeVar, iAttabal);
            this.f13013attabal.wireman(j, 1, iAttabal, 0, null);
            return true;
        }
        int iSupplicat = stratoscopeVar.supplicat();
        if (iSupplicat != 0 || this.f13015dern) {
            if (this.f13017wireman == 10 && iSupplicat != 1) {
                return false;
            }
            int iAttabal2 = stratoscopeVar.attabal();
            this.f13013attabal.saneness(stratoscopeVar, iAttabal2);
            this.f13013attabal.wireman(j, 1, iAttabal2, 0, null);
            return true;
        }
        int iAttabal3 = stratoscopeVar.attabal();
        byte[] bArr = new byte[iAttabal3];
        stratoscopeVar.formularize(bArr, 0, iAttabal3);
        cybernatic.attabal.saneness sanenessVarMarial = cybernatic.attabal.marial(bArr);
        this.f13013attabal.dern(new polloi.saneness().sensatory(MimeTypes.AUDIO_AAC).privatdozent(sanenessVarMarial.f24604dern).saran(sanenessVarMarial.f24605saneness).underbelly(sanenessVarMarial.f24603attabal).premeiotic(Collections.singletonList(bArr)).polder());
        this.f13015dern = true;
        return false;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean saneness(stratoscope stratoscopeVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f13016saneness) {
            stratoscopeVar.splinterproof(1);
        } else {
            int iSupplicat = stratoscopeVar.supplicat();
            int i = (iSupplicat >> 4) & 15;
            this.f13017wireman = i;
            if (i == 2) {
                this.f13013attabal.dern(new polloi.saneness().sensatory(MimeTypes.AUDIO_MPEG).saran(1).underbelly(f13014marial[(iSupplicat >> 2) & 3]).polder());
                this.f13015dern = true;
            } else if (i == 7 || i == 8) {
                this.f13013attabal.dern(new polloi.saneness().sensatory(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).saran(1).underbelly(8000).polder());
                this.f13015dern = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f13017wireman);
            }
            this.f13016saneness = true;
        }
        return true;
    }
}
