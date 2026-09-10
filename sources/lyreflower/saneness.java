package lyreflower;

import com.ironsource.L6;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DFS.java */
/* JADX INFO: loaded from: classes5.dex */
public class saneness {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* JADX INFO: compiled from: DFS.java */
    public static class attabal<N> extends AbstractC0726saneness<N, Boolean> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function1 f33207attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ boolean[] f33208saneness;

        public attabal(Function1 function1, boolean[] zArr) {
            this.f33207attabal = function1;
            this.f33208saneness = zArr;
        }

        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public Boolean result() {
            return Boolean.valueOf(this.f33208saneness[0]);
        }

        @Override // lyreflower.saneness.wireman
        public boolean saneness(N n) {
            if (((Boolean) this.f33207attabal.invoke(n)).booleanValue()) {
                this.f33208saneness[0] = true;
            }
            return !this.f33208saneness[0];
        }
    }

    /* JADX INFO: compiled from: DFS.java */
    public static class beachfront<N> implements marial<N> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Set<N> f33209attabal;

        public beachfront() {
            this(new HashSet());
        }

        public static /* synthetic */ void saneness(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // lyreflower.saneness.marial
        public boolean attabal(N n) {
            return this.f33209attabal.add(n);
        }

        public beachfront(Set<N> set) {
            if (set == null) {
                saneness(0);
            }
            this.f33209attabal = set;
        }
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface dern<N> {
        Iterable<? extends N> attabal(N n);
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface marial<N> {
        boolean attabal(N n);
    }

    /* JADX INFO: compiled from: DFS.java */
    public interface wireman<N, R> {
        void attabal(N n);

        R result();

        boolean saneness(N n);
    }

    public static /* synthetic */ void attabal(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = L6.m;
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dern(Collection<N> collection2, dern<N> dernVar, marial<N> marialVar, wireman<N, R> wiremanVar) {
        if (collection2 == null) {
            attabal(0);
        }
        if (dernVar == null) {
            attabal(1);
        }
        if (marialVar == null) {
            attabal(2);
        }
        if (wiremanVar == null) {
            attabal(3);
        }
        Iterator<N> it = collection2.iterator();
        while (it.hasNext()) {
            wireman(it.next(), dernVar, marialVar, wiremanVar);
        }
        return wiremanVar.result();
    }

    public static <N> Boolean marial(Collection<N> collection2, dern<N> dernVar, Function1<N, Boolean> function1) {
        if (collection2 == null) {
            attabal(7);
        }
        if (dernVar == null) {
            attabal(8);
        }
        if (function1 == null) {
            attabal(9);
        }
        return (Boolean) saneness(collection2, dernVar, new attabal(function1, new boolean[1]));
    }

    public static <N, R> R saneness(Collection<N> collection2, dern<N> dernVar, wireman<N, R> wiremanVar) {
        if (collection2 == null) {
            attabal(4);
        }
        if (dernVar == null) {
            attabal(5);
        }
        if (wiremanVar == null) {
            attabal(6);
        }
        return (R) dern(collection2, dernVar, new beachfront(), wiremanVar);
    }

    public static <N> void wireman(N n, dern<N> dernVar, marial<N> marialVar, wireman<N, ?> wiremanVar) {
        if (n == null) {
            attabal(22);
        }
        if (dernVar == null) {
            attabal(23);
        }
        if (marialVar == null) {
            attabal(24);
        }
        if (wiremanVar == null) {
            attabal(25);
        }
        if (marialVar.attabal(n) && wiremanVar.saneness(n)) {
            Iterator<? extends N> it = dernVar.attabal(n).iterator();
            while (it.hasNext()) {
                wireman(it.next(), dernVar, marialVar, wiremanVar);
            }
            wiremanVar.attabal(n);
        }
    }

    /* JADX INFO: renamed from: lyreflower.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DFS.java */
    public static abstract class AbstractC0726saneness<N, R> implements wireman<N, R> {
        @Override // lyreflower.saneness.wireman
        public void attabal(N n) {
        }
    }
}
