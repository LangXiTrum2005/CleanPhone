package coi;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewSpline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class wireman extends lerp.cutely {

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class apical extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setScaleX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class attabal extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setAlpha(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class beachfront extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setPivotY(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class competently extends wireman {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f15780beachfront = false;

        @Override // coi.wireman
        public void impromptu(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(attabal(f));
                return;
            }
            if (this.f15780beachfront) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f15780beachfront = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(attabal(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class cutely extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setRotationY(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class dern extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setElevation(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class formularize extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setScaleY(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class impassible extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setTranslationX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class impromptu extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setRotation(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class kowloon extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setTranslationZ(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class marial extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setPivotX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class saneness extends wireman {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f15781beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f15782competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float[] f15783impromptu;

        public saneness(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f15781beachfront = str.split(",")[1];
            this.f15782competently = sparseArray;
        }

        @Override // lerp.cutely
        public void dern(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // coi.wireman
        public void impromptu(View view, float f) {
            this.f32789attabal.marial(f, this.f15783impromptu);
            coi.attabal.saneness(this.f15782competently.valueAt(0), view, this.f15783impromptu);
        }

        @Override // lerp.cutely
        public void marial(int i) {
            int size = this.f15782competently.size();
            int iImpromptu = this.f15782competently.valueAt(0).impromptu();
            double[] dArr = new double[size];
            this.f15783impromptu = new float[iImpromptu];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iImpromptu);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f15782competently.keyAt(i2);
                ConstraintAttribute constraintAttributeValueAt = this.f15782competently.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.beachfront(this.f15783impromptu);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f15783impromptu;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f32789attabal = lerp.saneness.attabal(i, dArr, dArr2);
        }

        public void taiyuan(int i, ConstraintAttribute constraintAttribute) {
            this.f15782competently.append(i, constraintAttribute);
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class taiyuan extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setRotationX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class triweekly extends wireman {
        @Override // coi.wireman
        public void impromptu(View view, float f) {
            view.setTranslationY(attabal(f));
        }
    }

    public static wireman beachfront(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new saneness(str, sparseArray);
    }

    public static wireman competently(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return new taiyuan();
            case "rotationY":
                return new cutely();
            case "translationX":
                return new impassible();
            case "translationY":
                return new triweekly();
            case "translationZ":
                return new kowloon();
            case "progress":
                return new competently();
            case "scaleX":
                return new apical();
            case "scaleY":
                return new formularize();
            case "waveVariesBy":
                return new attabal();
            case "transformPivotX":
                return new marial();
            case "transformPivotY":
                return new beachfront();
            case "rotation":
                return new impromptu();
            case "elevation":
                return new dern();
            case "transitionPathRotate":
                return new C0146wireman();
            case "alpha":
                return new attabal();
            case "waveOffset":
                return new attabal();
            default:
                return null;
        }
    }

    public abstract void impromptu(View view, float f);

    /* JADX INFO: renamed from: coi.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewSpline.java */
    public static class C0146wireman extends wireman {
        public void taiyuan(View view, float f, double d, double d2) {
            view.setRotation(attabal(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // coi.wireman
        public void impromptu(View view, float f) {
        }
    }
}
