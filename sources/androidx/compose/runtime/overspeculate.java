package androidx.compose.runtime;

import com.unity3d.ads.BuildConfig;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/overspeculate;", "", "<init>", "()V", "", "value", "", "competently", "(I)V", "beachfront", "()I", BuildConfig.FLAVOR, "marial", "(I)I", "wireman", "index", "dern", "attabal", "saneness", "", "impromptu", "()[I", "[I", "slots", "I", "tos", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class overspeculate {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int[] slots = new int[10];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int tos;

    public final void attabal() {
        this.tos = 0;
    }

    public final int beachfront() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final void competently(int value) {
        int[] iArrImpromptu = this.slots;
        if (this.tos >= iArrImpromptu.length) {
            iArrImpromptu = impromptu();
        }
        int i = this.tos;
        this.tos = i + 1;
        iArrImpromptu[i] = value;
    }

    public final int dern(int index) {
        return this.slots[index];
    }

    public final int[] impromptu() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int marial(int i) {
        int i2 = this.tos - 1;
        return i2 >= 0 ? this.slots[i2] : i;
    }

    public final int saneness(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i = 0; i < iMin; i++) {
            if (iArr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public final int wireman() {
        return this.slots[this.tos - 2];
    }
}
