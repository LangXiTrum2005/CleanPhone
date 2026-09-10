package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotWeakSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/supplicat;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "<init>", "()V", "value", "", "attabal", "(Ljava/lang/Object;)Z", "", "hash", "saneness", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "dern", "(ILjava/lang/Object;I)I", "I", "marial", "()I", "competently", "(I)V", "size", "", "[I", "wireman", "()[I", "setHashes$runtime", "([I)V", "hashes", "", "Lcuirassed/graveside;", "[Lcuirassed/graveside;", "beachfront", "()[Lcuirassed/graveside;", "setValues$runtime", "([Lcuirassed/graveside;)V", "values", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class supplicat<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int[] hashes = new int[16];

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public cuirassed.graveside<T>[] values = new cuirassed.graveside[16];

    public final boolean attabal(T value) {
        int iSaneness;
        int i = this.size;
        int iAttabal = cuirassed.triweekly.attabal(value);
        if (i > 0) {
            iSaneness = saneness(value, iAttabal);
            if (iSaneness >= 0) {
                return false;
            }
        } else {
            iSaneness = -1;
        }
        int i2 = -(iSaneness + 1);
        cuirassed.graveside<T>[] gravesideVarArr = this.values;
        int length = gravesideVarArr.length;
        if (i == length) {
            int i3 = length * 2;
            cuirassed.graveside<T>[] gravesideVarArr2 = new cuirassed.graveside[i3];
            int[] iArr = new int[i3];
            int i4 = i2 + 1;
            System.arraycopy(gravesideVarArr, i2, gravesideVarArr2, i4, i - i2);
            System.arraycopy(this.values, 0, gravesideVarArr2, 0, i2);
            p002kotlin.collections.arytenoidectomy.competently(this.hashes, iArr, i4, i2, i);
            p002kotlin.collections.arytenoidectomy.formularize(this.hashes, iArr, 0, 0, i2, 6, null);
            this.values = gravesideVarArr2;
            this.hashes = iArr;
        } else {
            int i5 = i2 + 1;
            System.arraycopy(gravesideVarArr, i2, gravesideVarArr, i5, i - i2);
            int[] iArr2 = this.hashes;
            p002kotlin.collections.arytenoidectomy.competently(iArr2, iArr2, i5, i2, i);
        }
        this.values[i2] = new cuirassed.graveside<>(value);
        this.hashes[i2] = iAttabal;
        this.size++;
        return true;
    }

    public final cuirassed.graveside<T>[] beachfront() {
        return this.values;
    }

    public final void competently(int i) {
        this.size = i;
    }

    public final int dern(int midIndex, T value, int valueHash) {
        int i = midIndex - 1;
        while (true) {
            if (-1 >= i || this.hashes[i] != valueHash) {
                break;
            }
            cuirassed.graveside<T> gravesideVar = this.values[i];
            if ((gravesideVar != null ? gravesideVar.get() : null) == value) {
                return i;
            }
            i--;
        }
        int i2 = midIndex + 1;
        int i3 = this.size;
        while (i2 < i3) {
            if (this.hashes[i2] != valueHash) {
                return -(i2 + 1);
            }
            cuirassed.graveside<T> gravesideVar2 = this.values[i2];
            if ((gravesideVar2 != null ? gravesideVar2.get() : null) == value) {
                return i2;
            }
            i2++;
        }
        i2 = this.size;
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int saneness(T value, int hash) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.hashes[i3];
            if (i4 < hash) {
                i2 = i3 + 1;
            } else {
                if (i4 <= hash) {
                    cuirassed.graveside<T> gravesideVar = this.values[i3];
                    return value == (gravesideVar != null ? gravesideVar.get() : null) ? i3 : dern(i3, value, hash);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }
}
