package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final View.AccessibilityDelegate f9277dern = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View.AccessibilityDelegate f9278attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View.AccessibilityDelegate f9279saneness;

    /* JADX INFO: renamed from: androidx.core.view.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    public static final class C0059attabal extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final attabal f9280attabal;

        public C0059attabal(attabal attabalVar) {
            this.f9280attabal = attabalVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f9280attabal.attabal(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            outmarry.preprohormone preprohormoneVarSaneness = this.f9280attabal.saneness(view);
            if (preprohormoneVarSaneness != null) {
                return (AccessibilityNodeProvider) preprohormoneVarSaneness.marial();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9280attabal.beachfront(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            outmarry.rotuma rotumaVarStupefactive = outmarry.rotuma.stupefactive(accessibilityNodeInfo);
            rotumaVarStupefactive.immediately(premeiotic.walach(view));
            rotumaVarStupefactive.hardpan(premeiotic.creditor(view));
            rotumaVarStupefactive.homozygous(premeiotic.kowloon(view));
            rotumaVarStupefactive.microchemistry(premeiotic.supplicat(view));
            this.f9280attabal.competently(view, rotumaVarStupefactive);
            rotumaVarStupefactive.beachfront(accessibilityNodeInfo.getText(), view);
            List<outmarry.rotuma.attabal> listDern = attabal.dern(view);
            for (int i = 0; i < listDern.size(); i++) {
                rotumaVarStupefactive.saneness(listDern.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f9280attabal.impromptu(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f9280attabal.taiyuan(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f9280attabal.cutely(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f9280attabal.formularize(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f9280attabal.impassible(view, accessibilityEvent);
        }
    }

    public attabal() {
        this(f9277dern);
    }

    public static List<outmarry.rotuma.attabal> dern(View view) {
        List<outmarry.rotuma.attabal> list = (List) view.getTag(wostteth.marial.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final boolean apical(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(wostteth.marial.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!marial(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean attabal(View view, AccessibilityEvent accessibilityEvent) {
        return this.f9278attabal.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void beachfront(View view, AccessibilityEvent accessibilityEvent) {
        this.f9278attabal.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void competently(View view, outmarry.rotuma rotumaVar) {
        this.f9278attabal.onInitializeAccessibilityNodeInfo(view, rotumaVar.linendraper());
    }

    public boolean cutely(View view, int i, Bundle bundle) {
        List<outmarry.rotuma.attabal> listDern = dern(view);
        boolean zPerformAccessibilityAction = false;
        for (int i2 = 0; i2 < listDern.size(); i2++) {
            outmarry.rotuma.attabal attabalVar = listDern.get(i2);
            if (attabalVar.saneness() == i) {
                zPerformAccessibilityAction = attabalVar.wireman(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f9278attabal.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != wostteth.marial.accessibility_action_clickable_span || bundle == null) ? zPerformAccessibilityAction : apical(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void formularize(View view, int i) {
        this.f9278attabal.sendAccessibilityEvent(view, i);
    }

    public void impassible(View view, AccessibilityEvent accessibilityEvent) {
        this.f9278attabal.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void impromptu(View view, AccessibilityEvent accessibilityEvent) {
        this.f9278attabal.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean marial(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrPolloi = outmarry.rotuma.polloi(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrPolloi != null && i < clickableSpanArrPolloi.length; i++) {
                if (clickableSpan.equals(clickableSpanArrPolloi[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public outmarry.preprohormone saneness(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f9278attabal.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new outmarry.preprohormone(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean taiyuan(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f9278attabal.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public View.AccessibilityDelegate wireman() {
        return this.f9279saneness;
    }

    public attabal(View.AccessibilityDelegate accessibilityDelegate) {
        this.f9278attabal = accessibilityDelegate;
        this.f9279saneness = new C0059attabal(this);
    }
}
