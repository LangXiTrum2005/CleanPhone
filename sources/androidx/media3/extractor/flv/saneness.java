package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.common.polloi;
import cybernatic.privatdozent;
import cybernatic.wireman;
import decarock.stratoscope;

/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends TagPayloadReader {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f13018beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f13019competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f13020dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f13021marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final stratoscope f13022saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f13023wireman;

    public saneness(privatdozent privatdozentVar) {
        super(privatdozentVar);
        this.f13022saneness = new stratoscope(tailoring.attabal.f38548attabal);
        this.f13020dern = new stratoscope(4);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean dern(stratoscope stratoscopeVar, long j) throws ParserException {
        int iSupplicat = stratoscopeVar.supplicat();
        long jPolloi = j + (((long) stratoscopeVar.polloi()) * 1000);
        if (iSupplicat == 0 && !this.f13021marial) {
            stratoscope stratoscopeVar2 = new stratoscope(new byte[stratoscopeVar.attabal()]);
            stratoscopeVar.formularize(stratoscopeVar2.marial(), 0, stratoscopeVar.attabal());
            wireman wiremanVarSaneness = wireman.saneness(stratoscopeVar2);
            this.f13023wireman = wiremanVarSaneness.f24818saneness;
            this.f13013attabal.dern(new polloi.saneness().sensatory("video/avc").privatdozent(wiremanVarSaneness.f24815formularize).palmyra(wiremanVarSaneness.f24814dern).dent(wiremanVarSaneness.f24820wireman).sayid(wiremanVarSaneness.f24809apical).premeiotic(wiremanVarSaneness.f24810attabal).polder());
            this.f13021marial = true;
            return false;
        }
        if (iSupplicat != 1 || !this.f13021marial) {
            return false;
        }
        int i = this.f13019competently == 1 ? 1 : 0;
        if (!this.f13018beachfront && i == 0) {
            return false;
        }
        byte[] bArrMarial = this.f13020dern.marial();
        bArrMarial[0] = 0;
        bArrMarial[1] = 0;
        bArrMarial[2] = 0;
        int i2 = 4 - this.f13023wireman;
        int i3 = 0;
        while (stratoscopeVar.attabal() > 0) {
            stratoscopeVar.formularize(this.f13020dern.marial(), i2, this.f13023wireman);
            this.f13020dern.mathsort(0);
            int iSeminary = this.f13020dern.seminary();
            this.f13022saneness.mathsort(0);
            this.f13013attabal.saneness(this.f13022saneness, 4);
            this.f13013attabal.saneness(stratoscopeVar, iSeminary);
            i3 = i3 + 4 + iSeminary;
        }
        this.f13013attabal.wireman(jPolloi, i, i3, 0, null);
        this.f13018beachfront = true;
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean saneness(stratoscope stratoscopeVar) throws TagPayloadReader.UnsupportedFormatException {
        int iSupplicat = stratoscopeVar.supplicat();
        int i = (iSupplicat >> 4) & 15;
        int i2 = iSupplicat & 15;
        if (i2 == 7) {
            this.f13019competently = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }
}
