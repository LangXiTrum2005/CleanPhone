package j0;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f43544c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f43542a, aVar.f43542a) && Objects.equals(this.f43543b, aVar.f43543b) && Objects.equals(this.f43544c, aVar.f43544c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43542a, this.f43543b, this.f43544c);
    }
}
