package chinny;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ShapeAppearanceModel.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final wireman f15488impassible = new impassible(0.5f);

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public competently f15489apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public marial f15490attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public wireman f15491beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public wireman f15492competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public competently f15493cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public marial f15494dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public competently f15495formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public wireman f15496impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public wireman f15497marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public marial f15498saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public competently f15499taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public marial f15500wireman;

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public interface dern {
        wireman attabal(wireman wiremanVar);
    }

    public static saneness attabal() {
        return new saneness();
    }

    public static saneness beachfront(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return competently(context, attributeSet, i, i2, new chinny.attabal(i3));
    }

    public static saneness competently(Context context, AttributeSet attributeSet, int i, int i2, wireman wiremanVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bubbles.impassible.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return wireman(context, resourceId, resourceId2, wiremanVar);
    }

    public static saneness dern(Context context, int i, int i2, int i3) {
        return wireman(context, i, i2, new chinny.attabal(i3));
    }

    public static wireman impassible(TypedArray typedArray, int i, wireman wiremanVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new chinny.attabal(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new impassible(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return wiremanVar;
    }

    public static saneness marial(Context context, AttributeSet attributeSet, int i, int i2) {
        return beachfront(context, attributeSet, i, i2, 0);
    }

    public static saneness saneness(Context context, int i, int i2) {
        return dern(context, i, i2, 0);
    }

    public static saneness wireman(Context context, int i, int i2, wireman wiremanVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(bubbles.impassible.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(bubbles.impassible.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(bubbles.impassible.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(bubbles.impassible.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(bubbles.impassible.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(bubbles.impassible.ShapeAppearance_cornerFamilyBottomLeft, i3);
            wireman wiremanVarImpassible = impassible(typedArrayObtainStyledAttributes, bubbles.impassible.ShapeAppearance_cornerSize, wiremanVar);
            wireman wiremanVarImpassible2 = impassible(typedArrayObtainStyledAttributes, bubbles.impassible.ShapeAppearance_cornerSizeTopLeft, wiremanVarImpassible);
            wireman wiremanVarImpassible3 = impassible(typedArrayObtainStyledAttributes, bubbles.impassible.ShapeAppearance_cornerSizeTopRight, wiremanVarImpassible);
            wireman wiremanVarImpassible4 = impassible(typedArrayObtainStyledAttributes, bubbles.impassible.ShapeAppearance_cornerSizeBottomRight, wiremanVarImpassible);
            return new saneness().trm(i4, wiremanVarImpassible2).kattegat(i5, wiremanVarImpassible3).rotuma(i6, wiremanVarImpassible4).graveside(i7, impassible(typedArrayObtainStyledAttributes, bubbles.impassible.ShapeAppearance_cornerSizeBottomLeft, wiremanVarImpassible));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean adultoid() {
        return (this.f15498saneness instanceof triweekly) && (this.f15490attabal instanceof triweekly) && (this.f15494dern instanceof triweekly) && (this.f15500wireman instanceof triweekly);
    }

    public marial apical() {
        return this.f15494dern;
    }

    public competently arytenoidectomy() {
        return this.f15499taiyuan;
    }

    public kowloon cord(dern dernVar) {
        return gintrap().sealless(dernVar.attabal(polloi())).merc(dernVar.attabal(graveside())).gintrap(dernVar.attabal(cutely())).cuirassed(dernVar.attabal(formularize())).impassible();
    }

    public wireman cutely() {
        return this.f15496impromptu;
    }

    public boolean dovishness(RectF rectF) {
        boolean z = this.f15495formularize.getClass().equals(competently.class) && this.f15493cutely.getClass().equals(competently.class) && this.f15499taiyuan.getClass().equals(competently.class) && this.f15489apical.getClass().equals(competently.class);
        float fAttabal = this.f15497marial.attabal(rectF);
        return z && ((this.f15491beachfront.attabal(rectF) > fAttabal ? 1 : (this.f15491beachfront.attabal(rectF) == fAttabal ? 0 : -1)) == 0 && (this.f15496impromptu.attabal(rectF) > fAttabal ? 1 : (this.f15496impromptu.attabal(rectF) == fAttabal ? 0 : -1)) == 0 && (this.f15492competently.attabal(rectF) > fAttabal ? 1 : (this.f15492competently.attabal(rectF) == fAttabal ? 0 : -1)) == 0) && adultoid();
    }

    public wireman formularize() {
        return this.f15492competently;
    }

    public saneness gintrap() {
        return new saneness(this);
    }

    public wireman graveside() {
        return this.f15491beachfront;
    }

    public competently impromptu() {
        return this.f15489apical;
    }

    public competently kowloon() {
        return this.f15493cutely;
    }

    public marial molybdenite() {
        return this.f15498saneness;
    }

    public marial monoploid() {
        return this.f15490attabal;
    }

    public wireman polloi() {
        return this.f15497marial;
    }

    public kowloon preprohormone(wireman wiremanVar) {
        return gintrap().arytenoidectomy(wiremanVar).impassible();
    }

    public kowloon rotuma(float f) {
        return gintrap().kowloon(f).impassible();
    }

    public marial taiyuan() {
        return this.f15500wireman;
    }

    public String toString() {
        return X3.j.d + polloi() + ", " + graveside() + ", " + formularize() + ", " + cutely() + X3.j.e;
    }

    public competently triweekly() {
        return this.f15495formularize;
    }

    public kowloon(saneness sanenessVar) {
        this.f15490attabal = sanenessVar.f15502attabal;
        this.f15498saneness = sanenessVar.f15510saneness;
        this.f15494dern = sanenessVar.f15506dern;
        this.f15500wireman = sanenessVar.f15512wireman;
        this.f15497marial = sanenessVar.f15509marial;
        this.f15491beachfront = sanenessVar.f15503beachfront;
        this.f15492competently = sanenessVar.f15504competently;
        this.f15496impromptu = sanenessVar.f15508impromptu;
        this.f15499taiyuan = sanenessVar.f15511taiyuan;
        this.f15493cutely = sanenessVar.f15505cutely;
        this.f15489apical = sanenessVar.f15501apical;
        this.f15495formularize = sanenessVar.f15507formularize;
    }

    /* JADX INFO: compiled from: ShapeAppearanceModel.java */
    public static final class saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public competently f15501apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public marial f15502attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public wireman f15503beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public wireman f15504competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public competently f15505cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public marial f15506dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public competently f15507formularize;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public wireman f15508impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public wireman f15509marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public marial f15510saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public competently f15511taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public marial f15512wireman;

        public saneness() {
            this.f15502attabal = cutely.saneness();
            this.f15510saneness = cutely.saneness();
            this.f15506dern = cutely.saneness();
            this.f15512wireman = cutely.saneness();
            this.f15509marial = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15503beachfront = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15504competently = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15508impromptu = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15511taiyuan = cutely.dern();
            this.f15505cutely = cutely.dern();
            this.f15501apical = cutely.dern();
            this.f15507formularize = cutely.dern();
        }

        public static float triweekly(marial marialVar) {
            if (marialVar instanceof triweekly) {
                return ((triweekly) marialVar).f15608attabal;
            }
            if (marialVar instanceof beachfront) {
                return ((beachfront) marialVar).f15459attabal;
            }
            return -1.0f;
        }

        public saneness adultoid(marial marialVar) {
            this.f15512wireman = marialVar;
            float fTriweekly = triweekly(marialVar);
            if (fTriweekly != -1.0f) {
                dovishness(fTriweekly);
            }
            return this;
        }

        public saneness arytenoidectomy(wireman wiremanVar) {
            return sealless(wiremanVar).merc(wiremanVar).cuirassed(wiremanVar).gintrap(wiremanVar);
        }

        public saneness cord(float f) {
            this.f15504competently = new chinny.attabal(f);
            return this;
        }

        public saneness cuirassed(wireman wiremanVar) {
            this.f15504competently = wiremanVar;
            return this;
        }

        public saneness dovishness(float f) {
            this.f15508impromptu = new chinny.attabal(f);
            return this;
        }

        public saneness gintrap(wireman wiremanVar) {
            this.f15508impromptu = wiremanVar;
            return this;
        }

        public saneness graveside(int i, wireman wiremanVar) {
            return adultoid(cutely.attabal(i)).gintrap(wiremanVar);
        }

        public kowloon impassible() {
            return new kowloon(this);
        }

        public saneness kattegat(int i, wireman wiremanVar) {
            return supplicat(cutely.attabal(i)).merc(wiremanVar);
        }

        public saneness kowloon(float f) {
            return yemenite(f).restrictive(f).cord(f).dovishness(f);
        }

        public saneness merc(wireman wiremanVar) {
            this.f15503beachfront = wiremanVar;
            return this;
        }

        public saneness molybdenite(competently competentlyVar) {
            this.f15501apical = competentlyVar;
            return this;
        }

        public saneness monoploid(int i, float f) {
            return polloi(cutely.attabal(i)).kowloon(f);
        }

        public saneness oilcan(marial marialVar) {
            this.f15502attabal = marialVar;
            float fTriweekly = triweekly(marialVar);
            if (fTriweekly != -1.0f) {
                yemenite(fTriweekly);
            }
            return this;
        }

        public saneness polloi(marial marialVar) {
            return oilcan(marialVar).supplicat(marialVar).preprohormone(marialVar).adultoid(marialVar);
        }

        public saneness preprohormone(marial marialVar) {
            this.f15506dern = marialVar;
            float fTriweekly = triweekly(marialVar);
            if (fTriweekly != -1.0f) {
                cord(fTriweekly);
            }
            return this;
        }

        public saneness restrictive(float f) {
            this.f15503beachfront = new chinny.attabal(f);
            return this;
        }

        public saneness rotuma(int i, wireman wiremanVar) {
            return preprohormone(cutely.attabal(i)).cuirassed(wiremanVar);
        }

        public saneness sealless(wireman wiremanVar) {
            this.f15509marial = wiremanVar;
            return this;
        }

        public saneness stratoscope(competently competentlyVar) {
            this.f15511taiyuan = competentlyVar;
            return this;
        }

        public saneness supplicat(marial marialVar) {
            this.f15510saneness = marialVar;
            float fTriweekly = triweekly(marialVar);
            if (fTriweekly != -1.0f) {
                restrictive(fTriweekly);
            }
            return this;
        }

        public saneness trm(int i, wireman wiremanVar) {
            return oilcan(cutely.attabal(i)).sealless(wiremanVar);
        }

        public saneness yemenite(float f) {
            this.f15509marial = new chinny.attabal(f);
            return this;
        }

        public saneness(kowloon kowloonVar) {
            this.f15502attabal = cutely.saneness();
            this.f15510saneness = cutely.saneness();
            this.f15506dern = cutely.saneness();
            this.f15512wireman = cutely.saneness();
            this.f15509marial = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15503beachfront = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15504competently = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15508impromptu = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f15511taiyuan = cutely.dern();
            this.f15505cutely = cutely.dern();
            this.f15501apical = cutely.dern();
            this.f15507formularize = cutely.dern();
            this.f15502attabal = kowloonVar.f15490attabal;
            this.f15510saneness = kowloonVar.f15498saneness;
            this.f15506dern = kowloonVar.f15494dern;
            this.f15512wireman = kowloonVar.f15500wireman;
            this.f15509marial = kowloonVar.f15497marial;
            this.f15503beachfront = kowloonVar.f15491beachfront;
            this.f15504competently = kowloonVar.f15492competently;
            this.f15508impromptu = kowloonVar.f15496impromptu;
            this.f15511taiyuan = kowloonVar.f15499taiyuan;
            this.f15505cutely = kowloonVar.f15493cutely;
            this.f15501apical = kowloonVar.f15489apical;
            this.f15507formularize = kowloonVar.f15495formularize;
        }
    }

    public kowloon() {
        this.f15490attabal = cutely.saneness();
        this.f15498saneness = cutely.saneness();
        this.f15494dern = cutely.saneness();
        this.f15500wireman = cutely.saneness();
        this.f15497marial = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f15491beachfront = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f15492competently = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f15496impromptu = new chinny.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f15499taiyuan = cutely.dern();
        this.f15493cutely = cutely.dern();
        this.f15489apical = cutely.dern();
        this.f15495formularize = cutely.dern();
    }
}
