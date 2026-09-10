package czestochowa;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.ironsource.mediationsdk.j;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize implements Comparable<formularize> {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public static String[] f24904hydrovane = {X3.i.L, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public float f24913grimness;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public float f24916merc;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f24918monoploid;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public float f24920polder;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public float f24926saran;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public float f24928seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public lerp.dern f24931supplicat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f24915kowloon = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f24906arytenoidectomy = 0;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f24921polloi = new LinkedHashMap<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f24917molybdenite = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public double[] f24912graveside = new double[18];

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public double[] f24905adultoid = new double[18];

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f24910dovishness = 1.0f;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f24911gintrap = false;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f24925rotuma = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f24922preprohormone = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public float f24907cord = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public float f24909cuirassed = 1.0f;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float f24930stratoscope = 1.0f;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public float f24932trm = Float.NaN;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public float f24919oilcan = Float.NaN;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public float f24933yemenite = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public float f24927sealless = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public float f24914kattegat = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f24924restrictive = 0;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public float f24923privatdozent = Float.NaN;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public float f24908creditor = Float.NaN;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public int f24929starveling = -1;

    public void apical(float f, float f2, float f3, float f4) {
        this.f24920polder = f;
        this.f24928seminary = f2;
        this.f24913grimness = f3;
        this.f24926saran = f4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void attabal(HashMap<String, coi.wireman> map, int i) {
        for (String str : map.keySet()) {
            coi.wireman wiremanVar = map.get(str);
            if (wiremanVar != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                switch (b) {
                    case 0:
                        if (!Float.isNaN(this.f24907cord)) {
                            f = this.f24907cord;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 1:
                        if (!Float.isNaN(this.f24915kowloon)) {
                            f = this.f24915kowloon;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 2:
                        if (!Float.isNaN(this.f24933yemenite)) {
                            f = this.f24933yemenite;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 3:
                        if (!Float.isNaN(this.f24927sealless)) {
                            f = this.f24927sealless;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 4:
                        if (!Float.isNaN(this.f24914kattegat)) {
                            f = this.f24914kattegat;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 5:
                        if (!Float.isNaN(this.f24908creditor)) {
                            f = this.f24908creditor;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 6:
                        wiremanVar.dern(i, Float.isNaN(this.f24909cuirassed) ? 1.0f : this.f24909cuirassed);
                        break;
                    case 7:
                        wiremanVar.dern(i, Float.isNaN(this.f24930stratoscope) ? 1.0f : this.f24930stratoscope);
                        break;
                    case 8:
                        if (!Float.isNaN(this.f24932trm)) {
                            f = this.f24932trm;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 9:
                        if (!Float.isNaN(this.f24919oilcan)) {
                            f = this.f24919oilcan;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 10:
                        if (!Float.isNaN(this.f24922preprohormone)) {
                            f = this.f24922preprohormone;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 11:
                        if (!Float.isNaN(this.f24925rotuma)) {
                            f = this.f24925rotuma;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 12:
                        if (!Float.isNaN(this.f24923privatdozent)) {
                            f = this.f24923privatdozent;
                        }
                        wiremanVar.dern(i, f);
                        break;
                    case 13:
                        wiremanVar.dern(i, Float.isNaN(this.f24910dovishness) ? 1.0f : this.f24910dovishness);
                        break;
                    default:
                        if (str.startsWith(j.f)) {
                            String str2 = str.split(",")[1];
                            if (this.f24921polloi.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = this.f24921polloi.get(str2);
                                if (wiremanVar instanceof coi.wireman.saneness) {
                                    ((coi.wireman.saneness) wiremanVar).taiyuan(i, constraintAttribute);
                                } else {
                                    constraintAttribute.marial();
                                    wiremanVar.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public void cutely(formularize formularizeVar, HashSet<String> hashSet) {
        if (taiyuan(this.f24910dovishness, formularizeVar.f24910dovishness)) {
            hashSet.add("alpha");
        }
        if (taiyuan(this.f24925rotuma, formularizeVar.f24925rotuma)) {
            hashSet.add("elevation");
        }
        int i = this.f24918monoploid;
        int i2 = formularizeVar.f24918monoploid;
        if (i != i2 && this.f24906arytenoidectomy == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (taiyuan(this.f24922preprohormone, formularizeVar.f24922preprohormone)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24923privatdozent) || !Float.isNaN(formularizeVar.f24923privatdozent)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24908creditor) || !Float.isNaN(formularizeVar.f24908creditor)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (taiyuan(this.f24907cord, formularizeVar.f24907cord)) {
            hashSet.add("rotationX");
        }
        if (taiyuan(this.f24915kowloon, formularizeVar.f24915kowloon)) {
            hashSet.add("rotationY");
        }
        if (taiyuan(this.f24932trm, formularizeVar.f24932trm)) {
            hashSet.add("transformPivotX");
        }
        if (taiyuan(this.f24919oilcan, formularizeVar.f24919oilcan)) {
            hashSet.add("transformPivotY");
        }
        if (taiyuan(this.f24909cuirassed, formularizeVar.f24909cuirassed)) {
            hashSet.add("scaleX");
        }
        if (taiyuan(this.f24930stratoscope, formularizeVar.f24930stratoscope)) {
            hashSet.add("scaleY");
        }
        if (taiyuan(this.f24933yemenite, formularizeVar.f24933yemenite)) {
            hashSet.add("translationX");
        }
        if (taiyuan(this.f24927sealless, formularizeVar.f24927sealless)) {
            hashSet.add("translationY");
        }
        if (taiyuan(this.f24914kattegat, formularizeVar.f24914kattegat)) {
            hashSet.add("translationZ");
        }
    }

    public void dern(View view) {
        this.f24918monoploid = view.getVisibility();
        this.f24910dovishness = view.getVisibility() != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : view.getAlpha();
        this.f24911gintrap = false;
        this.f24925rotuma = view.getElevation();
        this.f24922preprohormone = view.getRotation();
        this.f24907cord = view.getRotationX();
        this.f24915kowloon = view.getRotationY();
        this.f24909cuirassed = view.getScaleX();
        this.f24930stratoscope = view.getScaleY();
        this.f24932trm = view.getPivotX();
        this.f24919oilcan = view.getPivotY();
        this.f24933yemenite = view.getTranslationX();
        this.f24927sealless = view.getTranslationY();
        this.f24914kattegat = view.getTranslationZ();
    }

    public void formularize(Rect rect, View view, int i, float f) {
        apical(rect.left, rect.top, rect.width(), rect.height());
        dern(view);
        this.f24932trm = Float.NaN;
        this.f24919oilcan = Float.NaN;
        if (i == 1) {
            this.f24922preprohormone = f - 90.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.f24922preprohormone = f + 90.0f;
        }
    }

    public void impassible(Rect rect, androidx.constraintlayout.widget.attabal attabalVar, int i, int i2) {
        apical(rect.left, rect.top, rect.width(), rect.height());
        wireman(attabalVar.preprohormone(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f24922preprohormone + 90.0f;
            this.f24922preprohormone = f;
            if (f > 180.0f) {
                this.f24922preprohormone = f - 360.0f;
                return;
            }
            return;
        }
        this.f24922preprohormone -= 90.0f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public int compareTo(formularize formularizeVar) {
        return Float.compare(this.f24916merc, formularizeVar.f24916merc);
    }

    public final boolean taiyuan(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public void triweekly(View view) {
        apical(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        dern(view);
    }

    public void wireman(androidx.constraintlayout.widget.attabal.C0056attabal c0056attabal) {
        androidx.constraintlayout.widget.attabal.wireman wiremanVar = c0056attabal.f8935dern;
        int i = wiremanVar.f9053dern;
        this.f24906arytenoidectomy = i;
        int i2 = wiremanVar.f9055saneness;
        this.f24918monoploid = i2;
        this.f24910dovishness = (i2 == 0 || i != 0) ? wiremanVar.f9056wireman : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        androidx.constraintlayout.widget.attabal.marial marialVar = c0056attabal.f8933beachfront;
        this.f24911gintrap = marialVar.f8975impassible;
        this.f24925rotuma = marialVar.f8980triweekly;
        this.f24922preprohormone = marialVar.f8978saneness;
        this.f24907cord = marialVar.f8973dern;
        this.f24915kowloon = marialVar.f8981wireman;
        this.f24909cuirassed = marialVar.f8977marial;
        this.f24930stratoscope = marialVar.f8970beachfront;
        this.f24932trm = marialVar.f8971competently;
        this.f24919oilcan = marialVar.f8976impromptu;
        this.f24933yemenite = marialVar.f8972cutely;
        this.f24927sealless = marialVar.f8968apical;
        this.f24914kattegat = marialVar.f8974formularize;
        this.f24931supplicat = lerp.dern.dern(c0056attabal.f8939wireman.f8966wireman);
        androidx.constraintlayout.widget.attabal.dern dernVar = c0056attabal.f8939wireman;
        this.f24923privatdozent = dernVar.f8964taiyuan;
        this.f24924restrictive = dernVar.f8955beachfront;
        this.f24929starveling = dernVar.f8963saneness;
        this.f24908creditor = c0056attabal.f8935dern.f9054marial;
        for (String str : c0056attabal.f8934competently.keySet()) {
            ConstraintAttribute constraintAttribute = c0056attabal.f8934competently.get(str);
            if (constraintAttribute.competently()) {
                this.f24921polloi.put(str, constraintAttribute);
            }
        }
    }
}
