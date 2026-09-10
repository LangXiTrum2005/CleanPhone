package A;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.C3127m6;
import com.inmobi.media.C3270v6;
import com.inmobi.media.G1;
import com.inmobi.media.R1;

/* JADX INFO: renamed from: A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0879a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f3164Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ RunnableC0879a(int i2, G1 g1) {
        this.X = 0;
        this.f3164Y = i2;
        this.Z = g1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                com.inmobi.media.A.b(this.f3164Y, (G1) this.Z);
                break;
            case 1:
                R1.a((R1) this.Z, this.f3164Y);
                break;
            case 2:
                C3127m6.a((C3127m6) this.Z, this.f3164Y);
                break;
            case 3:
                C3270v6.a((C3270v6) this.Z, this.f3164Y);
                break;
            case 4:
                ((ResourcesCompat.FontCallback) this.Z).b(this.f3164Y);
                break;
            case 5:
                ((com.applovin.impl.adview.a) this.Z).a(this.f3164Y);
                break;
            case 6:
                ((com.applovin.impl.sdk.i.a) this.Z).a(this.f3164Y);
                break;
            case 7:
                ((MaxAdPlacer) this.Z).a(this.f3164Y);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.Z;
                View view = (View) sideSheetBehavior.q0.get();
                if (view != null) {
                    sideSheetBehavior.A(view, this.f3164Y, false);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0879a(Object obj, int i2, int i3) {
        this.X = i3;
        this.Z = obj;
        this.f3164Y = i2;
    }
}
