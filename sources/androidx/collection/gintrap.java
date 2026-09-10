package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.X3;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/collection/gintrap;", "E", "", "", "initialCapacity", "<init>", "(I)V", "dern", "()Landroidx/collection/gintrap;", "", X3.i.W, "marial", "(J)Ljava/lang/Object;", "", "apical", "(J)V", "index", "formularize", "value", "taiyuan", "(JLjava/lang/Object;)V", "impassible", "()I", "", "competently", "()Z", "impromptu", "(I)J", "triweekly", "(I)Ljava/lang/Object;", "beachfront", "(J)I", "wireman", "(J)Z", "attabal", "()V", "", "toString", "()Ljava/lang/String;", "kowloon", "Z", "garbage", "", "arytenoidectomy", "[J", "keys", "", "", "monoploid", "[Ljava/lang/Object;", "values", "polloi", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class gintrap<E> implements Cloneable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public gintrap() {
        this(0, 1, null);
    }

    public void apical(long key) {
        int iSaneness = molybdenite.attabal.saneness(this.keys, this.size, key);
        if (iSaneness < 0 || this.values[iSaneness] == rotuma.f5732attabal) {
            return;
        }
        this.values[iSaneness] = rotuma.f5732attabal;
        this.garbage = true;
    }

    public void attabal() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public int beachfront(long key) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rotuma.f5732attabal) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return molybdenite.attabal.saneness(this.keys, this.size, key);
    }

    public boolean competently() {
        return impassible() == 0;
    }

    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public gintrap<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.competently(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        gintrap<E> gintrapVar = (gintrap) objClone;
        gintrapVar.keys = (long[]) this.keys.clone();
        gintrapVar.values = (Object[]) this.values.clone();
        return gintrapVar;
    }

    public void formularize(int index) {
        if (this.values[index] != rotuma.f5732attabal) {
            this.values[index] = rotuma.f5732attabal;
            this.garbage = true;
        }
    }

    public int impassible() {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rotuma.f5732attabal) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.size;
    }

    public long impromptu(int index) {
        if (!(index >= 0 && index < this.size)) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rotuma.f5732attabal) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.keys[index];
    }

    public E marial(long key) {
        int iSaneness = molybdenite.attabal.saneness(this.keys, this.size, key);
        if (iSaneness < 0 || this.values[iSaneness] == rotuma.f5732attabal) {
            return null;
        }
        return (E) this.values[iSaneness];
    }

    public void taiyuan(long key, E value) {
        int iSaneness = molybdenite.attabal.saneness(this.keys, this.size, key);
        if (iSaneness >= 0) {
            this.values[iSaneness] = value;
            return;
        }
        int i = ~iSaneness;
        if (i < this.size && this.values[i] == rotuma.f5732attabal) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                Object[] objArr = this.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != rotuma.f5732attabal) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
                i = ~molybdenite.attabal.saneness(this.keys, i3, key);
            }
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int iBeachfront = molybdenite.attabal.beachfront(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iBeachfront);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iBeachfront);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i6 = this.size;
        if (i6 - i != 0) {
            long[] jArr2 = this.keys;
            int i7 = i + 1;
            p002kotlin.collections.arytenoidectomy.impromptu(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.values;
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr2, objArr2, i7, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public String toString() {
        if (impassible() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(impromptu(i2));
            sb.append('=');
            E eTriweekly = triweekly(i2);
            if (eTriweekly != sb) {
                sb.append(eTriweekly);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public E triweekly(int index) {
        if (!(index >= 0 && index < this.size)) {
            molybdenite.wireman.attabal("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != rotuma.f5732attabal) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return (E) this.values[index];
    }

    public boolean wireman(long key) {
        return beachfront(key) >= 0;
    }

    public gintrap(int i) {
        if (i == 0) {
            this.keys = molybdenite.attabal.f33569saneness;
            this.values = molybdenite.attabal.f33568dern;
        } else {
            int iBeachfront = molybdenite.attabal.beachfront(i);
            this.keys = new long[iBeachfront];
            this.values = new Object[iBeachfront];
        }
    }

    public /* synthetic */ gintrap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
