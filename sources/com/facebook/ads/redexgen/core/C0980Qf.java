package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.text.Cue;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0980Qf implements InterfaceC0904Nb {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C0982Qh> A01;
    public static final C0980Qf A03 = new C0980Qf(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = AbstractC1600gE.A0h(0);
    public static final String A05 = AbstractC1600gE.A0h(1);
    public static final InterfaceC0903Na<C0980Qf> A02 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Qg
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return C0980Qf.A00(bundle);
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C0980Qf(List<C0982Qh> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C0982Qh[]) list.toArray(new C0982Qh[0]));
        this.A00 = j;
    }

    public static final C0980Qf A00(Bundle bundle) {
        List listA01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C1523ey.A01(C0982Qh.A0I, cues);
        }
        return new C0980Qf(listA01, bundle.getLong(A05));
    }
}
