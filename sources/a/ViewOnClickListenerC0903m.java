package A;

import android.view.View;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingVideoAct;
import com.charging.screenshow.battery.animations.themes.adapter.Charging3DPagerAdapter;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingCategoryAdapter$onBindViewHolder$1$1;
import com.charging.screenshow.battery.animations.themes.adapter.ChargingHorizontalAdapter;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.ChargingCategoryBean;
import com.charging.screenshow.battery.animations.themes.fragment.HomeFrag;
import com.charging.screenshow.battery.animations.themes.fragment.HomeFrag$initViews$1;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.inmobi.media.C2984d8;
import com.inmobi.media.D8;
import com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC0903m implements View.OnClickListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3184Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ ViewOnClickListenerC0903m(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f3184Y = obj;
        this.Z = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.Z;
        Object obj2 = this.f3184Y;
        switch (this.X) {
            case 0:
                D8.a((D8) obj2, (C2984d8) obj, view);
                break;
            case 1:
                ((FeedBackLinerLayout) obj2).a((RadioButton) obj, view);
                break;
            case 2:
                if (((Charging3DPagerAdapter) obj2).k != null) {
                    ((Charging3DPagerAdapter.VH) obj).getAdapterPosition();
                }
                break;
            default:
                ChargingCategoryAdapter$onBindViewHolder$1$1 chargingCategoryAdapter$onBindViewHolder$1$1 = ((ChargingHorizontalAdapter) obj2).k;
                if (chargingCategoryAdapter$onBindViewHolder$1$1 != null) {
                    int adapterPosition = ((ChargingHorizontalAdapter.VH) obj).getAdapterPosition();
                    ChargingCategoryAdapter.VH vh = chargingCategoryAdapter$onBindViewHolder$1$1.f13074b;
                    ChargingCategoryAdapter chargingCategoryAdapter = chargingCategoryAdapter$onBindViewHolder$1$1.f13073a;
                    if (adapterPosition == 4) {
                        HomeFrag$initViews$1 homeFrag$initViews$1 = chargingCategoryAdapter.f13071l;
                        if (homeFrag$initViews$1 != null) {
                            homeFrag$initViews$1.a(vh.getAdapterPosition());
                        }
                        break;
                    } else {
                        HomeFrag$initViews$1 homeFrag$initViews$2 = chargingCategoryAdapter.f13071l;
                        if (homeFrag$initViews$2 != null) {
                            int adapterPosition2 = vh.getAdapterPosition();
                            HomeFrag homeFrag = homeFrag$initViews$2.f13260a;
                            if (adapterPosition2 < 0) {
                                homeFrag.getClass();
                                break;
                            } else {
                                ArrayList arrayList = homeFrag.g0;
                                if (adapterPosition2 < arrayList.size()) {
                                    List list = ((ChargingCategoryBean) arrayList.get(adapterPosition2)).get_list();
                                    if (adapterPosition >= 0 && adapterPosition < list.size() && homeFrag.getActivity() != null) {
                                        List list2 = ((ChargingCategoryBean) arrayList.get(adapterPosition2)).get_list();
                                        if (homeFrag.getActivity() != null) {
                                            BaseMedia baseMedia = (BaseMedia) list2.get(adapterPosition);
                                            if (baseMedia instanceof ChargingVideo) {
                                                int i2 = ChargingVideoAct.n0;
                                                FragmentActivity fragmentActivityRequireActivity = homeFrag.requireActivity();
                                                Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
                                                ChargingVideoAct.Companion.a(fragmentActivityRequireActivity, (ChargingVideo) baseMedia, true);
                                            } else if (baseMedia instanceof Charging3D) {
                                                ((ChargingCategoryBean) arrayList.get(adapterPosition2)).j(adapterPosition);
                                                int i3 = Charging3DAct.o0;
                                                FragmentActivity fragmentActivityRequireActivity2 = homeFrag.requireActivity();
                                                Intrinsics.e(fragmentActivityRequireActivity2, "requireActivity(...)");
                                                Charging3DAct.Companion.a(fragmentActivityRequireActivity2, (ChargingCategoryBean) arrayList.get(adapterPosition2), true);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
