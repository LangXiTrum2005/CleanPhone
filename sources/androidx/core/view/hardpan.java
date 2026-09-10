package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class hardpan {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hardpan f9308saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impassible f9309attabal;

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class apical extends cutely {

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public static final hardpan f9310polloi = hardpan.preprohormone(WindowInsets.CONSUMED);

        public apical(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar, windowInsets);
        }

        @Override // androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public monroe.wireman competently(int i) {
            return monroe.wireman.marial(this.f9321dern.getInsets(kowloon.attabal(i)));
        }

        @Override // androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public monroe.wireman impromptu(int i) {
            return monroe.wireman.marial(this.f9321dern.getInsetsIgnoringVisibility(kowloon.attabal(i)));
        }

        public apical(hardpan hardpanVar, apical apicalVar) {
            super(hardpanVar, apicalVar);
        }

        @Override // androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public final void wireman(View view) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class arytenoidectomy {
        public static int attabal(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hardpan f9312attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public monroe.wireman[] f9313saneness;

        public beachfront() {
            this(new hardpan((hardpan) null));
        }

        public final void attabal() {
            monroe.wireman[] wiremanVarArr = this.f9313saneness;
            if (wiremanVarArr != null) {
                monroe.wireman wiremanVarBeachfront = wiremanVarArr[triweekly.dern(1)];
                monroe.wireman wiremanVarBeachfront2 = this.f9313saneness[triweekly.dern(2)];
                if (wiremanVarBeachfront2 == null) {
                    wiremanVarBeachfront2 = this.f9312attabal.beachfront(2);
                }
                if (wiremanVarBeachfront == null) {
                    wiremanVarBeachfront = this.f9312attabal.beachfront(1);
                }
                competently(monroe.wireman.attabal(wiremanVarBeachfront, wiremanVarBeachfront2));
                monroe.wireman wiremanVar = this.f9313saneness[triweekly.dern(16)];
                if (wiremanVar != null) {
                    beachfront(wiremanVar);
                }
                monroe.wireman wiremanVar2 = this.f9313saneness[triweekly.dern(32)];
                if (wiremanVar2 != null) {
                    wireman(wiremanVar2);
                }
                monroe.wireman wiremanVar3 = this.f9313saneness[triweekly.dern(64)];
                if (wiremanVar3 != null) {
                    impromptu(wiremanVar3);
                }
            }
        }

        public void competently(monroe.wireman wiremanVar) {
            throw null;
        }

        public void dern(int i, monroe.wireman wiremanVar) {
            if (this.f9313saneness == null) {
                this.f9313saneness = new monroe.wireman[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f9313saneness[triweekly.dern(i2)] = wiremanVar;
                }
            }
        }

        public void marial(monroe.wireman wiremanVar) {
            throw null;
        }

        public hardpan saneness() {
            throw null;
        }

        public beachfront(hardpan hardpanVar) {
            this.f9312attabal = hardpanVar;
        }

        public void beachfront(monroe.wireman wiremanVar) {
        }

        public void impromptu(monroe.wireman wiremanVar) {
        }

        public void wireman(monroe.wireman wiremanVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class formularize extends apical {

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public static final hardpan f9329molybdenite = hardpan.preprohormone(WindowInsets.CONSUMED);

        public formularize(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar, windowInsets);
        }

        @Override // androidx.core.view.hardpan.apical, androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public monroe.wireman competently(int i) {
            return monroe.wireman.marial(this.f9321dern.getInsets(arytenoidectomy.attabal(i)));
        }

        @Override // androidx.core.view.hardpan.apical, androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public monroe.wireman impromptu(int i) {
            return monroe.wireman.marial(this.f9321dern.getInsetsIgnoringVisibility(arytenoidectomy.attabal(i)));
        }

        public formularize(hardpan hardpanVar, formularize formularizeVar) {
            super(hardpanVar, formularizeVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class kowloon {
        public static int attabal(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class marial extends wireman {
        public marial() {
        }

        @Override // androidx.core.view.hardpan.wireman, androidx.core.view.hardpan.beachfront
        public void dern(int i, monroe.wireman wiremanVar) {
            this.f9328dern.setInsets(arytenoidectomy.attabal(i), wiremanVar.beachfront());
        }

        public marial(hardpan hardpanVar) {
            super(hardpanVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class taiyuan extends impromptu {
        public taiyuan(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar, windowInsets);
        }

        @Override // androidx.core.view.hardpan.impassible
        public hardpan attabal() {
            return hardpan.preprohormone(this.f9321dern.consumeDisplayCutout());
        }

        @Override // androidx.core.view.hardpan.impassible
        public polloi beachfront() {
            return polloi.marial(this.f9321dern.getDisplayCutout());
        }

        @Override // androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof taiyuan)) {
                return false;
            }
            taiyuan taiyuanVar = (taiyuan) obj;
            return Objects.equals(this.f9321dern, taiyuanVar.f9321dern) && Objects.equals(this.f9320competently, taiyuanVar.f9320competently) && competently.cuirassed(this.f9322impromptu, taiyuanVar.f9322impromptu);
        }

        @Override // androidx.core.view.hardpan.impassible
        public int hashCode() {
            return this.f9321dern.hashCode();
        }

        public taiyuan(hardpan hardpanVar, taiyuan taiyuanVar) {
            super(hardpanVar, taiyuanVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class triweekly {
        public static int attabal() {
            return 128;
        }

        public static int beachfront() {
            return 1;
        }

        public static int competently() {
            return 519;
        }

        public static int dern(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int impromptu() {
            return 16;
        }

        public static int marial() {
            return 2;
        }

        public static int saneness() {
            return 8;
        }

        public static int taiyuan() {
            return 64;
        }

        public static int wireman() {
            return 32;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class wireman extends dern {
        public wireman() {
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void dern(int i, monroe.wireman wiremanVar) {
            this.f9328dern.setInsets(kowloon.attabal(i), wiremanVar.beachfront());
        }

        public wireman(hardpan hardpanVar) {
            super(hardpanVar);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f9308saneness = formularize.f9329molybdenite;
        } else if (i >= 30) {
            f9308saneness = apical.f9310polloi;
        } else {
            f9308saneness = impassible.f9330saneness;
        }
    }

    public hardpan(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f9309attabal = new formularize(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f9309attabal = new apical(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f9309attabal = new cutely(this, windowInsets);
        } else if (i >= 28) {
            this.f9309attabal = new taiyuan(this, windowInsets);
        } else {
            this.f9309attabal = new impromptu(this, windowInsets);
        }
    }

    public static monroe.wireman arytenoidectomy(monroe.wireman wiremanVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, wiremanVar.f33604attabal - i);
        int iMax2 = Math.max(0, wiremanVar.f33606saneness - i2);
        int iMax3 = Math.max(0, wiremanVar.f33605dern - i3);
        int iMax4 = Math.max(0, wiremanVar.f33607wireman - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? wiremanVar : monroe.wireman.dern(iMax, iMax2, iMax3, iMax4);
    }

    public static hardpan cord(WindowInsets windowInsets, View view) {
        hardpan hardpanVar = new hardpan((WindowInsets) technofreak.cutely.competently(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            hardpanVar.adultoid(premeiotic.kattegat(view));
            hardpanVar.wireman(view.getRootView());
            hardpanVar.gintrap(view.getWindowSystemUiVisibility());
        }
        return hardpanVar;
    }

    public static hardpan preprohormone(WindowInsets windowInsets) {
        return cord(windowInsets, null);
    }

    public void adultoid(hardpan hardpanVar) {
        this.f9309attabal.molybdenite(hardpanVar);
    }

    @Deprecated
    public int apical() {
        return this.f9309attabal.formularize().f33604attabal;
    }

    @Deprecated
    public hardpan attabal() {
        return this.f9309attabal.attabal();
    }

    public monroe.wireman beachfront(int i) {
        return this.f9309attabal.competently(i);
    }

    public monroe.wireman competently(int i) {
        return this.f9309attabal.impromptu(i);
    }

    @Deprecated
    public int cutely() {
        return this.f9309attabal.formularize().f33607wireman;
    }

    @Deprecated
    public hardpan dern() {
        return this.f9309attabal.dern();
    }

    public void dovishness(monroe.wireman wiremanVar) {
        this.f9309attabal.graveside(wiremanVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hardpan) {
            return technofreak.marial.attabal(this.f9309attabal, ((hardpan) obj).f9309attabal);
        }
        return false;
    }

    @Deprecated
    public int formularize() {
        return this.f9309attabal.formularize().f33605dern;
    }

    public void gintrap(int i) {
        this.f9309attabal.adultoid(i);
    }

    public void graveside(monroe.wireman wiremanVar) {
        this.f9309attabal.polloi(wiremanVar);
    }

    public int hashCode() {
        impassible impassibleVar = this.f9309attabal;
        if (impassibleVar == null) {
            return 0;
        }
        return impassibleVar.hashCode();
    }

    @Deprecated
    public int impassible() {
        return this.f9309attabal.formularize().f33606saneness;
    }

    @Deprecated
    public monroe.wireman impromptu() {
        return this.f9309attabal.cutely();
    }

    public hardpan kowloon(int i, int i2, int i3, int i4) {
        return this.f9309attabal.triweekly(i, i2, i3, i4);
    }

    public polloi marial() {
        return this.f9309attabal.beachfront();
    }

    public void molybdenite(monroe.wireman[] wiremanVarArr) {
        this.f9309attabal.monoploid(wiremanVarArr);
    }

    public boolean monoploid() {
        return this.f9309attabal.kowloon();
    }

    @Deprecated
    public hardpan polloi(int i, int i2, int i3, int i4) {
        return new attabal(this).wireman(monroe.wireman.dern(i, i2, i3, i4)).attabal();
    }

    public WindowInsets rotuma() {
        impassible impassibleVar = this.f9309attabal;
        if (impassibleVar instanceof competently) {
            return ((competently) impassibleVar).f9321dern;
        }
        return null;
    }

    @Deprecated
    public hardpan saneness() {
        return this.f9309attabal.saneness();
    }

    @Deprecated
    public monroe.wireman taiyuan() {
        return this.f9309attabal.apical();
    }

    @Deprecated
    public boolean triweekly() {
        return !this.f9309attabal.formularize().equals(monroe.wireman.f33603marial);
    }

    public void wireman(View view) {
        this.f9309attabal.wireman(view);
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class dern extends beachfront {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final WindowInsets.Builder f9328dern;

        public dern() {
            this.f9328dern = attendance.attabal();
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void beachfront(monroe.wireman wiremanVar) {
            this.f9328dern.setSystemGestureInsets(wiremanVar.beachfront());
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void competently(monroe.wireman wiremanVar) {
            this.f9328dern.setSystemWindowInsets(wiremanVar.beachfront());
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void impromptu(monroe.wireman wiremanVar) {
            this.f9328dern.setTappableElementInsets(wiremanVar.beachfront());
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void marial(monroe.wireman wiremanVar) {
            this.f9328dern.setStableInsets(wiremanVar.beachfront());
        }

        @Override // androidx.core.view.hardpan.beachfront
        public hardpan saneness() {
            attabal();
            hardpan hardpanVarPreprohormone = hardpan.preprohormone(this.f9328dern.build());
            hardpanVarPreprohormone.molybdenite(this.f9313saneness);
            return hardpanVarPreprohormone;
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void wireman(monroe.wireman wiremanVar) {
            this.f9328dern.setMandatorySystemGestureInsets(wiremanVar.beachfront());
        }

        public dern(hardpan hardpanVar) {
            WindowInsets.Builder builderAttabal;
            super(hardpanVar);
            WindowInsets windowInsetsRotuma = hardpanVar.rotuma();
            if (windowInsetsRotuma != null) {
                builderAttabal = mastfed.attabal(windowInsetsRotuma);
            } else {
                builderAttabal = attendance.attabal();
            }
            this.f9328dern = builderAttabal;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class impromptu extends competently {

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public monroe.wireman f9332triweekly;

        public impromptu(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar, windowInsets);
            this.f9332triweekly = null;
        }

        @Override // androidx.core.view.hardpan.impassible
        public final monroe.wireman cutely() {
            if (this.f9332triweekly == null) {
                this.f9332triweekly = monroe.wireman.dern(this.f9321dern.getStableInsetLeft(), this.f9321dern.getStableInsetTop(), this.f9321dern.getStableInsetRight(), this.f9321dern.getStableInsetBottom());
            }
            return this.f9332triweekly;
        }

        @Override // androidx.core.view.hardpan.impassible
        public hardpan dern() {
            return hardpan.preprohormone(this.f9321dern.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.hardpan.impassible
        public void graveside(monroe.wireman wiremanVar) {
            this.f9332triweekly = wiremanVar;
        }

        @Override // androidx.core.view.hardpan.impassible
        public boolean kowloon() {
            return this.f9321dern.isConsumed();
        }

        @Override // androidx.core.view.hardpan.impassible
        public hardpan saneness() {
            return hardpan.preprohormone(this.f9321dern.consumeStableInsets());
        }

        public impromptu(hardpan hardpanVar, impromptu impromptuVar) {
            super(hardpanVar, impromptuVar);
            this.f9332triweekly = null;
            this.f9332triweekly = impromptuVar.f9332triweekly;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class saneness extends beachfront {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static boolean f9333beachfront = false;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static Constructor<WindowInsets> f9334competently = null;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static boolean f9335impromptu = false;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static Field f9336marial;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public WindowInsets f9337dern;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public monroe.wireman f9338wireman;

        public saneness() {
            this.f9337dern = taiyuan();
        }

        private static WindowInsets taiyuan() {
            if (!f9333beachfront) {
                try {
                    f9336marial = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f9333beachfront = true;
            }
            Field field = f9336marial;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f9335impromptu) {
                try {
                    f9334competently = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f9335impromptu = true;
            }
            Constructor<WindowInsets> constructor = f9334competently;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void competently(monroe.wireman wiremanVar) {
            WindowInsets windowInsets = this.f9337dern;
            if (windowInsets != null) {
                this.f9337dern = windowInsets.replaceSystemWindowInsets(wiremanVar.f33604attabal, wiremanVar.f33606saneness, wiremanVar.f33605dern, wiremanVar.f33607wireman);
            }
        }

        @Override // androidx.core.view.hardpan.beachfront
        public void marial(monroe.wireman wiremanVar) {
            this.f9338wireman = wiremanVar;
        }

        @Override // androidx.core.view.hardpan.beachfront
        public hardpan saneness() {
            attabal();
            hardpan hardpanVarPreprohormone = hardpan.preprohormone(this.f9337dern);
            hardpanVarPreprohormone.molybdenite(this.f9313saneness);
            hardpanVarPreprohormone.dovishness(this.f9338wireman);
            return hardpanVarPreprohormone;
        }

        public saneness(hardpan hardpanVar) {
            super(hardpanVar);
            this.f9337dern = hardpanVar.rotuma();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class competently extends impassible {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static Class<?> f9314apical = null;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public static Method f9315cutely = null;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static Field f9316formularize = null;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static Field f9317impassible = null;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static boolean f9318taiyuan = false;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public hardpan f9319beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public monroe.wireman f9320competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final WindowInsets f9321dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f9322impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public monroe.wireman f9323marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public monroe.wireman[] f9324wireman;

        public competently(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar);
            this.f9323marial = null;
            this.f9321dern = windowInsets;
        }

        private static void cord() {
            try {
                f9315cutely = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f9314apical = cls;
                f9316formularize = cls.getDeclaredField("mVisibleInsets");
                f9317impassible = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f9316formularize.setAccessible(true);
                f9317impassible.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            f9318taiyuan = true;
        }

        public static boolean cuirassed(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        private monroe.wireman dovishness(int i, boolean z) {
            monroe.wireman wiremanVarAttabal = monroe.wireman.f33603marial;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    wiremanVarAttabal = monroe.wireman.attabal(wiremanVarAttabal, gintrap(i2, z));
                }
            }
            return wiremanVarAttabal;
        }

        private monroe.wireman preprohormone(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f9318taiyuan) {
                cord();
            }
            Method method = f9315cutely;
            if (method != null && f9314apical != null && f9316formularize != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f9316formularize.get(f9317impassible.get(objInvoke));
                    if (rect != null) {
                        return monroe.wireman.wireman(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }

        private monroe.wireman rotuma() {
            hardpan hardpanVar = this.f9319beachfront;
            return hardpanVar != null ? hardpanVar.impromptu() : monroe.wireman.f33603marial;
        }

        @Override // androidx.core.view.hardpan.impassible
        public void adultoid(int i) {
            this.f9322impromptu = i;
        }

        @Override // androidx.core.view.hardpan.impassible
        public boolean arytenoidectomy() {
            return this.f9321dern.isRound();
        }

        @Override // androidx.core.view.hardpan.impassible
        public monroe.wireman competently(int i) {
            return dovishness(i, false);
        }

        @Override // androidx.core.view.hardpan.impassible
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            competently competentlyVar = (competently) obj;
            return Objects.equals(this.f9320competently, competentlyVar.f9320competently) && cuirassed(this.f9322impromptu, competentlyVar.f9322impromptu);
        }

        @Override // androidx.core.view.hardpan.impassible
        public final monroe.wireman formularize() {
            if (this.f9323marial == null) {
                this.f9323marial = monroe.wireman.dern(this.f9321dern.getSystemWindowInsetLeft(), this.f9321dern.getSystemWindowInsetTop(), this.f9321dern.getSystemWindowInsetRight(), this.f9321dern.getSystemWindowInsetBottom());
            }
            return this.f9323marial;
        }

        public monroe.wireman gintrap(int i, boolean z) {
            monroe.wireman wiremanVarImpromptu;
            int i2;
            if (i == 1) {
                if (z) {
                    return monroe.wireman.dern(0, Math.max(rotuma().f33606saneness, formularize().f33606saneness), 0, 0);
                }
                return (this.f9322impromptu & 4) != 0 ? monroe.wireman.f33603marial : monroe.wireman.dern(0, formularize().f33606saneness, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    monroe.wireman wiremanVarRotuma = rotuma();
                    monroe.wireman wiremanVarCutely = cutely();
                    return monroe.wireman.dern(Math.max(wiremanVarRotuma.f33604attabal, wiremanVarCutely.f33604attabal), 0, Math.max(wiremanVarRotuma.f33605dern, wiremanVarCutely.f33605dern), Math.max(wiremanVarRotuma.f33607wireman, wiremanVarCutely.f33607wireman));
                }
                if ((this.f9322impromptu & 2) != 0) {
                    return monroe.wireman.f33603marial;
                }
                monroe.wireman wiremanVarFormularize = formularize();
                hardpan hardpanVar = this.f9319beachfront;
                wiremanVarImpromptu = hardpanVar != null ? hardpanVar.impromptu() : null;
                int iMin = wiremanVarFormularize.f33607wireman;
                if (wiremanVarImpromptu != null) {
                    iMin = Math.min(iMin, wiremanVarImpromptu.f33607wireman);
                }
                return monroe.wireman.dern(wiremanVarFormularize.f33604attabal, 0, wiremanVarFormularize.f33605dern, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return apical();
                }
                if (i == 32) {
                    return taiyuan();
                }
                if (i == 64) {
                    return impassible();
                }
                if (i != 128) {
                    return monroe.wireman.f33603marial;
                }
                hardpan hardpanVar2 = this.f9319beachfront;
                polloi polloiVarMarial = hardpanVar2 != null ? hardpanVar2.marial() : beachfront();
                return polloiVarMarial != null ? monroe.wireman.dern(polloiVarMarial.saneness(), polloiVarMarial.wireman(), polloiVarMarial.dern(), polloiVarMarial.attabal()) : monroe.wireman.f33603marial;
            }
            monroe.wireman[] wiremanVarArr = this.f9324wireman;
            wiremanVarImpromptu = wiremanVarArr != null ? wiremanVarArr[triweekly.dern(8)] : null;
            if (wiremanVarImpromptu != null) {
                return wiremanVarImpromptu;
            }
            monroe.wireman wiremanVarFormularize2 = formularize();
            monroe.wireman wiremanVarRotuma2 = rotuma();
            int i3 = wiremanVarFormularize2.f33607wireman;
            if (i3 > wiremanVarRotuma2.f33607wireman) {
                return monroe.wireman.dern(0, 0, 0, i3);
            }
            monroe.wireman wiremanVar = this.f9320competently;
            return (wiremanVar == null || wiremanVar.equals(monroe.wireman.f33603marial) || (i2 = this.f9320competently.f33607wireman) <= wiremanVarRotuma2.f33607wireman) ? monroe.wireman.f33603marial : monroe.wireman.dern(0, 0, 0, i2);
        }

        @Override // androidx.core.view.hardpan.impassible
        public monroe.wireman impromptu(int i) {
            return dovishness(i, true);
        }

        @Override // androidx.core.view.hardpan.impassible
        public void marial(hardpan hardpanVar) {
            hardpanVar.adultoid(this.f9319beachfront);
            hardpanVar.graveside(this.f9320competently);
            hardpanVar.gintrap(this.f9322impromptu);
        }

        @Override // androidx.core.view.hardpan.impassible
        public void molybdenite(hardpan hardpanVar) {
            this.f9319beachfront = hardpanVar;
        }

        @Override // androidx.core.view.hardpan.impassible
        public void monoploid(monroe.wireman[] wiremanVarArr) {
            this.f9324wireman = wiremanVarArr;
        }

        @Override // androidx.core.view.hardpan.impassible
        public void polloi(monroe.wireman wiremanVar) {
            this.f9320competently = wiremanVar;
        }

        @Override // androidx.core.view.hardpan.impassible
        public hardpan triweekly(int i, int i2, int i3, int i4) {
            attabal attabalVar = new attabal(hardpan.preprohormone(this.f9321dern));
            attabalVar.wireman(hardpan.arytenoidectomy(formularize(), i, i2, i3, i4));
            attabalVar.dern(hardpan.arytenoidectomy(cutely(), i, i2, i3, i4));
            return attabalVar.attabal();
        }

        @Override // androidx.core.view.hardpan.impassible
        public void wireman(View view) {
            monroe.wireman wiremanVarPreprohormone = preprohormone(view);
            if (wiremanVarPreprohormone == null) {
                wiremanVarPreprohormone = monroe.wireman.f33603marial;
            }
            polloi(wiremanVarPreprohormone);
        }

        public competently(hardpan hardpanVar, competently competentlyVar) {
            this(hardpanVar, new WindowInsets(competentlyVar.f9321dern));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class cutely extends taiyuan {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public monroe.wireman f9325arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public monroe.wireman f9326kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public monroe.wireman f9327monoploid;

        public cutely(hardpan hardpanVar, WindowInsets windowInsets) {
            super(hardpanVar, windowInsets);
            this.f9326kowloon = null;
            this.f9325arytenoidectomy = null;
            this.f9327monoploid = null;
        }

        @Override // androidx.core.view.hardpan.impassible
        public monroe.wireman apical() {
            if (this.f9326kowloon == null) {
                this.f9326kowloon = monroe.wireman.marial(this.f9321dern.getSystemGestureInsets());
            }
            return this.f9326kowloon;
        }

        @Override // androidx.core.view.hardpan.impassible
        public monroe.wireman impassible() {
            if (this.f9327monoploid == null) {
                this.f9327monoploid = monroe.wireman.marial(this.f9321dern.getTappableElementInsets());
            }
            return this.f9327monoploid;
        }

        @Override // androidx.core.view.hardpan.impassible
        public monroe.wireman taiyuan() {
            if (this.f9325arytenoidectomy == null) {
                this.f9325arytenoidectomy = monroe.wireman.marial(this.f9321dern.getMandatorySystemGestureInsets());
            }
            return this.f9325arytenoidectomy;
        }

        @Override // androidx.core.view.hardpan.competently, androidx.core.view.hardpan.impassible
        public hardpan triweekly(int i, int i2, int i3, int i4) {
            return hardpan.preprohormone(this.f9321dern.inset(i, i2, i3, i4));
        }

        public cutely(hardpan hardpanVar, cutely cutelyVar) {
            super(hardpanVar, cutelyVar);
            this.f9326kowloon = null;
            this.f9325arytenoidectomy = null;
            this.f9327monoploid = null;
        }

        @Override // androidx.core.view.hardpan.impromptu, androidx.core.view.hardpan.impassible
        public void graveside(monroe.wireman wiremanVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final beachfront f9311attabal;

        public attabal() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f9311attabal = new marial();
                return;
            }
            if (i >= 30) {
                this.f9311attabal = new wireman();
            } else if (i >= 29) {
                this.f9311attabal = new dern();
            } else {
                this.f9311attabal = new saneness();
            }
        }

        public hardpan attabal() {
            return this.f9311attabal.saneness();
        }

        @Deprecated
        public attabal dern(monroe.wireman wiremanVar) {
            this.f9311attabal.marial(wiremanVar);
            return this;
        }

        public attabal saneness(int i, monroe.wireman wiremanVar) {
            this.f9311attabal.dern(i, wiremanVar);
            return this;
        }

        @Deprecated
        public attabal wireman(monroe.wireman wiremanVar) {
            this.f9311attabal.competently(wiremanVar);
            return this;
        }

        public attabal(hardpan hardpanVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f9311attabal = new marial(hardpanVar);
                return;
            }
            if (i >= 30) {
                this.f9311attabal = new wireman(hardpanVar);
            } else if (i >= 29) {
                this.f9311attabal = new dern(hardpanVar);
            } else {
                this.f9311attabal = new saneness(hardpanVar);
            }
        }
    }

    public hardpan(hardpan hardpanVar) {
        if (hardpanVar != null) {
            impassible impassibleVar = hardpanVar.f9309attabal;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (impassibleVar instanceof formularize)) {
                this.f9309attabal = new formularize(this, (formularize) impassibleVar);
            } else if (i >= 30 && (impassibleVar instanceof apical)) {
                this.f9309attabal = new apical(this, (apical) impassibleVar);
            } else if (i >= 29 && (impassibleVar instanceof cutely)) {
                this.f9309attabal = new cutely(this, (cutely) impassibleVar);
            } else if (i >= 28 && (impassibleVar instanceof taiyuan)) {
                this.f9309attabal = new taiyuan(this, (taiyuan) impassibleVar);
            } else if (impassibleVar instanceof impromptu) {
                this.f9309attabal = new impromptu(this, (impromptu) impassibleVar);
            } else if (impassibleVar instanceof competently) {
                this.f9309attabal = new competently(this, (competently) impassibleVar);
            } else {
                this.f9309attabal = new impassible(this);
            }
            impassibleVar.marial(this);
            return;
        }
        this.f9309attabal = new impassible(this);
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class impassible {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final hardpan f9330saneness = new attabal().attabal().attabal().saneness().dern();

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hardpan f9331attabal;

        public impassible(hardpan hardpanVar) {
            this.f9331attabal = hardpanVar;
        }

        public monroe.wireman apical() {
            return formularize();
        }

        public boolean arytenoidectomy() {
            return false;
        }

        public hardpan attabal() {
            return this.f9331attabal;
        }

        public polloi beachfront() {
            return null;
        }

        public monroe.wireman competently(int i) {
            return monroe.wireman.f33603marial;
        }

        public monroe.wireman cutely() {
            return monroe.wireman.f33603marial;
        }

        public hardpan dern() {
            return this.f9331attabal;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof impassible)) {
                return false;
            }
            impassible impassibleVar = (impassible) obj;
            return arytenoidectomy() == impassibleVar.arytenoidectomy() && kowloon() == impassibleVar.kowloon() && technofreak.marial.attabal(formularize(), impassibleVar.formularize()) && technofreak.marial.attabal(cutely(), impassibleVar.cutely()) && technofreak.marial.attabal(beachfront(), impassibleVar.beachfront());
        }

        public monroe.wireman formularize() {
            return monroe.wireman.f33603marial;
        }

        public int hashCode() {
            return technofreak.marial.saneness(Boolean.valueOf(arytenoidectomy()), Boolean.valueOf(kowloon()), formularize(), cutely(), beachfront());
        }

        public monroe.wireman impassible() {
            return formularize();
        }

        public monroe.wireman impromptu(int i) {
            if ((i & 8) == 0) {
                return monroe.wireman.f33603marial;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public boolean kowloon() {
            return false;
        }

        public hardpan saneness() {
            return this.f9331attabal;
        }

        public monroe.wireman taiyuan() {
            return formularize();
        }

        public hardpan triweekly(int i, int i2, int i3, int i4) {
            return f9330saneness;
        }

        public void adultoid(int i) {
        }

        public void graveside(monroe.wireman wiremanVar) {
        }

        public void marial(hardpan hardpanVar) {
        }

        public void molybdenite(hardpan hardpanVar) {
        }

        public void monoploid(monroe.wireman[] wiremanVarArr) {
        }

        public void polloi(monroe.wireman wiremanVar) {
        }

        public void wireman(View view) {
        }
    }
}
