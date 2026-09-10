package czestochowa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.j;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: KeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely extends wireman {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String f24888competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f24895impromptu = -1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f24901taiyuan = Float.NaN;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f24889cutely = Float.NaN;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f24886apical = Float.NaN;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f24891formularize = Float.NaN;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f24894impassible = Float.NaN;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f24902triweekly = Float.NaN;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f24896kowloon = Float.NaN;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f24887arytenoidectomy = Float.NaN;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f24898monoploid = Float.NaN;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f24899polloi = Float.NaN;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f24897molybdenite = Float.NaN;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f24893graveside = Float.NaN;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f24885adultoid = 0;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public String f24890dovishness = null;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f24892gintrap = Float.NaN;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f24900rotuma = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: compiled from: KeyTimeCycle.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static SparseIntArray f24903attabal;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24903attabal = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.KeyTimeCycle_android_alpha, 1);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_elevation, 2);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_rotation, 4);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_rotationX, 5);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_rotationY, 6);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_scaleX, 7);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_transitionPathRotate, 8);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_transitionEasing, 9);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_motionTarget, 10);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_framePosition, 12);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_curveFit, 13);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_scaleY, 14);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_translationX, 15);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_translationY, 16);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_android_translationZ, 17);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_motionProgress, 18);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_wavePeriod, 20);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_waveOffset, 21);
            f24903attabal.append(sensatory.wireman.KeyTimeCycle_waveShape, 19);
        }

        public static void attabal(cutely cutelyVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f24903attabal.get(index)) {
                    case 1:
                        cutelyVar.f24901taiyuan = typedArray.getFloat(index, cutelyVar.f24901taiyuan);
                        break;
                    case 2:
                        cutelyVar.f24889cutely = typedArray.getDimension(index, cutelyVar.f24889cutely);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f24903attabal.get(index);
                        break;
                    case 4:
                        cutelyVar.f24886apical = typedArray.getFloat(index, cutelyVar.f24886apical);
                        break;
                    case 5:
                        cutelyVar.f24891formularize = typedArray.getFloat(index, cutelyVar.f24891formularize);
                        break;
                    case 6:
                        cutelyVar.f24894impassible = typedArray.getFloat(index, cutelyVar.f24894impassible);
                        break;
                    case 7:
                        cutelyVar.f24896kowloon = typedArray.getFloat(index, cutelyVar.f24896kowloon);
                        break;
                    case 8:
                        cutelyVar.f24902triweekly = typedArray.getFloat(index, cutelyVar.f24902triweekly);
                        break;
                    case 9:
                        cutelyVar.f24888competently = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f8430incorrectly) {
                            int resourceId = typedArray.getResourceId(index, cutelyVar.f25036saneness);
                            cutelyVar.f25036saneness = resourceId;
                            if (resourceId == -1) {
                                cutelyVar.f25034dern = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            cutelyVar.f25034dern = typedArray.getString(index);
                        } else {
                            cutelyVar.f25036saneness = typedArray.getResourceId(index, cutelyVar.f25036saneness);
                        }
                        break;
                    case 12:
                        cutelyVar.f25033attabal = typedArray.getInt(index, cutelyVar.f25033attabal);
                        break;
                    case 13:
                        cutelyVar.f24895impromptu = typedArray.getInteger(index, cutelyVar.f24895impromptu);
                        break;
                    case 14:
                        cutelyVar.f24887arytenoidectomy = typedArray.getFloat(index, cutelyVar.f24887arytenoidectomy);
                        break;
                    case 15:
                        cutelyVar.f24898monoploid = typedArray.getDimension(index, cutelyVar.f24898monoploid);
                        break;
                    case 16:
                        cutelyVar.f24899polloi = typedArray.getDimension(index, cutelyVar.f24899polloi);
                        break;
                    case 17:
                        cutelyVar.f24897molybdenite = typedArray.getDimension(index, cutelyVar.f24897molybdenite);
                        break;
                    case 18:
                        cutelyVar.f24893graveside = typedArray.getFloat(index, cutelyVar.f24893graveside);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            cutelyVar.f24890dovishness = typedArray.getString(index);
                            cutelyVar.f24885adultoid = 7;
                        } else {
                            cutelyVar.f24885adultoid = typedArray.getInt(index, cutelyVar.f24885adultoid);
                        }
                        break;
                    case 20:
                        cutelyVar.f24892gintrap = typedArray.getFloat(index, cutelyVar.f24892gintrap);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            cutelyVar.f24900rotuma = typedArray.getDimension(index, cutelyVar.f24900rotuma);
                        } else {
                            cutelyVar.f24900rotuma = typedArray.getFloat(index, cutelyVar.f24900rotuma);
                        }
                        break;
                }
            }
        }
    }

    public cutely() {
        this.f25037wireman = 3;
        this.f25035marial = new HashMap<>();
    }

    @Override // czestochowa.wireman
    public void attabal(HashMap<String, coi.wireman> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // czestochowa.wireman
    public wireman dern(wireman wiremanVar) {
        super.dern(wiremanVar);
        cutely cutelyVar = (cutely) wiremanVar;
        this.f24888competently = cutelyVar.f24888competently;
        this.f24895impromptu = cutelyVar.f24895impromptu;
        this.f24885adultoid = cutelyVar.f24885adultoid;
        this.f24892gintrap = cutelyVar.f24892gintrap;
        this.f24900rotuma = cutelyVar.f24900rotuma;
        this.f24893graveside = cutelyVar.f24893graveside;
        this.f24901taiyuan = cutelyVar.f24901taiyuan;
        this.f24889cutely = cutelyVar.f24889cutely;
        this.f24886apical = cutelyVar.f24886apical;
        this.f24902triweekly = cutelyVar.f24902triweekly;
        this.f24891formularize = cutelyVar.f24891formularize;
        this.f24894impassible = cutelyVar.f24894impassible;
        this.f24896kowloon = cutelyVar.f24896kowloon;
        this.f24887arytenoidectomy = cutelyVar.f24887arytenoidectomy;
        this.f24898monoploid = cutelyVar.f24898monoploid;
        this.f24899polloi = cutelyVar.f24899polloi;
        this.f24897molybdenite = cutelyVar.f24897molybdenite;
        this.f24890dovishness = cutelyVar.f24890dovishness;
        return this;
    }

    @Override // czestochowa.wireman
    public void impromptu(HashMap<String, Integer> map) {
        if (this.f24895impromptu == -1) {
            return;
        }
        if (!Float.isNaN(this.f24901taiyuan)) {
            map.put("alpha", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24889cutely)) {
            map.put("elevation", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24886apical)) {
            map.put("rotation", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24891formularize)) {
            map.put("rotationX", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24894impassible)) {
            map.put("rotationY", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24898monoploid)) {
            map.put("translationX", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24899polloi)) {
            map.put("translationY", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24897molybdenite)) {
            map.put("translationZ", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24902triweekly)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24896kowloon)) {
            map.put("scaleX", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24896kowloon)) {
            map.put("scaleY", Integer.valueOf(this.f24895impromptu));
        }
        if (!Float.isNaN(this.f24893graveside)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f24895impromptu));
        }
        if (this.f25035marial.size() > 0) {
            Iterator<String> it = this.f25035marial.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f24895impromptu));
            }
        }
    }

    @Override // czestochowa.wireman
    public void marial(Context context, AttributeSet attributeSet) {
        attabal.attabal(this, context.obtainStyledAttributes(attributeSet, sensatory.wireman.KeyTimeCycle));
    }

    public void mathsort(HashMap<String, coi.beachfront> map) {
        for (String str : map.keySet()) {
            coi.beachfront beachfrontVar = map.get(str);
            if (beachfrontVar != null) {
                if (!str.startsWith(j.f)) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f24891formularize)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24891formularize, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f24894impassible)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24894impassible, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f24898monoploid)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24898monoploid, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f24899polloi)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24899polloi, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f24897molybdenite)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24897molybdenite, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f24893graveside)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24893graveside, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f24896kowloon)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24896kowloon, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f24887arytenoidectomy)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24887arytenoidectomy, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f24886apical)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24886apical, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f24889cutely)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24889cutely, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f24902triweekly)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24902triweekly, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f24901taiyuan)) {
                                break;
                            } else {
                                beachfrontVar.saneness(this.f25033attabal, this.f24901taiyuan, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f25035marial.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((coi.beachfront.saneness) beachfrontVar).cutely(this.f25033attabal, constraintAttribute, this.f24892gintrap, this.f24885adultoid, this.f24900rotuma);
                    }
                }
            }
        }
    }

    @Override // czestochowa.wireman
    /* JADX INFO: renamed from: saneness */
    public wireman clone() {
        return new cutely().dern(this);
    }

    @Override // czestochowa.wireman
    public void wireman(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f24901taiyuan)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24889cutely)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24886apical)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24891formularize)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24894impassible)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24898monoploid)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24899polloi)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24897molybdenite)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f24902triweekly)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24896kowloon)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24887arytenoidectomy)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24893graveside)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.f25035marial.size() > 0) {
            Iterator<String> it = this.f25035marial.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }
}
