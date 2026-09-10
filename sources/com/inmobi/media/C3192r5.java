package com.inmobi.media;

import com.inmobi.media.C3192r5;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3192r5 implements InterfaceC2830cj {
    public Fc a;
    public AbstractC3213s1 b;
    public InterfaceC3320w8 c;

    public C3192r5(InterfaceC3320w8 interfaceC3320w8) {
        this.a = null;
        this.b = null;
        this.c = interfaceC3320w8;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() {
        saran saranVarA;
        monroe monroeVarWireman;
        InterfaceC3072m9 interfaceC3072m9C;
        InterfaceC3320w8 interfaceC3320w8 = this.c;
        if (interfaceC3320w8 != null && (interfaceC3072m9C = interfaceC3320w8.c()) != null) {
            ((C3097n9) interfaceC3072m9C).a("AUM-DestroyedState", "Initialize Called");
        }
        InterfaceC3320w8 interfaceC3320w9 = this.c;
        if (interfaceC3320w9 == null || (saranVarA = interfaceC3320w9.a()) == null || (monroeVarWireman = cutely.wireman(saranVarA, null, null, new C3168q5(this, null), 3, null)) == null) {
            return;
        }
        monroeVarWireman.restrictive(new Function1() { // from class: adsuki.floriate
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3192r5.a(this.f3439kowloon, (Throwable) obj);
            }
        });
    }

    public static final Unit a(C3192r5 c3192r5, Throwable th) {
        InterfaceC3072m9 interfaceC3072m9C;
        InterfaceC3320w8 interfaceC3320w8 = c3192r5.c;
        if (interfaceC3320w8 != null && (interfaceC3072m9C = interfaceC3320w8.c()) != null) {
            ((C3097n9) interfaceC3072m9C).a();
        }
        InterfaceC3320w8 interfaceC3320w9 = c3192r5.c;
        F3.a(interfaceC3320w9 != null ? interfaceC3320w9.a() : null);
        c3192r5.b = null;
        c3192r5.c = null;
        c3192r5.a = null;
        return Unit.f29295attabal;
    }

    public C3192r5(Fc fc, AbstractC3213s1 abstractC3213s1, InterfaceC3320w8 interfaceC3320w8) {
        this.a = fc;
        this.b = abstractC3213s1;
        this.c = interfaceC3320w8;
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }
}
