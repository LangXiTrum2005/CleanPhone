package coi;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.ironsource.mediationsdk.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class dern extends lerp.marial {

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class apical extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setTranslationX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class attabal extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setAlpha(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class beachfront extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setRotation(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class competently extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setRotationX(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class cutely extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setScaleY(attabal(f));
        }
    }

    /* JADX INFO: renamed from: coi.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class C0145dern extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setElevation(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class formularize extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setTranslationY(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class impassible extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setTranslationZ(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class impromptu extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setRotationY(attabal(f));
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class marial extends dern {

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f15769impromptu = false;

        @Override // coi.dern
        public void cutely(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(attabal(f));
                return;
            }
            if (this.f15769impromptu) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f15769impromptu = true;
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

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class saneness extends dern {

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float[] f15770impromptu = new float[1];

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public ConstraintAttribute f15771taiyuan;

        @Override // coi.dern
        public void cutely(View view, float f) {
            this.f15770impromptu[0] = attabal(f);
            coi.attabal.saneness(this.f15771taiyuan, view, this.f15770impromptu);
        }

        @Override // lerp.marial
        public void dern(Object obj) {
            this.f15771taiyuan = (ConstraintAttribute) obj;
        }
    }

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class taiyuan extends dern {
        @Override // coi.dern
        public void cutely(View view, float f) {
            view.setScaleX(attabal(f));
        }
    }

    public static dern taiyuan(String str) {
        if (str.startsWith(j.f)) {
            return new saneness();
        }
        switch (str) {
            case "rotationX":
                return new competently();
            case "rotationY":
                return new impromptu();
            case "translationX":
                return new apical();
            case "translationY":
                return new formularize();
            case "translationZ":
                return new impassible();
            case "progress":
                return new marial();
            case "scaleX":
                return new taiyuan();
            case "scaleY":
                return new cutely();
            case "waveVariesBy":
                return new attabal();
            case "rotation":
                return new beachfront();
            case "elevation":
                return new C0145dern();
            case "transitionPathRotate":
                return new wireman();
            case "alpha":
                return new attabal();
            case "waveOffset":
                return new attabal();
            default:
                return null;
        }
    }

    public abstract void cutely(View view, float f);

    /* JADX INFO: compiled from: ViewOscillator.java */
    public static class wireman extends dern {
        public void apical(View view, float f, double d, double d2) {
            view.setRotation(attabal(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // coi.dern
        public void cutely(View view, float f) {
        }
    }
}
