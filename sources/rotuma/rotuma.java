package rotuma;

import com.ironsource.X3;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"", "index", "shift", "beachfront", "(II)I", "K", "V", "", "", "keyIndex", X3.i.W, "value", "competently", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "Lrotuma/graveside;", "newNode", "cutely", "([Ljava/lang/Object;IILrotuma/graveside;)[Ljava/lang/Object;", "apical", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "impromptu", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "taiyuan", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class rotuma {
    public static final <K, V> Object[] apical(Object[] objArr, int i, int i2, K k, V v) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        p002kotlin.collections.arytenoidectomy.taiyuan(objArrCopyOf, objArrCopyOf, i + 2, i + 1, objArr.length);
        p002kotlin.collections.arytenoidectomy.taiyuan(objArrCopyOf, objArrCopyOf, i2 + 2, i2, i);
        objArrCopyOf[i2] = k;
        objArrCopyOf[i2 + 1] = v;
        return objArrCopyOf;
    }

    public static final int beachfront(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] competently(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p002kotlin.collections.arytenoidectomy.triweekly(objArr, objArr2, 0, 0, i, 6, null);
        p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] cutely(Object[] objArr, int i, int i2, graveside<?, ?> gravesideVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p002kotlin.collections.arytenoidectomy.triweekly(objArr, objArr2, 0, 0, i, 6, null);
        p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = gravesideVar;
        p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final Object[] impromptu(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p002kotlin.collections.arytenoidectomy.triweekly(objArr, objArr2, 0, 0, i, 6, null);
        p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] taiyuan(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        p002kotlin.collections.arytenoidectomy.triweekly(objArr, objArr2, 0, 0, i, 6, null);
        p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
