package duvetyn;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001bB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lduvetyn/rotuma;", "Lkotlin/collections/wireman;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lokio/ByteString;[I)V", "", "index", "marial", "(I)Lokio/ByteString;", "kowloon", "[Lokio/ByteString;", "beachfront", "()[Lokio/ByteString;", "arytenoidectomy", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "monoploid", "attabal", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class rotuma extends p002kotlin.collections.wireman<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final int[] trie;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final ByteString[] byteStrings;

    /* JADX INFO: renamed from: duvetyn.rotuma$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Options.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ[\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\n*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lduvetyn/rotuma$attabal;", "", "<init>", "()V", "", "Lokio/ByteString;", "byteStrings", "Lduvetyn/rotuma;", "wireman", "([Lokio/ByteString;)Lduvetyn/rotuma;", "", "nodeOffset", "Lduvetyn/wireman;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "", "attabal", "(JLduvetyn/wireman;ILjava/util/List;IILjava/util/List;)V", "dern", "(Lduvetyn/wireman;)J", "intCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void saneness(Companion companion, long j, wireman wiremanVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) throws IOException {
            if ((i4 & 1) != 0) {
                j = 0;
            }
            companion.attabal(j, wiremanVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        public final void attabal(long nodeOffset, wireman node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i;
            int i2;
            int i3;
            long j;
            int i4 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i5 = fromIndex; i5 < toIndex; i5++) {
                if (byteStrings.get(i5).size() < i4) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i4 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i6 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i6);
                i = i6;
                i2 = iIntValue;
                byteString = byteString3;
            } else {
                i = fromIndex;
                i2 = -1;
            }
            if (byteString.getByte(i4) == byteString2.getByte(i4)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i7 = 0;
                for (int i8 = i4; i8 < iMin && byteString.getByte(i8) == byteString2.getByte(i8); i8++) {
                    i7++;
                }
                long jDern = nodeOffset + dern(node) + ((long) 2) + ((long) i7) + 1;
                node.writeInt(-i7);
                node.writeInt(i2);
                int i9 = i4 + i7;
                while (i4 < i9) {
                    node.writeInt(byteString.getByte(i4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    i4++;
                }
                if (i + 1 == toIndex) {
                    if (i9 != byteStrings.get(i).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i).intValue());
                    return;
                } else {
                    wireman wiremanVar = new wireman();
                    node.writeInt(((int) (dern(wiremanVar) + jDern)) * (-1));
                    attabal(jDern, wiremanVar, i9, byteStrings, i, toIndex, indexes);
                    node.impromptu(wiremanVar);
                    return;
                }
            }
            int i10 = 1;
            for (int i11 = i + 1; i11 < toIndex; i11++) {
                if (byteStrings.get(i11 - 1).getByte(i4) != byteStrings.get(i11).getByte(i4)) {
                    i10++;
                }
            }
            long jDern2 = nodeOffset + dern(node) + ((long) 2) + ((long) (i10 * 2));
            node.writeInt(i10);
            node.writeInt(i2);
            for (int i12 = i; i12 < toIndex; i12++) {
                byte b = byteStrings.get(i12).getByte(i4);
                if (i12 == i || b != byteStrings.get(i12 - 1).getByte(i4)) {
                    node.writeInt(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                }
            }
            wireman wiremanVar2 = new wireman();
            while (i < toIndex) {
                byte b2 = byteStrings.get(i).getByte(i4);
                int i13 = i + 1;
                int i14 = i13;
                while (true) {
                    if (i14 >= toIndex) {
                        i3 = toIndex;
                        break;
                    } else {
                        if (b2 != byteStrings.get(i14).getByte(i4)) {
                            i3 = i14;
                            break;
                        }
                        i14++;
                    }
                }
                if (i13 == i3 && i4 + 1 == byteStrings.get(i).size()) {
                    node.writeInt(indexes.get(i).intValue());
                    j = jDern2;
                } else {
                    node.writeInt(((int) (dern(wiremanVar2) + jDern2)) * (-1));
                    j = jDern2;
                    attabal(j, wiremanVar2, i4 + 1, byteStrings, i, i3, indexes);
                }
                jDern2 = j;
                i = i3;
            }
            node.impromptu(wiremanVar2);
        }

        public final long dern(wireman wiremanVar) {
            return wiremanVar.getSize() / ((long) 4);
        }

        public final rotuma wireman(ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 0;
            if (byteStrings.length == 0) {
                return new rotuma(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listMastfed = p002kotlin.collections.polloi.mastfed(byteStrings);
            p002kotlin.collections.preprohormone.cord(listMastfed);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listPolloi = p002kotlin.collections.adultoid.polloi(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listPolloi.set(p002kotlin.collections.adultoid.apical(listMastfed, byteStrings[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((ByteString) listMastfed.get(0)).size() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i4 = 0;
            while (i4 < listMastfed.size()) {
                ByteString byteString2 = (ByteString) listMastfed.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < listMastfed.size()) {
                    ByteString byteString3 = (ByteString) listMastfed.get(i6);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (byteString3.size() == byteString2.size()) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) listPolloi.get(i6)).intValue() > ((Number) listPolloi.get(i4)).intValue()) {
                        listMastfed.remove(i6);
                        listPolloi.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            wireman wiremanVar = new wireman();
            saneness(this, 0L, wiremanVar, 0, listMastfed, 0, 0, listPolloi, 53, null);
            int[] iArr = new int[(int) dern(wiremanVar)];
            while (!wiremanVar.exhausted()) {
                iArr[i] = wiremanVar.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new rotuma((ByteString[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        public Companion() {
        }
    }

    public /* synthetic */ rotuma(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    public static final rotuma taiyuan(ByteString... byteStringArr) {
        return INSTANCE.wireman(byteStringArr);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    public /* bridge */ int competently(ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return wireman((ByteString) obj);
        }
        return false;
    }

    @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.byteStrings.length;
    }

    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int impromptu(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return competently((ByteString) obj);
        }
        return -1;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return impromptu((ByteString) obj);
        }
        return -1;
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ boolean wireman(ByteString byteString) {
        return super.contains(byteString);
    }

    public rotuma(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }
}
