package b0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconCompat f5094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f5095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f5096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f5098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f5099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5102i;

    public f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f5097d = true;
        this.f5101h = true;
        this.f5094a = iconCompat;
        this.f5095b = p.b(charSequence);
        this.f5096c = pendingIntent;
        this.f5098e = bundle;
        this.f5099f = null;
        this.f5097d = true;
        this.f5100g = 0;
        this.f5101h = true;
        this.f5102i = false;
    }

    public final g a() {
        CharSequence[] charSequenceArr;
        Set set;
        if (this.f5102i && this.f5096c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<q0> arrayList3 = this.f5099f;
        if (arrayList3 != null) {
            for (q0 q0Var : arrayList3) {
                if (q0Var.f5195d || (!((charSequenceArr = q0Var.f5194c) == null || charSequenceArr.length == 0) || (set = q0Var.f5198g) == null || set.isEmpty())) {
                    arrayList2.add(q0Var);
                } else {
                    arrayList.add(q0Var);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new g(this.f5094a, this.f5095b, this.f5096c, this.f5098e, arrayList2.isEmpty() ? null : (q0[]) arrayList2.toArray(new q0[arrayList2.size()]), this.f5097d, this.f5100g, this.f5101h, this.f5102i, false);
    }
}
