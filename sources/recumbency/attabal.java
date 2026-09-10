package recumbency;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.kattegat;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: BuiltInsBinaryVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends genesis.attabal {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final C0780attabal f36069competently = new C0780attabal(null);

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f36070impromptu = new attabal(1, 0, 7);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final attabal f36071taiyuan = new attabal(new int[0]);

    /* JADX INFO: renamed from: recumbency.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInsBinaryVersion.kt */
    public static final class C0780attabal {
        public /* synthetic */ C0780attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final attabal attabal(InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(dovishness.gintrap(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((kattegat) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrDeadwork = CollectionsKt.deadwork(arrayList);
            return new attabal(Arrays.copyOf(iArrDeadwork, iArrDeadwork.length));
        }

        public C0780attabal() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public attabal(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public boolean impromptu() {
        return beachfront(f36070impromptu);
    }
}
