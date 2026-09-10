package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.X3;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/collection/overspeculate;", "E", "", "", "initialCapacity", "<init>", "(I)V", "wireman", "()Landroidx/collection/overspeculate;", X3.i.W, "beachfront", "(I)Ljava/lang/Object;", "value", "", "apical", "(ILjava/lang/Object;)V", "formularize", "()I", "index", "taiyuan", "(I)I", "impassible", "competently", "impromptu", "(Ljava/lang/Object;)I", "", "marial", "(I)Z", "dern", "()V", "attabal", "", "toString", "()Ljava/lang/String;", "kowloon", "Z", "garbage", "", "arytenoidectomy", "[I", "keys", "", "", "monoploid", "[Ljava/lang/Object;", "values", "polloi", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class overspeculate<E> implements Cloneable {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public overspeculate() {
        this(0, 1, null);
    }

    public void apical(int key, E value) {
        int iAttabal = molybdenite.attabal.attabal(this.keys, this.size, key);
        if (iAttabal >= 0) {
            this.values[iAttabal] = value;
            return;
        }
        int i = ~iAttabal;
        if (i < this.size && this.values[i] == clubfoot.f5669attabal) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            clubfoot.wireman(this);
            i = ~molybdenite.attabal.attabal(this.keys, this.size, key);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iMarial = molybdenite.attabal.marial(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iMarial);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iMarial);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i3 = this.size;
        if (i3 - i != 0) {
            int[] iArr = this.keys;
            int i4 = i + 1;
            p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, i4, i, i3);
            Object[] objArr = this.values;
            p002kotlin.collections.arytenoidectomy.taiyuan(objArr, objArr, i4, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public void attabal(int key, E value) {
        int i = this.size;
        if (i != 0 && key <= this.keys[i - 1]) {
            apical(key, value);
            return;
        }
        if (this.garbage && i >= this.keys.length) {
            clubfoot.wireman(this);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iMarial = molybdenite.attabal.marial(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iMarial);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iMarial);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size = i2 + 1;
    }

    public E beachfront(int key) {
        return (E) clubfoot.dern(this, key);
    }

    public int competently(int key) {
        if (this.garbage) {
            clubfoot.wireman(this);
        }
        return molybdenite.attabal.attabal(this.keys, this.size, key);
    }

    public void dern() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public int formularize() {
        if (this.garbage) {
            clubfoot.wireman(this);
        }
        return this.size;
    }

    public E impassible(int index) {
        if (this.garbage) {
            clubfoot.wireman(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return (E) objArr[index];
        }
        beachfront beachfrontVar = beachfront.f5668attabal;
        throw new ArrayIndexOutOfBoundsException();
    }

    public int impromptu(E value) {
        if (this.garbage) {
            clubfoot.wireman(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public boolean marial(int key) {
        return competently(key) >= 0;
    }

    public int taiyuan(int index) {
        if (this.garbage) {
            clubfoot.wireman(this);
        }
        return this.keys[index];
    }

    public String toString() {
        if (formularize() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(taiyuan(i2));
            sb.append('=');
            E eImpassible = impassible(i2);
            if (eImpassible != this) {
                sb.append(eImpassible);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public overspeculate<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.competently(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        overspeculate<E> overspeculateVar = (overspeculate) objClone;
        overspeculateVar.keys = (int[]) this.keys.clone();
        overspeculateVar.values = (Object[]) this.values.clone();
        return overspeculateVar;
    }

    public overspeculate(int i) {
        if (i == 0) {
            this.keys = molybdenite.attabal.f33567attabal;
            this.values = molybdenite.attabal.f33568dern;
        } else {
            int iMarial = molybdenite.attabal.marial(i);
            this.keys = new int[iMarial];
            this.values = new Object[iMarial];
        }
    }

    public /* synthetic */ overspeculate(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
