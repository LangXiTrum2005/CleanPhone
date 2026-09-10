package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20462b;

    public /* synthetic */ tq1(Object obj, int i10) {
        this.f20461a = i10;
        this.f20462b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f20461a) {
            case 0:
                try {
                    qq1 qq1Var = qq1.f19164c;
                    vc vcVar = (vc) this.f20462b;
                    Mac mac = (Mac) qq1Var.f19169a.zza((String) vcVar.f21150c);
                    mac.init((SecretKeySpec) vcVar.f21151d);
                    return mac;
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                kb.k kVar = (kb.k) this.f20462b;
                try {
                    kb.i iVar = kb.i.f44573c;
                    Mac mac2 = (Mac) iVar.f44574a.l(kVar.f44576b);
                    mac2.init(kVar.f44577c);
                    return mac2;
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
