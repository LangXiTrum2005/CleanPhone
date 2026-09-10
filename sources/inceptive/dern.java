package inceptive;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class dern extends attabal<AdView> {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public RelativeLayout f28602competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public AdView f28603cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f28604impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f28605taiyuan;

    public dern(Context context, RelativeLayout relativeLayout, twas.attabal attabalVar, astigmatic.dern dernVar, int i, int i2, com.unity3d.scar.adapter.common.dern dernVar2, com.unity3d.scar.adapter.common.marial marialVar) {
        super(context, dernVar, attabalVar, dernVar2);
        this.f28602competently = relativeLayout;
        this.f28604impromptu = i;
        this.f28605taiyuan = i2;
        this.f28603cutely = new AdView(this.f28594saneness);
        this.f28593marial = new wireman(marialVar, this);
    }

    @Override // inceptive.attabal
    public void saneness(AdRequest adRequest, astigmatic.saneness sanenessVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f28602competently;
        if (relativeLayout == null || (adView = this.f28603cutely) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f28603cutely.setAdSize(new AdSize(this.f28604impromptu, this.f28605taiyuan));
        this.f28603cutely.setAdUnitId(this.f28592dern.saneness());
        this.f28603cutely.setAdListener(((wireman) this.f28593marial).saneness());
        this.f28603cutely.loadAd(adRequest);
    }
}
