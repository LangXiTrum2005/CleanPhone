package androidx.collection;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJA\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b \u0010!R\u001c\u0010%\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010#\u0012\u0004\b$\u0010!R\u0012\u0010'\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u0017\u0082\u0001\u0001(¨\u0006)"}, d2 = {"Landroidx/collection/impromptu;", "", "", "initialCapacity", "<init>", "(I)V", "", "attabal", "()F", "index", "saneness", "(I)F", "beachfront", "", "separator", "prefix", "postfix", "limit", "truncated", "", "wireman", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[F", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "dern", "size", "Landroidx/collection/cord;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public float[] content;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ impromptu(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ String marial(impromptu impromptuVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return impromptuVar.wireman(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final float attabal() {
        if (this._size == 0) {
            molybdenite.wireman.wireman("FloatList is empty.");
        }
        return this.content[0];
    }

    public final float beachfront() {
        if (this._size == 0) {
            molybdenite.wireman.wireman("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public boolean equals(Object other) {
        if (other instanceof impromptu) {
            impromptu impromptuVar = (impromptu) other;
            int i = impromptuVar._size;
            int i2 = this._size;
            if (i == i2) {
                float[] fArr = this.content;
                float[] fArr2 = impromptuVar.content;
                IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, i2);
                int first = intRangeMonoploid.getFirst();
                int last = intRangeMonoploid.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final float saneness(int index) {
        if (index < 0 || index >= this._size) {
            molybdenite.wireman.dern("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public String toString() {
        return marial(this, null, X3.j.d, X3.j.e, 0, null, 25, null);
    }

    public final String wireman(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(f);
        }
        sb.append(postfix);
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public impromptu(int i) {
        this.content = i == 0 ? cutely.attabal() : new float[i];
    }
}
