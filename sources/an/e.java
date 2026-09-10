package an;

import ea.f2;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xj.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f3786a;

    public e(f2 f2Var) {
        this.f3786a = f2Var;
    }

    @Override // xj.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        String strGroup = ((Matcher) this.f3786a.f39409b).group(i10);
        return strGroup == null ? "" : strGroup;
    }

    @Override // xj.a
    public final int getSize() {
        return ((Matcher) this.f3786a.f39409b).groupCount() + 1;
    }

    @Override // xj.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // xj.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
