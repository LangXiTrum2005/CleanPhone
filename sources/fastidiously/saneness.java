package fastidiously;

import asosan.impassible;
import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import vinyl.underbelly;

/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020)¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bF\u0010GJA\u0010K\u001a\u00020\t\"\n\b\u0000\u0010H*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010LJA\u0010M\u001a\u00020\t\"\b\b\u0000\u0010H*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010L¨\u0006N"}, d2 = {"Lfastidiously/saneness;", "Lfastidiously/beachfront;", "Lfastidiously/wireman;", "<init>", "()V", "Lbristol/beachfront;", "descriptor", "saneness", "(Lbristol/beachfront;)Lfastidiously/wireman;", "", "dern", "(Lbristol/beachfront;)V", "", "index", "", "supplicat", "(Lbristol/beachfront;I)Z", "", "value", "merc", "(Ljava/lang/Object;)V", "impassible", "monoploid", "(Z)V", "", "competently", "(B)V", "", "arytenoidectomy", "(S)V", "oilcan", "(I)V", "", "apical", "(J)V", "", "graveside", "(F)V", "", "beachfront", "(D)V", "", "dovishness", "(C)V", "", "kattegat", "(Ljava/lang/String;)V", "enumDescriptor", "impromptu", "(Lbristol/beachfront;I)V", "trm", "(Lbristol/beachfront;)Lfastidiously/beachfront;", "kowloon", "(Lbristol/beachfront;IZ)V", "cord", "(Lbristol/beachfront;IB)V", "marial", "(Lbristol/beachfront;IS)V", "molybdenite", "(Lbristol/beachfront;II)V", "cutely", "(Lbristol/beachfront;IJ)V", "triweekly", "(Lbristol/beachfront;IF)V", "formularize", "(Lbristol/beachfront;ID)V", "yemenite", "(Lbristol/beachfront;IC)V", "stratoscope", "(Lbristol/beachfront;ILjava/lang/String;)V", "adultoid", "(Lbristol/beachfront;I)Lfastidiously/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/impassible;", "serializer", "sealless", "(Lbristol/beachfront;ILasosan/impassible;Ljava/lang/Object;)V", "taiyuan", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class saneness implements beachfront, wireman {
    @Override // fastidiously.wireman
    public final beachfront adultoid(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return supplicat(descriptor, index) ? trm(descriptor.competently(index)) : underbelly.f39513attabal;
    }

    @Override // fastidiously.beachfront
    public void apical(long value) {
        merc(Long.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public void arytenoidectomy(short value) {
        merc(Short.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public void beachfront(double value) {
        merc(Double.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public void competently(byte value) {
        merc(Byte.valueOf(value));
    }

    @Override // fastidiously.wireman
    public final void cord(bristol.beachfront descriptor, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            competently(value);
        }
    }

    @Override // fastidiously.wireman
    public boolean cuirassed(bristol.beachfront beachfrontVar, int i) {
        return wireman.attabal.attabal(this, beachfrontVar, i);
    }

    @Override // fastidiously.wireman
    public final void cutely(bristol.beachfront descriptor, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            apical(value);
        }
    }

    @Override // fastidiously.wireman
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // fastidiously.beachfront
    public void dovishness(char value) {
        merc(Character.valueOf(value));
    }

    @Override // fastidiously.wireman
    public final void formularize(bristol.beachfront descriptor, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            beachfront(value);
        }
    }

    @Override // fastidiously.beachfront
    public void gintrap() {
        beachfront.attabal.saneness(this);
    }

    @Override // fastidiously.beachfront
    public void graveside(float value) {
        merc(Float.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public void impassible() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // fastidiously.beachfront
    public void impromptu(bristol.beachfront enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        merc(Integer.valueOf(index));
    }

    @Override // fastidiously.beachfront
    public void kattegat(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        merc(value);
    }

    @Override // fastidiously.wireman
    public final void kowloon(bristol.beachfront descriptor, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            monoploid(value);
        }
    }

    @Override // fastidiously.wireman
    public final void marial(bristol.beachfront descriptor, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            arytenoidectomy(value);
        }
    }

    public void merc(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("Non-serializable " + polloi.saneness(value.getClass()) + " is not supported by " + polloi.saneness(getClass()) + " encoder");
    }

    @Override // fastidiously.wireman
    public final void molybdenite(bristol.beachfront descriptor, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            oilcan(value);
        }
    }

    @Override // fastidiously.beachfront
    public void monoploid(boolean value) {
        merc(Boolean.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public void oilcan(int value) {
        merc(Integer.valueOf(value));
    }

    @Override // fastidiously.beachfront
    public <T> void preprohormone(impassible<? super T> impassibleVar, T t) {
        beachfront.attabal.wireman(this, impassibleVar, t);
    }

    public <T> void restrictive(impassible<? super T> impassibleVar, T t) {
        beachfront.attabal.dern(this, impassibleVar, t);
    }

    @Override // fastidiously.beachfront
    public wireman rotuma(bristol.beachfront beachfrontVar, int i) {
        return beachfront.attabal.attabal(this, beachfrontVar, i);
    }

    @Override // fastidiously.beachfront
    public wireman saneness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // fastidiously.wireman
    public <T> void sealless(bristol.beachfront descriptor, int index, impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (supplicat(descriptor, index)) {
            preprohormone(serializer, value);
        }
    }

    @Override // fastidiously.wireman
    public final void stratoscope(bristol.beachfront descriptor, int index, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (supplicat(descriptor, index)) {
            kattegat(value);
        }
    }

    public boolean supplicat(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // fastidiously.wireman
    public <T> void taiyuan(bristol.beachfront descriptor, int index, impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (supplicat(descriptor, index)) {
            restrictive(serializer, value);
        }
    }

    @Override // fastidiously.wireman
    public final void triweekly(bristol.beachfront descriptor, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            graveside(value);
        }
    }

    @Override // fastidiously.beachfront
    public beachfront trm(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // fastidiously.wireman
    public final void yemenite(bristol.beachfront descriptor, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (supplicat(descriptor, index)) {
            dovishness(value);
        }
    }
}
