package homozygous;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.overspeculate;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import outmarry.cord;
import outmarry.preprohormone;
import outmarry.rotuma;

/* JADX INFO: compiled from: ExploreByTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal extends androidx.core.view.attabal {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public dern f27883cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final AccessibilityManager f27886impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final View f27888taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Rect f27879triweekly = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final homozygous.saneness.attabal<rotuma> f27878kowloon = new C0635attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final homozygous.saneness.InterfaceC0637saneness<overspeculate<rotuma>, rotuma> f27877arytenoidectomy = new saneness();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Rect f27889wireman = new Rect();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Rect f27887marial = new Rect();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Rect f27881beachfront = new Rect();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int[] f27882competently = new int[2];

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f27880apical = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f27884formularize = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f27885impassible = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: homozygous.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class C0635attabal implements homozygous.saneness.attabal<rotuma> {
        @Override // homozygous.saneness.attabal
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(rotuma rotumaVar, Rect rect) {
            rotumaVar.impassible(rect);
        }
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class dern extends preprohormone {
        public dern() {
        }

        @Override // outmarry.preprohormone
        public boolean beachfront(int i, int i2, Bundle bundle) {
            return attabal.this.hydrovane(i, i2, bundle);
        }

        @Override // outmarry.preprohormone
        public rotuma saneness(int i) {
            return rotuma.milliradian(attabal.this.merc(i));
        }

        @Override // outmarry.preprohormone
        public rotuma wireman(int i) {
            int i2 = i == 2 ? attabal.this.f27880apical : attabal.this.f27884formularize;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return saneness(i2);
        }
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class saneness implements homozygous.saneness.InterfaceC0637saneness<overspeculate<rotuma>, rotuma> {
        @Override // homozygous.saneness.InterfaceC0637saneness
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public rotuma attabal(overspeculate<rotuma> overspeculateVar, int i) {
            return overspeculateVar.impassible(i);
        }

        @Override // homozygous.saneness.InterfaceC0637saneness
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public int saneness(overspeculate<rotuma> overspeculateVar) {
            return overspeculateVar.formularize();
        }
    }

    public attabal(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f27888taiyuan = view;
        this.f27886impromptu = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (premeiotic.rotuma(view) == 0) {
            premeiotic.wostteth(view, 1);
        }
    }

    private void clubfoot(int i) {
        int i2 = this.f27885impassible;
        if (i2 == i) {
            return;
        }
        this.f27885impassible = i;
        overspeculate(i, 128);
        overspeculate(i2, 256);
    }

    private boolean mathsort(int i) {
        int i2;
        if (!this.f27886impromptu.isEnabled() || !this.f27886impromptu.isTouchExplorationEnabled() || (i2 = this.f27880apical) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            triweekly(i2);
        }
        this.f27880apical = i;
        this.f27888taiyuan.invalidate();
        overspeculate(i, 32768);
        return true;
    }

    private AccessibilityEvent monoploid(int i, int i2) {
        return i != -1 ? polloi(i, i2) : molybdenite(i2);
    }

    public static Rect oilcan(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int supplicat(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean triweekly(int i) {
        if (this.f27880apical != i) {
            return false;
        }
        this.f27880apical = Integer.MIN_VALUE;
        this.f27888taiyuan.invalidate();
        overspeculate(i, 65536);
        return true;
    }

    public final rotuma adultoid() {
        rotuma rotumaVarTimberyard = rotuma.timberyard(this.f27888taiyuan);
        premeiotic.clubfoot(this.f27888taiyuan, rotumaVarTimberyard);
        ArrayList arrayList = new ArrayList();
        trm(arrayList);
        if (rotumaVarTimberyard.arytenoidectomy() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rotumaVarTimberyard.wireman(this.f27888taiyuan, ((Integer) arrayList.get(i)).intValue());
        }
        return rotumaVarTimberyard;
    }

    public final boolean arytenoidectomy() {
        int i = this.f27884formularize;
        return i != Integer.MIN_VALUE && seminary(i, 16, null);
    }

    @Override // androidx.core.view.attabal
    public void beachfront(View view, AccessibilityEvent accessibilityEvent) {
        super.beachfront(view, accessibilityEvent);
        grimness(accessibilityEvent);
    }

    @Override // androidx.core.view.attabal
    public void competently(View view, rotuma rotumaVar) {
        super.competently(view, rotumaVar);
        privatdozent(rotumaVar);
    }

    public final void cord(int i, Rect rect) {
        merc(i).impassible(rect);
    }

    public abstract void creditor(int i, rotuma rotumaVar);

    public final int cuirassed() {
        return this.f27884formularize;
    }

    public final boolean dovishness(MotionEvent motionEvent) {
        if (this.f27886impromptu.isEnabled() && this.f27886impromptu.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f27885impassible == Integer.MIN_VALUE) {
                    return false;
                }
                clubfoot(Integer.MIN_VALUE);
                return true;
            }
            int iStratoscope = stratoscope(motionEvent.getX(), motionEvent.getY());
            clubfoot(iStratoscope);
            if (iStratoscope != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean gintrap(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iSupplicat = supplicat(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && restrictive(iSupplicat, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                arytenoidectomy();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    arytenoidectomy();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return restrictive(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return restrictive(1, null);
                }
            }
        }
        return false;
    }

    public final rotuma graveside(int i) {
        rotuma rotumaVarPremeiotic = rotuma.premeiotic();
        rotumaVarPremeiotic.julian(true);
        rotumaVarPremeiotic.unconsolidated(true);
        rotumaVarPremeiotic.preterite("android.view.View");
        Rect rect = f27879triweekly;
        rotumaVarPremeiotic.empress(rect);
        rotumaVarPremeiotic.coi(rect);
        rotumaVarPremeiotic.lampshade(this.f27888taiyuan);
        creditor(i, rotumaVarPremeiotic);
        if (rotumaVarPremeiotic.trm() == null && rotumaVarPremeiotic.graveside() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        rotumaVarPremeiotic.impassible(this.f27887marial);
        if (this.f27887marial.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iApical = rotumaVarPremeiotic.apical();
        if ((iApical & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iApical & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        rotumaVarPremeiotic.attendance(this.f27888taiyuan.getContext().getPackageName());
        rotumaVarPremeiotic.licking(this.f27888taiyuan, i);
        if (this.f27880apical == i) {
            rotumaVarPremeiotic.nosophobia(true);
            rotumaVarPremeiotic.attabal(128);
        } else {
            rotumaVarPremeiotic.nosophobia(false);
            rotumaVarPremeiotic.attabal(64);
        }
        boolean z = this.f27884formularize == i;
        if (z) {
            rotumaVarPremeiotic.attabal(2);
        } else if (rotumaVarPremeiotic.starveling()) {
            rotumaVarPremeiotic.attabal(1);
        }
        rotumaVarPremeiotic.claque(z);
        this.f27888taiyuan.getLocationOnScreen(this.f27882competently);
        rotumaVarPremeiotic.triweekly(this.f27889wireman);
        if (this.f27889wireman.equals(rect)) {
            rotumaVarPremeiotic.impassible(this.f27889wireman);
            if (rotumaVarPremeiotic.f34794saneness != -1) {
                rotuma rotumaVarPremeiotic2 = rotuma.premeiotic();
                for (int i2 = rotumaVarPremeiotic.f34794saneness; i2 != -1; i2 = rotumaVarPremeiotic2.f34794saneness) {
                    rotumaVarPremeiotic2.libyan(this.f27888taiyuan, -1);
                    rotumaVarPremeiotic2.empress(f27879triweekly);
                    creditor(i2, rotumaVarPremeiotic2);
                    rotumaVarPremeiotic2.impassible(this.f27887marial);
                    Rect rect2 = this.f27889wireman;
                    Rect rect3 = this.f27887marial;
                    rect2.offset(rect3.left, rect3.top);
                }
                rotumaVarPremeiotic2.itchy();
            }
            this.f27889wireman.offset(this.f27882competently[0] - this.f27888taiyuan.getScrollX(), this.f27882competently[1] - this.f27888taiyuan.getScrollY());
        }
        if (this.f27888taiyuan.getLocalVisibleRect(this.f27881beachfront)) {
            this.f27881beachfront.offset(this.f27882competently[0] - this.f27888taiyuan.getScrollX(), this.f27882competently[1] - this.f27888taiyuan.getScrollY());
            if (this.f27889wireman.intersect(this.f27881beachfront)) {
                rotumaVarPremeiotic.coi(this.f27889wireman);
                if (kattegat(this.f27889wireman)) {
                    rotumaVarPremeiotic.sultanate(true);
                }
            }
        }
        return rotumaVarPremeiotic;
    }

    public boolean hydrovane(int i, int i2, Bundle bundle) {
        return i != -1 ? walach(i, i2, bundle) : peridotite(i2, bundle);
    }

    public final boolean kattegat(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f27888taiyuan.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f27888taiyuan.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean kowloon(int i) {
        if (this.f27884formularize != i) {
            return false;
        }
        this.f27884formularize = Integer.MIN_VALUE;
        starveling(i, false);
        overspeculate(i, 8);
        return true;
    }

    public rotuma merc(int i) {
        return i == -1 ? adultoid() : graveside(i);
    }

    public final AccessibilityEvent molybdenite(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.f27888taiyuan.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final boolean overspeculate(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f27886impromptu.isEnabled() || (parent = this.f27888taiyuan.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f27888taiyuan, monoploid(i, i2));
    }

    public final boolean peridotite(int i, Bundle bundle) {
        return premeiotic.permissivist(this.f27888taiyuan, i, bundle);
    }

    public final void polder(boolean z, int i, Rect rect) {
        int i2 = this.f27884formularize;
        if (i2 != Integer.MIN_VALUE) {
            kowloon(i2);
        }
        if (z) {
            restrictive(i, rect);
        }
    }

    public final AccessibilityEvent polloi(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        rotuma rotumaVarMerc = merc(i);
        accessibilityEventObtain.getText().add(rotumaVarMerc.trm());
        accessibilityEventObtain.setContentDescription(rotumaVarMerc.graveside());
        accessibilityEventObtain.setScrollable(rotumaVarMerc.overspeculate());
        accessibilityEventObtain.setPassword(rotumaVarMerc.splinterproof());
        accessibilityEventObtain.setEnabled(rotumaVarMerc.privatdozent());
        accessibilityEventObtain.setChecked(rotumaVarMerc.seminary());
        saran(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(rotumaVarMerc.monoploid());
        cord.dern(accessibilityEventObtain, this.f27888taiyuan, i);
        accessibilityEventObtain.setPackageName(this.f27888taiyuan.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final overspeculate<rotuma> preprohormone() {
        ArrayList arrayList = new ArrayList();
        trm(arrayList);
        overspeculate<rotuma> overspeculateVar = new overspeculate<>();
        for (int i = 0; i < arrayList.size(); i++) {
            overspeculateVar.apical(arrayList.get(i).intValue(), graveside(arrayList.get(i).intValue()));
        }
        return overspeculateVar;
    }

    public final boolean restrictive(int i, Rect rect) {
        rotuma rotumaVar;
        overspeculate<rotuma> overspeculateVarPreprohormone = preprohormone();
        int i2 = this.f27884formularize;
        rotuma rotumaVarBeachfront = i2 == Integer.MIN_VALUE ? null : overspeculateVarPreprohormone.beachfront(i2);
        if (i == 1 || i == 2) {
            rotumaVar = (rotuma) homozygous.saneness.wireman(overspeculateVarPreprohormone, f27877arytenoidectomy, f27878kowloon, rotumaVarBeachfront, i, premeiotic.cord(this.f27888taiyuan) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.f27884formularize;
            if (i3 != Integer.MIN_VALUE) {
                cord(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                oilcan(this.f27888taiyuan, i, rect2);
            }
            rotumaVar = (rotuma) homozygous.saneness.dern(overspeculateVarPreprohormone, f27877arytenoidectomy, f27878kowloon, rotumaVarBeachfront, rect2, i);
        }
        return splinterproof(rotumaVar != null ? overspeculateVarPreprohormone.taiyuan(overspeculateVarPreprohormone.impromptu(rotumaVar)) : Integer.MIN_VALUE);
    }

    public final int rotuma() {
        return this.f27880apical;
    }

    @Override // androidx.core.view.attabal
    public preprohormone saneness(View view) {
        if (this.f27883cutely == null) {
            this.f27883cutely = new dern();
        }
        return this.f27883cutely;
    }

    public final void sealless(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f27886impromptu.isEnabled() || (parent = this.f27888taiyuan.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventMonoploid = monoploid(i, 2048);
        outmarry.saneness.saneness(accessibilityEventMonoploid, i2);
        parent.requestSendAccessibilityEvent(this.f27888taiyuan, accessibilityEventMonoploid);
    }

    public abstract boolean seminary(int i, int i2, Bundle bundle);

    public final boolean splinterproof(int i) {
        int i2;
        if ((!this.f27888taiyuan.isFocused() && !this.f27888taiyuan.requestFocus()) || (i2 = this.f27884formularize) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            kowloon(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f27884formularize = i;
        starveling(i, true);
        overspeculate(i, 8);
        return true;
    }

    public abstract int stratoscope(float f, float f2);

    public abstract void trm(List<Integer> list);

    public final boolean walach(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return splinterproof(i);
        }
        if (i2 == 2) {
            return kowloon(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? seminary(i, i2, bundle) : triweekly(i);
        }
        return mathsort(i);
    }

    public final void yemenite(int i) {
        sealless(i, 0);
    }

    public void grimness(AccessibilityEvent accessibilityEvent) {
    }

    public void privatdozent(rotuma rotumaVar) {
    }

    public void saran(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void starveling(int i, boolean z) {
    }
}
