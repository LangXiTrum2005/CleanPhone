package vinyl;

import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lvinyl/clubfoot;", "Lkurbash/arytenoidectomy;", "origin", "<init>", "(Lkurbash/arytenoidectomy;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "Lkurbash/arytenoidectomy;", "", "Lkotlin/reflect/KTypeProjection;", "wireman", "()Ljava/util/List;", "arguments", "Lkurbash/beachfront;", "dern", "()Lkurbash/beachfront;", "classifier", "attabal", "()Z", "isMarkedNullable", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class clubfoot implements kurbash.arytenoidectomy {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final kurbash.arytenoidectomy origin;

    public clubfoot(kurbash.arytenoidectomy origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // kurbash.arytenoidectomy
    public boolean attabal() {
        return this.origin.attabal();
    }

    @Override // kurbash.arytenoidectomy
    public kurbash.beachfront dern() {
        return this.origin.dern();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        kurbash.arytenoidectomy arytenoidectomyVar = this.origin;
        clubfoot clubfootVar = other instanceof clubfoot ? (clubfoot) other : null;
        if (!Intrinsics.wireman(arytenoidectomyVar, clubfootVar != null ? clubfootVar.origin : null)) {
            return false;
        }
        kurbash.beachfront beachfrontVarDern = dern();
        if (beachfrontVarDern instanceof kurbash.wireman) {
            kurbash.arytenoidectomy arytenoidectomyVar2 = other instanceof kurbash.arytenoidectomy ? (kurbash.arytenoidectomy) other : null;
            kurbash.beachfront beachfrontVarDern2 = arytenoidectomyVar2 != null ? arytenoidectomyVar2.dern() : null;
            if (beachfrontVarDern2 != null && (beachfrontVarDern2 instanceof kurbash.wireman)) {
                return Intrinsics.wireman(gibeonite.attabal.saneness((kurbash.wireman) beachfrontVarDern), gibeonite.attabal.saneness((kurbash.wireman) beachfrontVarDern2));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }

    @Override // kurbash.arytenoidectomy
    public List<KTypeProjection> wireman() {
        return this.origin.wireman();
    }
}
