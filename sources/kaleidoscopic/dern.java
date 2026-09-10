package kaleidoscopic;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class dern extends attabal<AdView> {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public RelativeLayout f29066competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public AdView f29067cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f29068impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f29069taiyuan;

    public dern(Context context, RelativeLayout relativeLayout, frailly.attabal attabalVar, astigmatic.dern dernVar, int i, int i2, com.unity3d.scar.adapter.common.dern dernVar2, com.unity3d.scar.adapter.common.marial marialVar) {
        super(context, dernVar, attabalVar, dernVar2);
        this.f29066competently = relativeLayout;
        this.f29068impromptu = i;
        this.f29069taiyuan = i2;
        this.f29067cutely = new AdView(this.f29058saneness);
        this.f29057marial = new wireman(marialVar, this);
    }

    @Override // kaleidoscopic.attabal
    public void saneness(AdRequest adRequest, astigmatic.saneness sanenessVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f29066competently;
        if (relativeLayout == null || (adView = this.f29067cutely) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f29067cutely.setAdSize(new AdSize(this.f29068impromptu, this.f29069taiyuan));
        this.f29067cutely.setAdUnitId(this.f29056dern.saneness());
        this.f29067cutely.setAdListener(((wireman) this.f29057marial).saneness());
        this.f29067cutely.loadAd(adRequest);
    }
}
