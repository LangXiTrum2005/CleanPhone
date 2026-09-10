package androidx.media3.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ int X;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.X) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
