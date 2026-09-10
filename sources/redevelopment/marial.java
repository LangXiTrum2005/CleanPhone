package redevelopment;

import java.util.List;

/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends competently<euhemerize.wireman> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final euhemerize.wireman f36129taiyuan;

    public marial(List<com.airbnb.lottie.value.attabal<euhemerize.wireman>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            euhemerize.wireman wiremanVar = list.get(i).f16256saneness;
            if (wiremanVar != null) {
                iMax = Math.max(iMax, wiremanVar.beachfront());
            }
        }
        this.f36129taiyuan = new euhemerize.wireman(new float[iMax], new int[iMax]);
    }

    @Override // redevelopment.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public euhemerize.wireman taiyuan(com.airbnb.lottie.value.attabal<euhemerize.wireman> attabalVar, float f) {
        this.f36129taiyuan.competently(attabalVar.f16256saneness, attabalVar.f16250dern, f);
        return this.f36129taiyuan;
    }
}
