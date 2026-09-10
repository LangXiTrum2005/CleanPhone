package n1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements na.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46388a;

    @Override // na.i
    public final boolean apply(Object obj) {
        switch (this.f46388a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
