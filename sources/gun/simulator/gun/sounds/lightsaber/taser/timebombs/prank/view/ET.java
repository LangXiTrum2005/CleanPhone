package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.widget.CheckedTextView;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ET implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3023a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ET(TrackSelectionView trackSelectionView) {
        this(trackSelectionView, 1);
        this.f3023a = 1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3023a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((PangleNativeAd) obj).h.showPrivacyActivity();
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                CheckedTextView checkedTextView = trackSelectionView.c;
                HashMap map = trackSelectionView.g;
                boolean z = true;
                if (view == checkedTextView) {
                    trackSelectionView.l = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    map.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C4765ud0 c4765ud0 = (C4765ud0) tag;
                    C5029xd0 c5029xd0 = c4765ud0.f5089a;
                    C3974ld0 c3974ld0 = c5029xd0.b;
                    C4501rd0 c4501rd0 = (C4501rd0) map.get(c3974ld0);
                    int i2 = c4765ud0.b;
                    if (c4501rd0 == null) {
                        if (!trackSelectionView.i && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c3974ld0, new C4501rd0(c3974ld0, AC.p(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList(c4501rd0.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.h && c5029xd0.c;
                        if (!z2 && (!trackSelectionView.i || trackSelectionView.f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(c3974ld0);
                            } else {
                                map.put(c3974ld0, new C4501rd0(c3974ld0, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(c3974ld0, new C4501rd0(c3974ld0, arrayList));
                            } else {
                                map.put(c3974ld0, new C4501rd0(c3974ld0, AC.p(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }

    public /* synthetic */ ET(Object obj, int i) {
        this.f3023a = i;
        this.b = obj;
    }
}
