package ads_mobile_sdk;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import saneness.leukopoietic;

/* JADX INFO: loaded from: classes.dex */
public final class s7 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();
    public final WeakHashMap i = new WeakHashMap();
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        String str;
        s4 s4Var = s4.c;
        if (s4Var != null) {
            for (r4 r4Var : Collections.unmodifiableCollection(s4Var.b)) {
                View view = (View) r4Var.c.get();
                if (r4Var.e && !r4Var.f) {
                    String str2 = r4Var.g;
                    if (view != null) {
                        boolean zDern = leukopoietic.dern(view);
                        if (zDern) {
                            this.h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.i.containsKey(view)) {
                                bool = (Boolean) this.i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zDern) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strAttabal = leukopoietic.attabal(view2);
                                    if (strAttabal != null) {
                                        str = strAttabal;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(str2);
                            this.a.put(view, str2);
                            for (uk0 uk0Var : r4Var.b.a) {
                                View view3 = (View) uk0Var.a.get();
                                if (view3 != null) {
                                    r7 r7Var = (r7) this.b.get(view3);
                                    if (r7Var != null) {
                                        r7Var.b.add(r4Var.g);
                                    } else {
                                        this.b.put(view3, new r7(uk0Var, r4Var.g));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(str2);
                            this.c.put(str2, view);
                            this.g.put(str2, str);
                        }
                    } else {
                        this.f.add(str2);
                        this.g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
