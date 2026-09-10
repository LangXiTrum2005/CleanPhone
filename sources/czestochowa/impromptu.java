package czestochowa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: compiled from: KeyPosition.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu extends taiyuan {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public String f24978impromptu = null;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f24983taiyuan = wireman.f25032beachfront;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f24975cutely = 0;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f24973apical = Float.NaN;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public float f24976formularize = Float.NaN;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f24977impassible = Float.NaN;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f24984triweekly = Float.NaN;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f24979kowloon = Float.NaN;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f24974arytenoidectomy = Float.NaN;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f24981monoploid = 0;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f24982polloi = Float.NaN;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f24980molybdenite = Float.NaN;

    /* JADX INFO: compiled from: KeyPosition.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static SparseIntArray f24985attabal;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24985attabal = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.KeyPosition_motionTarget, 1);
            f24985attabal.append(sensatory.wireman.KeyPosition_framePosition, 2);
            f24985attabal.append(sensatory.wireman.KeyPosition_transitionEasing, 3);
            f24985attabal.append(sensatory.wireman.KeyPosition_curveFit, 4);
            f24985attabal.append(sensatory.wireman.KeyPosition_drawPath, 5);
            f24985attabal.append(sensatory.wireman.KeyPosition_percentX, 6);
            f24985attabal.append(sensatory.wireman.KeyPosition_percentY, 7);
            f24985attabal.append(sensatory.wireman.KeyPosition_keyPositionType, 9);
            f24985attabal.append(sensatory.wireman.KeyPosition_sizePercent, 8);
            f24985attabal.append(sensatory.wireman.KeyPosition_percentWidth, 11);
            f24985attabal.append(sensatory.wireman.KeyPosition_percentHeight, 12);
            f24985attabal.append(sensatory.wireman.KeyPosition_pathMotionArc, 10);
        }

        public static void saneness(impromptu impromptuVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f24985attabal.get(index)) {
                    case 1:
                        if (MotionLayout.f8430incorrectly) {
                            int resourceId = typedArray.getResourceId(index, impromptuVar.f25036saneness);
                            impromptuVar.f25036saneness = resourceId;
                            if (resourceId == -1) {
                                impromptuVar.f25034dern = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            impromptuVar.f25034dern = typedArray.getString(index);
                        } else {
                            impromptuVar.f25036saneness = typedArray.getResourceId(index, impromptuVar.f25036saneness);
                        }
                        break;
                    case 2:
                        impromptuVar.f25033attabal = typedArray.getInt(index, impromptuVar.f25033attabal);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            impromptuVar.f24978impromptu = typedArray.getString(index);
                        } else {
                            impromptuVar.f24978impromptu = lerp.dern.f32794dern[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        impromptuVar.f25031competently = typedArray.getInteger(index, impromptuVar.f25031competently);
                        break;
                    case 5:
                        impromptuVar.f24975cutely = typedArray.getInt(index, impromptuVar.f24975cutely);
                        break;
                    case 6:
                        impromptuVar.f24977impassible = typedArray.getFloat(index, impromptuVar.f24977impassible);
                        break;
                    case 7:
                        impromptuVar.f24984triweekly = typedArray.getFloat(index, impromptuVar.f24984triweekly);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, impromptuVar.f24976formularize);
                        impromptuVar.f24973apical = f;
                        impromptuVar.f24976formularize = f;
                        break;
                    case 9:
                        impromptuVar.f24981monoploid = typedArray.getInt(index, impromptuVar.f24981monoploid);
                        break;
                    case 10:
                        impromptuVar.f24983taiyuan = typedArray.getInt(index, impromptuVar.f24983taiyuan);
                        break;
                    case 11:
                        impromptuVar.f24973apical = typedArray.getFloat(index, impromptuVar.f24973apical);
                        break;
                    case 12:
                        impromptuVar.f24976formularize = typedArray.getFloat(index, impromptuVar.f24976formularize);
                        break;
                    default:
                        Integer.toHexString(index);
                        f24985attabal.get(index);
                        break;
                }
            }
            int i2 = impromptuVar.f25033attabal;
        }
    }

    public impromptu() {
        this.f25037wireman = 2;
    }

    @Override // czestochowa.wireman
    public wireman dern(wireman wiremanVar) {
        super.dern(wiremanVar);
        impromptu impromptuVar = (impromptu) wiremanVar;
        this.f24978impromptu = impromptuVar.f24978impromptu;
        this.f24983taiyuan = impromptuVar.f24983taiyuan;
        this.f24975cutely = impromptuVar.f24975cutely;
        this.f24973apical = impromptuVar.f24973apical;
        this.f24976formularize = Float.NaN;
        this.f24977impassible = impromptuVar.f24977impassible;
        this.f24984triweekly = impromptuVar.f24984triweekly;
        this.f24979kowloon = impromptuVar.f24979kowloon;
        this.f24974arytenoidectomy = impromptuVar.f24974arytenoidectomy;
        this.f24982polloi = impromptuVar.f24982polloi;
        this.f24980molybdenite = impromptuVar.f24980molybdenite;
        return this;
    }

    public void impassible(int i) {
        this.f24981monoploid = i;
    }

    @Override // czestochowa.wireman
    public void marial(Context context, AttributeSet attributeSet) {
        attabal.saneness(this, context.obtainStyledAttributes(attributeSet, sensatory.wireman.KeyPosition));
    }

    @Override // czestochowa.wireman
    /* JADX INFO: renamed from: saneness */
    public wireman clone() {
        return new impromptu().dern(this);
    }

    public void triweekly(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f24978impromptu = obj.toString();
                break;
            case "percentWidth":
                this.f24973apical = apical(obj);
                break;
            case "percentHeight":
                this.f24976formularize = apical(obj);
                break;
            case "drawPath":
                this.f24975cutely = formularize(obj);
                break;
            case "sizePercent":
                float fApical = apical(obj);
                this.f24973apical = fApical;
                this.f24976formularize = fApical;
                break;
            case "percentX":
                this.f24977impassible = apical(obj);
                break;
            case "percentY":
                this.f24984triweekly = apical(obj);
                break;
        }
    }

    @Override // czestochowa.wireman
    public void attabal(HashMap<String, coi.wireman> map) {
    }
}
