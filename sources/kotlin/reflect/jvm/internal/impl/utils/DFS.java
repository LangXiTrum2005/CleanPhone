package kotlin.reflect.jvm.internal.impl.utils;

import com.p004ironsource.ne;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void b(Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean c(Object obj) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public final Object a() {
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler.result must not return null");
        }
    }

    public interface Neighbors<N> {
        Iterable a(Object obj);
    }

    public interface NodeHandler<N, R> {
        Object a();

        void b(Object obj);

        boolean c(Object obj);
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
    }

    public interface Visited<N> {
    }

    public static class VisitedWithSet<N> implements Visited<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f44644a = new HashSet();
    }

    public static Object a(Collection collection, Neighbors neighbors, AbstractNodeHandler abstractNodeHandler) {
        VisitedWithSet visitedWithSet = new VisitedWithSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(it.next(), neighbors, visitedWithSet, abstractNodeHandler);
        }
        return abstractNodeHandler.a();
    }

    public static void b(Object obj, Neighbors neighbors, VisitedWithSet visitedWithSet, AbstractNodeHandler abstractNodeHandler) {
        if (obj != null) {
            if (visitedWithSet.f44644a.add(obj) && abstractNodeHandler.c(obj)) {
                Iterator it = neighbors.a(obj).iterator();
                while (it.hasNext()) {
                    b(it.next(), neighbors, visitedWithSet, abstractNodeHandler);
                }
                abstractNodeHandler.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
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
        switch (22) {
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
                objArr[2] = ne.m;
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Boolean c(Collection collection, Neighbors neighbors, final Function1 function1) {
        final boolean[] zArr = new boolean[1];
        return (Boolean) a(collection, neighbors, new AbstractNodeHandler<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.DFS.1
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final Object a() {
                return Boolean.valueOf(zArr[0]);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean c(Object obj) {
                boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
                boolean[] zArr2 = zArr;
                if (zBooleanValue) {
                    zArr2[0] = true;
                }
                return !zArr2[0];
            }
        });
    }
}
