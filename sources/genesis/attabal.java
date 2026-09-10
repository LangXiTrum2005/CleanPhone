package genesis;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BinaryVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final C0616attabal f26662beachfront = new C0616attabal(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int[] f26663attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f26664dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<Integer> f26665marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f26666saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f26667wireman;

    /* JADX INFO: renamed from: genesis.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinaryVersion.kt */
    public static final class C0616attabal {
        public /* synthetic */ C0616attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0616attabal() {
        }
    }

    public attabal(int... numbers) {
        List<Integer> listFormularize;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f26663attabal = numbers;
        Integer numPeridotite = polloi.peridotite(numbers, 0);
        this.f26666saneness = numPeridotite != null ? numPeridotite.intValue() : -1;
        Integer numPeridotite2 = polloi.peridotite(numbers, 1);
        this.f26664dern = numPeridotite2 != null ? numPeridotite2.intValue() : -1;
        Integer numPeridotite3 = polloi.peridotite(numbers, 2);
        this.f26667wireman = numPeridotite3 != null ? numPeridotite3.intValue() : -1;
        if (numbers.length <= 3) {
            listFormularize = adultoid.formularize();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listFormularize = CollectionsKt.molet(arytenoidectomy.dern(numbers).subList(3, numbers.length));
        }
        this.f26665marial = listFormularize;
    }

    public final int attabal() {
        return this.f26666saneness;
    }

    public final boolean beachfront(attabal ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i = this.f26666saneness;
        if (i == 0) {
            return ourVersion.f26666saneness == 0 && this.f26664dern == ourVersion.f26664dern;
        }
        return i == ourVersion.f26666saneness && this.f26664dern <= ourVersion.f26664dern;
    }

    public final int[] competently() {
        return this.f26663attabal;
    }

    public final boolean dern(int i, int i2, int i3) {
        int i4 = this.f26666saneness;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f26664dern;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f26667wireman >= i3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !Intrinsics.wireman(getClass(), obj.getClass())) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        return this.f26666saneness == attabalVar.f26666saneness && this.f26664dern == attabalVar.f26664dern && this.f26667wireman == attabalVar.f26667wireman && Intrinsics.wireman(this.f26665marial, attabalVar.f26665marial);
    }

    public int hashCode() {
        int i = this.f26666saneness;
        int i2 = i + (i * 31) + this.f26664dern;
        int i3 = i2 + (i2 * 31) + this.f26667wireman;
        return i3 + (i3 * 31) + this.f26665marial.hashCode();
    }

    public final boolean marial(int i, int i2, int i3) {
        int i4 = this.f26666saneness;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.f26664dern;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.f26667wireman <= i3;
    }

    public final int saneness() {
        return this.f26664dern;
    }

    public String toString() {
        int[] iArrCompetently = competently();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrCompetently) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.preterite(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean wireman(attabal version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return dern(version.f26666saneness, version.f26664dern, version.f26667wireman);
    }
}
