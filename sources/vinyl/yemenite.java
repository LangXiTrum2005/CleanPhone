package vinyl;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lvinyl/yemenite;", "", "Lbristol/beachfront;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lbristol/beachfront;Lkotlin/jvm/functions/Function2;)V", "index", "", "attabal", "(I)V", "wireman", "()I", "elementsCount", "", "marial", "(I)[J", "saneness", "dern", "Lbristol/beachfront;", "Lkotlin/jvm/functions/Function2;", "", "J", "lowerMarks", "[J", "highMarksArray", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public long lowerMarks;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function2<bristol.beachfront, Integer, Boolean> readIfAbsent;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final long[] highMarksArray;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final long[] f39531beachfront = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    public yemenite(bristol.beachfront descriptor, Function2<? super bristol.beachfront, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int iWireman = descriptor.wireman();
        if (iWireman <= 64) {
            this.lowerMarks = iWireman != 64 ? (-1) << iWireman : 0L;
            this.highMarksArray = f39531beachfront;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = marial(iWireman);
        }
    }

    public final void attabal(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            saneness(index);
        }
    }

    public final int dern() {
        int length = this.highMarksArray.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.highMarksArray[i];
            while (j != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << iNumberOfTrailingZeros;
                int i4 = iNumberOfTrailingZeros + i3;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i4)).booleanValue()) {
                    this.highMarksArray[i] = j;
                    return i4;
                }
            }
            this.highMarksArray[i] = j;
            i = i2;
        }
        return -1;
    }

    public final long[] marial(int elementsCount) {
        long[] jArr = new long[(elementsCount - 1) >>> 6];
        if ((elementsCount & 63) != 0) {
            jArr[p002kotlin.collections.polloi.hydrovane(jArr)] = (-1) << elementsCount;
        }
        return jArr;
    }

    public final void saneness(int index) {
        int i = (index >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i] = jArr[i] | (1 << (index & 63));
    }

    public final int wireman() {
        int iNumberOfTrailingZeros;
        int iWireman = this.descriptor.wireman();
        do {
            long j = this.lowerMarks;
            if (j == -1) {
                if (iWireman > 64) {
                    return dern();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.lowerMarks |= 1 << iNumberOfTrailingZeros;
        } while (!this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
