package androidx.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import incorrectly.ctenidium;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes.dex */
public class polloi implements czestochowa {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final HashMap<ctenidium, saneness> f12268apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f12269beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f12270competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final boolean f12271cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f12272dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f12273formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f12274impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f12275marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final polyfoil.beachfront f12276saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final long f12277taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f12278wireman;

    /* JADX INFO: compiled from: DefaultLoadControl.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f12279attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f12280saneness;

        public saneness() {
        }
    }

    public polloi() {
        this(new polyfoil.beachfront(true, 65536), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2500, 5000, -1, false, 0, false);
    }

    public static int monoploid(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    public static void triweekly(int i, int i2, String str, String str2) {
        decarock.attabal.saneness(i >= i2, str + " cannot be less than " + str2);
    }

    public int arytenoidectomy() {
        Iterator<saneness> it = this.f12268apical.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().f12280saneness;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public boolean attabal(czestochowa.attabal attabalVar) {
        long jTreadless = decarock.grimness.treadless(attabalVar.f11768marial, attabalVar.f11764beachfront);
        long jMin = attabalVar.f11767impromptu ? this.f12269beachfront : this.f12275marial;
        long j = attabalVar.f11770taiyuan;
        if (j != C.TIME_UNSET) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin <= 0 || jTreadless >= jMin) {
            return true;
        }
        return !this.f12274impromptu && this.f12276saneness.dern() >= arytenoidectomy();
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public void beachfront(ctenidium ctenidiumVar) {
        polloi(ctenidiumVar);
        if (this.f12268apical.isEmpty()) {
            this.f12273formularize = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public void cutely(ctenidium ctenidiumVar) {
        polloi(ctenidiumVar);
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public void dern(ctenidium ctenidiumVar) {
        long id = Thread.currentThread().getId();
        long j = this.f12273formularize;
        decarock.attabal.impromptu(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f12273formularize = id;
        if (!this.f12268apical.containsKey(ctenidiumVar)) {
            this.f12268apical.put(ctenidiumVar, new saneness());
        }
        molybdenite(ctenidiumVar);
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public polyfoil.saneness getAllocator() {
        return this.f12276saneness;
    }

    public final void graveside() {
        if (this.f12268apical.isEmpty()) {
            this.f12276saneness.wireman();
        } else {
            this.f12276saneness.marial(arytenoidectomy());
        }
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public void impassible(ctenidium ctenidiumVar, androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, homozygous[] homozygousVarArr, ethene.restrictive restrictiveVar, hydromechanics.rotuma[] rotumaVarArr) {
        saneness sanenessVar2 = (saneness) decarock.attabal.marial(this.f12268apical.get(ctenidiumVar));
        int iKowloon = this.f12270competently;
        if (iKowloon == -1) {
            iKowloon = kowloon(homozygousVarArr, rotumaVarArr);
        }
        sanenessVar2.f12280saneness = iKowloon;
        graveside();
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public boolean impromptu(czestochowa.attabal attabalVar) {
        saneness sanenessVar = (saneness) decarock.attabal.marial(this.f12268apical.get(attabalVar.f11763attabal));
        boolean z = true;
        boolean z2 = this.f12276saneness.dern() >= arytenoidectomy();
        long jMin = this.f12272dern;
        float f = attabalVar.f11764beachfront;
        if (f > 1.0f) {
            jMin = Math.min(decarock.grimness.permissivist(jMin, f), this.f12278wireman);
        }
        long jMax = Math.max(jMin, 500000L);
        long j = attabalVar.f11768marial;
        if (j < jMax) {
            if (!this.f12274impromptu && z2) {
                z = false;
            }
            sanenessVar.f12279attabal = z;
            if (!z && j < 500000) {
                decarock.triweekly.impromptu("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f12278wireman || z2) {
            sanenessVar.f12279attabal = false;
        }
        return sanenessVar.f12279attabal;
    }

    public int kowloon(homozygous[] homozygousVarArr, hydromechanics.rotuma[] rotumaVarArr) {
        int iMonoploid = 0;
        for (int i = 0; i < homozygousVarArr.length; i++) {
            if (rotumaVarArr[i] != null) {
                iMonoploid += monoploid(homozygousVarArr[i].getTrackType());
            }
        }
        return Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iMonoploid);
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public long marial(ctenidium ctenidiumVar) {
        return this.f12277taiyuan;
    }

    public final void molybdenite(ctenidium ctenidiumVar) {
        saneness sanenessVar = (saneness) decarock.attabal.marial(this.f12268apical.get(ctenidiumVar));
        int i = this.f12270competently;
        if (i == -1) {
            i = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        sanenessVar.f12280saneness = i;
        sanenessVar.f12279attabal = false;
    }

    public final void polloi(ctenidium ctenidiumVar) {
        if (this.f12268apical.remove(ctenidiumVar) != null) {
            graveside();
        }
    }

    @Override // androidx.media3.exoplayer.czestochowa
    public boolean wireman(ctenidium ctenidiumVar) {
        return this.f12271cutely;
    }

    public polloi(polyfoil.beachfront beachfrontVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        triweekly(i3, 0, "bufferForPlaybackMs", "0");
        triweekly(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        triweekly(i, i3, "minBufferMs", "bufferForPlaybackMs");
        triweekly(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        triweekly(i2, i, "maxBufferMs", "minBufferMs");
        triweekly(i6, 0, "backBufferDurationMs", "0");
        this.f12276saneness = beachfrontVar;
        this.f12272dern = decarock.grimness.outmarry(i);
        this.f12278wireman = decarock.grimness.outmarry(i2);
        this.f12275marial = decarock.grimness.outmarry(i3);
        this.f12269beachfront = decarock.grimness.outmarry(i4);
        this.f12270competently = i5;
        this.f12274impromptu = z;
        this.f12277taiyuan = decarock.grimness.outmarry(i6);
        this.f12271cutely = z2;
        this.f12268apical = new HashMap<>();
        this.f12273formularize = -1L;
    }
}
