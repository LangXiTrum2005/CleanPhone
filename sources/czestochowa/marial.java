package czestochowa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: compiled from: KeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends wireman {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public String f25009competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f25016impromptu = -1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f25021taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f25010cutely = Float.NaN;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f25007apical = Float.NaN;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f25012formularize = Float.NaN;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f25015impassible = Float.NaN;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f25022triweekly = Float.NaN;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f25017kowloon = Float.NaN;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f25008arytenoidectomy = Float.NaN;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public float f25019monoploid = Float.NaN;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f25020polloi = Float.NaN;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f25018molybdenite = Float.NaN;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f25014graveside = Float.NaN;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f25006adultoid = Float.NaN;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f25011dovishness = Float.NaN;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public float f25013gintrap = Float.NaN;

    /* JADX INFO: compiled from: KeyAttributes.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static SparseIntArray f25023attabal;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f25023attabal = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.KeyAttribute_android_alpha, 1);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_elevation, 2);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_rotation, 4);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_rotationX, 5);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_rotationY, 6);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_transformPivotX, 19);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_transformPivotY, 20);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_scaleX, 7);
            f25023attabal.append(sensatory.wireman.KeyAttribute_transitionPathRotate, 8);
            f25023attabal.append(sensatory.wireman.KeyAttribute_transitionEasing, 9);
            f25023attabal.append(sensatory.wireman.KeyAttribute_motionTarget, 10);
            f25023attabal.append(sensatory.wireman.KeyAttribute_framePosition, 12);
            f25023attabal.append(sensatory.wireman.KeyAttribute_curveFit, 13);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_scaleY, 14);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_translationX, 15);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_translationY, 16);
            f25023attabal.append(sensatory.wireman.KeyAttribute_android_translationZ, 17);
            f25023attabal.append(sensatory.wireman.KeyAttribute_motionProgress, 18);
        }

        public static void attabal(marial marialVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f25023attabal.get(index)) {
                    case 1:
                        marialVar.f25010cutely = typedArray.getFloat(index, marialVar.f25010cutely);
                        break;
                    case 2:
                        marialVar.f25007apical = typedArray.getDimension(index, marialVar.f25007apical);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        f25023attabal.get(index);
                        break;
                    case 4:
                        marialVar.f25012formularize = typedArray.getFloat(index, marialVar.f25012formularize);
                        break;
                    case 5:
                        marialVar.f25015impassible = typedArray.getFloat(index, marialVar.f25015impassible);
                        break;
                    case 6:
                        marialVar.f25022triweekly = typedArray.getFloat(index, marialVar.f25022triweekly);
                        break;
                    case 7:
                        marialVar.f25020polloi = typedArray.getFloat(index, marialVar.f25020polloi);
                        break;
                    case 8:
                        marialVar.f25019monoploid = typedArray.getFloat(index, marialVar.f25019monoploid);
                        break;
                    case 9:
                        marialVar.f25009competently = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f8430incorrectly) {
                            int resourceId = typedArray.getResourceId(index, marialVar.f25036saneness);
                            marialVar.f25036saneness = resourceId;
                            if (resourceId == -1) {
                                marialVar.f25034dern = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            marialVar.f25034dern = typedArray.getString(index);
                        } else {
                            marialVar.f25036saneness = typedArray.getResourceId(index, marialVar.f25036saneness);
                        }
                        break;
                    case 12:
                        marialVar.f25033attabal = typedArray.getInt(index, marialVar.f25033attabal);
                        break;
                    case 13:
                        marialVar.f25016impromptu = typedArray.getInteger(index, marialVar.f25016impromptu);
                        break;
                    case 14:
                        marialVar.f25018molybdenite = typedArray.getFloat(index, marialVar.f25018molybdenite);
                        break;
                    case 15:
                        marialVar.f25014graveside = typedArray.getDimension(index, marialVar.f25014graveside);
                        break;
                    case 16:
                        marialVar.f25006adultoid = typedArray.getDimension(index, marialVar.f25006adultoid);
                        break;
                    case 17:
                        marialVar.f25011dovishness = typedArray.getDimension(index, marialVar.f25011dovishness);
                        break;
                    case 18:
                        marialVar.f25013gintrap = typedArray.getFloat(index, marialVar.f25013gintrap);
                        break;
                    case 19:
                        marialVar.f25017kowloon = typedArray.getDimension(index, marialVar.f25017kowloon);
                        break;
                    case 20:
                        marialVar.f25008arytenoidectomy = typedArray.getDimension(index, marialVar.f25008arytenoidectomy);
                        break;
                }
            }
        }
    }

    public marial() {
        this.f25037wireman = 1;
        this.f25035marial = new HashMap<>();
    }

    @Override // czestochowa.wireman
    public void attabal(HashMap<String, coi.wireman> map) {
        for (String str : map.keySet()) {
            coi.wireman wiremanVar = map.get(str);
            if (wiremanVar != null) {
                if (!str.startsWith(j.f)) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f25015impassible)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25015impassible);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f25022triweekly)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25022triweekly);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f25014graveside)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25014graveside);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f25006adultoid)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25006adultoid);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f25011dovishness)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25011dovishness);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f25013gintrap)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25013gintrap);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f25020polloi)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25020polloi);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f25018molybdenite)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25018molybdenite);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f25015impassible)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25017kowloon);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f25022triweekly)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25008arytenoidectomy);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f25012formularize)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25012formularize);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f25007apical)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25007apical);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f25019monoploid)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25019monoploid);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f25010cutely)) {
                                break;
                            } else {
                                wiremanVar.dern(this.f25033attabal, this.f25010cutely);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f25035marial.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((coi.wireman.saneness) wiremanVar).taiyuan(this.f25033attabal, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // czestochowa.wireman
    public wireman dern(wireman wiremanVar) {
        super.dern(wiremanVar);
        marial marialVar = (marial) wiremanVar;
        this.f25016impromptu = marialVar.f25016impromptu;
        this.f25021taiyuan = marialVar.f25021taiyuan;
        this.f25010cutely = marialVar.f25010cutely;
        this.f25007apical = marialVar.f25007apical;
        this.f25012formularize = marialVar.f25012formularize;
        this.f25015impassible = marialVar.f25015impassible;
        this.f25022triweekly = marialVar.f25022triweekly;
        this.f25017kowloon = marialVar.f25017kowloon;
        this.f25008arytenoidectomy = marialVar.f25008arytenoidectomy;
        this.f25019monoploid = marialVar.f25019monoploid;
        this.f25020polloi = marialVar.f25020polloi;
        this.f25018molybdenite = marialVar.f25018molybdenite;
        this.f25014graveside = marialVar.f25014graveside;
        this.f25006adultoid = marialVar.f25006adultoid;
        this.f25011dovishness = marialVar.f25011dovishness;
        this.f25013gintrap = marialVar.f25013gintrap;
        this.f25009competently = marialVar.f25009competently;
        return this;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void hydrovane(String str, Object obj) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b = 14;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f25013gintrap = apical(obj);
                break;
            case 1:
                this.f25009competently = obj.toString();
                break;
            case 2:
                this.f25015impassible = apical(obj);
                break;
            case 3:
                this.f25022triweekly = apical(obj);
                break;
            case 4:
                this.f25014graveside = apical(obj);
                break;
            case 5:
                this.f25006adultoid = apical(obj);
                break;
            case 6:
                this.f25011dovishness = apical(obj);
                break;
            case 7:
                this.f25020polloi = apical(obj);
                break;
            case 8:
                this.f25018molybdenite = apical(obj);
                break;
            case 9:
                this.f25017kowloon = apical(obj);
                break;
            case 10:
                this.f25008arytenoidectomy = apical(obj);
                break;
            case 11:
                this.f25012formularize = apical(obj);
                break;
            case 12:
                this.f25007apical = apical(obj);
                break;
            case 13:
                this.f25019monoploid = apical(obj);
                break;
            case 14:
                this.f25010cutely = apical(obj);
                break;
            case 15:
                this.f25016impromptu = formularize(obj);
                break;
            case 16:
                this.f25021taiyuan = cutely(obj);
                break;
        }
    }

    @Override // czestochowa.wireman
    public void impromptu(HashMap<String, Integer> map) {
        if (this.f25016impromptu == -1) {
            return;
        }
        if (!Float.isNaN(this.f25010cutely)) {
            map.put("alpha", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25007apical)) {
            map.put("elevation", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25012formularize)) {
            map.put("rotation", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25015impassible)) {
            map.put("rotationX", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25022triweekly)) {
            map.put("rotationY", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25017kowloon)) {
            map.put("transformPivotX", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25008arytenoidectomy)) {
            map.put("transformPivotY", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25014graveside)) {
            map.put("translationX", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25006adultoid)) {
            map.put("translationY", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25011dovishness)) {
            map.put("translationZ", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25019monoploid)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25020polloi)) {
            map.put("scaleX", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25018molybdenite)) {
            map.put("scaleY", Integer.valueOf(this.f25016impromptu));
        }
        if (!Float.isNaN(this.f25013gintrap)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f25016impromptu));
        }
        if (this.f25035marial.size() > 0) {
            Iterator<String> it = this.f25035marial.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f25016impromptu));
            }
        }
    }

    @Override // czestochowa.wireman
    public void marial(Context context, AttributeSet attributeSet) {
        attabal.attabal(this, context.obtainStyledAttributes(attributeSet, sensatory.wireman.KeyAttribute));
    }

    @Override // czestochowa.wireman
    /* JADX INFO: renamed from: saneness */
    public wireman clone() {
        return new marial().dern(this);
    }

    @Override // czestochowa.wireman
    public void wireman(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f25010cutely)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f25007apical)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f25012formularize)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f25015impassible)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f25022triweekly)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f25017kowloon)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f25008arytenoidectomy)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f25014graveside)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f25006adultoid)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f25011dovishness)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f25019monoploid)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f25020polloi)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f25018molybdenite)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f25013gintrap)) {
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
