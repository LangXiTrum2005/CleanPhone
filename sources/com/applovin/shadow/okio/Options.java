package com.applovin.shadow.okio;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.f;
import xj.k;
import xj.o;
import xj.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okio/Options;", "Lxj/f;", "Lcom/applovin/shadow/okio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Llo/h;[I)V", "", "index", "get", "(I)Lcom/applovin/shadow/okio/ByteString;", "[Lcom/applovin/shadow/okio/ByteString;", "getByteStrings$okio", "()[Llo/h;", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class Options extends f implements RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/applovin/shadow/okio/Options$Companion;", "", "<init>", "()V", "", "nodeOffset", "Lcom/applovin/shadow/okio/Buffer;", "node", "", "byteStringOffset", "", "Lcom/applovin/shadow/okio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lwj/r;", "buildTrieRecursive", "(JLcom/applovin/shadow/okio/Buffer;ILjava/util/List;IILjava/util/List;)V", "", "Lcom/applovin/shadow/okio/Options;", "of", "([Llo/h;)Ljava/lang/Object;", "getIntCount", "(Llo/e;)J", "intCount", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).size() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i13 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i15);
                i10 = i15;
                i11 = iIntValue;
                byteString = byteString3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (byteString.getByte(i13) == byteString2.getByte(i13)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && byteString.getByte(i17) == byteString2.getByte(i17); i17++) {
                    i16++;
                }
                long intCount = nodeOffset + getIntCount(node) + ((long) 2) + ((long) i16) + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(byteString.getByte(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i18, byteStrings, i10, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).getByte(i13) != byteStrings.get(i20).getByte(i13)) {
                    i19++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + ((long) 2) + ((long) (i19 * 2));
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte b10 = byteStrings.get(i21).getByte(i13);
                if (i21 == i10 || b10 != byteStrings.get(i21 - 1).getByte(i13)) {
                    node.writeInt(b10 & 255);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i10 < toIndex) {
                byte b11 = byteStrings.get(i10).getByte(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (b11 != byteStrings.get(i23).getByte(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).size()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j10 = intCount2;
                    buildTrieRecursive(j10, buffer2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                intCount2 = j10;
                i10 = i12;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.buildTrieRecursive(j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        public final Options of(ByteString... byteStrings) throws IOException {
            n.f(byteStrings, "byteStrings");
            g gVar = null;
            int i10 = 0;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, gVar);
            }
            ArrayList arrayListD0 = k.D0(byteStrings);
            s.Y(arrayListD0);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            ArrayList arrayListS = o.S(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayListS.set(o.N(arrayListD0, byteStrings[i11]), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((ByteString) arrayListD0.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < arrayListD0.size()) {
                ByteString byteString2 = (ByteString) arrayListD0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < arrayListD0.size()) {
                    ByteString byteString3 = (ByteString) arrayListD0.get(i15);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (byteString3.size() == byteString2.size()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) arrayListS.get(i15)).intValue() > ((Number) arrayListS.get(i13)).intValue()) {
                        arrayListD0.remove(i15);
                        arrayListS.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, arrayListD0, 0, 0, arrayListS, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i10] = buffer.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            n.e(objArrCopyOf, "copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, gVar);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, g gVar) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // xj.a
    public int getSize() {
        return this.byteStrings.length;
    }

    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // xj.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    @Override // xj.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // xj.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
