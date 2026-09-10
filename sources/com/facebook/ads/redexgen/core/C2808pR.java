package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2808pR implements AnonymousClass24 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C2810pT> A01;
    public static final C2808pR A03 = new C2808pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = C5C.A0h(0);
    public static final String A05 = C5C.A0h(1);
    public static final AnonymousClass23<C2808pR> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2808pR.A00(bundle);
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2808pR(List<C2810pT> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C2810pT[]) list.toArray(new C2810pT[0]));
        this.A00 = j;
    }

    public static final C2808pR A00(Bundle bundle) {
        List listA01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C2810pT.A0I, cues);
        }
        return new C2808pR(listA01, bundle.getLong(A05));
    }
}
