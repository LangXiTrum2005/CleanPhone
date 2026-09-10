package crescentade;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import apical.wireman;
import bubbles.dern;

/* JADX INFO: compiled from: MaterialThemeOverlay.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f24125attabal = {R.attr.theme, beachfront.attabal.theme};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f24126saneness = {dern.materialThemeOverlay};

    public static int attabal(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24125attabal);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int dern(Context context, AttributeSet attributeSet, int i, int i2) {
        return saneness(context, attributeSet, f24126saneness, i, i2)[0];
    }

    public static Context marial(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int iDern = dern(context, attributeSet, i, i2);
        boolean z = (context instanceof wireman) && ((wireman) context).dern() == iDern;
        if (iDern == 0 || z) {
            return context;
        }
        wireman wiremanVar = new wireman(context, iDern);
        for (int i3 : saneness(context, attributeSet, iArr, i, i2)) {
            if (i3 != 0) {
                wiremanVar.getTheme().applyStyle(i3, true);
            }
        }
        int iAttabal = attabal(context, attributeSet);
        if (iAttabal != 0) {
            wiremanVar.getTheme().applyStyle(iAttabal, true);
        }
        return wiremanVar;
    }

    public static int[] saneness(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr2[i3] = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    public static Context wireman(Context context, AttributeSet attributeSet, int i, int i2) {
        return marial(context, attributeSet, i, i2, new int[0]);
    }
}
