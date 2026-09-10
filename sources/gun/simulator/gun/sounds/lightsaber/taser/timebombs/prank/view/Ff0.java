package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.store.core.api.Store;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityMainBinding;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Ff0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3078a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Ff0(int i, Object obj, Object obj2) {
        this.f3078a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindViewByPosition;
        View viewFindViewById;
        WeakReference weakReference;
        Intent intent;
        K5 k5;
        int i;
        int i2 = 2;
        int i3 = this.f3078a;
        boolean zB = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj2, (String) obj);
                break;
            case 1:
                ((BiddingBaseManager) obj2).lambda$uploadSignals$2((BiddingSignals) obj);
                break;
            case 2:
                ((BiddingBaseManager) obj2).lambda$onUnityAdsTokenReady$0((String) obj);
                break;
            case 3:
                ((ShowOperationState) obj2).lambda$onUnityAdsShowStart$2((String) obj);
                break;
            case 4:
                ((ShowOperationState) obj2).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) obj);
                break;
            case 5:
                Store.lambda$isFeatureSupported$0((Integer) obj2, (String) obj);
                break;
            case 6:
                X8.m216onLoadFailure$lambda2((X8) obj2, (Ei0) obj);
                break;
            case 7:
                C4115n9.m258onFailure$lambda6((AbstractC4203o9) obj2, (Ei0) obj);
                break;
            case 8:
                HQ.m169onFailure$lambda5((PQ) obj2, (Ei0) obj);
                break;
            case 9:
                JQ.m182invoke$lambda0((ImageView) obj2, (Bitmap) obj);
                break;
            case 10:
                J8.m181onFailure$lambda5((K8) obj2, (Ei0) obj);
                break;
            case 11:
                Si0.m209onInitError$lambda12((Si0) obj2, (Ei0) obj);
                break;
            case 12:
                AbstractC3950lJ.z(obj2);
                Yi0.m224getAvailableBidTokensAsync$lambda6(null, (InterfaceC3069bH) obj);
                break;
            case 13:
                C2781Tl.m211onFailure$lambda1((C2807Ul) obj2, (Throwable) obj);
                break;
            case 14:
                C3624hd0.m248sendWinNotification$lambda0((C3624hd0) obj2, (String) obj);
                break;
            case 15:
                C2919Yt.m225apply$lambda0((C2919Yt) obj2, (Serializable) obj);
                break;
            case 16:
                C5160z4.m288getUserAgentLazy$lambda0((C5160z4) obj2, (Consumer) obj);
                break;
            case 17:
                C4418qf0.m270writeUnclosedAdToFile$lambda3((C4418qf0) obj2, (String) obj);
                break;
            case 18:
                C5041xj0.m286shouldOverrideUrlLoading$lambda6$lambda5$lambda4$lambda3((C5041xj0) obj2, (WebView) obj);
                break;
            case 19:
                C5064y0.m287init$lambda0((Context) obj2, (C5064y0) obj);
                break;
            case 20:
                C4470rC.m273getImageSize$lambda1((String) obj, (InterfaceC3567gx) obj2);
                break;
            case 21:
                C4470rC.m272displayImage$lambda0((String) obj, (InterfaceC2766Sw) obj2);
                break;
            case 22:
            case 23:
            default:
                C3980lg0 c3980lg0 = (C3980lg0) obj2;
                K5 k6 = (K5) obj;
                C4068mg0 c4068mg0 = c3980lg0.f;
                c4068mg0.b = k6;
                if (k6 == null || !k6.f3300a.booleanValue()) {
                    zB = false;
                } else if (c4068mg0.d()) {
                    zB = c4068mg0.b(AbstractApplicationC2673Ph.m);
                } else {
                    K5 k7 = c4068mg0.b;
                    if (k7 == null || !k7.c.booleanValue() || !c4068mg0.b.c.booleanValue() ? (weakReference = c4068mg0.d) == null || weakReference.get() == null || (intent = ((Activity) c4068mg0.d.get()).getIntent()) == null || !c4068mg0.b(AbstractApplicationC2673Ph.m) || !Qm0.D(new byte[]{-91, -51, 44, -103, -58, -1, 104, -60, -83, -51, 60, -114, -57, -30, 34, -117, -89, -41, 33, -124, -57, -72, 65, -85, -115, -19}, new byte[]{-60, -93, 72, -21, -87, -106, 12, -22}).equals(intent.getAction()) || !intent.hasCategory(Qm0.D(new byte[]{25, 108, -74, -49, -46, 50, -24, -44, 17, 108, -90, -40, -45, 47, -94, -103, 25, 118, -73, -38, -46, 41, -11, -44, 52, 67, -121, -13, -2, 19, -55, -88}, new byte[]{120, 2, -46, -67, -67, 91, -116, -6})) : !c4068mg0.b(AbstractApplicationC2673Ph.m) || (k5 = c4068mg0.b) == null || ((i = k5.d) >= 0 && i <= c4068mg0.c)) {
                        zB = false;
                    }
                }
                C4981x20.u().j(new RunnableC4287p7(i2, c3980lg0, zB));
                break;
            case 24:
                FS fs = (FS) obj2;
                InitializationStatus initializationStatus = (InitializationStatus) obj;
                X0 x0 = X0.j;
                if (fs != null) {
                    fs.a(new C2404Ex(true, true, initializationStatus));
                }
                break;
            case 25:
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) obj;
                X0 x1 = ((V0) obj2).b;
                String str = ((Om0) x1.k()).o;
                if (AbstractC3375el.I(str)) {
                    long jB = C2375Du.a().b(str);
                    ((Om0) x1.k()).b = jB;
                    String str2 = ((Om0) x1.k()).o;
                    SharedPreferences.Editor editorH = AbstractC2995aW.H(abstractApplicationC2673Ph);
                    editorH.putLong(str2, jB);
                    editorH.commit();
                    break;
                }
                break;
            case 26:
                MainActivity mainActivity = (MainActivity) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                int i4 = MainActivity.j;
                AbstractC2995aW.q(mainActivity, "this$0");
                AbstractC2995aW.q(sharedPreferences, "$sp");
                RecyclerView.LayoutManager layoutManager = ((ActivityMainBinding) mainActivity.getMBinding()).rvHomeGun.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(0)) != null && (viewFindViewById = viewFindViewByPosition.findViewById(R.id.weapon_sort)) != null) {
                    C4402qV c4402qV = new C4402qV(mainActivity);
                    c4402qV.d = viewFindViewById;
                    c4402qV.postInvalidate();
                    ViewGroup viewGroup = (ViewGroup) mainActivity.findViewById(android.R.id.content);
                    c4402qV.setOnHighLightClicked(new OL(mainActivity, sharedPreferences));
                    viewGroup.addView(c4402qV, -1, -1);
                    break;
                }
                break;
            case 27:
                WeaponUseActivity weaponUseActivity = (WeaponUseActivity) obj2;
                C2612My c2612My = (C2612My) obj;
                AbstractC2995aW.q(weaponUseActivity, "$mActivity");
                AbstractC2995aW.q(c2612My, "this$0");
                SurfaceView surfaceView = weaponUseActivity.k;
                if (surfaceView != null) {
                    surfaceView.setVisibility(8);
                }
                c2612My.n();
                break;
        }
    }

    public /* synthetic */ Ff0(String str, InterfaceC3215cx interfaceC3215cx, int i) {
        this.f3078a = i;
        this.c = str;
        this.b = interfaceC3215cx;
    }
}
