package androidx.media3.common;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import decarock.grimness;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes.dex */
public final class polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11146attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11147dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11148saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f11149wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final polder f11144marial = new polder(0, 0);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f11141beachfront = grimness.igbo(0);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final String f11142competently = grimness.igbo(1);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final String f11143impromptu = grimness.igbo(2);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final String f11145taiyuan = grimness.igbo(3);

    public polder(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof polder) {
            polder polderVar = (polder) obj;
            if (this.f11146attabal == polderVar.f11146attabal && this.f11148saneness == polderVar.f11148saneness && this.f11147dern == polderVar.f11147dern && this.f11149wireman == polderVar.f11149wireman) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Sdk$SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f11146attabal) * 31) + this.f11148saneness) * 31) + this.f11147dern) * 31) + Float.floatToRawIntBits(this.f11149wireman);
    }

    public polder(int i, int i2, int i3, float f) {
        this.f11146attabal = i;
        this.f11148saneness = i2;
        this.f11147dern = i3;
        this.f11149wireman = f;
    }
}
