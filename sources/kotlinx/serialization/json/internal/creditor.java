package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import cutwater.JsonConfiguration;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u001bJA\u0010)\u001a\u00020\u0012\"\b\b\u0000\u0010\u001c*\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u00122\u0006\u0010L\u001a\u00020F2\u0006\u0010M\u001a\u00020FH\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010UR\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010VR\u001a\u0010[\u001a\u00020W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bP\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010]R\u0016\u0010`\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010a¨\u0006d"}, d2 = {"Lkotlinx/serialization/json/internal/creditor;", "Lcutwater/molybdenite;", "Lfastidiously/saneness;", "Lkotlinx/serialization/json/internal/triweekly;", "composer", "Lcutwater/attabal;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", X3.a.t, "", "modeReuseCache", "<init>", "(Lkotlinx/serialization/json/internal/triweekly;Lcutwater/attabal;Lkotlinx/serialization/json/internal/WriteMode;[Lcutwater/molybdenite;)V", "Lkotlinx/serialization/json/internal/gintrap;", AgentOptions.OUTPUT, "(Lkotlinx/serialization/json/internal/gintrap;Lcutwater/attabal;Lkotlinx/serialization/json/internal/WriteMode;[Lcutwater/molybdenite;)V", "Lcutwater/impromptu;", "element", "", "polloi", "(Lcutwater/impromptu;)V", "Lbristol/beachfront;", "descriptor", "", "index", "", "cuirassed", "(Lbristol/beachfront;I)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lasosan/impassible;", "serializer", "value", "preprohormone", "(Lasosan/impassible;Ljava/lang/Object;)V", "Lfastidiously/wireman;", "saneness", "(Lbristol/beachfront;)Lfastidiously/wireman;", "dern", "(Lbristol/beachfront;)V", "supplicat", "", "taiyuan", "(Lbristol/beachfront;ILasosan/impassible;Ljava/lang/Object;)V", "Lfastidiously/beachfront;", "trm", "(Lbristol/beachfront;)Lfastidiously/beachfront;", "impassible", "()V", "monoploid", "(Z)V", "", "competently", "(B)V", "", "arytenoidectomy", "(S)V", "oilcan", "(I)V", "", "apical", "(J)V", "", "graveside", "(F)V", "", "beachfront", "(D)V", "", "dovishness", "(C)V", "", "kattegat", "(Ljava/lang/String;)V", "enumDescriptor", "impromptu", "(Lbristol/beachfront;I)V", "discriminator", "serialName", "polder", "(Ljava/lang/String;Ljava/lang/String;)V", "attabal", "Lkotlinx/serialization/json/internal/triweekly;", "Lcutwater/attabal;", "wireman", "()Lcutwater/attabal;", "Lkotlinx/serialization/json/internal/WriteMode;", "[Lcutwater/molybdenite;", "Lcerebral/dern;", "marial", "Lcerebral/dern;", "()Lcerebral/dern;", "serializersModule", "Lcutwater/beachfront;", "Lcutwater/beachfront;", "configuration", "Z", "forceQuoting", "Ljava/lang/String;", "polymorphicDiscriminator", "polymorphicSerialName", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class creditor extends fastidiously.saneness implements cutwater.molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final triweekly composer;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final JsonConfiguration configuration;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean forceQuoting;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final WriteMode mode;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public String polymorphicDiscriminator;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final cerebral.dern serializersModule;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cutwater.attabal json;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public String polymorphicSerialName;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cutwater.molybdenite[] modeReuseCache;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f32498attabal;

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
            f32498attabal = iArr;
        }
    }

    public creditor(triweekly composer, cutwater.attabal json, WriteMode mode, cutwater.molybdenite[] molybdeniteVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = molybdeniteVarArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (molybdeniteVarArr != null) {
            cutwater.molybdenite molybdeniteVar = molybdeniteVarArr[iOrdinal];
            if (molybdeniteVar == null && molybdeniteVar == this) {
                return;
            }
            molybdeniteVarArr[iOrdinal] = this;
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void apical(long value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf(value));
        } else {
            this.composer.cutely(value);
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void arytenoidectomy(short value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf((int) value));
        } else {
            this.composer.formularize(value);
        }
    }

    @Override // fastidiously.beachfront
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public cerebral.dern getSerializersModule() {
        return this.serializersModule;
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void beachfront(double value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf(value));
        } else {
            this.composer.competently(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw preprohormone.saneness(Double.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void competently(byte value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf((int) value));
        } else {
            this.composer.marial(value);
        }
    }

    @Override // fastidiously.saneness, fastidiously.wireman
    public boolean cuirassed(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // fastidiously.saneness, fastidiously.wireman
    public void dern(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.monoploid();
            this.composer.wireman();
            this.composer.beachfront(this.mode.end);
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void dovishness(char value) {
        kattegat(String.valueOf(value));
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void graveside(float value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf(value));
        } else {
            this.composer.impromptu(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw preprohormone.saneness(Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void impassible() {
        this.composer.apical("null");
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void impromptu(bristol.beachfront enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        kattegat(enumDescriptor.marial(index));
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void kattegat(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.triweekly(value);
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void monoploid(boolean value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf(value));
        } else {
            this.composer.impassible(value);
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public void oilcan(int value) {
        if (this.forceQuoting) {
            kattegat(String.valueOf(value));
        } else {
            this.composer.taiyuan(value);
        }
    }

    public final void polder(String discriminator, String serialName) {
        this.composer.dern();
        kattegat(discriminator);
        this.composer.beachfront(':');
        this.composer.arytenoidectomy();
        kattegat(serialName);
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

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fastidiously.saneness, fastidiously.beachfront
    public <T> void preprohormone(asosan.impassible<? super T> serializer, T value) {
        String strDern;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
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

    @Override // fastidiously.saneness, fastidiously.beachfront
    public fastidiously.wireman saneness(bristol.beachfront descriptor) {
        cutwater.molybdenite molybdeniteVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSaneness = dent.saneness(getJson(), descriptor);
        char c = writeModeSaneness.begin;
        if (c != 0) {
            this.composer.beachfront(c);
            this.composer.saneness();
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            polder(str, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == writeModeSaneness) {
            return this;
        }
        cutwater.molybdenite[] molybdeniteVarArr = this.modeReuseCache;
        return (molybdeniteVarArr == null || (molybdeniteVar = molybdeniteVarArr[writeModeSaneness.ordinal()]) == null) ? new creditor(this.composer, getJson(), writeModeSaneness, this.modeReuseCache) : molybdeniteVar;
    }

    @Override // fastidiously.saneness
    public boolean supplicat(bristol.beachfront descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = attabal.f32498attabal[this.mode.ordinal()];
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.beachfront(',');
                    }
                    this.composer.dern();
                    kattegat(cuirassed.impromptu(descriptor, getJson(), index));
                    this.composer.beachfront(':');
                    this.composer.arytenoidectomy();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.beachfront(',');
                        this.composer.arytenoidectomy();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.dern();
            } else {
                if (index % 2 == 0) {
                    this.composer.beachfront(',');
                    this.composer.dern();
                    z = true;
                } else {
                    this.composer.beachfront(':');
                    this.composer.arytenoidectomy();
                }
                this.forceQuoting = z;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.beachfront(',');
            }
            this.composer.dern();
        }
        return true;
    }

    @Override // fastidiously.saneness, fastidiously.wireman
    public <T> void taiyuan(bristol.beachfront descriptor, int index, asosan.impassible<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.taiyuan(descriptor, index, serializer, value);
        }
    }

    @Override // fastidiously.saneness, fastidiously.beachfront
    public fastidiously.beachfront trm(bristol.beachfront descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (starveling.saneness(descriptor)) {
            triweekly polloiVar = this.composer;
            if (!(polloiVar instanceof polloi)) {
                polloiVar = new polloi(polloiVar.writer, this.forceQuoting);
            }
            return new creditor(polloiVar, getJson(), this.mode, (cutwater.molybdenite[]) null);
        }
        if (starveling.attabal(descriptor)) {
            triweekly kowloonVar = this.composer;
            if (!(kowloonVar instanceof kowloon)) {
                kowloonVar = new kowloon(kowloonVar.writer, this.forceQuoting);
            }
            return new creditor(kowloonVar, getJson(), this.mode, (cutwater.molybdenite[]) null);
        }
        if (this.polymorphicDiscriminator == null) {
            return super.trm(descriptor);
        }
        this.polymorphicSerialName = descriptor.getSerialName();
        return this;
    }

    @Override // cutwater.molybdenite
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public cutwater.attabal getJson() {
        return this.json;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public creditor(gintrap output, cutwater.attabal json, WriteMode mode, cutwater.molybdenite[] modeReuseCache) {
        this(graveside.attabal(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }
}
