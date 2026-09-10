package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.yemenite;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements apical {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public com.google.common.util.concurrent.adultoid<?> f12459adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final marial f12460arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final AtomicReference<Throwable> f12461graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Uri f12462kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AtomicBoolean f12463molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final restrictive f12464monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final byte[] f12465polloi;

    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    public class attabal implements com.google.common.util.concurrent.triweekly<Object> {
        public attabal() {
        }

        @Override // com.google.common.util.concurrent.triweekly
        public void onFailure(Throwable th) {
            beachfront.this.f12461graveside.set(th);
        }

        @Override // com.google.common.util.concurrent.triweekly
        public void onSuccess(Object obj) {
            beachfront.this.f12463molybdenite.set(true);
        }
    }

    /* JADX INFO: compiled from: ExternallyLoadedMediaPeriod.java */
    public final class saneness implements trm {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f12467attabal = 0;

        public saneness() {
        }

        @Override // ethene.trm
        public int attabal(empress empressVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int i2 = this.f12467attabal;
            if (i2 == 2) {
                decoderInputBuffer.attabal(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                empressVar.f11879saneness = beachfront.this.f12464monoploid.saneness(0).attabal(0);
                this.f12467attabal = 1;
                return -5;
            }
            if (!beachfront.this.f12463molybdenite.get()) {
                return -3;
            }
            int length = beachfront.this.f12465polloi.length;
            decoderInputBuffer.attabal(1);
            decoderInputBuffer.f11480graveside = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.kowloon(length);
                decoderInputBuffer.f11483polloi.put(beachfront.this.f12465polloi, 0, length);
            }
            if ((i & 1) == 0) {
                this.f12467attabal = 2;
            }
            return -4;
        }

        @Override // ethene.trm
        public boolean isReady() {
            return beachfront.this.f12463molybdenite.get();
        }

        @Override // ethene.trm
        public void maybeThrowError() throws IOException {
            Throwable th = (Throwable) beachfront.this.f12461graveside.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // ethene.trm
        public int skipData(long j) {
            return 0;
        }
    }

    public beachfront(Uri uri, String str, marial marialVar) {
        this.f12462kowloon = uri;
        androidx.media3.common.polloi polloiVarPolder = new androidx.media3.common.polloi.saneness().sensatory(str).polder();
        this.f12460arytenoidectomy = marialVar;
        this.f12464monoploid = new restrictive(new yemenite(polloiVarPolder));
        this.f12465polloi = uri.toString().getBytes(com.google.common.base.dern.f21534dern);
        this.f12463molybdenite = new AtomicBoolean();
        this.f12461graveside = new AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        return !this.f12463molybdenite.get();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        attabalVar.dern(this);
        com.google.common.util.concurrent.adultoid<?> adultoidVarAttabal = this.f12460arytenoidectomy.attabal(new marial.attabal(this.f12462kowloon));
        this.f12459adultoid = adultoidVarAttabal;
        com.google.common.util.concurrent.arytenoidectomy.attabal(adultoidVarAttabal, new attabal(), com.google.common.util.concurrent.rotuma.attabal());
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        return this.f12463molybdenite.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        return this.f12463molybdenite.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return this.f12464monoploid;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        return !this.f12463molybdenite.get();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < rotumaVarArr.length; i++) {
            if (trmVarArr[i] != null && (rotumaVarArr[i] == null || !zArr[i])) {
                trmVarArr[i] = null;
            }
            if (trmVarArr[i] == null && rotumaVarArr[i] != null) {
                trmVarArr[i] = new saneness();
                zArr2[i] = true;
            }
        }
        return j;
    }

    public void taiyuan() {
        com.google.common.util.concurrent.adultoid<?> adultoidVar = this.f12459adultoid;
        if (adultoidVar != null) {
            adultoidVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        return j;
    }
}
