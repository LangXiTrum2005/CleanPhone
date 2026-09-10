package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import cutwater.JsonConfiguration;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\b\u00109\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u00105J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010[R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u0010\\R\u001a\u0010`\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010^\u001a\u0004\bW\u0010_R\u0016\u0010c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010dR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010fR\u0016\u0010j\u001a\u0004\u0018\u00010h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010i¨\u0006k"}, d2 = {"Lkotlinx/serialization/json/internal/privatdozent;", "Lcutwater/competently;", "", "Lfastidiously/attabal;", "Lcutwater/attabal;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", X3.a.t, "Lkotlinx/serialization/json/internal/attabal;", "lexer", "Lbristol/beachfront;", "descriptor", "Lkotlinx/serialization/json/internal/privatdozent$attabal;", "discriminatorHolder", "<init>", "(Lcutwater/attabal;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/attabal;Lbristol/beachfront;Lkotlinx/serialization/json/internal/privatdozent$attabal;)V", "", "unknownKey", "", "walach", "(Lkotlinx/serialization/json/internal/privatdozent$attabal;Ljava/lang/String;)Z", "", "hydrovane", "(Lbristol/beachfront;)V", "polder", "()V", "", "saran", "()I", "index", "seminary", "(Lbristol/beachfront;I)Z", "privatdozent", "(Lbristol/beachfront;)I", X3.i.W, "starveling", "(Ljava/lang/String;)Z", "grimness", "creditor", "()Ljava/lang/String;", "Lcutwater/impromptu;", "beachfront", "()Lcutwater/impromptu;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/dern;", "deserializer", "stratoscope", "(Lasosan/dern;)Ljava/lang/Object;", "Lfastidiously/dern;", "saneness", "(Lbristol/beachfront;)Lfastidiously/dern;", "dern", "trm", "()Z", "", "impromptu", "()Ljava/lang/Void;", "previousValue", "supplicat", "(Lbristol/beachfront;ILasosan/dern;Ljava/lang/Object;)Ljava/lang/Object;", "impassible", "graveside", "", "kattegat", "()B", "", "arytenoidectomy", "()S", "competently", "", "apical", "()J", "", "monoploid", "()F", "", "polloi", "()D", "", "adultoid", "()C", "gintrap", "Lfastidiously/marial;", "dovishness", "(Lbristol/beachfront;)Lfastidiously/marial;", "enumDescriptor", "taiyuan", "attabal", "Lcutwater/attabal;", "wireman", "()Lcutwater/attabal;", "Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/json/internal/attabal;", "Lcerebral/dern;", "Lcerebral/dern;", "()Lcerebral/dern;", "serializersModule", "marial", "I", "currentIndex", "Lkotlinx/serialization/json/internal/privatdozent$attabal;", "Lcutwater/beachfront;", "Lcutwater/beachfront;", "configuration", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "elementMarker", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class privatdozent extends fastidiously.attabal implements cutwater.competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cutwater.attabal json;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public attabal discriminatorHolder;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final JsonReader lexer;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final JsonElementMarker elementMarker;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final WriteMode mode;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cerebral.dern serializersModule;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/internal/privatdozent$attabal;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "attabal", "Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public String discriminatorToSkip;

        public attabal(String str) {
            this.discriminatorToSkip = str;
        }
    }

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f32548attabal;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32548attabal = iArr;
        }
    }

    public privatdozent(cutwater.attabal json, WriteMode mode, JsonReader lexer, bristol.beachfront descriptor, attabal attabalVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = attabalVar;
        JsonConfiguration jsonConfigurationMarial = json.getConfiguration();
        this.configuration = jsonConfigurationMarial;
        this.elementMarker = jsonConfigurationMarial.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public char adultoid() {
        String strMonoploid = this.lexer.monoploid();
        if (strMonoploid.length() == 1) {
            return strMonoploid.charAt(0);
        }
        JsonReader.rotuma(this.lexer, "Expected single char, but got '" + strMonoploid + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public long apical() {
        return this.lexer.impassible();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public short arytenoidectomy() {
        long jImpassible = this.lexer.impassible();
        short s = (short) jImpassible;
        if (jImpassible == s) {
            return s;
        }
        JsonReader.rotuma(this.lexer, "Failed to parse short for input '" + jImpassible + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // fastidiously.marial, fastidiously.dern
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public cerebral.dern getSerializersModule() {
        return this.serializersModule;
    }

    @Override // cutwater.competently
    public cutwater.impromptu beachfront() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).marial();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public int competently() {
        long jImpassible = this.lexer.impassible();
        int i = (int) jImpassible;
        if (jImpassible == i) {
            return i;
        }
        JsonReader.rotuma(this.lexer, "Failed to parse int for input '" + jImpassible + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String creditor() {
        return this.configuration.getIsLenient() ? this.lexer.polloi() : this.lexer.taiyuan();
    }

    @Override // fastidiously.attabal, fastidiously.dern
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            hydrovane(descriptor);
        }
        if (this.lexer.grimness() && !this.json.getConfiguration().getAllowTrailingComma()) {
            preprohormone.impromptu(this.lexer, "");
            throw new KotlinNothingValueException();
        }
        this.lexer.formularize(this.mode.end);
        this.lexer.path.saneness();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public fastidiously.marial dovishness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return starveling.saneness(descriptor) ? new rotuma(this.lexer, this.json) : super.dovishness(descriptor);
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public String gintrap() {
        return this.configuration.getIsLenient() ? this.lexer.polloi() : this.lexer.kowloon();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public boolean graveside() {
        return this.lexer.competently();
    }

    public final int grimness() {
        boolean zGrimness = this.lexer.grimness();
        if (!this.lexer.marial()) {
            if (!zGrimness || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            preprohormone.impromptu(this.lexer, "array");
            throw new KotlinNothingValueException();
        }
        int i = this.currentIndex;
        if (i != -1 && !zGrimness) {
            JsonReader.rotuma(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    public final void hydrovane(bristol.beachfront descriptor) {
        while (impassible(descriptor) != -1) {
        }
    }

    @Override // fastidiously.dern
    public int impassible(bristol.beachfront descriptor) {
        int iSaran;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = saneness.f32548attabal[this.mode.ordinal()];
        if (i != 2) {
            iSaran = i != 4 ? grimness() : privatdozent(descriptor);
        } else {
            iSaran = saran();
        }
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.competently(iSaran);
        }
        return iSaran;
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public Void impromptu() {
        return null;
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public byte kattegat() {
        long jImpassible = this.lexer.impassible();
        byte b = (byte) jImpassible;
        if (jImpassible == b) {
            return b;
        }
        JsonReader.rotuma(this.lexer, "Failed to parse byte for input '" + jImpassible + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public float monoploid() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            float f = Float.parseFloat(strMonoploid);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f;
            }
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            preprohormone.formularize(this.lexer, Float.valueOf(f));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'float' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    public final void polder() {
        if (this.lexer.sealless() != 4) {
            return;
        }
        JsonReader.rotuma(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public double polloi() {
        JsonReader jsonReader = this.lexer;
        String strMonoploid = jsonReader.monoploid();
        try {
            double d = Double.parseDouble(strMonoploid);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d;
            }
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            preprohormone.formularize(this.lexer, Double.valueOf(d));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            JsonReader.rotuma(jsonReader, "Failed to parse type 'double' for input '" + strMonoploid + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    public final int privatdozent(bristol.beachfront descriptor) {
        boolean zGrimness;
        boolean zGrimness2 = this.lexer.grimness();
        while (true) {
            boolean z = true;
            if (!this.lexer.marial()) {
                if (zGrimness2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    preprohormone.taiyuan(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.wireman();
                }
                return -1;
            }
            String strCreditor = creditor();
            this.lexer.formularize(':');
            int iTaiyuan = cuirassed.taiyuan(descriptor, this.json, strCreditor);
            if (iTaiyuan == -3) {
                zGrimness = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !seminary(descriptor, iTaiyuan)) {
                    JsonElementMarker jsonElementMarker2 = this.elementMarker;
                    if (jsonElementMarker2 != null) {
                        jsonElementMarker2.dern(iTaiyuan);
                    }
                    return iTaiyuan;
                }
                zGrimness = this.lexer.grimness();
                z = false;
            }
            zGrimness2 = z ? starveling(strCreditor) : zGrimness;
        }
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public fastidiously.dern saneness(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSaneness = dent.saneness(this.json, descriptor);
        this.lexer.path.dern(descriptor);
        this.lexer.formularize(writeModeSaneness.begin);
        polder();
        int i = saneness.f32548attabal[writeModeSaneness.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new privatdozent(this.json, writeModeSaneness, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == writeModeSaneness && this.json.getConfiguration().getExplicitNulls()) ? this : new privatdozent(this.json, writeModeSaneness, this.lexer, descriptor, this.discriminatorHolder);
    }

    public final int saran() {
        int i = this.currentIndex;
        boolean zGrimness = false;
        boolean z = i % 2 != 0;
        if (!z) {
            this.lexer.formularize(':');
        } else if (i != -1) {
            zGrimness = this.lexer.grimness();
        }
        if (!this.lexer.marial()) {
            if (!zGrimness || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            preprohormone.taiyuan(this.lexer, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (this.currentIndex == -1) {
                JsonReader jsonReader = this.lexer;
                int i2 = jsonReader.currentPosition;
                if (zGrimness) {
                    JsonReader.rotuma(jsonReader, "Unexpected leading comma", i2, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                JsonReader jsonReader2 = this.lexer;
                boolean z2 = zGrimness;
                int i3 = jsonReader2.currentPosition;
                if (!z2) {
                    JsonReader.rotuma(jsonReader2, "Expected comma after the key-value pair", i3, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i4 = this.currentIndex + 1;
        this.currentIndex = i4;
        return i4;
    }

    public final boolean seminary(bristol.beachfront descriptor, int index) {
        String strKattegat;
        cutwater.attabal attabalVar = this.json;
        boolean zTaiyuan = descriptor.taiyuan(index);
        bristol.beachfront beachfrontVarCompetently = descriptor.competently(index);
        if (zTaiyuan && !beachfrontVarCompetently.saneness() && this.lexer.saran(true)) {
            return true;
        }
        if (!Intrinsics.wireman(beachfrontVarCompetently.getKind(), bristol.impassible.saneness.f15156attabal) || ((beachfrontVarCompetently.saneness() && this.lexer.saran(false)) || (strKattegat = this.lexer.kattegat(this.configuration.getIsLenient())) == null)) {
            return false;
        }
        int iTaiyuan = cuirassed.taiyuan(beachfrontVarCompetently, attabalVar, strKattegat);
        boolean z = !attabalVar.getConfiguration().getExplicitNulls() && beachfrontVarCompetently.saneness();
        if (iTaiyuan == -3 && (zTaiyuan || z)) {
            this.lexer.kowloon();
            return true;
        }
        return false;
    }

    public final boolean starveling(String key) {
        if (this.configuration.getIgnoreUnknownKeys() || walach(this.discriminatorHolder, key)) {
            this.lexer.restrictive(this.configuration.getIsLenient());
        } else {
            this.lexer.cuirassed(key);
        }
        return this.lexer.grimness();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0157, please report this as an issue */
    @Override // fastidiously.attabal, fastidiously.marial
    public <T> T stratoscope(asosan.dern<? extends T> deserializer) {
        String message;
        cutwater.sealless seallessVarApical;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if ((deserializer instanceof vinyl.saneness) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
                String strDern = grimness.dern(((vinyl.saneness) deserializer).getDescriptor(), this.json);
                String strYemenite = this.lexer.yemenite(strDern, this.configuration.getIsLenient());
                if (strYemenite != null) {
                    try {
                        asosan.dern dernVarAttabal = asosan.taiyuan.attabal((vinyl.saneness) deserializer, this, strYemenite);
                        Intrinsics.competently(dernVarAttabal, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                        this.discriminatorHolder = new attabal(strDern);
                        return (T) dernVarAttabal.deserialize(this);
                    } catch (SerializationException e) {
                        String message2 = e.getMessage();
                        Intrinsics.beachfront(message2);
                        String strHerdbook = StringsKt.herdbook(StringsKt.tarboosh(message2, '\n', null, 2, null), ".");
                        String message3 = e.getMessage();
                        Intrinsics.beachfront(message3);
                        JsonReader.rotuma(this.lexer, strHerdbook, 0, StringsKt.immediately(message3, '\n', ""), 2, null);
                        throw new KotlinNothingValueException();
                    }
                }
                if (getJson().getConfiguration().getUseArrayPolymorphism()) {
                    return deserializer.deserialize(this);
                }
                String strDern2 = grimness.dern(((vinyl.saneness) deserializer).getDescriptor(), getJson());
                cutwater.impromptu impromptuVarBeachfront = beachfront();
                String serialName = ((vinyl.saneness) deserializer).getDescriptor().getSerialName();
                if (impromptuVarBeachfront instanceof cutwater.trm) {
                    cutwater.trm trmVar = (cutwater.trm) impromptuVarBeachfront;
                    cutwater.impromptu impromptuVar = (cutwater.impromptu) trmVar.get(strDern2);
                    try {
                        asosan.dern dernVarAttabal2 = asosan.taiyuan.attabal((vinyl.saneness) deserializer, this, (impromptuVar == null || (seallessVarApical = cutwater.cutely.apical(impromptuVar)) == null) ? null : cutwater.cutely.beachfront(seallessVarApical));
                        Intrinsics.competently(dernVarAttabal2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                        return (T) splinterproof.saneness(getJson(), strDern2, trmVar, dernVarAttabal2);
                    } catch (SerializationException e2) {
                        String message4 = e2.getMessage();
                        Intrinsics.beachfront(message4);
                        throw preprohormone.beachfront(-1, message4, trmVar.toString());
                    }
                }
                throw preprohormone.beachfront(-1, "Expected " + p002kotlin.jvm.internal.polloi.saneness(cutwater.trm.class).taiyuan() + ", but had " + p002kotlin.jvm.internal.polloi.saneness(impromptuVarBeachfront.getClass()).taiyuan() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.attabal(), impromptuVarBeachfront.toString());
                message = e.getMessage();
                Intrinsics.beachfront(message);
                if (StringsKt.overspeculate(message, "at path", false, 2, null)) {
                    throw e;
                }
                throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + this.lexer.path.attabal(), e);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e3) {
            message = e3.getMessage();
            Intrinsics.beachfront(message);
            if (StringsKt.overspeculate(message, "at path", false, 2, null)) {
                throw e3;
            }
            throw new MissingFieldException(e3.getMissingFields(), e3.getMessage() + " at path: " + this.lexer.path.attabal(), e3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fastidiously.attabal, fastidiously.dern
    public <T> T supplicat(bristol.beachfront descriptor, int index, asosan.dern<? extends T> deserializer, T previousValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.mode == WriteMode.MAP && (index & 1) == 0;
        if (z) {
            this.lexer.path.wireman();
        }
        T t = (T) super.supplicat(descriptor, index, deserializer, previousValue);
        if (z) {
            this.lexer.path.beachfront(t);
        }
        return t;
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public int taiyuan(bristol.beachfront enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return cuirassed.cutely(enumDescriptor, this.json, gintrap(), " at path " + this.lexer.path.attabal());
    }

    @Override // fastidiously.attabal, fastidiously.marial
    public boolean trm() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.getIsUnmarkedNull() : false) || JsonReader.privatdozent(this.lexer, false, 1, null)) ? false : true;
    }

    public final boolean walach(attabal attabalVar, String str) {
        if (attabalVar == null || !Intrinsics.wireman(attabalVar.discriminatorToSkip, str)) {
            return false;
        }
        attabalVar.discriminatorToSkip = null;
        return true;
    }

    @Override // cutwater.competently
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final cutwater.attabal getJson() {
        return this.json;
    }
}
