package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.cig;
import androidx.core.view.hardpan;
import androidx.core.view.premeiotic;
import androidx.core.view.supplicat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class cuirassed {

    /* JADX INFO: compiled from: ViewUtils.java */
    public class attabal implements wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ boolean f20442attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ boolean f20443dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ boolean f20444saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ wireman f20445wireman;

        public attabal(boolean z, boolean z2, boolean z3, wireman wiremanVar) {
            this.f20442attabal = z;
            this.f20444saneness = z2;
            this.f20443dern = z3;
            this.f20445wireman = wiremanVar;
        }

        @Override // com.google.android.material.internal.cuirassed.wireman
        public hardpan attabal(View view, hardpan hardpanVar, marial marialVar) {
            if (this.f20442attabal) {
                marialVar.f20449wireman += hardpanVar.cutely();
            }
            boolean zImpassible = cuirassed.impassible(view);
            if (this.f20444saneness) {
                if (zImpassible) {
                    marialVar.f20447dern += hardpanVar.apical();
                } else {
                    marialVar.f20446attabal += hardpanVar.apical();
                }
            }
            if (this.f20443dern) {
                if (zImpassible) {
                    marialVar.f20446attabal += hardpanVar.formularize();
                } else {
                    marialVar.f20447dern += hardpanVar.formularize();
                }
            }
            marialVar.attabal(view);
            wireman wiremanVar = this.f20445wireman;
            return wiremanVar != null ? wiremanVar.attabal(view, hardpanVar, marialVar) : hardpanVar;
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class saneness implements supplicat {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ wireman f20450attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ marial f20451saneness;

        public saneness(wireman wiremanVar, marial marialVar) {
            this.f20450attabal = wiremanVar;
            this.f20451saneness = marialVar;
        }

        @Override // androidx.core.view.supplicat
        public hardpan attabal(View view, hardpan hardpanVar) {
            return this.f20450attabal.attabal(view, hardpanVar, new marial(this.f20451saneness));
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public interface wireman {
        hardpan attabal(View view, hardpan hardpanVar, marial marialVar);
    }

    public static float apical(View view) {
        float elevation = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static void arytenoidectomy(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.cord
            @Override // java.lang.Runnable
            public final void run() {
                cuirassed.monoploid(view, z);
            }
        });
    }

    public static void beachfront(View view, wireman wiremanVar) {
        premeiotic.picketboat(view, new saneness(wiremanVar, new marial(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        kowloon(view);
    }

    public static float competently(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static InputMethodManager cutely(View view) {
        return (InputMethodManager) picketboat.saneness.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static Rect dern(View view) {
        return wireman(view, 0);
    }

    public static void formularize(View view, boolean z) {
        cig cigVarPolder;
        if (z && (cigVarPolder = premeiotic.polder(view)) != null) {
            cigVarPolder.attabal(hardpan.triweekly.saneness());
            return;
        }
        InputMethodManager inputMethodManagerCutely = cutely(view);
        if (inputMethodManagerCutely != null) {
            inputMethodManagerCutely.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean impassible(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static Integer impromptu(View view) {
        ColorStateList colorStateListCompetently = strum.wireman.competently(view.getBackground());
        if (colorStateListCompetently != null) {
            return Integer.valueOf(colorStateListCompetently.getDefaultColor());
        }
        return null;
    }

    public static void kowloon(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new dern());
        }
    }

    public static void marial(View view, AttributeSet attributeSet, int i, int i2, wireman wiremanVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, bubbles.impassible.Insets, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(bubbles.impassible.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(bubbles.impassible.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(bubbles.impassible.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        beachfront(view, new attabal(z, z2, z3, wiremanVar));
    }

    public static void monoploid(View view, boolean z) {
        cig cigVarPolder;
        if (!z || (cigVarPolder = premeiotic.polder(view)) == null) {
            cutely(view).showSoftInput(view, 1);
        } else {
            cigVarPolder.beachfront(hardpan.triweekly.saneness());
        }
    }

    public static Rect saneness(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static ViewGroup taiyuan(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static PorterDuff.Mode triweekly(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect wireman(View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f20446attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f20447dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f20448saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f20449wireman;

        public marial(int i, int i2, int i3, int i4) {
            this.f20446attabal = i;
            this.f20448saneness = i2;
            this.f20447dern = i3;
            this.f20449wireman = i4;
        }

        public void attabal(View view) {
            view.setPaddingRelative(this.f20446attabal, this.f20448saneness, this.f20447dern, this.f20449wireman);
        }

        public marial(marial marialVar) {
            this.f20446attabal = marialVar.f20446attabal;
            this.f20448saneness = marialVar.f20448saneness;
            this.f20447dern = marialVar.f20447dern;
            this.f20449wireman = marialVar.f20449wireman;
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class dern implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
