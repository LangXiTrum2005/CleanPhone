package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) ((View) obj).getLayoutParams();
        c cVar2 = (c) ((View) obj2).getLayoutParams();
        boolean z10 = cVar.f4991a;
        if (z10 != cVar2.f4991a) {
            return z10 ? 1 : -1;
        }
        return cVar.f4995e - cVar2.f4995e;
    }
}
