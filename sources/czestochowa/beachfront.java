package czestochowa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.ironsource.mediationsdk.j;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: KeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends wireman {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String f24865competently = null;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f24873impromptu = 0;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f24880taiyuan = -1;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public String f24867cutely = null;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f24863apical = Float.NaN;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f24869formularize = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f24872impassible = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f24881triweekly = Float.NaN;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f24874kowloon = -1;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f24864arytenoidectomy = Float.NaN;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f24876monoploid = Float.NaN;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f24877polloi = Float.NaN;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f24875molybdenite = Float.NaN;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f24871graveside = Float.NaN;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f24862adultoid = Float.NaN;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f24868dovishness = Float.NaN;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f24870gintrap = Float.NaN;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f24879rotuma = Float.NaN;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f24878preprohormone = Float.NaN;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public float f24866cord = Float.NaN;

    /* JADX INFO: compiled from: KeyCycle.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static SparseIntArray f24882attabal;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24882attabal = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.KeyCycle_motionTarget, 1);
            f24882attabal.append(sensatory.wireman.KeyCycle_framePosition, 2);
            f24882attabal.append(sensatory.wireman.KeyCycle_transitionEasing, 3);
            f24882attabal.append(sensatory.wireman.KeyCycle_curveFit, 4);
            f24882attabal.append(sensatory.wireman.KeyCycle_waveShape, 5);
            f24882attabal.append(sensatory.wireman.KeyCycle_wavePeriod, 6);
            f24882attabal.append(sensatory.wireman.KeyCycle_waveOffset, 7);
            f24882attabal.append(sensatory.wireman.KeyCycle_waveVariesBy, 8);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_alpha, 9);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_elevation, 10);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_rotation, 11);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_rotationX, 12);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_rotationY, 13);
            f24882attabal.append(sensatory.wireman.KeyCycle_transitionPathRotate, 14);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_scaleX, 15);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_scaleY, 16);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_translationX, 17);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_translationY, 18);
            f24882attabal.append(sensatory.wireman.KeyCycle_android_translationZ, 19);
            f24882attabal.append(sensatory.wireman.KeyCycle_motionProgress, 20);
            f24882attabal.append(sensatory.wireman.KeyCycle_wavePhase, 21);
        }

        public static void saneness(beachfront beachfrontVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f24882attabal.get(index)) {
                    case 1:
                        if (MotionLayout.f8430incorrectly) {
                            int resourceId = typedArray.getResourceId(index, beachfrontVar.f25036saneness);
                            beachfrontVar.f25036saneness = resourceId;
                            if (resourceId == -1) {
                                beachfrontVar.f25034dern = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            beachfrontVar.f25034dern = typedArray.getString(index);
                        } else {
                            beachfrontVar.f25036saneness = typedArray.getResourceId(index, beachfrontVar.f25036saneness);
                        }
                        break;
                    case 2:
                        beachfrontVar.f25033attabal = typedArray.getInt(index, beachfrontVar.f25033attabal);
                        break;
                    case 3:
                        beachfrontVar.f24865competently = typedArray.getString(index);
                        break;
                    case 4:
                        beachfrontVar.f24873impromptu = typedArray.getInteger(index, beachfrontVar.f24873impromptu);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            beachfrontVar.f24867cutely = typedArray.getString(index);
                            beachfrontVar.f24880taiyuan = 7;
                        } else {
                            beachfrontVar.f24880taiyuan = typedArray.getInt(index, beachfrontVar.f24880taiyuan);
                        }
                        break;
                    case 6:
                        beachfrontVar.f24863apical = typedArray.getFloat(index, beachfrontVar.f24863apical);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            beachfrontVar.f24869formularize = typedArray.getDimension(index, beachfrontVar.f24869formularize);
                        } else {
                            beachfrontVar.f24869formularize = typedArray.getFloat(index, beachfrontVar.f24869formularize);
                        }
                        break;
                    case 8:
                        beachfrontVar.f24874kowloon = typedArray.getInt(index, beachfrontVar.f24874kowloon);
                        break;
                    case 9:
                        beachfrontVar.f24864arytenoidectomy = typedArray.getFloat(index, beachfrontVar.f24864arytenoidectomy);
                        break;
                    case 10:
                        beachfrontVar.f24876monoploid = typedArray.getDimension(index, beachfrontVar.f24876monoploid);
                        break;
                    case 11:
                        beachfrontVar.f24877polloi = typedArray.getFloat(index, beachfrontVar.f24877polloi);
                        break;
                    case 12:
                        beachfrontVar.f24871graveside = typedArray.getFloat(index, beachfrontVar.f24871graveside);
                        break;
                    case 13:
                        beachfrontVar.f24862adultoid = typedArray.getFloat(index, beachfrontVar.f24862adultoid);
                        break;
                    case 14:
                        beachfrontVar.f24875molybdenite = typedArray.getFloat(index, beachfrontVar.f24875molybdenite);
                        break;
                    case 15:
                        beachfrontVar.f24868dovishness = typedArray.getFloat(index, beachfrontVar.f24868dovishness);
                        break;
                    case 16:
                        beachfrontVar.f24870gintrap = typedArray.getFloat(index, beachfrontVar.f24870gintrap);
                        break;
                    case 17:
                        beachfrontVar.f24879rotuma = typedArray.getDimension(index, beachfrontVar.f24879rotuma);
                        break;
                    case 18:
                        beachfrontVar.f24878preprohormone = typedArray.getDimension(index, beachfrontVar.f24878preprohormone);
                        break;
                    case 19:
                        beachfrontVar.f24866cord = typedArray.getDimension(index, beachfrontVar.f24866cord);
                        break;
                    case 20:
                        beachfrontVar.f24881triweekly = typedArray.getFloat(index, beachfrontVar.f24881triweekly);
                        break;
                    case 21:
                        beachfrontVar.f24872impassible = typedArray.getFloat(index, beachfrontVar.f24872impassible) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        f24882attabal.get(index);
                        break;
                }
            }
        }
    }

    public beachfront() {
        this.f25037wireman = 4;
        this.f25035marial = new HashMap<>();
    }

    @Override // czestochowa.wireman
    public void attabal(HashMap<String, coi.wireman> map) {
        czestochowa.attabal.competently("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            coi.wireman wiremanVar = map.get(str);
            if (wiremanVar != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        wiremanVar.dern(this.f25033attabal, this.f24871graveside);
                        break;
                    case "rotationY":
                        wiremanVar.dern(this.f25033attabal, this.f24862adultoid);
                        break;
                    case "translationX":
                        wiremanVar.dern(this.f25033attabal, this.f24879rotuma);
                        break;
                    case "translationY":
                        wiremanVar.dern(this.f25033attabal, this.f24878preprohormone);
                        break;
                    case "translationZ":
                        wiremanVar.dern(this.f25033attabal, this.f24866cord);
                        break;
                    case "progress":
                        wiremanVar.dern(this.f25033attabal, this.f24881triweekly);
                        break;
                    case "scaleX":
                        wiremanVar.dern(this.f25033attabal, this.f24868dovishness);
                        break;
                    case "scaleY":
                        wiremanVar.dern(this.f25033attabal, this.f24870gintrap);
                        break;
                    case "rotation":
                        wiremanVar.dern(this.f25033attabal, this.f24877polloi);
                        break;
                    case "elevation":
                        wiremanVar.dern(this.f25033attabal, this.f24876monoploid);
                        break;
                    case "transitionPathRotate":
                        wiremanVar.dern(this.f25033attabal, this.f24875molybdenite);
                        break;
                    case "alpha":
                        wiremanVar.dern(this.f25033attabal, this.f24864arytenoidectomy);
                        break;
                    case "waveOffset":
                        wiremanVar.dern(this.f25033attabal, this.f24869formularize);
                        break;
                    case "wavePhase":
                        wiremanVar.dern(this.f25033attabal, this.f24872impassible);
                        break;
                    default:
                        str.startsWith(j.f);
                        break;
                }
            }
        }
    }

    public void dent(HashMap<String, coi.dern> map) {
        coi.dern dernVar;
        coi.dern dernVar2;
        for (String str : map.keySet()) {
            if (str.startsWith(j.f)) {
                ConstraintAttribute constraintAttribute = this.f25035marial.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.wireman() == ConstraintAttribute.AttributeType.FLOAT_TYPE && (dernVar = map.get(str)) != null) {
                    dernVar.marial(this.f25033attabal, this.f24880taiyuan, this.f24867cutely, this.f24874kowloon, this.f24863apical, this.f24869formularize, this.f24872impassible, constraintAttribute.marial(), constraintAttribute);
                }
            } else {
                float fPermissivist = permissivist(str);
                if (!Float.isNaN(fPermissivist) && (dernVar2 = map.get(str)) != null) {
                    dernVar2.wireman(this.f25033attabal, this.f24880taiyuan, this.f24867cutely, this.f24874kowloon, this.f24863apical, this.f24869formularize, this.f24872impassible, fPermissivist);
                }
            }
        }
    }

    @Override // czestochowa.wireman
    public wireman dern(wireman wiremanVar) {
        super.dern(wiremanVar);
        beachfront beachfrontVar = (beachfront) wiremanVar;
        this.f24865competently = beachfrontVar.f24865competently;
        this.f24873impromptu = beachfrontVar.f24873impromptu;
        this.f24880taiyuan = beachfrontVar.f24880taiyuan;
        this.f24867cutely = beachfrontVar.f24867cutely;
        this.f24863apical = beachfrontVar.f24863apical;
        this.f24869formularize = beachfrontVar.f24869formularize;
        this.f24872impassible = beachfrontVar.f24872impassible;
        this.f24881triweekly = beachfrontVar.f24881triweekly;
        this.f24874kowloon = beachfrontVar.f24874kowloon;
        this.f24864arytenoidectomy = beachfrontVar.f24864arytenoidectomy;
        this.f24876monoploid = beachfrontVar.f24876monoploid;
        this.f24877polloi = beachfrontVar.f24877polloi;
        this.f24875molybdenite = beachfrontVar.f24875molybdenite;
        this.f24871graveside = beachfrontVar.f24871graveside;
        this.f24862adultoid = beachfrontVar.f24862adultoid;
        this.f24868dovishness = beachfrontVar.f24868dovishness;
        this.f24870gintrap = beachfrontVar.f24870gintrap;
        this.f24879rotuma = beachfrontVar.f24879rotuma;
        this.f24878preprohormone = beachfrontVar.f24878preprohormone;
        this.f24866cord = beachfrontVar.f24866cord;
        return this;
    }

    @Override // czestochowa.wireman
    public void marial(Context context, AttributeSet attributeSet) {
        attabal.saneness(this, context.obtainStyledAttributes(attributeSet, sensatory.wireman.KeyCycle));
    }

    public float permissivist(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f24871graveside;
            case "rotationY":
                return this.f24862adultoid;
            case "translationX":
                return this.f24879rotuma;
            case "translationY":
                return this.f24878preprohormone;
            case "translationZ":
                return this.f24866cord;
            case "progress":
                return this.f24881triweekly;
            case "scaleX":
                return this.f24868dovishness;
            case "scaleY":
                return this.f24870gintrap;
            case "rotation":
                return this.f24877polloi;
            case "elevation":
                return this.f24876monoploid;
            case "transitionPathRotate":
                return this.f24875molybdenite;
            case "alpha":
                return this.f24864arytenoidectomy;
            case "waveOffset":
                return this.f24869formularize;
            case "wavePhase":
                return this.f24872impassible;
            default:
                str.startsWith(j.f);
                return Float.NaN;
        }
    }

    @Override // czestochowa.wireman
    /* JADX INFO: renamed from: saneness */
    public wireman clone() {
        return new beachfront().dern(this);
    }

    @Override // czestochowa.wireman
    public void wireman(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f24864arytenoidectomy)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24876monoploid)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24877polloi)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24871graveside)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24862adultoid)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24868dovishness)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24870gintrap)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24875molybdenite)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24879rotuma)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24878preprohormone)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24866cord)) {
            hashSet.add("translationZ");
        }
        if (this.f25035marial.size() > 0) {
            Iterator<String> it = this.f25035marial.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }
}
