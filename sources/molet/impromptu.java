package molet;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import molet.impromptu;

/* JADX INFO: compiled from: DynamicAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class impromptu<T extends impromptu<T>> implements molet.dern.InterfaceC0731dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final ArrayList<monoploid> f33548apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f33549attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f33550beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f33551competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f33552cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f33553dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final ArrayList<polloi> f33554formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public molet.dern f33555impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f33556impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final molet.taiyuan f33557marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float f33558saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f33559taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Object f33560wireman;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final molybdenite f33547triweekly = new competently("translationX");

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final molybdenite f33541kowloon = new C0732impromptu("translationY");

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final molybdenite f33535arytenoidectomy = new taiyuan("translationZ");

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final molybdenite f33543monoploid = new cutely("scaleX");

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final molybdenite f33544polloi = new apical("scaleY");

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final molybdenite f33542molybdenite = new formularize("rotation");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final molybdenite f33540graveside = new impassible("rotationX");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final molybdenite f33534adultoid = new triweekly("rotationY");

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final molybdenite f33538dovishness = new kowloon("x");

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final molybdenite f33539gintrap = new attabal("y");

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final molybdenite f33546rotuma = new saneness("z");

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final molybdenite f33545preprohormone = new dern("alpha");

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final molybdenite f33536cord = new wireman("scrollX");

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final molybdenite f33537cuirassed = new marial("scrollY");

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class apical extends molybdenite {
        public apical(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getScaleY();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static class arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f33561attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f33562saneness;
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class attabal extends molybdenite {
        public attabal(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getY();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class beachfront extends molet.taiyuan {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ molet.cutely f33564saneness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public beachfront(String str, molet.cutely cutelyVar) {
            super(str);
            this.f33564saneness = cutelyVar;
        }

        @Override // molet.taiyuan
        public float attabal(Object obj) {
            return this.f33564saneness.attabal();
        }

        @Override // molet.taiyuan
        public void saneness(Object obj, float f) {
            this.f33564saneness.saneness(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class competently extends molybdenite {
        public competently(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getTranslationX();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class cutely extends molybdenite {
        public cutely(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getScaleX();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class dern extends molybdenite {
        public dern(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getAlpha();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class formularize extends molybdenite {
        public formularize(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getRotation();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setRotation(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class impassible extends molybdenite {
        public impassible(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getRotationX();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: molet.impromptu$impromptu, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class C0732impromptu extends molybdenite {
        public C0732impromptu(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getTranslationY();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class kowloon extends molybdenite {
        public kowloon(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getX();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class marial extends molybdenite {
        public marial(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getScrollY();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public static abstract class molybdenite extends molet.taiyuan<View> {
        public /* synthetic */ molybdenite(String str, competently competentlyVar) {
            this(str);
        }

        public molybdenite(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface monoploid {
        void attabal(impromptu impromptuVar, boolean z, float f, float f2);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public interface polloi {
        void taiyuan(impromptu impromptuVar, float f, float f2);
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class saneness extends molybdenite {
        public saneness(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return premeiotic.grimness(view);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            premeiotic.hardpan(view, f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class taiyuan extends molybdenite {
        public taiyuan(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return premeiotic.merc(view);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            premeiotic.unconsolidated(view, f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class triweekly extends molybdenite {
        public triweekly(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getRotationY();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* JADX INFO: compiled from: DynamicAnimation.java */
    public class wireman extends molybdenite {
        public wireman(String str) {
            super(str, null);
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public float attabal(View view) {
            return view.getScrollX();
        }

        @Override // molet.taiyuan
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public void saneness(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    public impromptu(molet.cutely cutelyVar) {
        this.f33549attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33558saneness = Float.MAX_VALUE;
        this.f33553dern = false;
        this.f33550beachfront = false;
        this.f33551competently = Float.MAX_VALUE;
        this.f33556impromptu = -Float.MAX_VALUE;
        this.f33559taiyuan = 0L;
        this.f33548apical = new ArrayList<>();
        this.f33554formularize = new ArrayList<>();
        this.f33560wireman = null;
        this.f33557marial = new beachfront("FloatValueHolder", cutelyVar);
        this.f33552cutely = 1.0f;
    }

    public static <T> void taiyuan(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T apical(float f) {
        this.f33556impromptu = f;
        return this;
    }

    public abstract void arytenoidectomy(float f);

    @Override // molet.dern.InterfaceC0731dern
    public boolean attabal(long j) {
        long j2 = this.f33559taiyuan;
        if (j2 == 0) {
            this.f33559taiyuan = j;
            impassible(this.f33558saneness);
            return false;
        }
        long j3 = j - j2;
        this.f33559taiyuan = j;
        float fCompetently = marial().competently();
        boolean zMolybdenite = molybdenite(fCompetently == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2147483647L : (long) (j3 / fCompetently));
        float fMin = Math.min(this.f33558saneness, this.f33551competently);
        this.f33558saneness = fMin;
        float fMax = Math.max(fMin, this.f33556impromptu);
        this.f33558saneness = fMax;
        impassible(fMax);
        if (zMolybdenite) {
            wireman(false);
        }
        return zMolybdenite;
    }

    public final float beachfront() {
        return this.f33557marial.attabal(this.f33560wireman);
    }

    public float competently() {
        return this.f33552cutely * 0.75f;
    }

    public T cutely(float f) {
        this.f33551competently = f;
        return this;
    }

    public T dern(polloi polloiVar) {
        if (impromptu()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f33554formularize.contains(polloiVar)) {
            this.f33554formularize.add(polloiVar);
        }
        return this;
    }

    public T formularize(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f33552cutely = f;
        arytenoidectomy(f * 0.75f);
        return this;
    }

    public void impassible(float f) {
        this.f33557marial.saneness(this.f33560wireman, f);
        for (int i = 0; i < this.f33554formularize.size(); i++) {
            if (this.f33554formularize.get(i) != null) {
                this.f33554formularize.get(i).taiyuan(this, this.f33558saneness, this.f33549attabal);
            }
        }
        taiyuan(this.f33554formularize);
    }

    public boolean impromptu() {
        return this.f33550beachfront;
    }

    public T kowloon(float f) {
        this.f33549attabal = f;
        return this;
    }

    public molet.dern marial() {
        molet.dern dernVar = this.f33555impassible;
        return dernVar != null ? dernVar : molet.dern.impromptu();
    }

    public abstract boolean molybdenite(long j);

    public void monoploid() {
        if (!marial().cutely()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f33550beachfront) {
            return;
        }
        polloi();
    }

    public final void polloi() {
        if (this.f33550beachfront) {
            return;
        }
        this.f33550beachfront = true;
        if (!this.f33553dern) {
            this.f33558saneness = beachfront();
        }
        float f = this.f33558saneness;
        if (f > this.f33551competently || f < this.f33556impromptu) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        marial().wireman(this, 0L);
    }

    public T saneness(monoploid monoploidVar) {
        if (!this.f33548apical.contains(monoploidVar)) {
            this.f33548apical.add(monoploidVar);
        }
        return this;
    }

    public T triweekly(float f) {
        this.f33558saneness = f;
        this.f33553dern = true;
        return this;
    }

    public final void wireman(boolean z) {
        this.f33550beachfront = false;
        marial().apical(this);
        this.f33559taiyuan = 0L;
        this.f33553dern = false;
        for (int i = 0; i < this.f33548apical.size(); i++) {
            if (this.f33548apical.get(i) != null) {
                this.f33548apical.get(i).attabal(this, z, this.f33558saneness, this.f33549attabal);
            }
        }
        taiyuan(this.f33548apical);
    }

    public <K> impromptu(K k, molet.taiyuan<K> taiyuanVar) {
        this.f33549attabal = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f33558saneness = Float.MAX_VALUE;
        this.f33553dern = false;
        this.f33550beachfront = false;
        this.f33551competently = Float.MAX_VALUE;
        this.f33556impromptu = -Float.MAX_VALUE;
        this.f33559taiyuan = 0L;
        this.f33548apical = new ArrayList<>();
        this.f33554formularize = new ArrayList<>();
        this.f33560wireman = k;
        this.f33557marial = taiyuanVar;
        if (taiyuanVar != f33542molybdenite && taiyuanVar != f33540graveside && taiyuanVar != f33534adultoid) {
            if (taiyuanVar == f33545preprohormone) {
                this.f33552cutely = 0.00390625f;
                return;
            } else if (taiyuanVar != f33543monoploid && taiyuanVar != f33544polloi) {
                this.f33552cutely = 1.0f;
                return;
            } else {
                this.f33552cutely = 0.002f;
                return;
            }
        }
        this.f33552cutely = 0.1f;
    }
}
