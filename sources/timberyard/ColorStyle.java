package timberyard;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import restrictive.overspeculate;
import restrictive.privatdozent;

/* JADX INFO: renamed from: timberyard.saneness, reason: from toString */
/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Ltimberyard/saneness;", "Ltimberyard/cutely;", "Lrestrictive/overspeculate;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue-0d7_KjU", "()J", "dern", "color", "Lrestrictive/privatdozent;", "saneness", "()Lrestrictive/privatdozent;", "brush", "", "attabal", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ColorStyle implements cutely {
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // timberyard.cutely
    public float attabal() {
        return overspeculate.impassible(getValue());
    }

    @Override // timberyard.cutely
    /* JADX INFO: renamed from: dern, reason: from getter */
    public long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && overspeculate.formularize(this.value, ((ColorStyle) other).value);
    }

    public int hashCode() {
        return overspeculate.polloi(this.value);
    }

    @Override // timberyard.cutely
    public privatdozent saneness() {
        return null;
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) overspeculate.molybdenite(this.value)) + ')';
    }

    public ColorStyle(long j) {
        this.value = j;
        if (j == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
