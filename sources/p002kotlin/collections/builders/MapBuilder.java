package p002kotlin.collections.builders;

import com.ironsource.A5;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import unready.attabal;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\b\b\u0000\u0018\u0000 \u0097\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\b\u0098\u0001+:$%\u0099\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0013J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020 H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020 2\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\"J\u0017\u00101\u001a\u00020\f2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u0010)J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00028\u0001H\u0002¢\u0006\u0004\b3\u0010)J\u0017\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u0013J\u0017\u00107\u001a\u00020\u00192\u0006\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0013J\u001f\u0010:\u001a\u00020 2\u000e\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000308H\u0002¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020 2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0002¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020 2\u0018\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0@H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020 H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020 2\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020 2\u0006\u00102\u001a\u00028\u0001H\u0016¢\u0006\u0004\bJ\u0010IJ\u001a\u0010K\u001a\u0004\u0018\u00018\u00012\u0006\u0010'\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ!\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010'\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0001H\u0016¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00192\u0014\u0010A\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108H\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u0004\u0018\u00018\u00012\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\bQ\u0010LJ\u000f\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bR\u0010\u0011J\u001a\u0010S\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\bS\u0010IJ\u000f\u0010T\u001a\u00020\fH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020\u0019H\u0000¢\u0006\u0004\bY\u0010\u0011J\u0017\u0010\\\u001a\u00020\f2\u0006\u0010'\u001a\u00028\u0000H\u0000¢\u0006\u0004\b[\u0010)J\u0017\u0010^\u001a\u00020 2\u0006\u0010'\u001a\u00028\u0000H\u0000¢\u0006\u0004\b]\u0010IJ#\u0010`\u001a\u00020 2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0000¢\u0006\u0004\b_\u0010?J\u001b\u0010c\u001a\u00020 2\n\u0010a\u001a\u0006\u0012\u0002\b\u00030@H\u0000¢\u0006\u0004\bb\u0010CJ#\u0010e\u001a\u00020 2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<H\u0000¢\u0006\u0004\bd\u0010?J\u0017\u0010h\u001a\u00020 2\u0006\u0010f\u001a\u00028\u0001H\u0000¢\u0006\u0004\bg\u0010IJ\u001b\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010iH\u0000¢\u0006\u0004\bj\u0010kJ\u001b\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0004\bn\u0010oJ\u001b\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010qH\u0000¢\u0006\u0004\br\u0010sR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010uR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010uR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010vR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010vR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010wR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010wR\u0016\u0010x\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010wR\u0016\u0010y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010wR$\u0010z\u001a\u00020\f2\u0006\u00102\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bz\u0010w\u001a\u0004\b{\u0010UR\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R!\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020 2\u0006\u00102\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010GR\u0016\u0010\u0089\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010UR\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008e\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R+\u0010\u0094\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0092\u00010\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010U¨\u0006\u009a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "monoploid", A5.q, "competently", "extraCapacity", "", "adultoid", "(I)Z", "minCapacity", "beachfront", "saneness", "()[Ljava/lang/Object;", X3.i.W, "impassible", "(Ljava/lang/Object;)I", "updateHashArray", "wireman", "(Z)V", "newHashSize", "polloi", "i", "arytenoidectomy", "impromptu", "value", "taiyuan", "index", "molybdenite", "removedHash", "graveside", "", C3414a2.d, "marial", "(Ljava/util/Map;)Z", "", "entry", "kowloon", "(Ljava/util/Map$Entry;)Z", "", "from", "triweekly", "(Ljava/util/Collection;)Z", "build", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "addKey", "removeKey$kotlin_stdlib", "removeKey", "containsEntry$kotlin_stdlib", "containsEntry", "m", "containsAllEntries$kotlin_stdlib", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$marial;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$marial;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$beachfront;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$beachfront;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$saneness;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$saneness;", "entriesIterator", "[Ljava/lang/Object;", "[I", "I", "hashShift", "modCount", "size", "getSize", "Lkotlin/collections/builders/saneness;", "keysView", "Lkotlin/collections/builders/saneness;", "Lkotlin/collections/builders/dern;", "valuesView", "Lkotlin/collections/builders/dern;", "Lkotlin/collections/builders/attabal;", "entriesView", "Lkotlin/collections/builders/attabal;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "cutely", "hashSize", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "Companion", "attabal", "dern", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, unready.marial {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final MapBuilder f29319kowloon;
    private attabal<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private p002kotlin.collections.builders.saneness<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private p002kotlin.collections.builders.dern<V> valuesView;

    /* JADX INFO: renamed from: kotlin.collections.builders.MapBuilder$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/collections/builders/MapBuilder$attabal;", "", "<init>", "()V", "", "capacity", "dern", "(I)I", "hashSize", "wireman", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "marial", "()Lkotlin/collections/builders/MapBuilder;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int dern(int capacity) {
            return Integer.highestOneBit(p002kotlin.ranges.wireman.wireman(capacity, 1) * 3);
        }

        public final MapBuilder marial() {
            return MapBuilder.f29319kowloon;
        }

        public final int wireman(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$beachfront;", "K", "V", "Lkotlin/collections/builders/MapBuilder$wireman;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class beachfront<K, V> extends wireman<K, V> implements Iterator<V>, attabal {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public beachfront(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            saneness();
            if (getIndex() >= ((MapBuilder) beachfront()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            impromptu(index + 1);
            taiyuan(index);
            Object[] objArr = ((MapBuilder) beachfront()).valuesArray;
            Intrinsics.beachfront(objArr);
            V v = (V) objArr[getLastIndex()];
            competently();
            return v;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\"\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lkotlin/collections/builders/MapBuilder$dern;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "", "saneness", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "Lkotlin/collections/builders/MapBuilder;", "arytenoidectomy", "I", "monoploid", "expectedModCount", "getKey", "()Ljava/lang/Object;", X3.i.W, "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class dern<K, V> implements Map.Entry<K, V>, attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final MapBuilder<K, V> map;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public final int expectedModCount;

        public dern(MapBuilder<K, V> map, int i) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i;
            this.expectedModCount = ((MapBuilder) map).modCount;
        }

        private final void saneness() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return Intrinsics.wireman(entry.getKey(), getKey()) && Intrinsics.wireman(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            saneness();
            return (K) ((MapBuilder) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            saneness();
            Object[] objArr = ((MapBuilder) this.map).valuesArray;
            Intrinsics.beachfront(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            saneness();
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] objArrSaneness = this.map.saneness();
            int i = this.index;
            V v = (V) objArrSaneness[i];
            objArrSaneness[i] = newValue;
            return v;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$marial;", "K", "V", "Lkotlin/collections/builders/MapBuilder$wireman;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class marial<K, V> extends wireman<K, V> implements Iterator<K>, attabal {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public marial(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            saneness();
            if (getIndex() >= ((MapBuilder) beachfront()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            impromptu(index + 1);
            taiyuan(index);
            K k = (K) ((MapBuilder) beachfront()).keysArray[getLastIndex()];
            competently();
            return k;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/MapBuilder$saneness;", "K", "V", "Lkotlin/collections/builders/MapBuilder$wireman;", "", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "Lkotlin/collections/builders/MapBuilder$dern;", "cutely", "()Lkotlin/collections/builders/MapBuilder$dern;", "", "triweekly", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "impassible", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<K, V> extends wireman<K, V> implements Iterator<Map.Entry<K, V>>, attabal {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public dern<K, V> next() {
            saneness();
            if (getIndex() >= ((MapBuilder) beachfront()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            impromptu(index + 1);
            taiyuan(index);
            dern<K, V> dernVar = new dern<>(beachfront(), getLastIndex());
            competently();
            return dernVar;
        }

        public final void impassible(StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (getIndex() >= ((MapBuilder) beachfront()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            impromptu(index + 1);
            taiyuan(index);
            Object obj = ((MapBuilder) beachfront()).keysArray[getLastIndex()];
            if (obj == beachfront()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) beachfront()).valuesArray;
            Intrinsics.beachfront(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == beachfront()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            competently();
        }

        public final int triweekly() {
            if (getIndex() >= ((MapBuilder) beachfront()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            impromptu(index + 1);
            taiyuan(index);
            Object obj = ((MapBuilder) beachfront()).keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) beachfront()).valuesArray;
            Intrinsics.beachfront(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            competently();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0016¨\u0006\""}, d2 = {"Lkotlin/collections/builders/MapBuilder$wireman;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "competently", "()V", "", "hasNext", "()Z", "remove", "saneness", "kowloon", "Lkotlin/collections/builders/MapBuilder;", "beachfront", "()Lkotlin/collections/builders/MapBuilder;", "", "arytenoidectomy", "I", "wireman", "()I", "impromptu", "(I)V", "index", "monoploid", "marial", "taiyuan", "lastIndex", "polloi", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class wireman<K, V> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final MapBuilder<K, V> map;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public int lastIndex;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
        public int expectedModCount;

        public wireman(MapBuilder<K, V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) map).modCount;
            competently();
        }

        public final MapBuilder<K, V> beachfront() {
            return this.map;
        }

        public final void competently() {
            while (this.index < ((MapBuilder) this.map).length) {
                int[] iArr = ((MapBuilder) this.map).presenceArray;
                int i = this.index;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.index = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public final void impromptu(int i) {
            this.index = i;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final void remove() {
            saneness();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.molybdenite(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) this.map).modCount;
        }

        public final void saneness() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void taiyuan(int i) {
            this.lastIndex = i;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final int getIndex() {
            return this.index;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f29319kowloon = mapBuilder;
    }

    public MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = INSTANCE.wireman(cutely());
    }

    private final void beachfront(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > getCapacity$kotlin_stdlib()) {
            int iMarial = p002kotlin.collections.wireman.INSTANCE.marial(getCapacity$kotlin_stdlib(), minCapacity);
            this.keysArray = (K[]) spring.saneness.marial(this.keysArray, iMarial);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) spring.saneness.marial(vArr, iMarial) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iMarial);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iDern = INSTANCE.dern(iMarial);
            if (iDern > cutely()) {
                polloi(iDern);
            }
        }
    }

    private final void competently(int n) {
        if (adultoid(n)) {
            wireman(true);
        } else {
            beachfront(this.length + n);
        }
    }

    private final void monoploid() {
        this.modCount++;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iImpassible = impassible(key);
            int iCompetently = p002kotlin.ranges.wireman.competently(this.maxProbeDistance * 2, cutely() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[iImpassible];
                if (i2 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        competently(1);
                        break;
                    }
                    int i3 = this.length;
                    int i4 = i3 + 1;
                    this.length = i4;
                    this.keysArray[i3] = key;
                    this.presenceArray[i3] = iImpassible;
                    this.hashArray[iImpassible] = i4;
                    this.size = size() + 1;
                    monoploid();
                    if (i > this.maxProbeDistance) {
                        this.maxProbeDistance = i;
                    }
                    return i3;
                }
                if (Intrinsics.wireman(this.keysArray[i2 - 1], key)) {
                    return -i2;
                }
                i++;
                if (i > iCompetently) {
                    polloi(cutely() * 2);
                    break;
                }
                iImpassible = iImpassible == 0 ? cutely() - 1 : iImpassible - 1;
            }
        }
    }

    public final boolean adultoid(int extraCapacity) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i = this.length;
        int i2 = capacity$kotlin_stdlib - i;
        int size = i - size();
        return i2 < extraCapacity && i2 + size >= extraCapacity && size >= getCapacity$kotlin_stdlib() / 4;
    }

    public final boolean arytenoidectomy(int i) {
        int iImpassible = impassible(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iImpassible] == 0) {
                iArr[iImpassible] = i + 1;
                this.presenceArray[i] = iImpassible;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iImpassible = iImpassible == 0 ? cutely() - 1 : iImpassible - 1;
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f29319kowloon;
        Intrinsics.competently(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        spring.saneness.competently(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            spring.saneness.competently(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        monoploid();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iImpromptu = impromptu(entry.getKey());
        if (iImpromptu < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.beachfront(vArr);
        return Intrinsics.wireman(vArr[iImpromptu], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return impromptu(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return taiyuan(value) >= 0;
    }

    public final int cutely() {
        return this.hashArray.length;
    }

    public final saneness<K, V> entriesIterator$kotlin_stdlib() {
        return new saneness<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && marial((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iImpromptu = impromptu(key);
        if (iImpromptu < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.beachfront(vArr);
        return vArr[iImpromptu];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        attabal<K, V> attabalVar = this.entriesView;
        if (attabalVar != null) {
            return attabalVar;
        }
        attabal<K, V> attabalVar2 = new attabal<>(this);
        this.entriesView = attabalVar2;
        return attabalVar2;
    }

    public Set<K> getKeys() {
        p002kotlin.collections.builders.saneness<K> sanenessVar = this.keysView;
        if (sanenessVar != null) {
            return sanenessVar;
        }
        p002kotlin.collections.builders.saneness<K> sanenessVar2 = new p002kotlin.collections.builders.saneness<>(this);
        this.keysView = sanenessVar2;
        return sanenessVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        p002kotlin.collections.builders.dern<V> dernVar = this.valuesView;
        if (dernVar != null) {
            return dernVar;
        }
        p002kotlin.collections.builders.dern<V> dernVar2 = new p002kotlin.collections.builders.dern<>(this);
        this.valuesView = dernVar2;
        return dernVar2;
    }

    public final void graveside(int removedHash) {
        int iCompetently = p002kotlin.ranges.wireman.competently(this.maxProbeDistance * 2, cutely() / 2);
        int i = 0;
        int i2 = removedHash;
        do {
            removedHash = removedHash == 0 ? cutely() - 1 : removedHash - 1;
            i++;
            if (i > this.maxProbeDistance) {
                this.hashArray[i2] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i3 = iArr[removedHash];
            if (i3 == 0) {
                iArr[i2] = 0;
                return;
            }
            if (i3 < 0) {
                iArr[i2] = -1;
            } else {
                int i4 = i3 - 1;
                if (((impassible(this.keysArray[i4]) - removedHash) & (cutely() - 1)) >= i) {
                    this.hashArray[i2] = i3;
                    this.presenceArray[i4] = i2;
                }
                iCompetently--;
            }
            i2 = removedHash;
            i = 0;
            iCompetently--;
        } while (iCompetently >= 0);
        this.hashArray[i2] = -1;
    }

    @Override // java.util.Map
    public int hashCode() {
        saneness<K, V> sanenessVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iTriweekly = 0;
        while (sanenessVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iTriweekly += sanenessVarEntriesIterator$kotlin_stdlib.triweekly();
        }
        return iTriweekly;
    }

    public final int impassible(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    public final int impromptu(K key) {
        int iImpassible = impassible(key);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[iImpassible];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (Intrinsics.wireman(this.keysArray[i3], key)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iImpassible = iImpassible == 0 ? cutely() - 1 : iImpassible - 1;
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final marial<K, V> keysIterator$kotlin_stdlib() {
        return new marial<>(this);
    }

    public final boolean kowloon(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrSaneness = saneness();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrSaneness[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        if (Intrinsics.wireman(entry.getValue(), vArrSaneness[i])) {
            return false;
        }
        vArrSaneness[i] = entry.getValue();
        return true;
    }

    public final boolean marial(Map<?, ?> other) {
        return size() == other.size() && containsAllEntries$kotlin_stdlib(other.entrySet());
    }

    public final void molybdenite(int index) {
        spring.saneness.beachfront(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            spring.saneness.beachfront(vArr, index);
        }
        graveside(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        monoploid();
    }

    public final void polloi(int newHashSize) {
        monoploid();
        int i = 0;
        if (this.length > size()) {
            wireman(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.wireman(newHashSize);
        while (i < this.length) {
            int i2 = i + 1;
            if (!arytenoidectomy(i)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] vArrSaneness = saneness();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrSaneness[iAddKey$kotlin_stdlib] = value;
            return null;
        }
        int i = (-iAddKey$kotlin_stdlib) - 1;
        V v = vArrSaneness[i];
        vArrSaneness[i] = value;
        return v;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        triweekly(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        checkIsMutable$kotlin_stdlib();
        int iImpromptu = impromptu(key);
        if (iImpromptu < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.beachfront(vArr);
        V v = vArr[iImpromptu];
        molybdenite(iImpromptu);
        return v;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iImpromptu = impromptu(entry.getKey());
        if (iImpromptu < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.beachfront(vArr);
        if (!Intrinsics.wireman(vArr[iImpromptu], entry.getValue())) {
            return false;
        }
        molybdenite(iImpromptu);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int iImpromptu = impromptu(key);
        if (iImpromptu < 0) {
            return false;
        }
        molybdenite(iImpromptu);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int iTaiyuan = taiyuan(element);
        if (iTaiyuan < 0) {
            return false;
        }
        molybdenite(iTaiyuan);
        return true;
    }

    public final V[] saneness() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) spring.saneness.wireman(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int taiyuan(V value) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.beachfront(vArr);
                if (Intrinsics.wireman(vArr[i], value)) {
                    return i;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        saneness<K, V> sanenessVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (sanenessVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            sanenessVarEntriesIterator$kotlin_stdlib.impassible(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean triweekly(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z = false;
        if (from.isEmpty()) {
            return false;
        }
        competently(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (kowloon(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final beachfront<K, V> valuesIterator$kotlin_stdlib() {
        return new beachfront<>(this);
    }

    public final void wireman(boolean updateHashArray) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (updateHashArray) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        spring.saneness.competently(this.keysArray, i3, i);
        if (vArr != null) {
            spring.saneness.competently(vArr, i3, this.length);
        }
        this.length = i3;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(spring.saneness.wireman(i), null, new int[i], new int[INSTANCE.dern(i)], 2, 0);
    }
}
