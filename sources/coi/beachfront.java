package coi;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import lerp.kowloon;

/* JADX INFO: compiled from: ViewTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class beachfront extends kowloon {

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class apical extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setTranslationX(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class attabal extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setAlpha(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: renamed from: coi.beachfront$beachfront, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class C0144beachfront extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setRotation(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class competently extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setRotationX(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class cutely extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setScaleY(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class dern extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setElevation(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class formularize extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setTranslationY(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class impassible extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setTranslationZ(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class impromptu extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setRotationY(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class marial extends beachfront {

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public boolean f15764formularize = false;

        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            marial marialVar;
            Method method;
            if (view instanceof MotionLayout) {
                marialVar = this;
                ((MotionLayout) view).setProgress(marialVar.beachfront(f, j, view, wiremanVar));
            } else {
                marialVar = this;
                if (marialVar.f15764formularize) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    marialVar.f15764formularize = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(marialVar.beachfront(f, j, view, wiremanVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return marialVar.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class saneness extends beachfront {

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public String f15765formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f15766impassible;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public float[] f15767kowloon;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public SparseArray<float[]> f15768triweekly = new SparseArray<>();

        public saneness(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f15765formularize = str.split(",")[1];
            this.f15766impassible = sparseArray;
        }

        public void cutely(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.f15766impassible.append(i, constraintAttribute);
            this.f15768triweekly.append(i, new float[]{f, f2});
            this.f32820saneness = Math.max(this.f32820saneness, i2);
        }

        @Override // lerp.kowloon
        public void marial(int i) {
            int size = this.f15766impassible.size();
            int iImpromptu = this.f15766impassible.valueAt(0).impromptu();
            double[] dArr = new double[size];
            int i2 = iImpromptu + 2;
            this.f15767kowloon = new float[i2];
            this.f32815competently = new float[iImpromptu];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f15766impassible.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.f15766impassible.valueAt(i3);
                float[] fArrValueAt = this.f15768triweekly.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.beachfront(this.f15767kowloon);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f15767kowloon;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iImpromptu] = fArrValueAt[0];
                dArr3[iImpromptu + 1] = fArrValueAt[1];
            }
            this.f32813attabal = lerp.saneness.attabal(i, dArr, dArr2);
        }

        @Override // lerp.kowloon
        public void saneness(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            this.f32813attabal.marial(f, this.f15767kowloon);
            float[] fArr = this.f15767kowloon;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f32821taiyuan;
            if (Float.isNaN(this.f32816cutely)) {
                float fAttabal = wiremanVar.attabal(view, this.f15765formularize, 0);
                this.f32816cutely = fAttabal;
                if (Float.isNaN(fAttabal)) {
                    this.f32816cutely = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            float f4 = (float) ((((double) this.f32816cutely) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f32816cutely = f4;
            this.f32821taiyuan = j;
            float fAttabal2 = attabal(f4);
            this.f32818impromptu = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f32815competently;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f32818impromptu;
                float f5 = this.f15767kowloon[i];
                this.f32818impromptu = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fAttabal2) + f3;
                i++;
            }
            coi.attabal.saneness(this.f15766impassible.valueAt(0), view, this.f32815competently);
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f32818impromptu = true;
            }
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class taiyuan extends beachfront {
        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            view.setScaleX(beachfront(f, j, view, wiremanVar));
            return this.f32818impromptu;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class wireman extends beachfront {
        public boolean cutely(View view, lerp.wireman wiremanVar, float f, long j, double d, double d2) {
            view.setRotation(beachfront(f, j, view, wiremanVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f32818impromptu;
        }

        @Override // coi.beachfront
        public boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar) {
            return this.f32818impromptu;
        }
    }

    public static beachfront competently(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new saneness(str, sparseArray);
    }

    public static beachfront impromptu(String str, long j) {
        beachfront competentlyVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                competentlyVar = new competently();
                break;
            case "rotationY":
                competentlyVar = new impromptu();
                break;
            case "translationX":
                competentlyVar = new apical();
                break;
            case "translationY":
                competentlyVar = new formularize();
                break;
            case "translationZ":
                competentlyVar = new impassible();
                break;
            case "progress":
                competentlyVar = new marial();
                break;
            case "scaleX":
                competentlyVar = new taiyuan();
                break;
            case "scaleY":
                competentlyVar = new cutely();
                break;
            case "rotation":
                competentlyVar = new C0144beachfront();
                break;
            case "elevation":
                competentlyVar = new dern();
                break;
            case "transitionPathRotate":
                competentlyVar = new wireman();
                break;
            case "alpha":
                competentlyVar = new attabal();
                break;
            default:
                return null;
        }
        competentlyVar.dern(j);
        return competentlyVar;
    }

    public float beachfront(float f, long j, View view, lerp.wireman wiremanVar) {
        this.f32813attabal.marial(f, this.f32815competently);
        float[] fArr = this.f32815competently;
        float f2 = fArr[1];
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f32818impromptu = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f32816cutely)) {
            float fAttabal = wiremanVar.attabal(view, this.f32814beachfront, 0);
            this.f32816cutely = fAttabal;
            if (Float.isNaN(fAttabal)) {
                this.f32816cutely = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        float f3 = (float) ((((double) this.f32816cutely) + (((j - this.f32821taiyuan) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f32816cutely = f3;
        wiremanVar.saneness(view, this.f32814beachfront, 0, f3);
        this.f32821taiyuan = j;
        float f4 = this.f32815competently[0];
        float fAttabal2 = (attabal(this.f32816cutely) * f4) + this.f32815competently[2];
        this.f32818impromptu = (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
        return fAttabal2;
    }

    public abstract boolean taiyuan(View view, float f, long j, lerp.wireman wiremanVar);
}
