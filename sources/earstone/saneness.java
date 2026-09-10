package earstone;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CircularPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends hydrovane {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f25553saneness = 3.0f;

    public static float impromptu(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // earstone.cord
    public long dern(ViewGroup viewGroup, Transition transition, stratoscope stratoscopeVar, stratoscope stratoscopeVar2) {
        int i;
        int iRound;
        int iCenterX;
        if (stratoscopeVar == null && stratoscopeVar2 == null) {
            return 0L;
        }
        if (stratoscopeVar2 == null || marial(stratoscopeVar) == 0) {
            i = -1;
        } else {
            stratoscopeVar = stratoscopeVar2;
            i = 1;
        }
        int iBeachfront = beachfront(stratoscopeVar);
        int iCompetently = competently(stratoscopeVar);
        Rect rectStratoscope = transition.stratoscope();
        if (rectStratoscope != null) {
            iCenterX = rectStratoscope.centerX();
            iRound = rectStratoscope.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fImpromptu = impromptu(iBeachfront, iCompetently, iCenterX, iRound) / impromptu(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, viewGroup.getWidth(), viewGroup.getHeight());
        long jCuirassed = transition.cuirassed();
        if (jCuirassed < 0) {
            jCuirassed = 300;
        }
        return Math.round(((jCuirassed * ((long) i)) / this.f25553saneness) * fImpromptu);
    }
}
