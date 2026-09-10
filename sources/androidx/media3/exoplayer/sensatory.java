package androidx.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LoadingInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class sensatory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f12396attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f12397dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f12398saneness;

    /* JADX INFO: compiled from: LoadingInfo.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f12399attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f12400dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f12401saneness;

        public saneness beachfront(long j) {
            this.f12399attabal = j;
            return this;
        }

        public saneness competently(float f) {
            decarock.attabal.attabal(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == -3.4028235E38f);
            this.f12401saneness = f;
            return this;
        }

        public saneness marial(long j) {
            decarock.attabal.attabal(j >= 0 || j == C.TIME_UNSET);
            this.f12400dern = j;
            return this;
        }

        public sensatory wireman() {
            return new sensatory(this);
        }

        public saneness() {
            this.f12399attabal = C.TIME_UNSET;
            this.f12401saneness = -3.4028235E38f;
            this.f12400dern = C.TIME_UNSET;
        }

        public saneness(sensatory sensatoryVar) {
            this.f12399attabal = sensatoryVar.f12396attabal;
            this.f12401saneness = sensatoryVar.f12398saneness;
            this.f12400dern = sensatoryVar.f12397dern;
        }
    }

    public saneness attabal() {
        return new saneness();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sensatory)) {
            return false;
        }
        sensatory sensatoryVar = (sensatory) obj;
        return this.f12396attabal == sensatoryVar.f12396attabal && this.f12398saneness == sensatoryVar.f12398saneness && this.f12397dern == sensatoryVar.f12397dern;
    }

    public int hashCode() {
        return com.google.common.base.taiyuan.saneness(Long.valueOf(this.f12396attabal), Float.valueOf(this.f12398saneness), Long.valueOf(this.f12397dern));
    }

    public sensatory(saneness sanenessVar) {
        this.f12396attabal = sanenessVar.f12399attabal;
        this.f12398saneness = sanenessVar.f12401saneness;
        this.f12397dern = sanenessVar.f12400dern;
    }
}
