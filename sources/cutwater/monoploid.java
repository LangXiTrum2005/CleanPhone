package cutwater;

import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcutwater/monoploid;", "Lasosan/wireman;", "Lcutwater/impromptu;", "<init>", "()V", "Lfastidiously/beachfront;", "encoder", "value", "", "triweekly", "(Lfastidiously/beachfront;Lcutwater/impromptu;)V", "Lfastidiously/marial;", "decoder", "impassible", "(Lfastidiously/marial;)Lcutwater/impromptu;", "Lbristol/beachfront;", "saneness", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class monoploid implements asosan.wireman<impromptu> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final monoploid f24572attabal = new monoploid();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final bristol.beachfront descriptor = bristol.formularize.wireman("kotlinx.serialization.json.JsonElement", bristol.wireman.saneness.f15184attabal, new bristol.beachfront[0], new Function1() { // from class: cutwater.apical
        @Override // p002kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return monoploid.competently((bristol.attabal) obj);
        }
    });

    public static final bristol.beachfront apical() {
        return yemenite.f24595attabal.getDescriptor();
    }

    public static final Unit competently(bristol.attabal buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bristol.attabal.saneness(buildSerialDescriptor, "JsonPrimitive", polloi.beachfront(new Function0() { // from class: cutwater.formularize
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return monoploid.impromptu();
            }
        }), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "JsonNull", polloi.beachfront(new Function0() { // from class: cutwater.impassible
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return monoploid.taiyuan();
            }
        }), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "JsonLiteral", polloi.beachfront(new Function0() { // from class: cutwater.triweekly
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return monoploid.cutely();
            }
        }), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "JsonObject", polloi.beachfront(new Function0() { // from class: cutwater.kowloon
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return monoploid.apical();
            }
        }), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "JsonArray", polloi.beachfront(new Function0() { // from class: cutwater.arytenoidectomy
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return monoploid.formularize();
            }
        }), null, false, 12, null);
        return Unit.f29295attabal;
    }

    public static final bristol.beachfront cutely() {
        return gintrap.f24568attabal.getDescriptor();
    }

    public static final bristol.beachfront formularize() {
        return dern.f24560attabal.getDescriptor();
    }

    public static final bristol.beachfront impromptu() {
        return kattegat.f24570attabal.getDescriptor();
    }

    public static final bristol.beachfront taiyuan() {
        return cuirassed.f24557attabal.getDescriptor();
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return descriptor;
    }

    @Override // asosan.dern
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public impromptu deserialize(fastidiously.marial decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return polloi.wireman(decoder).beachfront();
    }

    @Override // asosan.impassible
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public void serialize(fastidiously.beachfront encoder, impromptu value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        polloi.impromptu(encoder);
        if (value instanceof sealless) {
            encoder.preprohormone(kattegat.f24570attabal, value);
        } else if (value instanceof trm) {
            encoder.preprohormone(yemenite.f24595attabal, value);
        } else {
            if (!(value instanceof saneness)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.preprohormone(dern.f24560attabal, value);
        }
    }
}
