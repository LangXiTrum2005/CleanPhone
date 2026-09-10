package gown;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.gms.ads.AdSize;
import com.unity3d.services.UnityAdsConstants;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: MaterialBackAnimationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal<V extends View> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TimeInterpolator f27392attabal = new PathInterpolator(0.1f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.p000activity.saneness f27393beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f27394dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f27395marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final V f27396saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f27397wireman;

    public attabal(V v) {
        this.f27396saneness = v;
        Context context = v.getContext();
        this.f27394dern = apical.beachfront(context, bubbles.dern.motionDurationMedium2, AdSize.MEDIUM_RECTANGLE_WIDTH);
        this.f27397wireman = apical.beachfront(context, bubbles.dern.motionDurationShort3, Opcodes.FCMPG);
        this.f27395marial = apical.beachfront(context, bubbles.dern.motionDurationShort2, 100);
    }

    public float attabal(float f) {
        return this.f27392attabal.getInterpolation(f);
    }

    public androidx.p000activity.saneness dern() {
        androidx.p000activity.saneness sanenessVar = this.f27393beachfront;
        this.f27393beachfront = null;
        return sanenessVar;
    }

    public androidx.p000activity.saneness marial(androidx.p000activity.saneness sanenessVar) {
        androidx.p000activity.saneness sanenessVar2 = this.f27393beachfront;
        this.f27393beachfront = sanenessVar;
        return sanenessVar2;
    }

    public androidx.p000activity.saneness saneness() {
        androidx.p000activity.saneness sanenessVar = this.f27393beachfront;
        this.f27393beachfront = null;
        return sanenessVar;
    }

    public void wireman(androidx.p000activity.saneness sanenessVar) {
        this.f27393beachfront = sanenessVar;
    }
}
