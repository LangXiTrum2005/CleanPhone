package microchemistry;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Features.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001:\u0002\u000b\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lmicrochemistry/competently;", "", "", "Lmicrochemistry/wireman;", "cubics", "<init>", "(Ljava/util/List;)V", "Lmicrochemistry/monoploid;", "f", "saneness", "(Lmicrochemistry/monoploid;)Lmicrochemistry/competently;", "attabal", "Ljava/util/List;", "()Ljava/util/List;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final List<wireman> cubics;

    /* JADX INFO: compiled from: Features.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\b\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\b\u001a\u00060\u0005j\u0002`\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lmicrochemistry/competently$attabal;", "Lmicrochemistry/competently;", "", "Lmicrochemistry/wireman;", "cubics", "Landroidx/collection/competently;", "Landroidx/graphics/shapes/Point;", "vertex", "roundedCenter", "", "convex", "<init>", "(Ljava/util/List;JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lmicrochemistry/monoploid;", "f", "saneness", "(Lmicrochemistry/monoploid;)Lmicrochemistry/competently;", "", "toString", "()Ljava/lang/String;", "J", "getVertex-1ufDz9w", "()J", "dern", "getRoundedCenter-1ufDz9w", "wireman", "Z", "()Z", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends competently {

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
        public final long center;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final long vertex;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean convex;

        public /* synthetic */ attabal(List list, long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, j2, z);
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final boolean getConvex() {
            return this.convex;
        }

        @Override // microchemistry.competently
        public competently saneness(monoploid f) {
            Intrinsics.checkNotNullParameter(f, "f");
            List listDern = p002kotlin.collections.graveside.dern();
            int size = attabal().size();
            for (int i = 0; i < size; i++) {
                listDern.add(attabal().get(i).triweekly(f));
            }
            return new attabal(p002kotlin.collections.graveside.attabal(listDern), arytenoidectomy.impassible(this.vertex, f), arytenoidectomy.impassible(this.center, f), this.convex, null);
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) androidx.collection.competently.beachfront(this.vertex)) + ", center=" + ((Object) androidx.collection.competently.beachfront(this.center)) + ", convex=" + this.convex;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(List<? extends wireman> cubics, long j, long j2, boolean z) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
            this.vertex = j;
            this.center = j2;
            this.convex = z;
        }
    }

    /* JADX INFO: compiled from: Features.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmicrochemistry/competently$saneness;", "Lmicrochemistry/competently;", "", "Lmicrochemistry/wireman;", "cubics", "<init>", "(Ljava/util/List;)V", "Lmicrochemistry/monoploid;", "f", "dern", "(Lmicrochemistry/monoploid;)Lmicrochemistry/competently$saneness;", "", "toString", "()Ljava/lang/String;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends competently {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(List<? extends wireman> cubics) {
            super(cubics);
            Intrinsics.checkNotNullParameter(cubics, "cubics");
        }

        @Override // microchemistry.competently
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public saneness saneness(monoploid f) {
            Intrinsics.checkNotNullParameter(f, "f");
            List listDern = p002kotlin.collections.graveside.dern();
            int size = attabal().size();
            for (int i = 0; i < size; i++) {
                listDern.add(attabal().get(i).triweekly(f));
            }
            return new saneness(p002kotlin.collections.graveside.attabal(listDern));
        }

        public String toString() {
            return "Edge";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public competently(List<? extends wireman> cubics) {
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.cubics = cubics;
    }

    public final List<wireman> attabal() {
        return this.cubics;
    }

    public abstract competently saneness(monoploid f);
}
