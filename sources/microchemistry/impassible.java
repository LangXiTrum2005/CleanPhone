package microchemistry;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Morph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lmicrochemistry/impassible;", "", "Lmicrochemistry/adultoid;", "start", TtmlNode.END, "<init>", "(Lmicrochemistry/adultoid;Lmicrochemistry/adultoid;)V", "", NotificationCompat.CATEGORY_PROGRESS, "", "Lmicrochemistry/wireman;", "attabal", "(F)Ljava/util/List;", "Lmicrochemistry/adultoid;", "saneness", "Lkotlin/Pair;", "dern", "Ljava/util/List;", "_morphMatch", "wireman", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impassible {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final adultoid start;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final List<Pair<wireman, wireman>> _morphMatch;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final adultoid end;

    /* JADX INFO: renamed from: microchemistry.impassible$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Morph.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmicrochemistry/impassible$attabal;", "", "<init>", "()V", "Lmicrochemistry/adultoid;", "p1", "p2", "", "Lkotlin/Pair;", "Lmicrochemistry/wireman;", "attabal", "(Lmicrochemistry/adultoid;Lmicrochemistry/adultoid;)Ljava/util/List;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Pair<wireman, wireman>> attabal(adultoid p1, adultoid p2) {
            Pair<apical.MeasuredCubic, apical.MeasuredCubic> pairAttabal;
            Pair<apical.MeasuredCubic, apical.MeasuredCubic> pairAttabal2;
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            apical.Companion attabalVar = apical.INSTANCE;
            apical apicalVarAttabal = attabalVar.attabal(new saneness(p1.getCenterX(), p1.getCenterY()), p1);
            apical apicalVarAttabal2 = attabalVar.attabal(new saneness(p2.getCenterX(), p2.getCenterY()), p2);
            beachfront beachfrontVarDern = impromptu.dern(apicalVarAttabal.impromptu(), apicalVarAttabal2.impromptu());
            float fAttabal = beachfrontVarDern.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            String unused = triweekly.f33402attabal;
            apical apicalVarBeachfront = apicalVarAttabal2.beachfront(fAttabal);
            ArrayList arrayList = new ArrayList();
            apical.MeasuredCubic sanenessVarComponent2 = (apical.MeasuredCubic) CollectionsKt.lotta(apicalVarAttabal, 0);
            apical.MeasuredCubic sanenessVarComponent3 = (apical.MeasuredCubic) CollectionsKt.lotta(apicalVarBeachfront, 0);
            int i = 1;
            int i2 = 1;
            while (sanenessVarComponent2 != null && sanenessVarComponent3 != null) {
                float fDern = i == apicalVarAttabal.size() ? 1.0f : sanenessVarComponent2.getEndOutlineProgress();
                float fSaneness = i2 == apicalVarBeachfront.size() ? 1.0f : beachfrontVarDern.saneness(preprohormone.cutely(sanenessVarComponent3.getEndOutlineProgress() + fAttabal, 1.0f));
                float fMin = Math.min(fDern, fSaneness);
                String unused2 = triweekly.f33402attabal;
                float f = 1.0E-6f + fMin;
                if (fDern > f) {
                    String unused3 = triweekly.f33402attabal;
                    pairAttabal = sanenessVarComponent2.attabal(fMin);
                } else {
                    pairAttabal = patroclinal.formularize.attabal(sanenessVarComponent2, CollectionsKt.lotta(apicalVarAttabal, i));
                    i++;
                }
                apical.MeasuredCubic sanenessVarComponent1 = pairAttabal.component1();
                sanenessVarComponent2 = pairAttabal.component2();
                if (fSaneness > f) {
                    String unused4 = triweekly.f33402attabal;
                    pairAttabal2 = sanenessVarComponent3.attabal(preprohormone.cutely(beachfrontVarDern.attabal(fMin) - fAttabal, 1.0f));
                } else {
                    pairAttabal2 = patroclinal.formularize.attabal(sanenessVarComponent3, CollectionsKt.lotta(apicalVarBeachfront, i2));
                    i2++;
                }
                apical.MeasuredCubic sanenessVarComponent4 = pairAttabal2.component1();
                sanenessVarComponent3 = pairAttabal2.component2();
                String unused5 = triweekly.f33402attabal;
                arrayList.add(patroclinal.formularize.attabal(sanenessVarComponent1.getCubic(), sanenessVarComponent4.getCubic()));
            }
            if (sanenessVarComponent2 == null && sanenessVarComponent3 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        public Companion() {
        }
    }

    public impassible(adultoid start, adultoid end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this._morphMatch = INSTANCE.attabal(start, end);
    }

    public final List<wireman> attabal(float progress) {
        List listDern = p002kotlin.collections.graveside.dern();
        int size = this._morphMatch.size();
        wireman wiremanVar = null;
        wireman wiremanVar2 = null;
        int i = 0;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = preprohormone.taiyuan(this._morphMatch.get(i).getFirst().getPoints()[i2], this._morphMatch.get(i).getSecond().getPoints()[i2], progress);
            }
            wireman wiremanVar3 = new wireman(fArr);
            if (wiremanVar2 == null) {
                wiremanVar2 = wiremanVar3;
            }
            if (wiremanVar != null) {
                listDern.add(wiremanVar);
            }
            i++;
            wiremanVar = wiremanVar3;
        }
        if (wiremanVar != null && wiremanVar2 != null) {
            listDern.add(marial.attabal(wiremanVar.saneness(), wiremanVar.dern(), wiremanVar.beachfront(), wiremanVar.competently(), wiremanVar.impromptu(), wiremanVar.taiyuan(), wiremanVar2.saneness(), wiremanVar2.dern()));
        }
        return p002kotlin.collections.graveside.attabal(listDern);
    }
}
