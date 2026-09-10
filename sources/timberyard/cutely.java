package timberyard;

import p002kotlin.Metadata;
import restrictive.overspeculate;
import restrictive.privatdozent;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u0007R\u001a\u0010\u0005\u001a\u00020\u00028&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Ltimberyard/cutely;", "", "Lrestrictive/overspeculate;", "dern", "()J", "color", "Lrestrictive/privatdozent;", "saneness", "()Lrestrictive/privatdozent;", "brush", "", "attabal", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f38842attabal;

    /* JADX INFO: renamed from: timberyard.cutely$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Ltimberyard/cutely$attabal;", "", "<init>", "()V", "Lrestrictive/overspeculate;", "color", "Ltimberyard/cutely;", "attabal", "(J)Ltimberyard/cutely;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f38842attabal = new Companion();

        public final cutely attabal(long color) {
            return color != 16 ? new ColorStyle(color, null) : saneness.f38843saneness;
        }
    }

    /* JADX INFO: compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Ltimberyard/cutely$saneness;", "Ltimberyard/cutely;", "<init>", "()V", "Lrestrictive/overspeculate;", "dern", "()J", "color", "Lrestrictive/privatdozent;", "saneness", "()Lrestrictive/privatdozent;", "brush", "", "attabal", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements cutely {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final saneness f38843saneness = new saneness();

        @Override // timberyard.cutely
        public float attabal() {
            return Float.NaN;
        }

        @Override // timberyard.cutely
        /* JADX INFO: renamed from: dern */
        public long getValue() {
            return overspeculate.INSTANCE.marial();
        }

        @Override // timberyard.cutely
        public privatdozent saneness() {
            return null;
        }
    }

    float attabal();

    /* JADX INFO: renamed from: dern */
    long getValue();

    privatdozent saneness();
}
