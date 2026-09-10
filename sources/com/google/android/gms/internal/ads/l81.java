package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l81 extends o81 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l81(t6.l lVar, CharSequence charSequence, Object obj, int i10) {
        super(lVar, charSequence);
        this.f16812h = i10;
        this.f16813i = obj;
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final int a(int i10) {
        switch (this.f16812h) {
            case 0:
                CharSequence charSequence = this.f18188c;
                int length = charSequence.length();
                ps1.g0(i10, length);
                while (i10 < length) {
                    if (((z71) this.f16813i).a(charSequence.charAt(i10))) {
                        return i10;
                    }
                    i10++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((z61) this.f16813i).f22523a;
                if (matcher.find(i10)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final int b(int i10) {
        switch (this.f16812h) {
            case 0:
                return i10 + 1;
            default:
                return ((Matcher) ((z61) this.f16813i).f22523a).end();
        }
    }
}
