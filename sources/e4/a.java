package e4;

import com.google.android.gms.internal.ads.ya1;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f39074b;

    public a(ya1 topics) {
        n.f(topics, "topics");
        this.f39073a = topics;
        this.f39074b = v.f53866a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        List list = this.f39073a;
        int size = list.size();
        a aVar = (a) obj;
        v vVar = aVar.f39074b;
        List list2 = aVar.f39073a;
        if (size != list2.size()) {
            return false;
        }
        v vVar2 = this.f39074b;
        vVar2.getClass();
        vVar.getClass();
        return new HashSet(list).equals(new HashSet(list2)) && new HashSet(vVar2).equals(new HashSet(vVar));
    }

    public final int hashCode() {
        return Objects.hash(this.f39073a, this.f39074b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.f39073a + ", EncryptedTopics=" + this.f39074b;
    }
}
