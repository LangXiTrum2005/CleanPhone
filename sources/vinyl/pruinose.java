package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010KJ%\u0010M\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b_\u0010`JA\u0010d\u001a\u00020\u0012\"\n\b\u0001\u0010a*\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010b2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\bd\u0010eJA\u0010f\u001a\u00020\u0012\"\b\b\u0001\u0010a*\u00020\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010b2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bf\u0010eJ\u0017\u0010h\u001a\u00020\u00122\u0006\u0010g\u001a\u00028\u0000H\u0004¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00028\u0000H\u0004¢\u0006\u0004\bj\u0010kR$\u0010p\u001a\u0012\u0012\u0004\u0012\u00028\u00000lj\b\u0012\u0004\u0012\u00028\u0000`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bq\u0010kR\u0016\u0010t\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bs\u0010k¨\u0006u"}, d2 = {"Lvinyl/pruinose;", "", "Tag", "Lfastidiously/beachfront;", "Lfastidiously/wireman;", "<init>", "()V", "Lbristol/beachfront;", CampaignEx.JSON_KEY_DESC, "", "index", "", "supplicat", "(Lbristol/beachfront;I)Z", "clubfoot", "(Lbristol/beachfront;I)Ljava/lang/Object;", "tag", "value", "", "starveling", "(Ljava/lang/Object;I)V", "", "polder", "(Ljava/lang/Object;B)V", "", "walach", "(Ljava/lang/Object;S)V", "", "hydrovane", "(Ljava/lang/Object;J)V", "", "privatdozent", "(Ljava/lang/Object;F)V", "", "grimness", "(Ljava/lang/Object;D)V", "merc", "(Ljava/lang/Object;Z)V", "", "seminary", "(Ljava/lang/Object;C)V", "", "peridotite", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", MediationMetaData.KEY_ORDINAL, "saran", "(Ljava/lang/Object;Lbristol/beachfront;I)V", "inlineDescriptor", "creditor", "(Ljava/lang/Object;Lbristol/beachfront;)Lfastidiously/beachfront;", "descriptor", "trm", "(Lbristol/beachfront;)Lfastidiously/beachfront;", "monoploid", "(Z)V", "competently", "(B)V", "arytenoidectomy", "(S)V", "oilcan", "(I)V", "apical", "(J)V", "graveside", "(F)V", "beachfront", "(D)V", "dovishness", "(C)V", "kattegat", "(Ljava/lang/String;)V", "impromptu", "(Lbristol/beachfront;I)V", "dern", "(Lbristol/beachfront;)V", "mathsort", "kowloon", "(Lbristol/beachfront;IZ)V", "cord", "(Lbristol/beachfront;IB)V", "marial", "(Lbristol/beachfront;IS)V", "molybdenite", "(Lbristol/beachfront;II)V", "cutely", "(Lbristol/beachfront;IJ)V", "triweekly", "(Lbristol/beachfront;IF)V", "formularize", "(Lbristol/beachfront;ID)V", "yemenite", "(Lbristol/beachfront;IC)V", "stratoscope", "(Lbristol/beachfront;ILjava/lang/String;)V", "adultoid", "(Lbristol/beachfront;I)Lfastidiously/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/impassible;", "serializer", "sealless", "(Lbristol/beachfront;ILasosan/impassible;Ljava/lang/Object;)V", "taiyuan", "name", "permissivist", "(Ljava/lang/Object;)V", "dent", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "attabal", "Ljava/util/ArrayList;", "tagStack", "splinterproof", "currentTag", "overspeculate", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class pruinose<Tag> implements fastidiously.beachfront, fastidiously.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ArrayList<Tag> tagStack = new ArrayList<>();

    private final boolean supplicat(bristol.beachfront desc, int index) {
        permissivist(clubfoot(desc, index));
        return true;
    }

    @Override // fastidiously.wireman
    public final fastidiously.beachfront adultoid(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return creditor(clubfoot(descriptor, index), descriptor.competently(index));
    }

    @Override // fastidiously.beachfront
    public final void apical(long value) {
        hydrovane(dent(), value);
    }

    @Override // fastidiously.beachfront
    public final void arytenoidectomy(short value) {
        walach(dent(), value);
    }

    @Override // fastidiously.beachfront
    public final void beachfront(double value) {
        grimness(dent(), value);
    }

    public abstract Tag clubfoot(bristol.beachfront beachfrontVar, int i);

    @Override // fastidiously.beachfront
    public final void competently(byte value) {
        polder(dent(), value);
    }

    @Override // fastidiously.wireman
    public final void cord(bristol.beachfront descriptor, int index, byte value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        polder(clubfoot(descriptor, index), value);
    }

    public fastidiously.beachfront creditor(Tag tag, bristol.beachfront inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        permissivist(tag);
        return this;
    }

    @Override // fastidiously.wireman
    public final void cutely(bristol.beachfront descriptor, int index, long value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        hydrovane(clubfoot(descriptor, index), value);
    }

    public final Tag dent() {
        if (this.tagStack.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(p002kotlin.collections.adultoid.triweekly(arrayList));
    }

    @Override // fastidiously.wireman
    public final void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            dent();
        }
        mathsort(descriptor);
    }

    @Override // fastidiously.beachfront
    public final void dovishness(char value) {
        seminary(dent(), value);
    }

    @Override // fastidiously.wireman
    public final void formularize(bristol.beachfront descriptor, int index, double value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        grimness(clubfoot(descriptor, index), value);
    }

    @Override // fastidiously.beachfront
    public final void graveside(float value) {
        privatdozent(dent(), value);
    }

    public abstract void grimness(Tag tag, double value);

    public abstract void hydrovane(Tag tag, long value);

    @Override // fastidiously.beachfront
    public final void impromptu(bristol.beachfront enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        saran(dent(), enumDescriptor, index);
    }

    @Override // fastidiously.beachfront
    public final void kattegat(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        peridotite(dent(), value);
    }

    @Override // fastidiously.wireman
    public final void kowloon(bristol.beachfront descriptor, int index, boolean value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        merc(clubfoot(descriptor, index), value);
    }

    @Override // fastidiously.wireman
    public final void marial(bristol.beachfront descriptor, int index, short value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        walach(clubfoot(descriptor, index), value);
    }

    public abstract void mathsort(bristol.beachfront descriptor);

    public abstract void merc(Tag tag, boolean value);

    @Override // fastidiously.wireman
    public final void molybdenite(bristol.beachfront descriptor, int index, int value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        starveling(clubfoot(descriptor, index), value);
    }

    @Override // fastidiously.beachfront
    public final void monoploid(boolean value) {
        merc(dent(), value);
    }

    @Override // fastidiously.beachfront
    public final void oilcan(int value) {
        starveling(dent(), value);
    }

    public final Tag overspeculate() {
        return (Tag) CollectionsKt.picketboat(this.tagStack);
    }

    public abstract void peridotite(Tag tag, String value);

    public final void permissivist(Tag name) {
        this.tagStack.add(name);
    }

    public abstract void polder(Tag tag, byte value);

    @Override // fastidiously.beachfront
    public abstract <T> void preprohormone(asosan.impassible<? super T> impassibleVar, T t);

    public abstract void privatdozent(Tag tag, float value);

    public <T> void restrictive(asosan.impassible<? super T> impassibleVar, T t) {
        fastidiously.beachfront.attabal.dern(this, impassibleVar, t);
    }

    @Override // fastidiously.beachfront
    public fastidiously.wireman rotuma(bristol.beachfront beachfrontVar, int i) {
        return fastidiously.beachfront.attabal.attabal(this, beachfrontVar, i);
    }

    public abstract void saran(Tag tag, bristol.beachfront enumDescriptor, int ordinal);

    @Override // fastidiously.wireman
    public <T> void sealless(bristol.beachfront descriptor, int index, asosan.impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (supplicat(descriptor, index)) {
            preprohormone(serializer, value);
        }
    }

    public abstract void seminary(Tag tag, char value);

    public final Tag splinterproof() {
        return (Tag) CollectionsKt.igbo(this.tagStack);
    }

    public abstract void starveling(Tag tag, int value);

    @Override // fastidiously.wireman
    public final void stratoscope(bristol.beachfront descriptor, int index, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        peridotite(clubfoot(descriptor, index), value);
    }

    public <T> void taiyuan(bristol.beachfront descriptor, int index, asosan.impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (supplicat(descriptor, index)) {
            restrictive(serializer, value);
        }
    }

    @Override // fastidiously.wireman
    public final void triweekly(bristol.beachfront descriptor, int index, float value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        privatdozent(clubfoot(descriptor, index), value);
    }

    @Override // fastidiously.beachfront
    public fastidiously.beachfront trm(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return creditor(dent(), descriptor);
    }

    public abstract void walach(Tag tag, short value);

    @Override // fastidiously.wireman
    public final void yemenite(bristol.beachfront descriptor, int index, char value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        seminary(clubfoot(descriptor, index), value);
    }
}
