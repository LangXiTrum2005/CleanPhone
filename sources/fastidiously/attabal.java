package fastidiously;

import com.google.android.gms.ads.RequestConfiguration;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O¨\u0006Q"}, d2 = {"Lfastidiously/attabal;", "Lfastidiously/marial;", "Lfastidiously/dern;", "<init>", "()V", "", "merc", "()Ljava/lang/Object;", "", "trm", "()Z", "", "impromptu", "()Ljava/lang/Void;", "graveside", "", "kattegat", "()B", "", "arytenoidectomy", "()S", "", "competently", "()I", "", "apical", "()J", "", "monoploid", "()F", "", "polloi", "()D", "", "adultoid", "()C", "", "gintrap", "()Ljava/lang/String;", "Lbristol/beachfront;", "enumDescriptor", "taiyuan", "(Lbristol/beachfront;)I", "descriptor", "dovishness", "(Lbristol/beachfront;)Lfastidiously/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/dern;", "deserializer", "previousValue", "restrictive", "(Lasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "saneness", "(Lbristol/beachfront;)Lfastidiously/dern;", "", "dern", "(Lbristol/beachfront;)V", "index", "rotuma", "(Lbristol/beachfront;I)Z", "cord", "(Lbristol/beachfront;I)B", "preprohormone", "(Lbristol/beachfront;I)S", "yemenite", "(Lbristol/beachfront;I)I", "molybdenite", "(Lbristol/beachfront;I)J", "cutely", "(Lbristol/beachfront;I)F", "marial", "(Lbristol/beachfront;I)D", "cuirassed", "(Lbristol/beachfront;I)C", "formularize", "(Lbristol/beachfront;I)Ljava/lang/String;", "kowloon", "(Lbristol/beachfront;I)Lfastidiously/marial;", "supplicat", "(Lbristol/beachfront;ILasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "sealless", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal implements marial, dern {
    @Override // fastidiously.marial
    public char adultoid() {
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objMerc).charValue();
    }

    @Override // fastidiously.marial
    public abstract long apical();

    @Override // fastidiously.marial
    public abstract short arytenoidectomy();

    @Override // fastidiously.marial
    public abstract int competently();

    @Override // fastidiously.dern
    public final byte cord(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return kattegat();
    }

    @Override // fastidiously.dern
    public final char cuirassed(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return adultoid();
    }

    @Override // fastidiously.dern
    public final float cutely(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return monoploid();
    }

    @Override // fastidiously.dern
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // fastidiously.marial
    public marial dovishness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // fastidiously.dern
    public final String formularize(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return gintrap();
    }

    @Override // fastidiously.marial
    public String gintrap() {
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.String");
        return (String) objMerc;
    }

    @Override // fastidiously.marial
    public boolean graveside() {
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objMerc).booleanValue();
    }

    @Override // fastidiously.marial
    public Void impromptu() {
        return null;
    }

    @Override // fastidiously.marial
    public abstract byte kattegat();

    @Override // fastidiously.dern
    public marial kowloon(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return dovishness(descriptor.competently(index));
    }

    @Override // fastidiously.dern
    public final double marial(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return polloi();
    }

    public Object merc() {
        throw new SerializationException(polloi.saneness(getClass()) + " can't retrieve untyped values");
    }

    @Override // fastidiously.dern
    public final long molybdenite(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return apical();
    }

    @Override // fastidiously.marial
    public float monoploid() {
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objMerc).floatValue();
    }

    @Override // fastidiously.dern
    public int oilcan(bristol.beachfront beachfrontVar) {
        return dern.attabal.attabal(this, beachfrontVar);
    }

    @Override // fastidiously.marial
    public double polloi() {
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objMerc).doubleValue();
    }

    @Override // fastidiously.dern
    public final short preprohormone(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return arytenoidectomy();
    }

    public <T> T restrictive(asosan.dern<? extends T> deserializer, T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) stratoscope(deserializer);
    }

    @Override // fastidiously.dern
    public final boolean rotuma(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return graveside();
    }

    @Override // fastidiously.marial
    public dern saneness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // fastidiously.dern
    public final <T> T sealless(bristol.beachfront descriptor, int index, asosan.dern<? extends T> deserializer, T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (deserializer.getDescriptor().saneness() || trm()) ? (T) restrictive(deserializer, previousValue) : (T) impromptu();
    }

    @Override // fastidiously.marial
    public <T> T stratoscope(asosan.dern<? extends T> dernVar) {
        return (T) marial.attabal.attabal(this, dernVar);
    }

    @Override // fastidiously.dern
    public <T> T supplicat(bristol.beachfront descriptor, int index, asosan.dern<? extends T> deserializer, T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) restrictive(deserializer, previousValue);
    }

    @Override // fastidiously.marial
    public int taiyuan(bristol.beachfront enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Object objMerc = merc();
        Intrinsics.competently(objMerc, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objMerc).intValue();
    }

    @Override // fastidiously.dern
    public boolean triweekly() {
        return dern.attabal.saneness(this);
    }

    @Override // fastidiously.marial
    public boolean trm() {
        return true;
    }

    @Override // fastidiously.dern
    public final int yemenite(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return competently();
    }
}
