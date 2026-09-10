package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010\u0019\u0012\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001f\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b\u001e\u0010\u0004R$\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010!\u0012\u0004\b\"\u0010\u0004R\u001c\u0010'\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0004R\u001c\u0010*\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b(\u0010%\u0012\u0004\b)\u0010\u0004R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0011R\u0011\u0010,\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0011\u0082\u0001\u0001-¨\u0006."}, d2 = {"Landroidx/collection/kowloon;", "V", "", "<init>", "()V", "", "beachfront", "()Z", "competently", "", X3.i.W, "dern", "(I)Ljava/lang/Object;", "attabal", "(I)Z", "saneness", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "[I", "getKeys$annotations", "keys", "", "[Ljava/lang/Object;", "getValues$annotations", "values", "wireman", "I", "get_capacity$collection$annotations", "_capacity", "marial", "get_size$collection$annotations", "_size", "capacity", "size", "Landroidx/collection/yemenite;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class kowloon<V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Object[] values;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int[] keys;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    public /* synthetic */ kowloon(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean attabal(int key) {
        return saneness(key);
    }

    public final boolean beachfront() {
        return this._size == 0;
    }

    public final boolean competently() {
        return this._size != 0;
    }

    public final V dern(int key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof kowloon)) {
            return false;
        }
        kowloon kowloonVar = (kowloon) other;
        if (kowloonVar.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
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
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            Object obj = objArr[i4];
                            if (obj == null) {
                                if (kowloonVar.dern(i5) != null || !kowloonVar.saneness(i5)) {
                                    return false;
                                }
                            } else if (!Intrinsics.wireman(obj, kowloonVar.dern(i5))) {
                                return false;
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
        return true;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i5);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean saneness(int key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
  0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public String toString() {
        if (beachfront()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append(X3.j.b);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public kowloon() {
        this.metadata = peridotite.f5721attabal;
        this.keys = polloi.attabal();
        this.values = molybdenite.attabal.f33568dern;
    }
}
