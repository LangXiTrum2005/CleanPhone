package earstone;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: compiled from: SidePropagation.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid extends hydrovane {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f25535saneness = 3.0f;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25534dern = 80;

    public void cutely(int i) {
        this.f25534dern = i;
    }

    @Override // earstone.cord
    public long dern(ViewGroup viewGroup, Transition transition, stratoscope stratoscopeVar, stratoscope stratoscopeVar2) {
        int i;
        int i2;
        int iCenterY;
        int i3;
        stratoscope stratoscopeVar3 = stratoscopeVar;
        if (stratoscopeVar3 == null && stratoscopeVar2 == null) {
            return 0L;
        }
        Rect rectStratoscope = transition.stratoscope();
        if (stratoscopeVar2 == null || marial(stratoscopeVar3) == 0) {
            i = -1;
        } else {
            stratoscopeVar3 = stratoscopeVar2;
            i = 1;
        }
        int iBeachfront = beachfront(stratoscopeVar3);
        int iCompetently = competently(stratoscopeVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectStratoscope != null) {
            int iCenterX = rectStratoscope.centerX();
            i3 = iRound2;
            iCenterY = rectStratoscope.centerY();
            i2 = iCenterX;
        } else {
            i2 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i3 = iRound2;
        }
        float fImpromptu = impromptu(viewGroup, iBeachfront, iCompetently, i2, iCenterY, iRound, i3, width, height) / taiyuan(viewGroup);
        long jCuirassed = transition.cuirassed();
        if (jCuirassed < 0) {
            jCuirassed = 300;
        }
        return Math.round(((jCuirassed * ((long) i)) / this.f25535saneness) * fImpromptu);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    public final int impromptu(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f25534dern;
        if (i9 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i9 = 5;
            } else {
                i9 = 3;
            }
        } else if (i9 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i9 = 3;
            } else {
                i9 = 5;
            }
        }
        if (i9 == 3) {
            return (i7 - i) + Math.abs(i4 - i2);
        }
        if (i9 == 5) {
            return (i - i5) + Math.abs(i4 - i2);
        }
        if (i9 == 48) {
            return (i8 - i2) + Math.abs(i3 - i);
        }
        if (i9 != 80) {
            return 0;
        }
        return (i2 - i6) + Math.abs(i3 - i);
    }

    public final int taiyuan(ViewGroup viewGroup) {
        int i = this.f25534dern;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }
}
