package harlequinade;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.polloi;
import androidx.media3.common.util.GlUtil;
import bluecoat.apical;
import decarock.sealless;
import decarock.triweekly;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements apical, attabal {

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public byte[] f27564cuirassed;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f27566gintrap;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public SurfaceTexture f27573rotuma;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final AtomicBoolean f27568kowloon = new AtomicBoolean();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final AtomicBoolean f27562arytenoidectomy = new AtomicBoolean(true);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final beachfront f27570monoploid = new beachfront();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final dern f27571polloi = new dern();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final sealless<Long> f27569molybdenite = new sealless<>();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final sealless<wireman> f27567graveside = new sealless<>();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final float[] f27561adultoid = new float[16];

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final float[] f27565dovishness = new float[16];

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public volatile int f27572preprohormone = 0;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f27563cord = -1;

    @Override // harlequinade.attabal
    public void attabal(long j, float[] fArr) {
        this.f27571polloi.marial(j, fArr);
    }

    public SurfaceTexture beachfront() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.saneness();
            this.f27570monoploid.saneness();
            GlUtil.saneness();
            this.f27566gintrap = GlUtil.beachfront();
        } catch (GlUtil.GlException e) {
            triweekly.wireman("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f27566gintrap);
        this.f27573rotuma = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: harlequinade.competently
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f27554kowloon.f27568kowloon.set(true);
            }
        });
        return this.f27573rotuma;
    }

    public void competently(int i) {
        this.f27572preprohormone = i;
    }

    public final void impromptu(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f27564cuirassed;
        int i2 = this.f27563cord;
        this.f27564cuirassed = bArr;
        if (i == -1) {
            i = this.f27572preprohormone;
        }
        this.f27563cord = i;
        if (i2 == i && Arrays.equals(bArr2, this.f27564cuirassed)) {
            return;
        }
        byte[] bArr3 = this.f27564cuirassed;
        wireman wiremanVarAttabal = bArr3 != null ? marial.attabal(bArr3, this.f27563cord) : null;
        if (wiremanVarAttabal == null || !beachfront.dern(wiremanVarAttabal)) {
            wiremanVarAttabal = wireman.saneness(this.f27563cord);
        }
        this.f27567graveside.attabal(j, wiremanVarAttabal);
    }

    public void marial(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            GlUtil.saneness();
        } catch (GlUtil.GlException e) {
            triweekly.wireman("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f27568kowloon.compareAndSet(true, false)) {
            ((SurfaceTexture) decarock.attabal.marial(this.f27573rotuma)).updateTexImage();
            try {
                GlUtil.saneness();
            } catch (GlUtil.GlException e2) {
                triweekly.wireman("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f27562arytenoidectomy.compareAndSet(true, false)) {
                GlUtil.apical(this.f27561adultoid);
            }
            long timestamp = this.f27573rotuma.getTimestamp();
            Long lCompetently = this.f27569molybdenite.competently(timestamp);
            if (lCompetently != null) {
                this.f27571polloi.dern(this.f27561adultoid, lCompetently.longValue());
            }
            wireman wiremanVarCutely = this.f27567graveside.cutely(timestamp);
            if (wiremanVarCutely != null) {
                this.f27570monoploid.wireman(wiremanVarCutely);
            }
        }
        Matrix.multiplyMM(this.f27565dovishness, 0, fArr, 0, this.f27561adultoid, 0);
        this.f27570monoploid.attabal(this.f27566gintrap, this.f27565dovishness, z);
    }

    @Override // harlequinade.attabal
    public void saneness() {
        this.f27569molybdenite.dern();
        this.f27571polloi.wireman();
        this.f27562arytenoidectomy.set(true);
    }

    @Override // bluecoat.apical
    public void wireman(long j, long j2, polloi polloiVar, MediaFormat mediaFormat) {
        this.f27569molybdenite.attabal(j2, Long.valueOf(j));
        impromptu(polloiVar.f11209preprohormone, polloiVar.f11190cord, j2);
    }
}
