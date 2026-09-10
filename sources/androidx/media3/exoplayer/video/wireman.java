package androidx.media3.exoplayer.video;

import androidx.media3.common.polder;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import decarock.arytenoidectomy;
import decarock.sealless;

/* JADX INFO: compiled from: VideoFrameRenderControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f12991attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public polder f12993competently;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f12998saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f12999taiyuan;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern.attabal f12995dern = new dern.attabal();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless<polder> f13000wireman = new sealless<>();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final sealless<Long> f12997marial = new sealless<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final arytenoidectomy f12992beachfront = new arytenoidectomy();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public polder f12996impromptu = polder.f11144marial;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long f12994cutely = C.TIME_UNSET;

    /* JADX INFO: compiled from: VideoFrameRenderControl.java */
    public interface attabal {
        void attabal();

        void onVideoSizeChanged(polder polderVar);

        void saneness(long j, long j2, long j3, boolean z);
    }

    public wireman(attabal attabalVar, dern dernVar) {
        this.f12991attabal = attabalVar;
        this.f12998saneness = dernVar;
    }

    public static <T> T dern(sealless<T> seallessVar) {
        decarock.attabal.attabal(seallessVar.formularize() > 0);
        while (seallessVar.formularize() > 1) {
            seallessVar.taiyuan();
        }
        return (T) decarock.attabal.marial(seallessVar.taiyuan());
    }

    public void apical(float f) {
        decarock.attabal.attabal(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f12998saneness.polloi(f);
    }

    public final void attabal() {
        decarock.attabal.taiyuan(Long.valueOf(this.f12992beachfront.wireman()));
        this.f12991attabal.attabal();
    }

    public final boolean beachfront(long j) {
        Long lCutely = this.f12997marial.cutely(j);
        if (lCutely == null || lCutely.longValue() == this.f12999taiyuan) {
            return false;
        }
        this.f12999taiyuan = lCutely.longValue();
        return true;
    }

    public final boolean competently(long j) {
        polder polderVarCutely = this.f13000wireman.cutely(j);
        if (polderVarCutely == null || polderVarCutely.equals(polder.f11144marial) || polderVarCutely.equals(this.f12996impromptu)) {
            return false;
        }
        this.f12996impromptu = polderVarCutely;
        return true;
    }

    public final void cutely(boolean z) {
        long jLongValue = ((Long) decarock.attabal.taiyuan(Long.valueOf(this.f12992beachfront.wireman()))).longValue();
        if (competently(jLongValue)) {
            this.f12991attabal.onVideoSizeChanged(this.f12996impromptu);
        }
        this.f12991attabal.saneness(z ? -1L : this.f12995dern.competently(), jLongValue, this.f12999taiyuan, this.f12998saneness.taiyuan());
    }

    public void impromptu(long j, long j2) {
        this.f12997marial.attabal(j, Long.valueOf(j2));
    }

    public boolean marial() {
        return this.f12998saneness.wireman(true);
    }

    public void saneness() {
        this.f12992beachfront.attabal();
        this.f12994cutely = C.TIME_UNSET;
        if (this.f12997marial.formularize() > 0) {
            Long l = (Long) dern(this.f12997marial);
            l.longValue();
            this.f12997marial.attabal(0L, l);
        }
        if (this.f12993competently != null) {
            this.f13000wireman.dern();
        } else if (this.f13000wireman.formularize() > 0) {
            this.f12993competently = (polder) dern(this.f13000wireman);
        }
    }

    public void taiyuan(long j, long j2) throws ExoPlaybackException {
        while (!this.f12992beachfront.dern()) {
            long jSaneness = this.f12992beachfront.saneness();
            if (beachfront(jSaneness)) {
                this.f12998saneness.cutely();
            }
            int iDern = this.f12998saneness.dern(jSaneness, j, j2, this.f12999taiyuan, false, this.f12995dern);
            if (iDern == 0 || iDern == 1) {
                this.f12994cutely = jSaneness;
                cutely(iDern == 0);
            } else if (iDern != 2 && iDern != 3 && iDern != 4) {
                if (iDern != 5) {
                    throw new IllegalStateException(String.valueOf(iDern));
                }
                return;
            } else {
                this.f12994cutely = jSaneness;
                attabal();
            }
        }
    }

    public boolean wireman(long j) {
        long j2 = this.f12994cutely;
        return j2 != C.TIME_UNSET && j2 >= j;
    }
}
