package harlequinade;

import androidx.media3.common.polloi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.source.formularize;
import androidx.media3.exoplayer.triweekly;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import decarock.stratoscope;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends triweekly {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final stratoscope f27574kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public long f27575merc;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public attabal f27576restrictive;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final DecoderInputBuffer f27577sealless;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public long f27578supplicat;

    public saneness() {
        super(6);
        this.f27577sealless = new DecoderInputBuffer(1);
        this.f27574kattegat = new stratoscope();
    }

    @Override // androidx.media3.exoplayer.lampshade
    public int attabal(polloi polloiVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(polloiVar.f11218triweekly) ? lampshade.formularize(4) : lampshade.formularize(0);
    }

    public final void cultivated() {
        attabal attabalVar = this.f27576restrictive;
        if (attabalVar != null) {
            attabalVar.saneness();
        }
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.mastfed.saneness
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 8) {
            this.f27576restrictive = (attabal) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void mathsort(polloi[] polloiVarArr, long j, long j2, formularize.saneness sanenessVar) {
        this.f27578supplicat = j2;
    }

    public final float[] permissivist(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f27574kattegat.walach(byteBuffer.array(), byteBuffer.limit());
        this.f27574kattegat.mathsort(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f27574kattegat.adultoid());
        }
        return fArr;
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) {
        this.f27575merc = Long.MIN_VALUE;
        cultivated();
    }

    @Override // androidx.media3.exoplayer.homozygous
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.f27575merc < 100000 + j) {
            this.f27577sealless.dern();
            if (overspeculate(sealless(), this.f27577sealless, 0) != -4 || this.f27577sealless.taiyuan()) {
                return;
            }
            long j3 = this.f27577sealless.f11480graveside;
            this.f27575merc = j3;
            boolean z = j3 < supplicat();
            if (this.f27576restrictive != null && !z) {
                this.f27577sealless.arytenoidectomy();
                float[] fArrPermissivist = permissivist((ByteBuffer) grimness.impromptu(this.f27577sealless.f11483polloi));
                if (fArrPermissivist != null) {
                    ((attabal) grimness.impromptu(this.f27576restrictive)).attabal(this.f27575merc - this.f27578supplicat, fArrPermissivist);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void seminary() {
        cultivated();
    }
}
