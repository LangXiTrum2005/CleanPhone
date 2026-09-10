package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class F4 implements Te<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26054b;

    public F4(String encryptedResponse, String descriptionKey) {
        kotlin.jvm.internal.n.f(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.n.f(descriptionKey, "descriptionKey");
        this.f26053a = encryptedResponse;
        this.f26054b = descriptionKey;
    }

    @Override // com.ironsource.Te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String strB = J9.b(this.f26054b, this.f26053a);
        if (strB == null || strB.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        return strB;
    }
}
