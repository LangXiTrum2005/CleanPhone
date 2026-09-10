package outmarry;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f34789attabal;

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class attabal extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final preprohormone f34790attabal;

        public attabal(preprohormone preprohormoneVar) {
            this.f34790attabal = preprohormoneVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            rotuma rotumaVarSaneness = this.f34790attabal.saneness(i);
            if (rotumaVarSaneness == null) {
                return null;
            }
            return rotumaVarSaneness.linendraper();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<rotuma> listDern = this.f34790attabal.dern(str, i);
            if (listDern == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listDern.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listDern.get(i2).linendraper());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            rotuma rotumaVarWireman = this.f34790attabal.wireman(i);
            if (rotumaVarWireman == null) {
                return null;
            }
            return rotumaVarWireman.linendraper();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f34790attabal.beachfront(i, i2, bundle);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class saneness extends attabal {
        public saneness(preprohormone preprohormoneVar) {
            super(preprohormoneVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f34790attabal.attabal(i, rotuma.stupefactive(accessibilityNodeInfo), str, bundle);
        }
    }

    public preprohormone() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f34789attabal = new saneness(this);
        } else {
            this.f34789attabal = new attabal(this);
        }
    }

    public boolean beachfront(int i, int i2, Bundle bundle) {
        return false;
    }

    public List<rotuma> dern(String str, int i) {
        return null;
    }

    public Object marial() {
        return this.f34789attabal;
    }

    public rotuma saneness(int i) {
        return null;
    }

    public rotuma wireman(int i) {
        return null;
    }

    public preprohormone(Object obj) {
        this.f34789attabal = obj;
    }

    public void attabal(int i, rotuma rotumaVar, String str, Bundle bundle) {
    }
}
