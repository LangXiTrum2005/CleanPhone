package cutwater;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cutwater.beachfront, reason: from toString */
/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001Bµ\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001c\u0012\u0004\b1\u0010,\u001a\u0004\b-\u0010\u001eR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001c\u0012\u0004\b2\u0010,\u001a\u0004\b#\u0010\u001eR \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u001c\u0012\u0004\b3\u0010,\u001a\u0004\b\u001b\u0010\u001eR0\u0010\u0016\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158\u0006@GX\u0087\u000e¢\u0006\u0018\n\u0004\b.\u00105\u0012\u0004\b9\u0010,\u001a\u0004\b&\u00106\"\u0004\b7\u00108R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\b<\u0010,\u001a\u0004\b/\u0010;¨\u0006="}, d2 = {"Lcutwater/beachfront;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Lcutwater/preprohormone;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "allowComments", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLcutwater/preprohormone;ZZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "()Ljava/lang/String;", "attabal", "Z", "taiyuan", "()Z", "saneness", "apical", "dern", "monoploid", "wireman", "marial", "impassible", "beachfront", "cutely", "competently", "Ljava/lang/String;", "triweekly", "getPrettyPrintIndent$annotations", "()V", "impromptu", "arytenoidectomy", "formularize", "kowloon", "getDecodeEnumsCaseInsensitive$annotations", "getAllowTrailingComma$annotations", "getAllowComments$annotations", "value", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getClassDiscriminatorMode$annotations", "Lcutwater/preprohormone;", "()Lcutwater/preprohormone;", "getNamingStrategy$annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonConfiguration {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowSpecialFloatingPointValues;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    public ClassDiscriminatorMode classDiscriminatorMode;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean encodeDefaults;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean explicitNulls;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    public final String prettyPrintIndent;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata and from toString */
    public final String classDiscriminator;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isLenient;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean useAlternativeNames;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean decodeEnumsCaseInsensitive;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean coerceInputValues;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowComments;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean prettyPrint;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean ignoreUnknownKeys;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean useArrayPolymorphism;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowTrailingComma;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean allowStructuredMapKeys;

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String prettyPrintIndent, boolean z7, boolean z8, String classDiscriminator, boolean z9, boolean z10, preprohormone preprohormoneVar, boolean z11, boolean z12, boolean z13, ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.encodeDefaults = z;
        this.ignoreUnknownKeys = z2;
        this.isLenient = z3;
        this.allowStructuredMapKeys = z4;
        this.prettyPrint = z5;
        this.explicitNulls = z6;
        this.prettyPrintIndent = prettyPrintIndent;
        this.coerceInputValues = z7;
        this.useArrayPolymorphism = z8;
        this.classDiscriminator = classDiscriminator;
        this.allowSpecialFloatingPointValues = z9;
        this.useAlternativeNames = z10;
        this.decodeEnumsCaseInsensitive = z11;
        this.allowTrailingComma = z12;
        this.allowComments = z13;
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    /* JADX INFO: renamed from: apical, reason: from getter */
    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getAllowComments() {
        return this.allowComments;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final preprohormone formularize() {
        return null;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final boolean getIsLenient() {
        return this.isLenient;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.encodeDefaults + ", ignoreUnknownKeys=" + this.ignoreUnknownKeys + ", isLenient=" + this.isLenient + ", allowStructuredMapKeys=" + this.allowStructuredMapKeys + ", prettyPrint=" + this.prettyPrint + ", explicitNulls=" + this.explicitNulls + ", prettyPrintIndent='" + this.prettyPrintIndent + "', coerceInputValues=" + this.coerceInputValues + ", useArrayPolymorphism=" + this.useArrayPolymorphism + ", classDiscriminator='" + this.classDiscriminator + "', allowSpecialFloatingPointValues=" + this.allowSpecialFloatingPointValues + ", useAlternativeNames=" + this.useAlternativeNames + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.decodeEnumsCaseInsensitive + ", allowTrailingComma=" + this.allowTrailingComma + ", allowComments=" + this.allowComments + ", classDiscriminatorMode=" + this.classDiscriminatorMode + ')';
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, preprohormone preprohormoneVar, boolean z11, boolean z12, boolean z13, ClassDiscriminatorMode classDiscriminatorMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : preprohormoneVar, (i & 8192) != 0 ? false : z11, (i & 16384) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & 65536) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }
}
