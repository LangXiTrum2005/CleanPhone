package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.metadata.MediationMetaData;
import cutwater.JsonConfiguration;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.sensatory;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002\r\u0012\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0016H\u0014¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J+\u0010@\u001a\u00020\u0007\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020BH\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001dH\u0014¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020GH\u0014¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0014¢\u0006\u0004\bJ\u0010KJ'\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0016H\u0014¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020P2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\bX\u0010YR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010Z\u001a\u0004\b[\u0010\\R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020a8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b[\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0011\u0010l\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0001\u0003mno¨\u0006p"}, d2 = {"Lkotlinx/serialization/json/internal/marial;", "Lvinyl/sensatory;", "Lcutwater/molybdenite;", "Lcutwater/attabal;", "json", "Lkotlin/Function1;", "Lcutwater/impromptu;", "", "nodeConsumer", "<init>", "(Lcutwater/attabal;Lkotlin/jvm/functions/Function1;)V", "", "tag", "kotlinx/serialization/json/internal/marial$saneness", "palmyra", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/marial$saneness;", "Lbristol/beachfront;", "inlineDescriptor", "kotlinx/serialization/json/internal/marial$attabal", "picketboat", "(Ljava/lang/String;Lbristol/beachfront;)Lkotlinx/serialization/json/internal/marial$attabal;", "descriptor", "", "index", "premeiotic", "(Lbristol/beachfront;I)Ljava/lang/String;", "element", "polloi", "(Lcutwater/impromptu;)V", "", "cuirassed", "(Lbristol/beachfront;I)Z", "parentName", "childName", "cultivated", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", X3.i.W, "lightstruck", "(Ljava/lang/String;Lcutwater/impromptu;)V", "igbo", "()Lcutwater/impromptu;", "gintrap", "()V", "impassible", "underbelly", "(Ljava/lang/String;)V", "value", "czestochowa", "(Ljava/lang/String;I)V", "", "lerp", "(Ljava/lang/String;B)V", "", "preterite", "(Ljava/lang/String;S)V", "", "sensatory", "(Ljava/lang/String;J)V", "", "empress", "(Ljava/lang/String;F)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/impassible;", "serializer", "preprohormone", "(Lasosan/impassible;Ljava/lang/Object;)V", "", "lotta", "(Ljava/lang/String;D)V", "coffeecake", "(Ljava/lang/String;Z)V", "", "nosophobia", "(Ljava/lang/String;C)V", "wostteth", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", MediationMetaData.KEY_ORDINAL, "sayid", "(Ljava/lang/String;Lbristol/beachfront;I)V", "Lfastidiously/beachfront;", "coi", "(Ljava/lang/String;Lbristol/beachfront;)Lfastidiously/beachfront;", "trm", "(Lbristol/beachfront;)Lfastidiously/beachfront;", "Lfastidiously/wireman;", "saneness", "(Lbristol/beachfront;)Lfastidiously/wireman;", "mathsort", "(Lbristol/beachfront;)V", "Lcutwater/attabal;", "wireman", "()Lcutwater/attabal;", "dern", "Lkotlin/jvm/functions/Function1;", "gusty", "()Lkotlin/jvm/functions/Function1;", "Lcutwater/beachfront;", "Lcutwater/beachfront;", "configuration", "marial", "Ljava/lang/String;", "polymorphicDiscriminator", "beachfront", "polymorphicSerialName", "Lcerebral/dern;", "attabal", "()Lcerebral/dern;", "serializersModule", "Lkotlinx/serialization/json/internal/oilcan;", "Lkotlinx/serialization/json/internal/supplicat;", "Lkotlinx/serialization/json/internal/merc;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class marial extends sensatory implements cutwater.molybdenite {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public String polymorphicSerialName;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Function1<cutwater.impromptu, Unit> nodeConsumer;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public String polymorphicDiscriminator;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cutwater.attabal json;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final JsonConfiguration configuration;

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlinx/serialization/json/internal/marial$attabal", "Lfastidiously/saneness;", "", "value", "", "kattegat", "(Ljava/lang/String;)V", "Lcerebral/dern;", "attabal", "()Lcerebral/dern;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal extends fastidiously.saneness {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ bristol.beachfront f32523dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f32524saneness;

        public attabal(String str, bristol.beachfront beachfrontVar) {
            this.f32524saneness = str;
            this.f32523dern = beachfrontVar;
        }

        @Override // fastidiously.beachfront
        /* JADX INFO: renamed from: attabal */
        public cerebral.dern getSerializersModule() {
            return marial.this.getJson().getSerializersModule();
        }

        @Override // fastidiously.saneness, fastidiously.beachfront
        public void kattegat(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            marial.this.lightstruck(this.f32524saneness, new cutwater.dovishness(value, false, this.f32523dern));
        }
    }

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"kotlinx/serialization/json/internal/marial$saneness", "Lfastidiously/saneness;", "", "s", "", "polder", "(Ljava/lang/String;)V", "", "value", "oilcan", "(I)V", "", "apical", "(J)V", "", "competently", "(B)V", "", "arytenoidectomy", "(S)V", "Lcerebral/dern;", "attabal", "Lcerebral/dern;", "()Lcerebral/dern;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness extends fastidiously.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final cerebral.dern serializersModule;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f32526dern;

        public saneness(String str) {
            this.f32526dern = str;
            this.serializersModule = marial.this.getJson().getSerializersModule();
        }

        @Override // fastidiously.saneness, fastidiously.beachfront
        public void apical(long value) {
            polder(impromptu.attabal(patroclinal.monoploid.dern(value), 10));
        }

        @Override // fastidiously.saneness, fastidiously.beachfront
        public void arytenoidectomy(short value) {
            polder(patroclinal.graveside.taiyuan(patroclinal.graveside.dern(value)));
        }

        @Override // fastidiously.beachfront
        /* JADX INFO: renamed from: attabal, reason: from getter */
        public cerebral.dern getSerializersModule() {
            return this.serializersModule;
        }

        @Override // fastidiously.saneness, fastidiously.beachfront
        public void competently(byte value) {
            polder(patroclinal.impassible.taiyuan(patroclinal.impassible.dern(value)));
        }

        @Override // fastidiously.saneness, fastidiously.beachfront
        public void oilcan(int value) {
            polder(Long.toString(((long) patroclinal.kowloon.dern(value)) & 4294967295L, 10));
        }

        public final void polder(String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            marial.this.lightstruck(this.f32526dern, new cutwater.dovishness(s, false, null, 4, null));
        }
    }

    public /* synthetic */ marial(cutwater.attabal attabalVar, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, function1);
    }

    public static final Unit itchy(marial marialVar, cutwater.impromptu node) {
        Intrinsics.checkNotNullParameter(node, "node");
        marialVar.lightstruck(marialVar.splinterproof(), node);
        return Unit.f29295attabal;
    }

    @Override // fastidiously.beachfront
    /* JADX INFO: renamed from: attabal */
    public final cerebral.dern getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: coffeecake, reason: merged with bridge method [inline-methods] */
    public void merc(String tag, boolean value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.attabal(Boolean.valueOf(value)));
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: coi, reason: merged with bridge method [inline-methods] */
    public fastidiously.beachfront creditor(String tag, bristol.beachfront inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (starveling.saneness(inlineDescriptor)) {
            return palmyra(tag);
        }
        return starveling.attabal(inlineDescriptor) ? picketboat(tag, inlineDescriptor) : super.creditor(tag, inlineDescriptor);
    }

    @Override // fastidiously.wireman
    public boolean cuirassed(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // vinyl.sensatory
    public String cultivated(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: czestochowa, reason: merged with bridge method [inline-methods] */
    public void starveling(String tag, int value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Integer.valueOf(value)));
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: empress, reason: merged with bridge method [inline-methods] */
    public void privatdozent(String tag, float value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw preprohormone.dern(Float.valueOf(value), tag, igbo().toString());
        }
    }

    public final Function1<cutwater.impromptu, Unit> gusty() {
        return this.nodeConsumer;
    }

    public abstract cutwater.impromptu igbo();

    @Override // fastidiously.beachfront
    public void impassible() {
        String strOverspeculate = overspeculate();
        if (strOverspeculate == null) {
            this.nodeConsumer.invoke(cutwater.cord.INSTANCE);
        } else {
            underbelly(strOverspeculate);
        }
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: lerp, reason: merged with bridge method [inline-methods] */
    public void polder(String tag, byte value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Byte.valueOf(value)));
    }

    public abstract void lightstruck(String key, cutwater.impromptu element);

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: lotta, reason: merged with bridge method [inline-methods] */
    public void grimness(String tag, double value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw preprohormone.dern(Double.valueOf(value), tag, igbo().toString());
        }
    }

    @Override // vinyl.pruinose
    public void mathsort(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(igbo());
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: nosophobia, reason: merged with bridge method [inline-methods] */
    public void seminary(String tag, char value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.dern(String.valueOf(value)));
    }

    public final saneness palmyra(String tag) {
        return new saneness(tag);
    }

    public final attabal picketboat(String tag, bristol.beachfront inlineDescriptor) {
        return new attabal(tag, inlineDescriptor);
    }

    @Override // cutwater.molybdenite
    public void polloi(cutwater.impromptu element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator == null || (element instanceof cutwater.trm)) {
            preprohormone(cutwater.monoploid.f24572attabal, element);
        } else {
            grimness.wireman(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vinyl.sensatory
    public String premeiotic(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return cuirassed.impromptu(descriptor, this.json, index);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vinyl.pruinose, fastidiously.beachfront
    public <T> void preprohormone(asosan.impassible<? super T> serializer, T value) {
        String strDern;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (overspeculate() == null && clubfoot.dern(dent.attabal(serializer.getDescriptor(), getSerializersModule()))) {
            new oilcan(this.json, this.nodeConsumer).preprohormone(serializer, value);
            return;
        }
        if (getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(this, value);
            return;
        }
        boolean z = serializer instanceof vinyl.saneness;
        if (!z) {
            int i = grimness.attabal.f32508attabal[getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bristol.impassible kind = serializer.getDescriptor().getKind();
                strDern = (Intrinsics.wireman(kind, bristol.triweekly.attabal.f15179attabal) || Intrinsics.wireman(kind, bristol.triweekly.wireman.f15182attabal)) ? grimness.dern(serializer.getDescriptor(), getJson()) : null;
            }
        } else if (getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
        }
        if (z) {
            vinyl.saneness sanenessVar = (vinyl.saneness) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + sanenessVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            asosan.impassible<? super T> impassibleVarSaneness = asosan.taiyuan.saneness(sanenessVar, this, value);
            if (strDern != null) {
                grimness.marial(serializer, impassibleVarSaneness, strDern);
            }
            grimness.saneness(impassibleVarSaneness.getDescriptor().getKind());
            Intrinsics.competently(impassibleVarSaneness, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = impassibleVarSaneness;
        }
        if (strDern != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = strDern;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(this, value);
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: preterite, reason: merged with bridge method [inline-methods] */
    public void walach(String tag, short value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Short.valueOf(value)));
    }

    @Override // fastidiously.beachfront
    public fastidiously.wireman saneness(bristol.beachfront descriptor) {
        marial mercVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Function1<cutwater.impromptu, Unit> function1 = overspeculate() == null ? this.nodeConsumer : new Function1() { // from class: kotlinx.serialization.json.internal.wireman
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return marial.itchy(this.f32567kowloon, (cutwater.impromptu) obj);
            }
        };
        bristol.impassible kind = descriptor.getKind();
        if (Intrinsics.wireman(kind, bristol.triweekly.saneness.f15181attabal) || (kind instanceof bristol.wireman)) {
            mercVar = new merc(this.json, function1);
        } else if (Intrinsics.wireman(kind, bristol.triweekly.dern.f15180attabal)) {
            cutwater.attabal attabalVar = this.json;
            bristol.beachfront beachfrontVarAttabal = dent.attabal(descriptor.competently(0), attabalVar.getSerializersModule());
            bristol.impassible kind2 = beachfrontVarAttabal.getKind();
            if ((kind2 instanceof bristol.marial) || Intrinsics.wireman(kind2, bristol.impassible.saneness.f15156attabal)) {
                mercVar = new seminary(this.json, function1);
            } else {
                if (!attabalVar.getConfiguration().getAllowStructuredMapKeys()) {
                    throw preprohormone.wireman(beachfrontVarAttabal);
                }
                mercVar = new merc(this.json, function1);
            }
        } else {
            mercVar = new supplicat(this.json, function1);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (mercVar instanceof seminary) {
                seminary seminaryVar = (seminary) mercVar;
                seminaryVar.lightstruck(X3.i.W, cutwater.cutely.dern(str));
                String serialName = this.polymorphicSerialName;
                if (serialName == null) {
                    serialName = descriptor.getSerialName();
                }
                seminaryVar.lightstruck("value", cutwater.cutely.dern(serialName));
            } else {
                String serialName2 = this.polymorphicSerialName;
                if (serialName2 == null) {
                    serialName2 = descriptor.getSerialName();
                }
                mercVar.lightstruck(str, cutwater.cutely.dern(serialName2));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return mercVar;
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: sayid, reason: merged with bridge method [inline-methods] */
    public void saran(String tag, bristol.beachfront enumDescriptor, int ordinal) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        lightstruck(tag, cutwater.cutely.dern(enumDescriptor.marial(ordinal)));
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: sensatory, reason: merged with bridge method [inline-methods] */
    public void hydrovane(String tag, long value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cutely.saneness(Long.valueOf(value)));
    }

    @Override // vinyl.pruinose, fastidiously.beachfront
    public fastidiously.beachfront trm(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (overspeculate() == null) {
            return new oilcan(this.json, this.nodeConsumer).trm(descriptor);
        }
        if (this.polymorphicDiscriminator != null) {
            this.polymorphicSerialName = descriptor.getSerialName();
        }
        return super.trm(descriptor);
    }

    public void underbelly(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        lightstruck(tag, cutwater.cord.INSTANCE);
    }

    @Override // cutwater.molybdenite
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final cutwater.attabal getJson() {
        return this.json;
    }

    @Override // vinyl.pruinose
    /* JADX INFO: renamed from: wostteth, reason: merged with bridge method [inline-methods] */
    public void peridotite(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        lightstruck(tag, cutwater.cutely.dern(value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public marial(cutwater.attabal attabalVar, Function1<? super cutwater.impromptu, Unit> function1) {
        this.json = attabalVar;
        this.nodeConsumer = function1;
        this.configuration = attabalVar.getConfiguration();
    }

    @Override // fastidiously.beachfront
    public void gintrap() {
    }
}
