package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.premeiotic;
import java.util.Map;
import java.util.WeakHashMap;
import outmarry.preprohormone;
import outmarry.rotuma;

/* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class apical extends androidx.core.view.attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal f13364marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RecyclerView f13365wireman;

    /* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class attabal extends androidx.core.view.attabal {

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Map<View, androidx.core.view.attabal> f13366marial = new WeakHashMap();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final apical f13367wireman;

        public attabal(apical apicalVar) {
            this.f13367wireman = apicalVar;
        }

        @Override // androidx.core.view.attabal
        public boolean attabal(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            return attabalVar != null ? attabalVar.attabal(view, accessibilityEvent) : super.attabal(view, accessibilityEvent);
        }

        @Override // androidx.core.view.attabal
        public void beachfront(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                attabalVar.beachfront(view, accessibilityEvent);
            } else {
                super.beachfront(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            if (this.f13367wireman.kowloon() || this.f13367wireman.f13365wireman.getLayoutManager() == null) {
                super.competently(view, rotumaVar);
                return;
            }
            this.f13367wireman.f13365wireman.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, rotumaVar);
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                attabalVar.competently(view, rotumaVar);
            } else {
                super.competently(view, rotumaVar);
            }
        }

        @Override // androidx.core.view.attabal
        public boolean cutely(View view, int i, Bundle bundle) {
            if (this.f13367wireman.kowloon() || this.f13367wireman.f13365wireman.getLayoutManager() == null) {
                return super.cutely(view, i, bundle);
            }
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                if (attabalVar.cutely(view, i, bundle)) {
                    return true;
                }
            } else if (super.cutely(view, i, bundle)) {
                return true;
            }
            return this.f13367wireman.f13365wireman.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // androidx.core.view.attabal
        public void formularize(View view, int i) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                attabalVar.formularize(view, i);
            } else {
                super.formularize(view, i);
            }
        }

        @Override // androidx.core.view.attabal
        public void impassible(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                attabalVar.impassible(view, accessibilityEvent);
            } else {
                super.impassible(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.attabal
        public void impromptu(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            if (attabalVar != null) {
                attabalVar.impromptu(view, accessibilityEvent);
            } else {
                super.impromptu(view, accessibilityEvent);
            }
        }

        public void kowloon(View view) {
            androidx.core.view.attabal attabalVarFormularize = premeiotic.formularize(view);
            if (attabalVarFormularize == null || attabalVarFormularize == this) {
                return;
            }
            this.f13366marial.put(view, attabalVarFormularize);
        }

        @Override // androidx.core.view.attabal
        public preprohormone saneness(View view) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(view);
            return attabalVar != null ? attabalVar.saneness(view) : super.saneness(view);
        }

        @Override // androidx.core.view.attabal
        public boolean taiyuan(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.attabal attabalVar = this.f13366marial.get(viewGroup);
            return attabalVar != null ? attabalVar.taiyuan(viewGroup, view, accessibilityEvent) : super.taiyuan(viewGroup, view, accessibilityEvent);
        }

        public androidx.core.view.attabal triweekly(View view) {
            return this.f13366marial.remove(view);
        }
    }

    public apical(RecyclerView recyclerView) {
        this.f13365wireman = recyclerView;
        androidx.core.view.attabal attabalVarTriweekly = triweekly();
        if (attabalVarTriweekly == null || !(attabalVarTriweekly instanceof attabal)) {
            this.f13364marial = new attabal(this);
        } else {
            this.f13364marial = (attabal) attabalVarTriweekly;
        }
    }

    @Override // androidx.core.view.attabal
    public void beachfront(View view, AccessibilityEvent accessibilityEvent) {
        super.beachfront(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || kowloon()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.attabal
    public void competently(View view, rotuma rotumaVar) {
        super.competently(view, rotumaVar);
        if (kowloon() || this.f13365wireman.getLayoutManager() == null) {
            return;
        }
        this.f13365wireman.getLayoutManager().onInitializeAccessibilityNodeInfo(rotumaVar);
    }

    @Override // androidx.core.view.attabal
    public boolean cutely(View view, int i, Bundle bundle) {
        if (super.cutely(view, i, bundle)) {
            return true;
        }
        if (kowloon() || this.f13365wireman.getLayoutManager() == null) {
            return false;
        }
        return this.f13365wireman.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean kowloon() {
        return this.f13365wireman.hasPendingAdapterUpdates();
    }

    public androidx.core.view.attabal triweekly() {
        return this.f13364marial;
    }
}
