package l7;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45082a;

    public a0() {
        this.f45082a = new ArrayList();
    }

    @Override // l7.x
    public void a(String str, String value) {
        kotlin.jvm.internal.n.f(value, "value");
        this.f45082a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(value, "UTF-8")}, 2)));
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (s6.b bVar : this.f45082a) {
            if ((bVar.f50190a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f50191b)) && !arrayList.contains(bVar.f50191b)) {
                arrayList.add(bVar.f50191b);
            }
        }
        return arrayList;
    }

    public a0(ArrayList arrayList) {
        this.f45082a = arrayList;
    }
}
