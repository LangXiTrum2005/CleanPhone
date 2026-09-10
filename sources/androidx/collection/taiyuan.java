package androidx.collection;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003R\u001c\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\u0003R\u0016\u0010$\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0011\u0010&\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014\u0082\u0001\u0001'¨\u0006("}, d2 = {"Landroidx/collection/taiyuan;", "", "<init>", "()V", "", "element", "", "attabal", "(F)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "dern", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", TtmlNode.TAG_METADATA, "", "elements", "[F", "getElements$annotations", "saneness", "I", "_capacity", "_size", "capacity", "Landroidx/collection/cuirassed;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int _size;
    public float[] elements;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    public /* synthetic */ taiyuan(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String wireman(taiyuan taiyuanVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return taiyuanVar.dern(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final boolean attabal(float element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Float.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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

    public final String dern(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        float f = fArr[(i << 3) + i5];
                        if (i2 == limit) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(separator);
                        }
                        sb.append(f);
                        i2++;
                    }
                    j >>= i3;
                    i5++;
                    i3 = i3;
                }
                if (i4 == i3) {
                }
                sb.append(postfix);
                break;
            }
            if (i == length) {
                sb.append(postfix);
                break;
            }
            i++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof taiyuan)) {
            return false;
        }
        taiyuan taiyuanVar = (taiyuan) other;
        if (taiyuanVar._size != this._size) {
            return false;
        }
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !taiyuanVar.attabal(fArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        float[] fArr = this.elements;
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
                        iHashCode += Float.hashCode(fArr[(i << 3) + i3]);
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

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public String toString() {
        return wireman(this, null, X3.j.d, X3.j.e, 0, null, 25, null);
    }

    public taiyuan() {
        this.metadata = peridotite.f5721attabal;
        this.elements = cutely.attabal();
    }
}
