package cutwater;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR(\u0010%\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\"\u0010,\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R(\u00105\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010$\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00109\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\n\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR(\u0010>\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010\n\u0012\u0004\b=\u0010$\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR(\u0010C\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b?\u0010\n\u0012\u0004\bB\u0010$\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR(\u0010H\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bD\u0010\n\u0012\u0004\bG\u0010$\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\"\u0010L\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\"\u0010O\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\b\u0010\u0010W\"\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lcutwater/wireman;", "", "Lcutwater/attabal;", "json", "<init>", "(Lcutwater/attabal;)V", "Lcutwater/beachfront;", "attabal", "()Lcutwater/beachfront;", "", "Z", "getEncodeDefaults", "()Z", "wireman", "(Z)V", "encodeDefaults", "saneness", "getExplicitNulls", "marial", "explicitNulls", "dern", "getIgnoreUnknownKeys", "beachfront", "ignoreUnknownKeys", "isLenient", "setLenient", "getPrettyPrint", "competently", "prettyPrint", "", "Ljava/lang/String;", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "getPrettyPrintIndent$annotations", "()V", "prettyPrintIndent", "getCoerceInputValues", "setCoerceInputValues", "coerceInputValues", "impromptu", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminator", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "taiyuan", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations", "classDiscriminatorMode", "cutely", "getUseAlternativeNames", "setUseAlternativeNames", "useAlternativeNames", "apical", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "decodeEnumsCaseInsensitive", "formularize", "getAllowTrailingComma", "setAllowTrailingComma", "getAllowTrailingComma$annotations", "allowTrailingComma", "impassible", "getAllowComments", "setAllowComments", "getAllowComments$annotations", "allowComments", "triweekly", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowSpecialFloatingPointValues", "kowloon", "getAllowStructuredMapKeys", "allowStructuredMapKeys", "arytenoidectomy", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "useArrayPolymorphism", "Lcerebral/dern;", "monoploid", "Lcerebral/dern;", "()Lcerebral/dern;", "setSerializersModule", "(Lcerebral/dern;)V", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public boolean decodeEnumsCaseInsensitive;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public boolean encodeDefaults;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public String prettyPrintIndent;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean coerceInputValues;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public boolean useAlternativeNames;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public boolean allowTrailingComma;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public boolean allowComments;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public String classDiscriminator;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public boolean allowStructuredMapKeys;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean prettyPrint;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public cerebral.dern serializersModule;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean explicitNulls;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public ClassDiscriminatorMode classDiscriminatorMode;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean isLenient;

    public wireman(attabal json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().getIsLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        json.getConfiguration().formularize();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    public final JsonConfiguration attabal() {
        if (this.useArrayPolymorphism) {
            if (!Intrinsics.wireman(this.classDiscriminator, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.prettyPrint) {
            if (!Intrinsics.wireman(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!Intrinsics.wireman(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, null, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    public final void beachfront(boolean z) {
        this.ignoreUnknownKeys = z;
    }

    public final void competently(boolean z) {
        this.prettyPrint = z;
    }

    public final void dern(boolean z) {
        this.allowStructuredMapKeys = z;
    }

    public final void marial(boolean z) {
        this.explicitNulls = z;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final cerebral.dern getSerializersModule() {
        return this.serializersModule;
    }

    public final void wireman(boolean z) {
        this.encodeDefaults = z;
    }
}
