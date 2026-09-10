package androidx.compose.runtime.collection;

import androidx.collection.ObjectList;
import androidx.collection.grimness;
import androidx.collection.hydrovane;
import androidx.collection.seminary;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: MultiValueMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/saneness;", "", "K", "V", "Landroidx/collection/grimness;", "map", "wireman", "(Landroidx/collection/grimness;)Landroidx/collection/grimness;", X3.i.W, "value", "", "attabal", "(Landroidx/collection/grimness;Ljava/lang/Object;Ljava/lang/Object;)V", "dern", "(Landroidx/collection/grimness;)V", "", "beachfront", "(Landroidx/collection/grimness;Ljava/lang/Object;)Z", "Landroidx/collection/ObjectList;", "impromptu", "(Landroidx/collection/grimness;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "cutely", "(Landroidx/collection/grimness;)Z", "apical", "impassible", "(Landroidx/collection/grimness;Ljava/lang/Object;)Ljava/lang/Object;", "formularize", "monoploid", "(Landroidx/collection/grimness;)Landroidx/collection/ObjectList;", "Lkotlin/Function1;", "condition", "triweekly", "(Landroidx/collection/grimness;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "Landroidx/collection/grimness;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final grimness<Object, Object> map;

    public /* synthetic */ saneness(grimness grimnessVar) {
        this.map = grimnessVar;
    }

    public static final boolean apical(grimness<Object, Object> grimnessVar) {
        return grimnessVar.competently();
    }

    public static final void attabal(grimness<Object, Object> grimnessVar, K k, V v) {
        int iFormularize = grimnessVar.formularize(k);
        boolean z = iFormularize < 0;
        Object obj = z ? null : grimnessVar.values[iFormularize];
        rotuma.triweekly(obj);
        if (obj != null) {
            if (obj instanceof seminary) {
                Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                seminary seminaryVar = (seminary) obj;
                seminaryVar.triweekly(v);
                v = (V) seminaryVar;
            } else {
                v = (V) hydrovane.impromptu(obj, v);
            }
        }
        if (!z) {
            grimnessVar.values[iFormularize] = v;
            return;
        }
        int i = ~iFormularize;
        grimnessVar.keys[i] = k;
        grimnessVar.values[i] = v;
    }

    public static final boolean beachfront(grimness<Object, Object> grimnessVar, K k) {
        return grimnessVar.attabal(k);
    }

    public static boolean competently(grimness<Object, Object> grimnessVar, Object obj) {
        return (obj instanceof saneness) && Intrinsics.wireman(grimnessVar, ((saneness) obj).getMap());
    }

    public static final boolean cutely(grimness<Object, Object> grimnessVar) {
        return grimnessVar.beachfront();
    }

    public static final void dern(grimness<Object, Object> grimnessVar) {
        grimnessVar.taiyuan();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V formularize(grimness<Object, Object> grimnessVar, K k) {
        V v = (V) grimnessVar.dern(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof seminary)) {
            grimnessVar.monoploid(k);
            return v;
        }
        seminary seminaryVar = (seminary) v;
        V v2 = (V) seminaryVar.preprohormone(0);
        if (seminaryVar.competently()) {
            grimnessVar.monoploid(k);
        }
        if (seminaryVar.get_size() == 1) {
            grimnessVar.graveside(k, seminaryVar.dern());
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V impassible(grimness<Object, Object> grimnessVar, K k) {
        V v = (V) grimnessVar.dern(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof seminary)) {
            grimnessVar.monoploid(k);
            return v;
        }
        seminary seminaryVar = (seminary) v;
        V v2 = (V) attabal.saneness(seminaryVar);
        Intrinsics.competently(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (seminaryVar.competently()) {
            grimnessVar.monoploid(k);
        }
        if (seminaryVar.get_size() == 1) {
            grimnessVar.graveside(k, seminaryVar.dern());
        }
        return v2;
    }

    public static final ObjectList<V> impromptu(grimness<Object, Object> grimnessVar, K k) {
        Object objDern = grimnessVar.dern(k);
        if (objDern == null) {
            return hydrovane.beachfront();
        }
        return objDern instanceof seminary ? (ObjectList) objDern : hydrovane.taiyuan(objDern);
    }

    public static String kowloon(grimness<Object, Object> grimnessVar) {
        return "MultiValueMap(map=" + grimnessVar + ')';
    }

    public static /* synthetic */ grimness marial(grimness grimnessVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            grimnessVar = new grimness(0, i2, null);
        }
        return wireman(grimnessVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[LOOP:0: B:9:0x001d->B:22:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[EDGE_INSN: B:25:0x0069->B:23:0x0069 BREAK  A[LOOP:0: B:9:0x001d->B:22:0x0066], SYNTHETIC] */
    public static final ObjectList<V> monoploid(grimness<Object, Object> grimnessVar) {
        if (grimnessVar.beachfront()) {
            return hydrovane.beachfront();
        }
        seminary seminaryVar = new seminary(0, 1, null);
        Object[] objArr = grimnessVar.values;
        long[] jArr = grimnessVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof seminary) {
                                Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                seminaryVar.arytenoidectomy((seminary) obj);
                            } else {
                                Intrinsics.competently(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                seminaryVar.triweekly(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return seminaryVar;
    }

    public static final /* synthetic */ saneness saneness(grimness grimnessVar) {
        return new saneness(grimnessVar);
    }

    public static int taiyuan(grimness<Object, Object> grimnessVar) {
        return grimnessVar.hashCode();
    }

    public static final void triweekly(grimness<Object, Object> grimnessVar, K k, Function1<? super V, Boolean> function1) {
        Object objDern = grimnessVar.dern(k);
        if (objDern != null) {
            if (!(objDern instanceof seminary)) {
                if (function1.invoke(objDern).booleanValue()) {
                    grimnessVar.monoploid(k);
                    return;
                }
                return;
            }
            seminary seminaryVar = (seminary) objDern;
            int i = seminaryVar._size;
            Object[] objArr = seminaryVar.content;
            int i2 = 0;
            IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, i);
            int first = intRangeMonoploid.getFirst();
            int last = intRangeMonoploid.getLast();
            if (first <= last) {
                while (true) {
                    objArr[first - i2] = objArr[first];
                    if (function1.invoke(objArr[first]).booleanValue()) {
                        i2++;
                    }
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            arytenoidectomy.molybdenite(objArr, null, i - i2, i);
            seminaryVar._size -= i2;
            if (seminaryVar.competently()) {
                grimnessVar.monoploid(k);
            }
            if (seminaryVar.get_size() == 0) {
                grimnessVar.graveside(k, seminaryVar.dern());
            }
        }
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final /* synthetic */ grimness getMap() {
        return this.map;
    }

    public boolean equals(Object other) {
        return competently(this.map, other);
    }

    public int hashCode() {
        return taiyuan(this.map);
    }

    public String toString() {
        return kowloon(this.map);
    }

    public static <K, V> grimness<Object, Object> wireman(grimness<Object, Object> grimnessVar) {
        return grimnessVar;
    }
}
