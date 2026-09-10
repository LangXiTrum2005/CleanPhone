package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010\u001b\u0012\u0004\b\u001c\u0010\u0004R$\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u0012\u0004\b \u0010\u0004R\u001c\u0010%\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010)\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u0004R\u001c\u0010+\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010'\u0012\u0004\b*\u0010\u0004R\u0011\u0010,\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0011\u0010.\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010\u0012\u0082\u0001\u0001/¨\u00060"}, d2 = {"Landroidx/collection/privatdozent;", "K", "", "<init>", "()V", "", "competently", "()Z", X3.i.W, "", "defaultValue", "marial", "(Ljava/lang/Object;F)F", "attabal", "(Ljava/lang/Object;)Z", "saneness", "", "hashCode", "()I", C3414a2.d, "equals", "", "toString", "()Ljava/lang/String;", "dern", "(Ljava/lang/Object;)I", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "", "[F", "getValues$annotations", "values", "wireman", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "beachfront", "size", "Landroidx/collection/merc;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class privatdozent<K> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public float[] values;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Object[] keys;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    public /* synthetic */ privatdozent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean attabal(K key) {
        return saneness(key);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean competently() {
        return this._size == 0;
    }

    public final int dern(K key) {
        int i = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.wireman(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        boolean z;
        boolean z2 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof privatdozent)) {
            return false;
        }
        privatdozent privatdozentVar = (privatdozent) other;
        if (privatdozentVar.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        float f = fArr[i4];
                        int iDern = privatdozentVar.dern(obj);
                        if (iDern < 0 || f != privatdozentVar.values[iDern]) {
                            return false;
                        }
                    }
                    j >>= 8;
                    i3++;
                    z2 = z2;
                }
                z = z2;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z2;
            }
            if (i == length) {
                return z;
            }
            i++;
            z2 = z;
        }
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        Object obj = objArr[i4];
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final float marial(K key, float defaultValue) {
        int iDern = dern(key);
        return iDern >= 0 ? this.values[iDern] : defaultValue;
    }

    public final boolean saneness(K key) {
        return dern(key) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
  0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public String toString() {
        if (competently()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(X3.j.b);
                            sb.append(f);
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

    public privatdozent() {
        this.metadata = peridotite.f5721attabal;
        this.keys = molybdenite.attabal.f33568dern;
        this.values = cutely.attabal();
    }
}
