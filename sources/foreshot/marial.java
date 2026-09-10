package foreshot;

import java.util.Arrays;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmMetadataVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends genesis.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final marial f26280apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final marial f26281cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f26282impromptu = new attabal(null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final marial f26283taiyuan;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f26284competently;

    /* JADX INFO: compiled from: JvmMetadataVersion.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    static {
        marial marialVar = new marial(1, 9, 0);
        f26283taiyuan = marialVar;
        f26281cutely = marialVar.impassible();
        f26280apical = new marial(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f26284competently = z;
    }

    public final marial apical(boolean z) {
        marial marialVar = z ? f26283taiyuan : f26281cutely;
        return marialVar.formularize(this) ? marialVar : this;
    }

    public final boolean cutely() {
        return this.f26284competently;
    }

    public final boolean formularize(marial marialVar) {
        if (attabal() > marialVar.attabal()) {
            return true;
        }
        return attabal() >= marialVar.attabal() && saneness() > marialVar.saneness();
    }

    public final marial impassible() {
        return (attabal() == 1 && saneness() == 9) ? new marial(2, 0, 0) : new marial(attabal(), saneness() + 1, 0);
    }

    public final boolean impromptu(marial metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (attabal() == 2 && saneness() == 0) {
            marial marialVar = f26283taiyuan;
            if (marialVar.attabal() == 1 && marialVar.saneness() == 8) {
                return true;
            }
        }
        return taiyuan(metadataVersionFromLanguageVersion.apical(this.f26284competently));
    }

    public final boolean taiyuan(marial marialVar) {
        if ((attabal() == 1 && saneness() == 0) || attabal() == 0) {
            return false;
        }
        return !formularize(marialVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public marial(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
