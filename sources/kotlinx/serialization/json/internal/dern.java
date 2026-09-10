package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import cutwater.JsonConfiguration;
import kotlinx.serialization.SerializationException;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import vinyl.czestochowa;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010.\u001a\u00020!H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010\u0016J\u001f\u0010K\u001a\u00020J2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010I\u001a\u00020!H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bS\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\u0082\u0001\u0003_`a¨\u0006b"}, d2 = {"Lkotlinx/serialization/json/internal/dern;", "Lvinyl/czestochowa;", "Lcutwater/competently;", "Lcutwater/attabal;", "json", "Lcutwater/impromptu;", "value", "", "polymorphicDiscriminator", "<init>", "(Lcutwater/attabal;Lcutwater/impromptu;Ljava/lang/String;)V", "Lcutwater/sealless;", "literal", "primitive", "tag", "", "claque", "(Lcutwater/sealless;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "coi", "()Lcutwater/impromptu;", "currentTag", "unconsolidated", "(Ljava/lang/String;)Ljava/lang/String;", "beachfront", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/dern;", "deserializer", "stratoscope", "(Lasosan/dern;)Ljava/lang/Object;", "parentName", "childName", "treadless", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lbristol/beachfront;", "descriptor", "Lfastidiously/dern;", "saneness", "(Lbristol/beachfront;)Lfastidiously/dern;", "", "dern", "(Lbristol/beachfront;)V", "", "trm", "()Z", "empress", "(Ljava/lang/String;)Lcutwater/impromptu;", "enumDescriptor", "", "wostteth", "(Ljava/lang/String;Lbristol/beachfront;)I", "czestochowa", "(Ljava/lang/String;)Z", "", "sensatory", "(Ljava/lang/String;)B", "", "lightstruck", "(Ljava/lang/String;)S", "picketboat", "(Ljava/lang/String;)I", "", "palmyra", "(Ljava/lang/String;)J", "", "igbo", "(Ljava/lang/String;)F", "", "preterite", "(Ljava/lang/String;)D", "", "underbelly", "(Ljava/lang/String;)C", "monroe", "inlineDescriptor", "Lfastidiously/marial;", "gusty", "(Ljava/lang/String;Lbristol/beachfront;)Lfastidiously/marial;", "dovishness", "(Lbristol/beachfront;)Lfastidiously/marial;", "Lcutwater/attabal;", "wireman", "()Lcutwater/attabal;", "Lcutwater/impromptu;", "achondroplasia", "Ljava/lang/String;", "julian", "()Ljava/lang/String;", "Lcutwater/beachfront;", "marial", "Lcutwater/beachfront;", "configuration", "Lcerebral/dern;", "attabal", "()Lcerebral/dern;", "serializersModule", "Lkotlinx/serialization/json/internal/trm;", "Lkotlinx/serialization/json/internal/kattegat;", "Lkotlinx/serialization/json/internal/restrictive;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class dern extends czestochowa implements cutwater.competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final cutwater.attabal json;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final JsonConfiguration configuration;
    private final cutwater.impromptu value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final String polymorphicDiscriminator;

    public /* synthetic */ dern(cutwater.attabal attabalVar, cutwater.impromptu impromptuVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, impromptuVar, str);
    }

    /* JADX INFO: renamed from: achondroplasia, reason: from getter */
    public cutwater.impromptu getValue() {
        return this.value;
    }

    @Override // fastidiously.marial, fastidiously.dern
    /* JADX INFO: renamed from: attabal */
    public cerebral.dern getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @Override // cutwater.competently
    public cutwater.impromptu beachfront() {
        return coi();
    }

    public final Void claque(cutwater.sealless literal, String primitive, String tag) {
        StringBuilder sb;
        String str;
        if (p002kotlin.text.dovishness.starveling(primitive, "i", false, 2, null)) {
            sb = new StringBuilder();
            str = "an ";
        } else {
            sb = new StringBuilder();
            str = "a ";
        }
        sb.append(str);
        sb.append(primitive);
        throw preprohormone.beachfront(-1, "Failed to parse literal '" + literal + "' as " + sb.toString() + " value at element: " + unconsolidated(tag), coi().toString());
    }

    public final cutwater.impromptu coi() {
        cutwater.impromptu impromptuVarEmpress;
        String strDent = dent();
        return (strDent == null || (impromptuVarEmpress = empress(strDent)) == null) ? getValue() : impromptuVarEmpress;
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: czestochowa, reason: merged with bridge method [inline-methods] */
    public boolean saran(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                Boolean boolMarial = cutwater.cutely.marial(seallessVar);
                if (boolMarial != null) {
                    return boolMarial.booleanValue();
                }
                claque(seallessVar, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of boolean at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // fastidiously.dern
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // vinyl.cosy, fastidiously.marial
    public fastidiously.marial dovishness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return dent() != null ? super.dovishness(descriptor) : new trm(getJson(), getValue(), this.polymorphicDiscriminator).dovishness(descriptor);
    }

    public abstract cutwater.impromptu empress(String tag);

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: gusty, reason: merged with bridge method [inline-methods] */
    public fastidiously.marial peridotite(String tag, bristol.beachfront inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!starveling.saneness(inlineDescriptor)) {
            return super.peridotite(tag, inlineDescriptor);
        }
        cutwater.attabal json = getJson();
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            return new rotuma(walach.attabal(json, ((cutwater.sealless) impromptuVarEmpress).getContent()), getJson());
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: igbo, reason: merged with bridge method [inline-methods] */
    public float walach(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                float fImpromptu = cutwater.cutely.impromptu(seallessVar);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return fImpromptu;
                }
                if (Float.isInfinite(fImpromptu) || Float.isNaN(fImpromptu)) {
                    throw preprohormone.attabal(Float.valueOf(fImpromptu), tag, coi().toString());
                }
                return fImpromptu;
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of float at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    /* JADX INFO: renamed from: julian, reason: from getter */
    public final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: lightstruck, reason: merged with bridge method [inline-methods] */
    public short overspeculate(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                int iTaiyuan = cutwater.cutely.taiyuan(seallessVar);
                Short shValueOf = (-32768 > iTaiyuan || iTaiyuan > 32767) ? null : Short.valueOf((short) iTaiyuan);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                claque(seallessVar, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of short at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: monroe, reason: merged with bridge method [inline-methods] */
    public String clubfoot(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (!(impromptuVarEmpress instanceof cutwater.sealless)) {
            throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of string at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
        }
        cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
        if (!(seallessVar instanceof cutwater.dovishness)) {
            throw preprohormone.beachfront(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + unconsolidated(tag), coi().toString());
        }
        cutwater.dovishness dovishnessVar = (cutwater.dovishness) seallessVar;
        if (dovishnessVar.getIsString() || getJson().getConfiguration().getIsLenient()) {
            return dovishnessVar.getContent();
        }
        throw preprohormone.beachfront(-1, "String literal for key '" + tag + "' should be quoted at element: " + unconsolidated(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", coi().toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: palmyra, reason: merged with bridge method [inline-methods] */
    public long splinterproof(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                return cutwater.cutely.impassible(seallessVar);
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of long at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: picketboat, reason: merged with bridge method [inline-methods] */
    public int mathsort(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                return cutwater.cutely.taiyuan(seallessVar);
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of int at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: preterite, reason: merged with bridge method [inline-methods] */
    public double starveling(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                double dCompetently = cutwater.cutely.competently(seallessVar);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return dCompetently;
                }
                if (Double.isInfinite(dCompetently) || Double.isNaN(dCompetently)) {
                    throw preprohormone.attabal(Double.valueOf(dCompetently), tag, coi().toString());
                }
                return dCompetently;
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of double at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // fastidiously.marial
    public fastidiously.dern saneness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        cutwater.impromptu impromptuVarCoi = coi();
        bristol.impassible kind = descriptor.getKind();
        if (Intrinsics.wireman(kind, bristol.triweekly.saneness.f15181attabal) || (kind instanceof bristol.wireman)) {
            cutwater.attabal json = getJson();
            String serialName = descriptor.getSerialName();
            if (impromptuVarCoi instanceof cutwater.saneness) {
                return new restrictive(json, (cutwater.saneness) impromptuVarCoi);
            }
            throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.saneness.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarCoi.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + nosophobia(), impromptuVarCoi.toString());
        }
        if (!Intrinsics.wireman(kind, bristol.triweekly.dern.f15180attabal)) {
            cutwater.attabal json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (impromptuVarCoi instanceof cutwater.trm) {
                return new kattegat(json2, (cutwater.trm) impromptuVarCoi, this.polymorphicDiscriminator, null, 8, null);
            }
            throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.trm.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarCoi.getClass()).taiyuan() + " as the serialized body of " + serialName2 + " at element: " + nosophobia(), impromptuVarCoi.toString());
        }
        cutwater.attabal json3 = getJson();
        bristol.beachfront beachfrontVarAttabal = dent.attabal(descriptor.competently(0), json3.getSerializersModule());
        bristol.impassible kind2 = beachfrontVarAttabal.getKind();
        if ((kind2 instanceof bristol.marial) || Intrinsics.wireman(kind2, bristol.impassible.saneness.f15156attabal)) {
            cutwater.attabal json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (impromptuVarCoi instanceof cutwater.trm) {
                return new polder(json4, (cutwater.trm) impromptuVarCoi);
            }
            throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.trm.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarCoi.getClass()).taiyuan() + " as the serialized body of " + serialName3 + " at element: " + nosophobia(), impromptuVarCoi.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw preprohormone.wireman(beachfrontVarAttabal);
        }
        cutwater.attabal json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (impromptuVarCoi instanceof cutwater.saneness) {
            return new restrictive(json5, (cutwater.saneness) impromptuVarCoi);
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.saneness.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarCoi.getClass()).taiyuan() + " as the serialized body of " + serialName4 + " at element: " + nosophobia(), impromptuVarCoi.toString());
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: sensatory, reason: merged with bridge method [inline-methods] */
    public byte privatdozent(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                int iTaiyuan = cutwater.cutely.taiyuan(seallessVar);
                Byte bValueOf = (-128 > iTaiyuan || iTaiyuan > 127) ? null : Byte.valueOf((byte) iTaiyuan);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                claque(seallessVar, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of byte at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // vinyl.cosy, fastidiously.marial
    public <T> T stratoscope(asosan.dern<? extends T> deserializer) {
        cutwater.sealless seallessVarApical;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof vinyl.saneness) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        vinyl.saneness sanenessVar = (vinyl.saneness) deserializer;
        String strDern = grimness.dern(sanenessVar.getDescriptor(), getJson());
        cutwater.impromptu impromptuVarBeachfront = beachfront();
        String serialName = sanenessVar.getDescriptor().getSerialName();
        if (impromptuVarBeachfront instanceof cutwater.trm) {
            cutwater.trm trmVar = (cutwater.trm) impromptuVarBeachfront;
            cutwater.impromptu impromptuVar = (cutwater.impromptu) trmVar.get(strDern);
            try {
                asosan.dern dernVarAttabal = asosan.taiyuan.attabal((vinyl.saneness) deserializer, this, (impromptuVar == null || (seallessVarApical = cutwater.cutely.apical(impromptuVar)) == null) ? null : cutwater.cutely.beachfront(seallessVarApical));
                Intrinsics.competently(dernVarAttabal, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) splinterproof.saneness(getJson(), strDern, trmVar, dernVarAttabal);
            } catch (SerializationException e) {
                String message = e.getMessage();
                Intrinsics.beachfront(message);
                throw preprohormone.beachfront(-1, message, trmVar.toString());
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.trm.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarBeachfront.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + nosophobia(), impromptuVarBeachfront.toString());
    }

    @Override // vinyl.czestochowa
    public String treadless(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // fastidiously.marial
    public boolean trm() {
        return !(coi() instanceof cutwater.cord);
    }

    public final String unconsolidated(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return nosophobia() + '.' + currentTag;
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: underbelly, reason: merged with bridge method [inline-methods] */
    public char creditor(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            cutwater.sealless seallessVar = (cutwater.sealless) impromptuVarEmpress;
            try {
                return p002kotlin.text.cord.twybill(seallessVar.getContent());
            } catch (IllegalArgumentException unused) {
                claque(seallessVar, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of char at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    @Override // cutwater.competently
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public cutwater.attabal getJson() {
        return this.json;
    }

    @Override // vinyl.cosy
    /* JADX INFO: renamed from: wostteth, reason: merged with bridge method [inline-methods] */
    public int hydrovane(String tag, bristol.beachfront enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        cutwater.attabal json = getJson();
        cutwater.impromptu impromptuVarEmpress = empress(tag);
        String serialName = enumDescriptor.getSerialName();
        if (impromptuVarEmpress instanceof cutwater.sealless) {
            return cuirassed.apical(enumDescriptor, json, ((cutwater.sealless) impromptuVarEmpress).getContent(), null, 4, null);
        }
        throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.sealless.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarEmpress.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + unconsolidated(tag), impromptuVarEmpress.toString());
    }

    public /* synthetic */ dern(cutwater.attabal attabalVar, cutwater.impromptu impromptuVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, impromptuVar, (i & 4) != 0 ? null : str, null);
    }

    public dern(cutwater.attabal attabalVar, cutwater.impromptu impromptuVar, String str) {
        this.json = attabalVar;
        this.value = impromptuVar;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }
}
