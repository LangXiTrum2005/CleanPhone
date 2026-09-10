package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f22773b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22774a = new ArrayList();

    public final void a(View view, my0 my0Var) {
        yy0 yy0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f22773b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.f22774a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                yy0Var = null;
                break;
            }
            yy0Var = (yy0) it.next();
        } while (yy0Var.f22409a.get() != view);
        if (yy0Var == null) {
            arrayList.add(new yy0(view, my0Var));
        }
    }
}
