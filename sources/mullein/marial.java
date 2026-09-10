package mullein;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Xml;
import beachfront.cutely;
import bubbles.impassible;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final float f33640apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f33641arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ColorStateList f33642attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f33643beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f33644competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final float f33645cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ColorStateList f33646dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final boolean f33647formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final float f33648impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f33649impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f33650kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f33651marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Typeface f33652molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f33653monoploid = false;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f33654polloi = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ColorStateList f33655saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final float f33656taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public ColorStateList f33657triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f33658wireman;

    /* JADX INFO: compiled from: TextAppearance.java */
    public class attabal extends lightstruck.impromptu.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ competently f33659attabal;

        public attabal(competently competentlyVar) {
            this.f33659attabal = competentlyVar;
        }

        @Override // lightstruck.impromptu.marial
        public void beachfront(int i) {
            marial.this.f33653monoploid = true;
            this.f33659attabal.attabal(i);
        }

        @Override // lightstruck.impromptu.marial
        public void competently(Typeface typeface) {
            marial marialVar = marial.this;
            marialVar.f33652molybdenite = Typeface.create(typeface, marialVar.f33643beachfront);
            marial.this.f33653monoploid = true;
            this.f33659attabal.saneness(marial.this.f33652molybdenite, false);
        }
    }

    /* JADX INFO: compiled from: TextAppearance.java */
    public class saneness extends competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f33661attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ competently f33662dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ TextPaint f33663saneness;

        public saneness(Context context, TextPaint textPaint, competently competentlyVar) {
            this.f33661attabal = context;
            this.f33663saneness = textPaint;
            this.f33662dern = competentlyVar;
        }

        @Override // mullein.competently
        public void attabal(int i) {
            this.f33662dern.attabal(i);
        }

        @Override // mullein.competently
        public void saneness(Typeface typeface, boolean z) {
            marial.this.polloi(this.f33661attabal, this.f33663saneness, typeface);
            this.f33662dern.saneness(typeface, z);
        }
    }

    public marial(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, cutely.TextAppearance);
        kowloon(typedArrayObtainStyledAttributes.getDimension(cutely.TextAppearance_android_textSize, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        triweekly(dern.attabal(context, typedArrayObtainStyledAttributes, cutely.TextAppearance_android_textColor));
        this.f33642attabal = dern.attabal(context, typedArrayObtainStyledAttributes, cutely.TextAppearance_android_textColorHint);
        this.f33655saneness = dern.attabal(context, typedArrayObtainStyledAttributes, cutely.TextAppearance_android_textColorLink);
        this.f33643beachfront = typedArrayObtainStyledAttributes.getInt(cutely.TextAppearance_android_textStyle, 0);
        this.f33644competently = typedArrayObtainStyledAttributes.getInt(cutely.TextAppearance_android_typeface, 1);
        int iCompetently = dern.competently(typedArrayObtainStyledAttributes, cutely.TextAppearance_fontFamily, cutely.TextAppearance_android_fontFamily);
        this.f33641arytenoidectomy = typedArrayObtainStyledAttributes.getResourceId(iCompetently, 0);
        this.f33658wireman = typedArrayObtainStyledAttributes.getString(iCompetently);
        this.f33649impromptu = typedArrayObtainStyledAttributes.getBoolean(cutely.TextAppearance_textAllCaps, false);
        this.f33646dern = dern.attabal(context, typedArrayObtainStyledAttributes, cutely.TextAppearance_android_shadowColor);
        this.f33656taiyuan = typedArrayObtainStyledAttributes.getFloat(cutely.TextAppearance_android_shadowDx, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f33645cutely = typedArrayObtainStyledAttributes.getFloat(cutely.TextAppearance_android_shadowDy, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f33640apical = typedArrayObtainStyledAttributes.getFloat(cutely.TextAppearance_android_shadowRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, impassible.MaterialTextAppearance);
        this.f33647formularize = typedArrayObtainStyledAttributes2.hasValue(impassible.MaterialTextAppearance_android_letterSpacing);
        this.f33648impassible = typedArrayObtainStyledAttributes2.getFloat(impassible.MaterialTextAppearance_android_letterSpacing, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33651marial = typedArrayObtainStyledAttributes2.getString(dern.competently(typedArrayObtainStyledAttributes2, impassible.MaterialTextAppearance_fontVariationSettings, impassible.MaterialTextAppearance_android_fontVariationSettings));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public static String impassible(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 0 && resources.getResourceTypeName(i).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), wostteth.competently.FontFamily);
                        String string = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderSystemFontFamily);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public float apical() {
        return this.f33650kowloon;
    }

    public void arytenoidectomy(Context context, TextPaint textPaint, competently competentlyVar) {
        monoploid(context, textPaint, competentlyVar);
        ColorStateList colorStateList = this.f33657triweekly;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f33640apical;
        float f2 = this.f33656taiyuan;
        float f3 = this.f33645cutely;
        ColorStateList colorStateList2 = this.f33646dern;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public Typeface beachfront(Context context) {
        if (this.f33653monoploid) {
            return this.f33652molybdenite;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceCompetently = lightstruck.impromptu.competently(context, this.f33641arytenoidectomy);
                this.f33652molybdenite = typefaceCompetently;
                if (typefaceCompetently != null) {
                    this.f33652molybdenite = Typeface.create(typefaceCompetently, this.f33643beachfront);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        wireman();
        this.f33653monoploid = true;
        return this.f33652molybdenite;
    }

    public void competently(Context context, TextPaint textPaint, competently competentlyVar) {
        polloi(context, textPaint, marial());
        impromptu(context, new saneness(context, textPaint, competentlyVar));
    }

    public ColorStateList cutely() {
        return this.f33657triweekly;
    }

    public final boolean formularize(Context context) {
        if (beachfront.attabal()) {
            beachfront(context);
            return true;
        }
        if (this.f33653monoploid) {
            return true;
        }
        int i = this.f33641arytenoidectomy;
        if (i == 0) {
            return false;
        }
        Typeface typefaceDern = lightstruck.impromptu.dern(context, i);
        if (typefaceDern != null) {
            this.f33652molybdenite = typefaceDern;
            this.f33653monoploid = true;
            return true;
        }
        Typeface typefaceTaiyuan = taiyuan(context);
        if (typefaceTaiyuan == null) {
            return false;
        }
        this.f33652molybdenite = typefaceTaiyuan;
        this.f33653monoploid = true;
        return true;
    }

    public void impromptu(Context context, competently competentlyVar) {
        if (!formularize(context)) {
            wireman();
        }
        int i = this.f33641arytenoidectomy;
        if (i == 0) {
            this.f33653monoploid = true;
        }
        if (this.f33653monoploid) {
            competentlyVar.saneness(this.f33652molybdenite, true);
            return;
        }
        try {
            lightstruck.impromptu.taiyuan(context, i, new attabal(competentlyVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f33653monoploid = true;
            competentlyVar.attabal(1);
        } catch (Exception unused2) {
            this.f33653monoploid = true;
            competentlyVar.attabal(-3);
        }
    }

    public void kowloon(float f) {
        this.f33650kowloon = f;
    }

    public Typeface marial() {
        wireman();
        return this.f33652molybdenite;
    }

    public void monoploid(Context context, TextPaint textPaint, competently competentlyVar) {
        Typeface typeface;
        if (formularize(context) && this.f33653monoploid && (typeface = this.f33652molybdenite) != null) {
            polloi(context, textPaint, typeface);
        } else {
            competently(context, textPaint, competentlyVar);
        }
    }

    public void polloi(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceAttabal = taiyuan.attabal(context, typeface);
        if (typefaceAttabal != null) {
            typeface = typefaceAttabal;
        }
        textPaint.setTypeface(typeface);
        int i = this.f33643beachfront & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textPaint.setTextSize(this.f33650kowloon);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f33651marial);
        }
        if (this.f33647formularize) {
            textPaint.setLetterSpacing(this.f33648impassible);
        }
    }

    public final Typeface taiyuan(Context context) {
        Typeface typefaceCreate;
        if (this.f33654polloi) {
            return null;
        }
        this.f33654polloi = true;
        String strImpassible = impassible(context, this.f33641arytenoidectomy);
        if (strImpassible == null || (typefaceCreate = Typeface.create(strImpassible, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f33643beachfront);
    }

    public void triweekly(ColorStateList colorStateList) {
        this.f33657triweekly = colorStateList;
    }

    public final void wireman() {
        String str;
        if (this.f33652molybdenite == null && (str = this.f33658wireman) != null) {
            this.f33652molybdenite = Typeface.create(str, this.f33643beachfront);
        }
        if (this.f33652molybdenite == null) {
            int i = this.f33644competently;
            if (i == 1) {
                this.f33652molybdenite = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f33652molybdenite = Typeface.SERIF;
            } else if (i != 3) {
                this.f33652molybdenite = Typeface.DEFAULT;
            } else {
                this.f33652molybdenite = Typeface.MONOSPACE;
            }
            this.f33652molybdenite = Typeface.create(this.f33652molybdenite, this.f33643beachfront);
        }
    }
}
