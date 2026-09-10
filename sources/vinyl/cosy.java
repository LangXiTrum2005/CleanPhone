package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u00101J3\u00106\u001a\u00028\u0001\"\n\b\u0001\u00102*\u0004\u0018\u00010\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0012¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0018¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u000e¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u001d¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020 ¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020#¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020&¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020)¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\u00122\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020\u00152\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\u00182\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020 2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020#2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020&2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020)2\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020\u00032\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bd\u0010eJA\u0010f\u001a\u00028\u0001\"\n\b\u0001\u00102*\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bf\u0010gJC\u0010h\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00102*\u00020\u00012\u0006\u00108\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001032\b\u00105\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bh\u0010gJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00028\u0000H\u0004¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00028\u0000H\u0004¢\u0006\u0004\bm\u0010nR*\u0010u\u001a\u0012\u0012\u0004\u0012\u00028\u00000oj\b\u0012\u0004\u0012\u00028\u0000`p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010x\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\by\u0010n¨\u0006{"}, d2 = {"Lvinyl/cosy;", "", "Tag", "Lfastidiously/marial;", "Lfastidiously/dern;", "<init>", "()V", "E", "tag", "Lkotlin/Function0;", "block", "milliradian", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lbristol/beachfront;", "", "index", "permissivist", "(Lbristol/beachfront;I)Ljava/lang/Object;", "", "saran", "(Ljava/lang/Object;)Z", "", "privatdozent", "(Ljava/lang/Object;)B", "", "overspeculate", "(Ljava/lang/Object;)S", "mathsort", "(Ljava/lang/Object;)I", "", "splinterproof", "(Ljava/lang/Object;)J", "", "walach", "(Ljava/lang/Object;)F", "", "starveling", "(Ljava/lang/Object;)D", "", "creditor", "(Ljava/lang/Object;)C", "", "clubfoot", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "hydrovane", "(Ljava/lang/Object;Lbristol/beachfront;)I", "inlineDescriptor", "peridotite", "(Ljava/lang/Object;Lbristol/beachfront;)Lfastidiously/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/dern;", "deserializer", "previousValue", "grimness", "(Lasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "dovishness", "(Lbristol/beachfront;)Lfastidiously/marial;", "", "impromptu", "()Ljava/lang/Void;", "graveside", "()Z", "kattegat", "()B", "arytenoidectomy", "()S", "competently", "()I", "apical", "()J", "monoploid", "()F", "polloi", "()D", "adultoid", "()C", "gintrap", "()Ljava/lang/String;", "taiyuan", "(Lbristol/beachfront;)I", "rotuma", "(Lbristol/beachfront;I)Z", "cord", "(Lbristol/beachfront;I)B", "preprohormone", "(Lbristol/beachfront;I)S", "yemenite", "(Lbristol/beachfront;I)I", "molybdenite", "(Lbristol/beachfront;I)J", "cutely", "(Lbristol/beachfront;I)F", "marial", "(Lbristol/beachfront;I)D", "cuirassed", "(Lbristol/beachfront;I)C", "formularize", "(Lbristol/beachfront;I)Ljava/lang/String;", "kowloon", "(Lbristol/beachfront;I)Lfastidiously/marial;", "supplicat", "(Lbristol/beachfront;ILasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "sealless", "name", "", "timberyard", "(Ljava/lang/Object;)V", "premeiotic", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "attabal", "Ljava/util/ArrayList;", "cultivated", "()Ljava/util/ArrayList;", "tagStack", "saneness", "Z", "flag", "dent", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class cosy<Tag> implements fastidiously.marial, fastidiously.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean flag;

    public static final Object polder(cosy cosyVar, asosan.dern dernVar, Object obj) {
        return (dernVar.getDescriptor().saneness() || cosyVar.trm()) ? cosyVar.grimness(dernVar, obj) : cosyVar.impromptu();
    }

    public static final Object seminary(cosy cosyVar, asosan.dern dernVar, Object obj) {
        return cosyVar.grimness(dernVar, obj);
    }

    @Override // fastidiously.marial
    public final char adultoid() {
        return creditor(premeiotic());
    }

    @Override // fastidiously.marial
    public final long apical() {
        return splinterproof(premeiotic());
    }

    @Override // fastidiously.marial
    public final short arytenoidectomy() {
        return overspeculate(premeiotic());
    }

    public abstract String clubfoot(Tag tag);

    @Override // fastidiously.marial
    public final int competently() {
        return mathsort(premeiotic());
    }

    @Override // fastidiously.dern
    public final byte cord(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return privatdozent(permissivist(descriptor, index));
    }

    public abstract char creditor(Tag tag);

    @Override // fastidiously.dern
    public final char cuirassed(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return creditor(permissivist(descriptor, index));
    }

    public final ArrayList<Tag> cultivated() {
        return this.tagStack;
    }

    @Override // fastidiously.dern
    public final float cutely(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return walach(permissivist(descriptor, index));
    }

    public final Tag dent() {
        return (Tag) CollectionsKt.picketboat(this.tagStack);
    }

    @Override // fastidiously.marial
    public fastidiously.marial dovishness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return peridotite(premeiotic(), descriptor);
    }

    @Override // fastidiously.dern
    public final String formularize(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return clubfoot(permissivist(descriptor, index));
    }

    @Override // fastidiously.marial
    public final String gintrap() {
        return clubfoot(premeiotic());
    }

    @Override // fastidiously.marial
    public final boolean graveside() {
        return saran(premeiotic());
    }

    public <T> T grimness(asosan.dern<? extends T> deserializer, T previousValue) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) stratoscope(deserializer);
    }

    public abstract int hydrovane(Tag tag, bristol.beachfront enumDescriptor);

    @Override // fastidiously.marial
    public final Void impromptu() {
        return null;
    }

    @Override // fastidiously.marial
    public final byte kattegat() {
        return privatdozent(premeiotic());
    }

    @Override // fastidiously.dern
    public final fastidiously.marial kowloon(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return peridotite(permissivist(descriptor, index), descriptor.competently(index));
    }

    @Override // fastidiously.dern
    public final double marial(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return starveling(permissivist(descriptor, index));
    }

    public abstract int mathsort(Tag tag);

    public final <E> E milliradian(Tag tag, Function0<? extends E> block) {
        timberyard(tag);
        E eInvoke = block.invoke();
        if (!this.flag) {
            premeiotic();
        }
        this.flag = false;
        return eInvoke;
    }

    @Override // fastidiously.dern
    public final long molybdenite(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return splinterproof(permissivist(descriptor, index));
    }

    @Override // fastidiously.marial
    public final float monoploid() {
        return walach(premeiotic());
    }

    @Override // fastidiously.dern
    public int oilcan(bristol.beachfront beachfrontVar) {
        return fastidiously.dern.attabal.attabal(this, beachfrontVar);
    }

    public abstract short overspeculate(Tag tag);

    public fastidiously.marial peridotite(Tag tag, bristol.beachfront inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        timberyard(tag);
        return this;
    }

    public abstract Tag permissivist(bristol.beachfront beachfrontVar, int i);

    @Override // fastidiously.marial
    public final double polloi() {
        return starveling(premeiotic());
    }

    public final Tag premeiotic() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(p002kotlin.collections.adultoid.triweekly(arrayList));
        this.flag = true;
        return tagRemove;
    }

    @Override // fastidiously.dern
    public final short preprohormone(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return overspeculate(permissivist(descriptor, index));
    }

    public abstract byte privatdozent(Tag tag);

    @Override // fastidiously.dern
    public final boolean rotuma(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return saran(permissivist(descriptor, index));
    }

    public abstract boolean saran(Tag tag);

    @Override // fastidiously.dern
    public final <T> T sealless(bristol.beachfront descriptor, int index, final asosan.dern<? extends T> deserializer, final T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) milliradian(permissivist(descriptor, index), new Function0() { // from class: vinyl.fastrack
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cosy.polder(this.f39390kowloon, deserializer, previousValue);
            }
        });
    }

    public abstract long splinterproof(Tag tag);

    public abstract double starveling(Tag tag);

    @Override // fastidiously.marial
    public abstract <T> T stratoscope(asosan.dern<? extends T> dernVar);

    @Override // fastidiously.dern
    public final <T> T supplicat(bristol.beachfront descriptor, int index, final asosan.dern<? extends T> deserializer, final T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) milliradian(permissivist(descriptor, index), new Function0() { // from class: vinyl.microchemistry
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return cosy.seminary(this.f39439kowloon, deserializer, previousValue);
            }
        });
    }

    @Override // fastidiously.marial
    public final int taiyuan(bristol.beachfront enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return hydrovane(premeiotic(), enumDescriptor);
    }

    public final void timberyard(Tag name) {
        this.tagStack.add(name);
    }

    @Override // fastidiously.dern
    public boolean triweekly() {
        return fastidiously.dern.attabal.saneness(this);
    }

    public abstract float walach(Tag tag);

    @Override // fastidiously.dern
    public final int yemenite(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mathsort(permissivist(descriptor, index));
    }
}
