package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6981c;

    public l1(boolean z10, boolean z11, int i10) {
        this.f6979a = z10;
        this.f6980b = z11;
        this.f6981c = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb2.append(this.f6979a);
        sb2.append(", ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        sb2.append(this.f6980b);
        sb2.append(", prettyPrintIndent='    ', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i10 = this.f6981c;
        if (i10 == 1) {
            str = "NONE";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "POLYMORPHIC";
        } else {
            str = "ALL_JSON_OBJECTS";
        }
        return defpackage.e.q(str, ", exceptionsWithDebugInfo=true)", sb2);
    }
}
